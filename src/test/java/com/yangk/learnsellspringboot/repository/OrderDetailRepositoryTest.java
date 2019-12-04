package com.yangk.learnsellspringboot.repository;

import com.yangk.learnsellspringboot.LearnSellSpringbootApplicationTests;
import com.yangk.learnsellspringboot.dos.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.List;

public class OrderDetailRepositoryTest extends LearnSellSpringbootApplicationTests {

    @Autowired
    private OrderDetailRepository repository;

    @Test
    public void saveTest() {
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("1234567810");
        orderDetail.setOrderId("11111111");
        orderDetail.setProductIcon("http://xxxx.jpg");
        orderDetail.setProductId("11111111");
        orderDetail.setProductName("皮蛋xiazi粥");
        orderDetail.setProductPrice(new BigDecimal(2.2));
        orderDetail.setProductQuantity(3);

        OrderDetail result = repository.save(orderDetail);
        Assert.assertNotNull(result);
    }

    @Test
    public void findByOrderId() throws Exception {
        List<OrderDetail> orderDetailList = repository.findByOrderId("11111111");
        Assert.assertNotEquals(0, orderDetailList.size());
    }

}