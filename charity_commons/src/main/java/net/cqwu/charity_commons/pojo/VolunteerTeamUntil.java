package net.cqwu.charity_commons.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * (VolunteerTeam)实体类
 *
 * @author makejava
 * @since 2022-06-06 16:17:58
 */
@Data
public class VolunteerTeamUntil extends VolunteerTeam {
    private Integer sid;
    private String serviceName;
}