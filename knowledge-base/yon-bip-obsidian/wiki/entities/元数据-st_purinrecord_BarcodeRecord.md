---
tags: [BIP, 元数据, 数据字典, 采购入库, ST, st.purinrecord.BarcodeRecord]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
parent_entity: st.purinrecord.PurInRecord
---
# 扫描 (`st.purinrecord.BarcodeRecord`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `st_barcode_detail_back` | 应用: `ST`

## 属性（37 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `batchnoId` | batchnoID | `batchno_id` | 9458cb44-2675-4988-8e64-f6a59fefed89 | `quote` |
| 2 | `invExchRate` | invExchRate | `invExchRate` | Decimal | `number` |
| 3 | `invaliddate` | invaliddate | `dInvalidDate` | Date | `date` |
| 4 | `makeRuleCode` | makeRule编码 | `makerule_code` | String | `text` |
| 5 | `org` | org | `org` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 | `quote` |
| 6 | `producedate` | producedate | `dProduceDate` | Date | `date` |
| 7 | `product` | product | `iProductid` | 9a24ef07-e188-425b-b36a-402ddbf22073 | `quote` |
| 8 | `productsku` | productsku | `iProductSkuid` | 0d86941d-5af3-4cf4-9255-4f5c74a3476f | `quote` |
| 9 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 10 | `scanTime` | scanTime | `scan_time` | DateTime | `timestamp` |
| 11 | `scanUser` | scanUser | `scan_user` | String | `text` |
| 12 | `scanUserId` | scanUserID | `scan_user_id` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 13 | `source` | source | `source` | String | `text` |
| 14 | `sourceautoid` | sourceautoid | `sourceautoid` | Long | `long` |
| 15 | `sourceid` | sourceid | `sourceid` | Long | `long` |
| 16 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 17 | `upcode` | upcode | `upcode` | String | `text` |
| 18 | `vouchId` | vouchID | `vouch_id` | f27abe81-1a48-4c58-b5fd-9a49a519276e | `quote` |
| 19 | `vouchType` | vouchType | `vouch_type` | String | `text` |
| 20 | `vouchdate` | vouchdate | `vouchdate` | Date | `date` |
| 21 | `warehouse` | warehouse | `warehouse` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 | `quote` |
| 22 | `id` | ID | `id` | Long | `long` |
| 23 | `vouchDetailId` | vouchDetailID | `vouch_detail_id` | da282394-f665-4148-b271-97b57607779a | `quote` |
| 24 | `code` | 编码 | `code` | String | `text` |
| 25 | `boxCode` | box编码 | `box_code` | String | `text` |
| 26 | `barcode` | barcode | `barcode` | String | `text` |
| 27 | `snCode` | sn编码 | `sn_code` | String | `text` |
| 28 | `scanType` | scanType | `scan_type` | ScanTypeEnum | `` |
| 29 | `qty` | qty | `qty` | Decimal | `number` |
| 30 | `unit` | unit | `unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |
| 31 | `subQty` | subQty | `subQty` | Decimal | `number` |
| 32 | `stockUnit` | stockUnit | `stock_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |
| 33 | `batchno` | batchno | `batchno` | String | `text` |
| 34 | `barcodeItem` | barcodeItem | `` | c26b3c7a-6bdb-41ca-a65a-8ba8eebb0177 | `` |
| 35 | `productn` | productn | `iProductid` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |
| 36 | `productskun` | productskun | `iProductSkuid` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 | `quote` |
| 37 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（15 个）

- `batchnoId` -> `st.batchno.Batchno` () 
- `product` -> `pc.aa.Product` () [废]
- `ytenant` -> `yht.tenant.YhtTenant` () 
- `org` -> `aa.baseorg.OrgMV` () 
- `productskun` -> `pc.product.ProductSKU` () 
- `scanUserId` -> `base.user.User` () 
- `vouchDetailId` -> `st.purinrecord.PurInRecords` () 
- `barcodeItem` -> `st.purinrecord.BarcodeRecordDefine` (1) [废]
- `warehouse` -> `aa.warehouse.Warehouse` () 
- `stockUnit` -> `pc.unit.Unit` () 
- `unit` -> `pc.unit.Unit` () 
- `productsku` -> `pc.aa.ProductSKU` () [废]
- `vouchId` -> `st.purinrecord.PurInRecord` (0..n) 
- `productn` -> `pc.product.Product` () 
- `tenant` -> `base.tenant.Tenant` () 
