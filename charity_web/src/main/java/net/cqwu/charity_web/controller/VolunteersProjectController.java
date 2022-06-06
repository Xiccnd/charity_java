package net.cqwu.charity_web.controller;

import net.cqwu.charity_commons.pojo.VolunteersProject;
import net.cqwu.charity_service.service.VolunteersProjectService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (VolunteersProject)表控制层
 *
 * @author makejava
 * @since 2022-06-06 16:53:01
 */
@RestController
@RequestMapping("volunteersProject")
public class VolunteersProjectController {
    /**
     * 服务对象
     */
    @Resource
    private VolunteersProjectService volunteersProjectService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public VolunteersProject selectOne(Integer id) {
        return this.volunteersProjectService.queryById(id);
    }

}