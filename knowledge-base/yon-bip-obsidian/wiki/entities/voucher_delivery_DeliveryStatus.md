---
tags: [BIP, metadata, voucher, DeliveryStatus]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 发货单状态 (voucher.delivery.DeliveryStatus)

> Platform: BIP V5 | Module: voucher | Table: deliverystatus | Schema: udinghuo

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 发货单状态 |
| uri | voucher.delivery.DeliveryStatus |
| tableName | deliverystatus |
| domain | udinghuo |
| applicationCode | SCMSA |
| superUri | uorder.voucher.UorderBizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (2)

| # | Name | URI |
|---|------|-----|
| 1 | 逻辑删除相关 (Deletable) | base.itf.Deletable |
| 2 | 统一租户接口(扩展) (IYTenantExt) | ucfbase.ucfbaseItf.IYTenantExt |

---

## All Fields (14)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | code | 状态码 | cCode | text | String |  |  | nullable |
| 2 | corpId | 租户id | iCorpId | long | Long |  |  | nullable |
| 3 | created | 创建时间 | dCreated | date | Date |  |  | nullable |
| 4 | createrId | 创建人 | iCreaterId | long | Long |  |  | nullable |
| 5 | deliveryId | 发货单id | iDeliveryId | long | Long |  |  | nullable |
| 6 | enable | 是否有效 | bEnable | switch | Boolean |  |  | nullable |
| 7 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 8 | isCurrent | 是否是当前状态 | bIsCurrent | switch | Boolean |  |  | nullable |
| 9 | isDeleted | 逻辑删除标记 | iDeleted | switch | Boolean |  | Y | nullable |
| 10 | memo | 状态人备注 | cMemo | text | String |  |  | nullable |
| 11 | name | 状态名 | cName | text | String |  |  | nullable |
| 12 | order | 排序 | iOrder | int | Integer |  |  | nullable |
| 13 | pubts | 时间戳 | pubuts | timestamp | Timestamp |  |  | nullable,isSyncKey |
| 14 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (1)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
