## 说明

当前 Demo 由 4 个项目构成：

* Eureka Server

* Eureka Client (Zuul)

* Eureka Client (hello service)

* Eureka Client (hi service)

目前实现功能：

* Eureka 服务注册与发现

* Zuul 根据 application.name(即 serviceId) 做自动路由，及负载均衡(需同一个 service 启动多个实例测试)

* 自定义一个简单的 (pre)Filter

* 使用 FallbackProvider 实现服务的超时熔断，并实现自定义超时时间

## 更新记录

#### 0. 2018.09.14

* 服务注册与发现

* 负载均衡及熔断功能

* 自定义过滤器

#### 1. 2018.09.19

* hello service 新增 why 方法

* hello service 中 hello 及 why 方法新增睡眠时间，模拟超时

* application.yml 新增熔断超时设置
