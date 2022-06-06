package net.cqwu.charity_commons.pojo;

import java.io.Serializable;

/**
 * (Permission)实体类
 *
 * @author makejava
 * @since 2022-06-06 16:17:57
 */
public class Permission implements Serializable {
    private static final long serialVersionUID = 965722223252290262L;
    
    private Integer perid;
    
    private String pername;


    public Integer getPerid() {
        return perid;
    }

    public void setPerid(Integer perid) {
        this.perid = perid;
    }

    public String getPername() {
        return pername;
    }

    public void setPername(String pername) {
        this.pername = pername;
    }

}