package net.cqwu.charity_web.controller;

import net.cqwu.charity_commons.pojo.*;

import net.cqwu.charity_service.service.*;
import net.cqwu.charity_web.until.ResultUntil;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;

/**
 * (VolunteerProgramDetailscensor)表控制层
 *
 * @author makejava
 * @since 2022-06-16 08:52:28
 */
@RestController
@RequestMapping("volunteerProgramDetailscensor")
@CrossOrigin(allowedHeaders="*",value="*",originPatterns="*")
public class VolunteerProgramDetailscensorController {
    /**
     * 服务对象
     */
    @Resource
    private VolunteerProgramDetailscensorService volunteerProgramDetailscensorService;
    @Resource
    private ClassOfServiceService classOfServiceService;
    @Resource
    private VolunteerProgramDetailsService volunteerProgramDetailsService;
    @Resource
    private ProjectServiceService projectServiceService;
    @Resource
    private PostService postService;
    @Resource
    private PostNumService postNumService;
    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public VolunteerProgramDetailscensor selectOne(Integer id) {
        return this.volunteerProgramDetailscensorService.queryById(id);
    }
    @GetMapping("getAll")
    public ResultUntil getAll(VolunteerProgramDetailscensor volunteerProgramDetailscensor){
        return new ResultUntil(this.volunteerProgramDetailscensorService.queryAll(volunteerProgramDetailscensor));
    }
    @PostMapping("addTeamProject")
    public ResultUntil addTeamProject(@RequestBody VolunteerProgramDetailscensor volunteerProgramDetailscensor){
        volunteerProgramDetailscensor.setReleaseDate(new Date());
        volunteerProgramDetailscensor.setProjectStatus("审核中");
        this.volunteerProgramDetailscensorService.insert(volunteerProgramDetailscensor);
        return new ResultUntil("");
    }
    @GetMapping("agreeTeamProject")
    public ResultUntil agreeTeamProject(Integer pid){
        VolunteerProgramDetailscensor vo = this.volunteerProgramDetailscensorService.queryById(pid);

        //插入项目详情
        this.volunteerProgramDetailsService.agreeinsert(vo);

        Integer sid;
        ClassOfService classOfService =null;
        if(this.classOfServiceService.queryByName(vo.getMark())==null){
            classOfService = new ClassOfService();
            classOfService.setServiceName(vo.getMark());
            sid = this.classOfServiceService.insert(classOfService);
        }else {
            sid = this.classOfServiceService.queryByName(vo.getMark()).getSid();
        }
        ProjectService projectService = new ProjectService();
        projectService.setPid(vo.getPid());projectService.setSid(sid);
        this.projectServiceService.insert(projectService);

        //插入岗位
        this.postService.agreeinsert(vo);

        //插入岗位_项目关联表
        this.postNumService.agreeinsert(vo);

        this.volunteerProgramDetailscensorService.deleteById(pid);
        return new ResultUntil(this.volunteerProgramDetailscensorService.queryById(pid));
    }

    @GetMapping("notInto")
    public ResultUntil notInto(Integer pid){
        VolunteerProgramDetailscensor volunteerProgramDetailscensor = this.volunteerProgramDetailscensorService.queryById(pid);
        volunteerProgramDetailscensor.setProjectStatus("审核未通过");
        this.volunteerProgramDetailscensorService.update(volunteerProgramDetailscensor);
        return new ResultUntil("");
    }
}