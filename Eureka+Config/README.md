## 说明

当前 Demo 由 3 个项目构成：

* Eureka Server

* Eureka Client (Config Server)

* Eureka Client (Config Client)

目前实现功能：

* Eureka 服务注册与发现

* Config Server 将配置放在本地

* Config Client 中使用的配置交由 Config Server 管理，并在代码中获取配置在 Server 端的值

* Config Client 引入 actuator 模块，启用 /actuator/refresh 端点，实现不重启刷新

* Config Server 引入 security 模块，使用 RSA 加密数据

## 更新记录

#### 0. 2018.09.20

* 服务注册与发现

* 使用 Config 管理配置

#### 1. 2018.09.21

* 设置刷新服务，配置有更新后，向客户端 /actuator/refresh 端点 POST 请求即可

* 使用非对称加密对数据进行加密，这里是用 keytool 生成了 jks 文件，Config Server 新增 encrypt.keyStore 相关配置即可【注意，需要把配置放在 bootstrap.yml 中，而不是 application.yml 中

* 引入 security 但在配置中排除 `SecurityAutoConfiguration` 类，否则因为需要登录验证而不方便测试加密、解密相关请求

#### 2. 2018.09.25

* 将 `exclude = {SecurityAutoConfiguration.class}` 配置放到 `@SpringBootApplication` 注解中，删除重复的 `@EnableAutoConfiguration` 注解（官方建议这两个注解不要同时存在）
