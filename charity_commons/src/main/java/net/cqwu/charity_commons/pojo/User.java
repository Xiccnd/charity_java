package net.cqwu.charity_commons.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author makejava
 * @since 2022-06-06 16:17:58
 */
@Data
public class User implements Serializable {
    private static final long serialVersionUID = -80843583600933409L;
    
    private Integer id;
    
    private String name;
    
    private String password;
    
    private String telephone;
    
    private Integer perid;

    private String perName;
    private String realname;

    public String getPerName() {
        return perName;
    }

    public void setPerName(String perName) {
        this.perName = perName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Integer getPerid() {
        return perid;
    }

    public void setPerid(Integer perid) {
        this.perid = perid;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", telephone='" + telephone + '\'' +
                ", perid=" + perid +
                ", perName='" + perName + '\'' +
                ", realname='" + realname + '\'' +
                '}';
    }
}