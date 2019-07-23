package cn.entelechy.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

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

    public String getSampling_code() {
        return sampling_code;
    }

    public void setSampling_code(String sampling_code) {
        this.sampling_code = sampling_code;
    }

    public Integer getSampling_type_id() {
        return sampling_type_id;
    }

    public void setSampling_type_id(Integer sampling_type_id) {
        this.sampling_type_id = sampling_type_id;
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

    public Date getSampling_date() {
        return sampling_date;
    }

    public void setSampling_date(Date sampling_date) {
        this.sampling_date = sampling_date;
    }

    public String getSampling_person() {
        return sampling_person;
    }

    public void setSampling_person(String sampling_person) {
        this.sampling_person = sampling_person;
    }
}
