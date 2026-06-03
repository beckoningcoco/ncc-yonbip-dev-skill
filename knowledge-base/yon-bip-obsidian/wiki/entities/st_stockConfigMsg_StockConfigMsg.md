---
tags: [BIP, metadata, st, StockConfigMsg]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 库存配置信息 (st.stockConfigMsg.StockConfigMsg)

> Platform: BIP V5 | Module: st | Table: stock_config_msg | Schema: ustock

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 库存配置信息 |
| uri | st.stockConfigMsg.StockConfigMsg |
| tableName | stock_config_msg |
| domain | ustock |
| applicationCode | ST |
| superUri | base.entity.BizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (1)

| # | Name | URI |
|---|------|-----|
| 1 | 统一租户接口(扩展) (IYTenantExt) | ucfbase.ucfbaseItf.IYTenantExt |

---

## All Fields (6)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | code | 配置编码 | code | text | String |  |  | nullable |
| 2 | createDate | 创建日期 | create_date | date | Date |  |  | nullable |
| 3 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 4 | msg | 配置信息 | msg | text | String |  |  | nullable |
| 5 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | nullable,isSyncKey |
| 6 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (1)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |

---

## Date Fields (1)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | createDate | 创建日期 | create_date | date |
