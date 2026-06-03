---
tags: [BIP, metadata, hrxc, SalaryApportionItem]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 薪资分摊项目 (hrxc.salaryApportion.SalaryApportionItem)

> Platform: BIP V5 | Table: wa_salary_apportion_item | Schema: yonbip-hr-paybiz

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 薪资分摊项目 |
| uri | hrxc.salaryApportion.SalaryApportionItem |
| tableName | wa_salary_apportion_item |
| domain | yonbip-hr-paybiz |
| applicationCode | HRXZHS_MDD |
| superUri | base.entity.BizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | ID |

## Suppliers (4)

| # | Name | URI |
|---|------|-----|
| 1 | 租户接口 (ITenant) | ucfbase.ucfbaseItf.ITenant |
| 2 | 审计信息 (IAuditInfo) | ucfbase.ucfbaseItf.IAuditInfo |
| 3 | 逻辑删除相关 (LogicDelete) | ucfbase.ucfbaseItf.LogicDelete |
| 4 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |

---

## All Fields (14)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | itemId | 项目主键 | ITEM_ID | text | String |  |  | nullable |
| 2 | itemCode | 项目code | ITEM_CODE | text | String |  |  | nullable |
| 3 | property | 增减属性 | PROPERTY | text | String |  |  | nullable |
| 4 | typeId | 分摊类型主键 | TYPE_ID | quote | hrxc.salaryApportion.SalaryApportionType |  |  | nullable |
| 5 | itemName | 值 | ITEM_NAME | text | String |  |  | nullable |
| 6 | id | 主键 | ID | text | String |  |  | nullable,REF.ID |
| 7 | pubts | 时间戳 | TS | timestamp | Timestamp |  |  | nullable,isSyncKey |
| 8 | dr | 逻辑删除标识 | DR | int | Integer |  | Y | nullable,uiHide,notGenerate |
| 9 | ytenant | 租户主键 | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 10 | creator | 创建人 | CREATOR | quote | hred.staff.Staff |  |  | nullable |
| 11 | createTime | 创建时间 | CREATIONTIME | timestamp | Timestamp |  |  | nullable |
| 12 | modifier | 修改人 | MODIFIER | quote | hred.staff.Staff |  |  | nullable |
| 13 | modifyTime | 修改时间 | MODIFIEDTIME | timestamp | Timestamp |  |  | nullable |
| 14 | tenant | 租户主键(旧) | TENANTID | text | String |  | Y | nullable,uiHide |

---

## Reference Fields (4)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | typeId | 分摊类型主键 | TYPE_ID | hrxc.salaryApportion.SalaryApportionType |
| 2 | ytenant | 租户主键 | ytenant_id | yht.tenant.YhtTenant |
| 3 | creator | 创建人 | CREATOR | hred.staff.Staff |
| 4 | modifier | 修改人 | MODIFIER | hred.staff.Staff |
