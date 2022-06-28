package com.example.mall.controller;

import com.example.mall.common.Response;
import com.example.mall.common.ResponseUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    @PostMapping("/login")
    public Response Login(){
        return ResponseUtil.success();
    }
}
