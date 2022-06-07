package net.cqwu.charity_service.service.impl;

import net.cqwu.charity_commons.pojo.VolunteerProgramDetails;
import net.cqwu.charity_dao.mapper.VolunteerProgramDetailsDao;
import net.cqwu.charity_service.service.VolunteerProgramDetailsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (VolunteerProgramDetails)表服务实现类
 *
 * @author makejava
 * @since 2022-06-06 16:32:57
 */
@Service("volunteerProgramDetailsService")
public class VolunteerProgramDetailsServiceImpl implements VolunteerProgramDetailsService {
    @Resource
    private VolunteerProgramDetailsDao volunteerProgramDetailsDao;

    /**
     * 通过ID查询单条数据
     *
     * @param pid 主键
     * @return 实例对象
     */
    @Override
    public VolunteerProgramDetails queryById(Integer pid) {
        return this.volunteerProgramDetailsDao.queryById(pid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<VolunteerProgramDetails> queryAllByLimit(int offset, int limit) {
        return this.volunteerProgramDetailsDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param volunteerProgramDetails 实例对象
     * @return 实例对象
     */
    @Override
    public VolunteerProgramDetails insert(VolunteerProgramDetails volunteerProgramDetails) {
        this.volunteerProgramDetailsDao.insert(volunteerProgramDetails);
        return volunteerProgramDetails;
    }

    /**
     * 修改数据
     *
     * @param volunteerProgramDetails 实例对象
     * @return 实例对象
     */
    @Override
    public VolunteerProgramDetails update(VolunteerProgramDetails volunteerProgramDetails) {
        this.volunteerProgramDetailsDao.update(volunteerProgramDetails);
        return this.queryById(volunteerProgramDetails.getPid());
    }

    /**
     * 通过主键删除数据
     *
     * @param pid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer pid) {
        return this.volunteerProgramDetailsDao.deleteById(pid) > 0;
    }

    @Override
    public List<VolunteerProgramDetails> queryAll(VolunteerProgramDetails volunteerProgramDetails) {
        return this.volunteerProgramDetailsDao.queryAll(volunteerProgramDetails);
    }
}