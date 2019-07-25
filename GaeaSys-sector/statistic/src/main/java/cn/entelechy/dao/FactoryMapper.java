package cn.entelechy.dao;


import cn.entelechy.entities.Factory;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface FactoryMapper {

    public List<Factory> getfactorylist(@Param("id") Integer id);


}
