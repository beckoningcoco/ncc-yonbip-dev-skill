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

# 指标分类实体 (hrjx.pmCore.IndicatorClass)

> Platform: BIP V5 | Table: pm_indi_class | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 指标分类实体 |
| uri | hrjx.pmCore.IndicatorClass |
| tableName | pm_indi_class |
| domain | yonbip-hr-pmcore |
| applicationCode | HRJX-MDD |
| superUri | ucfbase.entity.BizObject |
| isBusinessObject | true |
| description | 0 停用 1 启用 |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (6)

| # | Name | URI |
|---|------|-----|
| 1 | 启用 (IEnable) | ucfbase.ucfbaseItf.IEnable |
| 2 | 树型结构 (ITree) | base.itf.ITree |
| 3 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |
| 4 | 租户接口 (ITenant) | ucfbase.ucfbaseItf.ITenant |
| 5 | 审计信息 (IAuditInfo) | ucfbase.ucfbaseItf.IAuditInfo |
| 6 | 自动编码 (IAutoCode) | ucfbase.ucfbaseItf.IAutoCode |

---

## All Fields (27)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | indiclasscode | 编码 | indiclasscode | text | String |  |  | isCode,nullable |
| 2 | indiclassname | 名称 | indiclassname | multiLanguage | String |  |  | isName,nullable |
| 3 | parent | 上级分类id | indiclassparent | quote | hrjx.pmCore.IndicatorClass |  |  | nullable |
| 4 | orgid | 组织id | orgid | quote | org.func.AdminOrg |  |  | data_auth,nullable |
| 5 | vid | 组织id | vid | quote | org.func.BaseOrgTimeline |  |  | data_auth,migrationIgnoreRef,nullable |
| 6 | scoreruleid | 考核评分规则id | scoreruleid | quote | hrjx.pmCore.ScoreRule |  |  | nullable |
| 7 | scoreway | 汇总规则 | scoreway | int | Integer |  |  | nullable |
| 8 | enable | 启用状态 | enablestate | int | Integer |  |  | nullable,uiDesign |
| 9 | sort | 序号 | number | long | Long |  |  | nullable |
| 10 | indiclasstype | 类型 | indiclasstype | int | Integer |  |  | nullable |
| 11 | path | 全路径 | fullpath | text | String |  |  | nullable |
| 12 | level | 层次深度 | level | int | Integer |  |  | nullable |
| 13 | isEnd | 是否末级 | isleaf | switch | Boolean |  |  | nullable |
| 14 | specialtag | 加减项指标分类标识 | specialtag | int | Integer |  |  | nullable |
| 15 | upperlimit | 分数上限 | upperlimit | number | Decimal |  |  | nullable |
| 16 | lowerlimit | 分数下限 | lowerlimit | number | Decimal |  |  | nullable |
| 17 | defineCharacter | 特征弹性域 | define_character | UserDefine | hrjx.pmCharacter.IndicatorClassCharacter |  |  | nullable |
| 18 | enablets | 启用时间 | enablets | dateTime | Timestamp |  |  | nullable |
| 19 | disablets | 停用时间 | disablets | dateTime | Timestamp |  |  | nullable |
| 20 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 21 | createTime | 创建时间 | creationtime | timestamp | Timestamp |  |  | nullable |
| 22 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 23 | modifyTime | 修改时间 | modifiedtime | timestamp | Timestamp |  |  | nullable |
| 24 | id | id | id | text | String |  |  | nullable,REF.ID,uiHide |
| 25 | pubts | 时间戳 | ts | timestamp | Timestamp |  |  | nullable,uiHide,isSyncKey |
| 26 | tenant | 租户id | tenantid | quote | yht.tenant.YhtTenant |  | Y | nullable,uiHide |
| 27 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (8)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | parent | 上级分类id | indiclassparent | hrjx.pmCore.IndicatorClass |
| 2 | orgid | 组织id | orgid | org.func.AdminOrg |
| 3 | vid | 组织id | vid | org.func.BaseOrgTimeline |
| 4 | scoreruleid | 考核评分规则id | scoreruleid | hrjx.pmCore.ScoreRule |
| 5 | creator | 创建人 | creator | base.user.BipUser |
| 6 | modifier | 修改人 | modifier | base.user.BipUser |
| 7 | tenant | 租户id | tenantid | yht.tenant.YhtTenant |
| 8 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
