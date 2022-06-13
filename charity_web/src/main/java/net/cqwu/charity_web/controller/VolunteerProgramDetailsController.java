package net.cqwu.charity_web.controller;

import net.cqwu.charity_commons.pojo.ClassOfService;
import net.cqwu.charity_commons.pojo.VolunteerAllMessge;
import net.cqwu.charity_commons.pojo.VolunteerProgramDetails;
import net.cqwu.charity_commons.pojo.VolunterProgramPost;
import net.cqwu.charity_service.service.VolunteerProgramDetailsService;
import net.cqwu.charity_commons.pojo.VolunteerProgramDetailsUntil;
import net.cqwu.charity_web.until.ResultUntil;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (VolunteerProgramDetails)表控制层
 *
 * @author makejava
 * @since 2022-06-06 16:53:01
 */
@RestController
@RequestMapping("volunteerProgramDetails")
@CrossOrigin(allowedHeaders="*",value="*",originPatterns="*")
public class VolunteerProgramDetailsController {
    /**
     * 服务对象
     */
    @Resource
    private VolunteerProgramDetailsService volunteerProgramDetailsService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectMy")
    public VolunteerProgramDetails selectOne(Integer id) {
        return this.volunteerProgramDetailsService.queryById(id);
    }
    @GetMapping("end/selectMyByTeam")
    public ResultUntil selectMyByTeam(Integer id) {
        ResultUntil resultUntil = new ResultUntil(this.volunteerProgramDetailsService.queryByTeamId(id));
        return resultUntil;
    }

    @GetMapping("volunterProgramPost")
    public List<VolunterProgramPost> volunterProgramPost(Integer id){
        return this.volunteerProgramDetailsService.volunteerProgramPost(id);
    }
    @PostMapping("end/selectByTeamIdANDName")
    public ResultUntil endSelectByTeamIdANDName(@RequestBody VolunteerProgramDetails volunteerProgramDetails){
        ResultUntil resultUntil = new ResultUntil(this.volunteerProgramDetailsService.queryAllByTeamIdANDName(volunteerProgramDetails));
        return resultUntil;
    }
    @GetMapping("classOfServices")
    public List<ClassOfService> classOfServices(Integer id){
        return this.volunteerProgramDetailsService.volunteerProgramClass(id);
    }
    @RequestMapping("selectAll")
    public List<VolunteerProgramDetailsUntil> selectAll(VolunteerProgramDetails volunteerProgramDetails) {
        return this.volunteerProgramDetailsService.queryAll(volunteerProgramDetails);
    }
    @GetMapping("VolunteerAllMessage")
    public List<VolunteerAllMessge> VolunteerAllMessge(Integer id) {
        return this.volunteerProgramDetailsService.selectVolunteerAllMessgeByID(id);
    }

}