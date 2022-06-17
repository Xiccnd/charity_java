package net.cqwu.charity_service.service.impl;

import net.cqwu.charity_commons.pojo.News;
import net.cqwu.charity_dao.mapper.NewsDao;
import net.cqwu.charity_service.service.NewsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (News)表服务实现类
 *
 * @author makejava
 * @since 2022-06-17 15:09:18
 */
@Service("newsService")
public class NewsServiceImpl implements NewsService {
    @Resource
    private NewsDao newsDao;

    /**
     * 通过ID查询单条数据
     *
     * @param newsid 主键
     * @return 实例对象
     */
    @Override
    public News queryById(Integer newsid) {
        return this.newsDao.queryById(newsid);
    }

    @Override
    public List<News> queryAll(News news) {
        return this.newsDao.queryAll(news);
    }

    @Override
    public List<News> queryOneByNewsId(Integer newsid) {
        return this.newsDao.queryOneByNewsId(newsid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<News> queryAllByLimit(int offset, int limit) {
        return this.newsDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param news 实例对象
     * @return 实例对象
     */
    @Override
    public News insert(News news) {
        this.newsDao.insert(news);
        return news;
    }

    /**
     * 修改数据
     *
     * @param news 实例对象
     * @return 实例对象
     */
    @Override
    public News update(News news) {
        this.newsDao.update(news);
        return this.queryById(news.getNewsid());
    }

    /**
     * 通过主键删除数据
     *
     * @param newsid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer newsid) {
        return this.newsDao.deleteById(newsid) > 0;
    }
}