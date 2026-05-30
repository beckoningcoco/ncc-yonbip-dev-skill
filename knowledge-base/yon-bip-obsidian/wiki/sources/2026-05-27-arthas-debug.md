---
tags: [Arthas, 调试, JVM, 在线诊断, 旗舰版]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-arthas-debug.md]
---

# Arthas调试工作台使用

> 使用 Arthas 在线调试 BIP 环境，包括查看 JVM 信息、搜索类、反编译字节码、监控方法入参返回值、跟踪方法调用耗时。

## 核心命令

| 命令 | 用途 |
|------|------|
| `dashboard` | 实时显示 CPU、内存、线程、GC 概览 |
| `sc *ClassName` | 搜索类是否已加载 |
| `jad com.xxx.Service` | 反编译查看实际运行的字节码 |
| `watch com.xxx.Service method '{params, returnObj}' -x 3` | 监控方法入参和返回值 |
| `trace com.xxx.Service method` | 跟踪方法调用耗时 |

## 典型场景

- **线上订单创建失败但无日志**：`watch ... '{params, returnObj, throwExp}' -e -x 3` 捕获异常
- **接口突然变慢**：`trace` 跟踪调用链定位瓶颈
- **确认热部署是否生效**：`jad` 反编译对比本地源码

## 关键概念

- [[Arthas]]
- [[JVM 调优]]
- [[YDS 远程调试]]
