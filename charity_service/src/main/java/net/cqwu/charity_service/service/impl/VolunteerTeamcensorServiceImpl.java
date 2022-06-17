package net.cqwu.charity_service.service.impl;


import net.cqwu.charity_commons.pojo.InsertTeam;
import net.cqwu.charity_commons.pojo.VolunteerTeamcensor;
import net.cqwu.charity_dao.mapper.VolunteerTeamcensorDao;
import net.cqwu.charity_service.service.VolunteerTeamcensorService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (VolunteerTeamcensor)表服务实现类
 *
 * @author makejava
 * @since 2022-06-11 15:07:25
 */
@Service("volunteerTeamcensorService")
public class VolunteerTeamcensorServiceImpl implements VolunteerTeamcensorService {
    @Resource
    private VolunteerTeamcensorDao volunteerTeamcensorDao;

    /**
     * 通过ID查询单条数据
     *
     * @param teamid 主键
     * @return 实例对象
     */
    @Override
    public VolunteerTeamcensor queryById(Integer teamid) {
        return this.volunteerTeamcensorDao.queryById(teamid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<VolunteerTeamcensor> queryAllByLimit(int offset, int limit) {
        return this.volunteerTeamcensorDao.queryAllByLimit(offset, limit);
    }

    @Override
    public List<VolunteerTeamcensor> queryAll(VolunteerTeamcensor volunteerTeamcensor) {
        return this.volunteerTeamcensorDao.queryAll(volunteerTeamcensor);
    }

    /**
     * 新增数据
     *
     * @param volunteerTeamcensor 实例对象
     * @return 实例对象
     */
    @Override
    public VolunteerTeamcensor insert(VolunteerTeamcensor volunteerTeamcensor) {
        this.volunteerTeamcensorDao.insert(volunteerTeamcensor);
        return volunteerTeamcensor;
    }

    /**
     * 修改数据
     *
     * @param volunteerTeamcensor 实例对象
     * @return 实例对象
     */
    @Override
    public VolunteerTeamcensor update(VolunteerTeamcensor volunteerTeamcensor) {
        this.volunteerTeamcensorDao.update(volunteerTeamcensor);
        return this.queryById(volunteerTeamcensor.getTeamid());
    }

    @Override
    public InsertTeam getOneOfToInsert(Integer teamid) {
        return this.volunteerTeamcensorDao.getOneOfToInsert(teamid);
    }

    /**
     * 通过主键删除数据
     *
     * @param teamid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer teamid) {
        return this.volunteerTeamcensorDao.deleteById(teamid) > 0;
    }
}