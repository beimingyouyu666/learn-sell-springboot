package com.yangk.learnsellspringboot.enums;

import lombok.Getter;

/**
 * @Description TODO
 * @Author yangkun
 * @Date 2019/11/22
 * @Version 1.0
 */
@Getter
public enum OrderStatusEnum implements CodeEnum {
    NEW(0, "新订单"),
    FINISHED(1, "完结"),
    CANCEL(2, "已取消"),
    ;

    private Integer code;

    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
