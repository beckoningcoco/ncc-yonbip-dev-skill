---
tags: [BIP, metadata, hrxc, WaItemSetting]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 薪资项目设置 (hrxc.grade.WaItemSetting)

> Platform: BIP V5 | Table: wa_item_setting | Schema: yonbip-hr-paybiz

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 薪资项目设置 |
| uri | hrxc.grade.WaItemSetting |
| tableName | wa_item_setting |
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
| 2 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |
| 3 | 逻辑删除相关 (LogicDelete) | ucfbase.ucfbaseItf.LogicDelete |
| 4 | 审计信息 (IAuditInfo) | ucfbase.ucfbaseItf.IAuditInfo |

---

## All Fields (14)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | createTime | 创建时间 | create_time | dateTime | Timestamp |  |  | nullable |
| 2 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 3 | dr | 逻辑删除标记 | dr | short | Short |  | Y | notGenerate,nullable,uiHide |
| 4 | id | ID | ID | long | Long |  |  | nullable,uiHide,REF.ID |
| 5 | isRange | 是否宽带薪酬 0:点薪制 1:宽带薪酬 | IS_RANGE | text | String |  |  | nullable |
| 6 | itemId | 薪资项目ID | ITEM_ID | quote | hrxc.publicItem.WaItem |  |  | nullable |
| 7 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 8 | modifyTime | 修改时间 | modify_time | dateTime | Timestamp |  |  | nullable |
| 9 | pkWaGrd | 薪资标准类别主键 | PK_WA_GRD | quote | hrxc.grade.WaGrade |  |  | nullable,skipReferenceCheck |
| 10 | pkWaGrdver | 版本主键 | PK_WA_GRDVER | quote | hrxc.grade.WaGradeVersion |  |  | nullable |
| 11 | pubts | 时间戳 | pubts | dateTime | Timestamp |  |  | isSyncKey,nullable,uiHide |
| 12 | showOrder | 排序 | show_order | int | Integer |  |  | nullable |
| 13 | tenant | 租户ID | tenant_id | text | String |  | Y | nullable,uiHide |
| 14 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (6)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | creator | 创建人 | creator | base.user.BipUser |
| 2 | itemId | 薪资项目ID | ITEM_ID | hrxc.publicItem.WaItem |
| 3 | modifier | 修改人 | modifier | base.user.BipUser |
| 4 | pkWaGrd | 薪资标准类别主键 | PK_WA_GRD | hrxc.grade.WaGrade |
| 5 | pkWaGrdver | 版本主键 | PK_WA_GRDVER | hrxc.grade.WaGradeVersion |
| 6 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
