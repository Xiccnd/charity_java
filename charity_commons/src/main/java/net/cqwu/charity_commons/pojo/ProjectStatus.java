package net.cqwu.charity_commons.pojo;

import java.io.Serializable;

/**
 * (ProjectStatus)实体类
 *
 * @author makejava
 * @since 2022-06-06 16:17:58
 */
public class ProjectStatus implements Serializable {
    private static final long serialVersionUID = 704978467703987332L;
    
    private Integer projectStatus;
    
    private String statusName;


    public Integer getProjectStatus() {
        return projectStatus;
    }

    public void setProjectStatus(Integer projectStatus) {
        this.projectStatus = projectStatus;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

}