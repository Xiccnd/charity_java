package net.cqwu.charity_service.service;

import net.cqwu.charity_commons.pojo.News;
import java.util.List;

/**
 * (News)表服务接口
 *
 * @author makejava
 * @since 2022-06-17 15:09:18
 */
public interface NewsService {

    /**
     * 通过ID查询单条数据
     *
     * @param newsid 主键
     * @return 实例对象
     */
    News queryById(Integer newsid);
    List<News> queryAll(News news);
    List<News> queryOneByNewsId(News news);
    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<News> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param news 实例对象
     * @return 实例对象
     */
    News insert(News news);

    /**
     * 修改数据
     *
     * @param news 实例对象
     * @return 实例对象
     */
    News update(News news);

    /**
     * 通过主键删除数据
     *
     * @param newsid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer newsid);

}