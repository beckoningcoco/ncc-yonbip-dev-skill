---
tags: [BIP, metadata, hrjx, AcquisitionIndicator]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 数据采集对应指标表 (hrjx.pmSheet.AcquisitionIndicator)

> Platform: BIP V5 | Table: pm_acquisition_indicator_staffid | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 数据采集对应指标表 |
| uri | hrjx.pmSheet.AcquisitionIndicator |
| tableName | pm_acquisition_indicator_staffid |
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

## All Fields (9)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | id | ID | id | text | String |  |  | nullable,REF.ID,uiHide |
| 2 | indicatorid | 指标id | indicatorid | quote | hrjx.pmSheet.SheetIndicator |  |  | nullable |
| 3 | pubts | 时间戳 | ts | timestamp | Timestamp |  |  | nullable,uiHide,isSyncKey |
| 4 | schemeid | 方案id | schemeid | text | String |  |  | nullable |
| 5 | sheetid | 量表id | sheetid | text | String |  |  | nullable |
| 6 | staffid | 人员id | staffid | text | String |  |  | nullable |
| 7 | state | 状态 | state | int | Integer |  |  | nullable |
| 8 | tenant | 租户ID | tenant_id | text | String |  | Y | nullable,uiHide |
| 9 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (2)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | indicatorid | 指标id | indicatorid | hrjx.pmSheet.SheetIndicator |
| 2 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
