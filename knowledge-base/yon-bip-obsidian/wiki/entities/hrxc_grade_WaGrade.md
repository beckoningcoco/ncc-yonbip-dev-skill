---
tags: [BIP, metadata, hrxc, WaGrade]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 薪资标准类别 (hrxc.grade.WaGrade)

> Platform: BIP V5 | Table: wa_grade | Schema: yonbip-hr-paybiz

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 薪资标准类别 |
| uri | hrxc.grade.WaGrade |
| tableName | wa_grade |
| domain | yonbip-hr-paybiz |
| applicationCode | HRXZHS_MDD |
| superUri | ucfbase.entity.BizObject |
| isBusinessObject | true |
| description | 0 停用 1 启用 |

## Key
| Role | Column |
|------|--------|
| key | ID |

## Suppliers (6)

| # | Name | URI |
|---|------|-----|
| 1 | 启用 (IEnable) | ucfbase.ucfbaseItf.IEnable |
| 2 | 租户接口 (ITenant) | ucfbase.ucfbaseItf.ITenant |
| 3 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |
| 4 | 逻辑删除相关 (LogicDelete) | ucfbase.ucfbaseItf.LogicDelete |
| 5 | 审计信息 (IAuditInfo) | ucfbase.ucfbaseItf.IAuditInfo |
| 6 | 自动编码 (IAutoCode) | ucfbase.ucfbaseItf.IAutoCode |

---

## All Fields (26)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | country | 国家地区主键 | COUNTRY | quote | bd.country.CountryVO |  |  | migrationIgnoreRef,nullable |
| 2 | busiOrg | 组织 | BUSIORG | quote | org.func.BaseOrg |  |  | isMasterOrg,nullable |
| 3 | code | 标准表编码 | CODE | text | String |  |  | isCode,isCoded,nullable |
| 4 | name | 标准表名称 | NAME | multiLanguage | String |  |  | nullable |
| 5 | memo | 说明 | MEMO | text | String |  |  | nullable |
| 6 | extension | 薪资标准特征组实体 | extension | UserDefine | hrxc.grade.waGradeCharacteristics |  |  | nullable |
| 7 | categoryid | 所属分类 | CATEGORYID | quote | hrxc.grade.WaGradeCategory |  |  | nullable |
| 8 | itemId | 对应薪资项目 | ITEM_ID | quote | hrxc.publicItem.WaItem |  |  | nullable |
| 9 | isRange | 是否宽带薪酬 | IS_RANGE | text | String |  |  | nullable |
| 10 | isAdv | 是否高级模式 | IS_ADV | text | String |  |  | nullable |
| 11 | id | 主键 | ID | text | String |  |  | nullable,uiHide,REF.ID |
| 12 | dr | 逻辑删除标识 | DR | int | Integer |  | Y | nullable,uiHide,notGenerate |
| 13 | pubts | 时间戳 | TS | timestamp | Timestamp |  |  | nullable,uiHide,isSyncKey |
| 14 | ytenant | 租户主键 | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 15 | creator | 创建人 | CREATOR | quote | base.user.BipUser |  |  | nullable |
| 16 | createTime | 创建时间 | CREATIONTIME | timestamp | Timestamp |  |  | nullable |
| 17 | enable | 是否启用 | ENABLE | int | Integer |  |  | nullable,uiDesign |
| 18 | enablets | 启用时间 | enablets | dateTime | Timestamp |  |  | nullable |
| 19 | disablets | 停用时间 | disablets | dateTime | Timestamp |  |  | nullable |
| 20 | syncFlag | 同步标识 | SYNC_FLAG | text | String |  |  | nullable |
| 21 | modifier | 修改人 | MODIFIER | quote | base.user.BipUser |  |  | nullable |
| 22 | modifyTime | 修改时间 | MODIFIEDTIME | timestamp | Timestamp |  |  | nullable |
| 23 | tenant | 租户主键(旧) | TENANTID | quote | yht.tenant.YhtTenant |  | Y | nullable,uiHide |
| 24 | waGradeAuths | 薪资标准授权 | - | - | hrxc.grade.WaGradeAuth |  |  |  |
| 25 | waGradeVersions | 薪资标准版本 | - | - | hrxc.grade.WaGradeVersion |  |  |  |
| 26 | waSettings | 薪资项目设置 | - | - | hrxc.grade.WaItemSetting |  |  |  |

---

## Reference Fields (8)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | country | 国家地区主键 | COUNTRY | bd.country.CountryVO |
| 2 | busiOrg | 组织 | BUSIORG | org.func.BaseOrg |
| 3 | categoryid | 所属分类 | CATEGORYID | hrxc.grade.WaGradeCategory |
| 4 | itemId | 对应薪资项目 | ITEM_ID | hrxc.publicItem.WaItem |
| 5 | ytenant | 租户主键 | ytenant_id | yht.tenant.YhtTenant |
| 6 | creator | 创建人 | CREATOR | base.user.BipUser |
| 7 | modifier | 修改人 | MODIFIER | base.user.BipUser |
| 8 | tenant | 租户主键(旧) | TENANTID | yht.tenant.YhtTenant |

---

## Child Tables (3)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | waGradeVersions | 薪资标准版本 | hrxc.grade.WaGradeVersion |
| 2 | waSettings | 薪资项目设置 | hrxc.grade.WaItemSetting |
| 3 | waGradeAuths | 薪资标准授权 | hrxc.grade.WaGradeAuth |
