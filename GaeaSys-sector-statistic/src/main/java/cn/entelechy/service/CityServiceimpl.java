package cn.entelechy.service;

import cn.entelechy.dao.CityMapper;
import cn.entelechy.entities.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceimpl implements CityService {
    @Autowired
    private CityMapper cityMapper;

    //查询所有市区
   public List<City> getCityList(){
        return cityMapper.getCity();
    }

    //按条件id来查询指定市区
    @Override
    public City getCityList(Integer id) {
        return cityMapper.getCity(id);
    }


}
