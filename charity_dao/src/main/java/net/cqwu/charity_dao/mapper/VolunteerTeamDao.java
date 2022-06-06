package net.cqwu.charity_dao.mapper;

import net.cqwu.charity_commons.pojo.VolunteerTeam;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (VolunteerTeam)表数据库访问层
 *
 * @author makejava
 * @since 2022-06-06 16:20:59
 */
@Mapper
public interface VolunteerTeamDao {

    /**
     * 通过ID查询单条数据
     *
     * @param teamid 主键
     * @return 实例对象
     */
    VolunteerTeam queryById(Integer teamid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<VolunteerTeam> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param volunteerTeam 实例对象
     * @return 对象列表
     */
    List<VolunteerTeam> queryAll(VolunteerTeam volunteerTeam);

    /**
     * 新增数据
     *
     * @param volunteerTeam 实例对象
     * @return 影响行数
     */
    int insert(VolunteerTeam volunteerTeam);

    /**
     * 修改数据
     *
     * @param volunteerTeam 实例对象
     * @return 影响行数
     */
    int update(VolunteerTeam volunteerTeam);

    /**
     * 通过主键删除数据
     *
     * @param teamid 主键
     * @return 影响行数
     */
    int deleteById(Integer teamid);

}