package dev.rainbow.jpapaging;

import com.github.javafaker.Faker;
import dev.rainbow.jpapaging.repository.PersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class JpaPagingApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaPagingApplication.class, args);
    }

    @Bean
    Faker faker(){
        return new Faker();
    }
}
