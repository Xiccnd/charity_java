package net.cqwu.charity_service.service.impl;

import net.cqwu.charity_commons.pojo.VolunteersTeamid;
import net.cqwu.charity_dao.mapper.VolunteersTeamidDao;
import net.cqwu.charity_service.service.VolunteersTeamidService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (VolunteersTeamid)表服务实现类
 *
 * @author makejava
 * @since 2022-06-06 16:32:57
 */
@Service("volunteersTeamidService")
public class VolunteersTeamidServiceImpl implements VolunteersTeamidService {
    @Resource
    private VolunteersTeamidDao volunteersTeamidDao;

    /**
     * 通过ID查询单条数据
     *
     * @param
     * @return 实例对象
     */
    @Override
    public VolunteersTeamid queryById(Integer id) {
        return this.volunteersTeamidDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<VolunteersTeamid> queryAllByLimit(int offset, int limit) {
        return this.volunteersTeamidDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param volunteersTeamid 实例对象
     * @return 实例对象
     */
    @Override
    public VolunteersTeamid insert(VolunteersTeamid volunteersTeamid) {
        this.volunteersTeamidDao.insert(volunteersTeamid);
        return volunteersTeamid;
    }

    /**
     * 修改数据
     *
     * @param volunteersTeamid 实例对象
     * @return 实例对象
     */
    @Override
    public VolunteersTeamid update(VolunteersTeamid volunteersTeamid) {
        this.volunteersTeamidDao.update(volunteersTeamid);
        return this.queryById(volunteersTeamid.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.volunteersTeamidDao.deleteById(id) > 0;
    }
}