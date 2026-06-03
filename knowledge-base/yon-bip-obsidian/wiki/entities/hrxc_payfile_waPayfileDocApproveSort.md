---
tags: [BIP, metadata, hrxc, waPayfileDocApproveSort]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 薪资发放单人员审核依赖 (hrxc.payfile.waPayfileDocApproveSort)

> Platform: BIP V5 | Table: wa_payfile_doc_approve_sort | Schema: yonbip-hr-paybiz

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 薪资发放单人员审核依赖 |
| uri | hrxc.payfile.waPayfileDocApproveSort |
| tableName | wa_payfile_doc_approve_sort |
| domain | yonbip-hr-paybiz |
| applicationCode | HRXZHS_MDD |
| superUri | base.entity.BizObject |
| isBusinessObject | true |
| description | 0 停用 1 启用 |

## Key
| Role | Column |
|------|--------|
| key | ID |

## Suppliers (4)

| # | Name | URI |
|---|------|-----|
| 1 | 启用 (IEnable) | ucfbase.ucfbaseItf.IEnable |
| 2 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |
| 3 | 租户接口 (ITenant) | ucfbase.ucfbaseItf.ITenant |
| 4 | 逻辑删除相关 (LogicDelete) | ucfbase.ucfbaseItf.LogicDelete |

---

## All Fields (19)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | staffId | 人员主键 | STAFF_ID | quote | hred.staff.Staff |  |  | nullable |
| 2 | pkWaPayfile | 发放单主键 | PK_WA_PAYFILE | text | String |  |  | nullable |
| 3 | projectIn | 所得项目 | PROJECT_IN | int | Integer |  |  | nullable |
| 4 | dependPayfileId | 依赖的发放单主键 | DEPEND_PAYFILE_ID | text | String |  |  | nullable |
| 5 | dependApproveSortId | 依赖审批主键 | DEPEND_APPROVE_SORT_ID | text | String |  |  | nullable |
| 6 | id | 主键 | ID | text | String |  |  | nullable,REF.ID |
| 7 | dr | 逻辑删除标识 | DR | int | Integer |  | Y | nullable,uiHide,notGenerate |
| 8 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | nullable,isSyncKey |
| 9 | ytenant | 租户主键 | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 10 | creator | 创建人 | CREATOR | quote | hred.staff.Staff |  |  | nullable |
| 11 | createTime | 创建时间 | CREATIONTIME | timestamp | Timestamp |  |  | nullable |
| 12 | modifier | 修改人 | MODIFIER | quote | hred.staff.Staff |  |  | nullable |
| 13 | modifyTime | 修改时间 | MODIFIEDTIME | timestamp | Timestamp |  |  | nullable |
| 14 | enable | 启用 | enable | singleOption | bd.systemEnum.sys_intboolean |  |  | nullable,uiDesign |
| 15 | enablets | 启用时间 | enablets | dateTime | Timestamp |  |  | nullable |
| 16 | disablets | 停用时间 | disablets | dateTime | Timestamp |  |  | nullable |
| 17 | ts | 时间戳(旧) | TS | timestamp | Timestamp |  |  | nullable |
| 18 | ytenantId | 租户主键(薪酬) | YENANT_ID | text | String |  |  | nullable |
| 19 | tenant | 租户主键(旧) | TENANTID | text | String |  | Y | nullable,uiHide |

---

## Reference Fields (4)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | staffId | 人员主键 | STAFF_ID | hred.staff.Staff |
| 2 | ytenant | 租户主键 | ytenant_id | yht.tenant.YhtTenant |
| 3 | creator | 创建人 | CREATOR | hred.staff.Staff |
| 4 | modifier | 修改人 | MODIFIER | hred.staff.Staff |

---

## Enum Fields (1)

| # | name | displayName | columnName | enumType |
|---|------|-------------|------------|----------|
| 1 | enable | 启用 | enable | bd.systemEnum.sys_intboolean |

---

## Enum Value Details

### 启用 (enable) -> enable
> Enum: bd.systemEnum.sys_intboolean

| code | value | name |
|------|-------|------|
| 0 | 0 | 停用 |
| 1 | 1 | 启用 |
