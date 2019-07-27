package cn.entelechy.controller;


import cn.entelechy.entities.City;
import cn.entelechy.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Citycontroller {
    @Autowired
    private CityService cityService;

    @RequestMapping(value = "/city/list/{id}", method = RequestMethod.GET)
    public Object getAll(@PathVariable("id") Integer id) throws RuntimeException {
            System.out.println("===================================="+id);
        City list = null;
        list = cityService.getCityList(id);
        if (null == list) {
            throw new RuntimeException("没有没有对应的信息!" + list);
        }else {
            System.out.println("===================================="+list);
        }

      //  ModelAndView view =new ModelAndView("index");
        return list;
    }

}
