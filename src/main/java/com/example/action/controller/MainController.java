package com.example.action.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController
{
    @RequestMapping("/")
    public String hello()
    {
        return "문구 수정 테스트";
    }
}