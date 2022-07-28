package com.spring.cloud.nacos0901.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther 月鸟石 2022/7/28
 * 联系方式(QQ)：3054578922
 * 周四
 * 欢迎回家，主人
 */
@RestController
@RequestMapping("nacos0901")
public class controller {



    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("01")
    public String controller01() {
        System.out.println("nacos09_01 01 已执行");
        System.out.println(
                restTemplate.getForObject(
                        "http://nacos0092/nacos0902/01"
                        ,String.class));
        return "success";
    }
}

/**
 * 一切顺心
 */