---
tags: [BIP, metadata, hrxc, PeriodDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 薪资期间子表 (hrxc.period.PeriodDetail)

> Platform: BIP V5 | Table: wa_period_detail | Schema: yonbip-hr-paybiz

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 薪资期间子表 |
| uri | hrxc.period.PeriodDetail |
| tableName | wa_period_detail |
| domain | yonbip-hr-paybiz |
| applicationCode | HRXZHS_MDD |
| superUri | ucfbase.entity.BizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | ID |

## Suppliers (2)

| # | Name | URI |
|---|------|-----|
| 1 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |
| 2 | 审计信息 (IAuditInfo) | ucfbase.ucfbaseItf.IAuditInfo |

---

## All Fields (18)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | mainId | 薪资期间主表主键 | MAIN_ID | quote | hrxc.period.PeriodRule |  |  | nullable |
| 2 | baseMonth | 基准期间月 | BASE_MONTH | text | String |  |  | nullable |
| 3 | periodTime | 期间时间 | period_time | text | String |  |  | nullable |
| 4 | baseTime | 基准期间 | base_time | text | String |  |  | nullable |
| 5 | year | 薪资年度 | YEAR | text | String |  |  | nullable |
| 6 | period | 薪资期间 | PERIOD | text | String |  |  | nullable |
| 7 | beginDate | 开始日期 | BEGIN_DATE | date | Date |  |  | nullable |
| 8 | endDate | 截至日期 | END_DATE | date | Date |  |  | nullable |
| 9 | baseYear | 基准期间年 | BASE_YEAR | text | String |  |  | nullable |
| 10 | id | ID | ID | text | String |  |  | nullable,uiHide,REF.ID |
| 11 | tenant | 租户ID | TENANTID | quote | yht.tenant.YhtTenant |  |  | nullable |
| 12 | dr | 逻辑删除标识 | DR | short | Short |  |  | nullable |
| 13 | pubts | 时间戳 | TS | timestamp | Timestamp |  |  | nullable,uiHide,isSyncKey |
| 14 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 15 | creator | 创建人 | CREATOR | quote | base.user.BipUser |  |  | nullable,migrationIgnoreRef |
| 16 | createTime | 创建时间 | CREATIONTIME | timestamp | Timestamp |  |  | nullable |
| 17 | modifier | 修改人 | MODIFIER | quote | base.user.BipUser |  |  | nullable,migrationIgnoreRef |
| 18 | modifyTime | 修改时间 | MODIFIEDTIME | timestamp | Timestamp |  |  | nullable |

---

## Reference Fields (5)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | mainId | 薪资期间主表主键 | MAIN_ID | hrxc.period.PeriodRule |
| 2 | tenant | 租户ID | TENANTID | yht.tenant.YhtTenant |
| 3 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
| 4 | creator | 创建人 | CREATOR | base.user.BipUser |
| 5 | modifier | 修改人 | MODIFIER | base.user.BipUser |
