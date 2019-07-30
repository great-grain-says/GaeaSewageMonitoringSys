package cn.entelechy.service;

import cn.entelechy.entities.City;

import java.util.List;

public interface CityService {

    List<City> getCityList();

     City getCityList(Integer id);


}
