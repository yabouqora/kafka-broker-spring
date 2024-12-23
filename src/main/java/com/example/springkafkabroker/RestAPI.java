package com.example.springkafkabroker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class RestAPI {
//    @Autowired
//    private KafkaTemplate<Integer, String> kafkaTemplate;
//    private String topic = "testTopic";
//
//    @GetMapping("/publish/{message}")
//    public String publishMessage(@PathVariable String message) {
//        kafkaTemplate.send(topic,message);
//        return "Message Published";
//    }

    @Autowired
    private  KafkaTemplate<Integer,  Employee>  kafkaTemplate;
    private String topic="testTopic";
    @GetMapping("/publish/{name}")
    public  String  publishMessage(@PathVariable  String  name){
        kafkaTemplate.send(topic,new Employee("Ahmed","Finance",45000));
        return "Message Published";
    }
}



