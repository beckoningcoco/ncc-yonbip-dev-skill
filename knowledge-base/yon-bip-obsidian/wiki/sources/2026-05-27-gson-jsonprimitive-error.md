---
tags: [启动报错, Gson, JsonPrimitive, yms_config.json, 技术中台, 问题处理]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-gson-jsonprimitive-error.md]
---

# Expected JsonObject but was JsonPrimitive 报错

> 启动时生成有问题的 yms_config.json 导致 Gson 解析报错。

## 原因

每次启动生成的 `yms_config.json` 文件内容异常（Gson 期望 Object 但收到 Primitive 类型）。

## 解决方案

配置文件中地址配置错误 — 应该配置**技术中台**的地址，而非**业务中台**的地址。修改 YDS 配置中的注册中心 URL 即可。

## 关键概念

- [[Gson 解析错误]]
- [[yms_config.json]]
- [[技术中台地址]]
