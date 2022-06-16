package net.cqwu.charity_web.controller;

import net.cqwu.charity_commons.pojo.User;
import net.cqwu.charity_dao.mapper.UserMapper;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@CrossOrigin(allowedHeaders="*",value="*",originPatterns="*")
public class UserController {
    @Resource
    private UserMapper userMapper;

    @RequestMapping("/test/{id}")
    public User test(@PathVariable("id") Integer id) {
        return userMapper.findUserById(id);
    }

}
