package cn.entelechy.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

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

    public Integer getFactory_id() {
        return factory_id;
    }

    public void setFactory_id(Integer factory_id) {
        this.factory_id = factory_id;
    }

    public String getFactory_code() {
        return factory_code;
    }

    public void setFactory_code(String factory_code) {
        this.factory_code = factory_code;
    }

    public String getFactory_name() {
        return factory_name;
    }

    public void setFactory_name(String factory_name) {
        this.factory_name = factory_name;
    }

    public Integer getFactory_Genre_id() {
        return factory_Genre_id;
    }

    public void setFactory_Genre_id(Integer factory_Genre_id) {
        this.factory_Genre_id = factory_Genre_id;
    }

    public Integer getProvince_id() {
        return province_id;
    }

    public void setProvince_id(Integer province_id) {
        this.province_id = province_id;
    }

    public Integer getCity_id() {
        return city_id;
    }

    public void setCity_id(Integer city_id) {
        this.city_id = city_id;
    }

    public Integer getCounty_id() {
        return county_id;
    }

    public void setCounty_id(Integer county_id) {
        this.county_id = county_id;
    }

    public Integer getIndustrial_park_id() {
        return industrial_park_id;
    }

    public void setIndustrial_park_id(Integer industrial_park_id) {
        this.industrial_park_id = industrial_park_id;
    }

    public String getFactory_address() {
        return factory_address;
    }

    public void setFactory_address(String factory_address) {
        this.factory_address = factory_address;
    }

    public String getFactory_exequatur() {
        return factory_exequatur;
    }

    public void setFactory_exequatur(String factory_exequatur) {
        this.factory_exequatur = factory_exequatur;
    }
}
