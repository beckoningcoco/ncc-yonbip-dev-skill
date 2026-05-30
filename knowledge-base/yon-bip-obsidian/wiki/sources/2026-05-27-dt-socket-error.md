---
tags: [启动报错, dt_socket, JDWP, JDK, JRE, 问题处理]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-dt-socket-error.md]
---

# 启动报错: transport library not found dt_socket

> JDWP 传输库初始化失败，JVM 调试端口启动异常。

## 报错

```
ERROR: transport library not found: dt_socket
FATAL ERROR in native method: JDWP No transports initialized
```

## 解决方案

YDS 中两处 JDK 配置必须一致：检查启动配置和全局配置中的 JDK 路径是否相同。

## 关键概念

- [[JDWP]]
- [[dt_socket]]
- [[JDK 配置]]
