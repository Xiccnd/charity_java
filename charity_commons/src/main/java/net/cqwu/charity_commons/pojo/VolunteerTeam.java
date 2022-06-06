package net.cqwu.charity_commons.pojo;

import java.util.Date;
import java.io.Serializable;

/**
 * (VolunteerTeam)实体类
 *
 * @author makejava
 * @since 2022-06-06 16:17:58
 */
public class VolunteerTeam implements Serializable {
    private static final long serialVersionUID = 216341070279251076L;
    
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

}