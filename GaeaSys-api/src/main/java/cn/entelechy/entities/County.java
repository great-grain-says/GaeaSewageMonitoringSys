package cn.entelechy.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

public class County {
    private Integer county_id;
    private String county_name;


    public Integer getCounty_id() {
        return county_id;
    }

    public void setCounty_id(Integer county_id) {
        this.county_id = county_id;
    }

    public String getCounty_name() {
        return county_name;
    }

    public void setCounty_name(String county_name) {
        this.county_name = county_name;
    }
}
