package com.yangk.learnsellspringboot.enums;

import lombok.Getter;

/**
 * @Description TODO
 * @Author yangkun
 * @Date 2019/11/22
 * @Version 1.0
 */
@Getter
public enum PayStatusEnum implements CodeEnum {

    WAIT(0, "等待支付"),
    SUCCESS(1, "支付成功"),

    ;

    private Integer code;

    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
