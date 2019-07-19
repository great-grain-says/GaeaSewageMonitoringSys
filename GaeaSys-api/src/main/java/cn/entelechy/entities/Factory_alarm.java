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
 * 企业污水处理报警记录
 */
public class Factory_alarm implements Serializable {
    private Integer factory_alarm_id;
    private Integer factory_id;
    private String emission_sources_code;//(排口编号)
    private Integer factory_alarm_type_id;
    private Date factory_alarm_date;
    private String factory_alarm_handler;//(报警处理人员)
    private String factory_alarm_sources;//(报警来源)
}
