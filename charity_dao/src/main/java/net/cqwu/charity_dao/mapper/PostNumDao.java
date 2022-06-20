package net.cqwu.charity_dao.mapper;

import net.cqwu.charity_commons.pojo.PostNum;
import net.cqwu.charity_commons.pojo.VolunteerProgramDetailscensor;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (PostNum)表数据库访问层
 *
 * @author makejava
 * @since 2022-06-06 16:20:59
 */
@Mapper
public interface PostNumDao {

    /**
     * 通过ID查询单条数据
     *
     * @param pid 主键
     * @return 实例对象
     */
    PostNum queryById(Integer pid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<PostNum> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param postNum 实例对象
     * @return 对象列表
     */
    List<PostNum> queryAll(PostNum postNum);

    /**
     * 新增数据
     *
     * @param postNum 实例对象
     * @return 影响行数
     */
    int insert(PostNum postNum);

    /**
     * 修改数据
     *
     * @param postNum 实例对象
     * @return 影响行数
     */
    int update(PostNum postNum);

    /**
     * 通过主键删除数据
     *
     * @param pid 主键
     * @return 影响行数
     */
    int deleteById(Integer pid);
    int agreeinsert(VolunteerProgramDetailscensor volunteerProgramDetailscensor);
}