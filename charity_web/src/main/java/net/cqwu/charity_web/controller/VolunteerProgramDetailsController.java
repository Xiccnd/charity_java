package net.cqwu.charity_web.controller;

import net.cqwu.charity_commons.pojo.*;
import net.cqwu.charity_service.service.PostService;
import net.cqwu.charity_service.service.VolunteerProgramDetailsService;
import net.cqwu.charity_service.service.VolunteersProjectService;
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
    @Resource
    private VolunteersProjectService volunteersProjectService;
    @Resource
    private PostService postService;
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
    @GetMapping("selectAll")
    public List<VolunteerProgramDetailsUntil> selectAll(VolunteerProgramDetailsUntil volunteerProgramDetails) {
        return this.volunteerProgramDetailsService.queryAll(volunteerProgramDetails);
    }
    @GetMapping("end/selectAll")
    public ResultUntil endSelectAll(VolunteerProgramDetailsUntil volunteerProgramDetails) {
        return new ResultUntil(this.volunteerProgramDetailsService.queryAll(volunteerProgramDetails));
    }
    @GetMapping("VolunteerAllMessage")
    public List<VolunteerAllMessge> VolunteerAllMessge(Integer id) {
        return this.volunteerProgramDetailsService.selectVolunteerAllMessgeByID(id);
    }
    @GetMapping("end/DeleteProject")
    public ResultUntil endDeleteProject(Integer pid){
        List<VolunteersProject> volunteersProjects=this.volunteersProjectService.queryByIdList(pid);
        VolunteersProject volunteersProject= new VolunteersProject();volunteersProject.setPid(pid);
        this.volunteersProjectService.deleteById(volunteersProject);
        for (VolunteersProject p: volunteersProjects) {
            this.postService.deleteById(p.getPostid());
        }
        return new ResultUntil(this.volunteerProgramDetailsService.deleteById(pid));
    }
    @GetMapping("end/selectJoinProjiect")
    public ResultUntil endSelectJoinProjiect(Integer teamid){
        return new ResultUntil(this.volunteerProgramDetailsService.shengHeJoin(teamid));
    }

}