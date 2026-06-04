---
tags: ["BIP", "元数据", "数据字典", "ycSouringInquiry", "sourcing.asyncevent.EventRecord"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 异步事件记录 (`sourcing.asyncevent.EventRecord`)

> ycSouringInquiry | 物理表：`gscm_async_event`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 异步事件记录 |
| 物理表 | `gscm_async_event` |
| 数据库 schema | `yonbip-cpu-sourcing` |
| 所属应用 | `ycSouringInquiry` |
| 构建时间 | `2026-06-04 23:06:28.2300` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（21个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `bill_code` | 单据code | `bill_code` | String |
| 2 | `bill_id` | 单据id | `bill_id` | String |
| 3 | `billnumber` | 单据编码 | `billnumber` | String |
| 4 | `create_time` | 创建时间 | `create_time` | DateTime |
| 5 | `event_source_code` | 事件来源系统编码 | `event_source_code` | String |
| 6 | `event_type_code` | 事件类型编码 | `event_type_code` | String |
| 7 | `id` | ID | `id` | Long |
| 8 | `invoke_context` | 上下文信息 | `invoke_context` | String |
| 9 | `is_async` | 是否异步 | `is_async` | Integer |
| 10 | `last_send_time` | 最后发送时间 | `last_send_time` | DateTime |
| 11 | `last_status` | 状态 | `last_status` | String |
| 12 | `listener_code` | 监听器编码 | `listener_code` | String |
| 13 | `listener_name` | 监听器名称 | `listener_name` | String |
| 14 | `listener_url` | 监听回调RPC地址 | `listener_url` | String |
| 15 | `listener_weight` | 权重 | `listener_weight` | Integer |
| 16 | `pubts` | 时间戳 | `pubts` | DateTime |
| 17 | `retry_count` | 重试次数 | `retry_count` | Integer |
| 18 | `routing_tag` | 路由标签 | `routing_tag` | String |
| 19 | `user_object` | 数据对象 | `user_object` | String |
| 20 | `uuid` | 事件来源系统编码 | `uuid` | String |
| 21 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（1个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
