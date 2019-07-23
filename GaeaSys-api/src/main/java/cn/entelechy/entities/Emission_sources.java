package cn.entelechy.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 企业排放源头
 */
public class Emission_sources implements Serializable {
    private Integer factory_id;
    private String emission_sources_code;
    private String emission_sources_type;
    private String emission_sources_desc;

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

    public String getEmission_sources_type() {
        return emission_sources_type;
    }

    public void setEmission_sources_type(String emission_sources_type) {
        this.emission_sources_type = emission_sources_type;
    }

    public String getEmission_sources_desc() {
        return emission_sources_desc;
    }

    public void setEmission_sources_desc(String emission_sources_desc) {
        this.emission_sources_desc = emission_sources_desc;
    }
}
