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
 * 污水处理区域
 */
public class Sewage_treatment_area {
    private Integer factory_id;
    private String sewage_treatment_area_code;
    private String sewage_treatment_area_name;
    private String sewage_treatment_area_desc;
}
