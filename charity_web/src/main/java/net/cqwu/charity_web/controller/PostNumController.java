package net.cqwu.charity_web.controller;

import net.cqwu.charity_commons.pojo.PostNum;
import net.cqwu.charity_service.service.PostNumService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (PostNum)表控制层
 *
 * @author makejava
 * @since 2022-06-06 16:53:01
 */
@RestController
@RequestMapping("postNum")
public class PostNumController {
    /**
     * 服务对象
     */
    @Resource
    private PostNumService postNumService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public PostNum selectOne(Integer id) {
        return this.postNumService.queryById(id);
    }

}