package com.yangk.learnsellspringboot.service.impl;

import com.yangk.learnsellspringboot.LearnSellSpringbootApplicationTests;
import com.yangk.learnsellspringboot.dos.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class CategoryServiceImplTest extends LearnSellSpringbootApplicationTests {

    @Autowired
    CategoryServiceImpl categoryService;

    @Test
    public void findOne() {
        ProductCategory productCategory = categoryService.findOne(2);
        Assert.assertNotEquals(null,productCategory);
    }

    @Test
    public void findAll() {
    }

    @Test
    public void findByCategoryTypeIn() {
    }

    @Test
    public void save() {
    }
}