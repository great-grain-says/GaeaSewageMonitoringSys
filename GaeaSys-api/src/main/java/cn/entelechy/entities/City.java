package cn.entelechy.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

public class City {
    private Integer city_id;
    private String city_name;

    public Integer getCity_id() {
        return city_id;
    }

    public void setCity_id(Integer city_id) {
        this.city_id = city_id;
    }

    public String getCity_name() {

        return city_name;
    }
    
    public void setCity_name(String city_name) {

        this.city_name = city_name;
    }
}
