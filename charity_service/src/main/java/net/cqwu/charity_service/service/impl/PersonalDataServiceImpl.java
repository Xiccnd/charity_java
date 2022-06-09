package net.cqwu.charity_service.service.impl;

import net.cqwu.charity_commons.pojo.PersonalData;
import net.cqwu.charity_commons.pojo.TeamPersonal;
import net.cqwu.charity_dao.mapper.PersonalDataDao;
import net.cqwu.charity_service.service.PersonalDataService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (PersonalData)表服务实现类
 *
 * @author makejava
 * @since 2022-06-09 11:11:44
 */
@Service("personalDataService")
public class PersonalDataServiceImpl implements PersonalDataService {
    @Resource
    private PersonalDataDao personalDataDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public PersonalData queryById(Integer id) {
        return this.personalDataDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<PersonalData> queryAllByLimit(int offset, int limit) {
        return this.personalDataDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param personalData 实例对象
     * @return 实例对象
     */
    @Override
    public PersonalData insert(PersonalData personalData) {
        this.personalDataDao.insert(personalData);
        return personalData;
    }

    /**
     * 修改数据
     *
     * @param personalData 实例对象
     * @return 实例对象
     */
    @Override
    public PersonalData update(PersonalData personalData) {
        this.personalDataDao.update(personalData);
        return this.queryById(personalData.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.personalDataDao.deleteById(id) > 0;
    }

    @Override
    public List<TeamPersonal> teamPersonalMessgeByTeamId(Integer teamid) {
        return this.personalDataDao.teamPersonalMessgeByTeamId(teamid);
    }
}