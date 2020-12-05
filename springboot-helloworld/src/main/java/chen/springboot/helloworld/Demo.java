package chen.springboot.helloworld;

import chen.springboot.helloworld.config.FoodConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({FoodConfig.class})
public class Demo {
    public static void main(String[] args) {
        SpringApplication.run(Demo.class, args);
    }
}