package chen.springboot.restaurant.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class Guest {
    private Integer g_id;
    private String g_name;
    private String g_position;
}
