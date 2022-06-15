package net.cqwu.charity_commons.pojo;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * (VolunteersTeamid)实体类
 *
 * @author makejava
 * @since 2022-06-06 16:17:58
 */
@Data
public class VolunteersTeamid implements Serializable {
    private static final long serialVersionUID = 920793126412650753L;
    
    private Integer id;
    
    private Integer teamid;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date joinTime;
    private String mark;

    public void setJoinTime(Date joinTime) {
        this.joinTime = joinTime;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTeamid() {
        return teamid;
    }

    public void setTeamid(Integer teamid) {
        this.teamid = teamid;
    }

}