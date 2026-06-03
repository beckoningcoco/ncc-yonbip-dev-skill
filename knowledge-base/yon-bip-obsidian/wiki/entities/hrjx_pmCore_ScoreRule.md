---
tags: [BIP, metadata, hrjx, ScoreRule]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 评分规则实体 (hrjx.pmCore.ScoreRule)

> Platform: BIP V5 | Table: pm_score_rule | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 评分规则实体 |
| uri | hrjx.pmCore.ScoreRule |
| tableName | pm_score_rule |
| domain | yonbip-hr-pmcore |
| applicationCode | HRJX-MDD |
| superUri | ucfbase.entity.BizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (4)

| # | Name | URI |
|---|------|-----|
| 1 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |
| 2 | 租户接口 (ITenant) | ucfbase.ucfbaseItf.ITenant |
| 3 | 审计信息 (IAuditInfo) | ucfbase.ucfbaseItf.IAuditInfo |
| 4 | 自动编号 (IAutoCode) | voucher.base.IAutoCode |

---

## All Fields (23)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | orgid | 组织 | orgid | quote | org.func.AdminOrg |  |  | nullable |
| 2 | vid | 组织 | vid | quote | org.func.BaseOrgTimeline |  |  | migrationIgnoreRef,nullable |
| 3 | name | 名称 | name | multiLanguage | String |  |  | nullable |
| 4 | enable | 启用状态 | enablestate | int | Integer |  |  | nullable |
| 5 | upperlimit | 评分上限 | upperlimit | number | Decimal |  |  | nullable |
| 6 | lowerlimit | 评分下限 | lowerlimit | number | Decimal |  |  | nullable |
| 7 | decimaldigits | 小数位 | decimaldigits | int | Integer |  |  | nullable |
| 8 | upperabnormallimit | 评分异常上限 | upperabnormallimit | number | Decimal |  |  | nullable |
| 9 | lowerabnormallimit | 评分异常下限 | lowerabnormallimit | number | Decimal |  |  | nullable |
| 10 | remark | 备注 | remark | text | String |  |  | nullable |
| 11 | ruletype | 类型 | ruletype | int | Integer |  |  | nullable |
| 12 | defineCharacter | 特征弹性域 | define_character | UserDefine | hrjx.pmCharacter.ScoreRuleCharacter |  |  | nullable |
| 13 | copyFromId | 引用原id | copy_from_id | text | String |  |  | nullable |
| 14 | code | 编码 | code | text | String |  |  | REF.CODE,CODE,nullable,isCode |
| 15 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 16 | createTime | 创建时间 | creationtime | timestamp | Timestamp |  |  | nullable,uiHide |
| 17 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 18 | modifyTime | 修改时间 | modifiedtime | timestamp | Timestamp |  |  | nullable,uiHide |
| 19 | id | id | id | text | String |  |  | nullable,REF.ID,uiHide |
| 20 | pubts | 时间戳 | ts | timestamp | Timestamp |  |  | nullable,uiHide,isSyncKey |
| 21 | tenant | 租户id | tenantid | quote | yht.tenant.YhtTenant |  | Y | nullable,uiHide |
| 22 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 23 | ScoreRuleItem | 考核等级明细实体 | - | - | hrjx.pmCore.ScoreRuleItem |  |  |  |

---

## Reference Fields (6)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | orgid | 组织 | orgid | org.func.AdminOrg |
| 2 | vid | 组织 | vid | org.func.BaseOrgTimeline |
| 3 | creator | 创建人 | creator | base.user.BipUser |
| 4 | modifier | 修改人 | modifier | base.user.BipUser |
| 5 | tenant | 租户id | tenantid | yht.tenant.YhtTenant |
| 6 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |

---

## Child Tables (1)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | ScoreRuleItem | 考核等级明细实体 | hrjx.pmCore.ScoreRuleItem |
