---
tags: [问题处理, 启动报错, ServletWebServer, SpringBoot]
created: 2026-05-27
updated: 2026-05-27
sources: [问题处理/Unable-to-start-ServletWebServerApplicationContext]
---

# Unable to start ServletWebServerApplicationContext

> 缺少 `ServletWebServerFactory` bean 导致无法启动。

## 解决

在 bootstrap 模块的 pom.xml 中引入依赖：
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>
```
