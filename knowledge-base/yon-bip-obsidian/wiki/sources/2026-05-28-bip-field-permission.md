---
title: 字段权限开发
source: https://c2.yonyoucloud.com/iuap-hc-client/ucf-wh/client/index.html#/detail/ZDQXKK11
date: 2025-04-27
ingested: 2026-05-28
tags: [权限, 字段权限, 低代码, 敏感字段]
images: 10
image_paths: []
---

# 字段权限开发

> 在低代码应用中让自建单据支持字段权限控制：读写/只读/无权/禁止四种级别。

## 适用场景

仅私有云/专属云的客户化定制和 ISV 生态开发。

## 四种字段权限

| 权限 | 效果 | auth_level |
|------|------|------------|
| 读写 | 可见可编辑 | 9 |
| 只读 | 可见但置灰 | 5 |
| 无权 | 不可见 | 0 |
| 禁止 | 不可见（最高优先级） | -1 |

**优先级**：禁止 > 读写 > 只读 > 无权

## 快速上手

1. 应用构建 → 业务对象 → 场景支持 → 勾选"字段权限"
2. 角色管理 → 配置字段权限
3. 角色授权给用户
4. 清理缓存（对象建模右侧按钮，多点几次）

## 租户开启字段权限

- 公有云：联系集团老师
- 私有化：访问 `${域名}/mdf-node/platform/api-function-search?locale=zh_CN&domainKey=u8c-auth` → 问题排查 → 字段权限 → 开启

## 技术原理

- 配置存储在 `iuap_apcom_auth.ba_fieldauth` 表
- Redis 缓存字段权限树
- 大前端每次展示页面时查询字段权限，控制字段显隐
- 核心服务：`FieldAuthBizServiceImpl#queryFieldAuthByServiceCode`
- 前端可调用权限服务 API 自主控制字段显隐

## 与其他文档关联

- [[2026-05-28-bip-auth-management]] — 权限管理总览
