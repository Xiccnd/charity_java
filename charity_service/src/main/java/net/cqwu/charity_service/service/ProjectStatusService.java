package net.cqwu.charity_service.service;

import net.cqwu.charity_commons.pojo.ProjectStatus;
import java.util.List;

/**
 * (ProjectStatus)表服务接口
 *
 * @author makejava
 * @since 2022-06-06 16:32:57
 */
public interface ProjectStatusService {

    /**
     * 通过ID查询单条数据
     *
     * @param projectStatus 主键
     * @return 实例对象
     */
    ProjectStatus queryById(Integer projectStatus);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<ProjectStatus> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param projectStatus 实例对象
     * @return 实例对象
     */
    ProjectStatus insert(ProjectStatus projectStatus);

    /**
     * 修改数据
     *
     * @param projectStatus 实例对象
     * @return 实例对象
     */
    ProjectStatus update(ProjectStatus projectStatus);

    /**
     * 通过主键删除数据
     *
     * @param projectStatus 主键
     * @return 是否成功
     */
    boolean deleteById(Integer projectStatus);

}