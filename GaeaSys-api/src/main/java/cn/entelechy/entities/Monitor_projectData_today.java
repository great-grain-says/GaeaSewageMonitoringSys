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
public class Monitor_projectData_today implements Serializable {
    private String monitor_projectData_code;
    private Integer factory_id;
    private String emission_sources_code;//(企业排放源头编号)
    private Integer G010;
    private Integer G011;
    private Integer G012;
    private Integer G013;
    private Integer G015;
    private Integer G016;
    private Integer G025;
    private Integer G007;
    private Integer T015;
    private Integer Z002;
    private Date monitor_projectData_date_start;
    private Date monitor_projectData_date_over;
    private Date monitor_projectData_date_upd;//(记录时间精确到分)
    private String monitor_flag_code;

    public String getMonitor_projectData_code() {
        return monitor_projectData_code;
    }

    public void setMonitor_projectData_code(String monitor_projectData_code) {
        this.monitor_projectData_code = monitor_projectData_code;
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

    public Integer getG010() {
        return G010;
    }

    public void setG010(Integer g010) {
        G010 = g010;
    }

    public Integer getG011() {
        return G011;
    }

    public void setG011(Integer g011) {
        G011 = g011;
    }

    public Integer getG012() {
        return G012;
    }

    public void setG012(Integer g012) {
        G012 = g012;
    }

    public Integer getG013() {
        return G013;
    }

    public void setG013(Integer g013) {
        G013 = g013;
    }

    public Integer getG015() {
        return G015;
    }

    public void setG015(Integer g015) {
        G015 = g015;
    }

    public Integer getG016() {
        return G016;
    }

    public void setG016(Integer g016) {
        G016 = g016;
    }

    public Integer getG025() {
        return G025;
    }

    public void setG025(Integer g025) {
        G025 = g025;
    }

    public Integer getG007() {
        return G007;
    }

    public void setG007(Integer g007) {
        G007 = g007;
    }

    public Integer getT015() {
        return T015;
    }

    public void setT015(Integer t015) {
        T015 = t015;
    }

    public Integer getZ002() {
        return Z002;
    }

    public void setZ002(Integer z002) {
        Z002 = z002;
    }

    public Date getMonitor_projectData_date_start() {
        return monitor_projectData_date_start;
    }

    public void setMonitor_projectData_date_start(Date monitor_projectData_date_start) {
        this.monitor_projectData_date_start = monitor_projectData_date_start;
    }

    public Date getMonitor_projectData_date_over() {
        return monitor_projectData_date_over;
    }

    public void setMonitor_projectData_date_over(Date monitor_projectData_date_over) {
        this.monitor_projectData_date_over = monitor_projectData_date_over;
    }

    public Date getMonitor_projectData_date_upd() {
        return monitor_projectData_date_upd;
    }

    public void setMonitor_projectData_date_upd(Date monitor_projectData_date_upd) {
        this.monitor_projectData_date_upd = monitor_projectData_date_upd;
    }

    public String getMonitor_flag_code() {
        return monitor_flag_code;
    }

    public void setMonitor_flag_code(String monitor_flag_code) {
        this.monitor_flag_code = monitor_flag_code;
    }
}
