package cn.entelechy.controller;

import cn.entelechy.entities.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import cn.entelechy.service.sectorStatisticClientService;

import java.util.List;

@RestController
public class sectorStatisticController_Consumer {
    @Autowired
    private sectorStatisticClientService service;
    @RequestMapping(value = "/consumer/city/list/{id}")
    public List<City> getALl(@PathVariable("id") Integer id){
      return this.service.getAll(id);
    }
}
