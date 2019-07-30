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
    private sectorStatisticClientService sectorStatisticClientService;

    @RequestMapping(value = "/consumer/city/list/{id}")
    public City getAll(@PathVariable("id") Integer id) {
        return this.sectorStatisticClientService.getAll(id);
    }

    @RequestMapping(value = "/consumer/city/list")
    public Object getAll() {
        return this.sectorStatisticClientService.getAll();
    }
}
