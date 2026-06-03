---
tags: [BIP, metadata, hrxc, WaPayfileDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 薪资发放单明细表 (hrxc.payfile.WaPayfileDetail)

> Platform: BIP V5 | Table: wa_payfile_detail | Schema: yonbip-hr-paybiz

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 薪资发放单明细表 |
| uri | hrxc.payfile.WaPayfileDetail |
| tableName | wa_payfile_detail |
| domain | yonbip-hr-paybiz |
| applicationCode | HRXZHS_MDD |
| superUri | base.entity.BizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | ID |

## Suppliers (1)

| # | Name | URI |
|---|------|-----|
| 1 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |

---

## All Fields (26)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | pkPayFileDoc | 发放单 | PK_PAYFILE_DOC | quote | hrxc.payfile.WaPayfileDoc |  |  | nullable |
| 2 | pkPayfile | 薪资发放单 | PK_PAYFILE | quote | hrxc.payfile.WaPayfile |  |  | nullable |
| 3 | staffId | 人员主键 | STAFF_ID | quote | hred.staff.Staff |  |  | nullable |
| 4 | memo | 说明 | MEMO | text | String |  |  | nullable |
| 5 | yn1 |  | Y_N_1 | number | Decimal |  |  | nullable |
| 6 | yn2 |  | Y_N_2 | number | Decimal |  |  | nullable |
| 7 | yn3 |  | Y_N_3 | number | Decimal |  |  | nullable |
| 8 | yn4 |  | Y_N_4 | number | Decimal |  |  | nullable |
| 9 | yn5 |  | Y_N_5 | number | Decimal |  |  | nullable |
| 10 | yn6 |  | Y_N_6 | number | Decimal |  |  | nullable |
| 11 | yn7 |  | Y_N_7 | number | Decimal |  |  | nullable |
| 12 | yn8 |  | Y_N_8 | number | Decimal |  |  | nullable |
| 13 | yn9 |  | Y_N_9 | number | Decimal |  |  | nullable |
| 14 | fn5 |  | F_N_5 | number | Decimal |  |  | nullable |
| 15 | fn3 |  | F_N_3 | number | Decimal |  |  | nullable |
| 16 | fn9 |  | F_N_9 | number | Decimal |  |  | nullable |
| 17 | fn15 |  | F_N_15 | number | Decimal |  |  | nullable |
| 18 | fn45 |  | F_N_45 | number | Decimal |  |  | nullable |
| 19 | id | 主键 | ID | text | String |  |  | nullable,REF.ID |
| 20 | pubts | 时间戳 | TS | timestamp | Timestamp |  |  | nullable,isSyncKey |
| 21 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 22 | creator | 创建人 | CREATOR | quote | hred.staff.Staff |  |  | nullable |
| 23 | createTime | 创建时间 | CREATIONTIME | timestamp | Timestamp |  |  | nullable |
| 24 | modifier | 修改人 | MODIFIER | quote | hred.staff.Staff |  |  | nullable |
| 25 | modifyTime | 修改时间 | MODIFIEDTIME | timestamp | Timestamp |  |  | nullable |
| 26 | tenant | 租户主键(旧) | TENANTID | text | String |  |  | nullable |

---

## Reference Fields (6)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | pkPayFileDoc | 发放单 | PK_PAYFILE_DOC | hrxc.payfile.WaPayfileDoc |
| 2 | pkPayfile | 薪资发放单 | PK_PAYFILE | hrxc.payfile.WaPayfile |
| 3 | staffId | 人员主键 | STAFF_ID | hred.staff.Staff |
| 4 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
| 5 | creator | 创建人 | CREATOR | hred.staff.Staff |
| 6 | modifier | 修改人 | MODIFIER | hred.staff.Staff |
