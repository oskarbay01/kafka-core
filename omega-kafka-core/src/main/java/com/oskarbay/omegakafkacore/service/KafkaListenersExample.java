package com.oskarbay.omegakafkacore.service;

import com.oskarbay.omegakafkacore.dto.Message;
import org.springframework.kafka.annotation.KafkaListener;

public class KafkaListenersExample {

    @KafkaListener(topics = "demo_topic", groupId = "myGroup")
    void listener(Message data) {

        System.out.println(data);

    }
}
