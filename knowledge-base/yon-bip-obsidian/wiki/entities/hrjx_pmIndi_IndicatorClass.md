---
tags: [BIP, metadata, hrjx, IndicatorClass]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 指标分类表 (hrjx.pmIndi.IndicatorClass)

> Platform: BIP V5 | Table: pm_indi_class | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 指标分类表 |
| uri | hrjx.pmIndi.IndicatorClass |
| tableName | pm_indi_class |
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

## All Fields (25)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | indiclassCode | 指标分类编码 | indiclasscode | text | String |  |  | nullable |
| 2 | indiclassName | 指标分类名称 | indiclassname | text | String |  |  | isCode,nullable |
| 3 | indiclassType | 指标分类类型 | indiclasstype | int | Integer |  |  | nullable |
| 4 | indiclassParent | 上级指标分类id | indiclassparent | text | String |  |  | nullable |
| 5 | orgId | 所属组织 | orgid | quote | org.func.AdminOrgTimeline |  |  | isMasterOrg,nullable |
| 6 | vid | 所属组织时间轴id | vid | quote | org.func.AdminOrgTimeline |  |  | nullable |
| 7 | scoreRuleId | 评分规则id | scoreruleid | quote | hrjx.pmCore.ScoreRule |  |  | nullable |
| 8 | scoreWay | 汇总规则 | scoreway | int | Integer |  |  | nullable |
| 9 | enableState | 是否有效 | enablestate | int | Integer |  |  | nullable |
| 10 | number | 序号 | number | int | Integer |  |  | nullable |
| 11 | level | 级别 | level | int | Integer |  |  | nullable |
| 12 | fullPath | 完整路径 | fullpath | text | String |  |  | nullable |
| 13 | isLeaf | 是否末级 | isleaf | int | Integer |  |  | nullable |
| 14 | upperLimit | 分数上限 | upperlimit | number | Decimal |  |  | nullable |
| 15 | lowerLimit | 分数下限 | lowerlimit | number | Decimal |  |  | nullable |
| 16 | specialTag | 加减项指标分类标识 | specialtag | int | Integer |  |  | nullable |
| 17 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 18 | createTime | 创建时间 | creationtime | timestamp | Timestamp |  |  | nullable,uiHide |
| 19 | modifyTime | 修改时间 | modifiedtime | timestamp | Timestamp |  |  | nullable,uiHide |
| 20 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 21 | id | 主键 | id | text | String |  |  | nullable,REF.ID,uiHide |
| 22 | pubts | 时间戳 | ts | timestamp | Timestamp |  |  | nullable,uiHide,isSyncKey |
| 23 | tenant | 租户id | tenantid | text | String |  | Y | nullable,uiHide |
| 24 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 25 | indicatorList | 指标信息 | - | - | hrjx.pmIndi.Indicator |  |  |  |

---

## Reference Fields (6)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | orgId | 所属组织 | orgid | org.func.AdminOrgTimeline |
| 2 | vid | 所属组织时间轴id | vid | org.func.AdminOrgTimeline |
| 3 | scoreRuleId | 评分规则id | scoreruleid | hrjx.pmCore.ScoreRule |
| 4 | creator | 创建人 | creator | base.user.BipUser |
| 5 | modifier | 修改人 | modifier | base.user.BipUser |
| 6 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |

---

## Child Tables (1)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | indicatorList | 指标信息 | hrjx.pmIndi.Indicator |
