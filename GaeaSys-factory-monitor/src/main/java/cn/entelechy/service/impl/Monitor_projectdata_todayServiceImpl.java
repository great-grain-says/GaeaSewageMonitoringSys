package cn.entelechy.service.impl;

import cn.entelechy.dao.Monitor_projectdata_todayMapper;
import cn.entelechy.entities.Monitor_projectData_today;
import cn.entelechy.service.Monitor_projectdata_todayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class Monitor_projectdata_todayServiceImpl implements Monitor_projectdata_todayService {

    @Autowired
    private Monitor_projectdata_todayMapper mapper;

    @Override
    @Async
    public void setData_today(Monitor_projectData_today data_today) {
        mapper.addMonitor(data_today);
    }
}
