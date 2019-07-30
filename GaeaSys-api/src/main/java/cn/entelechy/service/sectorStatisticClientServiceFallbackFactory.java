package cn.entelechy.service;

import cn.entelechy.entities.City;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class sectorStatisticClientServiceFallbackFactory implements FallbackFactory<sectorStatisticClientService> {
    private static final Logger LOGGER = LoggerFactory.getLogger(sectorStatisticClientServiceFallbackFactory.class);
    @Override
    public sectorStatisticClientService create(Throwable throwable) {
        return new sectorStatisticClientService() {
            @Override
            public City getAll(Integer id) {
                // 日志最好放在各个fallback方法中，而不要直接放在create方法中。
                // 否则在引用启动时，就会打印该日志。
                // 详见https://github.com/spring-cloud/spring-cloud-netflix/issues/1471
                sectorStatisticClientServiceFallbackFactory.LOGGER.info("fallback; reason was--+--->:", throwable);
                City city = new City();
                city.setCity_id(-1);
                city.setCity_name("找不到该城市!!!!"+throwable.getLocalizedMessage());
                return city;
            }
            @Override
            public Object getAll() {
                // 日志最好放在各个fallback方法中，而不要直接放在create方法中。
                // 否则在引用启动时，就会打印该日志。
                // 详见https://github.com/spring-cloud/spring-cloud-netflix/issues/1471
                sectorStatisticClientServiceFallbackFactory.LOGGER.info("fallback; reason was--+--->:", throwable);
                Map<String,String> error = new HashMap<>();
                error.put("msg","请求出错");
                error.put("mess",throwable.getLocalizedMessage());
                return error;
            }

        };


    }
}
