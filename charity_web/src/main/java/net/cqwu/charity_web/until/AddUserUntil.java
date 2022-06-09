package net.cqwu.charity_web.until;

import net.cqwu.charity_commons.pojo.User;

public class AddUserUntil {
    private User user;
    private String password1;

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
