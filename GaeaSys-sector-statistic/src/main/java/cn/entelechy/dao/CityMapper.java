package cn.entelechy.dao;

import cn.entelechy.entities.City;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CityMapper {


    List<City> getCity();

     City getCity(@Param("id") Integer id);

}
