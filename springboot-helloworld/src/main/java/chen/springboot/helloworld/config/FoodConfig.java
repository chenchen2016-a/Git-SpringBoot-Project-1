package chen.springboot.helloworld.config;


import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter@Setter
@ConfigurationProperties(prefix = "food")
public class FoodConfig {
    private String name;
    private String meat;
}
