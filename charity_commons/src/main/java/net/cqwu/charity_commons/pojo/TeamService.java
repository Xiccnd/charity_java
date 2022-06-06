package net.cqwu.charity_commons.pojo;

import java.io.Serializable;

/**
 * (TeamService)实体类
 *
 * @author makejava
 * @since 2022-06-06 16:17:58
 */
public class TeamService implements Serializable {
    private static final long serialVersionUID = -79582934613794895L;
    
    private Integer teamid;
    
    private Integer sid;


    public Integer getTeamid() {
        return teamid;
    }

    public void setTeamid(Integer teamid) {
        this.teamid = teamid;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

}