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
    @Override
    public List<City> getCityList(Integer id) {
        return cityMapper.getCityList(id);
    }


}
