---
tags: [BIP, metadata, voucher, EventRecord]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 异步事件记录 (voucher.asyncevent.EventRecord)

> Platform: BIP V5 | Module: voucher | Table: gscm_async_event | Schema: udinghuo

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 异步事件记录 |
| uri | voucher.asyncevent.EventRecord |
| tableName | gscm_async_event |
| domain | udinghuo |
| applicationCode | SCMSA |
| superUri | base.entity.BizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (1)

| # | Name | URI |
|---|------|-----|
| 1 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |

---

## All Fields (20)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | bill_code | 单据code | bill_code | text | String |  |  | nullable |
| 2 | bill_id | 单据id | bill_id | text | String |  |  | nullable |
| 3 | billnumber | 单据编码 | billnumber | text | String |  |  | nullable |
| 4 | create_time | 创建时间 | create_time | timestamp | Timestamp |  |  | nullable |
| 5 | event_source_code | 事件来源系统编码 | event_source_code | text | String |  |  | nullable |
| 6 | event_type_code | 事件类型编码 | event_type_code | text | String |  |  | nullable |
| 7 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 8 | is_async | 是否异步 | is_async | int | Integer |  |  | nullable |
| 9 | last_send_time | 最后发送时间 | last_send_time | timestamp | Timestamp |  |  | nullable |
| 10 | last_status | 状态 | last_status | text | String |  |  | nullable |
| 11 | listener_code | 监听器编码 | listener_code | text | String |  |  | nullable |
| 12 | listener_name | 监听器名称 | listener_name | text | String |  |  | nullable |
| 13 | listener_url | 监听回调RPC地址 | listener_url | text | String |  |  | nullable |
| 14 | listener_weight | 权重 | listener_weight | int | Integer |  |  | nullable |
| 15 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 16 | retry_count | 重试次数 | retry_count | int | Integer |  |  | nullable |
| 17 | routing_tag | 路由标签 | routing_tag | text | String |  |  | nullable |
| 18 | user_object | 数据对象 | user_object | text | String |  |  | nullable |
| 19 | uuid | 事件来源系统编码 | uuid | text | String |  |  | nullable |
| 20 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (1)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
