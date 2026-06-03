---
tags: [BIP, metadata, hrxc, WaSchemeVersion]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 薪资方案版本 (hrxc.scheme.WaSchemeVersion)

> Platform: BIP V5 | Table: wa_scheme_version | Schema: yonbip-hr-paybiz

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 薪资方案版本 |
| uri | hrxc.scheme.WaSchemeVersion |
| tableName | wa_scheme_version |
| domain | yonbip-hr-paybiz |
| applicationCode | HRXZHS_MDD |
| superUri | ucfbase.entity.BizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | ID |

## Suppliers (4)

| # | Name | URI |
|---|------|-----|
| 1 | 租户接口 (ITenant) | ucfbase.ucfbaseItf.ITenant |
| 2 | 审计信息 (IAuditInfo) | ucfbase.ucfbaseItf.IAuditInfo |
| 3 | 逻辑删除相关 (LogicDelete) | ucfbase.ucfbaseItf.LogicDelete |
| 4 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |

---

## All Fields (23)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | schemeId | 授权组织 | SCHEME_ID | quote | hrxc.scheme.WaScheme |  |  | nullable |
| 2 | startYear | 起始年度 | START_YEAR | text | String |  |  | nullable |
| 3 | startPeriod | 起始期间 | START_PERIOD | quote | hrxc.period.PeriodDetail |  |  | nullable |
| 4 | cyear | 最新业务年度 | CYEAR | text | String |  |  | nullable |
| 5 | cperiod | 最新业务期间 | CPERIOD | quote | hrxc.period.PeriodDetail |  |  | nullable |
| 6 | approveFlag | 是否需要审批 | APPROVE_FLAG | text | String |  |  | nullable |
| 7 | projectIn | 所得项目 | PROJECT_IN | text | String |  |  | nullable |
| 8 | automaticMatchingFlag | 自动匹配发薪人员 | AUTOMATIC_MATCHING_FLAG | int | Integer |  |  | nullable |
| 9 | memo | MEMO | MEMO | text | String |  |  | nullable |
| 10 | versionOrder | 版本排序 | VERSION_ORDER | int | Integer |  |  | nullable |
| 11 | id | 主键 | ID | text | String |  |  | nullable,uiHide,REF.ID |
| 12 | dr | 逻辑删除标识 | DR | int | Integer |  | Y | nullable,uiHide,notGenerate |
| 13 | pubts | 时间戳 | TS | timestamp | Timestamp |  |  | nullable,uiHide,isSyncKey |
| 14 | ytenant | 租户主键 | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 15 | creator | 创建人 | CREATOR | quote | base.user.BipUser |  |  | nullable |
| 16 | createTime | 创建时间 | CREATIONTIME | timestamp | Timestamp |  |  | nullable |
| 17 | modifier | 修改人 | MODIFIER | quote | base.user.BipUser |  |  | nullable |
| 18 | modifyTime | 修改时间 | MODIFIEDTIME | timestamp | Timestamp |  |  | nullable |
| 19 | tenant | 租户主键(旧) | TENANTID | quote | yht.tenant.YhtTenant |  | Y | nullable,uiHide |
| 20 | backtrackEventRules | 发薪方案追溯事件 | - | - | hrxc.scheme.SchemeBacktrackEventRule |  |  |  |
| 21 | backtrackSalaryItems | 薪资追溯发薪项目处理方式表 | - | - | hrxc.scheme.SalaryItemProcessingMethod |  |  |  |
| 22 | periodSegmentEnable | 期间分段标志 | PERIOD_SEGMENT_ENABLE | int | Integer |  |  | nullable |
| 23 | segmentCondition | 分段条件 | SEGMENT_CONDITION | text | String |  |  | nullable |

---

## Reference Fields (7)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | schemeId | 授权组织 | SCHEME_ID | hrxc.scheme.WaScheme |
| 2 | startPeriod | 起始期间 | START_PERIOD | hrxc.period.PeriodDetail |
| 3 | cperiod | 最新业务期间 | CPERIOD | hrxc.period.PeriodDetail |
| 4 | ytenant | 租户主键 | ytenant_id | yht.tenant.YhtTenant |
| 5 | creator | 创建人 | CREATOR | base.user.BipUser |
| 6 | modifier | 修改人 | MODIFIER | base.user.BipUser |
| 7 | tenant | 租户主键(旧) | TENANTID | yht.tenant.YhtTenant |

---

## Child Tables (2)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | backtrackSalaryItems | 薪资追溯发薪项目处理方式表 | hrxc.scheme.SalaryItemProcessingMethod |
| 2 | backtrackEventRules | 发薪方案追溯事件 | hrxc.scheme.SchemeBacktrackEventRule |
