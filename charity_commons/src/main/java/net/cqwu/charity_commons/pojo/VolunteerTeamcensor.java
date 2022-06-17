package net.cqwu.charity_commons.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.io.Serializable;

/**
 * (VolunteerTeamcensor)实体类
 *
 * @author makejava
 * @since 2022-06-11 15:07:25
 */
public class VolunteerTeamcensor implements Serializable {
    private static final long serialVersionUID = -48044109616351402L;
    
    private Integer teamid;
    
    private String contact;
    
    private String teamName;
    
    private String address;
    
    private String regisDepartment;
    
    private String registrationAuthority;
    
    private String telephone;

    private Date registerDate;
    
    private String detailedAddress;
    
    private String liaisonOrganization;
    
    private String teamProfile;
    
    private String uname;
    
    private String password;
    
    private String status;
    
    private String sid;

    private Integer[] sids;

    public Integer[] getSids() {
        return sids;
    }

    public void setSids(Integer[] sids) {
        this.sids = sids;
    }

    public Integer getTeamid() {
        return teamid;
    }

    public void setTeamid(Integer teamid) {
        this.teamid = teamid;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRegisDepartment() {
        return regisDepartment;
    }

    public void setRegisDepartment(String regisDepartment) {
        this.regisDepartment = regisDepartment;
    }

    public String getRegistrationAuthority() {
        return registrationAuthority;
    }

    public void setRegistrationAuthority(String registrationAuthority) {
        this.registrationAuthority = registrationAuthority;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public String getDetailedAddress() {
        return detailedAddress;
    }

    public void setDetailedAddress(String detailedAddress) {
        this.detailedAddress = detailedAddress;
    }

    public String getLiaisonOrganization() {
        return liaisonOrganization;
    }

    public void setLiaisonOrganization(String liaisonOrganization) {
        this.liaisonOrganization = liaisonOrganization;
    }

    public String getTeamProfile() {
        return teamProfile;
    }

    public void setTeamProfile(String teamProfile) {
        this.teamProfile = teamProfile;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

}