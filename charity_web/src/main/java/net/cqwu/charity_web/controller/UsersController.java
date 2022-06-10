package net.cqwu.charity_web.controller;

import net.cqwu.charity_commons.pojo.User;
import net.cqwu.charity_service.service.UserService;
import net.cqwu.charity_web.until.AddUserUntil;
import net.cqwu.charity_web.until.ResultUntil;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
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
    @PostMapping("RegistrationVerification")
    public Boolean RegistrationVerification(@RequestBody User user){
        if (this.userService.RegistrationVerification(user.getName())==null)  return false;
        return true;
    }
    @PostMapping("Add")
    public Integer Add(@RequestBody AddUserUntil addUser){
        return this.userService.insert(addUser.getUser(),addUser.getPassword1());
    }
}