---
tags: [BIP, metadata, hrjx, Gauge]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 公共量表信息 (hrjx.pmgauge.Gauge)

> Platform: BIP V5 | Table: pm_gauge | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 公共量表信息 |
| uri | hrjx.pmgauge.Gauge |
| tableName | pm_gauge |
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
| 1 | 租户接口 (ITenant) | ucfbase.ucfbaseItf.ITenant |
| 2 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |
| 3 | 审计信息 (IAuditInfo) | ucfbase.ucfbaseItf.IAuditInfo |
| 4 | 启用 (IEnable) | ucfbase.ucfbaseItf.IEnable |

---

## All Fields (30)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | name | 量表名称 | name | multiLanguage | String |  |  | isName,nullable |
| 2 | orgid | 所属组织 | orgid | quote | org.func.AdminOrg |  |  | nullable |
| 3 | vid | 所属组织 | vid | quote | org.func.AdminOrgTimeline |  |  | migrationIgnoreRef,nullable |
| 4 | isdoubleweight | 按指标分类、指标两级设置权重 | isdoubleweight | switch | Boolean |  |  | nullable |
| 5 | isaddindiclass | 是否允许考核对象新增指标分类 | isaddindiclass | short | Short |  |  | nullable |
| 6 | remark | 规则描述 | remark | text | String |  |  | nullable |
| 7 | classname | 公共量表分类名称 | classname | text | String |  |  | nullable |
| 8 | ischecked | 是否权重校验通过 | ischecked | switch | Boolean |  |  | nullable |
| 9 | scoreruleid | 评分规则id | scoreruleid | quote | hrjx.pmCore.ScoreRule |  |  | nullable |
| 10 | reftime | 引用时间 | reftime | timestamp | Timestamp |  |  | nullable |
| 11 | originalid | 原始id | originalid | text | String |  |  | nullable |
| 12 | enable | 启用状态 | enablestate | switch | Boolean |  |  | nullable,uiDesign,uiHide |
| 13 | enablets | 启用时间 | enablets | timestamp | Timestamp |  |  | nullable,uiHide |
| 14 | disablets | 启用时间 | disablets | timestamp | Timestamp |  |  | nullable,uiHide |
| 15 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 16 | creationTime | 创建时间 | creationtime | timestamp | Timestamp |  |  | nullable,uiHide |
| 17 | createTime | 创建时间 | creationtime | timestamp | Timestamp |  |  | nullable,uiHide |
| 18 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 19 | modifiedTime | 修改时间 | modifiedtime | timestamp | Timestamp |  |  | nullable,uiHide |
| 20 | modifyTime | 修改时间 | modifiedtime | timestamp | Timestamp |  |  | nullable,uiHide |
| 21 | id | ID | id | text | String |  |  | nullable,REF.ID,uiHide |
| 22 | pubts | 时间戳 | ts | timestamp | Timestamp |  |  | nullable,uiHide,isSyncKey |
| 23 | tenant | 租户id | tenantid | quote | yht.tenant.YhtTenant |  | Y | nullable,uiHide |
| 24 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 25 | gaugeColumnList | 公共量表动态列栏目值 | - | - | hrjx.pmgauge.GaugeColumn |  |  |  |
| 26 | gaugeIndilist | 公共量表指标表 | - | - | hrjx.pmgauge.GaugeIndicator |  |  |  |
| 27 | gaugeSettingList | 公共量表分类属性设置 | - | - | hrjx.pmgauge.GaugeSetting |  |  |  |
| 28 | gaugeUserdefinedList | 公共量表字段属性设置 | - | - | hrjx.pmgauge.GaugeUserdefined |  |  |  |
| 29 | relations | 公共考核量表与考核对象类型关联表 | - | - | hrjx.pmgauge.EvaObjectTypeRelationForGauge |  |  |  |
| 30 | scopeList | 公共量表适用范围表 | - | - | hrjx.pmgauge.PmGaugeScope |  |  |  |

---

## Reference Fields (7)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | orgid | 所属组织 | orgid | org.func.AdminOrg |
| 2 | vid | 所属组织 | vid | org.func.AdminOrgTimeline |
| 3 | scoreruleid | 评分规则id | scoreruleid | hrjx.pmCore.ScoreRule |
| 4 | creator | 创建人 | creator | base.user.BipUser |
| 5 | modifier | 修改人 | modifier | base.user.BipUser |
| 6 | tenant | 租户id | tenantid | yht.tenant.YhtTenant |
| 7 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |

---

## Child Tables (6)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | gaugeUserdefinedList | 公共量表字段属性设置 | hrjx.pmgauge.GaugeUserdefined |
| 2 | scopeList | 公共量表适用范围表 | hrjx.pmgauge.PmGaugeScope |
| 3 | gaugeIndilist | 公共量表指标表 | hrjx.pmgauge.GaugeIndicator |
| 4 | gaugeColumnList | 公共量表动态列栏目值 | hrjx.pmgauge.GaugeColumn |
| 5 | relations | 公共考核量表与考核对象类型关联表 | hrjx.pmgauge.EvaObjectTypeRelationForGauge |
| 6 | gaugeSettingList | 公共量表分类属性设置 | hrjx.pmgauge.GaugeSetting |
