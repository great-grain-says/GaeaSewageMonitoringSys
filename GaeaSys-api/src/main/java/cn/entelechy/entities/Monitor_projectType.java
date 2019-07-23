package cn.entelechy.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

public class Monitor_projectType implements Serializable {
    private String monitor_projectType_code;
    private String monitor_projectType_name;
    private String monitor_projectType_unit;

    public String getMonitor_projectType_code() {
        return monitor_projectType_code;
    }

    public void setMonitor_projectType_code(String monitor_projectType_code) {
        this.monitor_projectType_code = monitor_projectType_code;
    }

    public String getMonitor_projectType_name() {
        return monitor_projectType_name;
    }

    public void setMonitor_projectType_name(String monitor_projectType_name) {
        this.monitor_projectType_name = monitor_projectType_name;
    }

    public String getMonitor_projectType_unit() {
        return monitor_projectType_unit;
    }

    public void setMonitor_projectType_unit(String monitor_projectType_unit) {
        this.monitor_projectType_unit = monitor_projectType_unit;
    }
}
