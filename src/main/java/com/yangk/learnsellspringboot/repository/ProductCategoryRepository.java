package com.yangk.learnsellspringboot.repository;

import com.yangk.learnsellspringboot.dos.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Description TODO
 * @Author yangkun
 * @Date 2019/11/13
 * @Version 1.0
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
