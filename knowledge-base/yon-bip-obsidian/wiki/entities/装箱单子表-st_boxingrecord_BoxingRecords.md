---
tags: ["BIP", "元数据", "数据字典", "BCD", "st.boxingrecord.BoxingRecords"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 装箱单子表 (`st.boxingrecord.BoxingRecords`)

> BCD | 物理表：`st_boxingrecords`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 装箱单子表 |
| 物理表 | `st_boxingrecords` |
| domain/服务域 | `uscmpub` |
| schema | `usp_plantransportroute` |
| 所属应用 | `BCD` |
| 构建时间 | `2026-06-04 23:34:25.9420` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `rowno` | Integer | 行号 |

---

## 直接属性（76个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `rowno` | 行号 | `rowno` | Integer |
| 2 | `mainid` | 装箱单主表 | `mainid` | 06399052-9995-4dd2-9b12-af2ce7b38c64 |
| 3 | `id` | ID | `id` | Long |
| 4 | `pubts` | 时间戳 | `pubts` | DateTime |
| 5 | `source` | 来源单据类型 | `source` | String |
| 6 | `upcode` | 来源单据号 | `upcode` | String |
| 7 | `sourceid` | 来源单据ID | `sourceid` | Long |
| 8 | `sourceautoid` | 来源单据行ID | `sourceautoid` | Long |
| 9 | `upLineno` | 来源单据行号 | `up_lineno` | Decimal |
| 10 | `productn` | 物料 | `iProductid` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 11 | `productskun` | SKUID | `iProductSkuid` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 12 | `barcodeRuleId` | 条码规则 | `iBarcodeRuleId` | da284ef8-bbf6-4ba0-bb45-53214bad75a4 |
| 13 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 14 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 15 | `boxCode` | 箱码 | `box_code` | String |
| 16 | `inBoxCode` | 箱内条码 | `in_box_code` | String |
| 17 | `inBoxQty` | 箱内码个数 | `in_box_qty` | Decimal |
| 18 | `curInBoxQty` | 当前码个数 | `cur_in_box_qty` | Decimal |
| 19 | `product` | 物料id | `iProductid` | 9a24ef07-e188-425b-b36a-402ddbf22073 |
| 20 | `productsku` | SKUid | `iProductSkuid` | 0d86941d-5af3-4cf4-9255-4f5c74a3476f |
| 21 | `boxingRecordsDefineCharacter` | 子表自定义项特征组 | `boxingRecordsDefineCharacter` | 340c5a38-de52-4500-a51f-78396b3d1029 |
| 22 | `qty` | 数量 | `qty` | Decimal |
| 23 | `unit` | 主计量id | `iUnitId` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 24 | `invExchRate` | 换算率 | `invExchRate` | Decimal |
| 25 | `subQty` | 件数 | `subQty` | Decimal |
| 26 | `stockUnit` | 库存单位id | `stock_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 27 | `contactsQuantity` | 应装箱数量 | `contacts_quantity` | Decimal |
| 28 | `contactsPieces` | 应装箱件数 | `contacts_pieces` | Decimal |
| 29 | `unboxingQty` | 已拆箱数量 | `unboxing_qty` | Decimal |
| 30 | `unboxingSubQty` | 已拆箱件数 | `unboxing_sub_qty` | Decimal |
| 31 | `free1` | 颜色 | `free1` | String |
| 32 | `free2` | 测试3 | `free2` | String |
| 33 | `free3` | 定量测试 | `free3` | String |
| 34 | `free4` | 香雪产地 | `free4` | String |
| 35 | `free5` | 物料规格5 | `free5` | String |
| 36 | `free6` | 物料规格6 | `free6` | String |
| 37 | `free7` | 物料规格7 | `free7` | String |
| 38 | `free8` | 物料规格8 | `free8` | String |
| 39 | `free9` | 物料规格9 | `free9` | String |
| 40 | `free10` | 物料规格10 | `free10` | String |
| 41 | `boxingRecordsCharacteristics` | 自由项特征组 | `boxingRecordsCharacteristics` | 063d86ea-a0c2-4936-a97a-ad2e6919f0a8 |
| 42 | `batchno` | 批次号 | `sBatchNo` | String |
| 43 | `producedate` | 生产日期 | `dProduceDate` | Date |
| 44 | `invaliddate` | 有效期至 | `dInvalidDate` | Date |
| 45 | `memo` | 备注 | `cMemo` | String |
| 46 | `define1` | 批次自定义项1 | `define1` | String |
| 47 | `define2` | 批次自定义项2 | `define2` | String |
| 48 | `define3` | 批次自定义项3 | `define3` | String |
| 49 | `define4` | 批次自定义项4 | `define4` | String |
| 50 | `define5` | 批次自定义项5 | `define5` | String |
| 51 | `define6` | 批次自定义项6 | `define6` | String |
| 52 | `define7` | 批次自定义项7 | `define7` | String |
| 53 | `define8` | 批次自定义项8 | `define8` | String |
| 54 | `define9` | 批次自定义项9 | `define9` | String |
| 55 | `define10` | 批次自定义项10 | `define10` | String |
| 56 | `define11` | 批次自定义项11 | `define11` | String |
| 57 | `define12` | 批次自定义项12 | `define12` | String |
| 58 | `define13` | 批次自定义项13 | `define13` | String |
| 59 | `define14` | 批次自定义项14 | `define14` | String |
| 60 | `define15` | 批次自定义项15 | `define15` | String |
| 61 | `define16` | 批次自定义项16 | `define16` | String |
| 62 | `define17` | 批次自定义项17 | `define17` | String |
| 63 | `define18` | 批次自定义项18 | `define18` | String |
| 64 | `define19` | 批次自定义项19 | `define19` | String |
| 65 | `define20` | 批次自定义项20 | `define20` | String |
| 66 | `define21` | 批次自定义项21 | `define21` | String |
| 67 | `define22` | 批次自定义项22 | `define22` | String |
| 68 | `define23` | 批次自定义项23 | `define23` | String |
| 69 | `define24` | 批次自定义项24 | `define24` | String |
| 70 | `define25` | 批次自定义项25 | `define25` | String |
| 71 | `define26` | 批次自定义项26 | `define26` | String |
| 72 | `define27` | 批次自定义项27 | `define27` | String |
| 73 | `define28` | 批次自定义项28 | `define28` | String |
| 74 | `define29` | 批次自定义项29 | `define29` | String |
| 75 | `define30` | 批次自定义项30 | `define30` | String |
| 76 | `bodyItem` | 装箱单单子表自定义项 | `` | f606c16c-4c48-4e5d-aae8-56c31d82789f |

---

## 关联属性（13个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `product` | 物料id | `pc.aa.Product` | Service |  |
| 2 | `bodyItem` | 装箱单单子表自定义项 | `st.boxingrecord.BoxingRecordsCustomItem` | None | true |
| 3 | `productskun` | SKUID | `pc.product.ProductSKU` | Service |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `barcodeRuleId` | 条码规则 | `aa.barcoderule.BarcodeRule` | None |  |
| 6 | `boxingRecordsCharacteristics` | 自由项特征组 | `st.boxingrecord.BoxingRecordsCharacteristics` | None |  |
| 7 | `stockUnit` | 库存单位id | `pc.unit.Unit` | Service |  |
| 8 | `unit` | 主计量id | `pc.unit.Unit` | Service |  |
| 9 | `productsku` | SKUid | `pc.aa.ProductSKU` | Service |  |
| 10 | `productn` | 物料 | `pc.product.Product` | Service |  |
| 11 | `mainid` | 装箱单主表 | `st.boxingrecord.BoxingRecord` | None | true |
| 12 | `boxingRecordsDefineCharacter` | 子表自定义项特征组 | `st.boxingrecord.BoxingRecordsDefineCharacter` | None |  |
| 13 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
