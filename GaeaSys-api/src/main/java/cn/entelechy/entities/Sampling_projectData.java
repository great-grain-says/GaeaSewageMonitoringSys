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
 * 采样项目数据
 */
public class Sampling_projectData implements Serializable {
    private String sampling_code;//(样本编号)
    private Integer sampling_type_id;//(样本项目类型计划)
    private Integer factory_id;
    private String emission_sources_code;//(企业排放源头编号)
    private Date sampling_date;//(采样时间)
    private String sampling_person;//(采样人)

}
