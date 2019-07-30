package cn.entelechy.dao;

import cn.entelechy.entities.Factory;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FactoryMapper {
    public void addFactory(Factory factory);
}
