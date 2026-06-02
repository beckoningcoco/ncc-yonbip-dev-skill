---
tags: [BIP, 元数据, 数据字典, drft.drftbillcirculate.DrftBillCirculate]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 票据流转信息 (`drft.drftbillcirculate.DrftBillCirculate`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `drft_billcirculate` | 应用: `DRFT`

## 属性（45 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | Long | `long` |
| 2 | `noteno` | noteno | `noteno` | String | `text` |
| 3 | `currency` | currency | `currency` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |
| 4 | `notemoney` | notemoney | `notemoney` | Decimal | `number` |
| 5 | `showinvoicer` | showinvoicer | `showinvoicer` | String | `text` |
| 6 | `showreceiver` | showreceiver | `showreceiver` | String | `text` |
| 7 | `showacceptancer` | showacceptancer | `showacceptancer` | String | `text` |
| 8 | `showacceptbankacc` | showacceptbankacc | `showacceptbankacc` | String | `text` |
| 9 | `showacceptopenbank` | showacceptopenbank | `showacceptopenbank` | String | `text` |
| 10 | `notetype` | notetype | `notetype` | 1ffb45b4-f3e9-4e02-8fa0-d3429c8d7fb4 | `quote` |
| 11 | `invoicedate` | invoicedate | `invoicedate` | Date | `date` |
| 12 | `enddate` | enddate | `enddate` | Date | `date` |
| 13 | `showinvoicerbankacc` | showinvoicerbankacc | `showinvoicerbankacc` | String | `text` |
| 14 | `showInvoiceOpenbankname` | showInvoiceOpenbankname | `showInvoiceOpenbankname` | String | `text` |
| 15 | `showreceiverbankacc` | showreceiverbankacc | `showreceiverbankacc` | String | `text` |
| 16 | `showReceiveOpenbankname` | showReceiveOpenbankname | `showReceiveOpenbankname` | String | `text` |
| 17 | `istransfer` | 是否transfer | `istransfer` | Boolean | `switch` |
| 18 | `DrftBillCirculateAcptAssureList` | DrftBillCirculateAcptAssureList | `` | 8a1db473-fb49-4908-9502-9129b9c5e773 | `` |
| 19 | `DrftBillCirculateBodyList` | DrftBillCirculateBodyList | `` | e5abdd05-e4a8-42da-a6d6-6c70109a7284 | `` |
| 20 | `DrftBillCirculateDrawAssureList` | DrftBillCirculateDrawAssureList | `` | 78bdc87d-dfda-47eb-82f9-f2d57ac568c0 | `` |
| 21 | `acptcreditrating` | acptcreditrating | `acptcreditrating` | String | `text` |
| 22 | `acptratingexpdate` | acptratingexpdate | `acptratingexpdate` | String | `text` |
| 23 | `acptratingsubject` | acptratingsubject | `acptratingsubject` | String | `text` |
| 24 | `billrange` | billrange | `billrange` | String | `text` |
| 25 | `circulateflag` | circulateflag | `circulateflag` | String | `text` |
| 26 | `code` | 编码 | `code` | String | `text` |
| 27 | `createDate` | createDate | `create_date` | Date | `date` |
| 28 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |
| 29 | `creator` | 创建人 | `creator` | String | `text` |
| 30 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 31 | `drawcreditrating` | drawcreditrating | `drawcreditrating` | String | `text` |
| 32 | `drawratingexpdate` | drawratingexpdate | `drawratingexpdate` | String | `text` |
| 33 | `drawratingsubject` | drawratingsubject | `drawratingsubject` | String | `text` |
| 34 | `modifier` | 修改人 | `modifier` | String | `text` |
| 35 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 36 | `modifyDate` | modifyDate | `modify_date` | Date | `date` |
| 37 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |
| 38 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 39 | `srcpk` | srcpk | `srcpk` | String | `text` |
| 40 | `srctype` | srctype | `srctype` | String | `text` |
| 41 | `status` | 状态 | `status` | Short | `short` |
| 42 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 43 | `tplid` | tplid | `tplid` | Long | `long` |
| 44 | `vouchdate` | vouchdate | `vouchdate` | Date | `date` |
| 45 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（9 个）

- `notetype` -> `drft.billtype.BillType` () 
- `ytenant` -> `yht.tenant.YhtTenant` () 
- `DrftBillCirculateBodyList` -> `drft.drftbillcirculate.DrftBillCirculateBody` (1..n) 
- `creatorId` -> `base.user.User` () 
- `modifierId` -> `base.user.User` () 
- `DrftBillCirculateAcptAssureList` -> `drft.drftbillcirculate.DrftBillCirculateAcptAssure` (0..n) 
- `currency` -> `bd.currencytenant.CurrencyTenantVO` () 
- `DrftBillCirculateDrawAssureList` -> `drft.drftbillcirculate.DrftBillCirculateDrawAssure` (0..n) 
- `tenant` -> `base.tenant.Tenant` () 
