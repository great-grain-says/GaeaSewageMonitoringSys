package cn.entelechy.service.impl;

import cn.entelechy.dao.TodayDataMapper;
import cn.entelechy.entities.Monitor_projectData_today;
import cn.entelechy.service.TodayDataMapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class TodayDataMapperServiceImpl implements TodayDataMapperService {

    @Autowired
    private TodayDataMapper mapper;

    @Override
    @Async
    public void setData_today(Monitor_projectData_today data_today) {
        mapper.addMonitor(data_today);
    }
}
