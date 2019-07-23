package cn.entelechy.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

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

    public Integer getFactory_alarm_id() {
        return factory_alarm_id;
    }

    public void setFactory_alarm_id(Integer factory_alarm_id) {
        this.factory_alarm_id = factory_alarm_id;
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

    public Integer getFactory_alarm_type_id() {
        return factory_alarm_type_id;
    }

    public void setFactory_alarm_type_id(Integer factory_alarm_type_id) {
        this.factory_alarm_type_id = factory_alarm_type_id;
    }

    public Date getFactory_alarm_date() {
        return factory_alarm_date;
    }

    public void setFactory_alarm_date(Date factory_alarm_date) {
        this.factory_alarm_date = factory_alarm_date;
    }

    public String getFactory_alarm_handler() {
        return factory_alarm_handler;
    }

    public void setFactory_alarm_handler(String factory_alarm_handler) {
        this.factory_alarm_handler = factory_alarm_handler;
    }

    public String getFactory_alarm_sources() {
        return factory_alarm_sources;
    }

    public void setFactory_alarm_sources(String factory_alarm_sources) {
        this.factory_alarm_sources = factory_alarm_sources;
    }
}
