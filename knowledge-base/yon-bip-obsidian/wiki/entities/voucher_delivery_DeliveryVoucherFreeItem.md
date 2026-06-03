---
tags: [BIP, metadata, voucher, DeliveryVoucherFreeItem]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 销售发货单表头自由自定义项 (voucher.delivery.DeliveryVoucherFreeItem)

> Platform: BIP V5 | Module: voucher | Table: deliveryvoucher_freeitem | Schema: udinghuo

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 销售发货单表头自由自定义项 |
| uri | voucher.delivery.DeliveryVoucherFreeItem |
| tableName | deliveryvoucher_freeitem |
| domain | udinghuo |
| applicationCode | SCMSA |
| superUri | ? |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

---

## All Fields (1)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | id | 销售发货单主表id | id | quote | voucher.delivery.DeliveryVoucher |  |  | nullable |

---

## Reference Fields (1)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | id | 销售发货单主表id | id | voucher.delivery.DeliveryVoucher |
