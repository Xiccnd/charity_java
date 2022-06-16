package net.cqwu.charity_web.controller;

import net.cqwu.charity_commons.pojo.PersonalData;
import net.cqwu.charity_commons.pojo.TeamPersonal;
import net.cqwu.charity_service.service.PersonalDataService;
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

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public ResultUntil selectOne(Integer id) {
        return new ResultUntil(this.personalDataService.queryById(id));
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
    //拒绝志愿者加入队伍
    @PostMapping("end/refuseById")
    public ResultUntil refuseById(@RequestBody PersonalData personalData){
        ResultUntil resultUntil= new ResultUntil(this.personalDataService.refuseById(personalData.getId(),personalData.getTeamid()));
        System.out.println(resultUntil);
        return resultUntil;
    }
    @PostMapping("/getMyMessages")
    public PersonalData getMyMessages(@RequestBody PersonalData personalData){
        return this.personalDataService.getMyMessages(personalData.getUname());
    }
    @PostMapping("upData")
    public void upDate(@RequestBody PersonalData personalData){
        System.out.println(personalData);
        System.out.println(this.personalDataService.update(personalData));
    }
}