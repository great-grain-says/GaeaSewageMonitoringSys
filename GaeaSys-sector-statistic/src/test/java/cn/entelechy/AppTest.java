package cn.entelechy;

import cn.entelechy.entities.*;
import cn.entelechy.entities.City;
import cn.entelechy.entities.County;
import cn.entelechy.entities.Factory;
import cn.entelechy.entities.Sewage_treatment_area;
import cn.entelechy.Instrument.*;
import cn.entelechy.service.*;
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

    //市区区
    @Autowired
    private CityService cityService;
    //地区
    @Autowired
    private CountyService countyService;
    //工厂
    @Autowired
    private FactoryService factoryService ;
   //污水处理地区
    @Autowired
    private Sewage_treatment_areaService sewage_treatment_areaService ;
    //工厂排放源头
    @Autowired
    private Emission_sourcesService emission_sourcesService;
    //监测项目数据
    @Autowired
    private Monitor_projectDataService monitor_projectDataService;
    //监测污染物类型
    @Autowired
    private Monitor_projectTypeService monitorProjectTypeService;


    private SewageInstrument sewageI;
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shoulcounAnswerWithTrue()
    {
        City city = cityService.getCityList(2);
        List<County> county=countyService.getCityList(city.getCity_id());
        for (County coun : county) {
            List<Factory> factory=factoryService.getfactorylist(coun.getCounty_id());
            System.out.println(city.getCity_name()+coun.getCounty_name()+"下的");
            for (Factory fac : factory) {
                System.out.println(fac.getFactory_name()+"下的");
                List<Sewage_treatment_area> sewage_treatment_areas=sewage_treatment_areaService.getsewage_treatment_arealist(fac.getFactory_id());
                for (Sewage_treatment_area sewag : sewage_treatment_areas) {
                    sewageI=new SewageInstrument();
                    System.out.println(sewag.getSewage_treatment_area_code1());
                    System.out.println(sewageI.sewageint(sewag.getSewage_treatment_area_code1()));
                    System.out.println("备注"+sewag.getSewage_treatment_area_desc());
                }

                List<Emission_sources> emission_sources=emission_sourcesService.getemission_sourceslist(fac.getFactory_id());
               /* for (Emission_sources Emission : emission_sources) {
                    System.out.println("和"+Emission.getEmission_sources_desc());
                    List<Monitor_projectData> monitor_projectData=monitor_projectDataService.getmonitor_projectDatalist(fac.getFactory_id(),Emission.getEmission_sources_code());
                    for (Monitor_projectData Monitor : monitor_projectData) {
                        System.out.println("下的时间"+Monitor.getMonitor_projectData_date()+"的"+Monitor.getmonitor_projectData_data()+Monitor.getMonitor_projectType_unit()+"测量单位");
                        List<Monitor_projectType> monitor_projectTypes=monitorProjectTypeService.getmonitor_projectTypelist(Monitor.getMonitor_projectType_code(),Monitor.getMonitor_projectType_unit());
                        for (Monitor_projectType projectType : monitor_projectTypes) {
                            System.out.print("的"+projectType.getMonitor_projectType_name());

                        }
                    }
                }*/
            }
        }
    }
}
