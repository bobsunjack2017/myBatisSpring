package com.myPj.Spring_Mybatis;

import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.test.context.ContextConfiguration;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sm.pojo.User;

import com.sm.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)

@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })

public class Test {

    @Autowired

    private UserService userService;

    @org.junit.Test

    public void test1() {

        User user = userService.getUserByUsername("ggg");

        System.out.println(user.getUsername());

        System.out.println(user.getPassword());

    }

}