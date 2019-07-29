package cn.entelechy.service;

import cn.entelechy.dao.CityMapper;
import cn.entelechy.entities.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityServiceimpl implements CityService {
    @Autowired
    private CityMapper cityMapper;
    //按条件id来查询所有市区
    @Override
    public City getCityList(Integer id) {
        return cityMapper.getCity(id);
    }


}