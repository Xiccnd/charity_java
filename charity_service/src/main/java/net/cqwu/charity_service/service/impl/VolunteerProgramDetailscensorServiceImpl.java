package net.cqwu.charity_service.service.impl;

import net.cqwu.charity_dao.mapper.VolunteerProgramDetailscensorDao;
import net.cqwu.charity_commons.pojo.VolunteerProgramDetailscensor;
import net.cqwu.charity_service.service.VolunteerProgramDetailscensorService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (VolunteerProgramDetailscensor)表服务实现类
 *
 * @author makejava
 * @since 2022-06-16 08:52:28
 */
@Service("volunteerProgramDetailscensorService")
public class VolunteerProgramDetailscensorServiceImpl implements VolunteerProgramDetailscensorService {
    @Resource
    private VolunteerProgramDetailscensorDao volunteerProgramDetailscensorDao;

    /**
     * 通过ID查询单条数据
     *
     * @param pid 主键
     * @return 实例对象
     */
    @Override
    public VolunteerProgramDetailscensor queryById(Integer pid) {
        return this.volunteerProgramDetailscensorDao.queryById(pid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<VolunteerProgramDetailscensor> queryAllByLimit(int offset, int limit) {
        return this.volunteerProgramDetailscensorDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param volunteerProgramDetailscensor 实例对象
     * @return 实例对象
     */
    @Override
    public VolunteerProgramDetailscensor insert(VolunteerProgramDetailscensor volunteerProgramDetailscensor) {
        this.volunteerProgramDetailscensorDao.insert(volunteerProgramDetailscensor);
        return volunteerProgramDetailscensor;
    }

    /**
     * 修改数据
     *
     * @param volunteerProgramDetailscensor 实例对象
     * @return 实例对象
     */
    @Override
    public VolunteerProgramDetailscensor update(VolunteerProgramDetailscensor volunteerProgramDetailscensor) {
        this.volunteerProgramDetailscensorDao.update(volunteerProgramDetailscensor);
        return this.queryById(volunteerProgramDetailscensor.getPid());
    }

    @Override
    public List<VolunteerProgramDetailscensor> queryAll(VolunteerProgramDetailscensor volunteerProgramDetailscensor) {
        return this.volunteerProgramDetailscensorDao.queryAll(volunteerProgramDetailscensor);
    }

    /**
     * 通过主键删除数据
     *
     * @param pid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer pid) {
        return this.volunteerProgramDetailscensorDao.deleteById(pid) > 0;
    }
}