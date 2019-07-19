package cn.entelechy.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Accessors(chain = true)
public class Monitor_flag {
    private String monitor_flag_code;//状态标记
    private String monitor_flag_explain;//标记说明
    private String monitor_flag_judge;//判断策略
}
