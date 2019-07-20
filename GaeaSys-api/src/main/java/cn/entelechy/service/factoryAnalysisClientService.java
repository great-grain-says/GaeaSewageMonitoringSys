package cn.entelechy.service;

import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(value = "FACTORY-ANALYSIS")
public interface factoryAnalysisClientService {
//    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
//    public Dept get(@PathVariable("id") long id);
//
//    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
//    public List<Dept> list();
//
//    @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
//    public boolean add(Dept dept);
}
