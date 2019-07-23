package cn.entelechy.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

public class Facility_controller implements Serializable {
    private Integer monitor_facility_id;
    private Integer factory_id;
    private String facility_controller_type;//(设备控制具体事宜)

    public Integer getMonitor_facility_id() {
        return monitor_facility_id;
    }

    public void setMonitor_facility_id(Integer monitor_facility_id) {
        this.monitor_facility_id = monitor_facility_id;
    }

    public Integer getFactory_id() {
        return factory_id;
    }

    public void setFactory_id(Integer factory_id) {
        this.factory_id = factory_id;
    }

    public String getFacility_controller_type() {
        return facility_controller_type;
    }

    public void setFacility_controller_type(String facility_controller_type) {
        this.facility_controller_type = facility_controller_type;
    }
}
