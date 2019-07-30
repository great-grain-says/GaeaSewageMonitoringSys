package cn.entelechy.controller;


import cn.entelechy.entities.City;
import cn.entelechy.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Citycontroller {
    @Autowired
    private CityService cityService;

    //无条件获取全部市区
    @RequestMapping(value = "/city/list", method = RequestMethod.GET)
    public Object getAll() {
        List<City> list = null;
        return list = cityService.getCityList();
    }


    //按条件获取指定市区
    @RequestMapping(value = "/city/list/{id}", method = RequestMethod.GET)
    public City getAll(@PathVariable("id") Integer id) {
        System.out.println("====================================" + id);
        City city = cityService.getCityList(id);
        System.out.println("====================================" + city.getCity_name());
        return city;
    }

}
