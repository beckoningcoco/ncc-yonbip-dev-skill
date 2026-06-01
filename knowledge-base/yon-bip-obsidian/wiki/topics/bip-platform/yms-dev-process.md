---
title: "YMS 开发过程与中间件体系"
type: reference
source: "iuap-YMS开发过程红皮书 (V2.0, 2022-06)"
tags: ["BIP", "旗舰版", "YMS", "中间件", "RPC", "IRIS", "部署"]
created: 2026-06-01
---

# YMS 开发过程与中间件体系

> YMS = Yonyou Middleware Service，BIP 后端的 Spring Boot/Cloud 自研微服务框架，提供统一中间件、RPC、配置管理和部署能力。

## 环境体系

| 环境 | 标识 | 说明 |
|------|------|------|
| 日常 | daily | 日常联调 |
| 预发 | pre | 预发布验证 |
| 沙箱 | sandbox | 隔离测试 |
| 生产 | online | 线上环境 |

## 中间件组件

所有中间件配置通过 YMS 控制台发布为 JSON 配置文件，存储到配置中心 `confcenter`，组件通过监听配置变化动态刷新。

### 数据源（YMSDataSource）

- 物理数据源 → 逻辑数据源 → 租户关联，三层映射
- 逻辑数据源管理：按产品编码查询，关联物理数据源
- 租户关系管理：数据中心 → 物理数据源 → schema 映射
- 发布后生成 `yms_dynds.json`，`YMSDataSource` 组件监听变更并刷新连接池
- 配置分组：`yonbip-global-yms`

### Redis

提供 `jedisTemplate` Bean，按名称注入：
```java
@Autowired
@Qualifier("cacheRedisTemplate")
private RedisTemplate redisTemplate;
```
YMS 控制台管理多实例的连接信息，发布为 JSON 配置文件。

### MQ（消息中间件）

统一组件 `iuap-mq-starter.jar`，支持 RabbitMQ、Kafka 等。控制台管理实例和发布配置。

### MongoDB

组件 `iuap-mongo-starter`，控制台管理连接信息和配置发布。

### 日志组件

- 统一日志格式、输出目录、存储策略
- 按模块动态修改输出级别
- 配置文件：`yonbip-global-yms` 下日志配置 JSON
- 支持配置发布历史查看、对比和回滚

### 文件组件

提供统一文件存储服务接入，MinIO/S3 兼容。

## RPC 开发（IRIS 框架）

### 依赖引入

```xml
<dependency>
    <groupId>com.yonyou.cloud.middleware</groupId>
    <artifactId>mwclient</artifactId>
    <type>pom</type>
</dependency>
```

### 配置

```yaml
spring:
  profiles:
    active: dev
  application:
    name: web-test-nysh
  access:
    key: xxxxxxxxxxxxxxx
    secret: xxxxxxxxxxxxxxxxxxxxxx
```

### 三种 RPC 调用方式

**1. @RemoteCall**（服务提供方定义接口）

服务方提供 API 接口 + `@RemoteCall` 注解，调用方 Spring 注入即可。

**2. @IrisReference**（调用方指定提供方）

```java
@IrisReference(serviceName = "target-service")
private WeatherApi weatherApi;
```

**3. RPCBeanFactory**（编程式声明）

```java
@Bean
public RPCBeanFactory rpcBeanFactory() {
    return new RPCBeanFactory("tool-test-nysh",
        Collections.singletonList(WeatherApi.class.getName()));
}
```

### IRIS 插件扩展（拦截链）

四个扩展点，责任链模式：

| 接口 | 位置 | 方向 |
|------|------|------|
| `IBeforeInvoke` | 调用方 RPC 调用之前 | 客户端 |
| `IAfterInvoke` | 调用方 RPC 调用之后 | 客户端 |
| `IBeforeExecute` | 提供方执行之前 | 服务端 |
| `IAfterExecute` | 提供方执行之后 | 服务端 |

示例（添加自定义上下文）：

```java
public class XBizBeforeInvokePlugin implements IBeforeInvoke {
    @Override public String getPluginName() { return this.getClass().getName(); }
    @Override public int order() { return PluginConstants.PLUGIN_START_INDEX + 6; }

    @Override
    public void run(InvokeRequest req, InvokeResponse resp, InvokeChain chain) {
        RPCRequest rpcRequest = req.getRequest(RPCRequest.class);
        RemoteInvocation inv = rpcRequest.getRemoteInvocation();
        inv.addAttribute("ctxCode", "自定义上下文Code");
        inv.addAttribute("bizCode", "自定义其他业务上下文");
        chain.run(req, resp, chain);  // 必须调用 chain.run
    }
}
```

注册插件：`src/main/resources/META-INF/services/com.yonyou.cloud.middleware.iris.IBeforeInvoke`，文件内容为插件全类名。

## 多云适配（TSF）

### 依赖

```xml
<dependency><groupId>com.yonyou.cloud.middleware</groupId>
  <artifactId>middleware-public</artifactId><version>3.5.0-RELEASE</version></dependency>
<dependency><groupId>com.yonyou.cloud.middleware</groupId>
  <artifactId>helix-public</artifactId></dependency>
<dependency><groupId>com.yonyou.iuap</groupId>
  <artifactId>yms-tools</artifactId></dependency>
<dependency><groupId>com.yonyou.cloud.middleware</groupId>
  <artifactId>iris-yms-support</artifactId></dependency>
```

Wing 方式：打包为 war，放入 YMS `modules/wing/` 目录。IRIS 根据 `@MiddlewareDescribe` 的 order 权重加载 Invoker 实现（`IrisInvoker` order=0 为默认，`IrisWingInvoker` order=1 拦截为 Wing 模式）。

## 构建与部署

### fatjar

```bash
mvn clean -Dmaven.test.skip=true yms-module:fatjar
```

### Docker 镜像

pom.xml 配置 `docker-maven-plugin`：
```xml
<plugin>
  <groupId>com.yonyou.iuap.yms</groupId>
  <artifactId>yms-module-maven-plugin</artifactId>
  <configuration>
    <imageName>yms/${project.artifactId}</imageName>
    <dockerHost>http://localhost:2375</dockerHost>
  </configuration>
</plugin>
```

```bash
mvn yms-module:image
docker run --name ymstest -p 8080:8080 yms/master:latest
```

### 本地调试

```bash
mvndebug -Dmw.profiles.active=test yms-module:run
```

## 微服务监控

YMS 控制台支持：
- 注册中心服务列表和实例状态
- 服务注册/注销历史
- Eureka Server 集群状态可视化
- 分布式事务（YTS）异常监控和重试命令下发

## 配置管理

配置项分组按产品维度管理，专属化安装时根据 `environmentgroup` 和配置项 key 填入值，生成最终配置文件。

## 相关文档

- [[mdd-backend]] — MDD 框架运行在 YMS 之上
- [[yts-distributed-tx]] — 分布式事务依赖 YMS 中间件
- [[devops-cloud-debug]] — 云机一体是 YMS 工程的调试方案
- [[ypr-package]] — YPR 出盘依赖 YMS 模块插件
