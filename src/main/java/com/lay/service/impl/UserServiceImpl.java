package com.lay.service.impl;

import com.lay.service.UserService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserServiceImpl implements UserService {



    @Scheduled(cron = "0/3 * * * * ?")
    public void getInfo() {
        System.out.println("你好----------时间："+new Date());
    }

    @Scheduled(cron = "0/3 * * * * ?")
    public void getInfo2() {
        System.out.println("我是第二个----------时间："+new Date());
    }
}
