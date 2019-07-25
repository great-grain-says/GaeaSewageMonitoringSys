package cn.entelechy;

import static org.junit.Assert.assertTrue;

import cn.entelechy.entities.City;
import cn.entelechy.entities.County;
import cn.entelechy.entities.Factory;
import cn.entelechy.service.CityService;
import cn.entelechy.service.CountyService;
import cn.entelechy.service.FactoryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Unit test for simple App.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AppTest 
{
    //市区
    @Autowired
    CityService cityService;

    //地区
    @Autowired
    CountyService CountyService;

    //工厂
    @Autowired
    FactoryService factoryService;
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAenswerWithTrue()
    {
        City list = cityService.getCityList(1);
        County listt=CountyService.getCityList(list.getCity_id());
        List<Factory> flist=factoryService.getfactorylist(list.getCity_id());
        System.out.println(list.getCity_name()+listt.getCounty_name());
        for (Factory ment : flist) {
            System.out.println(ment.getFactory_name());
        }
    }
}
