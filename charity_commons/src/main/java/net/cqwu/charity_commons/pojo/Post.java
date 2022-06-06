package net.cqwu.charity_commons.pojo;

import java.io.Serializable;

/**
 * (Post)实体类
 *
 * @author makejava
 * @since 2022-06-06 16:17:58
 */
public class Post implements Serializable {
    private static final long serialVersionUID = 854615180863477286L;
    
    private Integer postid;
    
    private String postDesc;
    
    private String postCondition;
    
    private String postName;


    public Integer getPostid() {
        return postid;
    }

    public void setPostid(Integer postid) {
        this.postid = postid;
    }

    public String getPostDesc() {
        return postDesc;
    }

    public void setPostDesc(String postDesc) {
        this.postDesc = postDesc;
    }

    public String getPostCondition() {
        return postCondition;
    }

    public void setPostCondition(String postCondition) {
        this.postCondition = postCondition;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

}