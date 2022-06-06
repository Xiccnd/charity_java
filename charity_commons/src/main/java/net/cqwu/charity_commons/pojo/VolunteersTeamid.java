package net.cqwu.charity_commons.pojo;

import java.io.Serializable;

/**
 * (VolunteersTeamid)实体类
 *
 * @author makejava
 * @since 2022-06-06 16:17:58
 */
public class VolunteersTeamid implements Serializable {
    private static final long serialVersionUID = 920793126412650753L;
    
    private Integer id;
    
    private Integer teamid;


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