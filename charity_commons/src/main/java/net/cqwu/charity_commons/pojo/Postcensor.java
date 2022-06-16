package net.cqwu.charity_commons.pojo;

import java.io.Serializable;

/**
 * (Postcensor)实体类
 *
 * @author makejava
 * @since 2022-06-16 14:57:23
 */
public class Postcensor implements Serializable {
    private static final long serialVersionUID = 587359211830328858L;
    
    private Integer postid;
    
    private String postDesc;
    
    private String postCondition;
    
    private String postName;
    
    private String targetNum;
    
    private Integer teamid;
    
    private Integer pid;


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

    public String getTargetNum() {
        return targetNum;
    }

    public void setTargetNum(String targetNum) {
        this.targetNum = targetNum;
    }

    public Integer getTeamid() {
        return teamid;
    }

    public void setTeamid(Integer teamid) {
        this.teamid = teamid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

}