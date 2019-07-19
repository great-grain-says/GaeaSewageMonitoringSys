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
public class Factory implements Serializable {
    private Integer factory_id;
    private String factory_code;
    private String factory_name;
    private Integer factory_Genre_id;
    private Integer province_id;
    private Integer city_id;
    private Integer county_id;
    private Integer industrial_park_id;
    private String factory_address;
    private String factory_exequatur;
}
