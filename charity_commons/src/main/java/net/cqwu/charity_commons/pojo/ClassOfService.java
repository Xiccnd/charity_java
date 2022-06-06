package net.cqwu.charity_commons.pojo;

import java.io.Serializable;

/**
 * (ClassOfService)实体类
 *
 * @author makejava
 * @since 2022-06-06 16:17:56
 */
public class ClassOfService implements Serializable {
    private static final long serialVersionUID = 432420453322597022L;
    
    private Integer sid;
    
    private String serviceName;


    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

}