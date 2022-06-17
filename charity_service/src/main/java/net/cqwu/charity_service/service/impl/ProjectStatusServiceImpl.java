package net.cqwu.charity_service.service.impl;

import net.cqwu.charity_commons.pojo.ProjectStatus;
import net.cqwu.charity_dao.mapper.ProjectStatusDao;
import net.cqwu.charity_service.service.ProjectStatusService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (ProjectStatus)表服务实现类
 *
 * @author makejava
 * @since 2022-06-06 16:32:57
 */
@Service("projectStatusService")
public class ProjectStatusServiceImpl implements ProjectStatusService {
    @Resource
    private ProjectStatusDao projectStatusDao;

    /**
     * 通过ID查询单条数据
     *
     * @param projectStatus 主键
     * @return 实例对象
     */
    @Override
    public ProjectStatus queryById(Integer projectStatus) {
        return this.projectStatusDao.queryById(projectStatus);
    }
    @Override
    public List<ProjectStatus> queryAll(ProjectStatus projectStatus){
        return this.projectStatusDao.queryAll(projectStatus);
    }
    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<ProjectStatus> queryAllByLimit(int offset, int limit) {
        return this.projectStatusDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param projectStatus 实例对象
     * @return 实例对象
     */
    @Override
    public ProjectStatus insert(ProjectStatus projectStatus) {
        this.projectStatusDao.insert(projectStatus);
        return projectStatus;
    }

    /**
     * 修改数据
     *
     * @param projectStatus 实例对象
     * @return 实例对象
     */
    @Override
    public ProjectStatus update(ProjectStatus projectStatus) {
        this.projectStatusDao.update(projectStatus);
        return this.queryById(projectStatus.getProjectStatus());
    }

    /**
     * 通过主键删除数据
     *
     * @param projectStatus 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer projectStatus) {
        return this.projectStatusDao.deleteById(projectStatus) > 0;
    }
}