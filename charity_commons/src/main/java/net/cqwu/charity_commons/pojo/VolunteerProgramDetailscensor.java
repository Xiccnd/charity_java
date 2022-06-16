package net.cqwu.charity_commons.pojo;

import java.util.Date;
import java.io.Serializable;

/**
 * (VolunteerProgramDetailscensor)实体类
 *
 * @author makejava
 * @since 2022-06-16 08:52:28
 */
public class VolunteerProgramDetailscensor implements Serializable {
    private static final long serialVersionUID = 135750065933292450L;
    
    private Integer pid;
    
    private String pname;
    
    private Integer posts;
    
    private Integer targetNumber;
    
    private Integer enrolledNumber;
    
    private String location;
    
    private Date releaseDate;
    
    private Date projectDate;
    
    private String serviceObject;
    
    private String volunteerUpport;
    
    private Date recruitDate;
    
    private String serviceDescription;
    
    private String projectDetails;
    
    private Integer teamid;
    
    private Integer projectStatus;
    
    private String postDesc;
    
    private String postCondition;
    
    private String postName;
    
    private String targetNum;
    
    private String mark;


    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Integer getPosts() {
        return posts;
    }

    public void setPosts(Integer posts) {
        this.posts = posts;
    }

    public Integer getTargetNumber() {
        return targetNumber;
    }

    public void setTargetNumber(Integer targetNumber) {
        this.targetNumber = targetNumber;
    }

    public Integer getEnrolledNumber() {
        return enrolledNumber;
    }

    public void setEnrolledNumber(Integer enrolledNumber) {
        this.enrolledNumber = enrolledNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Date getProjectDate() {
        return projectDate;
    }

    public void setProjectDate(Date projectDate) {
        this.projectDate = projectDate;
    }

    public String getServiceObject() {
        return serviceObject;
    }

    public void setServiceObject(String serviceObject) {
        this.serviceObject = serviceObject;
    }

    public String getVolunteerUpport() {
        return volunteerUpport;
    }

    public void setVolunteerUpport(String volunteerUpport) {
        this.volunteerUpport = volunteerUpport;
    }

    public Date getRecruitDate() {
        return recruitDate;
    }

    public void setRecruitDate(Date recruitDate) {
        this.recruitDate = recruitDate;
    }

    public String getServiceDescription() {
        return serviceDescription;
    }

    public void setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
    }

    public String getProjectDetails() {
        return projectDetails;
    }

    public void setProjectDetails(String projectDetails) {
        this.projectDetails = projectDetails;
    }

    public Integer getTeamid() {
        return teamid;
    }

    public void setTeamid(Integer teamid) {
        this.teamid = teamid;
    }

    public Integer getProjectStatus() {
        return projectStatus;
    }

    public void setProjectStatus(Integer projectStatus) {
        this.projectStatus = projectStatus;
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

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

}