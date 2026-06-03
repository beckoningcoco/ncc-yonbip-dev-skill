---
tags: [BIP, metadata, voucher, EventListener]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 异步监听配置 (voucher.asyncevent.EventListener)

> Platform: BIP V5 | Module: voucher | Table: gscm_async_event_listener | Schema: udinghuo

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 异步监听配置 |
| uri | voucher.asyncevent.EventListener |
| tableName | gscm_async_event_listener |
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

## All Fields (11)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | event_source_code | 事件来源系统编码 | event_source_code | text | String |  |  | nullable |
| 2 | event_type_code | 事件类型编码 | event_type_code | text | String |  |  | nullable |
| 3 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 4 | is_async | 是否异步 | is_async | int | Integer |  |  | nullable |
| 5 | listener_code | 监听器编码 | listener_code | text | String |  |  | nullable |
| 6 | listener_name | 监听器名称 | listener_name | text | String |  |  | nullable |
| 7 | listener_url | 监听回调RPC地址 | listener_url | text | String |  |  | nullable |
| 8 | listener_weight | 权重 | listener_weight | int | Integer |  |  | nullable |
| 9 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 10 | routing_tag | 路由标签 | routing_tag | text | String |  |  | nullable |
| 11 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (1)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
