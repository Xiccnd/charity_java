package net.cqwu.charity_web.until;

import lombok.Data;

@Data
public class ResultUntil {
    private Integer code= 200;
    private String message = "请求成功";
    private Object data;

    public ResultUntil(Object data) {
        this.data = data;
    }
}
