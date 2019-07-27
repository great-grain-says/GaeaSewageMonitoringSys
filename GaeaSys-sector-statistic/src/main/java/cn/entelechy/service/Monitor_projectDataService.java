package cn.entelechy.service;

import cn.entelechy.entities.Monitor_projectData;

import java.util.List;

public interface Monitor_projectDataService {
    public List<Monitor_projectData> getmonitor_projectDatalist(Integer id,String eid);
}
