package net.cqwu.charity_service.service.impl;

import net.cqwu.charity_commons.pojo.Permission;
import net.cqwu.charity_dao.mapper.PermissionDao;
import net.cqwu.charity_service.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Permission)表服务实现类
 *
 * @author makejava
 * @since 2022-06-06 16:32:57
 */
@Service("permissionService")
public class PermissionServiceImpl implements PermissionService {
    @Autowired
    private PermissionDao permissionDao;

    /**
     * 通过ID查询单条数据
     *
     * @param  perid 主键
     * @return 实例对象
     */
    @Override
    public Permission queryById(Integer perid) {
        return this.permissionDao.queryById(perid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Permission> queryAllByLimit(int offset, int limit) {
        return this.permissionDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param permission 实例对象
     * @return 实例对象
     */
    @Override
    public Permission insert(Permission permission) {
        this.permissionDao.insert(permission);
        return permission;
    }

    /**
     * 修改数据
     *
     * @param permission 实例对象
     * @return 实例对象
     */
    @Override
    public Permission update(Permission permission) {
        this.permissionDao.update(permission);
        return this.queryById(permission.getPerid());
    }

    /**
     * 通过主键删除数据
     *
     * @param perid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer perid) {
        return this.permissionDao.deleteById(perid) > 0;
    }
}