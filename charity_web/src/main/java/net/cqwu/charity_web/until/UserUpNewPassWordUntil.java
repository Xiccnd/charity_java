package net.cqwu.charity_web.until;

import lombok.Data;
import net.cqwu.charity_commons.pojo.User;
@Data
public class UserUpNewPassWordUntil {
    private User user;
    private String newPasswordValue;
}
