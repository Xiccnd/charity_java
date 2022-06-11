package net.cqwu.charity_dao.mapper;

import net.cqwu.charity_commons.pojo.VolunteerTeamcensor;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (VolunteerTeamcensor)表数据库访问层
 *
 * @author makejava
 * @since 2022-06-11 15:07:25
 */
public interface VolunteerTeamcensorDao {

    /**
     * 通过ID查询单条数据
     *
     * @param teamid 主键
     * @return 实例对象
     */
    VolunteerTeamcensor queryById(Integer teamid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<VolunteerTeamcensor> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param volunteerTeamcensor 实例对象
     * @return 对象列表
     */
    List<VolunteerTeamcensor> queryAll(VolunteerTeamcensor volunteerTeamcensor);

    /**
     * 新增数据
     *
     * @param volunteerTeamcensor 实例对象
     * @return 影响行数
     */
    int insert(VolunteerTeamcensor volunteerTeamcensor);

    /**
     * 修改数据
     *
     * @param volunteerTeamcensor 实例对象
     * @return 影响行数
     */
    int update(VolunteerTeamcensor volunteerTeamcensor);

    /**
     * 通过主键删除数据
     *
     * @param teamid 主键
     * @return 影响行数
     */
    int deleteById(Integer teamid);

}