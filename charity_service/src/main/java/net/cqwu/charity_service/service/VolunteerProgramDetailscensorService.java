package net.cqwu.charity_service.service;


import net.cqwu.charity_commons.pojo.VolunteerProgramDetailscensor;

import java.util.List;

/**
 * (VolunteerProgramDetailscensor)表服务接口
 *
 * @author makejava
 * @since 2022-06-16 08:52:28
 */
public interface VolunteerProgramDetailscensorService {

    /**
     * 通过ID查询单条数据
     *
     * @param pid 主键
     * @return 实例对象
     */
    VolunteerProgramDetailscensor queryById(Integer pid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<VolunteerProgramDetailscensor> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param volunteerProgramDetailscensor 实例对象
     * @return 实例对象
     */
    VolunteerProgramDetailscensor insert(VolunteerProgramDetailscensor volunteerProgramDetailscensor);

    /**
     * 修改数据
     *
     * @param volunteerProgramDetailscensor 实例对象
     * @return 实例对象
     */
    VolunteerProgramDetailscensor update(VolunteerProgramDetailscensor volunteerProgramDetailscensor);
    List<VolunteerProgramDetailscensor> queryAll(VolunteerProgramDetailscensor volunteerProgramDetailscensor);
    /**
     * 通过主键删除数据
     *
     * @param pid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer pid);

}