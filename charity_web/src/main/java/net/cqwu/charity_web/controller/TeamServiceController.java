package net.cqwu.charity_web.controller;

import net.cqwu.charity_commons.pojo.TeamService;
import net.cqwu.charity_service.service.TeamServiceService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TeamService)表控制层
 *
 * @author makejava
 * @since 2022-06-06 16:53:01
 */
@RestController
@RequestMapping("teamService")
public class TeamServiceController {
    /**
     * 服务对象
     */
    @Resource
    private TeamServiceService teamServiceService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TeamService selectOne(Integer id) {
        return this.teamServiceService.queryById(id);
    }

}