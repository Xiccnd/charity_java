package net.cqwu.charity_dao.mapper;

import net.cqwu.charity_commons.pojo.PersonalData;
import net.cqwu.charity_commons.pojo.TeamPersonal;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (PersonalData)表数据库访问层
 *
 * @author makejava
 * @since 2022-06-09 11:11:43
 */
public interface PersonalDataDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    PersonalData queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<PersonalData> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param personalData 实例对象
     * @return 对象列表
     */
    List<PersonalData> queryAll(PersonalData personalData);

    /**
     * 新增数据
     *
     * @param personalData 实例对象
     * @return 影响行数
     */
    int insert(PersonalData personalData);

    /**
     * 修改数据
     *
     * @param personalData 实例对象
     * @return 影响行数
     */
    int update(PersonalData personalData);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);
    List<TeamPersonal> teamPersonalMessgeByTeamId(Integer teamid);
}