package net.cqwu.charity_service.service.impl;

import net.cqwu.charity_commons.pojo.User;
import net.cqwu.charity_dao.mapper.UserDao;
import net.cqwu.charity_service.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * (User)表服务实现类
 *
 * @author makejava
 * @since 2022-06-06 16:32:57
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public User queryById(Integer id) {
        return this.userDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<User> queryAllByLimit(int offset, int limit) {
        return this.userDao.queryAllByLimit(offset, limit);
    }

    @Override
    public List<User> EndQueryAll(User user) {
        return this.userDao.EndQueryAll(user);
    }

    /**
     * 新增数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    @Override
    public Integer insert(User user,String password1) {
        if ( !"".equals(user.getPassword()) && user.getPassword().equals(password1)){
            this.userDao.insert(user);
            return this.userDao.queryByName(user.getName()).getId();
        }
        return -1;
    }

    @Override
    public List<Map<Object, Object>> getMapNum() {
        return this.userDao.getMapNum();
    }

    /**
     * 修改数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    @Override
    public Integer update(User user) {

        return this.userDao.update(user);
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.userDao.deleteById(id) > 0;
    }

    @Override
    public Integer Login(User user) {
        User u = this.userDao.queryByName(user.getName());
        if (null==u ) return -2;
        if (!"".equals(user.getPassword()) && !"".equals(u.getPassword()) && user.getPassword().equals(u.getPassword()))
            return u.getPerid();
        return -1;
    }

    @Override
    public User RegistrationVerification(User user) {
        return this.userDao.RegistrationVerification(user);
    }

    @Override
    public User queryByName(String name) {
        return this.userDao.queryByName(name);
    }


    //新增方法
    @Override
    public Map<Object,Object> getTeamLoginMessage() {
        return this.userDao.getTeamLoginMessage();
    }

    @Override
    public void updateLoginMessage(User user) {
        this.userDao.updateLoginMessage(user);
    }

    @Override
    public void addTeamLoginMessage(Integer teamid,Integer status) {
        this.userDao.addTeamLoginMessage(teamid,status);
    }

    @Override
    public void deleteTeamLoginMessage() {
        this.userDao.deleteTeamLoginMessage();
    }
}