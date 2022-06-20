package net.cqwu.charity_service.service.impl;

import net.cqwu.charity_commons.pojo.ClassOfService;
import net.cqwu.charity_dao.mapper.ClassOfServiceDao;
import net.cqwu.charity_service.service.ClassOfServiceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (ClassOfService)表服务实现类
 *
 * @author makejava
 * @since 2022-06-10 10:04:45
 */
@Service("classOfServiceService")
public class ClassOfServiceServiceImpl implements ClassOfServiceService {
    @Resource
    private ClassOfServiceDao classOfServiceDao;

    /**
     * 通过ID查询单条数据
     *
     * @param sid 主键
     * @return 实例对象
     */
    @Override
    public ClassOfService queryById(Integer sid) {
        return this.classOfServiceDao.queryById(sid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<ClassOfService> queryAllByLimit(int offset, int limit) {
        return this.classOfServiceDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param classOfService 实例对象
     * @return 实例对象
     */
    @Override
    public Integer insert(ClassOfService classOfService) {
        return this.classOfServiceDao.insert(classOfService);
    }

    @Override
    public ClassOfService queryByName(String name) {
        return this.classOfServiceDao.queryByName(name);
    }

    /**
     * 修改数据
     *
     * @param classOfService 实例对象
     * @return 实例对象
     */
    @Override
    public ClassOfService update(ClassOfService classOfService) {
        this.classOfServiceDao.update(classOfService);
        return this.queryById(classOfService.getSid());
    }

    /**
     * 通过主键删除数据
     *
     * @param sid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer sid) {
        return this.classOfServiceDao.deleteById(sid) > 0;
    }

    @Override
    public List<ClassOfService> queryAll(ClassOfService classOfService) {
        return this.classOfServiceDao.queryAll(classOfService);
    }
}