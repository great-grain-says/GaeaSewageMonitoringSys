package cn.entelechy.service;


import cn.entelechy.entities.Sewage_treatment_area;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public  interface Sewage_treatment_areaService {

    public List<Sewage_treatment_area> getsewage_treatment_arealist(Integer id);
}
