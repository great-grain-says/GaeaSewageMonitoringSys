package cn.entelechy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AnalysisController {

//    @Autowired
//    private DeptService service;
//    @Autowired
//    private DiscoveryClient client;
//
//    @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
//    public boolean add(@RequestBody Dept dept)
//    {
//        return service.add(dept);
//    }


    @Autowired
    private DiscoveryClient discoveryClient;
    @RequestMapping(value = "/analysis/discovery", method = RequestMethod.GET)
    public Object discovery() {
        List<String> list = discoveryClient.getServices();
        System.out.println("**********" + list);

        List<ServiceInstance> srvList = discoveryClient.getInstances("FACTORY-ANALYSIS");
        for (ServiceInstance element : srvList) {
            System.out.println(element.getServiceId() + "\t" + element.getHost() + "\t" + element.getPort() + "\t"
                    + element.getUri());
        }
        return this.discoveryClient;
    }
}
