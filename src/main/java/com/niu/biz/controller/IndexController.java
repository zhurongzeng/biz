package com.niu.biz.controller;

import com.niu.biz.po.CustomerInfo;
import com.niu.biz.service.ICustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
public class IndexController {
    @Autowired
    private ICustomerService customerService;

    @GetMapping(value = "index")
    public String index() {
        return "index";
    }

    @GetMapping(value = "index2")
    public String index2() {
        return "index";
    }
    @PostMapping(value = "register")
    @ResponseBody
    public String register(CustomerInfo customerInfo) {
        log.info("==> 开始注册，用户信息：\n==> {}", customerInfo);
        try {
            Md5PasswordEncoder encoder = new Md5PasswordEncoder();
            String password = encoder.encodePassword(customerInfo.getPassword(), null);
            customerInfo.setPassword(password);
            customerInfo.setUserId("CU" + String.valueOf(System.currentTimeMillis()));
            customerInfo = customerService.save(customerInfo);
        } catch (Exception e) {
            log.error("==> 注册失败！失败原因：{}", e.getStackTrace());
        }
        log.info("==> 注册成功！");
        return customerInfo.getUserName() + "注册成功";
    }
}
