package net.cqwu.charity_service.service;

import net.cqwu.charity_commons.pojo.VolunteerTeam;
import net.cqwu.charity_commons.pojo.VolunteerTeamUntil;

import java.util.List;

/**
 * (VolunteerTeam)表服务接口
 *
 * @author makejava
 * @since 2022-06-06 16:32:57
 */
public interface VolunteerTeamService {

    /**
     * 通过ID查询单条数据
     *
     * @param teamid 主键
     * @return 实例对象
     */
    VolunteerTeam queryById(Integer teamid);
    List<VolunteerTeam> queryByUserId(Integer id);
    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<VolunteerTeam> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param volunteerTeam 实例对象
     * @return 实例对象
     */
    VolunteerTeam insert(VolunteerTeam volunteerTeam);

    /**
     * 修改数据
     *
     * @param volunteerTeam 实例对象
     * @return 实例对象
     */
    VolunteerTeam update(VolunteerTeam volunteerTeam);

    /**
     * 通过主键删除数据
     *
     * @param teamid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer teamid);
    boolean updateTeamInfomation(VolunteerTeam volunteerTeam);

    List<VolunteerTeamUntil> queryAll(VolunteerTeamUntil volunteerTeam);
}