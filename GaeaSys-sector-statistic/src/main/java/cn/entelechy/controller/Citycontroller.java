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
    public Object getAll(){
        List<City> list = null;
        return list = cityService.getCityList();
    }



    //按条件获取指定市区
    @RequestMapping(value = "/city/list/{id}", method = RequestMethod.GET)
    public Object getAll(@PathVariable("id") Integer id){
            System.out.println("===================================="+id);
        City list = null;
        list = cityService.getCityList(id);
        if (null == list) {
            System.out.println("=ASasasSas==============="+list.getCity_name());
            //throw new RuntimeException("没有没有对应的信息!" + list);
        }else {
            System.out.println("===================================="+list.getCity_name());
        }

      //  ModelAndView view =new ModelAndView("index");
        return list;
    }

}
