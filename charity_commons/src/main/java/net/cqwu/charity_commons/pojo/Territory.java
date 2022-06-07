package net.cqwu.charity_commons.pojo;

import java.io.Serializable;

/**
 * (Territory)实体类
 *
 * @author makejava
 * @since 2022-06-07 14:30:46
 */
public class Territory implements Serializable {
    private static final long serialVersionUID = 909502518478949875L;
    
    private Integer territoryid;
    
    private String territorydes;


    public Integer getTerritoryid() {
        return territoryid;
    }

    public void setTerritoryid(Integer territoryid) {
        this.territoryid = territoryid;
    }

    public String getTerritorydes() {
        return territorydes;
    }

    public void setTerritorydes(String territorydes) {
        this.territorydes = territorydes;
    }

}