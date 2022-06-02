package net.cqwu.charity_dao.mapper;

import net.cqwu.charity_commons.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("select * from t_user where id = #{id}")
    User findUserById(Integer id);
}
