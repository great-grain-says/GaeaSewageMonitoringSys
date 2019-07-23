package cn.entelechy.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * 污水处理区域
 */
public class Sewage_treatment_area {
    private Integer factory_id;
    private String sewage_treatment_area_code;
    private String sewage_treatment_area_name;
    private String sewage_treatment_area_desc;

    public Integer getFactory_id() {
        return factory_id;
    }

    public void setFactory_id(Integer factory_id) {
        this.factory_id = factory_id;
    }

    public String getSewage_treatment_area_code() {
        return sewage_treatment_area_code;
    }

    public void setSewage_treatment_area_code(String sewage_treatment_area_code) {
        this.sewage_treatment_area_code = sewage_treatment_area_code;
    }

    public String getSewage_treatment_area_name() {
        return sewage_treatment_area_name;
    }

    public void setSewage_treatment_area_name(String sewage_treatment_area_name) {
        this.sewage_treatment_area_name = sewage_treatment_area_name;
    }

    public String getSewage_treatment_area_desc() {
        return sewage_treatment_area_desc;
    }

    public void setSewage_treatment_area_desc(String sewage_treatment_area_desc) {
        this.sewage_treatment_area_desc = sewage_treatment_area_desc;
    }
}
