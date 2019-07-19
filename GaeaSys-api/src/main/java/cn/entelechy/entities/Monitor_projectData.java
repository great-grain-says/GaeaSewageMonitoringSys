package cn.entelechy.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Accessors(chain = true)
/**
 * 监测项目数据
 */
public class Monitor_projectData implements Serializable {
    private Integer monitor_projectData_id;
    private Integer factory_id;
    private String emission_sources_code;//(企业排放源头编号)
    private String monitor_projectType_code;//(监测污水污染物编码)
    private String monitor_projectType_unit;//(测量单位)
    private Date monitor_projectData_date;//(记录时间精确到分)
    private String monitor_projectData_desc;//(备注:进水监测|出水监测)
}
