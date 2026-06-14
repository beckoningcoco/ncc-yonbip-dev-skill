---
tags: [BIP, metadata, st, OthOutRecordParallel]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 其他出库单主表平行表 (st.othoutrecord.OthOutRecordParallel)

> Platform: BIP V5 | Module: st | Table: st_othoutrecord_parallel | Schema: ustock

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 其他出库单主表平行表 |
| uri | st.othoutrecord.OthOutRecordParallel |
| tableName | st_othoutrecord_parallel |
| domain | ustock |
| schema | `ustock` |
| applicationCode | ST |
| superUri | ? |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (2)

| # | Name | URI |
|---|------|-----|
| 1 | 存货会计事项标识 (FiSplitType) | st.inventoryaccounting.FiSplitType |
| 2 | 统一租户接口(扩展) (IYTenantExt) | ucfbase.ucfbaseItf.IYTenantExt |

---

## All Fields (5)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | fiSplitType | 存货会计事项标识 | fi_split_type | short | Short |  |  | nullable |
| 2 | id | 其他出库单主表id | id | quote | st.othoutrecord.OthOutRecord |  |  | nullable |
| 3 | isConvert | 转换 | isConvert | short | Short |  |  | nullable |
| 4 | signBusinessSource | 业务来源 | sign_business_source | text | String |  |  | nullable |
| 5 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (2)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | id | 其他出库单主表id | id | st.othoutrecord.OthOutRecord |
| 2 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |

---

## Number Fields (2)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | fiSplitType | 存货会计事项标识 | fi_split_type | short |
| 2 | isConvert | 转换 | isConvert | short |
