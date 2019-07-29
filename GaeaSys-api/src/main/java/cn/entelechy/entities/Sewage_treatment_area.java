package cn.entelechy.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * 污水处理区域
 */
public class Sewage_treatment_area {
    private Integer ffactory_id;
    /**
     * 污水提升泵房编号
     */
    private String sewage_treatment_area_code1;
    /**
     * 沉砂池编号
     */
    private String sewage_treatment_area_code2;
    /**
     * 初级沉淀池编号
     */
    private String sewage_treatment_area_code3;
    /**
     * 曝光机&生物膜处理设备_编号
     */
    private String sewage_treatment_area_code4;
    /**
     * 二级沉淀池编号
     */
    private String sewage_treatment_area_code5;
    /**
     * 污泥处理池编号
     */
    private String sewage_treatment_area_code6;
    /**
     * 关于处理区间备注
     */
    private String sewage_treatment_area_desc;

    public Integer getFfactory_id() {
        return ffactory_id;
    }

    public void setFfactory_id(Integer ffactory_id) {
        this.ffactory_id = ffactory_id;
    }

    public String getSewage_treatment_area_code1() {
        return sewage_treatment_area_code1;
    }

    public void setSewage_treatment_area_code1(String sewage_treatment_area_code1) {
        this.sewage_treatment_area_code1 = sewage_treatment_area_code1;
    }

    public String getSewage_treatment_area_code2() {
        return sewage_treatment_area_code2;
    }

    public void setSewage_treatment_area_code2(String sewage_treatment_area_code2) {
        this.sewage_treatment_area_code2 = sewage_treatment_area_code2;
    }

    public String getSewage_treatment_area_code3() {
        return sewage_treatment_area_code3;
    }

    public void setSewage_treatment_area_code3(String sewage_treatment_area_code3) {
        this.sewage_treatment_area_code3 = sewage_treatment_area_code3;
    }

    public String getSewage_treatment_area_code4() {
        return sewage_treatment_area_code4;
    }

    public void setSewage_treatment_area_code4(String sewage_treatment_area_code4) {
        this.sewage_treatment_area_code4 = sewage_treatment_area_code4;
    }

    public String getSewage_treatment_area_code5() {
        return sewage_treatment_area_code5;
    }

    public void setSewage_treatment_area_code5(String sewage_treatment_area_code5) {
        this.sewage_treatment_area_code5 = sewage_treatment_area_code5;
    }

    public String getSewage_treatment_area_code6() {
        return sewage_treatment_area_code6;
    }

    public void setSewage_treatment_area_code6(String sewage_treatment_area_code6) {
        this.sewage_treatment_area_code6 = sewage_treatment_area_code6;
    }

    public String getSewage_treatment_area_desc() {
        return sewage_treatment_area_desc;
    }

    public void setSewage_treatment_area_desc(String sewage_treatment_area_desc) {
        this.sewage_treatment_area_desc = sewage_treatment_area_desc;
    }
}
