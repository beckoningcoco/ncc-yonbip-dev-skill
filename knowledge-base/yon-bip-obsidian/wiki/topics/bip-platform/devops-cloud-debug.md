---
title: "DevOps 云上调试（云机一体）"
type: reference
source: "iuap-DevOps云上调试红皮书 (28页)"
tags: ["BIP", "旗舰版", "DevOps", "调试", "云机一体", "Hubble"]
created: 2026-06-01
---

# DevOps 云上调试

## 前提条件

- 集成 `middleware 5.3.2-RELEASE`+ 或 MDD 3.0.8+
- 使用注册中心
- 集成 Hubble

## 方法一：直接从类启动

### 1. 设置调试标识

```
VM Options: -Dapp.version=你的手机号
```

注册中心将以该版本号注册，该标识符也是调试流量的路由 key。

### 2. Cookie 自动植入

访问 `https://bip-test.yyuap.com/version.html`，填入与上面一致的标识值，浏览器自动携带调试 cookie。

### 3. Hubble Agent（REST 多人联调）

```bash
-javaagent:/path/to/apm-agent-2.1.2-RELEASE.jar=httpTransformer.enhances.add=\
com.yonyou.cloud.apm.agent.transformer.mysql.MysqlPreparedStatementEnhance,\
com.yonyou.cloud.apm.agent.transformer.mysql.MysqlStatementEnhance,\
com.yonyou.cloud.apm.agent.transformer.enhance.RedisEnhance
```

> RPC 服务不需要此选项。不调用其他本地调试服务也不需要。

## 方法二：Maven 插件启动

pom.xml 增加 `<openOperationGuide>true</openOperationGuide>`，通过 yms-module 插件启动，自动完成标识设置和 cookie 植入。

## 验证注册

```bash
curl "https://developer.yonyoucloud.com/governance/registry/getInstanceIportByCode?\
appCode=微服务code&env=test"
```

确认本地 IP 在列表中，版本号与设置标识符一致。

## 流水线关联

检查 `spring.application.name` 与流水线应用编码匹配。不匹配时：流水线 → 测试环境 → 应用配置 → 关联微服务。

也可通过 API 验证：
```
https://developer.yonyoucloud.com/confcenter/api/v1/appstreamline/findMicroServ?\
streamLineCode=应用编码&streamLineProfile=online
```
