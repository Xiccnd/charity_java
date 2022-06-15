package net.cqwu.charity_service.service.impl;

import net.cqwu.charity_commons.pojo.MyProject;
import net.cqwu.charity_commons.pojo.VolunteersProject;
import net.cqwu.charity_dao.mapper.VolunteersProjectDao;
import net.cqwu.charity_service.service.VolunteersProjectService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (VolunteersProject)表服务实现类
 *
 * @author makejava
 * @since 2022-06-06 16:32:57
 */
@Service("volunteersProjectService")
public class VolunteersProjectServiceImpl implements VolunteersProjectService {
    @Resource
    private VolunteersProjectDao volunteersProjectDao;


    @Override
    public VolunteersProject queryById(Integer id) {
        return this.volunteersProjectDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<VolunteersProject> queryAllByLimit(int offset, int limit) {
        return this.volunteersProjectDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param volunteersProject 实例对象
     * @return 实例对象
     */
    @Override
    public VolunteersProject insert(VolunteersProject volunteersProject) {
        this.volunteersProjectDao.insert(volunteersProject);
        return volunteersProject;
    }

    @Override
    public VolunteersProject queryByIdAndPid(VolunteersProject volunteersProject) {
        return this.volunteersProjectDao.queryByIdAndPid(volunteersProject);
    }


    @Override
    public void update(VolunteersProject volunteersProject) {
        this.volunteersProjectDao.update(volunteersProject);
    }

    @Override
    public List<VolunteersProject> queryByIdList(Integer id) {
        return this.volunteersProjectDao.queryByIdList(id);
    }


    @Override
    public boolean deleteById(VolunteersProject id) {
        return this.volunteersProjectDao.deleteById(id) > 0;
    }

    @Override
    public List<MyProject> myProject(Integer id) {
        return this.volunteersProjectDao.myProject(id);
    }
    @Override
    public List<MyProject> myJoinInProject(Integer id){
        return this.volunteersProjectDao.myJoinInProject(id);
    }
}