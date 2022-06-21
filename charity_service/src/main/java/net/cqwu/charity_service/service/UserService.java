package net.cqwu.charity_service.service;

import net.cqwu.charity_commons.pojo.User;
import java.util.List;
import java.util.Map;

/**
 * (User)表服务接口
 *
 * @author makejava
 * @since 2022-06-06 16:32:57
 */
public interface UserService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    User queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<User> queryAllByLimit(int offset, int limit);
    List<User> EndQueryAll(User user);
    /**
     * 新增数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    Integer insert(User user,String password1);

    List<Map<Object,Object>> getMapNum();
    /**
     * 修改数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    Integer update(User user);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

    Integer Login(User user);
    User RegistrationVerification(User name);
    User queryByName(String name);

    //新增方法
    Map<Object,Object> getTeamLoginMessage();
    void updateLoginMessage(User user);
    void addTeamLoginMessage(Integer teamid,Integer status);
    void deleteTeamLoginMessage();
}