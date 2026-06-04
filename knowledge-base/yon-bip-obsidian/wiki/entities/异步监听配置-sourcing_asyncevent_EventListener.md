---
tags: ["BIP", "元数据", "数据字典", "ycSouringInquiry", "sourcing.asyncevent.EventListener"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 异步监听配置 (`sourcing.asyncevent.EventListener`)

> ycSouringInquiry | 物理表：`gscm_async_event_listener`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 异步监听配置 |
| 物理表 | `gscm_async_event_listener` |
| 数据库 schema | `yonbip-cpu-sourcing` |
| 所属应用 | `ycSouringInquiry` |
| 构建时间 | `2026-06-04 23:06:26.9320` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（11个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `event_source_code` | 事件来源系统编码 | `event_source_code` | String |
| 2 | `event_type_code` | 事件类型编码 | `event_type_code` | String |
| 3 | `id` | ID | `id` | Long |
| 4 | `is_async` | 是否异步 | `is_async` | Integer |
| 5 | `listener_code` | 监听器编码 | `listener_code` | String |
| 6 | `listener_name` | 监听器名称 | `listener_name` | String |
| 7 | `listener_url` | 监听回调RPC地址 | `listener_url` | String |
| 8 | `listener_weight` | 权重 | `listener_weight` | Integer |
| 9 | `pubts` | 时间戳 | `pubts` | DateTime |
| 10 | `routing_tag` | 路由标签 | `routing_tag` | String |
| 11 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（1个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
