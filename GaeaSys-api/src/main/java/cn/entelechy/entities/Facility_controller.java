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
public class Facility_controller implements Serializable {
    private Integer monitor_facility_id;
    private Integer factory_id;
    private String facility_controller_type;//(设备控制具体事宜)
}
