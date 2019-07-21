package cn.entelechy.service;

import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(value = "FACTORY-ANALYSIS",fallbackFactory = factoryAnalysisClientServiceFallbackFactory.class)
public interface factoryAnalysisClientService {
//    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
//    public List<Dept> list();
}
