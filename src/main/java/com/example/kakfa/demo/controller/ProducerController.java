package com.example.kakfa.demo.controller;

import java.util.UUID;
import javax.annotation.Resource;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {

  @Resource
  private KafkaTemplate<String, Object> kafkaTemplate;

  @GetMapping("/send")
  public void send() {
    kafkaTemplate.send("topic1", "Message body: [" + UUID.randomUUID() + "]");
  }

}