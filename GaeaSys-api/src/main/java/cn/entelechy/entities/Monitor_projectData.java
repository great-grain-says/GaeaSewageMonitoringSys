package cn.entelechy.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * 监测项目数据
 */
public class Monitor_projectData implements Serializable {
    private Integer monitor_projectData_id;
    private Integer factory_id;
    private String emission_sources_code;//(企业排放源头编号)
    private String monitor_projectType_code;//(监测污水污染物编码)
    private Integer monitor_projectData_data;
    private String monitor_projectType_unit;//(测量单位)
    private Date monitor_projectData_date;//(记录时间精确到分)
    private String monitor_projectData_desc;//(备注:进水监测|出水监测)

    public Integer getMonitor_projectData_id() {
        return monitor_projectData_id;
    }

    public void setMonitor_projectData_id(Integer monitor_projectData_id) {
        this.monitor_projectData_id = monitor_projectData_id;
    }

    public Integer getmonitor_projectData_data() {
        return monitor_projectData_data;
    }

    public void setmonitor_projectData_data(Integer monitor_projectData_data) {
        this.monitor_projectData_data = monitor_projectData_data;
    }


    public Integer getFactory_id() {
        return factory_id;
    }

    public void setFactory_id(Integer factory_id) {
        this.factory_id = factory_id;
    }

    public String getEmission_sources_code() {
        return emission_sources_code;
    }

    public void setEmission_sources_code(String emission_sources_code) {
        this.emission_sources_code = emission_sources_code;
    }

    public String getMonitor_projectType_code() {
        return monitor_projectType_code;
    }

    public void setMonitor_projectType_code(String monitor_projectType_code) {
        this.monitor_projectType_code = monitor_projectType_code;
    }

    public String getMonitor_projectType_unit() {
        return monitor_projectType_unit;
    }

    public void setMonitor_projectType_unit(String monitor_projectType_unit) {
        this.monitor_projectType_unit = monitor_projectType_unit;
    }

    public Date getMonitor_projectData_date() {
        return monitor_projectData_date;
    }

    public void setMonitor_projectData_date(Date monitor_projectData_date) {
        this.monitor_projectData_date = monitor_projectData_date;
    }

    public String getMonitor_projectData_desc() {
        return monitor_projectData_desc;
    }

    public void setMonitor_projectData_desc(String monitor_projectData_desc) {
        this.monitor_projectData_desc = monitor_projectData_desc;
    }
}
