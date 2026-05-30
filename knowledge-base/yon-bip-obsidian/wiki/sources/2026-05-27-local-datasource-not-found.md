---
tags: [本地启动, 数据源, yms-home, Redis, yms_middleware.json, 问题处理]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-local-datasource-not-found.md]
---

# 本地启动找不到数据源或连接不到数据源

> 本地启动项目时报找不到数据源、连接不到数据源或 ConnectionTimeOut 错误。

## 排查步骤

1. **检查 yms-home 文件夹**：启动时生成的 `yms_middleware.json` 中 Redis 和 URL 配置的 IP 可能不正确，找运维确认正确的 IP
2. **修改方式**：在原文件上直接修改可能不生效（重启自动覆盖），需将文件转移到相应文件夹后再修改
3. **Git 工程名不能带括号**：带括号会导致启动报 ConnectionTimeOut

## 关键概念

- [[yms-home]]
- [[yms_middleware.json]]
- [[数据源配置]]
