package net.cqwu.charity_dao.mapper;

import net.cqwu.charity_commons.pojo.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

/**
 * (VolunteerProgramDetails)表数据库访问层
 *
 * @author makejava
 * @since 2022-06-06 16:20:59
 */
@Mapper
public interface VolunteerProgramDetailsDao {

    /**
     * 通过ID查询单条数据
     *
     * @param pid 主键
     * @return 实例对象
     */
    VolunteerProgramDetails queryById(Integer pid);

    List<VolunteerProgramDetails> queryByTeamId(Integer teamID);
    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<VolunteerProgramDetails> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param volunteerProgramDetails 实例对象
     * @return 对象列表
     */
    List<VolunteerProgramDetailsUntil> queryAll(VolunteerProgramDetailsUntil volunteerProgramDetails);
    List<VolunteerProgramDetailsUntil> queryAllByTeamIdANDName(VolunteerProgramDetails volunteerProgramDetails);
    /**
     * 新增数据
     *
     * @param volunteerProgramDetails 实例对象
     * @return 影响行数
     */
    int insert(VolunteerProgramDetails volunteerProgramDetails);

    /**
     * 修改数据
     *
     * @param volunteerProgramDetails 实例对象
     * @return 影响行数
     */
    int update(VolunteerProgramDetails volunteerProgramDetails);

    /**
     * 通过主键删除数据
     *
     * @param pid 主键
     * @return 影响行数
     */
    int deleteById(Integer pid);

    List<VolunteerAllMessge> selectVolunteerAllMessgeByID(Integer pid);
    List<VolunterProgramPost>volunteerProgramPost(Integer id);
    List<ClassOfService>volunteerProgramClass(Integer id);
    List<Map<Object,Object>>shengHeJoin(Integer teamid);
    int agreeinsert(VolunteerProgramDetailscensor volunteerProgramDetailscensor);

    List<Map<Object, Object>> censorjoin(VolunteerProgramDetails volunteerProgramDetails);
}