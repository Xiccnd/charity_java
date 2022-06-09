package net.cqwu.charity_commons.pojo;

public class TeamPersonal extends PersonalData {
    private Integer teamid;

    private String joinTime;

    public Integer getTeamid() {
        return teamid;
    }

    public void setTeamid(Integer teamid) {
        this.teamid = teamid;
    }

    public String getJoinTime() {
        return joinTime;
    }

    public void setJoinTime(String joinTime) {
        this.joinTime = joinTime;
    }
}
