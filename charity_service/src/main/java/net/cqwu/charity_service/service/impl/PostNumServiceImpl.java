package net.cqwu.charity_service.service.impl;

import net.cqwu.charity_commons.pojo.PostNum;
import net.cqwu.charity_dao.mapper.PostNumDao;
import net.cqwu.charity_service.service.PostNumService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (PostNum)表服务实现类
 *
 * @author makejava
 * @since 2022-06-06 16:32:57
 */
@Service("postNumService")
public class PostNumServiceImpl implements PostNumService {
    @Resource
    private PostNumDao postNumDao;

    /**
     * 通过ID查询单条数据
     *
     * @param pid 主键
     * @return 实例对象
     */
    @Override
    public PostNum queryById(Integer pid) {
        return this.postNumDao.queryById(pid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<PostNum> queryAllByLimit(int offset, int limit) {
        return this.postNumDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param postNum 实例对象
     * @return 实例对象
     */
    @Override
    public PostNum insert(PostNum postNum) {
        this.postNumDao.insert(postNum);
        return postNum;
    }

    /**
     * 修改数据
     *
     * @param postNum 实例对象
     * @return 实例对象
     */
    @Override
    public PostNum update(PostNum postNum) {
        this.postNumDao.update(postNum);
        return this.queryById(postNum.getPid());
    }

    /**
     * 通过主键删除数据
     *
     * @param  pid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer pid) {
        return this.postNumDao.deleteById(pid) > 0;
    }
}