package cn.entelechy.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

public class Industrial_park {
    private Integer industrial_park_id;
    private String industrial_park_name;

    public Integer getIndustrial_park_id() {
        return industrial_park_id;
    }

    public void setIndustrial_park_id(Integer industrial_park_id) {
        this.industrial_park_id = industrial_park_id;
    }

    public String getIndustrial_park_name() {
        return industrial_park_name;
    }

    public void setIndustrial_park_name(String industrial_park_name) {
        this.industrial_park_name = industrial_park_name;
    }
}
