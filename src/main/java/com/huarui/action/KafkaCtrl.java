package com.huarui.action;

import com.huarui.msg.KafkaSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaCtrl {

    @Autowired
    private KafkaSender kafkaSender;

    @RequestMapping("/test")
    public String test(){

        kafkaSender.sendChannelMess("seckill","牛逼");

        return "ok";
    }

} 