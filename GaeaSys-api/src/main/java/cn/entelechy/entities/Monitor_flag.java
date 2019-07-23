package cn.entelechy.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

public class Monitor_flag {
    private String monitor_flag_code;//状态标记
    private String monitor_flag_explain;//标记说明
    private String monitor_flag_judge;//判断策略

    public String getMonitor_flag_code() {
        return monitor_flag_code;
    }

    public void setMonitor_flag_code(String monitor_flag_code) {
        this.monitor_flag_code = monitor_flag_code;
    }

    public String getMonitor_flag_explain() {
        return monitor_flag_explain;
    }

    public void setMonitor_flag_explain(String monitor_flag_explain) {
        this.monitor_flag_explain = monitor_flag_explain;
    }

    public String getMonitor_flag_judge() {
        return monitor_flag_judge;
    }

    public void setMonitor_flag_judge(String monitor_flag_judge) {
        this.monitor_flag_judge = monitor_flag_judge;
    }
}
