package cn.entelechy.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

public class Sampling_type {
    private Integer sampling_type_id;//采样计划id
    private String sampling_type_name;
    private String sampling_type_desc;

    public Integer getSampling_type_id() {
        return sampling_type_id;
    }

    public void setSampling_type_id(Integer sampling_type_id) {
        this.sampling_type_id = sampling_type_id;
    }

    public String getSampling_type_name() {
        return sampling_type_name;
    }

    public void setSampling_type_name(String sampling_type_name) {
        this.sampling_type_name = sampling_type_name;
    }

    public String getSampling_type_desc() {
        return sampling_type_desc;
    }

    public void setSampling_type_desc(String sampling_type_desc) {
        this.sampling_type_desc = sampling_type_desc;
    }
}
