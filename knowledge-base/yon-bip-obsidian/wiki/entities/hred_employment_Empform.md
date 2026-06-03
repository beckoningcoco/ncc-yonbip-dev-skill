---
tags: [BIP, metadata, hred, Empform]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 用工形式档案 (hred.employment.Empform)

> Platform: BIP V5 | Table: emp_form_archives | Schema: hrcloud-staff-mgr

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 用工形式档案 |
| uri | hred.employment.Empform |
| tableName | emp_form_archives |
| domain | hrcloud-staff-mgr |
| applicationCode | HRED |
| superUri | ucfbase.entity.BizObject |
| isBusinessObject | true |
| description | 0 停用 1 启用 |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (5)

| # | Name | URI |
|---|------|-----|
| 1 | 审计信息 (IAuditInfo) | ucfbase.ucfbaseItf.IAuditInfo |
| 2 | 启用 (IEnable) | ucfbase.ucfbaseItf.IEnable |
| 3 | 租户接口 (ITenant) | ucfbase.ucfbaseItf.ITenant |
| 4 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |
| 5 | 逻辑删除相关 (LogicDelete) | ucfbase.ucfbaseItf.LogicDelete |

---

## All Fields (19)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | id | ID | id | text | String |  |  | nullable,uiHide,REF.ID |
| 2 | code | 编码 | code | text | String |  |  | CODE,isCode,nullable |
| 3 | name | 名称 | name | multiLanguage | String |  |  | isName,NAME,nullable |
| 4 | enable | 状态 | enable | short | Short |  |  | nullable,uiDesign |
| 5 | country | 国家/地区 | - | - | hred.employment.Country |  |  |  |
| 6 | createTime | 创建时间 | create_time | dateTime | Timestamp |  |  | nullable |
| 7 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 8 | description | 描述 | description | multiLanguage | String |  |  | nullable |
| 9 | disablets | 停用时间 | disablets | dateTime | Timestamp |  |  | nullable |
| 10 | dr | 逻辑删除标记 | dr | short | Short |  | Y | notGenerate,nullable,uiHide |
| 11 | enablets | 启用时间 | enablets | dateTime | Timestamp |  |  | nullable |
| 12 | ispreset | 是否预置 | ispreset | switch | Boolean |  |  | nullable |
| 13 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 14 | modifyTime | 修改时间 | modify_time | dateTime | Timestamp |  |  | nullable |
| 15 | pubts | 时间戳 | pubts | dateTime | Timestamp |  |  | isSyncKey,nullable,uiHide |
| 16 | sortnum | 序号 | sortnum | int | Integer |  |  | nullable |
| 17 | tenant | 租户id | tenantid | text | String |  | Y | nullable,uiHide |
| 18 | userDefineCharacter | 特征 | user_define_character | UserDefine | hred.employment.UserDefineCharacter |  |  | nullable |
| 19 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (3)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | creator | 创建人 | creator | base.user.BipUser |
| 2 | modifier | 修改人 | modifier | base.user.BipUser |
| 3 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |

---

## Child Tables (1)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | country | 国家/地区 | hred.employment.Country |
