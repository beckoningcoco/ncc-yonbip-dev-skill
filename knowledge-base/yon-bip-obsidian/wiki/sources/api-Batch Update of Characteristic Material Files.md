---
title: "特征物料档案批量更新"
apiId: "1962974052157489155"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Material"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Material]
platform_version: "BIP"
source_type: community-api-docs
---

# 特征物料档案批量更新

> `ContentType	application/json` 请求方式	POST | 分类: Material (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/product/batchupdate

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| orgCode | string | 否 | 否 | 管理组织编码(组织id和编码二选一，同时填入时以code为准) 示例：666666 示例：global00 |
| orgId | string | 否 | 否 | 管理组织id(组织id和编码二选一，同时填入时以code为准) 示例：666666 示例：666666 |
| code | string | 否 | 是 | 物料编码 示例：0012000488 |
| name | object | 否 | 否 | 物料名称,支持多语 |
| simplifiedName | string | 否 | 否 | 简体 示例：简体 |
| englishName | string | 否 | 否 | 英文 示例：英文 |
| traditionalName | string | 否 | 否 | 繁体 示例：繁体 |
| modelDescription | object | 否 | 否 | 规格说明,支持多语 |
| simplifiedName | string | 否 | 否 | 简体 示例：简体 |
| englishName | string | 否 | 否 | 英文 示例：英文 |
| traditionalName | string | 否 | 否 | 繁体 示例：繁体 |
| model | object | 否 | 否 | 型号,支持多语 |
| simplifiedName | string | 否 | 否 | 简体 示例：简体 |
| englishName | string | 否 | 否 | 英文 示例：英文 |
| traditionalName | string | 否 | 否 | 繁体 示例：繁体 |
| erpCode | string | 否 | 否 | 外部编码 示例：12345 |
| useSku | int | 否 | 否 | 商品SKU，（1-是，0-否）；为是时表示需要物料建档+SKU建档来满足业务需要，支持自动勾选/手工勾选，销售渠道字段非空/物料模板定义了敏感SKU的自定义特征，商品SKU自动勾选。为否时表示物料建档即可满足业务需要，不涉及SKU建档，从“是” 改为“否”，需删除物料对应全部SKU。 示例：1 |
| optionalMaterial | int | 否 | 否 | 特征-是否可选配,0代表否，1代表是。只有特征租户才有用，当是否可选配为是时，是否派生物料默认为否无需传参，并且选配物料只能为空。当是否可选配为否时，是否派生物料可以为是也可以为否，当是否派生物料为是时，选配物料必填。 示例：0 |
| derivedMaterial | int | 否 | 否 | 特征-是否派生物料，0代表否，1代表是。只有特征租户才有用，当是否可选配为是时，是否派生物料默认为否无需传参，并且选配物料只能为空。当是否可选配为否时，是否派生物料可以为是也可以为否，当是否派生物料为是时，选配物料必填。 示例：0 |
| optionalMaterialCode | string | 否 | 否 | 特征-选配物料编码(id和编码二选一选填，同时填入时以code为准)。只有特征租户才有用，当是否可选配为是时，是否派生物料默认为否无需传参，并且选配物料只能为空。当是否可选配为否时，是否派生物料可以为是也可以为否，当是否派生物料为是时，选配物料必填。 示例：0012000490 |
| optionalMaterialId | long | 否 | 否 | 特征-选配物料ID。只有特征租户才有用，当是否可选配为是时，是否派生物料默认为否无需传参，并且选配物料只能为空。当是否可选配为否时，是否派生物料可以为是也可以为否，当是否派生物料为是时，选配物料必填。 示例：2005891633021714400 |
| detail | object | 否 | 否 | 物料详情 |
| shortName | string | 否 | 否 | 物料简称 示例：物料01 |
| mnemonicCode | string | 否 | 否 | 助记码 示例：WL01 |
| erpOuterCode | string | 否 | 否 | 商家商品外部编码 示例：12345 |
| barCode | string | 否 | 否 | 条形码 示例：12345 |
| inspectionType | int | 否 | 否 | 检验，1代表是，0代表否。当检验为否时，根据检验结果入库默认为否且不可改变，检验规则只能为空。检验为是时，根据检验结果入库可以选择是或者否，检验规则可选择0（代表按物料检验）或1（代表按检验项目检验）。 示例：0 |
| warehousingByResult | boolean | 否 | 否 | 根据检验结果入库，true代表是，false代表否。当检验为否时，根据检验结果入库默认为否且不可改变，检验规则只能为空。检验为是时，根据检验结果入库可以选择是或者否，检验规则可选择0（代表按物料检验）或1（代表按检验项目检验）。 示例：false |
| testRule | int | 否 | 否 | 检验规则，0代表按物料检验，1代表按检验项目检验。当检验为否时，根据检验结果入库默认为否且不可改变，检验规则只能为空。检验为是时，根据检验结果入库可以选择是或者否，检验规则可选择0（代表按物料检验）或1（代表按检验项目检验）。 示例：1 |
| businessAttribute | string | 否 | 否 | 业务属性, 1:采购、7:销售、3:自制、2:委外,可多选，逗号分隔 示例：1,7 |
| saleChannel | string | 否 | 否 | 销售渠道, 1:销售批发、2:线上零售、3:线下零售、4:微分销，可多选，逗号分隔 示例：1,2,3 |
| purchaseUnit | long | 否 | 否 | 采购单位id(id和编码二选一，同时填入时以code为准) 示例：1955228568170528800 |
| purchaseUnitCode | string | 否 | 否 | 采购单位编码(id和编码二选一，同时填入时以code为准) 示例：KGM |
| inspectionUnit | long | 否 | 否 | 检验单位id(id和编码二选一，同时填入时以code为准) 示例：1955228568170528800 |
| inspectionUnitCode | string | 否 | 否 | 检验单位编码(id和编码二选一，同时填入时以code为准) 示例：KGM |
| purchasePriceUnit | long | 否 | 否 | 采购计价单位id(id和编码二选一，同时填入时以code为准) 示例：1955228568170528800 |
| purchasePriceUnitCode | string | 否 | 否 | 采购计价单位编码(id和编码二选一，同时填入时以code为准) 示例：KGM |
| stockUnit | long | 否 | 否 | 库存单位id(id和编码二选一，同时填入时以code为准) 示例：1955228568170528800 |
| stockUnitCode | string | 否 | 否 | 库存单位编码(id和编码二选一，同时填入时以code为准) 示例：KGM |
| produceUnit | long | 否 | 否 | 生产单位id(id和编码二选一，同时填入时以code为准) 示例：1955228568170528800 |
| produceUnitCode | string | 否 | 否 | 生产单位编码(id和编码二选一，同时填入时以code为准) 示例：KGM |
| batchPriceUnit | long | 否 | 否 | 批发计价单位id(id和编码二选一，同时填入时以code为准) 示例：1955228568170528800 |
| batchPriceUnitCode | string | 否 | 否 | 批发计价单位编码(id和编码二选一，同时填入时以code为准) 示例：KGM |
| batchUnit | long | 否 | 否 | 批发销售单位id(id和编码二选一，同时填入时以code为准) 示例：1955228568170528800 |
| batchUnitCode | string | 否 | 否 | 批发销售单位编码(id和编码二选一，同时填入时以code为准) 示例：KGM |
| remark | object | 否 | 否 | 备注，支持多语 |
| reservation | boolean | 否 | 否 | 是否可预留：true是，false否 示例：false |
| onlineUnit | long | 否 | 否 | 线上零售单位id(id和编码二选一，同时填入时以code为准) 示例：1955228568170528800 |
| onlineUnitCode | string | 否 | 否 | 线上零售单位编码(id和编码二选一，同时填入时以code为准) 示例：KGM |
| offlineUnit | long | 否 | 否 | 线下零售单位id(id和编码二选一，同时填入时以code为准) 示例：1955228568170528800 |
| offlineUnitCode | string | 否 | 否 | 线下零售单位编码(id和编码二选一，同时填入时以code为准) 示例：KGM |
| requireUnit | long | 否 | 否 | 要货单位id(id和编码二选一，同时填入时以code为准) 示例：1955228568170528800 |
| requireUnitCode | string | 否 | 否 | 要货单位编码(id和编码二选一，同时填入时以code为准) 示例：KGM |
| markPrice | Decimal | 否 | 否 | 建议零售价 示例：1.1 |
| salePrice | Decimal | 否 | 否 | 线上零售价 示例：1.1 |
| marketPrice | Decimal | 否 | 否 | 市场价 示例：1.1 |
| displayPrice | boolean | 否 | 否 | 线上显示价格, true:是、false:否。当线上显示价格为是时，价格提示信息只能为空！ 示例：true |
| priceAreaMessage | string | 否 | 否 | 价格提示信息，当线上显示价格为是时，价格提示信息只能为空！ 示例：价格提示信息 |
| receiptName | object | 否 | 否 | 开票名称,支持多语 |
| incomeTaxRates | string | 否 | 否 | 进项税率id(id和编码二选一选填，同时填入时以code为准) 示例：10003 |
| incomeTaxRatesCode | string | 否 | 否 | 进项税率%编码(id和编码二选一选填，同时填入时以code为准) 示例：VATR6 |
| outputTaxRate | string | 否 | 否 | 销项税率id(id和编码二选一选填，同时填入时以code为准) 示例：10003 |
| outTaxRateCode | string | 否 | 否 | 销项税率%编码(id和编码二选一选填，同时填入时以code为准) 示例：VATR6 |
| order | long | 否 | 否 | 排序号 示例：0 |
| stopstatus | boolean | 否 | 否 | 启用状态，false代表启用，true代表停用。新增时不传，默认为false。 示例：true |
| storeOffAndOffState | boolean | 否 | 否 | 商城上架, true:是、false:否。新增时不传，默认为false。 示例：false |
| orderLoadAndUnloadStatus | boolean | 否 | 否 | 订货上架, true:是、false:否。新增时不传，默认为false。 示例：false |
| productVendor | long | 否 | 否 | 供应商id(id和编码二选一选填，同时填入时以code为准) 示例：1841189919393316900 |
| productVendorCode | string | 否 | 否 | 供应商编码(id和编码二选一选填，同时填入时以code为准) 示例：0001000102 |
| productBuyer | string | 否 | 否 | 采购员id(id和编码二选一选填，同时填入时以code为准) 示例：6280fa4ccfcf11edae1008c0ebd50df6 |
| productBuyerCode | string | 否 | 否 | 采购员编码(id和编码二选一选填，同时填入时以code为准) 示例：6280fa4ccfcf11edae1008c0ebd50df6 |
| primeCosts | Decimal | 否 | 否 | 采购参考价 示例：0.0 |
| maxPrimeCosts | Decimal | 否 | 否 | 最高进价 示例：0.0 |
| requestOrderLimit | Decimal | 否 | 否 | 请购订货超量上限 示例：0.0 |
| canSale | boolean | 否 | 否 | B2B是否可售, true:是，false:否。 示例：true |
| minOrderQuantity | Decimal | 否 | 否 | 起订量 示例：1.1 |
| deliveryDays | long | 否 | 否 | 交货周期 示例：0 |
| batchManage | boolean | 否 | 否 | 批次管理, true:是、false:否。 示例：false |
| expiryDateManage | boolean | 否 | 否 | 有效期管理, true:是、false:否。 示例：false |
| expiryDateCalculationMethod | short | 否 | 否 | 有效期推算方式，0按日，1按月，2不推算，当批次管理为是，有效期管理为是时,有效期推送方式必输 示例：0 |
| expireDateNo | long | 否 | 否 | 保质期 示例：0 |
| expireDateUnit | string | 否 | 否 | 保质期单位, 1:年、2:月、6:天、 示例：1 |
| daysBeforeValidityReject | long | 否 | 否 | 近效期拒收天数 示例：0 |
| validityWarningDays | long | 否 | 否 | 近效期预警天数 示例：0 |
| serialNoManage | boolean | 否 | 否 | 序列号管理, true:是、false:否。 示例：false |
| barcodeManage | boolean | 否 | 否 | 条码管理, true:是、false:否。 示例：false |
| safetyStock | Decimal | 否 | 否 | 安全库存 示例：1.1 |
| highestStock | Decimal | 否 | 否 | 最高库存 示例：1.1 |
| lowestStock | Decimal | 否 | 否 | 最低库存 示例：1.1 |
| ropStock | Decimal | 否 | 否 | 再订货点 示例：1.1 |
| warehouseManagerCode | string | 否 | 否 | 库管员编码(id和编码二选一选填，同时填入时以code为准) 示例：6280fa4ccfcf11edae1008c0ebd50df6 |
| warehouseManager | string | 否 | 否 | 库管员id(id和编码二选一选填，同时填入时以code为准) 示例：6280fa4ccfcf11edae1008c0ebd50df6 |
| receiptWarehouse | long | 否 | 否 | 收货仓库id(收货id和仓库编码二选一，同时填入时以编码为准) 示例：1689721154595455000 |
| receiptWarehouseCode | string | 否 | 否 | 收货仓库编码(收货id和仓库编码二选一，同时填入时以编码为准) 示例：000036 |
| deliveryWarehouse | long | 否 | 否 | 发货仓库id(id和编码二选一选填，同时填入时以code为准) 示例：1689721154595455000 |
| deliveryWarehouseCode | string | 否 | 否 | 发货仓库编码(id和编码二选一选填，同时填入时以code为准) 示例：000036 |
| returnWarehouse | long | 否 | 否 | 退货仓库id(id和编码二选一选填，同时填入时以code为准) 示例：1689721154595455000 |
| returnWarehouseCode | string | 否 | 否 | 退货仓库编码(id和编码二选一选填，同时填入时以code为准) 示例：000036 |
| inStoreExcessLimit | Decimal | 否 | 否 | 入库超量上限 示例：1.1 |
| outStoreExcessLimit | Decimal | 否 | 否 | 出库超量上限 示例：1.1 |
| storageLossRate | Decimal | 否 | 否 | 保管损耗率 示例：1.1 |
| planDefaultAttribute | int | 否 | 否 | 计划默认属性, 1:采购，3:自制，5：委外。 示例：1 |
| allowNegativeInventory | boolean | 否 | 否 | 允许负库存, true:是、false:否。 示例：false |
| planMethod | int | 否 | 否 | 计划方法, 0：MRP/LRP、1:：N-不计划、10：库存计划、5：MPS。 示例：0 |
| keySubPart | boolean | 否 | 否 | 关键子件, true:是、false:否。 示例：false |
| fixedLeadTime | long | 否 | 否 | 固定提前期 示例：0 |
| supplyType | int | 否 | 否 | 供应类型, 0：领用、1：入库倒冲、2：不发料、5：开工倒冲、6：工序完工倒冲 。 示例：0 |
| produceDepartment | string | 否 | 否 | 生产部门id(id和编码二选一选填，同时填入时以code为准) 示例：1546453681386815488 |
| produceDepartmentCode | string | 否 | 否 | 生产部门编码(id和编码二选一选填，同时填入时以code为准) 示例：00012 |
| manufacturePlanner | string | 否 | 否 | 计划员id(id和编码二选一选填，同时填入时以code为准) 示例：6280ab18cfcf11edae1008c0ebd50df6 |
| manufacturePlannerCode | string | 否 | 否 | 计划员编码(id和编码二选一选填，同时填入时以code为准) 示例：6280ab18cfcf11edae1008c0ebd50df6 |
| engineeringDrawingNo | string | 否 | 否 | 工程图号 示例：12345 |
| planProduceLimit | long | 否 | 否 | 计划下达允超上限 示例：0 |
| valueManageType | string | 否 | 否 | 价值管理模式, 99:费用、0:存货核算、1:固定资产、 示例：0 |
| batchRule | int | 否 | 否 | 批量规则,0：直接批量、5：经济批量、10：固定批量、6：补至最高库存。当批量规则等于固定批量时，固定批量字段必填！ 示例：0 |
| fixedQuantity | Decimal | 否 | 否 | 固定批量，当批量规则等于固定批量时，固定批量字段必填！ 示例：10 |
| costValuation | string | 否 | 否 | 成本计价方法, 0:先进先出法、1:移动平均法、2:全月平均法。 示例：0 |
| noTaxCostPrice | Decimal | 否 | 否 | 参考成本 示例：1.1 |
| checkByBatch | boolean | 否 | 否 | 按批次核算, true:是、false:否。 示例：false |
| saleStyle | string | 否 | 否 | 销售方式, 1:现金购买、2:积分兑换、 示例：1 |
| salePoints | long | 否 | 否 | 销售积分 示例：0 |
| inventoryCount | Decimal | 否 | 否 | 线上库存量 示例：2.2 |
| baseSaleCount | int | 否 | 否 | 初始销量 示例：0 |
| metaDescription | object | 否 | 否 | 搜索简介,支持多语 |
| settleAccountsRate | Decimal | 否 | 否 | 结算费率 示例：6.6 |
| recommend | boolean | 否 | 否 | 推荐物料, true:是、false:否。 示例：false |
| displayName | object | 否 | 否 | 显示名称,支持多语 |
| titleMemo | object | 否 | 否 | 卖点,支持多语 |
| allowStorePurchase | boolean | 否 | 否 | 允许门店自采, true:是、false:否。 示例：true |
| saleInOfflineStore | boolean | 否 | 否 | 允许门店销售, true:是、false:否。 示例：true |
| priceChangeAllowed | boolean | 否 | 否 | 允许开单改价, true:是、false:否。 示例：false |
| offlineStoreOrder | boolean | 否 | 否 | 允许门店要货, true:是、false:否。 示例：true |
| offlineStoreReturn | boolean | 否 | 否 | 允许门店退货, true:是、false:否。 示例：true |
| retailPriceDimension | long | 否 | 否 | 零售价取价维度, 1:物料、2:物料SKU、 示例：1 |
| deliverQuantityChange | long | 否 | 否 | 交货数量改变时, 1:单价不变重算金额、2:金额不变重算单价、 示例：1 |
| process | boolean | 否 | 否 | 加工, true:是、false:否。 示例：false |
| processType | string | 否 | 否 | 加工方式, 0:预制、1:现制、2:订制。当加工为否时，加工方式不允许有值！当批次管理为是时，加工方式不允许为现制! 示例：0 |
| material | boolean | 否 | 否 | 材料, true:是、false:否。 示例：false |
| weighingOrNot | boolean | 否 | 否 | 是否称重, true:是、false:否。 示例：false |
| inventoryPlanStrategy | string | 否 | 否 | 库存规划策略，0：批对批（当计划方法=库存计划时，库存规划策略的值必须是批对批。） 示例：0 |
| costItems | string | 否 | 否 | 费用项目id (id,编码,名称都填，优先级id>编码>名称) 示例：1978437901431078916 |
| costItemsCode | string | 否 | 否 | 费用项目编码 (id,编码,名称都填，优先级id>编码>名称) 示例：ZDH_FYXM |
| costItemsName | string | 否 | 否 | 费用项目名称 (id,编码,名称都填，优先级id>编码>名称) 示例：自动化_费用项目 |
| singleInspection | int | 否 | 否 | 单件检验（1表示开启单件检验，0表示不开启） 示例：0 |
| manageByInventory | int | 否 | 否 | 按项目管理库存（0表示不开启，1表示开启） 示例：0 |
| checkByProject | int | 否 | 否 | 按项目核算（0表示不开启按项目核算，1表示开启） 示例：0 |
| checkBySalesOrders | int | 否 | 否 | 按销售订单核算（0表示不开启，1表示开启） 示例：0 |
| checkByClient | int | 否 | 否 | 按客户核算（0表示不开启，1表示开启） 示例：0 |
| checkByOutsourcing | int | 否 | 否 | 按委外商核算（0表示不开启，1表示开启） 示例：0 |
| specialMaterials | boolean | 否 | 否 | 是否专用料，true：是，false：否。 示例：false |
| demandPlanningUnit | number |
| 小数位数:0,最大长度:26 | 否 | 否 | 需求计划单位id（id和编码二选一必填，同时填入时以code为准) 示例：1955228568170528775 |
| demandPlanningUnitCode | string | 否 | 否 | 需求计划单位编码（id和编码二选一必填，同时填入时以code为准) 示例：KGM |
| economicQuantity | number |
| 小数位数:2,最大长度:20 | 否 | 否 | 经济批量 示例：11 |
| batchDouble | number |
| 小数位数:2,最大长度:20 | 否 | 否 | 批量倍量 示例：11 |
| taxClass | string | 否 | 否 | 税收分类码id(id和编码二选一选填，同时填入时以code为准) 示例：3040602990000000000 |
| taxClassCode | string | 否 | 否 | 税收分类码编码(id和编码二选一选填，同时填入时以code为准) 示例：3040602990000000000 |
| manageClass | string | 否 | 否 | 物料分类id(id和编码二选一，同时填入时以code为准) 示例：1979147318348742658 |
| manageClassCode | string | 否 | 否 | 物料分类编码(id和编码二选一，同时填入时以code为准) 示例：000160 |
| transType | string | 否 | 否 | 物料类型id(id和编码二选一,都填以code为准) 示例：2528901227107072 |
| transTypeCode | string | 否 | 否 | 物料类型编码(id和编码二选一,都填以code为准) 示例：SYCSR004 |
| productClass | long | 否 | 否 | 商品分类id(id和编码二选一，同时填入时以code为准) 示例：1604214059445518300 |
| productClassCode | string | 否 | 否 | 商品分类编码(id和编码二选一，同时填入时以code为准) 示例：000023 |
| purchaseClass | long | 否 | 否 | 采购分类ID（采购分类id，编码、名称同时填写时，优先级ID>Code>Name） 示例：1546426425542180900 |
| purchaseClassCode | string | 否 | 否 | 采购分类编码（采购分类id，编码、名称同时填写时，优先级ID>Code>Name） 示例：PTO001 |
| purchaseClassName | string | 否 | 否 | 采购分类名称（采购分类id，编码、名称同时填写时，优先级ID>Code>Name） 示例：PTO商品 |
| registrationManager | boolean | 否 | 否 | 注册证管理, true:是、false:否。 示例：false |
| authorizationManager | boolean | 否 | 否 | 授权书管理, true:是、false:否。 示例：false |
| sunshinePurchaseNo | string | 否 | 否 | 阳光采购号 示例：123456 |
| registrationNo | string | 否 | 否 | 注册证号 示例：123456 |
| autoGenerateRangeData | boolean | 否 | 否 | true：自动生成组织数据，false：不自动生成组织数据。 示例：false |
| productTemplate | long | 否 | 否 | 物料模板id(物料模板id和物料模板名称二选一，同时填入时以名称为准) 示例：1707277039562129400 |
| productTemplateName | string | 否 | 否 | 物料模板名称(物料模板id和物料模板名称二选一，同时填入时以名称为准) 示例：二维 |
| productLine | long | 否 | 否 | 产品线id(产品线id和产品线code二选一，同时填入以code为准) 示例：1978437085392011300 |
| productLineCode | string | 否 | 否 | 产品线编码(产品线id和产品线code二选一，同时填入以code为准) 示例：zdhcpx |
| brand | long | 否 | 否 | 品牌id(id和编码二选一选填，同时填入时以code为准) 示例：1748988559366291500 |
| brandCode | string | 否 | 否 | 品牌编码(id和编码二选一选填，同时填入时以code为准) 示例：00001 |
| placeOfOrigin | string | 否 | 否 | 产地 示例：产地 |
| manufacturer | string | 否 | 否 | 生产厂商 示例：生产厂商 |
| description | object | 否 | 否 | 物料详情描述 |
| description | string | 否 | 否 | 物料电脑端描述 示例：物料电脑端描述 |
| mobileDescription | string | 否 | 否 | 物料手机端描述 示例：物料手机端描述 |
| realProductAttribute | int | 否 | 否 | 物料性质，1：实物物料，2：虚拟物料 示例：1 |
| realProductAttributeType | int | 否 | 否 | 实物物料属性，1：普通物料，2：实体卡券，3：实体储值卡，20：描述性物料，4：设备 示例：1 |
| virtualProductAttribute | long | 否 | 否 | 虚拟物料属性，7：服务，10：折扣，3：卡券，2：礼品卡，1：储值卡，4：其它，9：套餐，11：套件，16：PTO，20：描述性物料 示例：7 |
| giftCardId | string | 否 | 否 | 礼品卡id 示例：1978442600116912138 |
| couponId | string | 否 | 否 | 卡券id 示例：1978445340306046985 |
| unit | long | 否 | 否 | 主计量单位id(id和编码二选一，同时填入时以code为准。更改管理组织物料的计量单位时，会将使用组织物料的业务计量单位保持与管理组织物料的业务计量单位一致) 示例：1955228568170528800 |
| unitCode | string | 否 | 否 | 主计量单位编码(id和编码二选一，同时填入时以code为准。更改管理组织物料的计量单位时，会将使用组织物料的业务计量单位保持与管理组织物料的业务计量单位一致) 示例：KGM |
| enableAssistUnit | boolean | 否 | 否 | 启用辅计量, true:启用。 示例：false |
| weight | Decimal | 否 | 否 | 毛重 示例：1.1 |
| weightUnit | long | 否 | 否 | 毛重单位id(id和编码二选一选填，同时填入时以code为准) 示例：1955228568170528800 |
| weightUnitCode | string | 否 | 否 | 毛重单位编码(id和编码二选一选填，同时填入时以code为准) 示例：KGM |
| volume | Decimal | 否 | 否 | 体积 示例：1.1 |
| volumeUnit | long | 否 | 否 | 体积单位id(id和编码二选一选填，同时填入时以code为准) 示例：1978432859144192000 |
| volumeUnitCode | string | 否 | 否 | 体积单位编码(id和编码二选一选填，同时填入时以code为准) 示例：MTQ |
| netWeight | Decimal | 否 | 否 | 净重 示例：10 |
| netWeightUnit | long | 否 | 否 | 净重单位id(id和编码二选一选填，同时填入时以code为准) 示例：1955228568170528800 |
| netWeightUnitCode | string | 否 | 否 | 净重单位编码(id和编码二选一选填，同时填入时以code为准) 示例：KGM |
| taxClass | string | 否 | 否 | 税收分类码id(id和编码二选一选填，同时填入时以code为准) 示例：3040602990000000000 |
| taxClassCode | string | 否 | 否 | 税收分类码编码(id和编码二选一选填，同时填入时以code为准) 示例：3040602990000000000 |
| planClassCode | string | 否 | 否 | 计划分类编码(id和编码二选一选填，同时填入时以code为准) 示例：PLAN01 |
| planClass | long | 否 | 否 | 计划分类id(id和编码二选一选填，同时填入时以code为准) 示例：1954632478273568800 |
| shareDescription | object | 否 | 否 | 分享说明,支持多语 |
| simplifiedName | string | 否 | 否 | 简体 示例：简体 |
| englishName | string | 否 | 否 | 英文 示例：英文 |
| traditionalName | string | 否 | 否 | 繁体 示例：繁体 |
| keywords | object | 否 | 否 | 关键字,支持多语 |
| simplifiedName | string | 否 | 否 | 简体 示例：简体 |
| englishName | string | 否 | 否 | 英文 示例：英文 |
| traditionalName | string | 否 | 否 | 繁体 示例：繁体 |
| productAssistClasses | object | 是 | 否 | 物料辅助分类 |
| status | string | 否 | 否 | status操作状态：新增：Insert，删除：Delete。 示例：Insert |
| productClassId | long | 否 | 否 | 物料辅助分类Id(物料辅助分类Id和物料辅助分类编码二选一，同时填入以code为准) 示例：1546426425542180900 |
| productClassCode | string | 否 | 否 | 物料辅助分类编码(物料辅助分类Id和物料辅助分类编码二选一，同时填入以code为准) 示例：001 |
| productOrges | object | 是 | 否 | 物料分配的组织。只能新增不能修改和删除。 |
| orgCode | string | 否 | 否 | 组织编码(id和编码二选一，同时填入时以code为准) 示例：666666 示例：XMGS |
| orgId | string | 否 | 否 | 组织ID(id和编码二选一，同时填入时以code为准) 示例：666666 示例：1552320168638545928 |
| productAssistUnitExchanges | object | 是 | 否 | 物料辅计量换算对照 |
| unitExchangeType | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 辅计量单位, 0:固定换算、1:浮动换算 示例：0 |
| assistUnitCount | double | 否 | 否 | 辅计量数量 示例：1 |
| assistUnit | string | 否 | 否 | 辅计量单位id(辅计量单位id和辅计量单位编码二选一选填，同时填入时以code为准。如修改管理组织物料辅计量单位涉及业务单位变化，会将使用组织物料业务单位更新与管理组织物料业务单位一致) 示例：1748882585331695616 |
| assistUnitCode | string | 否 | 否 | 辅计量单位编码(辅计量单位id和辅计量单位编码二选一选填，同时填入时以code为准。如修改管理组织物料辅计量单位涉及业务单位变化，会将使用组织物料业务单位更新与管理组织物料业务单位一致) 示例：TNE |
| mainUnitCount | double | 否 | 否 | 主计量数量 示例：1000 |
| status | string | 否 | 否 | status操作状态：新增：Insert，更新：Update，删除：Delete。 示例：Insert |
| order | long | 否 | 否 | 排序 示例：0 |
| productBarCodes | object | 是 | 否 | 物料多条码。修改时会全量替换旧的数据，即以当前条码数据为准。 |
| barCode | string | 否 | 否 | 多条码 示例：12345 |

## 3. 请求示例

Url: /yonbip/digitalModel/product/batchupdate?access_token=访问令牌
Body: [{
	"orgCode": "global00",
	"orgId": "666666",
	"code": "0012000488",
	"name": {
		"simplifiedName": "简体",
		"englishName": "英文",
		"traditionalName": "繁体"
	},
	"modelDescription": {
		"simplifiedName": "简体",
		"englishName": "英文",
		"traditionalName": "繁体"
	},
	"model": {
		"simplifiedName": "简体",
		"englishName": "英文",
		"traditionalName": "繁体"
	},
	"erpCode": "12345",
	"useSku": 1,
	"optionalMaterial": 0,
	"derivedMaterial": 0,
	"optionalMaterialCode": "0012000490",
	"optionalMaterialId": 2005891633021714400,
	"detail": {
		"shortName": "物料01",
		"mnemonicCode": "WL01",
		"erpOuterCode": "12345",
		"barCode": "12345",
		"inspectionType": 0,
		"warehousingByResult": false,
		"testRule": 1,
		"businessAttribute": "1,7",
		"saleChannel": "1,2,3",
		"purchaseUnit": 1955228568170528800,
		"purchaseUnitCode": "KGM",
		"inspectionUnit": 1955228568170528800,
		"inspectionUnitCode": "KGM",
		"purchasePriceUnit": 1955228568170528800,
		"purchasePriceUnitCode": "KGM",
		"stockUnit": 1955228568170528800,
		"stockUnitCode": "KGM",
		"produceUnit": 1955228568170528800,
		"produceUnitCode": "KGM",
		"batchPriceUnit": 1955228568170528800,
		"batchPriceUnitCode": "KGM",
		"batchUnit": 1955228568170528800,
		"batchUnitCode": "KGM",
		"remark": {
			"simplifiedName": "简体",
			"englishName": "英文",
			"traditionalName": "繁体"
		},
		"reservation": false,
		"onlineUnit": 1955228568170528800,
		"onlineUnitCode": "KGM",
		"offlineUnit": 1955228568170528800,
		"offlineUnitCode": "KGM",
		"requireUnit": 1955228568170528800,
		"requireUnitCode": "KGM",
		"markPrice": 1.1,
		"salePrice": 1.1,
		"marketPrice": 1.1,
		"displayPrice": true,
		"priceAreaMessage": "价格提示信息",
		"receiptName": {
			"simplifiedName": "简体",
			"englishName": "英文",
			"traditionalName": "繁体"
		},
		"incomeTaxRates": "10003",
		"incomeTaxRatesCode": "VATR6",
		"outputTaxRate": "10003",
		"outTaxRateCode": "VATR6",
		"order": 0,
		"stopstatus": true,
		"storeOffAndOffState": false,
		"orderLoadAndUnloadStatus": false,
		"productVendor": 1841189919393316900,
		"productVendorCode": "0001000102",
		"productBuyer": "6280fa4ccfcf11edae1008c0ebd50df6",
		"productBuyerCode": "6280fa4ccfcf11edae1008c0ebd50df6",
		"primeCosts": 0,
		"maxPrimeCosts": 0,
		"requestOrderLimit": 0,
		"canSale": true,
		"minOrderQuantity": 1.1,
		"deliveryDays": 0,
		"batchManage": false,
		"expiryDateManage": false,
		"expiryDateCalculationMethod": 0,
		"expireDateNo": 0,
		"expireDateUnit": "1",
		"daysBeforeValidityReject": 0,
		"validityWarningDays": 0,
		"serialNoManage": false,
		"barcodeManage": false,
		"safetyStock": 1.1,
		"highestStock": 1.1,
		"lowestStock": 1.1,
		"ropStock": 1.1,
		"warehouseManagerCode": "6280fa4ccfcf11edae1008c0ebd50df6",
		"warehouseManager": "6280fa4ccfcf11edae1008c0ebd50df6",
		"receiptWarehouse": 1689721154595455000,
		"receiptWarehouseCode": "000036",
		"deliveryWarehouse": 1689721154595455000,
		"deliveryWarehouseCode": "000036",
		"returnWarehouse": 1689721154595455000,
		"returnWarehouseCode": "000036",
		"inStoreExcessLimit": 1.1,
		"outStoreExcessLimit": 1.1,
		"storageLossRate": 1.1,
		"planDefaultAttribute": 1,
		"allowNegativeInventory": false,
		"planMethod": 0,
		"keySubPart": false,
		"fixedLeadTime": 0,
		"supplyType": 0,
		"produceDepartment": "1546453681386815488",
		"produceDepartmentCode": "00012",
		"manufacturePlanner": "6280ab18cfcf11edae1008c0ebd50df6",
		"manufacturePlannerCode": "6280ab18cfcf11edae1008c0ebd50df6",
		"engineeringDrawingNo": "12345",
		"planProduceLimit": 0,
		"valueManageType": "0",
		"batchRule": 0,
		"fixedQuantity": 10,
		"costValuation": "0",
		"noTaxCostPrice": 1.1,
		"checkByBatch": false,
		"saleStyle": "1",
		"salePoints": 0,
		"inventoryCount": 2.2,
		"baseSaleCount": 0,
		"metaDescription": {
			"simplifiedName": "简体",
			"englishName": "英文",
			"traditionalName": "繁体"
		},
		"settleAccountsRate": 6.6,
		"recommend": false,
		"displayName": {
			"simplifiedName": "简体",
			"englishName": "英文",
			"traditionalName": "繁体"
		},
		"titleMemo": {
			"simplifiedName": "简体",
			"englishName": "英文",
			"traditionalName": "繁体"
		},
		"allowStorePurchase": true,
		"saleInOfflineStore": true,
		"priceChangeAllowed": false,
		"offlineStoreOrder": true,
		"offlineStoreReturn": true,
		"retailPriceDimension": 1,
		"deliverQuantityChange": 1,
		"process": false,
		"processType": "0",
		"material": false,
		"weighingOrNot": false,
		"inventoryPlanStrategy": "0",
		"costItems": "1978437901431078916",
		"costItemsCode": "ZDH_FYXM",
		"costItemsName": "自动化_费用项目",
		"singleInspection": 0,
		"manageByInventory": 0,
		"checkByProject": 0,
		"checkBySalesOrders": 0,
		"checkByClient": 0,
		"checkByOutsourcing": 0,
		"specialMaterials": false,
		"demandPlanningUnit": 1955228568170528775,
		"demandPlanningUnitCode": "KGM",
		"economicQuantity": 11,
		"batchDouble": 11,
		"taxClass": "3040602990000000000\t",
		"taxClassCode": "3040602990000000000"
	},
	"manageClass": "1979147318348742658",
	"manageClassCode": "000160",
	"transType": "2528901227107072",
	"transTypeCode": "SYCSR004",
	"productClass": 1604214059445518300,
	"productClassCode": "000023",
	"purchaseClass": 1546426425542180900,
	"purchaseClassCode": "PTO001",
	"purchaseClassName": "PTO商品",
	"registrationManager": false,
	"authorizationManager": false,
	"sunshinePurchaseNo": "123456",
	"registrationNo": "123456",
	"autoGenerateRangeData": false,
	"productTemplate": 1707277039562129400,
	"productTemplateName": "二维",
	"productLine": 1978437085392011300,
	"productLineCode": "zdhcpx",
	"brand": 1748988559366291500,
	"brandCode": "00001",
	"placeOfOrigin": "产地",
	"manufacturer": "生产厂商",
	"description": {
		"description": "物料电脑端描述",
		"mobileDescription": "物料手机端描述"
	},
	"realProductAttribute": 1,
	"realProductAttributeType": 1,
	"virtualProductAttribute": 7,
	"giftCardId": "1978442600116912138",
	"couponId": "1978445340306046985",
	"unit": 1955228568170528800,
	"unitCode": "KGM",
	"enableAssistUnit": false,
	"weight": 1.1,
	"weightUnit": 1955228568170528800,
	"weightUnitCode": "KGM",
	"volume": 1.1,
	"volumeUnit": 1978432859144192000,
	"volumeUnitCode": "MTQ",
	"netWeight": 10,
	"netWeightUnit": 1955228568170528800,
	"netWeightUnitCode": "KGM",
	"taxClass": "3040602990000000000",
	"taxClassCode": "3040602990000000000",
	"planClassCode": "PLAN01",
	"planClass": 1954632478273568800,
	"shareDescription": {
		"simplifiedName": "简体",
		"englishName": "英文",
		"traditionalName": "繁体"
	},
	"keywords": {
		"simplifiedName": "简体",
		"englishName": "英文",
		"traditionalName": "繁体"
	},
	"productAssistClasses": [
		{
			"status": "Insert",
			"productClassId": 1546426425542180900,
			"productClassCode": "001"
		}
	],
	"productOrges": [
		{
			"orgCode": "XMGS",
			"orgId": "1552320168638545928"
		}
	],
	"productAssistUnitExchanges": [
		{
			"unitExchangeType": 0,
			"assistUnitCount": 1,
			"assistUnit": "1748882585331695616",
			"assistUnitCode": "TNE",
			"mainUnitCount": 1000,
			"status": "Insert",
			"order": 0
		}
	],
	"productBarCodes": [
		{
			"barCode": "12345"
		}
	]
}]

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200，失败异常返回999 示例：200 |
| message | string | 否 | 成功或异常失败描述 示例：操作成功 |
| data | object | 否 | 详细返回结果 |
| count | int | 否 | 数量 示例：2 |
| sucessCount | int | 否 | 成功数量 示例：1 |
| failCount | int | 否 | 失败数量 示例：1 |
| messages | object | 否 | 失败详细信息 示例："物料分类编码:00000111未找到" |
| infos | object | 是 | 成功详细信息 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"count": 2,
		"sucessCount": 1,
		"failCount": 1,
		"messages": "\"物料分类编码:00000111未找到\"",
		"infos": [
			{
				"code": "000001",
				"id": 1530976715290968000
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	服务端逻辑异常	检查入参是否填写正确，参数值是否真实存在，仍提示该信息请联系开发人员。

118000	入参不能为空

118003	请求数量超过最大限制数量


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-03-23

更新

请求说明

新增

请求参数 taxClass

新增

请求参数 taxClassCode

更新

请求参数 (16)

子表增加税收分类码


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

