---
tags: [BIP, metadata, hrxc, PeriodRule]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 薪资期间主表 (hrxc.period.PeriodRule)

> Platform: BIP V5 | Table: wa_period_rule | Schema: yonbip-hr-paybiz

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 薪资期间主表 |
| uri | hrxc.period.PeriodRule |
| tableName | wa_period_rule |
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
| 1 | 树型结构 (ITree) | base.itf.ITree |
| 2 | 租户接口 (ITenant) | ucfbase.ucfbaseItf.ITenant |
| 3 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |
| 4 | 审计信息 (IAuditInfo) | ucfbase.ucfbaseItf.IAuditInfo |

---

## All Fields (29)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | periodType | 期间类型:0:月度 1:季度 2:年度 3:单周 4:双周 | PERIOD_TYPE | text | String |  |  | nullable |
| 2 | basePeriodRule | 基准期间规则 | base_period_rule | text | String |  |  | nullable |
| 3 | sort | 排序号 | sort_num | int | Integer |  |  | nullable |
| 4 | isEnd | 是否末级 | isEnd | switch | Boolean |  |  | nullable |
| 5 | busiOrgVid | 组织Vid | BUSIORGVID | quote | org.func.BaseOrgTimeline |  |  | hide,migrationIgnoreRef,nullable |
| 6 | name | 名称 | NAME | multiLanguage | String |  |  | nullable,s_mul_language |
| 7 | parent | 所属上级 | parent_id | quote | hrxc.period.PeriodRule |  |  | nullable |
| 8 | path | 路径 | path | text | String |  |  | nullable |
| 9 | level | 层级 | level | int | Integer |  |  | nullable |
| 10 | busiOrg | 组织ID | BUSIORG | quote | org.func.AdminOrg |  |  | isMasterOrg,nullable |
| 11 | beginMonth | 起始月份 | BEGIN_MONTH | int | Integer |  |  | nullable |
| 12 | beginDate | 起始日期 | BEGIN_DATE | int | Integer |  |  | nullable |
| 13 | frequencyRefId | 频率id | frequency_ref_id | quote | hrcb.common-ref.FrequencyVO |  |  | nullable |
| 14 | endMonth | 结束月份 | END_MONTH | int | Integer |  |  | nullable |
| 15 | endDate | 结束日期 | END_DATE | int | Integer |  |  | nullable |
| 16 | startPeriod | 起始期间 | START_PERIOD | text | String |  |  | nullable |
| 17 | generateRule | 默认纳税期间规则 | GENERATE_RULE | int | Integer |  |  | nullable |
| 18 | attendRule | 对应考勤期间 | attend_rule | text | String |  |  | nullable |
| 19 | memo | 期间描述 | memo | text | String |  |  | nullable |
| 20 | id | 主键 | ID | text | String |  |  | nullable,uiHide,REF.ID |
| 21 | pubts | 时间戳 | TS | timestamp | Timestamp |  |  | nullable,uiHide,isSyncKey |
| 22 | dr | 逻辑删除标识 | DR | short | Short |  |  | nullable |
| 23 | ytenant | 租户 | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 24 | creator | 创建人 | CREATOR | quote | base.user.BipUser |  |  | nullable,migrationIgnoreRef |
| 25 | createTime | 创建时间 | CREATIONTIME | timestamp | Timestamp |  |  | nullable |
| 26 | modifier | 修改人 | MODIFIER | quote | base.user.BipUser |  |  | nullable,migrationIgnoreRef |
| 27 | modifyTime | 修改时间 | MODIFIEDTIME | timestamp | Timestamp |  |  | nullable |
| 28 | tenant | 租户 | TENANTID | quote | yht.tenant.YhtTenant |  | Y | nullable,uiHide |
| 29 | periodDetails | 薪资期间子表 | - | - | hrxc.period.PeriodDetail |  |  |  |

---

## Reference Fields (8)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | busiOrgVid | 组织Vid | BUSIORGVID | org.func.BaseOrgTimeline |
| 2 | parent | 所属上级 | parent_id | hrxc.period.PeriodRule |
| 3 | busiOrg | 组织ID | BUSIORG | org.func.AdminOrg |
| 4 | frequencyRefId | 频率id | frequency_ref_id | hrcb.common-ref.FrequencyVO |
| 5 | ytenant | 租户 | ytenant_id | yht.tenant.YhtTenant |
| 6 | creator | 创建人 | CREATOR | base.user.BipUser |
| 7 | modifier | 修改人 | MODIFIER | base.user.BipUser |
| 8 | tenant | 租户 | TENANTID | yht.tenant.YhtTenant |

---

## Child Tables (1)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | periodDetails | 薪资期间子表 | hrxc.period.PeriodDetail |
