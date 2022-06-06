package net.cqwu.charity_dao.mapper;

import net.cqwu.charity_commons.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User findUserById(Integer id);
}
