package net.cqwu.charity_web.controller;


import javafx.geometry.Pos;
import net.cqwu.charity_commons.pojo.*;
import net.cqwu.charity_service.service.*;
import net.cqwu.charity_web.until.ResultUntil;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * (VolunteerTeamcensor)表控制层
 *
 * @author makejava
 * @since 2022-06-11 15:07:25
 */
@RestController
@RequestMapping("volunteerTeamcensor")
@CrossOrigin(allowedHeaders="*",value="*",originPatterns="*")
public class VolunteerTeamcensorController {
    /**
     * 服务对象
     */
    @Resource
    private ClassOfServiceService classOfServiceService;
    @Resource
    private VolunteerTeamcensorService volunteerTeamcensorService;
    @Resource
    private VolunteersTeamidService volunteersTeamidService;
    @Resource
    private VolunteerTeamService volunteerTeamService;
    @Resource
    private UserService userService;
    @Resource
    private TeamServiceService teamServiceService;
    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public ResultUntil selectOne(Integer id) {
        return new ResultUntil(this.volunteerTeamcensorService.queryById(id));
    }
    @PostMapping("Add")
    public void add(@RequestBody VolunteerTeamcensor volunteerTeamcensor){
        StringBuffer sid = new StringBuffer();
        for (int i = 0; i < volunteerTeamcensor.getSids().length; i++) {
            sid.append(this.classOfServiceService.queryById(volunteerTeamcensor.getSids()[i]).getServiceName()+" ");
        }
        volunteerTeamcensor.setRegisterDate(new Date(System.currentTimeMillis()));
        volunteerTeamcensor.setSid(sid.toString());
        volunteerTeamcensor.setStatus("1");
        this.volunteerTeamcensorService.insert(volunteerTeamcensor);
    }
    @GetMapping("queryAll")
    public ResultUntil queryAll(VolunteerTeamcensor volunteerTeamcensor) {
        return new ResultUntil(this.volunteerTeamcensorService.queryAll(volunteerTeamcensor));
    }
    @GetMapping("delete")
    public ResultUntil delete(VolunteerTeamcensor volunteerTeamcensor) {
        volunteerTeamcensor.setStatus("审核未通过");
        return new ResultUntil(this.volunteerTeamcensorService.update(volunteerTeamcensor));
    }
    @GetMapping("update")
    public ResultUntil update(VolunteerTeamcensor volunteerTeamcensor) throws ParseException {
        InsertTeam insertTeam = this.volunteerTeamcensorService.getOneOfToInsert(volunteerTeamcensor.getTeamid());

        User u = insertTeam.getUser();
        u.setPerid(3);
        u.setTelephone(insertTeam.getVolunteerTeam().getTelephone());
        Integer uid = this.userService.insert(u,insertTeam.getUser().getPassword());

        VolunteerTeam volunteerTeam = this.volunteerTeamService.insert(insertTeam.getVolunteerTeam());

        VolunteersTeamid v = new VolunteersTeamid();
        v.setJoinTime(new Date());
        v.setMark("3");
        v.setId(uid);
        v.setTeamid(volunteerTeam.getTeamid());
        this.Test(v);

        TeamService teamService = new TeamService();
        teamService.setTeamid(v.getTeamid());
        teamService.setSid(Integer.parseInt(this.volunteerTeamcensorService.queryById(volunteerTeamcensor.getTeamid()).getSid()));
        this.teamServiceService.insert(teamService);

        volunteerTeamcensor.setStatus("审核通过");
        return new ResultUntil(this.volunteerTeamcensorService.deleteById(volunteerTeamcensor.getTeamid()));
    }
    public void Test(VolunteersTeamid volunteersTeamid){
        this.volunteersTeamidService.insert(volunteersTeamid);
    }
}