---
tags: [BIP, metadata, st, StoreNoticeLog]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 入库通知单物流信息子表 (st.storenotice.StoreNoticeLog)

> Platform: BIP V5 | Module: st | Table: st_storenotice_log | Schema: ustock

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 入库通知单物流信息子表 |
| uri | st.storenotice.StoreNoticeLog |
| tableName | st_storenotice_log |
| domain | ustock |
| schema | `ustock` |
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

## All Fields (7)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | mainid | 主表id | imainid | quote | st.storenotice.StoreNotice |  |  | nullable |
| 2 | company | 物流公司 | icorpid | quote | aa.deliverycorp.Deliverycorp |  |  | nullable |
| 3 | billno | 物流单号 | cbillno | text | String |  |  | nullable |
| 4 | mobileNo | 手机号 | cmobileNo | text | String |  |  | nullable |
| 5 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 6 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 7 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (3)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | mainid | 主表id | imainid | st.storenotice.StoreNotice |
| 2 | company | 物流公司 | icorpid | aa.deliverycorp.Deliverycorp |
| 3 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
