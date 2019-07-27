package cn.entelechy.dao;

import cn.entelechy.entities.Sewage_treatment_area;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Sewage_treatment_areaMapper {

    public List<Sewage_treatment_area> getsewage_treatment_arealist(@Param("id") Integer id);
}
