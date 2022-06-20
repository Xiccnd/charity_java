package net.cqwu.charity_service.service;

import net.cqwu.charity_commons.pojo.ClassOfService;
import java.util.List;

/**
 * (ClassOfService)表服务接口
 *
 * @author makejava
 * @since 2022-06-10 10:04:44
 */
public interface ClassOfServiceService {

    /**
     * 通过ID查询单条数据
     *
     * @param sid 主键
     * @return 实例对象
     */
    ClassOfService queryById(Integer sid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<ClassOfService> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param classOfService 实例对象
     * @return 实例对象
     */
    Integer insert(ClassOfService classOfService);
    ClassOfService queryByName(String name);

    /**
     * 修改数据
     *
     * @param classOfService 实例对象
     * @return 实例对象
     */
    ClassOfService update(ClassOfService classOfService);

    /**
     * 通过主键删除数据
     *
     * @param sid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer sid);
    List<ClassOfService> queryAll(ClassOfService classOfService);
}