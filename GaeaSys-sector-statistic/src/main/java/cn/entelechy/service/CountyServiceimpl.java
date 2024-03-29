package cn.entelechy.service;

import cn.entelechy.dao.CountyMapper;
import cn.entelechy.entities.County;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountyServiceimpl implements CountyService{

    @Autowired
    private CountyMapper CountyMapper;

    //按条件id来查询所有地区
    @Override
    public List<County> getCityList(Integer id){
        return CountyMapper.getCounty(id);
    }
}
