package cn.entelechy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import cn.entelechy.service.factoryAnalysisClientService;

@RestController
public class factoryAnalysisController_Consumer {
    @Autowired
    private factoryAnalysisClientService service;

//    @RequestMapping(value = "/consumer/dept/list")
//    public List<Dept> list()
//    {
//        return this.service.list();
//    }
}
