package chen.springboot.helloworld.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("food")
public class FoodConfig {
    private String name;
    private String meat;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }
}
