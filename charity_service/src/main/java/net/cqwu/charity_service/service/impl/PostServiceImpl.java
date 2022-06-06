package net.cqwu.charity_service.service.impl;

import net.cqwu.charity_commons.pojo.Post;
import net.cqwu.charity_dao.mapper.PostDao;
import net.cqwu.charity_service.service.PostService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Post)表服务实现类
 *
 * @author makejava
 * @since 2022-06-06 16:32:57
 */
@Service("postService")
public class PostServiceImpl implements PostService {
    @Resource
    private PostDao postDao;

    /**
     * 通过ID查询单条数据
     *
     * @param postid 主键
     * @return 实例对象
     */
    @Override
    public Post queryById(Integer postid) {
        return this.postDao.queryById(postid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Post> queryAllByLimit(int offset, int limit) {
        return this.postDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param post 实例对象
     * @return 实例对象
     */
    @Override
    public Post insert(Post post) {
        this.postDao.insert(post);
        return post;
    }

    /**
     * 修改数据
     *
     * @param post 实例对象
     * @return 实例对象
     */
    @Override
    public Post update(Post post) {
        this.postDao.update(post);
        return this.queryById(post.getPostid());
    }

    /**
     * 通过主键删除数据
     *
     * @param postid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer postid) {
        return this.postDao.deleteById(postid) > 0;
    }
}