package net.cqwu.charity_commons.pojo;

import java.io.Serializable;

/**
 * (PostNum)实体类
 *
 * @author makejava
 * @since 2022-06-06 16:17:58
 */
public class PostNum implements Serializable {
    private static final long serialVersionUID = -81034699751654863L;
    
    private Integer pid;
    
    private Integer postid;
    
    private String targetNum;
    
    private String enrolledNum;


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

    public String getTargetNum() {
        return targetNum;
    }

    public void setTargetNum(String targetNum) {
        this.targetNum = targetNum;
    }

    public String getEnrolledNum() {
        return enrolledNum;
    }

    public void setEnrolledNum(String enrolledNum) {
        this.enrolledNum = enrolledNum;
    }

}