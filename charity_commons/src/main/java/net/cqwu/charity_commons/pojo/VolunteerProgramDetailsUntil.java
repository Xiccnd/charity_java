package net.cqwu.charity_commons.pojo;

import lombok.Data;
import net.cqwu.charity_commons.pojo.VolunteerProgramDetails;
@Data
public class VolunteerProgramDetailsUntil extends VolunteerProgramDetails {
    private String statusName;
    private String serviceName;
    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }
}
