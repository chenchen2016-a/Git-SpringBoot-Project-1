package chen.springboot.helloworld.domain;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class Account {
    private String username;
    private String password;
    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
