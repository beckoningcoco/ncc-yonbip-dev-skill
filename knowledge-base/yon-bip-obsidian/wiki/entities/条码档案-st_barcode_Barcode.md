---
tags: ["BIP", "元数据", "数据字典", "BCD", "st.barcode.Barcode"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 条码档案 (`st.barcode.Barcode`)

> BCD | 物理表：`st_barcode`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 条码档案 |
| 物理表 | `st_barcode` |
| 数据库 schema | `uscmpub` |
| 所属应用 | `BCD` |
| 构建时间 | `2026-06-04 23:33:45.3100` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（130个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | ID | `id` | Long |
| 2 | `tplid` | 模板id | `tplid` | Long |
| 3 | `code` | 编码 | `code` | String |
| 4 | `barcode` | 条码 | `barcode` | String |
| 5 | `barcodeType` | 条码类型 | `barcode_type` | Short |
| 6 | `productsku` | SKUid | `iProductSkuid` | 0d86941d-5af3-4cf4-9255-4f5c74a3476f |
| 7 | `snCode` | 序列号 | `sn_code` | String |
| 8 | `modifier` | 修改人名称 | `modifier` | String |
| 9 | `sourceType` | 来源 | `source_type` | String |
| 10 | `upLineno` | 来源单据行号 | `up_lineno` | Decimal |
| 11 | `serialNumber` | 流水号 | `serial_number` | String |
| 12 | `productn` | 物料 | `iProductid` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 13 | `serialNumberBasis` | 生码流水依据 | `serial_number_basis` | String |
| 14 | `bustype` | 交易类型 | `bustype` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 15 | `custodian` | 保管者 | `custodianid` | 0578a613-7f7f-4bec-b589-039035ca3f8a |
| 16 | `custodianType` | 保管者类型 | `custodian_type` | String |
| 17 | `inventoryowner` | 货主 | `inventoryowner` | af1b583d-f5e4-4f7c-bba5-66d570ef7e3e |
| 18 | `location` | 货位 | `ilocationid` | 79b90356-9fc7-4bc2-ac1a-400520fa80cc |
| 19 | `ownertype` | 货权归属 | `ownertype` | Decimal |
| 20 | `define1` | 自定义项1 | `define1` | String |
| 21 | `define2` | 自定义项2 | `define2` | String |
| 22 | `define3` | 自定义项3 | `define3` | String |
| 23 | `define4` | 自定义项4 | `define4` | String |
| 24 | `define5` | 自定义项5 | `define5` | String |
| 25 | `define6` | 自定义项6 | `define6` | String |
| 26 | `define7` | 自定义项7 | `define7` | String |
| 27 | `define8` | 自定义项8 | `define8` | String |
| 28 | `define9` | 自定义项9 | `define9` | String |
| 29 | `define10` | 自定义项10 | `define10` | String |
| 30 | `define11` | 自定义项11 | `define11` | String |
| 31 | `define12` | 自定义项12 | `define12` | String |
| 32 | `define13` | 自定义项13 | `define13` | String |
| 33 | `define14` | 自定义项14 | `define14` | String |
| 34 | `define15` | 自定义项15 | `define15` | String |
| 35 | `define16` | 自定义项16 | `define16` | String |
| 36 | `define17` | 自定义项17 | `define17` | String |
| 37 | `define18` | 自定义项18 | `define18` | String |
| 38 | `define19` | 自定义项19 | `define19` | String |
| 39 | `define20` | 自定义项20 | `define20` | String |
| 40 | `define21` | 自定义项21 | `define21` | String |
| 41 | `define22` | 自定义项22 | `define22` | String |
| 42 | `define23` | 自定义项23 | `define23` | String |
| 43 | `define24` | 自定义项24 | `define24` | String |
| 44 | `define25` | 自定义项25 | `define25` | String |
| 45 | `define26` | 自定义项26 | `define26` | String |
| 46 | `define27` | 自定义项27 | `define27` | String |
| 47 | `define28` | 自定义项28 | `define28` | String |
| 48 | `define29` | 自定义项29 | `define29` | String |
| 49 | `define30` | 自定义项30 | `define30` | String |
| 50 | `stopstatus` | 停用状态 | `stopstatus` | Boolean |
| 51 | `stoptime` | 停用时间 | `stop_time` | DateTime |
| 52 | `productskun` | SKUID | `iProductSkuid` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 53 | `originQty` | 条码原始数量 | `origin_qty` | Decimal |
| 54 | `originSubQty` | 条码原始件数 | `origin_subqty` | Decimal |
| 55 | `previewPrintCount` | 预览打印次数 | `previewPrintCount` | Integer |
| 56 | `directPrintCount` | 直接打印次数 | `directPrintCount` | Integer |
| 57 | `printCount` | 打印次数 | `printCount` | Integer |
| 58 | `srcBillSubQty` | 来源单据件数 | `src_bill_subqty` | Decimal |
| 59 | `srcBillQty` | 来源单据数量 | `src_bill_qty` | Decimal |
| 60 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 61 | `groupTaskKey` | 分组任务KEY | `groupTaskKey` | String |
| 62 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 63 | `salesOrderLineNum` | 销售订单行号 | `salesOrder_linenum` | Long |
| 64 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 65 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 66 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 67 | `sourceMainPubts` | 时间戳 | `sourceMainPubts` | DateTime |
| 68 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 69 | `sourceVouchDate` | 来源单据日期 | `sourceVouchDate` | Date |
| 70 | `product` | 物料id | `iProductid` | 9a24ef07-e188-425b-b36a-402ddbf22073 |
| 71 | `free1` | 颜色 | `free1` | String |
| 72 | `free2` | 规格2 | `free2` | String |
| 73 | `free3` | 规格3 | `free3` | String |
| 74 | `free4` | 规格4 | `free4` | String |
| 75 | `free5` | 规格5 | `free5` | String |
| 76 | `free6` | 规格6 | `free6` | String |
| 77 | `free7` | 规格7 | `free7` | String |
| 78 | `free8` | 规格8 | `free8` | String |
| 79 | `free9` | 规格9 | `free9` | String |
| 80 | `free10` | 规格10 | `free10` | String |
| 81 | `barcodeCharacteristics` | 自由项特征组 | `barcodeCharacteristics` | 25168fdb-62e7-42c8-b4e3-d65a26f130af |
| 82 | `barcodeDefineCharacter` | 自定义项特征组 | `barcodeDefineCharacter` | 63fd4015-b137-4790-bf8d-3f30a28faa11 |
| 83 | `barcodeRule` | 条码规则id | `barcode_rule` | da284ef8-bbf6-4ba0-bb45-53214bad75a4 |
| 84 | `barcodeTag` | 条码标签ID | `barcode_tag` | 8310c56b-8188-42ea-a660-5a1077fc9e63 |
| 85 | `barcodeBasis` | 生成条码数依据 | `barcode_basis` | String |
| 86 | `barcodePackingQuantity` | 条码包装量 | `barcode_packing_quantity` | Decimal |
| 87 | `barcodeQty` | 条码个数 | `barcode_qty` | Decimal |
| 88 | `qty` | 数量 | `qty` | Decimal |
| 89 | `unit` | 主计量id | `iUnitId` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 90 | `invExchRate` | 换算率 | `invExchRate` | Decimal |
| 91 | `subQty` | 件数 | `subQty` | Decimal |
| 92 | `stockUnit` | 库存单位id | `stock_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 93 | `batchnoId` | 批次id | `batchno_id` | 9458cb44-2675-4988-8e64-f6a59fefed89 |
| 94 | `batchno` | 批次号 | `batchno` | String |
| 95 | `producedate` | 生产日期 | `dProduceDate` | Date |
| 96 | `pubts` | 时间戳 | `pubts` | DateTime |
| 97 | `invaliddate` | 有效期至 | `dInvalidDate` | Date |
| 98 | `snid` | 序列号id | `snid` | 4bb2bc3d-effd-4ebd-bde2-2d925594d47e |
| 99 | `reserveid` | 预留对象id | `reserveid` | fdc23f28-4a7f-46e8-844b-345f01c13996 |
| 100 | `billOrg` | 库存组织id | `iOrgid` | c1135e08-c4bf-4499-90bf-67030d1f2654 |
| 101 | `warehouse` | 仓库id | `iWarehouseId` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 102 | `vendor` | 供应商id | `iVendorId` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 103 | `custom` | 客户id | `custom` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 |
| 104 | `department` | 部门id | `department` | 8e8fa65a-f8d9-454d-a8f8-4b7af543cdd5 |
| 105 | `upuOperator` | 采购员id | `upu_operator` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 106 | `salesOperator` | 销售员id | `sales_operator` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 107 | `stockMgr` | 库管员id | `stock_mgr` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 108 | `operator` | 业务员id | `operator` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 109 | `source` | 来源单据类型 | `source` | String |
| 110 | `upcode` | 来源单据号 | `upcode` | String |
| 111 | `sourceid` | 来源单据行 | `sourceid` | Long |
| 112 | `sourceautoid` | 来源单据子行 | `sourceautoid` | Long |
| 113 | `productionOrderNum` | 生产订单号 | `production_ordernum` | Long |
| 114 | `productionOrderLineNum` | 生产订单行号 | `production_orderlinenum` | Long |
| 115 | `osminrecordNum` | 委外订单号 | `osminrecord_num` | Long |
| 116 | `osminrecordLineNum` | 委外订单行号 | `osminrecord_linenum` | Long |
| 117 | `purchaseorderNum` | 采购订单号 | `purchaseorder_num` | Long |
| 118 | `purchaseorderLineNum` | 采购订单行号 | `purchaseorder_linenum` | Long |
| 119 | `salesOrderNum` | 销售订单号 | `sales_ordernum` | Long |
| 120 | `scanStatus` | 条码最新扫描状态 | `scan_status` | Short |
| 121 | `stockStatusDoc` | 启用状态 | `stockStatusDoc` | 5275f074-3e60-4b90-9771-20970f1e905c |
| 122 | `status` | 单据状态 | `status` | Short |
| 123 | `makeRuleCode` | 生单规则编号 | `makerule_code` | String |
| 124 | `vouchdate` | 生成日期 | `vouchdate` | Date |
| 125 | `creator` | 创建人 | `creator` | String |
| 126 | `createTime` | 创建时间 | `create_time` | DateTime |
| 127 | `createDate` | 创建日期 | `create_date` | Date |
| 128 | `barcodeItem` | 条码自定义项 | `` | fe2d896a-7139-4d17-ae64-30922d23cf6a |
| 129 | `bodyItem` | 条码档案单行自定义项 | `` | 9b7cb88d-5655-4b66-a261-422c03b9e67d |
| 130 | `headItem` | 条码档案单头自定义项 | `` | ffa31d4c-a101-422f-864f-f3832d1ebec1 |

---

## 关联属性（34个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `barcodeRule` | 条码规则id | `aa.barcoderule.BarcodeRule` | None |  |
| 2 | `batchnoId` | 批次id | `st.batchno.Batchno` | Service |  |
| 3 | `snid` | 序列号id | `sn.serialnumber.SNstate` | Service |  |
| 4 | `barcodeDefineCharacter` | 自定义项特征组 | `st.barcode.BarcodeDefineCharacter` | None |  |
| 5 | `reserveid` | 预留对象id | `st.reservation.Reservation` | Service |  |
| 6 | `productskun` | SKUID | `pc.product.ProductSKU` | Service |  |
| 7 | `stockStatusDoc` | 启用状态 | `st.stockStatusRecord.stockStatusRecord` | Service |  |
| 8 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 9 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 10 | `upuOperator` | 采购员id | `bd.staff.Staff` | Service |  |
| 11 | `barcodeTag` | 条码标签ID | `aa.barcodetag.BarcodeTag` | None |  |
| 12 | `operator` | 业务员id | `bd.staff.Staff` | Service |  |
| 13 | `vendor` | 供应商id | `aa.vendor.Vendor` | Service |  |
| 14 | `department` | 部门id | `aa.baseorg.DeptMV` | Service |  |
| 15 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
| 16 | `product` | 物料id | `pc.aa.Product` | Service |  |
| 17 | `bodyItem` | 条码档案单行自定义项 | `st.barcode.BarcodeBodyCustomItem` | None | true |
| 18 | `custodian` | 保管者 | `st.custodian.Custodian` | Service |  |
| 19 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 20 | `custom` | 客户id | `aa.merchant.Merchant` | Service |  |
| 21 | `barcodeCharacteristics` | 自由项特征组 | `st.barcode.BarcodeCharacteristics` | None |  |
| 22 | `stockMgr` | 库管员id | `bd.staff.Staff` | Service |  |
| 23 | `headItem` | 条码档案单头自定义项 | `st.barcode.BarcodeHeadCustomItem` | None | true |
| 24 | `barcodeItem` | 条码自定义项 | `st.barcode.BarcodeDefine` | None | true |
| 25 | `warehouse` | 仓库id | `aa.warehouse.Warehouse` | Service |  |
| 26 | `billOrg` | 库存组织id | `aa.baseorg.InventoryOrgMV` | Service |  |
| 27 | `bustype` | 交易类型 | `bd.bill.TransType` | Service |  |
| 28 | `stockUnit` | 库存单位id | `pc.unit.Unit` | Service |  |
| 29 | `unit` | 主计量id | `pc.unit.Unit` | Service |  |
| 30 | `productsku` | SKUid | `pc.aa.ProductSKU` | Service |  |
| 31 | `salesOperator` | 销售员id | `bd.staff.Staff` | Service |  |
| 32 | `productn` | 物料 | `pc.product.Product` | Service |  |
| 33 | `location` | 货位 | `aa.goodsposition.GoodsPosition` | Service |  |
| 34 | `inventoryowner` | 货主 | `st.inventoryowner.InventoryOwner` | Service |  |
