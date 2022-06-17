package net.cqwu.charity_commons.pojo;

import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * (News)实体类
 *
 * @author makejava
 * @since 2022-06-17 15:09:18
 */
@Data
public class News implements Serializable {
    private static final long serialVersionUID = 252418628989590094L;
    
    private Integer newsid;
    
    private String newstitle;
    
    private String newstext;
    
    private String newstime;
    
    private String newssource;
    
    private String newstype;


}