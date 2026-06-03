---
tags: [BIP, metadata, hrjx, SheetAppraiser]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 量表评价人设置实体 (hrjx.pmSheet.SheetAppraiser)

> Platform: BIP V5 | Table: pm_sheet_appr | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 量表评价人设置实体 |
| uri | hrjx.pmSheet.SheetAppraiser |
| tableName | pm_sheet_appr |
| domain | yonbip-hr-pmcore |
| applicationCode | HRJX-MDD |
| superUri | ucfbase.entity.BizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (3)

| # | Name | URI |
|---|------|-----|
| 1 | 租户接口 (ITenant) | ucfbase.ucfbaseItf.ITenant |
| 2 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |
| 3 | 审计信息 (IAuditInfo) | ucfbase.ucfbaseItf.IAuditInfo |

---

## All Fields (22)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | sheetid | 量表id | sheetid | quote | hrjx.pmSheet.Sheet |  |  | nullable |
| 2 | staffid | 指定考核人id | staffid | quote | hred.staff.Staff |  |  | nullable |
| 3 | indicatorid | 指标id | indicatorid | quote | hrjx.pmCore.Indicator |  |  | nullable |
| 4 | stepid | 步骤id | stepid | quote | hrjx.pmPhaseFlow.PhaseFlowStepRuntime |  |  | nullable |
| 5 | blockid | 区块id | blockid | quote | hrjx.pmSheet.TemplateBlock |  |  | nullable |
| 6 | roleid | 执行角色id | roleid | quote | hrjx.pmExecutionRole.PmExecutionRole |  |  | nullable |
| 7 | indiId | sheet_indicator的id | indi_id | quote | hrjx.pmSheet.SheetIndicator |  |  | nullable |
| 8 | actturn | 实例轮次 | actturn | int | Integer |  |  | nullable,uiHide |
| 9 | turn | 轮次 | turn | int | Integer |  |  | nullable |
| 10 | weight | 权重 | weight | number | Decimal |  |  | nullable |
| 11 | dimtype | 考核人分类类型 | dimtype | int | Integer |  |  | nullable |
| 12 | dimid | 考核人类别id | dimid | quote | hrjx.pmCore.Dimensionality |  |  | nullable |
| 13 | psnweight | 评价人权重 | psnweight | number | Decimal |  |  | nullable |
| 14 | scoreType | 打分设置 | score_type | int | Integer |  |  | nullable |
| 15 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 16 | createTime | 创建时间 | creationtime | timestamp | Timestamp |  |  | nullable,uiHide |
| 17 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 18 | modifyTime | 修改时间 | modifiedtime | timestamp | Timestamp |  |  | nullable,uiHide |
| 19 | id | id | id | text | String |  |  | nullable,REF.ID,uiHide |
| 20 | pubts | 时间戳 | ts | timestamp | Timestamp |  |  | nullable,uiHide,isSyncKey |
| 21 | tenant | 租户id | tenantid | text | String |  | Y | nullable,uiHide |
| 22 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (11)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | sheetid | 量表id | sheetid | hrjx.pmSheet.Sheet |
| 2 | staffid | 指定考核人id | staffid | hred.staff.Staff |
| 3 | indicatorid | 指标id | indicatorid | hrjx.pmCore.Indicator |
| 4 | stepid | 步骤id | stepid | hrjx.pmPhaseFlow.PhaseFlowStepRuntime |
| 5 | blockid | 区块id | blockid | hrjx.pmSheet.TemplateBlock |
| 6 | roleid | 执行角色id | roleid | hrjx.pmExecutionRole.PmExecutionRole |
| 7 | indiId | sheet_indicator的id | indi_id | hrjx.pmSheet.SheetIndicator |
| 8 | dimid | 考核人类别id | dimid | hrjx.pmCore.Dimensionality |
| 9 | creator | 创建人 | creator | base.user.BipUser |
| 10 | modifier | 修改人 | modifier | base.user.BipUser |
| 11 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
