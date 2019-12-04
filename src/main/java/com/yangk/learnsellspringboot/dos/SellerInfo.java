package com.yangk.learnsellspringboot.dos;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @Description TODO
 * @Author yangkun
 * @Date 2019/11/21
 * @Version 1.0
 */
@Data
@Entity
public class SellerInfo {

    @Id
    private String sellerId;

    private String username;

    private String password;

    private String openid;
}
