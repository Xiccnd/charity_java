package net.cqwu.charity_commons.pojo;

import lombok.Data;
import net.cqwu.charity_commons.pojo.VolunteerProgramDetails;

public class VolunteerProgramDetailsUntil extends VolunteerProgramDetails {
    private String statusName;

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }
}
