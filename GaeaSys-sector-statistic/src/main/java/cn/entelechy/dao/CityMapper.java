package cn.entelechy.dao;

import cn.entelechy.entities.City;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CityMapper {
    public City getCity(@Param("id") Integer id);
}
