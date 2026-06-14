---
tags: ["BIP", "元数据", "数据字典", "ST", "st.storeout.StoreOutDetail"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 调拨出库单子表 (`st.storeout.StoreOutDetail`)

> ST | 物理表：`st_storeout_b`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 调拨出库单子表 |
| 物理表 | `st_storeout_b` |
| domain/服务域 | `ustock` |
| schema | `ustock` |
| 所属应用 | `ST` |
| 构建时间 | `2026-06-05 09:57:48.4370` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `rowno` | Integer | 行号 |

---

## 直接属性（164个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `allTotalInternalNatMoney` | 累计内部结算金额本币 | `fAllTotalInternalNatMoney` | Decimal |
| 2 | `allTotalInternalOriMoney` | 累计内部结算金额原币 | `fAllTotalInternalOriMoney` | Decimal |
| 3 | `allTotalInternalQty` | 累计待内部结算数量 | `fAllTotalInternalQty` | Decimal |
| 4 | `allTotalInternalUnit` | 累计内部结算数量主计量 | `fAllTotalInternalUnit` | Decimal |
| 5 | `autoCalcCost` | 自动计算成本 | `autoCalcCost` | Boolean |
| 6 | `groupTaskKey` | 分组任务KEY | `groupTaskKey` | String |
| 7 | `natSum` | 本币含税金额 | `natSum` | Decimal |
| 8 | `natTax` | 本币税额 | `natTax` | Decimal |
| 9 | `natTaxUnitPrice` | 本币含税单价 | `natTaxUnitPrice` | Decimal |
| 10 | `product` | 物料id | `iProductid` | 9a24ef07-e188-425b-b36a-402ddbf22073 |
| 11 | `oriMoney` | 原币无税金额 | `oriMoney` | Decimal |
| 12 | `expenseSum` | 行费用 | `expense_sum` | Decimal |
| 13 | `writeOffQtyTotal` | 累计冲销数量 | `write_off_qty_total` | Decimal |
| 14 | `writeOffUpcode` | 冲销单据号 | `write_off_upcode` | String |
| 15 | `writeOffSourceid` | 冲销线索主表id | `write_off_sourceid` | Long |
| 16 | `writeOffSourceautoid` | 冲销线索子表id | `write_off_sourceautoid` | Long |
| 17 | `writeOffUplineno` | 冲销单据行号 | `write_off_uplineno` | Decimal |
| 18 | `outCustodian` | 调出保管者 | `outCustodianid` | 0578a613-7f7f-4bec-b589-039035ca3f8a |
| 19 | `outCustodianType` | 调出保管者类型 | `outCustodian_type` | String |
| 20 | `inCustodian` | 调入保管者 | `inCustodianid` | 0578a613-7f7f-4bec-b589-039035ca3f8a |
| 21 | `inCustodianType` | 调入保管者类型 | `inCustodian_type` | String |
| 22 | `oriSum` | 原币含税金额 | `oriSum` | Decimal |
| 23 | `unitName` | 单位名称 | `cunitname` | String |
| 24 | `productn` | 物料 | `iProductid` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 25 | `productAuth` | 物料权限 | `iProductid` | 19097936-a02d-4ea4-8fa2-d3c7cb555913 |
| 26 | `productskun` | 默认SKUID | `iProductSkuid` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 27 | `externalCode` | 外部来源单号 | `externalCode` | String |
| 28 | `externalSourceid` | 外部来源ID | `externalSourceid` | String |
| 29 | `externalSourceautoid` | 外部来源行ID | `externalSourceautoid` | String |
| 30 | `mtoSalesOrderCode` | MTO销售订单单据号 | `mtoSalesOrderCode` | String |
| 31 | `mtoSalesOrderId` | MTO销售订单主表id | `mtoSalesOrderId` | Long |
| 32 | `mtoSalesOrderLineId` | MTO销售订单行id | `mtoSalesOrderLineId` | Long |
| 33 | `mtoSalesOrderLineNo` | MTO销售订单行号 | `mtoSalesOrderLineNo` | Decimal |
| 34 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 35 | `wbs` | WBS | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 |
| 36 | `activity` | 活动 | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 |
| 37 | `oriTax` | 原币税额 | `oriTax` | Decimal |
| 38 | `oriTaxUnitPrice` | 原币含税单价 | `oriTaxUnitPrice` | Decimal |
| 39 | `oriUnitPrice` | 原币无税单价 | `oriUnitPrice` | Decimal |
| 40 | `sourceMainPubts` | 时间戳 | `sourceMainPubts` | DateTime |
| 41 | `stockSensClue` | 现存量特征敏感线索 | `stockSensClue` | String |
| 42 | `storeOutDetailCharacteristics` | 自由项特征组 | `storeOutDetailCharacteristics` | 34b44215-a4c7-4765-af86-a844a9b6737d |
| 43 | `storeOutDetailDefineCharacter` | 自定义项特征组 | `storeOutDetailDefineCharacter` | f6f8eee3-9344-4f05-b029-eaa807722754 |
| 44 | `taxRate` | 税率 | `taxRate` | Decimal |
| 45 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 46 | `isScrap` | 是否废品 | `isScrap` | Boolean |
| 47 | `lineno` | 行号 | `lineno` | Decimal |
| 48 | `free1` | 物料规格1 | `free1` | String |
| 49 | `free2` | 物料规格2 | `free2` | String |
| 50 | `free3` | 物料规格3 | `free3` | String |
| 51 | `free4` | 物料规格4 | `free4` | String |
| 52 | `free5` | 物料规格5 | `free5` | String |
| 53 | `free6` | 物料规格6 | `free6` | String |
| 54 | `free7` | 物料规格7 | `free7` | String |
| 55 | `free8` | 物料规格8 | `free8` | String |
| 56 | `free9` | 物料规格9 | `free9` | String |
| 57 | `free10` | 物料规格10 | `free10` | String |
| 58 | `batchno` | 批次号 | `sBatchNo` | String |
| 59 | `producedate` | 生产日期 | `dProduceDate` | Date |
| 60 | `invaliddate` | 有效期至 | `dInvalidDate` | Date |
| 61 | `inventoryowner` | 货主对象 | `inventoryowner` | af1b583d-f5e4-4f7c-bba5-66d570ef7e3e |
| 62 | `ownertype` | 货权归属 | `ownertype` | Integer |
| 63 | `propertyRightsTransferred` | 已货权转移 | `propertyRightsTransferred` | Boolean |
| 64 | `recorddate` | 出库日期 | `drecorddate` | Date |
| 65 | `isUpdateCost` | 更新存货成本 | `isUpdateCost` | Boolean |
| 66 | `productsku` | SKU | `iProductSkuid` | 0d86941d-5af3-4cf4-9255-4f5c74a3476f |
| 67 | `mainid` | 主表id | `imainid` | 50774931-ab56-416c-ab19-6af097f02e54 |
| 68 | `rowno` | 行号 | `rowno` | Integer |
| 69 | `id` | ID | `id` | Long |
| 70 | `pubts` | 时间戳 | `pubts` | DateTime |
| 71 | `srcBillRow` | 来源行ID | `isrcbillbid` | String |
| 72 | `markPrice` | 建议零售价 | `markPrice` | Decimal |
| 73 | `goodsposition` | 货位id | `iGoodsPositionId` | 79b90356-9fc7-4bc2-ac1a-400520fa80cc |
| 74 | `stockStatusDoc` | 库存状态 | `stockStatusDoc` | 5275f074-3e60-4b90-9771-20970f1e905c |
| 75 | `contactsQuantity` | 应发数量 | `issueQty` | Decimal |
| 76 | `contactsPieces` | 应发件数 | `issueNum` | Decimal |
| 77 | `qty` | 数量 | `dquantity` | Decimal |
| 78 | `unit` | 主计量id | `iunitid` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 79 | `invExchRate` | 换算率 | `invExchRate` | Decimal |
| 80 | `subQty` | 件数 | `subQty` | Decimal |
| 81 | `stockUnitId` | 库存单位id | `stockUnitId` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 82 | `costprice` | 成本价 | `costprice` | Decimal |
| 83 | `costmoney` | 成本金额_备用 | `costmoney` | Decimal |
| 84 | `natUnitPrice` | 成本单价 | `natUnitPrice` | Decimal |
| 85 | `natMoney` | 成本金额 | `natMoney` | Decimal |
| 86 | `finishinqty` | 已入库数量 | `fFinishInQty` | Decimal |
| 87 | `finishinnum` | 已入库件数 | `fFinishInNum` | Decimal |
| 88 | `project` | 项目id | `iProject` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 |
| 89 | `firstsource4transfer` | 调拨源头单据类型 | `firstsource4transfer` | String |
| 90 | `source` | 上游单据类型 | `source` | String |
| 91 | `firstsourceid4transfer` | 调拨源头单据主表id | `firstsourceid4transfer` | Long |
| 92 | `sourceid` | 上游单据主表id | `sourceid` | Long |
| 93 | `firstsourceautoid4transfer` | 调拨源头单据子表id | `firstsourceautoid4transfer` | Long |
| 94 | `sourceautoid` | 上游单据子表id | `sourceautoid` | Long |
| 95 | `upcode` | 上游单据号 | `upcode` | String |
| 96 | `firstupcode4transfer` | 调拨源头单据号 | `firstupcode4transfer` | String |
| 97 | `makeRuleCode` | 生单规则编号 | `makerule_code` | String |
| 98 | `firstsource` | 调拨订单类型 | `firstsource` | String |
| 99 | `firstsourceid` | 调拨订单主表id | `firstsourceid` | Long |
| 100 | `uplineno` | 来源单据行号 | `uplineno` | Decimal |
| 101 | `firstsourceautoid` | 调拨订单子表id | `firstsourceautoid` | Long |
| 102 | `sourceOrderlineno` | 来源订单行号 | `sourceOrderlineno` | Decimal |
| 103 | `firstupcode` | 调拨订单单号 | `firstupcode` | String |
| 104 | `firstuplineno` | 调拨订单行号 | `firstuplineno` | Decimal |
| 105 | `unitExchangeType` | 库存换算率换算方式 | `unitExchangeType` | Integer |
| 106 | `memo` | 备注 | `cmemo` | String |
| 107 | `outreserveid` | 调出预留对象 | `outreserveid` | fdc23f28-4a7f-46e8-844b-345f01c13996 |
| 108 | `inreserveid` | 调入预留对象 | `inreserveid` | fdc23f28-4a7f-46e8-844b-345f01c13996 |
| 109 | `returnsourceid` | 退货申请主表id | `returnsourceid` | Long |
| 110 | `returnsourceautoid` | 退货申请子表id | `returnsourceautoid` | Long |
| 111 | `pickreqId` | 领料申请主表id | `pickreq_id` | Long |
| 112 | `pickreqAutoid` | 领料申请子表id | `pickreq_autoid` | Long |
| 113 | `stockType` | 库存类型ID | `stockType` | de7a641c-45f2-4b85-8424-2ed8acf02456 |
| 114 | `processid` | 工序ID | `process_id` | Long |
| 115 | `operationId` | 标准工序id | `operation_id` | Long |
| 116 | `operationCode` | 工序编码 | `operation_code` | String |
| 117 | `operationName` | 工序名称 | `operation_name` | String |
| 118 | `processsn` | 工序顺序号 | `process_sn` | String |
| 119 | `retailMoney` | 零售金额 | `retailMoney` | Decimal |
| 120 | `retailUnitPrice` | 零售单价 | `retailUnitPrice` | Decimal |
| 121 | `receivedQuantity` | 已(签收+差异)数量 | `receivedQuantity` | Decimal |
| 122 | `auditedReceivedQuantity` | 已审签收数量 | `auditedReceivedQuantity` | Decimal |
| 123 | `auditedReceivedDiffQty` | 已审签收差异数量 | `auditedReceivedDiffQty` | Decimal |
| 124 | `orderSource` | 来源订单类型 | `orderSource` | String |
| 125 | `orderCode` | 来源订单号 | `orderCode` | String |
| 126 | `orderSourceid` | 来源订单ID | `orderSourceid` | Long |
| 127 | `orderSourceautoid` | 来源订单行ID | `orderSourceautoid` | Long |
| 128 | `orderSourceGrandchildrenId` | 来源订单孙ID | `orderSourceGrandchildrenId` | Long |
| 129 | `bodyItem` | 调拨出库单子表自定义项 | `` | f63e16a7-567b-43dd-ac31-0bf7bf9cc260 |
| 130 | `bodyParallel` | 调拨出库单子表平行表 | `` | ce42dfbf-50c9-4639-b648-e7bbd0ce145a |
| 131 | `define1` | 自定义项1 | `define1` | String |
| 132 | `define10` | 自定义项10 | `define10` | String |
| 133 | `define11` | 自定义项11 | `define11` | String |
| 134 | `define12` | 自定义项12 | `define12` | String |
| 135 | `define13` | 自定义项13 | `define13` | String |
| 136 | `define14` | 自定义项14 | `define14` | String |
| 137 | `define15` | 自定义项15 | `define15` | String |
| 138 | `define16` | 自定义项16 | `define16` | String |
| 139 | `define17` | 自定义项17 | `define17` | String |
| 140 | `define18` | 自定义项18 | `define18` | String |
| 141 | `define19` | 自定义项19 | `define19` | String |
| 142 | `define2` | 自定义项2 | `define2` | String |
| 143 | `define20` | 自定义项20 | `define20` | String |
| 144 | `define21` | 自定义项21 | `define21` | String |
| 145 | `define22` | 自定义项22 | `define22` | String |
| 146 | `define23` | 自定义项23 | `define23` | String |
| 147 | `define24` | 自定义项24 | `define24` | String |
| 148 | `define25` | 自定义项25 | `define25` | String |
| 149 | `define26` | 自定义项26 | `define26` | String |
| 150 | `define27` | 自定义项27 | `define27` | String |
| 151 | `define28` | 自定义项28 | `define28` | String |
| 152 | `define29` | 自定义项29 | `define29` | String |
| 153 | `define3` | 自定义项3 | `define3` | String |
| 154 | `define30` | 自定义项30 | `define30` | String |
| 155 | `define4` | 自定义项4 | `define4` | String |
| 156 | `define5` | 自定义项5 | `define5` | String |
| 157 | `define6` | 自定义项6 | `define6` | String |
| 158 | `define7` | 自定义项7 | `define7` | String |
| 159 | `define8` | 自定义项8 | `define8` | String |
| 160 | `define9` | 自定义项9 | `define9` | String |
| 161 | `defines` | 调拨出库单子表自由自定义项 | `` | 2d7b3b80-ab3e-439b-8e62-8ccea8e26eb2 |
| 162 | `invExchRateDen` | 换算率分母 | `invexchrateden` | Decimal |
| 163 | `invExchRateNum` | 换算率分子 | `invexchratenum` | Decimal |
| 164 | `storeOutDetailSNs` | 调拨出库单序列号 | `` | 569fd530-1c81-499b-ad3b-6d2cbf9882b9 |

---

## 关联属性（27个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `activity` | 活动 | `pgrm.projecttask.ProjectScheduleTask` | Service |  |
| 2 | `productskun` | 默认SKUID | `pc.product.ProductSKU` | Service |  |
| 3 | `stockStatusDoc` | 库存状态 | `st.stockStatusRecord.stockStatusRecord` | None |  |
| 4 | `project` | 项目id | `bd.project.ProjectVO` | Service |  |
| 5 | `wbs` | WBS | `BGDM.wbs.wbs_doc` | Service |  |
| 6 | `defines` | 调拨出库单子表自由自定义项 | `st.storeout.StoreOutDetailAttrextItem` | None | true |
| 7 | `outCustodian` | 调出保管者 | `st.custodian.Custodian` | None |  |
| 8 | `inCustodian` | 调入保管者 | `st.custodian.Custodian` | None |  |
| 9 | `storeOutDetailCharacteristics` | 自由项特征组 | `st.storeout.StoreOutDetailCharacteristics` | None |  |
| 10 | `goodsposition` | 货位id | `aa.goodsposition.GoodsPosition` | Service |  |
| 11 | `mainid` | 主表id | `st.storeout.StoreOut` | None | true |
| 12 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
| 13 | `product` | 物料id | `pc.aa.Product` | Service |  |
| 14 | `bodyItem` | 调拨出库单子表自定义项 | `st.storeout.StoreOutDetailCustomItem` | None | true |
| 15 | `stockType` | 库存类型ID | `st.stocktype.StockType` | None |  |
| 16 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 17 | `bodyParallel` | 调拨出库单子表平行表 | `st.storeout.StoreOutDetailParallel` | None | true |
| 18 | `outreserveid` | 调出预留对象 | `st.reservation.Reservation` | None |  |
| 19 | `storeOutDetailSNs` | 调拨出库单序列号 | `st.storeout.StoreOutDetailSN` | None | true |
| 20 | `unit` | 主计量id | `pc.unit.Unit` | Service |  |
| 21 | `productsku` | SKU | `pc.aa.ProductSKU` | Service |  |
| 22 | `productn` | 物料 | `pc.product.Product` | Service |  |
| 23 | `storeOutDetailDefineCharacter` | 自定义项特征组 | `st.storeout.StoreOutDetailDefineCharacter` | None |  |
| 24 | `productAuth` | 物料权限 | `pb.dataauth.ProductDataAuth` | None |  |
| 25 | `inreserveid` | 调入预留对象 | `st.reservation.Reservation` | None |  |
| 26 | `inventoryowner` | 货主对象 | `st.inventoryowner.InventoryOwner` | None |  |
| 27 | `stockUnitId` | 库存单位id | `pc.unit.Unit` | Service |  |
