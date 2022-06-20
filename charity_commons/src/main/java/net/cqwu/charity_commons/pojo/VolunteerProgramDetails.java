package net.cqwu.charity_commons.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * (VolunteerProgramDetails)实体类
 *
 * @author makejava
 * @since 2022-06-06 16:17:58
 */
@Data
public class VolunteerProgramDetails implements Serializable {
    private static final long serialVersionUID = -80854997787305753L;
    
    private Integer pid;
    
    private String pname;
    
    private Integer posts;
    
    private Integer targetNumber;
    
    private Integer enrolledNumber;
    
    private String location;

    private String releaseDate;
    
    private String projectDate;
    
    private String serviceObject;
    
    private String volunteerUpport;

    private String recruitDate;
    
    private String serviceDescription;
    
    private String projectDetails;
    
    private Integer teamid;
    
    private String projectStatus;

}