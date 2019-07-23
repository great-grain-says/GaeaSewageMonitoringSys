package cn.entelechy.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

public class Monitor_facility implements Serializable {
    private Integer monitor_facility_id;
    private String monitor_facility_code;
    private String monitor_facility_name;
    private String monitor_projectType_code;

    public Integer getMonitor_facility_id() {
        return monitor_facility_id;
    }

    public void setMonitor_facility_id(Integer monitor_facility_id) {
        this.monitor_facility_id = monitor_facility_id;
    }

    public String getMonitor_facility_code() {
        return monitor_facility_code;
    }

    public void setMonitor_facility_code(String monitor_facility_code) {
        this.monitor_facility_code = monitor_facility_code;
    }

    public String getMonitor_facility_name() {
        return monitor_facility_name;
    }

    public void setMonitor_facility_name(String monitor_facility_name) {
        this.monitor_facility_name = monitor_facility_name;
    }

    public String getMonitor_projectType_code() {
        return monitor_projectType_code;
    }

    public void setMonitor_projectType_code(String monitor_projectType_code) {
        this.monitor_projectType_code = monitor_projectType_code;
    }
}
