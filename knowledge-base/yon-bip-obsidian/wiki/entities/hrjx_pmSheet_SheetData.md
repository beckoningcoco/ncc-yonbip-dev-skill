---
tags: [BIP, metadata, hrjx, SheetData]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 量表结构数据实体 (hrjx.pmSheet.SheetData)

> Platform: BIP V5 | Table: pm_sheet_data | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 量表结构数据实体 |
| uri | hrjx.pmSheet.SheetData |
| tableName | pm_sheet_data |
| domain | yonbip-hr-pmcore |
| applicationCode | HRJX-MDD |
| superUri | ucfbase.entity.BizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (2)

| # | Name | URI |
|---|------|-----|
| 1 | 租户接口 (ITenant) | ucfbase.ucfbaseItf.ITenant |
| 2 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |

---

## All Fields (17)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | annex | 附件地址 | annex | text | String |  |  | nullable |
| 2 | blockid | 区域id | block_id | long | Long |  |  | nullable |
| 3 | columncode | 栏目数据 | columncode | text | String |  |  | nullable |
| 4 | deptid | 考核对象对应人员部门id | deptid | quote | org.func.AdminOrg |  |  | nullable |
| 5 | id | ID | id | text | String |  |  | nullable,REF.ID,uiHide |
| 6 | indicatorid | 指标id | indicatorid | quote | hrjx.pmCore.Indicator |  |  | nullable |
| 7 | numvalue | 数值 | numvalue | number | Decimal |  |  | nullable |
| 8 | periodcode | 周期值 | periodcode | text | String |  |  | nullable |
| 9 | pubts | 时间戳 | ts | timestamp | Timestamp |  |  | nullable,uiHide,isSyncKey |
| 10 | schemeid | 方案id | schemeid | quote | hrjx.pmScheme.Scheme |  |  | nullable |
| 11 | sheetid | 量表id | sheetid | quote | hrjx.pmSheet.Sheet |  |  | nullable |
| 12 | sheetindiid | 量表指标id | sheetindiid | quote | hrjx.pmSheet.SheetIndicator |  |  | nullable |
| 13 | source | 采集来源 | source | int | Integer |  |  | nullable |
| 14 | staffid | 考核对象对应人员id | staffid | quote | hred.staff.Staff |  |  | nullable |
| 15 | tenant | 租户id | tenantid | text | String |  | Y | nullable,uiHide |
| 16 | text | 文本 | text | text | String |  |  | nullable |
| 17 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (7)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | deptid | 考核对象对应人员部门id | deptid | org.func.AdminOrg |
| 2 | indicatorid | 指标id | indicatorid | hrjx.pmCore.Indicator |
| 3 | schemeid | 方案id | schemeid | hrjx.pmScheme.Scheme |
| 4 | sheetid | 量表id | sheetid | hrjx.pmSheet.Sheet |
| 5 | sheetindiid | 量表指标id | sheetindiid | hrjx.pmSheet.SheetIndicator |
| 6 | staffid | 考核对象对应人员id | staffid | hred.staff.Staff |
| 7 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
