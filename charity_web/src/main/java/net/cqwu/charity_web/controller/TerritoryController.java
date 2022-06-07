package net.cqwu.charity_web.controller;

import net.cqwu.charity_commons.pojo.Territory;
import net.cqwu.charity_service.service.TerritoryService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Territory)表控制层
 *
 * @author makejava
 * @since 2022-06-07 14:30:46
 */
@RestController
@RequestMapping("territory")
public class TerritoryController {
    /**
     * 服务对象
     */
    @Resource
    private TerritoryService territoryService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Territory selectOne(Integer id) {
        return this.territoryService.queryById(id);
    }
    @GetMapping("selectAll")
    public List<Territory> selectAll() {
        return this.territoryService.queryAll(new Territory());
    }
}