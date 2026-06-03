---
tags: [BIP, metadata, voucher, DeliveryAttachment]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 发货单附件 (voucher.delivery.DeliveryAttachment)

> Platform: BIP V5 | Module: voucher | Table: deliveryattachment | Schema: udinghuo

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 发货单附件 |
| uri | voucher.delivery.DeliveryAttachment |
| tableName | deliveryattachment |
| domain | udinghuo |
| applicationCode | SCMSA |
| superUri | uorder.voucher.UorderBizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (1)

| # | Name | URI |
|---|------|-----|
| 1 | 统一租户接口(扩展) (IYTenantExt) | ucfbase.ucfbaseItf.IYTenantExt |

---

## All Fields (11)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | createDate | 创建时间 | dCreateDate | date | Date |  |  | nullable |
| 2 | deliveryId | 发货单id | iDeliveryId | quote | voucher.delivery.DeliveryVoucher |  |  | nullable |
| 3 | extName | 扩展名，用来标识附件类型 | cExtName | text | String |  |  | nullable |
| 4 | fileName | 附件名称 | cFileName | text | String |  |  | nullable |
| 5 | fileSize | 文件大小 | cFileSize | text | String |  |  | nullable |
| 6 | folder | 路径 | cFolder | text | String |  |  | nullable |
| 7 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 8 | originalName | 原来的名称 | cOriginalName | text | String |  |  | nullable |
| 9 | pubts | 时间戳 | pubuts | timestamp | Timestamp |  |  | nullable,isSyncKey |
| 10 | url | 附件连接的URL | cUrl | text | String |  |  | nullable |
| 11 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (2)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | deliveryId | 发货单id | iDeliveryId | voucher.delivery.DeliveryVoucher |
| 2 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
