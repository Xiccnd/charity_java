package net.cqwu.charity_commons.pojo;

import java.io.Serializable;

/**
 * (VolunteersProject)实体类
 *
 * @author makejava
 * @since 2022-06-06 16:17:58
 */
public class VolunteersProject implements Serializable {
    private static final long serialVersionUID = -17298015133278037L;
    
    private Integer id;
    
    private Integer pid;
    
    private Integer postid;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getPostid() {
        return postid;
    }

    public void setPostid(Integer postid) {
        this.postid = postid;
    }

}