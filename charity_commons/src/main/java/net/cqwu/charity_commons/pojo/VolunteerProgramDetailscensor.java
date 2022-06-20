package net.cqwu.charity_commons.pojo;

import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * (VolunteerProgramDetailscensor)实体类
 *
 * @author makejava
 * @since 2022-06-16 08:52:28
 */
@Data
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

    private String projectStatus;
    
    private String postDesc;
    
    private String postCondition;
    
    private String postName;
    
    private String targetNum;
    
    private String mark;
    private Integer postid;
}