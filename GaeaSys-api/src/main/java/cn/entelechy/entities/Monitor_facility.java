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
public class Monitor_facility implements Serializable {
    private Integer monitor_facility_id;
    private String monitor_facility_code;
    private String monitor_facility_name;
    private String monitor_projectType_code;
}
