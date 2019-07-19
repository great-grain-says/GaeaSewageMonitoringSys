package cn.entelechy.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Accessors(chain = true)
/**
 * 企业排放源头
 */
public class Emission_sources implements Serializable {
    private Integer factory_id;
    private String emission_sources_code;
    private String emission_sources_type;
    private String emission_sources_desc;
}
