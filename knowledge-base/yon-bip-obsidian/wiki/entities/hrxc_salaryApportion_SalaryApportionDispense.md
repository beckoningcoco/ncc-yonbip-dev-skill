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

# 薪资分摊已分摊主表 (hrxc.salaryApportion.SalaryApportionDispense)

> Platform: BIP V5 | Table: wa_salary_apportion_dispense | Schema: yonbip-hr-paybiz

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 薪资分摊已分摊主表 |
| uri | hrxc.salaryApportion.SalaryApportionDispense |
| tableName | wa_salary_apportion_dispense |
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

## All Fields (24)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | payfileId | 薪资发放单主键 | PAYFILE_ID | quote | hrxc.payfile.WaPayfile |  |  | nullable |
| 2 | typeId | 分摊类型主键 | TYPE_ID | quote | hrxc.salaryApportion.SalaryApportionType |  |  | nullable |
| 3 | busiDate | 来源业务日期 | busi_date | timestamp | Timestamp |  |  | nullable |
| 4 | pkWaScheme | 薪资方案 | pk_wa_scheme_id | quote | hrxc.scheme.WaScheme |  |  | nullable |
| 5 | dispense | -1: 会计平台已接收(与会计平台一致),1:凭证生成成功 | DISPENSE | int | Integer |  |  | nullable |
| 6 | isOpenApiQuery |  0-未被OpenApi查询 1-被OpenApi查询 | is_open_api_query | text | String |  |  | nullable |
| 7 | standardWorkType | 标准工时 0:日历天数,1:应出勤天数,2:工作日天数。3:计薪日天数,4:周工作日天数,5:固定天数 | standard_work_type | int | Integer |  |  | nullable |
| 8 | personType | 0:主职及兼职人员,1:主职人员,2:兼职人员 | person_type | int | Integer |  |  | nullable |
| 9 | workDay | 固定天数及周工作日天数使用 | work_day | number | Decimal |  |  | nullable |
| 10 | postStatus | 过账状态 99: 未过账,1:过帐中,2:过账失败 | post_status | int | Integer |  |  | nullable |
| 11 | source | 来源 0:标品 1:客开 | source | int | Integer |  |  | nullable |
| 12 | id | 主键 | ID | text | String |  |  | nullable,REF.ID |
| 13 | dr | 逻辑删除标识 | DR | int | Integer |  | Y | nullable,uiHide,notGenerate |
| 14 | pubts | 时间戳 | TS | timestamp | Timestamp |  |  | nullable,isSyncKey |
| 15 | ytenant | 租户主键 | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 16 | creator | 创建人 | CREATOR | quote | hred.staff.Staff |  |  | nullable |
| 17 | createTime | 创建时间 | CREATIONTIME | timestamp | Timestamp |  |  | nullable |
| 18 | modifier | 修改人 | MODIFIER | quote | hred.staff.Staff |  |  | nullable |
| 19 | modifyTime | 修改时间 | MODIFIEDTIME | timestamp | Timestamp |  |  | nullable |
| 20 | tenant | 租户ID | TENANTID | text | String |  | Y | nullable,uiHide |
| 21 | apportionTaskId | 分摊任务id | apportion_task_id | quote | hrxc.salaryApportion.ApportionTask |  |  | nullable |
| 22 | reportType | 1、人员明细 2、财务过账明细 | report_type | int | Integer |  |  | nullable |
| 23 | salaryApportionAffectDetails | 薪资分摊影响因素详情表 | - | - | hrxc.salaryApportion.SalaryApportionAffectDetail |  |  |  |
| 24 | salaryApportionDetails | 薪资分摊明细表 | - | - | hrxc.salaryApportion.SalaryApportionDetail |  |  |  |

---

## Reference Fields (7)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | payfileId | 薪资发放单主键 | PAYFILE_ID | hrxc.payfile.WaPayfile |
| 2 | typeId | 分摊类型主键 | TYPE_ID | hrxc.salaryApportion.SalaryApportionType |
| 3 | pkWaScheme | 薪资方案 | pk_wa_scheme_id | hrxc.scheme.WaScheme |
| 4 | ytenant | 租户主键 | ytenant_id | yht.tenant.YhtTenant |
| 5 | creator | 创建人 | CREATOR | hred.staff.Staff |
| 6 | modifier | 修改人 | MODIFIER | hred.staff.Staff |
| 7 | apportionTaskId | 分摊任务id | apportion_task_id | hrxc.salaryApportion.ApportionTask |

---

## Child Tables (2)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | salaryApportionAffectDetails | 薪资分摊影响因素详情表 | hrxc.salaryApportion.SalaryApportionAffectDetail |
| 2 | salaryApportionDetails | 薪资分摊明细表 | hrxc.salaryApportion.SalaryApportionDetail |
