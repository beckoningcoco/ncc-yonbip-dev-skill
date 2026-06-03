---
tags: [BIP, metadata, st, WareLook]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 仓库目录 (st.wareandinv.WareLook)

> Platform: BIP V5 | Module: st | Table: st_warelook | Schema: ustock

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 仓库目录 |
| uri | st.wareandinv.WareLook |
| tableName | st_warelook |
| domain | ustock |
| applicationCode | ST |
| superUri | archive.base.TenantArchive |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (4)

| # | Name | URI |
|---|------|-----|
| 1 | 树型结构 (ITree) | base.itf.ITree |
| 2 | 租户相关 (ITenant) | base.itf.ITenant |
| 3 | 统一租户接口(扩展) (IYTenantExt) | ucfbase.ucfbaseItf.IYTenantExt |
| 4 | 审计信息 (IAuditInfo) | base.itf.IAuditInfo |

---

## All Fields (22)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 2 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 3 | warehouseId | 仓库id | warehouse_id | quote | aa.warehouse.Warehouse |  |  | dataPowerFlag,data_auth,nullable |
| 4 | mapstyle | 分配方式 | mapstyle | text | String |  |  | nullable |
| 5 | code | 编码 | code | text | String |  |  | jointUnique,extintable,isBusinessLog,CODE,testtemplates1,nullable,isCode,BUSINESSMESSAGE,logsManagement |
| 6 | createDate | 创建日期 | create_date | date | Date |  |  | isBusinessLog,nullable |
| 7 | createTime | 创建时间 | create_time | timestamp | Timestamp |  |  | isBusinessLog,nullable |
| 8 | creator | 创建人名称 | creator | text | String |  |  | isBusinessLog,isGlobalization,nullable |
| 9 | creatorId | 创建人 | creatorId | quote | base.user.User |  |  | BUSINESSMESSAGE,isBusinessLog,nullable |
| 10 | isEnd | 是否末级 | isEnd | switch | Boolean |  |  | nullable |
| 11 | level | 层级 | level | int | Integer |  |  | nullable |
| 12 | modifier | 修改人名称 | modifier | text | String |  |  | isBusinessLog,isGlobalization,nullable |
| 13 | modifierId | 修改人 | modifierId | quote | base.user.User |  |  | BUSINESSMESSAGE,isBusinessLog,nullable |
| 14 | modifyDate | 修改日期 | modify_date | date | Date |  |  | isBusinessLog,nullable |
| 15 | modifyTime | 修改时间 | modify_time | timestamp | Timestamp |  |  | isBusinessLog,nullable |
| 16 | name | 名称 | name | text | String |  |  | 216-2,bom,isName,NAME,REF.NAME |
| 17 | parent | 上级分类 | parent_id | long | Long |  |  | nullable |
| 18 | path | 路径 | path | text | String |  |  | nullable |
| 19 | sort | 排序号 | sort_num | int | Integer |  |  | nullable |
| 20 | tenant | 租户 | tenant_id | quote | base.tenant.Tenant | Y | Y | nullable,TENANTID |
| 21 | wareAndInvs | 仓库物料关系 | - | - | st.wareandinv.WareAndInv |  |  |  |
| 22 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (5)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | warehouseId | 仓库id | warehouse_id | aa.warehouse.Warehouse |
| 2 | creatorId | 创建人 | creatorId | base.user.User |
| 3 | modifierId | 修改人 | modifierId | base.user.User |
| 4 | tenant | 租户 | tenant_id | base.tenant.Tenant |
| 5 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |

---

## Number Fields (2)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | level | 层级 | level | int |
| 2 | sort | 排序号 | sort_num | int |

---

## Date Fields (2)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | createDate | 创建日期 | create_date | date |
| 2 | modifyDate | 修改日期 | modify_date | date |

---

## Child Tables (1)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | wareAndInvs | 仓库物料关系 | st.wareandinv.WareAndInv |
