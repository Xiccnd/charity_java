package net.cqwu.charity_commons.pojo;

import java.io.Serializable;

/**
 * (ProjectService)实体类
 *
 * @author makejava
 * @since 2022-06-06 16:17:58
 */
public class ProjectService implements Serializable {
    private static final long serialVersionUID = -52980971521689436L;
    
    private Integer pid;
    
    private Integer sid;


    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

}