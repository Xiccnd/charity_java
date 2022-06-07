package net.cqwu.charity_service.service;

import net.cqwu.charity_commons.pojo.Territory;

import java.util.List;

/**
 * (Territory)表服务接口
 *
 * @author makejava
 * @since 2022-06-07 14:30:46
 */
public interface TerritoryService {

    /**
     * 通过ID查询单条数据
     *
     * @param territoryid 主键
     * @return 实例对象
     */
    Territory queryById(Integer territoryid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Territory> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param territory 实例对象
     * @return 实例对象
     */
    Territory insert(Territory territory);

    /**
     * 修改数据
     *
     * @param territory 实例对象
     * @return 实例对象
     */
    Territory update(Territory territory);

    /**
     * 通过主键删除数据
     *
     * @param territoryid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer territoryid);

    List<Territory> queryAll(Territory territory);
}