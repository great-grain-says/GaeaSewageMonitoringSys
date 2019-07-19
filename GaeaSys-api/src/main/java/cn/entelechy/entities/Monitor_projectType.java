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
public class Monitor_projectType implements Serializable {
    private String monitor_projectType_code;
    private String monitor_projectType_name;
    private String monitor_projectType_unit;
}
