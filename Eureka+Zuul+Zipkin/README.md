## 说明

当前 Demo 在 [Eureka+Zuul Demo](https://github.com/PriestTomb/Spring-Cloud-Demo/tree/master/Eureka+Zuul) 的基础上改动，由 4 个项目构成：

* Eureka Server

* Eureka Client (Zuul + Zipkin Client)

* Eureka Client (hello service + Zipkin Client)

* Eureka Client (hi service + Zipkin Client)

额外程序：

* Zipkin Server （现版本已独立成可运行 jar 包）

目前实现功能：

* Sleuth + Zipkin 客户端收集数据，Zipkin 服务端提供 UI 页面(默认9411端口)辅助查询和跟踪调用链

## 更新记录

#### 0. 2018.11.01

* 引入 Sleuth 和 Zipkin 实现分布式服务中的调用链跟踪
