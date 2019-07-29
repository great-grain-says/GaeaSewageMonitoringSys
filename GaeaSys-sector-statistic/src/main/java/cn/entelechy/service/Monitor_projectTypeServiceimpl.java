package cn.entelechy.service;

import cn.entelechy.dao.Monitor_projectTypeMapper;
import cn.entelechy.entities.Monitor_projectType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Monitor_projectTypeServiceimpl implements Monitor_projectTypeService {

    @Autowired
    private Monitor_projectTypeMapper monitor_projectTypeMapper;

    //按两个条件查询监测污染物类型表
    @Override
    public List<Monitor_projectType> getmonitor_projectTypelist(String id,String mid){
        return monitor_projectTypeMapper.getmonitor_projectTypelist(id,mid);
    }
}
