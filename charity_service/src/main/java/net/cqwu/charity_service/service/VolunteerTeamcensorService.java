package net.cqwu.charity_service.service;

import net.cqwu.charity_commons.pojo.VolunteerTeamcensor;

import java.util.List;

/**
 * (VolunteerTeamcensor)表服务接口
 *
 * @author makejava
 * @since 2022-06-11 15:07:25
 */
public interface VolunteerTeamcensorService {

    /**
     * 通过ID查询单条数据
     *
     * @param teamid 主键
     * @return 实例对象
     */
    VolunteerTeamcensor queryById(Integer teamid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<VolunteerTeamcensor> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param volunteerTeamcensor 实例对象
     * @return 实例对象
     */
    VolunteerTeamcensor insert(VolunteerTeamcensor volunteerTeamcensor);

    /**
     * 修改数据
     *
     * @param volunteerTeamcensor 实例对象
     * @return 实例对象
     */
    VolunteerTeamcensor update(VolunteerTeamcensor volunteerTeamcensor);

    /**
     * 通过主键删除数据
     *
     * @param teamid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer teamid);

}