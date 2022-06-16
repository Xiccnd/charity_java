package net.cqwu.charity_commons.pojo;

import lombok.Data;

@Data
public class EndAllTeamMessage {
    private User user;
    private VolunteersTeamid volunteersTeamid;
    private VolunteerTeam volunteerTeam;
}
