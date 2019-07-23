package cn.entelechy.controller;


import cn.entelechy.entities.City;
import cn.entelechy.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class Citycontroller {
    @Autowired
    private CityService cityService;

    @RequestMapping(value = "/city/list/{id}", method = RequestMethod.GET)
    public Object getAll(@PathVariable("id") Integer id) throws RuntimeException {
        System.out.println("====================================");
        List<City> list = null;
        list = cityService.getCityList(id);
        if (null == list) {
            throw new RuntimeException("没有没有对应的信息!" + list);
        }
      //  ModelAndView view =new ModelAndView("index");
        return list;
    }

}
