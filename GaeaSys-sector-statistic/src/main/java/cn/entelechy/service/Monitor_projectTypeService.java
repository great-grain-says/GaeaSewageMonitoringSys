package cn.entelechy.service;

import cn.entelechy.entities.Monitor_projectType;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Monitor_projectTypeService {

    public List<Monitor_projectType> getmonitor_projectTypelist(String id,String mid);
}
