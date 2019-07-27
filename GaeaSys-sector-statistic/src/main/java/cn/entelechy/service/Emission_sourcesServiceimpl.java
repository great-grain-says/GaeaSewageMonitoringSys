package cn.entelechy.service;

import cn.entelechy.dao.Emission_sourcesMapper;
import cn.entelechy.entities.Emission_sources;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Emission_sourcesServiceimpl  implements Emission_sourcesService{
    @Autowired
    private Emission_sourcesMapper emission_sourcesMapper;


    //按条件id来查询所有排放源头
    @Override
    public List<Emission_sources> getemission_sourceslist(Integer id){
        return emission_sourcesMapper.getemission_sourceslist(id);
    }
}
