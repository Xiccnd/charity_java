package net.cqwu.charity_commons.pojo;

public class VolunteerAllMessge extends VolunteerProgramDetails {
    private String targetNum;

    private String enrolledNum;

    private Integer postid;

    private String postDesc;

    private String postCondition;

    private String postName;


    public String getTargetNum() {
        return targetNum;
    }

    public void setTargetNum(String targetNum) {
        this.targetNum = targetNum;
    }

    public String getEnrolledNum() {
        return enrolledNum;
    }

    public void setEnrolledNum(String enrolledNum) {
        this.enrolledNum = enrolledNum;
    }

    public Integer getPostid() {
        return postid;
    }

    public void setPostid(Integer postid) {
        this.postid = postid;
    }

    public String getPostDesc() {
        return postDesc;
    }

    public void setPostDesc(String postDesc) {
        this.postDesc = postDesc;
    }

    public String getPostCondition() {
        return postCondition;
    }

    public void setPostCondition(String postCondition) {
        this.postCondition = postCondition;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }
}
