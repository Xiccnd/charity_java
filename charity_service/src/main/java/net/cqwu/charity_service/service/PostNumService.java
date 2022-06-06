package net.cqwu.charity_service.service;

import net.cqwu.charity_commons.pojo.PostNum;
import java.util.List;

/**
 * (PostNum)表服务接口
 *
 * @author makejava
 * @since 2022-06-06 16:32:57
 */
public interface PostNumService {

    /**
     * 通过ID查询单条数据
     *
     * @param  pid 主键
     * @return 实例对象
     */
    PostNum queryById(Integer pid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<PostNum> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param postNum 实例对象
     * @return 实例对象
     */
    PostNum insert(PostNum postNum);

    /**
     * 修改数据
     *
     * @param postNum 实例对象
     * @return 实例对象
     */
    PostNum update(PostNum postNum);

    /**
     * 通过主键删除数据
     *
     * @param pid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer pid);

}