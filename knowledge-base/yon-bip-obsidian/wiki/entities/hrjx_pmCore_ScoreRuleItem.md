---
tags: [BIP, metadata, hrjx, ScoreRuleItem]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 考核等级明细实体 (hrjx.pmCore.ScoreRuleItem)

> Platform: BIP V5 | Table: pm_grade_item | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 考核等级明细实体 |
| uri | hrjx.pmCore.ScoreRuleItem |
| tableName | pm_grade_item |
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
| 2 | 租户接口 (ITenant) | ucfbase.ucfbaseItf.ITenant |

---

## All Fields (15)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | gradeid | 等级组id | gradeid | quote | hrjx.pmCore.ScoreRule |  |  | nullable |
| 2 | archiveid | 基础档案绩效等级id | archiveid | quote | bd.customerdoc_0019.0019 |  |  | nullable |
| 3 | ordernum | 序号 | ordernum | int | Integer |  |  | nullable |
| 4 | gradeitemname | 评分等级 | gradeitemname | text | String |  |  | isName,nullable |
| 5 | standardscore | 标准分 | standardscore | number | Decimal |  |  | nullable |
| 6 | gradeitemremark | 备注 | gradeitemremark | text | String |  |  | nullable |
| 7 | upperlimit | 上限 | upperlimit | number | Decimal |  |  | nullable |
| 8 | lowerlimit | 下限 | lowerlimit | number | Decimal |  |  | nullable |
| 9 | isupperlimit | 是否包含上限 | isupperlimit | int | Integer |  |  | nullable |
| 10 | islowerlimit | 是否包含下限 | islowerlimit | int | Integer |  |  | nullable |
| 11 | defineCharacter | 特征弹性域 | define_character | UserDefine | hrjx.pmCharacter.ScoreRuleItemCharacter |  |  | nullable |
| 12 | id | id | id | text | String |  |  | nullable,REF.ID,uiHide |
| 13 | pubts | 时间戳 | ts | timestamp | Timestamp |  |  | nullable,uiHide,isSyncKey |
| 14 | tenant | 租户id | tenantid | quote | yht.tenant.YhtTenant |  | Y | nullable,uiHide |
| 15 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (4)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | gradeid | 等级组id | gradeid | hrjx.pmCore.ScoreRule |
| 2 | archiveid | 基础档案绩效等级id | archiveid | bd.customerdoc_0019.0019 |
| 3 | tenant | 租户id | tenantid | yht.tenant.YhtTenant |
| 4 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
