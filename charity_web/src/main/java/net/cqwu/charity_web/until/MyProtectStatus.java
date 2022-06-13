package net.cqwu.charity_web.until;

import net.cqwu.charity_commons.pojo.MyProject;

import java.util.List;

public class MyProtectStatus {
    public static List<MyProject> upDate(List<MyProject> myProjects){
        for (MyProject i: myProjects) {
            if ("-1".equals(i.getMark())){
                i.setStatusName("退出审核");
            }
            if ("0".equals(i.getMark())){
                i.setStatusName("加入审核");
            }
        }
        return myProjects;
    }
    public static MyProject upData(MyProject myProjects){
            if ("退出审核".equals(myProjects.getStatusName())){
                myProjects.setMark("-1");
            }
            if ("加入审核".equals(myProjects.getStatusName())){
                myProjects.setMark("0");
            }
        return myProjects;
    }
}
