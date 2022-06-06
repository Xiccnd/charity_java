package net.cqwu.charity_dao.mapper;

import net.cqwu.charity_commons.pojo.VolunteersTeamid;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (VolunteersTeamid)表数据库访问层
 *
 * @author makejava
 * @since 2022-06-06 16:20:59
 */
@Mapper
public interface VolunteersTeamidDao {

    /**
     * 通过ID查询单条数据
     *
     * @param  id 主键
     * @return 实例对象
     */
    VolunteersTeamid queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<VolunteersTeamid> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param volunteersTeamid 实例对象
     * @return 对象列表
     */
    List<VolunteersTeamid> queryAll(VolunteersTeamid volunteersTeamid);

    /**
     * 新增数据
     *
     * @param volunteersTeamid 实例对象
     * @return 影响行数
     */
    int insert(VolunteersTeamid volunteersTeamid);

    /**
     * 修改数据
     *
     * @param volunteersTeamid 实例对象
     * @return 影响行数
     */
    int update(VolunteersTeamid volunteersTeamid);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}