---
tags: [BIP, metadata, voucher, VoucherMemo]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 订单备注 (voucher.salereturn.VoucherMemo)

> Platform: BIP V5 | Module: voucher | Table: vouchermemo | Schema: udinghuo

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 订单备注 |
| uri | voucher.salereturn.VoucherMemo |
| tableName | vouchermemo |
| domain | udinghuo |
| applicationCode | SCMSA |
| superUri | uorder.voucher.UorderBizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (3)

| # | Name | URI |
|---|------|-----|
| 1 | 逻辑删除相关 (Deletable) | base.itf.Deletable |
| 2 | U订货租户相关 (IUordercorp) | base.itf.IUordercorp |
| 3 | 统一租户接口(扩展) (IYTenantExt) | ucfbase.ucfbaseItf.IYTenantExt |

---

## All Fields (14)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | code | 所属单号 | cVoucherNo | text | String |  |  | nullable |
| 2 | created | 创建时间 | dCreated | timestamp | Timestamp |  |  | nullable |
| 3 | enable | 是否可编辑 | bEnable | switch | Boolean |  |  | nullable |
| 4 | id | id | id | quote | voucher.salereturn.SaleReturn |  |  | nullable,REF.ID |
| 5 | isDeleted | 逻辑删除标记 | iDeleted | switch | Boolean |  | Y | nullable |
| 6 | isEdit | 查询是否是自己的备注，如果是自己的备注才可以编辑 | isEdit | switch | Boolean |  |  | nullable |
| 7 | modified | 修改时间 | dModified | timestamp | Timestamp |  |  | nullable |
| 8 | pubts | 时间戳 | pubuts | timestamp | Timestamp |  |  | nullable,isSyncKey |
| 9 | remark | 备注内容 | cRemark | text | String |  |  | nullable |
| 10 | remarkIcon | 备注图标 | cRemarkIcon | text | String |  |  | nullable |
| 11 | uordercorp | 租户 | iCorpId | long | Long |  | Y | nullable,reportHide |
| 12 | userId | 备注用户 | iUserId | long | Long |  |  | nullable |
| 13 | voucherType | 单据类型 | cVoucherType | text | String |  |  | nullable |
| 14 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (2)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | id | id | id | voucher.salereturn.SaleReturn |
| 2 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
