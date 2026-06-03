---
tags: [BIP, metadata, hrxc, WaPayment]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 银行支付单 (hrxc.pay.WaPayment)

> Platform: BIP V5 | Table: wa_payment | Schema: yonbip-hr-paybiz

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 银行支付单 |
| uri | hrxc.pay.WaPayment |
| tableName | wa_payment |
| domain | yonbip-hr-paybiz |
| applicationCode | HRXZHS_MDD |
| superUri | base.entity.BizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | ID |

## Suppliers (2)

| # | Name | URI |
|---|------|-----|
| 1 | 租户接口 (ITenant) | ucfbase.ucfbaseItf.ITenant |
| 2 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |

---

## All Fields (22)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | pkPayfile | 发放单主键 | PK_PAYFILE | text | String |  |  | nullable |
| 2 | taxOrgId | 财务组织主键 | TAX_ORG_ID | text | String |  |  | nullable |
| 3 | paybankaccount |  | paybankaccount | text | String |  |  | nullable |
| 4 | name | 名称 | NAME | text | String |  |  | nullable,s_mul_language |
| 5 | paynums | 发薪人数 | PAYNUMS | int | Integer |  |  | nullable |
| 6 | totals |  | TOTALS | text | String |  |  | nullable |
| 7 | paymentStatus | 支付状态 | payment_status | text | String |  |  | nullable |
| 8 | itemId | 项目id | item_id | text | String |  |  | nullable |
| 9 | busiDate | 业务日期 | busi_date | timestamp | Timestamp |  |  | nullable |
| 10 | sources | 代发来源 1:界面操作 2:接口调用 | sources | int | Integer |  |  | nullable |
| 11 | paynum | 第几次代发 | paynum | text | String |  |  | nullable |
| 12 | id | 主键 | ID | text | String |  |  | nullable,REF.ID |
| 13 | dr | 逻辑删除标识 | DR | int | Integer |  |  | nullable |
| 14 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 15 | ytenant | 租户主键 | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 16 | creator | 创建人 | CREATOR | quote | hred.staff.Staff |  |  | nullable |
| 17 | createTime | 创建时间 | CREATIONTIME | timestamp | Timestamp |  |  | nullable |
| 18 | modifier | 修改人 | MODIFIER | quote | hred.staff.Staff |  |  | nullable |
| 19 | modifyTime | 修改时间 | MODIFIEDTIME | timestamp | Timestamp |  |  | nullable |
| 20 | ts | 时间戳(旧) | TS | date | Date |  |  | nullable |
| 21 | tenant | 租户主键(旧) | TENANTID | text | String |  | Y | nullable,uiHide |
| 22 | ytenant_id |  | ytenant_id | text | String |  |  | nullable |

---

## Reference Fields (3)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | ytenant | 租户主键 | ytenant_id | yht.tenant.YhtTenant |
| 2 | creator | 创建人 | CREATOR | hred.staff.Staff |
| 3 | modifier | 修改人 | MODIFIER | hred.staff.Staff |
