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
public class Users implements Serializable {
    private Integer user_id;
    private String user_number;
    private String user_name;
    private String user_account;
    private String user_password;
    private Integer user_authority_id;
    private String users_region_id;
}
