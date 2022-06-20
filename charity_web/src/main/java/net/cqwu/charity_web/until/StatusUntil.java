package net.cqwu.charity_web.until;

public class StatusUntil {
    public static Integer upStatus(String statusName){
        if (statusName == null || "进行中".equals( statusName )) {
            return 1;
        }else {
            return 2;
        }
    }
}
