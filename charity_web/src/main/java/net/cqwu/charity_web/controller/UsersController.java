package net.cqwu.charity_web.controller;

import lombok.Synchronized;
import net.cqwu.charity_commons.pojo.PersonalData;
import net.cqwu.charity_commons.pojo.User;
import net.cqwu.charity_commons.pojo.VolunteersTeamid;
import net.cqwu.charity_service.service.PersonalDataService;
import net.cqwu.charity_service.service.UserService;
import net.cqwu.charity_service.service.VolunteersTeamidService;
import net.cqwu.charity_web.until.AddUserUntil;
import net.cqwu.charity_web.until.ResultUntil;
import net.cqwu.charity_web.until.UserStatus;
import net.cqwu.charity_web.until.UserUpNewPassWordUntil;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * (User)表控制层
 *
 * @author makejava
 * @since 2022-06-06 16:53:01
 */
@RestController
@RequestMapping("user")
@CrossOrigin(allowedHeaders="*",value="*",originPatterns="*")
public class UsersController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;
    @Resource
    private PersonalDataService personalDataService;
    @Resource
    private VolunteersTeamidService volunteersTeamidService;
    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public User selectOne(Integer id) {
        return this.userService.queryById(id);
    }
    @PostMapping("update")
    public Integer update (@RequestBody UserUpNewPassWordUntil user){
        System.out.println("update:"+user);
        Integer i = this.Login(user.getUser());
        if (i==-1) return -1;
        User u = new User();
        u.setId(this.userService.queryByName(user.getUser().getName()).getId());
        u.setPassword(user.getNewPasswordValue());
        System.out.println("newUser:"+u);
        if (this.userService.update(u)==0) return 0;
        else return 1;
    }
    @PostMapping("Login")
    public Integer Login(@RequestBody User user) {
        return this.userService.Login(user);
    }
    @PostMapping("end/Login")
    public Map<String,Object> endLogin(@RequestBody User user) {
        ResultUntil resultUntil = new ResultUntil(this.userService.Login(user));
        Map<String,Object> map=new HashMap<>();
        Map<String,Object> map1=new HashMap<>();
        map1.put("accessToken","admin-accessToken");
        map.put("code",200);
        map.put("message","请求成功");
        map.put("data",map1);
        return map;
    }
    @GetMapping("UserInfo")
    public Map<String,Object> UserInfo(){
        Map<String,Object> map =  new HashMap<>();
        Map<String,Object> map1 =  new HashMap<>();
        Map<String,Object> map2 =  new HashMap<>();
        map.put("code",200);
        map.put("msg","success");
        map1.put("avatar","Test.gif");
        map2.put("0","admin");
        map1.put("permissions",map2);
        map.put("data",map1);
        return map;
    }
    @Synchronized
    @PostMapping("TeamLogin") //第一步请求
    public Integer TeamLogin(@RequestBody User user) {
        User u = new User();
        if(this.userService.Login(user) == 1){
            System.out.println("perid:"+this.userService.Login(user));
            u.setId(999);
            System.out.println("当前用户数据："+u);
            this.userService.updateLoginMessage(u);
        }else if(this.userService.Login(user) == 3){
            System.out.println("=======");
            u = this.userService.queryByName(user.getName());
            List<VolunteersTeamid> vo = this.volunteersTeamidService.queryById(u.getId());
            System.out.println(vo.get(0).getTeamid());
            u.setId(vo.get(0).getTeamid());
            System.out.println("当前用户数据："+u);
            this.userService.updateLoginMessage(u);
        }
        return this.userService.Login(user);
    }
    @GetMapping("LoginTeam")
    public Map<String,Object> LoginTeam(){
        Map<String,Object> map =  new HashMap<>();
        Map<String,Object> map1 =  new HashMap<>();
        map.put("code",200);
        map.put("msg","success");
        System.out.println("getTeamLoginMessage:");
        Map<Object,Object> m = this.userService.getTeamLoginMessage();
        int status = Integer.parseInt((String) m.get("status"));
        if(status==1){
            System.out.println("成功进入！！！！！！！！！！");
            int teamid = (int) m.get("teamid");
            System.out.println(teamid);
            map1.put("accessToken",teamid);
            map1.put("uname",m.get("uname"));
            this.userService.deleteTeamLoginMessage();
        }else {
            System.out.println("判断为空");
            map1.put("accessToken",null);
        }
        map.put("data",map1);
        System.out.println(map);
        return map;
    }
    @PostMapping("RegistrationVerification")
    public User RegistrationVerification(@RequestBody User user){
        return this.userService.RegistrationVerification(user);
    }
    @PostMapping("end/addUser")
    public ResultUntil addUser(@RequestBody User user){
        AddUserUntil addUserUntil = new AddUserUntil();
        addUserUntil.setUser(user);addUserUntil.setPassword1(user.getPassword());
        return new ResultUntil(Add(addUserUntil));
    }
    @PostMapping("Add")
    public Integer Add(@RequestBody AddUserUntil addUser){
        if (this.userService.insert(addUser.getUser(),addUser.getPassword1())==2){
            PersonalData personalData = new PersonalData();
            User user = addUser.getUser();
            personalData.setId(this.userService.queryByName(user.getName()).getId());
            personalData.setName(user.getName());
            personalData.setUname(user.getName());
            personalData.setTelephone(user.getTelephone());
            personalData.setArea("");
            this.personalDataService.insert(personalData);
            return 2;
        }
        return -1;
    }
    @PostMapping("usersUpData")
    public ResultUntil usersUpData(@RequestBody User user){
        user.setPerid(2);
        return new ResultUntil(UserStatus.upData(this.userService.EndQueryAll(user)));
    }
    @PostMapping("TeamUsersUpData")
    public ResultUntil TeamUsersUpData(@RequestBody User user){
        user.setPerid(3);
        return new ResultUntil(UserStatus.upData(this.userService.EndQueryAll(user)));
    }
    @PostMapping("deleteUser")
    public ResultUntil deleteUser(@RequestBody User user){
        user=UserStatus.laoData(user);
        if (user.getPerid()==2){
            return new ResultUntil(this.userService.deleteById(user.getId()));
        }
        if (user.getPerid()==3){
            return new ResultUntil(this.userService.deleteById(user.getId()));
        }
        return new ResultUntil(false);
    }
    @GetMapping("getMapData")
    public List<Object> getMapData(){
        List<Object> list = new ArrayList<>();
        Map<Object,Object> map1 = new HashMap<>();
        map1.put("name","永川区");
        map1.put("value",1234);
        list.add(map1);
        return list;
    }
}