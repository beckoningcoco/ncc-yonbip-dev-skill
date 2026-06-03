---
tags: [BIP, metadata, hrxc, WaPayfileDeatilAdjustOptimize]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 薪资发放单明细个别调整优化 (hrxc.payfile.WaPayfileDeatilAdjustOptimize)

> Platform: BIP V5 | Table: wa_payfile_detail_adjust_optimize | Schema: yonbip-hr-paybiz

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 薪资发放单明细个别调整优化 |
| uri | hrxc.payfile.WaPayfileDeatilAdjustOptimize |
| tableName | wa_payfile_detail_adjust_optimize |
| domain | yonbip-hr-paybiz |
| applicationCode | HRXZHS_MDD |
| superUri | base.entity.BizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | ID |

## Suppliers (2)

| # | Name | URI |
|---|------|-----|
| 1 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |
| 2 | 租户接口 (ITenant) | ucfbase.ucfbaseItf.ITenant |

---

## All Fields (16)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | pkPayFileDoc | 薪资发放单人员档案主键 | PK_PAYFILE_DOC | quote | hrxc.payfile.WaPayfileDoc |  |  | nullable |
| 2 | pkPayFile | 发放单主键 | PK_PAYFILE | quote | hrxc.payfile.WaPayfile |  |  | nullable |
| 3 | adjustItem | 调整项 | ADJUST_ITEM | text | String |  |  | nullable |
| 4 | adjustReason | 调整原因 | ADJUST_REASON | text | String |  |  | nullable |
| 5 | staffId | 人员主键 | STAFF_ID | quote | hred.staff.Staff |  |  | nullable |
| 6 | calValue | 计算值 | CAL_VALUE | text | String |  |  | nullable |
| 7 | adjustValue | 调整值 | ADJUST_VALUE | text | String |  |  | nullable |
| 8 | id | 主键 | ID | text | String |  |  | nullable,REF.ID |
| 9 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 10 | ytenant | 租户主键 | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 11 | creator | 创建人 | CREATOR | quote | hred.staff.Staff |  |  | nullable |
| 12 | createTime | 创建时间 | CREATIONTIME | timestamp | Timestamp |  |  | nullable |
| 13 | modifier | 修改人 | MODIFIER | quote | hred.staff.Staff |  |  | nullable |
| 14 | modifyTime | 修改时间 | MODIFIEDTIME | timestamp | Timestamp |  |  | nullable |
| 15 | tenant | 租户主键(旧) | TENANTID | text | String |  | Y | nullable,uiHide |
| 16 | ts | 时间戳(旧) | TS | timestamp | Timestamp |  |  | nullable |

---

## Reference Fields (6)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | pkPayFileDoc | 薪资发放单人员档案主键 | PK_PAYFILE_DOC | hrxc.payfile.WaPayfileDoc |
| 2 | pkPayFile | 发放单主键 | PK_PAYFILE | hrxc.payfile.WaPayfile |
| 3 | staffId | 人员主键 | STAFF_ID | hred.staff.Staff |
| 4 | ytenant | 租户主键 | ytenant_id | yht.tenant.YhtTenant |
| 5 | creator | 创建人 | CREATOR | hred.staff.Staff |
| 6 | modifier | 修改人 | MODIFIER | hred.staff.Staff |
