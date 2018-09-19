## 说明

当前 Demo 由 4 个项目构成：

* Eureka Server

* Eureka Client (Ribbon)

* Eureka Client (hello service)

* Eureka Client (hi service)

目前实现功能：

* Eureka 服务注册与发现

* Ribbon 结合 RestTemplate，根据 application.name(即 serviceId) 做自动路由，及负载均衡(需同一个 service 启动多个实例测试)

* Hystrix 做服务超时熔断，并实现自定义超时时间

## 更新记录

#### 0. 2018.09.19

* 服务注册与发现

* 负载均衡及熔断功能

* 熔断超时设置
