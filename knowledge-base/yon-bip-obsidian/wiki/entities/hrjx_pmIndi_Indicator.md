---
tags: [BIP, metadata, hrjx, Indicator]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 指标信息 (hrjx.pmIndi.Indicator)

> Platform: BIP V5 | Table: pm_indicator | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 指标信息 |
| uri | hrjx.pmIndi.Indicator |
| tableName | pm_indicator |
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
| 1 | indiName | 指标名称 | indiname | text | String |  |  | isCode,nullable |
| 2 | indiExplain | 指标描述 | indiexplain | text | String |  |  | nullable |
| 3 | indiClassId | 指标分类id | indiclassid | quote | hrjx.pmIndi.IndicatorClass |  |  | nullable |
| 4 | orgId | 所属组织 | orgid | quote | org.func.AdminOrgTimeline |  |  | isMasterOrg,nullable |
| 5 | vid | 所属组织时间轴id | vid | quote | org.func.AdminOrgTimeline |  |  | nullable |
| 6 | indiProp | 指标属性 | indiprop | int | Integer |  |  | nullable |
| 7 | evalStandard | 评分标准 | evalstandard | text | String |  |  | nullable |
| 8 | isFormula | 是否包含公式 | isformula | int | Integer |  |  | nullable |
| 9 | scoringMethod | 计分方式 | scoringmethod | int | Integer |  |  | nullable |
| 10 | indiCode | 指标编码 | indicode | text | String |  |  | nullable |
| 11 | enableState | 是否有效 | enablestate | int | Integer |  |  | nullable |
| 12 | indiType | 指标类型 | inditype | int | Integer |  |  | nullable |
| 13 | applyObject | 适用范围 | applyobject | int | Integer |  |  | nullable |
| 14 | indiUnit | 计量单位 | indiunit | text | String |  |  | nullable |
| 15 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 16 | createTime | 创建时间 | creationtime | timestamp | Timestamp |  |  | nullable,uiHide |
| 17 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 18 | modifyTime | 修改时间 | modifiedtime | timestamp | Timestamp |  |  | nullable,uiHide |
| 19 | id | ID | id | text | String |  |  | nullable,REF.ID,uiHide |
| 20 | pubts | 时间戳 | ts | timestamp | Timestamp |  |  | nullable,uiHide,isSyncKey |
| 21 | tenant | 租户id | tenantid | text | String |  | Y | nullable,uiHide |
| 22 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (6)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | indiClassId | 指标分类id | indiclassid | hrjx.pmIndi.IndicatorClass |
| 2 | orgId | 所属组织 | orgid | org.func.AdminOrgTimeline |
| 3 | vid | 所属组织时间轴id | vid | org.func.AdminOrgTimeline |
| 4 | creator | 创建人 | creator | base.user.BipUser |
| 5 | modifier | 修改人 | modifier | base.user.BipUser |
| 6 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
