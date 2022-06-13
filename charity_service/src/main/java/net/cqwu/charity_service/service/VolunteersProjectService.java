package net.cqwu.charity_service.service;

import net.cqwu.charity_commons.pojo.MyProject;
import net.cqwu.charity_commons.pojo.VolunteersProject;
import java.util.List;

/**
 * (VolunteersProject)表服务接口
 *
 * @author makejava
 * @since 2022-06-06 16:32:57
 */
public interface VolunteersProjectService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    VolunteersProject queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<VolunteersProject> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param volunteersProject 实例对象
     * @return 实例对象
     */
    VolunteersProject insert(VolunteersProject volunteersProject);

    /**
     * 修改数据
     *
     * @param volunteersProject 实例对象
     * @return 实例对象
     */
    void update(VolunteersProject volunteersProject);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(VolunteersProject id);
    List<MyProject>myProject(Integer id);
    List<MyProject>myJoinInProject(Integer id);
}