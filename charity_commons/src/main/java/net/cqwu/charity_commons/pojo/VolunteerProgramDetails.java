package net.cqwu.charity_commons.pojo;

import java.util.Date;
import java.io.Serializable;

/**
 * (VolunteerProgramDetails)实体类
 *
 * @author makejava
 * @since 2022-06-06 16:17:58
 */
public class VolunteerProgramDetails implements Serializable {
    private static final long serialVersionUID = -80854997787305753L;
    
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

}