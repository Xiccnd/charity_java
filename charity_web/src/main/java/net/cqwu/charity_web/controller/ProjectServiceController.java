package net.cqwu.charity_web.controller;

import net.cqwu.charity_commons.pojo.ProjectService;
import net.cqwu.charity_service.service.ProjectServiceService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (ProjectService)表控制层
 *
 * @author makejava
 * @since 2022-06-06 16:53:01
 */
@RestController
@RequestMapping("projectService")
@CrossOrigin(allowedHeaders="*",value="*",originPatterns="*")
public class ProjectServiceController {
    /**
     * 服务对象
     */
    @Resource
    private ProjectServiceService projectServiceService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public ProjectService selectOne(Integer id) {
        return this.projectServiceService.queryById(id);
    }

}