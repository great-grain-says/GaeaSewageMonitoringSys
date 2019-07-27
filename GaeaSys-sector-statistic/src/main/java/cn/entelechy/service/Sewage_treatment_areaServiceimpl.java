package cn.entelechy.service;

import cn.entelechy.dao.Sewage_treatment_areaMapper;
import cn.entelechy.entities.Sewage_treatment_area;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Sewage_treatment_areaServiceimpl implements Sewage_treatment_areaService {

    @Autowired
    private Sewage_treatment_areaMapper sewage_treatment_area;
    //按条件查询污水处理区域表
    @Override
    public List<Sewage_treatment_area> getsewage_treatment_arealist(Integer id){
        return sewage_treatment_area.getsewage_treatment_arealist(id);
    }
}
