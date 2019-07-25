package cn.entelechy.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import cn.entelechy.entities.City;

import java.util.List;

@Mapper
public interface CityMapper {


    public City getCity(@Param("id") Integer id);
}
