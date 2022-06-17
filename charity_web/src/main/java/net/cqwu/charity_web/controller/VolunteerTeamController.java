package net.cqwu.charity_web.controller;

import lombok.Data;
import net.cqwu.charity_commons.pojo.User;
import net.cqwu.charity_commons.pojo.VolunteerTeam;
import net.cqwu.charity_commons.pojo.VolunteerTeamUntil;
import net.cqwu.charity_commons.pojo.VolunteersTeamid;
import net.cqwu.charity_service.service.UserService;
import net.cqwu.charity_service.service.VolunteerTeamService;
import net.cqwu.charity_service.service.VolunteersTeamidService;
import net.cqwu.charity_web.until.ResultUntil;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (VolunteerTeam)表控制层
 *
 * @author makejava
 * @since 2022-06-06 16:53:01
 */
@RestController
@RequestMapping("volunteerTeam")
@CrossOrigin(allowedHeaders="*",value="*",originPatterns="*")
public class VolunteerTeamController {
    /**
     * 服务对象
     */
    @Resource
    private VolunteerTeamService volunteerTeamService;
    @Resource
    private VolunteersTeamidService volunteersTeamidService;

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
        return new ResultUntil(this.volunteerTeamService.queryById(id));
    }
    @GetMapping("selectOneByUserId")
    public ResultUntil selectOneByUserId(Integer id) {
        ResultUntil result = new ResultUntil(this.volunteerTeamService.queryByUserId(id));
        return result;
    }
    @GetMapping("queryAll")
    public List<VolunteerTeamUntil> queryAll(VolunteerTeamUntil volunteerTeam) {
        return this.volunteerTeamService.queryAll(volunteerTeam);
    }
    @GetMapping("delateByTeamID")
    public ResultUntil delateByTeamID(Integer teamid){
        VolunteersTeamid volunteersTeamid = new VolunteersTeamid();
        volunteersTeamid.setTeamid(teamid);
        volunteersTeamid.setMark("3");
        List<VolunteersTeamid> volunteersTeamids = this.volunteersTeamidService.queryAll(volunteersTeamid);
        this.volunteersTeamidService.deleteById(volunteersTeamid);
        this.userService.deleteById(volunteersTeamids.get(0).getId());
        return new ResultUntil(this.volunteerTeamService.deleteById(teamid));
    }
    @GetMapping("end/queryAll")
    public ResultUntil endQueryAll(VolunteerTeamUntil volunteerTeam) {
        return new ResultUntil(this.volunteerTeamService.queryAll(volunteerTeam));
    }
}