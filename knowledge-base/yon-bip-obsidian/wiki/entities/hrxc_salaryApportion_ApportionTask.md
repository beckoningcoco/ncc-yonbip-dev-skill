---
tags: [BIP, metadata, hrxc, ApportionTask]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 分摊任务 (hrxc.salaryApportion.ApportionTask)

> Platform: BIP V5 | Table: apportion_task | Schema: yonbip-hr-paybiz

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 分摊任务 |
| uri | hrxc.salaryApportion.ApportionTask |
| tableName | apportion_task |
| domain | yonbip-hr-paybiz |
| applicationCode | HRXZHS_MDD |
| superUri | base.entity.BizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (5)

| # | Name | URI |
|---|------|-----|
| 1 | 逻辑删除相关 (LogicDelete) | ucfbase.ucfbaseItf.LogicDelete |
| 2 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |
| 3 | 审计信息 (IAuditInfo) | ucfbase.ucfbaseItf.IAuditInfo |
| 4 | 自动编码 (IAutoCode) | ucfbase.ucfbaseItf.IAutoCode |
| 5 | 自动编号 (IAutoCode) | voucher.base.IAutoCode |

---

## All Fields (20)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | apportionDispenses | 薪资分摊已分摊主表 | - | - | hrxc.salaryApportion.SalaryApportionDispense |  |  |  |
| 2 | apportionVersionId | 分摊方案版本 | apportion_version_id | quote | hrxc.salaryApportion.ApportionSchemeVersion |  |  | nullable |
| 3 | businessDate | 业务来源日期 | business_date | - | Time |  |  | nullable |
| 4 | code | 编码 | code | text | String |  |  | REF.CODE,CODE,nullable,isCode |
| 5 | createTime | 创建时间 | create_time | dateTime | Timestamp |  |  | nullable |
| 6 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 7 | dataSource | 数据来源 | data_source | text | String |  |  | nullable |
| 8 | dr | 逻辑删除标记 | dr | short | Short |  | Y | notGenerate,nullable,uiHide |
| 9 | id | 主键 | id | long | Long |  |  | nullable,REF.ID |
| 10 | insuranceYearMonth | 社保年月 | insurance_year_month | text | String |  |  | jointUnique,nullable |
| 11 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 12 | modifyTime | 修改时间 | modify_time | dateTime | Timestamp |  |  | nullable |
| 13 | name | 任务名称 | name | multiLanguage | String | Y |  | nullable |
| 14 | orgId | 组织id | org_id | quote | org.func.BaseOrg |  |  | isMasterOrg,nullable |
| 15 | payfileId | 发放单id | payfile_id | quote | hrxc.payfile.WaPayfile |  |  | nullable |
| 16 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 17 | schemeAuthId | 发薪方案授权id | scheme_auth_id | quote | hrxc.scheme.WaSchemeAuth |  |  | nullable |
| 18 | sourceFrom | 来源 | source_from | int | Integer |  |  | nullable |
| 19 | taskStatus | 任务状态 | task_status | int | Integer |  |  | nullable |
| 20 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (7)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | apportionVersionId | 分摊方案版本 | apportion_version_id | hrxc.salaryApportion.ApportionSchemeVersion |
| 2 | creator | 创建人 | creator | base.user.BipUser |
| 3 | modifier | 修改人 | modifier | base.user.BipUser |
| 4 | orgId | 组织id | org_id | org.func.BaseOrg |
| 5 | payfileId | 发放单id | payfile_id | hrxc.payfile.WaPayfile |
| 6 | schemeAuthId | 发薪方案授权id | scheme_auth_id | hrxc.scheme.WaSchemeAuth |
| 7 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |

---

## Child Tables (1)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | apportionDispenses | 薪资分摊已分摊主表 | hrxc.salaryApportion.SalaryApportionDispense |
