package net.cqwu.charity_service.service.impl;

import net.cqwu.charity_commons.pojo.VolunteerTeam;
import net.cqwu.charity_dao.mapper.VolunteerTeamDao;
import net.cqwu.charity_service.service.VolunteerTeamService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (VolunteerTeam)表服务实现类
 *
 * @author makejava
 * @since 2022-06-06 16:32:57
 */
@Service("volunteerTeamService")
public class VolunteerTeamServiceImpl implements VolunteerTeamService {
    @Resource
    private VolunteerTeamDao volunteerTeamDao;

    /**
     * 通过ID查询单条数据
     *
     * @param teamid 主键
     * @return 实例对象
     */
    @Override
    public VolunteerTeam queryById(Integer teamid) {
        return this.volunteerTeamDao.queryById(teamid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<VolunteerTeam> queryAllByLimit(int offset, int limit) {
        return this.volunteerTeamDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param volunteerTeam 实例对象
     * @return 实例对象
     */
    @Override
    public VolunteerTeam insert(VolunteerTeam volunteerTeam) {
        this.volunteerTeamDao.insert(volunteerTeam);
        return volunteerTeam;
    }

    /**
     * 修改数据
     *
     * @param volunteerTeam 实例对象
     * @return 实例对象
     */
    @Override
    public VolunteerTeam update(VolunteerTeam volunteerTeam) {
        this.volunteerTeamDao.update(volunteerTeam);
        return this.queryById(volunteerTeam.getTeamid());
    }

    /**
     * 通过主键删除数据
     *
     * @param teamid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer teamid) {
        return this.volunteerTeamDao.deleteById(teamid) > 0;
    }
}