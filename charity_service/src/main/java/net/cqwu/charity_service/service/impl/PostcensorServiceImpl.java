package net.cqwu.charity_service.service.impl;

import net.cqwu.charity_commons.pojo.Postcensor;
import net.cqwu.charity_dao.mapper.PostcensorDao;
import net.cqwu.charity_service.service.PostcensorService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Postcensor)表服务实现类
 *
 * @author makejava
 * @since 2022-06-16 14:57:23
 */
@Service("postcensorService")
public class PostcensorServiceImpl implements PostcensorService {
    @Resource
    private PostcensorDao postcensorDao;

    /**
     * 通过ID查询单条数据
     *
     * @param postid 主键
     * @return 实例对象
     */
    @Override
    public Postcensor queryById(Integer postid) {
        return this.postcensorDao.queryById(postid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Postcensor> queryAllByLimit(int offset, int limit) {
        return this.postcensorDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param postcensor 实例对象
     * @return 实例对象
     */
    @Override
    public Postcensor insert(Postcensor postcensor) {
        this.postcensorDao.insert(postcensor);
        return postcensor;
    }

    /**
     * 修改数据
     *
     * @param postcensor 实例对象
     * @return 实例对象
     */
    @Override
    public Postcensor update(Postcensor postcensor) {
        this.postcensorDao.update(postcensor);
        return this.queryById(postcensor.getPostid());
    }

    /**
     * 通过主键删除数据
     *
     * @param postid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer postid) {
        return this.postcensorDao.deleteById(postid) > 0;
    }
}