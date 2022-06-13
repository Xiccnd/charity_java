package net.cqwu.charity_web.until;

import net.cqwu.charity_commons.pojo.MyProject;
import net.cqwu.charity_commons.pojo.MyTeam;

import java.util.List;

public class MyTeamStatus {
    public static List<MyTeam> upDate(List<MyTeam> myProjects){
        for (MyTeam i: myProjects) {
            if ("-1".equals(i.getMark())){
                i.setStatusName("退出审核");
            }
            if ("0".equals(i.getMark())){
                i.setStatusName("加入审核");
            }
            if ("1".equals(i.getMark())){
                i.setStatusName("已加入");
            }
            if ("3".equals(i.getMark())){
                i.setStatusName("队伍管理员");
            }
        }
        return myProjects;
    }
}
