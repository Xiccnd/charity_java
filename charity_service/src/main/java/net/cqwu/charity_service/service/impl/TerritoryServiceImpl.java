package net.cqwu.charity_service.service.impl;


import net.cqwu.charity_commons.pojo.Territory;
import net.cqwu.charity_dao.mapper.TerritoryDao;
import net.cqwu.charity_service.service.TerritoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Territory)表服务实现类
 *
 * @author makejava
 * @since 2022-06-07 14:30:46
 */
@Service("territoryService")
public class TerritoryServiceImpl implements TerritoryService {
    @Resource
    private TerritoryDao territoryDao;

    /**
     * 通过ID查询单条数据
     *
     * @param territoryid 主键
     * @return 实例对象
     */
    @Override
    public Territory queryById(Integer territoryid) {
        return this.territoryDao.queryById(territoryid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Territory> queryAllByLimit(int offset, int limit) {
        return this.territoryDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param territory 实例对象
     * @return 实例对象
     */
    @Override
    public Territory insert(Territory territory) {
        this.territoryDao.insert(territory);
        return territory;
    }

    /**
     * 修改数据
     *
     * @param territory 实例对象
     * @return 实例对象
     */
    @Override
    public Territory update(Territory territory) {
        this.territoryDao.update(territory);
        return this.queryById(territory.getTerritoryid());
    }

    /**
     * 通过主键删除数据
     *
     * @param territoryid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer territoryid) {
        return this.territoryDao.deleteById(territoryid) > 0;
    }

    @Override
    public List<Territory> queryAll(Territory territory) {
        return this.territoryDao.queryAll(territory);
    }
}