package net.cqwu.charity_service.service;

import net.cqwu.charity_commons.pojo.Postcensor;
import java.util.List;

/**
 * (Postcensor)表服务接口
 *
 * @author makejava
 * @since 2022-06-16 14:57:23
 */
public interface PostcensorService {

    /**
     * 通过ID查询单条数据
     *
     * @param postid 主键
     * @return 实例对象
     */
    Postcensor queryById(Integer postid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Postcensor> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param postcensor 实例对象
     * @return 实例对象
     */
    Postcensor insert(Postcensor postcensor);

    /**
     * 修改数据
     *
     * @param postcensor 实例对象
     * @return 实例对象
     */
    Postcensor update(Postcensor postcensor);

    /**
     * 通过主键删除数据
     *
     * @param postid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer postid);

}