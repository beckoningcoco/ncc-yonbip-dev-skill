---
tags: [BIP, metadata, hrjx, AppraiseIndiData]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 量表指标考核信息 (hrjx.pmAppraise.AppraiseIndiData)

> Platform: BIP V5 | Table: pm_appraise_indidata | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 量表指标考核信息 |
| uri | hrjx.pmAppraise.AppraiseIndiData |
| tableName | pm_appraise_indidata |
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
| 1 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |
| 2 | 审计信息 (IAuditInfo) | ucfbase.ucfbaseItf.IAuditInfo |

---

## All Fields (14)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | appraiseid | 评分主表id | appraiseid | quote | hrjx.pmAppraise.Appraise |  |  | nullable |
| 2 | createTime | 创建时间 | create_time | dateTime | Timestamp |  |  | nullable |
| 3 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 4 | defineCharacter | 特征弹性域 | define_character | UserDefine | hrjx.pmCharacter.AppraiseIndiDataCharacter |  |  | nullable |
| 5 | id | ID | id | text | String |  |  | nullable,REF.ID,uiHide |
| 6 | indicatorid | 指标id | indicatorid | quote | hrjx.pmCore.Indicator |  |  | nullable |
| 7 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 8 | modifyTime | 修改时间 | modify_time | dateTime | Timestamp |  |  | nullable |
| 9 | periodcode | 期间code | periodcode | text | String |  |  | nullable |
| 10 | pubts | 时间戳 | pubts | dateTime | Timestamp |  |  | isSyncKey,nullable,uiHide |
| 11 | schemeid | 方案id | schemeid | quote | hrjx.pmAppraise.AppraiseVirtualScheme |  |  | nullable |
| 12 | sheetid | 量表id | sheetid | quote | hrjx.pmSheet.Sheet |  |  | nullable |
| 13 | sheetindiid | 量表指标id | sheetindiid | quote | hrjx.pmSheet.SheetIndicator |  |  | nullable |
| 14 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (8)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | appraiseid | 评分主表id | appraiseid | hrjx.pmAppraise.Appraise |
| 2 | creator | 创建人 | creator | base.user.BipUser |
| 3 | indicatorid | 指标id | indicatorid | hrjx.pmCore.Indicator |
| 4 | modifier | 修改人 | modifier | base.user.BipUser |
| 5 | schemeid | 方案id | schemeid | hrjx.pmAppraise.AppraiseVirtualScheme |
| 6 | sheetid | 量表id | sheetid | hrjx.pmSheet.Sheet |
| 7 | sheetindiid | 量表指标id | sheetindiid | hrjx.pmSheet.SheetIndicator |
| 8 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
