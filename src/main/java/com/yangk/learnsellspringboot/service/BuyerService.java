package com.yangk.learnsellspringboot.service;

import com.yangk.learnsellspringboot.dto.OrderDTO;

/**
 * @Description 根据openid查询或者取消订单，防止横向越权
 * @Author yangkun
 * @Date 2019/12/04
 * @Version 1.0
 */
public interface BuyerService {

    //查询一个订单
    OrderDTO findOrderOne(String openid, String orderId);

    //取消订单
    OrderDTO cancelOrder(String openid, String orderId);
}
