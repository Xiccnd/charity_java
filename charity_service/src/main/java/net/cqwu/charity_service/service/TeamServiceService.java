package net.cqwu.charity_service.service;

import net.cqwu.charity_commons.pojo.TeamService;
import java.util.List;

/**
 * (TeamService)表服务接口
 *
 * @author makejava
 * @since 2022-06-06 16:32:57
 */
public interface TeamServiceService {

    /**
     * 通过ID查询单条数据
     *
     * @param
     * @return 实例对象
     */
    TeamService queryById(Integer teamid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TeamService> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param teamService 实例对象
     * @return 实例对象
     */
    TeamService insert(TeamService teamService);

    /**
     * 修改数据
     *
     * @param teamService 实例对象
     * @return 实例对象
     */
    TeamService update(TeamService teamService);

    /**
     * 通过主键删除数据
     *
     * @param teamid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer teamid);

}