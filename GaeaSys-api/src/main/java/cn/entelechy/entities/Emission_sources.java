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
    /**
     * 排放源头编号1
     */
    private String emission_sources_code1;
    /**
     * 排放源头编号2
     */
    private String emission_sources_code2;
    /**
     * 排放源头编号3
     */
    private String emission_sources_code3;
    /**
     * 排放源头编号4
     */
    private String emission_sources_code4;
    /**
     * 排放源头编号5
     */
    private String emission_sources_code5;
    private String emission_sources_desc;

    public Integer getFactory_id() {
        return factory_id;
    }

    public void setFactory_id(Integer factory_id) {
        this.factory_id = factory_id;
    }

    public String getEmission_sources_code1() {
        return emission_sources_code1;
    }

    public void setEmission_sources_code1(String emission_sources_code1) {
        this.emission_sources_code1 = emission_sources_code1;
    }

    public String getEmission_sources_code2() {
        return emission_sources_code2;
    }

    public void setEmission_sources_code2(String emission_sources_code2) {
        this.emission_sources_code2 = emission_sources_code2;
    }

    public String getEmission_sources_code3() {
        return emission_sources_code3;
    }

    public void setEmission_sources_code3(String emission_sources_code3) {
        this.emission_sources_code3 = emission_sources_code3;
    }

    public String getEmission_sources_code4() {
        return emission_sources_code4;
    }

    public void setEmission_sources_code4(String emission_sources_code4) {
        this.emission_sources_code4 = emission_sources_code4;
    }

    public String getEmission_sources_code5() {
        return emission_sources_code5;
    }

    public void setEmission_sources_code5(String emission_sources_code5) {
        this.emission_sources_code5 = emission_sources_code5;
    }

    public String getEmission_sources_desc() {
        return emission_sources_desc;
    }

    public void setEmission_sources_desc(String emission_sources_desc) {
        this.emission_sources_desc = emission_sources_desc;
    }
}
