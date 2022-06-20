package net.cqwu.charity_service.service;

import net.cqwu.charity_commons.pojo.Post;
import net.cqwu.charity_commons.pojo.VolunteerProgramDetailscensor;

import java.util.List;

/**
 * (Post)表服务接口
 *
 * @author makejava
 * @since 2022-06-06 16:32:57
 */
public interface PostService {

    /**
     * 通过ID查询单条数据
     *
     * @param postid 主键
     * @return 实例对象
     */
    Post queryById(Integer postid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Post> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param post 实例对象
     * @return 实例对象
     */
    Post insert(Post post);

    /**
     * 修改数据
     *
     * @param post 实例对象
     * @return 实例对象
     */
    Post update(Post post);

    /**
     * 通过主键删除数据
     *
     * @param postid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer postid);

    int agreeinsert(VolunteerProgramDetailscensor volunteerProgramDetailscensor);
}