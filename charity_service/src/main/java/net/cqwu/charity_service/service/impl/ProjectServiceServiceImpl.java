package net.cqwu.charity_service.service.impl;

import net.cqwu.charity_commons.pojo.ProjectService;
import net.cqwu.charity_dao.mapper.ProjectServiceDao;
import net.cqwu.charity_service.service.ProjectServiceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (ProjectService)表服务实现类
 *
 * @author makejava
 * @since 2022-06-06 16:32:57
 */
@Service("projectServiceService")
public class ProjectServiceServiceImpl implements ProjectServiceService {
    @Resource
    private ProjectServiceDao projectServiceDao;

    /**
     * 通过ID查询单条数据
     *
     * @param  pid
     * @return 实例对象
     */
    @Override
    public ProjectService queryById(Integer pid) {
        return this.projectServiceDao.queryById(pid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<ProjectService> queryAllByLimit(int offset, int limit) {
        return this.projectServiceDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param projectService 实例对象
     * @return 实例对象
     */
    @Override
    public ProjectService insert(ProjectService projectService) {
        this.projectServiceDao.insert(projectService);
        return projectService;
    }

    /**
     * 修改数据
     *
     * @param projectService 实例对象
     * @return 实例对象
     */
    @Override
    public ProjectService update(ProjectService projectService) {
        this.projectServiceDao.update(projectService);
        return this.queryById(projectService.getPid());
    }

    /**
     * 通过主键删除数据
     *
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer pid) {
        return this.projectServiceDao.deleteById(pid) > 0;
    }
}