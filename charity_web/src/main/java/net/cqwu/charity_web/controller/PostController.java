package net.cqwu.charity_web.controller;

import net.cqwu.charity_commons.pojo.Post;
import net.cqwu.charity_service.service.PostService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Post)表控制层
 *
 * @author makejava
 * @since 2022-06-06 16:53:01
 */
@RestController
@RequestMapping("post")
@CrossOrigin(allowedHeaders="*",value="*",originPatterns="*")
public class PostController {
    /**
     * 服务对象
     */
    @Resource
    private PostService postService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Post selectOne(Integer id) {
        return this.postService.queryById(id);
    }

}