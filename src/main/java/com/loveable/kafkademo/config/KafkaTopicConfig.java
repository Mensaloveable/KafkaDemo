package com.loveable.kafkademo.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
    @Bean
    public NewTopic loveableTopic() {
        return TopicBuilder.name("Loveable")
//                .partitions(7)
                .build();
    }
}
