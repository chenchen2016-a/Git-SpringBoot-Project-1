package chen.springboot.restaurant.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class Account {
    private Integer a_id;
    private String a_username;
    private String a_password;
}
