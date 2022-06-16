package net.cqwu.charity_web.controller;

import net.cqwu.charity_commons.pojo.Postcensor;
import net.cqwu.charity_service.service.PostcensorService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Postcensor)表控制层
 *
 * @author makejava
 * @since 2022-06-16 14:57:23
 */
@RestController
@RequestMapping("postcensor")
public class PostcensorController {
    /**
     * 服务对象
     */
    @Resource
    private PostcensorService postcensorService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Postcensor selectOne(Integer id) {
        return this.postcensorService.queryById(id);
    }

}