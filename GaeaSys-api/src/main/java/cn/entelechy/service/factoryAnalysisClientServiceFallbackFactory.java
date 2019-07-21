package cn.entelechy.service;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component // 不要忘记添加，不要忘记添加
public class factoryAnalysisClientServiceFallbackFactory implements FallbackFactory<factoryAnalysisClientService> {

    @Override
    public factoryAnalysisClientService create(Throwable throwable) {
        return new factoryAnalysisClientService() {
//            @Override
//            public Dept get(long id)
//            {
//                return new Dept().setDeptno(id).setDname("该ID：" + id + "没有没有对应的信息,Consumer客户端提供的降级信息,此刻服务Provider已经关闭")
//                        .setDb_source("no this database in MySQL");
//            }
        };
    }
}
