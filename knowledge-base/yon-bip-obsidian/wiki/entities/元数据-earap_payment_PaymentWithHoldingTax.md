---
tags: [BIP, 元数据, 数据字典, earap.payment.PaymentWithHoldingTax]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 付款单代扣税信息 (`earap.payment.PaymentWithHoldingTax`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `ap_payment_g_wht` | 应用: `EAP`

## 属性（22 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `bodyId` | bodyID | `body_id` | 83697b00-1e51-4a2d-a1d3-13cd2c8003f2 | `quote` |
| 2 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |
| 3 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 4 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 5 | `dtcGtxid` | dtcGtxid | `dtc_gtxid` | String | `text` |
| 6 | `dtcStatus` | dtcStatus | `dtc_status` | Integer | `int` |
| 7 | `headerId` | headerID | `header_id` | 404676ad-786c-4ee3-9996-66b853d3bebe | `quote` |
| 8 | `id` | ID | `id` | String | `text` |
| 9 | `localWhtaxAmount` | localWhtaxAmount | `local_whtax_amount` | Decimal | `number` |
| 10 | `localWhtaxBaseAmount` | localWhtaxBaseAmount | `local_whtax_base_amount` | Decimal | `number` |
| 11 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 12 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |
| 13 | `orderNo` | orderNo | `order_no` | Integer | `int` |
| 14 | `oriWhtaxAmount` | oriWhtaxAmount | `ori_whtax_amount` | Decimal | `number` |
| 15 | `oriWhtaxBaseAmount` | oriWhtaxBaseAmount | `ori_whtax_base_amount` | Decimal | `number` |
| 16 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 17 | `rowNo` | rowNo | `row_no` | Decimal | `number` |
| 18 | `whtax` | whtax | `whtax_id` | aaae292d-ebbc-4b8f-a9f7-b67bff16c947 | `quote` |
| 19 | `whtaxRate` | whtaxRate | `whtax_rate` | Decimal | `number` |
| 20 | `whtaxSubject` | whtaxSubject | `whtax_subject_id` | 01e7528c-c35c-4d33-b2aa-382b4b4f4534 | `quote` |
| 21 | `whtaxType` | whtaxType | `whtax_type_id` | affa6a3e-faa4-4896-baca-8b4da5dda6d8 | `quote` |
| 22 | `ytenantId` | ytenantID | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（8 个）

- `whtaxType` -> `taxpubdoc.taxWithholding.taxWithholdingType` () 
- `creator` -> `base.user.BipUser` () 
- `whtaxSubject` -> `bd.taxrate.TaxRateVO` () 
- `whtax` -> `taxpubdoc.taxWithholding.taxWithholdingCode` () 
- `modifier` -> `base.user.BipUser` () 
- `bodyId` -> `earap.payment.PaymentBody` (0..n) 
- `ytenantId` -> `yht.tenant.YhtTenant` () 
- `headerId` -> `earap.payable.PayableHeader` () 
