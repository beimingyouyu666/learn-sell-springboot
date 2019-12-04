package com.yangk.learnsellspringboot.util;

import com.yangk.learnsellspringboot.enums.CodeEnum;

/**
 * @Description TODO
 * @Author yangkun
 * @Date 2019/11/21
 * @Version 1.0
 */
public class EnumUtil {

    public static <T extends CodeEnum> T getByCode(Integer code, Class<T> enumClass) {
        for (T each: enumClass.getEnumConstants()) {
            if (code.equals(each.getCode())) {
                return each;
            }
        }
        return null;
    }
}
