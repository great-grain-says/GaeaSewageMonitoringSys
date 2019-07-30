package cn.entelechy.service;

import cn.entelechy.entities.City;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
@FeignClient(value = "SECTOR-STATISTIC",fallbackFactory = sectorStatisticClientServiceFallbackFactory.class)
public interface sectorStatisticClientService {
    @RequestMapping(value = "/city/list/{id}")
     City getAll(@PathVariable("id") Integer id);

    @RequestMapping(value = "/city/list")
    Object getAll();
}
