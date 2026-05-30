---
tags: [启动报错, ServletWebServerFactory, spring-boot-starter-web, pom.xml, 问题处理]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-servletwebserver-factory-missing.md]
---

# 启动报错: Unable to start ServletWebServerApplicationContext

> 缺少 ServletWebServerFactory bean 导致无法启动。

## 报错

```
Unable to start ServletWebServerApplicationContext due to missing ServletWebServerFactory bean.
```

## 解决方案

在 bootstrap 模块的 pom.xml 中引入 Spring Boot Web 依赖：

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>
```

## 关键概念

- [[ServletWebServerFactory]]
- [[spring-boot-starter-web]]
- [[启动报错]]
