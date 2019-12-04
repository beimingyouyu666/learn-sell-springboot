package com.yangk.learnsellspringboot.repository;

import com.yangk.learnsellspringboot.LearnSellSpringbootApplicationTests;
import com.yangk.learnsellspringboot.dos.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

public class ProductInfoRepositoryTest extends LearnSellSpringbootApplicationTests {

    @Autowired
    private ProductInfoRepository repository;


    @Test
    public void findByProductStatus() {
    }

    @Test
    public void saveTest() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("123456");
        productInfo.setProductName("皮蛋粥");
        productInfo.setProductPrice(new BigDecimal(3.2));
        productInfo.setProductStock(100);
        productInfo.setProductDescription("很好喝的粥");
        productInfo.setProductIcon("http://xxxxx.jpg");
        productInfo.setProductStatus(0);
        productInfo.setCategoryType(2);

        ProductInfo result = repository.save(productInfo);
        Assert.assertNotNull(result);
    }

}