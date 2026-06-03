---
tags: [BIP, metadata, hrjx, GradeItem]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 考核等级项 (hrjx.pmCore.GradeItem)

> Platform: BIP V5 | Table: pm_grade_item | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 考核等级项 |
| uri | hrjx.pmCore.GradeItem |
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
| 1 | 租户接口 (ITenant) | ucfbase.ucfbaseItf.ITenant |
| 2 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |

---

## All Fields (17)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | archiveid | 等级参照pk | archiveid | quote | bd.customerdoc_0019.0019 |  |  | nullable |
| 2 | rankupperlimit | 排名区间上限 | rankupperlimit | number | Decimal |  |  | nullable |
| 3 | ranklowerlimit | 排名区间下限 | ranklowerlimit | number | Decimal |  |  | nullable |
| 4 | islowerlimit | 包含下限 | islowerlimit | int | Integer |  |  | nullable |
| 5 | gradeitemremark | 等级描述 | gradeitemremark | text | String |  |  | nullable |
| 6 | standardscore | 标准分 | standardscore | number | Decimal |  |  | nullable |
| 7 | defineCharacter | 特征弹性域 | define_character | UserDefine | hrjx.pmCharacter.GradeItemDefineCharacter |  |  | nullable |
| 8 | id | 主键 | id | text | String |  |  | nullable,REF.ID,uiHide |
| 9 | pubts | 时间戳 | ts | timestamp | Timestamp |  |  | nullable,uiHide,isSyncKey |
| 10 | tenant | 租户id | tenantid | quote | yht.tenant.YhtTenant |  | Y | nullable,uiHide |
| 11 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 12 | gradeid | 等级id | gradeid | quote | hrjx.pmCore.Grade |  |  | nullable |
| 13 | gradeitemname | 等级明细名称 | gradeitemname | text | String |  |  | isName,nullable |
| 14 | isupperlimit | 是否包含上限 | isupperlimit | int | Integer |  |  | nullable |
| 15 | lowerlimit | 分数区间下限 | lowerlimit | number | Decimal |  |  | nullable |
| 16 | ordernum | 序号 | ordernum | int | Integer |  |  | nullable |
| 17 | upperlimit | 分数区间上限 | upperlimit | number | Decimal |  |  | nullable |

---

## Reference Fields (4)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | archiveid | 等级参照pk | archiveid | bd.customerdoc_0019.0019 |
| 2 | tenant | 租户id | tenantid | yht.tenant.YhtTenant |
| 3 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
| 4 | gradeid | 等级id | gradeid | hrjx.pmCore.Grade |
