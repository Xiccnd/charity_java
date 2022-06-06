package net.cqwu.charity_service.service;

import net.cqwu.charity_commons.pojo.Permission;
import java.util.List;

/**
 * (Permission)表服务接口
 *
 * @author makejava
 * @since 2022-06-06 16:32:57
 */
public interface PermissionService {

    /**
     * 通过ID查询单条数据
     *
     * @param perid 主键
     * @return 实例对象
     */
    Permission queryById(Integer perid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Permission> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param permission 实例对象
     * @return 实例对象
     */
    Permission insert(Permission permission);

    /**
     * 修改数据
     *
     * @param permission 实例对象
     * @return 实例对象
     */
    Permission update(Permission permission);

    /**
     * 通过主键删除数据
     *
     * @param perid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer perid);

}