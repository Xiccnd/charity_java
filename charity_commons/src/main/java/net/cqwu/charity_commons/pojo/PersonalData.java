package net.cqwu.charity_commons.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * (PersonalData)实体类
 *
 * @author makejava
 * @since 2022-06-09 11:11:42
 */
@Data
public class PersonalData implements Serializable {
    private static final long serialVersionUID = -47845896515607177L;
    
    private Integer id;
    
    private String name;
    
    private String uname;
    
    private String idcard;
    
    private String nation;
    
    private String political;
    
    private String nativeplace;
    
    private String telephone;
    
    private String profile;
    
    private String sex;
    
    private String country;
    
    private String mailbox;
    
    private String education;
    
    private String qq;
    
    private String weixin;
    
    private String address;
    
    private String employment;
    
    private String area;

    private Integer teamid;

    private Integer mark;
    public Integer getTeamid() {
        return teamid;
    }

    public void setTeamid(Integer teamid) {
        this.teamid = teamid;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getMailbox() {
        return mailbox;
    }

    public void setMailbox(String mailbox) {
        this.mailbox = mailbox;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getWeixin() {
        return weixin;
    }

    public void setWeixin(String weixin) {
        this.weixin = weixin;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmployment() {
        return employment;
    }

    public void setEmployment(String employment) {
        this.employment = employment;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "PersonalData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", uname='" + uname + '\'' +
                ", idcard='" + idcard + '\'' +
                ", nation='" + nation + '\'' +
                ", political='" + political + '\'' +
                ", nativeplace='" + nativeplace + '\'' +
                ", telephone='" + telephone + '\'' +
                ", profile='" + profile + '\'' +
                ", sex='" + sex + '\'' +
                ", country='" + country + '\'' +
                ", mailbox='" + mailbox + '\'' +
                ", education='" + education + '\'' +
                ", qq='" + qq + '\'' +
                ", weixin='" + weixin + '\'' +
                ", address='" + address + '\'' +
                ", employment='" + employment + '\'' +
                ", area='" + area + '\'' +
                ", teamid=" + teamid +
                '}';
    }
}