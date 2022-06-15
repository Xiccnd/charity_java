package net.cqwu.charity_service.service;

import net.cqwu.charity_commons.pojo.PersonalData;
import net.cqwu.charity_commons.pojo.TeamPersonal;

import java.util.List;

/**
 * (PersonalData)表服务接口
 *
 * @author makejava
 * @since 2022-06-09 11:11:44
 */
public interface PersonalDataService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    PersonalData queryById(Integer id);
    PersonalData getMyMessages(String uname);
    List<PersonalData> endQueryAll(PersonalData personalData);
    List<PersonalData> endQueryJoinAll(PersonalData personalData);
    List<PersonalData> endTeamJoinIn(String teamid);
    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<PersonalData> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param personalData 实例对象
     * @return 实例对象
     */
    PersonalData insert(PersonalData personalData);

    /**
     * 修改数据
     *
     * @param personalData 实例对象
     * @return 实例对象
     */
    PersonalData update(PersonalData personalData);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);
    boolean agreeById(Integer id);
    boolean refuseById(Integer id,Integer teamid);
    List<TeamPersonal> teamPersonalMessgeByTeamId(Integer teamid);

    List<TeamPersonal> getAllJoinMessages(Integer teamid);
}