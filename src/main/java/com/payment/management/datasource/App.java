package com.payment.management.datasource;

import com.payment.management.datasource.config.AuthConfig;
import com.payment.management.datasource.config.DatabaseConfig;
import com.payment.management.datasource.config.WebConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({       // empty configs just for testing
        WebConfig.class
        , AuthConfig.class
        , DatabaseConfig.class
})
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
