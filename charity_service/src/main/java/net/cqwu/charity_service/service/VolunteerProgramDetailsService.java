package net.cqwu.charity_service.service;

import net.cqwu.charity_commons.pojo.VolunteerProgramDetails;
import java.util.List;

/**
 * (VolunteerProgramDetails)表服务接口
 *
 * @author makejava
 * @since 2022-06-06 16:32:57
 */
public interface VolunteerProgramDetailsService {

    /**
     * 通过ID查询单条数据
     *
     * @param pid 主键
     * @return 实例对象
     */
    VolunteerProgramDetails queryById(Integer pid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<VolunteerProgramDetails> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param volunteerProgramDetails 实例对象
     * @return 实例对象
     */
    VolunteerProgramDetails insert(VolunteerProgramDetails volunteerProgramDetails);

    /**
     * 修改数据
     *
     * @param volunteerProgramDetails 实例对象
     * @return 实例对象
     */
    VolunteerProgramDetails update(VolunteerProgramDetails volunteerProgramDetails);

    /**
     * 通过主键删除数据
     *
     * @param pid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer pid);

    List<VolunteerProgramDetails> queryAll(VolunteerProgramDetails volunteerProgramDetails);
}