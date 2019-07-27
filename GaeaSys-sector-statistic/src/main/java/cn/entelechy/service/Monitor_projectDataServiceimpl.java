package cn.entelechy.service;

import cn.entelechy.dao.Monitor_projectDataMapper;
import cn.entelechy.entities.Monitor_projectData;
import cn.entelechy.entities.Province;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.ref.PhantomReference;
import java.util.List;

@Service
public class Monitor_projectDataServiceimpl implements Monitor_projectDataService {
    @Autowired
    private Monitor_projectDataMapper monitor_projectDataMapper;


    //按两个条件id来查询监测项目数据表
    @Override
    public List<Monitor_projectData> getmonitor_projectDatalist(Integer id, String eid){
        return monitor_projectDataMapper.getmonitor_projectDatalist(id,eid);
    }
}
