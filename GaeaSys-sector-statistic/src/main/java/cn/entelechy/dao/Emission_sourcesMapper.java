package cn.entelechy.dao;


import cn.entelechy.entities.Emission_sources;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Emission_sourcesMapper {

    public List<Emission_sources> getemission_sourceslist(@Param("id") Integer id);
}
