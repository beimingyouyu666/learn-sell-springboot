package com.yangk.learnsellspringboot.converter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.yangk.learnsellspringboot.dos.OrderDetail;
import com.yangk.learnsellspringboot.dto.OrderDTO;
import com.yangk.learnsellspringboot.enums.ResultEnum;
import com.yangk.learnsellspringboot.exception.SellException;
import com.yangk.learnsellspringboot.form.OrderForm;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description TODO
 * @Author yangkun
 * @Date 2019/11/24
 * @Version 1.0
 */
@Slf4j
public class OrderForm2OrderDTOConverter {

    public static OrderDTO convert(OrderForm orderForm) {
        Gson gson = new Gson();
        OrderDTO orderDTO = new OrderDTO();

        orderDTO.setBuyerName(orderForm.getName());
        orderDTO.setBuyerPhone(orderForm.getPhone());
        orderDTO.setBuyerAddress(orderForm.getAddress());
        orderDTO.setBuyerOpenid(orderForm.getOpenid());

        List<OrderDetail> orderDetailList = new ArrayList<>();
        try {
            orderDetailList = gson.fromJson(orderForm.getItems(),
                    new TypeToken<List<OrderDetail>>() {
                    }.getType());
        } catch (Exception e) {
            log.error("【对象转换】错误, string={}", orderForm.getItems());
            throw new SellException(ResultEnum.PARAM_ERROR);
        }
        orderDTO.setOrderDetailList(orderDetailList);

        return orderDTO;
    }
}
