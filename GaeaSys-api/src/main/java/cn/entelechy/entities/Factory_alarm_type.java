package cn.entelechy.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Accessors(chain = true)
/**
 * 企业污水处理报警类型
 */
public class Factory_alarm_type {
    private Integer factory_alarm_type_id;
    private String factory_alarm_type_name;
    private String factory_alarm_type_desc;
}
