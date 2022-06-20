package net.cqwu.charity_web.controller;

import net.cqwu.charity_commons.pojo.EndPersonalDataUntil;
import net.cqwu.charity_commons.pojo.PersonalData;
import net.cqwu.charity_commons.pojo.TeamPersonal;
import net.cqwu.charity_commons.pojo.User;
import net.cqwu.charity_service.service.PersonalDataService;
import net.cqwu.charity_service.service.UserService;
import net.cqwu.charity_web.until.ResultUntil;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (PersonalData)表控制层
 *
 * @author makejava
 * @since 2022-06-06 16:53:01
 */
@RestController
@RequestMapping("personalData")
@CrossOrigin(allowedHeaders="*",value="*",originPatterns="*")
public class PersonalDataController {
    /**
     * 服务对象
     */
    @Resource
    private PersonalDataService personalDataService;
    @Resource
    private UserService userService;
    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public ResultUntil selectOne(Integer id) {
        EndPersonalDataUntil endPersonalDataUntil = new EndPersonalDataUntil();
        endPersonalDataUntil.setPersonalData(this.personalDataService.queryById(id));
        User u = this.userService.queryByName(endPersonalDataUntil.getPersonalData().getUname());
        endPersonalDataUntil.setUid(u.getId());
        endPersonalDataUntil.setPassword(u.getPassword());
        endPersonalDataUntil.setName(u.getName());
        return new ResultUntil(endPersonalDataUntil);
    }
    @GetMapping("end/getJoinIn")
    public ResultUntil endGetJoinIn(String teamid){
        return new ResultUntil(this.personalDataService.endTeamJoinIn(teamid));
    }
    @GetMapping("getAllMessages")
    public List<TeamPersonal> messages(Integer teamid){
        return this.personalDataService.teamPersonalMessgeByTeamId(teamid);
    }
    @GetMapping("end/getAllMessages")
    public ResultUntil endMessages(Integer teamid){
        return new ResultUntil(this.personalDataService.teamPersonalMessgeByTeamId(teamid));
    }
    @GetMapping("end/getAllJoinMessages")
    public ResultUntil getAllJoinMessages(Integer teamid){
        return new ResultUntil(this.personalDataService.getAllJoinMessages(teamid));
    }
    @PostMapping("end/getMyMessages")
    public ResultUntil endGetMyMessages(@RequestBody PersonalData personalData){
        return new ResultUntil(this.personalDataService.endQueryAll(personalData));
    }
    @PostMapping("end/getMyJoinMessages")
    public ResultUntil getMyJoinMessages(@RequestBody PersonalData personalData){
        return new ResultUntil(this.personalDataService.endQueryJoinAll(personalData));
    }
    @PostMapping("end/deleteById")
    public ResultUntil deleteById(@RequestBody PersonalData personalData){
        return new ResultUntil(this.personalDataService.deleteById(personalData.getId()));
    }
    @PostMapping("end/agreeById")
    public ResultUntil agreeById(@RequestBody PersonalData personalData){
        return new ResultUntil(this.personalDataService.agreeById(personalData.getId()));
    }
    @PostMapping("end/agreequit")
    public ResultUntil agreequit(@RequestBody PersonalData personalData){
        return new ResultUntil(this.personalDataService.agreequit(personalData.getId(),personalData.getTeamid()));
    }
    //拒绝志愿者加入队伍
    @PostMapping("end/refuseById")
    public ResultUntil refuseById(@RequestBody PersonalData personalData){
        return new ResultUntil(this.personalDataService.refuseById(personalData.getId(),personalData.getTeamid()));
    }
    //拒绝志愿者退出队伍
    @PostMapping("end/refusequit")
    public ResultUntil refusequit(@RequestBody PersonalData personalData){
        return new ResultUntil(this.personalDataService.refusequit(personalData.getId(),personalData.getTeamid()));
    }
    @PostMapping("/getMyMessages")
    public PersonalData getMyMessages(@RequestBody PersonalData personalData){
        return this.personalDataService.getMyMessages(personalData.getUname());
    }
    @PostMapping("upData")
    public void upDate(@RequestBody PersonalData personalData){
        this.personalDataService.update(personalData);
    }

    @PostMapping("end/upData")
    public ResultUntil endUpDate(@RequestBody EndPersonalDataUntil personalData){
        System.out.println(personalData);
        User user = new User();
        user.setPassword(personalData.getPassword());
        user.setName(personalData.getUname());
        user.setId(personalData.getUid());
        this.userService.update(user);
        return new ResultUntil(this.personalDataService.update(personalData));
    }
}