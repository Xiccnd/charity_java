package net.cqwu.charity_web.controller;


import net.cqwu.charity_commons.pojo.News;
import net.cqwu.charity_service.service.NewsService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (News)表控制层
 *
 * @author makejava
 * @since 2022-06-17 15:09:18
 */
@RestController
@RequestMapping("news")
@CrossOrigin(allowedHeaders="*",value="*",originPatterns="*")
public class NewsController {
    /**
     * 服务对象
     */
    @Resource
    private NewsService newsService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public News selectOne(Integer id) {
        return this.newsService.queryById(id);
    }
    @GetMapping("queryAll")
    public List<News> queryAll(News news) {
        return this.newsService.queryAll(news);
    }
    @GetMapping("queryOne")
    public List<News> queryOne(News news) {
        this.newsService.addNewsNum(news);
        return this.newsService.queryOneByNewsId(news);
    }

    @GetMapping("queryHotOne")
    public List<News> queryHotOne(News news) {
        return this.newsService.queryOneByNewsId(news);
    }

    @GetMapping("findHotNews")
    public List<News> findHotNews(News news) {
        return this.newsService.findHotNews(news);
    }
    @GetMapping("getAccessNum")
    public Integer getAccessNum() {
        this.newsService.setAccessNum();
        return this.newsService.getAccessNum();
    }
}