package com.projectx;

import com.projectx.config.WebConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * Created by Tobi on 1/21/2017.
 */
@SpringBootApplication
@Import({WebConfig.class})
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class);
    }
}
