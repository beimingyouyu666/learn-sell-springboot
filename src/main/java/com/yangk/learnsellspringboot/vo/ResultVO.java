package com.yangk.learnsellspringboot.vo;

import lombok.Data;

/**
 * @Description TODO
 * @Author yangkun
 * @Date 2019/11/21
 * @Version 1.0
 */
@Data
public class ResultVO<T> {

    /** 错误码. */
    private Integer code;

    /** 提示信息. */
    private String msg;

    /** 具体内容. */
    private T data;
}
