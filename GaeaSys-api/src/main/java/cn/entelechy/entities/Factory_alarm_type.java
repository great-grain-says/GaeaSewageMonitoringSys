package cn.entelechy.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * 企业污水处理报警类型
 */
public class Factory_alarm_type {
    private Integer factory_alarm_type_id;
    private String factory_alarm_type_name;
    private String factory_alarm_type_desc;

    public Integer getFactory_alarm_type_id() {
        return factory_alarm_type_id;
    }

    public void setFactory_alarm_type_id(Integer factory_alarm_type_id) {
        this.factory_alarm_type_id = factory_alarm_type_id;
    }

    public String getFactory_alarm_type_name() {
        return factory_alarm_type_name;
    }

    public void setFactory_alarm_type_name(String factory_alarm_type_name) {
        this.factory_alarm_type_name = factory_alarm_type_name;
    }

    public String getFactory_alarm_type_desc() {
        return factory_alarm_type_desc;
    }

    public void setFactory_alarm_type_desc(String factory_alarm_type_desc) {
        this.factory_alarm_type_desc = factory_alarm_type_desc;
    }
}
