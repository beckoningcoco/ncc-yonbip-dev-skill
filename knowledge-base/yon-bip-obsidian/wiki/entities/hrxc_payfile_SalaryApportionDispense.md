---
tags: [BIP, metadata, hrxc, SalaryApportionDispense]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 薪资分摊发放单关联 (hrxc.payfile.SalaryApportionDispense)

> Platform: BIP V5 | Table: wa_salary_apportion_dispense | Schema: yonbip-hr-paybiz

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 薪资分摊发放单关联 |
| uri | hrxc.payfile.SalaryApportionDispense |
| tableName | wa_salary_apportion_dispense |
| domain | yonbip-hr-paybiz |
| applicationCode | HRXZHS_MDD |
| superUri | base.entity.BizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | ID |

## Suppliers (3)

| # | Name | URI |
|---|------|-----|
| 1 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |
| 2 | 审计信息 (IAuditInfo) | ucfbase.ucfbaseItf.IAuditInfo |
| 3 | 逻辑删除相关 (LogicDelete) | ucfbase.ucfbaseItf.LogicDelete |

---

## All Fields (13)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | payfileId | 薪资发放单主键 | PAYFILE_ID | quote | hrxc.payfile.WaPayfile |  |  | nullable |
| 2 | typeId | 分摊类型主键 | TYPE_ID | text | String |  |  | nullable |
| 3 | busiDate | 来源业务日期 | busi_date | timestamp | Timestamp |  |  | nullable |
| 4 | dispense | -1: 会计平台已接收(与会计平台一致),1:凭证生成成功 | DISPENSE | int | Integer |  |  | nullable |
| 5 | id | 主键 | ID | text | String |  |  | nullable,REF.ID |
| 6 | dr | 逻辑删除标识 | DR | int | Integer |  | Y | nullable,uiHide,notGenerate |
| 7 | pubts | 时间戳 | TS | timestamp | Timestamp |  |  | nullable,isSyncKey |
| 8 | ytenant | 租户主键 | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 9 | creator | 创建人 | CREATOR | quote | hred.staff.Staff |  |  | nullable |
| 10 | createTime | 创建时间 | CREATIONTIME | timestamp | Timestamp |  |  | nullable |
| 11 | modifier | 修改人 | MODIFIER | quote | hred.staff.Staff |  |  | nullable |
| 12 | modifyTime | 修改时间 | MODIFIEDTIME | timestamp | Timestamp |  |  | nullable |
| 13 | tenant | 租户主键(旧) | TENANTID | text | String |  |  | nullable |

---

## Reference Fields (4)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | payfileId | 薪资发放单主键 | PAYFILE_ID | hrxc.payfile.WaPayfile |
| 2 | ytenant | 租户主键 | ytenant_id | yht.tenant.YhtTenant |
| 3 | creator | 创建人 | CREATOR | hred.staff.Staff |
| 4 | modifier | 修改人 | MODIFIER | hred.staff.Staff |
