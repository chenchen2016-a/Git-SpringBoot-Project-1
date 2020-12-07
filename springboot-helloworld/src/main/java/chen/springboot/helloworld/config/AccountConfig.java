package chen.springboot.helloworld.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Getter@Setter
@Configuration
@ConfigurationProperties(prefix = "account")
@PropertySource("classpath:account.properties")
public class AccountConfig {
    private String username;
    private String password;
}
