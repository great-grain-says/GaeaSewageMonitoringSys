package cn.entelechy.dao;

import cn.entelechy.entities.Monitor_projectType;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Monitor_projectTypeMapper {

    public List<Monitor_projectType> getmonitor_projectTypelist(@Param("id")String id,@Param("mid")String mid);
}
