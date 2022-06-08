package net.cqwu.charity_web.controller;

import net.cqwu.charity_commons.pojo.VolunteersTeamid;
import net.cqwu.charity_service.service.VolunteersTeamidService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (VolunteersTeamid)表控制层
 *
 * @author makejava
 * @since 2022-06-06 16:53:01
 */
@RestController
@RequestMapping("volunteersTeamid")
@CrossOrigin(allowedHeaders="*",value="*",originPatterns="*")
public class VolunteersTeamidController {
    /**
     * 服务对象
     */
    @Resource
    private VolunteersTeamidService volunteersTeamidService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public VolunteersTeamid selectOne(Integer id) {
        return this.volunteersTeamidService.queryById(id);
    }

    @PostMapping("Test")
    public VolunteersTeamid test (@RequestBody VolunteersTeamid volunteersTeamid){
        return this.volunteersTeamidService.insert(volunteersTeamid);
    }
}