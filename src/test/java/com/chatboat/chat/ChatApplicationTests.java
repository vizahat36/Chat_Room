package com.chatboat.chat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = com.chatboat.chat.ChatApplication.class) // Explicitly specifying the class
class ChatApplicationTests {

    @Test
    void contextLoads() {
        System.out.println("Context loads successfully!");
    }
}
