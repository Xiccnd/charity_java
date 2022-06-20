package net.cqwu.charity_web.until;

import lombok.Data;
import net.cqwu.charity_commons.pojo.User;
@Data
public class AddUserUntil {
    private User user;
    private String password1;
    private String realname;

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        user.setPerid(2);
        this.user = user;
    }

    public String getPassword1() {
        return password1;
    }

    public void setPassword1(String password1) {
        this.password1 = password1;
    }
}
