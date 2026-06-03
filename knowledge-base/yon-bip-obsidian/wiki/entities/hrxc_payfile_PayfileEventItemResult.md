---
tags: [BIP, metadata, hrxc, PayfileEventItemResult]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 发放单追溯结果 (hrxc.payfile.PayfileEventItemResult)

> Platform: BIP V5 | Table: wa_payfile_backtrack_event_item_result | Schema: yonbip-hr-paybiz

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 发放单追溯结果 |
| uri | hrxc.payfile.PayfileEventItemResult |
| tableName | wa_payfile_backtrack_event_item_result |
| domain | yonbip-hr-paybiz |
| applicationCode | HRXZHS_MDD |
| superUri | base.entity.BizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (3)

| # | Name | URI |
|---|------|-----|
| 1 | 逻辑删除相关 (LogicDelete) | ucfbase.ucfbaseItf.LogicDelete |
| 2 | 审计信息 (IAuditInfo) | ucfbase.ucfbaseItf.IAuditInfo |
| 3 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |

---

## All Fields (17)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | payfile | 薪资发放单主键 | pk_wa_payfile | quote | hrxc.payfile.WaPayfile |  |  | nullable |
| 2 | staffId | 追溯事件明细主键 | staff_id | quote | hred.staff.Staff |  |  | nullable |
| 3 | pkWaScheme | 发薪方案授权主键 | pk_wa_scheme | text | String |  |  | nullable |
| 4 | backtrackPeriod | 追溯期间 | backtrack_period | quote | hrxc.period.PeriodDetail |  |  | nullable |
| 5 | waItem | 发薪项目 | waitem_id | quote | hrxc.publicItem.WaItem |  |  | nullable |
| 6 | originalCalValue | 原始计算值 | original_cal_value | text | String |  |  | nullable |
| 7 | newCalValue | 追溯计算值 | new_cal_value | text | String |  |  | nullable |
| 8 | carryoverAmount | 结转金额 | carry_over_amount | text | String |  |  | nullable |
| 9 | id | 主键 | id | long | Long |  |  | nullable,REF.ID |
| 10 | dr | 逻辑删除标识 | dr | short | Short |  | Y | notGenerate,nullable,uiHide |
| 11 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 12 | ytenant | 租户主键 | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 13 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 14 | createTime | 创建时间 | create_time | dateTime | Timestamp |  |  | nullable |
| 15 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 16 | modifyTime | 修改时间 | modify_time | dateTime | Timestamp |  |  | nullable |
| 17 | salaryGroupId | 薪资核算组id | salary_group_id | long | Long |  |  | nullable |

---

## Reference Fields (7)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | payfile | 薪资发放单主键 | pk_wa_payfile | hrxc.payfile.WaPayfile |
| 2 | staffId | 追溯事件明细主键 | staff_id | hred.staff.Staff |
| 3 | backtrackPeriod | 追溯期间 | backtrack_period | hrxc.period.PeriodDetail |
| 4 | waItem | 发薪项目 | waitem_id | hrxc.publicItem.WaItem |
| 5 | ytenant | 租户主键 | ytenant_id | yht.tenant.YhtTenant |
| 6 | creator | 创建人 | creator | base.user.BipUser |
| 7 | modifier | 修改人 | modifier | base.user.BipUser |
