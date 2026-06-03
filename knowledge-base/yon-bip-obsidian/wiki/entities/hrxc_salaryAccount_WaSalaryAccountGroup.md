---
tags: [BIP, metadata, hrxc, WaSalaryAccountGroup]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 薪资核算组 (hrxc.salaryAccount.WaSalaryAccountGroup)

> Platform: BIP V5 | Table: wa_salary_account_group | Schema: yonbip-hr-paybiz

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 薪资核算组 |
| uri | hrxc.salaryAccount.WaSalaryAccountGroup |
| tableName | wa_salary_account_group |
| domain | yonbip-hr-paybiz |
| applicationCode | HRXZHS_MDD |
| superUri | ucfbase.entity.BizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | ID |

## Suppliers (5)

| # | Name | URI |
|---|------|-----|
| 1 | 审计信息 (IAuditInfo) | ucfbase.ucfbaseItf.IAuditInfo |
| 2 | 逻辑删除相关 (LogicDelete) | ucfbase.ucfbaseItf.LogicDelete |
| 3 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |
| 4 | 启用 (IEnable) | ucfbase.ucfbaseItf.IEnable |
| 5 | 自动编码 (IAutoCode) | ucfbase.ucfbaseItf.IAutoCode |

---

## All Fields (23)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | enableAdwBackTrack | 是否启用ADW追溯 | enable_adw_backtrack | singleOption | unitfyEnum.LOCHK.yes_or_no |  |  |  |
| 2 | busiOrg | 组织 | BUSIORG | quote | org.func.AdminOrg |  |  | isMasterOrg,nullable |
| 3 | code | 方案编码 | CODE | text | String |  |  | isCode,nullable |
| 4 | name | 方案名称 | NAME | multiLanguage | String |  |  | nullable |
| 5 | country | 国家地区 | country | quote | bd.country.CountryVO |  |  | migrationIgnoreRef,nullable |
| 6 | enable | 0:不启用 1:启用 | ENABLE | int | Integer |  |  | nullable,uiDesign |
| 7 | effectDate | 生效时间 | EFFECT_DATE | timestamp | Timestamp |  |  | nullable |
| 8 | memo | 说明 | MEMO | text | String |  |  | nullable |
| 9 | enableBackTrack | 是否启用追溯 | enable_backtrack | int | Integer |  |  | nullable |
| 10 | backtrackEventRule | 追溯事件 | backtrack_event_rule | quote | hrxc.backtrack.EventRule |  |  | nullable |
| 11 | salaryAccountGroupCharacteristics | 薪资核算组特征组 | define_character_id | UserDefine | hrxc.salaryAccount.WaSalaryAccountGroupCharacteristics |  |  | nullable |
| 12 | id | 主键 | ID | long | Long |  |  | nullable,uiHide,REF.ID |
| 13 | dr | 逻辑删除标记 | dr | short | Short |  | Y | notGenerate,nullable,uiHide |
| 14 | pubts | 时间戳 | PUBTS | timestamp | Timestamp |  |  | nullable,uiHide,isSyncKey |
| 15 | ytenant | 租户主键 | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 16 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 17 | createTime | 创建时间 | create_time | dateTime | Timestamp |  |  | nullable |
| 18 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 19 | modifyTime | 修改时间 | modify_time | dateTime | Timestamp |  |  | nullable |
| 20 | enablets | 启用时间 | enablets | dateTime | Timestamp |  |  | nullable |
| 21 | disablets | 停用时间 | disablets | dateTime | Timestamp |  |  | nullable |
| 22 | yTenantId | 友户通租户主键 | ytenant_id | text | String |  |  | nullable |
| 23 | groupVersion | 薪资核算组版本 | - | - | hrxc.salaryAccount.WaSalaryAccountGroupVersion |  |  |  |

---

## Reference Fields (6)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | busiOrg | 组织 | BUSIORG | org.func.AdminOrg |
| 2 | country | 国家地区 | country | bd.country.CountryVO |
| 3 | backtrackEventRule | 追溯事件 | backtrack_event_rule | hrxc.backtrack.EventRule |
| 4 | ytenant | 租户主键 | ytenant_id | yht.tenant.YhtTenant |
| 5 | creator | 创建人 | creator | base.user.BipUser |
| 6 | modifier | 修改人 | modifier | base.user.BipUser |

---

## Enum Fields (1)

| # | name | displayName | columnName | enumType |
|---|------|-------------|------------|----------|
| 1 | enableAdwBackTrack | 是否启用ADW追溯 | enable_adw_backtrack | yes_or_no |

---

## Child Tables (1)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | groupVersion | 薪资核算组版本 | hrxc.salaryAccount.WaSalaryAccountGroupVersion |

---

## Enum Value Details

### 是否启用ADW追溯 (enableAdwBackTrack) -> enable_adw_backtrack
> Enum: unitfyEnum.LOCHK.yes_or_no

| code | value | name |
|------|-------|------|
| 0 | 0 | 否 |
| 1 | 1 | 是 |
