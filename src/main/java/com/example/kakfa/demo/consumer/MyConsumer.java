package com.example.kakfa.demo.consumer;


import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MyConsumer {

  @KafkaListener(topics = "topic1", groupId = "group1")
  public void listen(ConsumerRecord<?, String> record) {
    String value = record.value();
    System.out.println("kafka监听的值是1：" + value);
    System.out.println(record);
  }

  @KafkaListener(topics = "topic1", groupId = "group2")
  public void listen2(ConsumerRecord<?, String> record) {
    String value = record.value();
    System.out.println("kafka监听的值是2：" + value);
    System.out.println(record);
  }
}