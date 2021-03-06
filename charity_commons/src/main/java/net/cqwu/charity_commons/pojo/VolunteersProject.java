package net.cqwu.charity_commons.pojo;

import lombok.Data;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * (VolunteersProject)实体类
 *
 * @author makejava
 * @since 2022-06-06 16:17:58
 */
@Data
public class VolunteersProject implements Serializable {
    private static final long serialVersionUID = -17298015133278037L;
    
    private Integer id;
    
    private Integer pid;
    
    private Integer postid;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date joinTime;

    private String status;



    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

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