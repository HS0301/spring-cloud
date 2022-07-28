package com.spring.cloud.nacos0902.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther 月鸟石 2022/7/28
 * 联系方式(QQ)：3054578922
 * 周四
 * 欢迎回家，主人
 */
@RestController
@RequestMapping("nacos0902")
public class controller {


    @GetMapping("01")
    public String controller01() {
        System.out.println("nacos09_02 已执行");
        return "nacos09_02 running";
    }
}

/**
 * 一切顺心
 */