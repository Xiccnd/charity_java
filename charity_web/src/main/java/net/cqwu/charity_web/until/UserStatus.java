package net.cqwu.charity_web.until;

import net.cqwu.charity_commons.pojo.User;

import java.util.List;

public class UserStatus {
    public static List<User> upData(List<User> users){
        for (User u:users) {
            if (u.getPerid()==2){
                u.setPerName("普通用户");
            }
            if(u.getPerid()==3){
                u.setPerName("队伍管理员");
            }
        }
        return users;
    }
    public static User laoData(User user){
        if ("普通用户".equals(user.getPerName())){
            user.setPerid(2);
        }
        if ("队伍管理员".equals(user.getPerName())){
            user.setPerid(3);
        }
        return user;
    }
}
