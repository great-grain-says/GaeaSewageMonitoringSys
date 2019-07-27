package cn.entelechy.dao;

import cn.entelechy.entities.Monitor_projectData;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Monitor_projectDataMapper {

    public List<Monitor_projectData> getmonitor_projectDatalist(@Param("id") Integer id,@Param("eid")String Eid);
}
