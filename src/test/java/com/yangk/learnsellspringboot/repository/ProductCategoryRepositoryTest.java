package com.yangk.learnsellspringboot.repository;
import com.yangk.learnsellspringboot.dos.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    ProductCategoryRepository productCategoryRepository;

    @Test
    public void saveTest() {
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("潮流");
        productCategory.setCategoryType(3);
        productCategoryRepository.save(productCategory);
    }

    @Test
    public void queryTest() {
        ProductCategory productCategory = new ProductCategory();
        List<ProductCategory> all = productCategoryRepository.findAll();
        Assert.assertNotNull(all);
    }

    @Test
    public void updateTest() {
        ProductCategory productCategory = productCategoryRepository.findById(1).get();
        productCategory.setCategoryType(22);
        productCategoryRepository.save(productCategory);

    }

    @Test
    void findByCategoryTypeIn() {
        List<Integer> productCategories = Arrays.asList(2,22);
        List<ProductCategory> byCategoryTypeIn = productCategoryRepository.findByCategoryTypeIn(productCategories);
        Assert.assertNotEquals(0,byCategoryTypeIn.size());
    }
}