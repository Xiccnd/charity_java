package net.cqwu.charity_web.controller;

import net.cqwu.charity_commons.pojo.VolunteerProgramDetails;
import net.cqwu.charity_commons.pojo.VolunteerProgramDetailsUntil;
import net.cqwu.charity_commons.pojo.VolunteerProgramDetailscensor;

import net.cqwu.charity_service.service.PostNumService;
import net.cqwu.charity_service.service.PostService;
import net.cqwu.charity_service.service.VolunteerProgramDetailsService;
import net.cqwu.charity_service.service.VolunteerProgramDetailscensorService;
import net.cqwu.charity_web.until.ResultUntil;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

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
    private VolunteerProgramDetailsService volunteerProgramDetailsService;
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
        this.volunteerProgramDetailscensorService.insert(volunteerProgramDetailscensor);
        return new ResultUntil("");
    }
    @GetMapping("agreeTeamProject")
    public ResultUntil agreeTeamProject(Integer pid){
        VolunteerProgramDetailscensor vo = this.volunteerProgramDetailscensorService.queryById(pid);
        //插入项目详情
        int i = this.volunteerProgramDetailsService.agreeinsert(vo);

        System.out.println(i);
        System.out.println(vo.getPid());

        //插入岗位
        int j = this.postService.agreeinsert(vo);
        System.out.println(j);
        System.out.println(vo.getPostid());

        //插入岗位_项目关联表
        int z = this.postNumService.agreeinsert(vo);
        System.out.println(z);

        return new ResultUntil(this.volunteerProgramDetailscensorService.queryById(pid));
    }
}