package net.cqwu.charity_commons.pojo;

import java.io.Serializable;

/**
 * (PersonalData)实体类
 *
 * @author makejava
 * @since 2022-06-06 16:17:58
 */
public class PersonalData implements Serializable {
    private static final long serialVersionUID = 837780255584307601L;
    
    private Integer id;
    
    private String uname;
    
    private String idcard;
    
    private String nation;
    
    private String political;
    
    private String nativeplace;
    
    private String telephone;
    
    private String profile;

    private String sex;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getPolitical() {
        return political;
    }

    public void setPolitical(String political) {
        this.political = political;
    }

    public String getNativeplace() {
        return nativeplace;
    }

    public void setNativeplace(String nativeplace) {
        this.nativeplace = nativeplace;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

}