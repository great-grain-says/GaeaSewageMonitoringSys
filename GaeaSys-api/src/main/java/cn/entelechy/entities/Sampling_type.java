package cn.entelechy.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Accessors(chain = true)
public class Sampling_type {
    private Integer sampling_type_id;//采样计划id
    private String sampling_type_name;
    private String sampling_type_desc;
}
