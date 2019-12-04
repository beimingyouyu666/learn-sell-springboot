package com.yangk.learnsellspringboot.dto;

import lombok.Data;

/**
 * @Description TODO
 * @Author yangkun
 * @Date 2019/11/21
 * @Version 1.0
 */
@Data
public class CartDTO {

    /** 商品Id. */
    private String productId;

    /** 数量. */
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
