package cn.entelechy.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

public class Facility_controller implements Serializable {
    private Integer monitor_facility_id;
    private String facility_controller_code;
    private String facility_controller_desc;

    public Integer getMonitor_facility_id() {
        return monitor_facility_id;
    }

    public void setMonitor_facility_id(Integer monitor_facility_id) {
        this.monitor_facility_id = monitor_facility_id;
    }

    public String getFacility_controller_code() {
        return facility_controller_code;
    }

    public void setFacility_controller_code(String facility_controller_code) {
        this.facility_controller_code = facility_controller_code;
    }

    public String getFacility_controller_desc() {
        return facility_controller_desc;
    }

    public void setFacility_controller_desc(String facility_controller_desc) {
        this.facility_controller_desc = facility_controller_desc;
    }
}
