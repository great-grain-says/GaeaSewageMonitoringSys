package cn.entelechy.service;

import cn.entelechy.dao.FactoryMapper;
import cn.entelechy.entities.Factory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class FactoryServiceimpl implements FactoryService {

    @Autowired
    private FactoryMapper factoryMapper;


    //按条件id来查询所有工厂集合
    @Override
    public List<Factory> getfactorylist(Integer id){
        return factoryMapper.getfactorylist(id);
    }


}
