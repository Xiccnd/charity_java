package net.cqwu.charity_service.service.impl;

import net.cqwu.charity_commons.pojo.TeamService;
import net.cqwu.charity_dao.mapper.TeamServiceDao;
import net.cqwu.charity_service.service.TeamServiceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TeamService)表服务实现类
 *
 * @author makejava
 * @since 2022-06-06 16:32:57
 */
@Service("teamServiceService")
public class TeamServiceServiceImpl implements TeamServiceService {
    @Resource
    private TeamServiceDao teamServiceDao;

    /**
     * 通过ID查询单条数据
     *
     * @param
     * @return 实例对象
     */
    @Override
    public TeamService queryById(Integer teamid) {
        return this.teamServiceDao.queryById(teamid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TeamService> queryAllByLimit(int offset, int limit) {
        return this.teamServiceDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param teamService 实例对象
     * @return 实例对象
     */
    @Override
    public TeamService insert(TeamService teamService) {
        this.teamServiceDao.insert(teamService);
        return teamService;
    }

    /**
     * 修改数据
     *
     * @param teamService 实例对象
     * @return 实例对象
     */
    @Override
    public TeamService update(TeamService teamService) {
        this.teamServiceDao.update(teamService);
        return this.queryById(teamService.getTeamid());
    }

    /**
     * 通过主键删除数据
     *
     * @param
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer teamid) {
        return this.teamServiceDao.deleteById(teamid) > 0;
    }
}