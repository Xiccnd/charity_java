package net.cqwu.charity_service.service;

import net.cqwu.charity_commons.pojo.PersonalData;
import java.util.List;

/**
 * (PersonalData)表服务接口
 *
 * @author makejava
 * @since 2022-06-06 16:32:57
 */
public interface PersonalDataService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    PersonalData queryById(Integer id);

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

}