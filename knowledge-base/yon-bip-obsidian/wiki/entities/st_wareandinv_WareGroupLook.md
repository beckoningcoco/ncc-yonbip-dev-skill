---
tags: [BIP, metadata, st, WareGroupLook]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 仓库组目录 (st.wareandinv.WareGroupLook)

> Platform: BIP V5 | Module: st | Table: st_waregrouplook | Schema: ustock

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 仓库组目录 |
| uri | st.wareandinv.WareGroupLook |
| tableName | st_waregrouplook |
| domain | ustock |
| schema | `ustock` |
| applicationCode | ST |
| superUri | archive.base.TenantArchive |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (3)

| # | Name | URI |
|---|------|-----|
| 1 | 树型结构 (ITree) | base.itf.ITree |
| 2 | 租户相关 (ITenant) | base.itf.ITenant |
| 3 | 统一租户接口(扩展) (IYTenantExt) | ucfbase.ucfbaseItf.IYTenantExt |

---

## All Fields (13)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 2 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 3 | warehouseGroupId | 仓库组id | warehousegroup_id | long | Long |  |  | nullable |
| 4 | mapstyle | 分配方式 | mapstyle | text | String |  |  | nullable |
| 5 | code | 编码 | code | text | String |  |  | BUSINESSMESSAGE,CODE,extintable,isBusinessLog,isCode,jointUnique,logsManagement,testtemplates1 |
| 6 | isEnd | 是否末级 | isEnd | switch | Boolean |  |  | nullable |
| 7 | level | 层级 | level | int | Integer |  |  | nullable |
| 8 | name | 名称 | name | text | String |  |  | 216-2,bom,isName,NAME,REF.NAME |
| 9 | parent | 上级分类 | parent_id | long | Long |  |  | nullable |
| 10 | path | 路径 | path | text | String |  |  | nullable |
| 11 | sort | 排序号 | sort_num | int | Integer |  |  | nullable |
| 12 | tenant | 租户 | tenant_id | quote | base.tenant.Tenant | Y | Y | nullable,TENANTID |
| 13 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (2)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | tenant | 租户 | tenant_id | base.tenant.Tenant |
| 2 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |

---

## Number Fields (2)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | level | 层级 | level | int |
| 2 | sort | 排序号 | sort_num | int |
