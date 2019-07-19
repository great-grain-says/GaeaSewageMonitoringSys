package cn.entelechy.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Accessors(chain = true)
public class User implements Serializable {
    private Integer user_id;
    private String user_code;
    private String user_name;
    private String user_password;
    private String user_salt;
}
