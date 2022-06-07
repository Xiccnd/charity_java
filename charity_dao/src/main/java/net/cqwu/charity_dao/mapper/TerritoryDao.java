package net.cqwu.charity_dao.mapper;

import net.cqwu.charity_commons.pojo.Territory;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Territory)表数据库访问层
 *
 * @author makejava
 * @since 2022-06-07 14:30:46
 */
@Mapper
public interface TerritoryDao {

    /**
     * 通过ID查询单条数据
     *
     * @param territoryid 主键
     * @return 实例对象
     */
    Territory queryById(Integer territoryid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Territory> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param territory 实例对象
     * @return 对象列表
     */
    List<Territory> queryAll(Territory territory);

    /**
     * 新增数据
     *
     * @param territory 实例对象
     * @return 影响行数
     */
    int insert(Territory territory);

    /**
     * 修改数据
     *
     * @param territory 实例对象
     * @return 影响行数
     */
    int update(Territory territory);

    /**
     * 通过主键删除数据
     *
     * @param territoryid 主键
     * @return 影响行数
     */
    int deleteById(Integer territoryid);

}