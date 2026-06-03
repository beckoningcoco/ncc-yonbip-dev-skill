---
tags: [BIP, metadata, hrjx, DataAcquisition]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 数据采集实体 (hrjx.pmSheet.DataAcquisition)

> Platform: BIP V5 | Table: pm_data_acquisiton | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 数据采集实体 |
| uri | hrjx.pmSheet.DataAcquisition |
| tableName | pm_data_acquisiton |
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

## All Fields (13)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | schemeid | 方案id | schemeid | text | String |  |  | nullable |
| 2 | sheetid | 量表id | sheetid | text | String |  |  | nullable |
| 3 | staffid | 员工id | staffid | text | String |  |  | nullable |
| 4 | indicatorid | 指标id | indicatorid | text | String |  |  | nullable |
| 5 | planvalue | 计划完成值 | planvalue | text | String |  |  | nullable |
| 6 | actualtext | 实际完成值 | actualtext | text | String |  |  | nullable |
| 7 | otherFileds | 其余字段 | other_fileds | text | String |  |  | nullable |
| 8 | remark | 数据采集说明 | remark | text | String |  |  | nullable |
| 9 | state | 状态 | state | int | Integer |  |  | nullable |
| 10 | id | 主键 | id | text | String |  |  | nullable,REF.ID,uiHide |
| 11 | pubts | 时间戳 | ts | timestamp | Timestamp |  |  | nullable,uiHide,isSyncKey |
| 12 | tenant | 租户ID | tenant_id | text | String |  | Y | nullable,uiHide |
| 13 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (1)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
