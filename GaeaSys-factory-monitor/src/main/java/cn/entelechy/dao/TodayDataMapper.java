package cn.entelechy.dao;

import cn.entelechy.entities.Monitor_projectData_today;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TodayDataMapper {
    public void addMonitor(Monitor_projectData_today dataToday);
}
