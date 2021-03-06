package net.cqwu.charity_web.controller;

import net.cqwu.charity_commons.pojo.ProjectStatus;
import net.cqwu.charity_service.service.ProjectStatusService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (ProjectStatus)表控制层
 *
 * @author makejava
 * @since 2022-06-06 16:53:01
 */
@RestController
        @RequestMapping("projectStatus")
@CrossOrigin(allowedHeaders="*",value="*",originPatterns="*")
public class ProjectStatusController {
    /**
     * 服务对象
     */
    @Resource
    private ProjectStatusService projectStatusService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public ProjectStatus selectOne(Integer id) {
        return this.projectStatusService.queryById(id);
    }
    @GetMapping("queryAll")
    public List<ProjectStatus> queryAll(){
        return this.projectStatusService.queryAll(new ProjectStatus());
    }

}