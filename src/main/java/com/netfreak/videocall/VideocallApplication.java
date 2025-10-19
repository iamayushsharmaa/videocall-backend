package com.netfreak.videocall;

import com.netfreak.videocall.model.User;
import com.netfreak.videocall.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VideocallApplication {

    public static void main(String[] args) {
        SpringApplication.run(VideocallApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(
            UserService service
    ) {
        return args -> {
            service.register(User.builder()
                    .username("Ayush")
                    .email("ayush@gmail")
                    .password("ahhh")
                    .build());
            service.register(User.builder()
                    .username("John")
                    .email("anet@gmail")
                    .password("890")
                    .build());
        };
    }

}
