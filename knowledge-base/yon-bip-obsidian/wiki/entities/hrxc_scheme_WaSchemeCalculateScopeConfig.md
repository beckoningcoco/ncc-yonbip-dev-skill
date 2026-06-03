---
tags: [BIP, metadata, hrxc, WaSchemeCalculateScopeConfig]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 发薪方案计算取值范围 (hrxc.scheme.WaSchemeCalculateScopeConfig)

> Platform: BIP V5 | Table: wa_scheme_calculate_scope_config | Schema: yonbip-hr-paybiz

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 发薪方案计算取值范围 |
| uri | hrxc.scheme.WaSchemeCalculateScopeConfig |
| tableName | wa_scheme_calculate_scope_config |
| domain | yonbip-hr-paybiz |
| applicationCode | HRXZHS_MDD |
| superUri | ucfbase.entity.BizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (3)

| # | Name | URI |
|---|------|-----|
| 1 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |
| 2 | 审计信息 (IAuditInfo) | ucfbase.ucfbaseItf.IAuditInfo |
| 3 | 逻辑删除相关 (LogicDelete) | ucfbase.ucfbaseItf.LogicDelete |

---

## All Fields (22)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | bizObjectId | 业务对象id | biz_object_id | quote | hrxc.scheme.WaSchemeCalculateBizObject |  |  | nullable |
| 2 | calculateScopeMultiValues | 发薪方案计算取值范围多选值 | - | - | hrxc.scheme.WaSchemeCalculateScopeMultiValue |  |  |  |
| 3 | createTime | 创建时间 | create_time | dateTime | Timestamp |  |  | nullable |
| 4 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 5 | dr | 逻辑删除标记 | dr | short | Short |  | Y | notGenerate,nullable,uiHide |
| 6 | fieldId | 字段id | field_id | quote | hrxc.scheme.WaSchemeCalculateField |  |  | nullable |
| 7 | id | id | id | text | String |  |  | nullable,uiHide,REF.ID |
| 8 | isRefer | 是否参照(0-否;1-是) | is_refer | int | Integer |  |  | nullable |
| 9 | memo | 说明 | memo | text | String |  |  | nullable |
| 10 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 11 | modifyTime | 修改时间 | modify_time | dateTime | Timestamp |  |  | nullable |
| 12 | multiFlag | 多选标识(0-否;1-是) | multi_flag | int | Integer |  |  | nullable |
| 13 | operatorId | 操作符id | operator_id | quote | hrxc.scheme.WaSchemeCalculateOperator |  |  | nullable |
| 14 | pkSchemeVersion | 发薪方案版本id | pk_scheme_version | quote | hrxc.scheme.WaSchemeVersion |  |  | nullable |
| 15 | pkWaScheme | 发薪方案id | pk_wa_scheme | quote | hrxc.scheme.WaScheme |  |  | nullable |
| 16 | preset | 预置标识(0-否;1-是) | preset | int | Integer |  |  | nullable |
| 17 | pubts | 时间戳 | pubts | dateTime | Timestamp |  |  | isSyncKey,nullable,uiHide |
| 18 | refType | 引用类型 | ref_type | text | String |  |  | nullable |
| 19 | value1 | 值1 | value1 | text | String |  |  | nullable |
| 20 | value2 | 值2(范围用) | value2 | text | String |  |  | nullable |
| 21 | valueTypeId | 值类型id | value_type_id | quote | hrxc.scheme.WaSchemeCalculateValueType |  |  | nullable |
| 22 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (9)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | bizObjectId | 业务对象id | biz_object_id | hrxc.scheme.WaSchemeCalculateBizObject |
| 2 | creator | 创建人 | creator | base.user.BipUser |
| 3 | fieldId | 字段id | field_id | hrxc.scheme.WaSchemeCalculateField |
| 4 | modifier | 修改人 | modifier | base.user.BipUser |
| 5 | operatorId | 操作符id | operator_id | hrxc.scheme.WaSchemeCalculateOperator |
| 6 | pkSchemeVersion | 发薪方案版本id | pk_scheme_version | hrxc.scheme.WaSchemeVersion |
| 7 | pkWaScheme | 发薪方案id | pk_wa_scheme | hrxc.scheme.WaScheme |
| 8 | valueTypeId | 值类型id | value_type_id | hrxc.scheme.WaSchemeCalculateValueType |
| 9 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |

---

## Child Tables (1)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | calculateScopeMultiValues | 发薪方案计算取值范围多选值 | hrxc.scheme.WaSchemeCalculateScopeMultiValue |
