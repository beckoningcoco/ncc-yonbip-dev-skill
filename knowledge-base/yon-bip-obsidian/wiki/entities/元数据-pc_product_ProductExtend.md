---
tags: [BIP, 元数据, 数据字典, pc.product.ProductExtend]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# （停用）物料详情（管理组织） (`pc.product.ProductExtend`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`productdetail` | domain：`productcenter` | 应用：`GZTBDM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | （停用）物料详情（管理组织） |
| 物理表 | `productdetail` |
| 数据库 schema | `productcenter` |
| 所属应用 | `GZTBDM` |
| 直连字段 | 275 个 |
| 子表 | 0 个 |
| 关联引用 | 40 个 |

## 关联引用 (40个)

| 字段名 | 引用类型 |
|--------|---------|
| `costItems` | `` |
| `material_status` | `` |
| `produceUnitId` | `` |
| `demandPlanningUnitId` | `` |
| `batchPriceUnitId` | `` |
| `product_detail_character_def` | `` |
| `warehouseManager` | `` |
| `` | `` |
| `BOMSource` | `` |
| `offlineUnitId` | `` |
| `orgId` | `` |
| `inTaxrate` | `` |
| `productApplyRangeId` | `` |
| `outTaxrate` | `` |
| `requireUnitId` | `` |
| `customerId` | `` |
| `purchasePriceUnitId` | `` |
| `productId` | `` |
| `shopId` | `` |
| `billingUnitId` | `` |
| `taxClass` | `productcenter.pc_taxrevenueref` |
| `manufacturePlanner` | `` |
| `receiptWarehouse` | `` |
| `dlyFeeRuleId` | `` |
| `productBuyer` | `` |
| `ytenant_id` | `` |
| `produceDepartment` | `` |
| `OMSWarehouse` | `` |
| `measurement_unit` | `` |
| `onlineUnitId` | `` |
| `productVendor` | `` |
| `stockUnitId` | `` |
| `costClass` | `productcenter.pc_costclassref` |
| `purchaseUnitId` | `` |
| `deliveryWarehouse` | `` |
| `batchUnitId` | `` |
| `preferentialPolicyType` | `` |
| `inspectionUnitId` | `` |
| `returnWarehouse` | `` |

## 继承接口 (4个, 12字段)

- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **停用信息** (`base.itf.IStopping`)
  - `stopstatus` → `stopstatus`
  - `stop_time` → `stop_time`
- **租户相关** (`coredoc.pub.TenantObselete`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 275 个直连字段

### 文本字段 (14个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cBarCode` | `cBarCode` | `barCode` | 条形码 |
| `businessAttribute` | `businessAttribute` | `businessAttribute` | 业务属性 |
| `cEngineeringDrawingNo` | `cEngineeringDrawingNo` | `engineeringDrawingNo` | 制造-工程图号 |
| `cErpOuterCode` | `cErpOuterCode` | `erpOuterCode` | 商家外部编码 |
| `manufacturing_strategy` | `manufacturing_strategy` | `manufacturingStrategy` | 制造-制造策略 |
| `mnemonicCode` | `mnemonicCode` | `mnemonicCode` | 助记码 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `pageTitle` | `pageTitle` | `pageTitle` | 商城-SEO设置相关 |
| `priceAreaMessage` | `priceAreaMessage` | `priceAreaMessage` | 线上不显示价格时,需要显示的提示信息 |
| `saleChannel` | `saleChannel` | `saleChannel` | 销售渠道 |
| `productAttribute` | `productAttribute` | `saleStyle` | 销售方式 |
| `shortName` | `shortName` | `shortName` | 物料简称 |
| `` | `creator` | `creator` | 创建人名称 |
| `delivery_method` | `delivery_method` | `deliveryMethod` | 商城-配送方式 |

### 引用字段 (39个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `productId` | `productId` | `id` | ID主键 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户ID |
| `demandPlanningUnitId` | `demandPlanningUnitId` | `demandPlanningUnit` | 需求计划单位 |
| `batchUnitId` | `batchUnitId` | `batchUnit` | 批发销售单位 |
| `batchPriceUnitId` | `batchPriceUnitId` | `batchPriceUnit` | 批发计价单位 |
| `BOMSource` | `BOMSource` | `BOMSource` | 制造-共享BOM来源 |
| `billingUnitId` | `billingUnitId` | `billingUnit` | 开票单位 |
| `measurement_unit` | `measurement_unit` | `measurementUnit` | 计量项目单位 |
| `costItems` | `costItems` | `costItems` | 费用项目 |
| `customerId` | `customerId` | `customerId` | 客户ID |
| `deliveryWarehouse` | `deliveryWarehouse` | `deliveryWarehouse` | 库存-发货仓库 |
| `dlyFeeRuleId` | `dlyFeeRuleId` | `dlyFeeRuleId` | 商城-运费模板 |
| `inTaxrate` | `inTaxrate` | `inTaxrate` | 进项税率(%) |
| `inspectionUnitId` | `inspectionUnitId` | `inspectionUnit` | 检验单位 |
| `manufacturePlanner` | `manufacturePlanner` | `manufacturePlanner` | 制造-计划员 |
| `material_status` | `material_status` | `materialStatus` | 物料状态 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `offlineUnitId` | `offlineUnitId` | `offlineUnit` | 线下零售单位 |
| `OMSWarehouse` | `OMSWarehouse` | `omsWarehouse` | 库存-电商仓 |
| `onlineUnitId` | `onlineUnitId` | `onlineUnit` | 线上零售单位 |
| `orgId` | `orgId` | `orgId` | 组织ID |
| `outTaxrate` | `outTaxrate` | `outTaxrate` | 销项税率(%) |
| `preferentialPolicyType` | `preferentialPolicyType` | `preferentialPolicyType` | 优惠政策类型 |
| `produceDepartment` | `produceDepartment` | `produceDepartment` | 制造-生产部门 |
| `produceUnitId` | `produceUnitId` | `produceUnit` | 生产单位 |
| `productApplyRangeId` | `productApplyRangeId` | `productApplyRangeId` | 物料分配范围ID |
| `productBuyer` | `productBuyer` | `productBuyer` | 采购员 |
| `productVendor` | `productVendor` | `productVendor` | 供应商 |
| `purchasePriceUnitId` | `purchasePriceUnitId` | `purchasePriceUnit` | 采购计价单位 |
| `purchaseUnitId` | `purchaseUnitId` | `purchaseUnit` | 采购单位 |
| `receiptWarehouse` | `receiptWarehouse` | `receiptWarehouse` | 采购-收货仓库 |
| `requireUnitId` | `requireUnitId` | `requireUnit` | 要货单位 |
| `returnWarehouse` | `returnWarehouse` | `returnWarehouse` | 库存-退货仓库 |
| `shopId` | `shopId` | `shopId` | 商家ID |
| `stockUnitId` | `stockUnitId` | `stockUnit` | 库存单位 |
| `warehouseManager` | `warehouseManager` | `warehouseManager` | 库存-库管员 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `costClass` | `costClass` | `costClass` | 成本分类 |
| `taxClass` | `taxClass` | `taxClass` | 税收分类码 |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |

### 布尔字段 (55个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bECNControl` | `bECNControl` | `ECNControl` | 制造-ECN管控 |
| `bAccountingByItem` | `bAccountingByItem` | `accountingByItem` | 成本-按单品核算 |
| `bAllowNegativeInventory` | `bAllowNegativeInventory` | `allowNegativeInventory` | 库存-允许负库存 |
| `allowStorePurchase` | `allowStorePurchase` | `allowStorePurchase` | 零售-允许门店自采 |
| `bBindCarrier` | `bBindCarrier` | `bindCarrier` | 制造-绑定载具 |
| `bCanOrder` | `bCanOrder` | `canOrder` | 商城-可预约 |
| `canSale` | `canSale` | `canSale` | 批发-可售状态 |
| `checkByBatch` | `checkByBatch` | `checkByBatch` | 成本-按批次核算 |
| `bCheckByCost` | `bCheckByCost` | `checkByCost` | 成本-按费用核算 |
| `enableDeposit` | `enableDeposit` | `enableDeposit` | 商城-启用定金业务 |
| `bEnableSubscribe` | `bEnableSubscribe` | `enableSubscribe` | 商城-启用预订业务 |
| `enablemodifyDeposit` | `enablemodifyDeposit` | `enablemodifyDeposit` | 商城-订单改价时可修改定金 |
| `bExemption` | `bExemption` | `exemption` | 质检-免检 |
| `bFixedReturn` | `bFixedReturn` | `fixedReturn` | 制造-固定回空 |
| `iEnableCyclePurchase` | `iEnableCyclePurchase` | `iEnableCyclePurchase` | 商城-启用周期购 |
| `iEnableEcontract` | `iEnableEcontract` | `iEnableEcontract` | 商城-是否启用合同管理 |
| `iStatus` | `iStatus` | `iStatus` | 商城上下架状态 |
| `iUOrderStatus` | `iUOrderStatus` | `iUOrderStatus` | U订货上下架状态 |
| `isAllArea` | `isAllArea` | `isAllArea` | 商城-是否适用所有区域 |
| `isBarcodeManage` | `isBarcodeManage` | `isBarcodeManage` | 库存-条码管理 |
| `isBatchManage` | `isBatchManage` | `isBatchManage` | 库存-是否批次管理 |
| `isCreator` | `isCreator` | `isCreator` | 是否创建者 |
| `isDisplayPrice` | `isDisplayPrice` | `isDisplayPrice` | 线上显示价格 |
| `isExpiryDateManage` | `isExpiryDateManage` | `isExpiryDateManage` | 库存-是否有效期管理 |
| `isMaterial` | `isMaterial` | `isMaterial` | 零售-材料 |
| `isOfflineStoreOrder` | `isOfflineStoreOrder` | `isOfflineStoreOrder` | 零售-允许门店要货 |
| `isOfflineStoreReturn` | `isOfflineStoreReturn` | `isOfflineStoreReturn` | 零售-允许门店退货 |
| `isPriceChangeAllowed` | `isPriceChangeAllowed` | `isPriceChangeAllowed` | 零售-允许开单改价 |
| `isProcess` | `isProcess` | `isProcess` | 零售-加工 |
| `isRecommend` | `isRecommend` | `isRecommend` | 推荐物料 |
| `isSaleInOfflineStore` | `isSaleInOfflineStore` | `isSaleInOfflineStore` | 零售-允许门店销售 |
| `isSerialNoManage` | `isSerialNoManage` | `isSerialNoManage` | 库存-是否序列号管理 |
| `isWeight` | `isWeight` | `isWeight` | 零售-是否称重 |
| `bKeySubPart` | `bKeySubPart` | `keySubPart` | 制造-关键子件 |
| `bLogisticsRelated` | `bLogisticsRelated` | `logisticsRelated` | 制造-物流相关 |
| `bMaterialCost` | `bMaterialCost` | `materialCost` | 成本-材料费用化 |
| `bOnlyOrder` | `bOnlyOrder` | `onlyOrder` | 商城-仅预约 |
| `bPeriodicalInspection` | `bPeriodicalInspection` | `periodicalInspection` | 质检-定期检验 |
| `bPrepareFeed` | `bPrepareFeed` | `prepareFeed` | 制造-是否长周期备料 |
| `reservation` | `reservation` | `reservation` | 库存-可预留 |
| `bReturnsWarehousingByResult` | `bReturnsWarehousingByResult` | `returnsWarehousingByResult` | 质检-退货根据检验结果入库 |
| `bReviewGrossWeight` | `bReviewGrossWeight` | `reviewGrossWeight` | 制造-复核毛重 |
| `saleChannelOfDistribution` | `saleChannelOfDistribution` | `saleChannelOfDistribution` | 销售渠道-微分销 |
| `saleChannelOfOfflineRetail` | `saleChannelOfOfflineRetail` | `saleChannelOfOfflineRetail` | 销售渠道-线下零售 |
| `saleChannelOfOnlineBatch` | `saleChannelOfOnlineBatch` | `saleChannelOfOnlineBatch` | 销售渠道-线上批发 |
| `saleChannelOfOnlineRetail` | `saleChannelOfOnlineRetail` | `saleChannelOfOnlineRetail` | 销售渠道-线上零售 |
| `bSalesReturnsExemption` | `bSalesReturnsExemption` | `salesReturnsExemption` | 质检-销售退货免检 |
| `bSpecialCarTransport` | `bSpecialCarTransport` | `specialCarTransport` | 制造-专车运输 |
| `bSpecialMaterials` | `bSpecialMaterials` | `specialMaterials` | 制造-是否专用料 |
| `stopstatus` | `stopstatus` | `stopstatus` | 停用状态 |
| `bUtility` | `bUtility` | `utility` | 制造-公用工程 |
| `bVirtualPart` | `bVirtualPart` | `virtualPart` | 制造-是否虚拟件 |
| `bWarehousingByResult` | `bWarehousingByResult` | `warehousingByResult` | 质检-根据检验结果入库 |
| `bWeigh` | `bWeigh` | `weigh` | 制造-是否过磅 |
| `bWorkingPlan` | `bWorkingPlan` | `workingPlan` | 制造-排工序计划 |

### 整数 (67个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `business_attr_purchase` | `business_attr_purchase` | `businessAttributePurchase` | 业务属性-采购 |
| `business_attr_sale` | `business_attr_sale` | `businessAttributeSale` | 业务属性-销售 |
| `business_attr_self_create` | `business_attr_self_create` | `businessAttributeSelfCreate` | 业务属性-自制 |
| `business_attr_outsourcing` | `business_attr_outsourcing` | `businessAttributeOutSourcing` | 业务属性-委外 |
| `iBehindLeadTime` | `iBehindLeadTime` | `behindLeadTime` | 制造-后段提前期 |
| `single_Inspection` | `single_Inspection` | `singleInspection` | 质检-单件检验 |
| `inspectionControlPoint` | `inspectionControlPoint` | `inspectionControlPoint` | 质检-采购检验控制点 |
| `manageByInventory` | `manageByInventory` | `manageByInventory` | 库存-项目库存 |
| `overSigning` | `overSigning` | `overSigning` | 销售-超量签收 |
| `projectTrackStrategy` | `projectTrackStrategy` | `projectTrackStrategy` | 计划-项目跟踪策略 |
| `atpInspection` | `atpInspection` | `atpInspection` | 库存-ATP检查 |
| `checkByProject` | `checkByProject` | `checkByProject` | 成本-按项目核算 |
| `checkBySalesOrders` | `checkBySalesOrders` | `checkBySalesOrders` | 成本-按销售订单核算 |
| `checkByClient` | `checkByClient` | `checkByClient` | 成本-按客户核算 |
| `checkByOutsourcing` | `checkByOutsourcing` | `checkByOutsourcing` | 成本-按委外商核算 |
| `checkByRevenueManagement` | `checkByRevenueManagement` | `checkByRevenueManagement` | 成本-收入管理核算 |
| `turnover_materials` | `turnover_materials` | `turnoverMaterials` | 周转材 |
| `amortization_method` | `amortization_method` | `amortizationMethod` | 摊销方式 |
| `productInspection` | `productInspection` | `productInspection` | 质检-产品检验 |
| `productInspectionCtrlPoint` | `productInspectionCtrlPoint` | `productInspectionCtrlPoint` | 质检-产品检验控制点 |
| `outSourceInspection` | `outSourceInspection` | `outSourceInspection` | 质检-委外检验 |
| `outSourceInspectionCtrlPoint` | `outSourceInspectionCtrlPoint` | `outSourceInspectionCtrlPoint` | 质检-委外检验控制点 |
| `transferInspection` | `transferInspection` | `transferInspection` | 质检-调拨检验 |
| `transferInspectionCtrlPoint` | `transferInspectionCtrlPoint` | `transferInspectionCtrlPoint` | 质检-调拨检验控制点 |
| `productFirstInspection` | `productFirstInspection` | `productFirstInspection` | 质检-产品首检 |
| `firstInspectionCtrlMethod` | `firstInspectionCtrlMethod` | `firstInspectionCtrlMethod` | 质检-首检控制方式 |
| `sendInspectionCtrlPoint` | `sendInspectionCtrlPoint` | `sendInspectionCtrlPoint` | 质检-发货检验控制点 |
| `returnInspectionCtrlPoint` | `returnInspectionCtrlPoint` | `returnInspectionCtrlPoint` | 质检-退货检验控制点 |
| `iBeyondSupplyDays` | `iBeyondSupplyDays` | `beyondSupplyDays` | 制造-超期供给天数 |
| `check_reminder_lead_time` | `check_reminder_lead_time` | `checkReminderLeadTime` | 质检-检验提醒提前期 |
| `iDaysBeforeValidityReject` | `iDaysBeforeValidityReject` | `daysBeforeValidityReject` | 库存-近有效期拒收天数 |
| `deliveryDays` | `deliveryDays` | `deliveryDays` | 批发-交货周期(天) |
| `iDemandConsolidationNumber` | `iDemandConsolidationNumber` | `demandConsolidationNumber` | 制造-需求合并时格数 |
| `depositDealPayType` | `depositDealPayType` | `depositDealPayType` | 商城-定金设置类型 |
| `depositPayType` | `depositPayType` | `depositPayType` | 商城-支付尾款方式 |
| `direct_production` | `direct_production` | `directProduction` | 计划-是否直接生产 |
| `effective_lead_time` | `effective_lead_time` | `effectiveLeadTime` | 质检-有效期提前期 |
| `enable_spare_parts_management` | `enable_spare_parts_management` | `enableSparePartsManagement` | 资产服务-启用备件管理 |
| `enable_stock_expire_check` | `enable_stock_expire_check` | `enableStockExpireCheck` | 质检-启用库存临期检验 |
| `enable_stock_period_recheck` | `enable_stock_period_recheck` | `enableStockPeriodRecheck` | 质检-启用库存周期复检 |
| `expireDateNo` | `expireDateNo` | `expireDateNo` | 库存-保质期 |
| `iFixedLeadTime` | `iFixedLeadTime` | `fixedLeadTime` | 制造-固定提前期 |
| `iFrontLeadTime` | `iFrontLeadTime` | `frontLeadTime` | 制造-前段提前期 |
| `full_set_inspection` | `full_set_inspection` | `fullSetInspection` | 制造-齐套检查 |
| `iABCClass` | `iABCClass` | `iABCClass` | 库存-ABC分类 |
| `iBaseSaleCount` | `iBaseSaleCount` | `iBaseSaleCount` | 商城-初始销量 |
| `iOrder` | `iOrder` | `iOrder` | 排序号 |
| `inspectionType` | `inspectionType` | `inspectionType` | 质检-采购检验 |
| `malldowncount` | `malldowncount` | `malldowncount` | 商城下架数量 |
| `mallupcount` | `mallupcount` | `mallupcount` | 商城上架数量 |
| `iMaximumTurnoverDays` | `iMaximumTurnoverDays` | `maximumTurnoverDays` | 库存-最大周转天数 |
| `mto_strategy` | `mto_strategy` | `mtoStrategy` | 制造-MTO策略 |
| `iPeriodicalInspectionCycle` | `iPeriodicalInspectionCycle` | `periodicalInspectionCycle` | 质检-定期检验周期 |
| `plan_check_days` | `plan_check_days` | `planCheckDays` | 质检-计划检验天数 |
| `iRangeType` | `iRangeType` | `rangeType` | 物料适用范围类型 |
| `recheck_reminder_lead_time` | `recheck_reminder_lead_time` | `recheckReminderLeadTime` | 质检-复检提醒提前期 |
| `iResetBackwardDays` | `iResetBackwardDays` | `resetBackwardDays` | 制造-重排后移天数 |
| `iResetForwardDays` | `iResetForwardDays` | `resetForwardDays` | 制造-重排前移天数 |
| `return_inspection` | `return_inspection` | `returnInspection` | 质检-退货检验 |
| `review_cycle` | `review_cycle` | `reviewCycle` | 质检-复检周期 |
| `salePoints` | `salePoints` | `salePoints` | 商城-销售积分 |
| `send_inspection` | `send_inspection` | `sendInspection` | 质检-发货检验 |
| `strategy_comparison_rule` | `strategy_comparison_rule` | `strategyComparisonRule` | 制造-策略对比规则 |
| `iSupplyTimes` | `iSupplyTimes` | `supplyTimes` | 制造-供应倍数 |
| `uorderdowncount` | `uorderdowncount` | `uorderdowncount` | U订货下架数量 |
| `uorderupcount` | `uorderupcount` | `uorderupcount` | U订货上架数量 |
| `iValidityWarningDays` | `iValidityWarningDays` | `validityWarningDays` | 库存-效期预警天数 |

### 短整数 (27个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iBOMType` | `iBOMType` | `BOMType` | 制造-物料BOM类型 |
| `batchPolicy` | `batchPolicy` | `batchPolicy` | 制造-批量政策 |
| `iBatchRule` | `iBatchRule` | `batchRule` | 制造-批量规则 |
| `iCostValuation` | `iCostValuation` | `costValuation` | 成本-成本计价方法 |
| `deliverQuantityChange` | `deliverQuantityChange` | `deliverQuantityChange` | 零售-交货数量改变时 |
| `iDemandConsolidation` | `iDemandConsolidation` | `demandConsolidation` | 制造-物料需求合并 |
| `iDemandConsolidationDateType` | `iDemandConsolidationDateType` | `demandConsolidationDateType` | 制造-需求合并日 |
| `iDemandConsolidationType` | `iDemandConsolidationType` | `demandConsolidationType` | 制造-需求合并类型 |
| `iDemandConsolidationUnit` | `iDemandConsolidationUnit` | `demandConsolidationUnit` | 制造-需求合并时格 |
| `expireDateUnit` | `expireDateUnit` | `expireDateUnit` | 库存-保质期单位 |
| `inventoryPlanStrategy` | `inventoryPlanStrategy` | `inventoryPlanStrategy` | 库存规划策略 |
| `isCheckFree` | `isCheckFree` | `isCheckFree` | 成本-按规格核算 |
| `expirydate_calculation_method` | `expirydate_calculation_method` | `isExpiryDateCalculationMethod` | 库存-有效期推算方式 |
| `lossType` | `lossType` | `lossType` | 制造-损耗类型 |
| `iOrderAdvanceTime` | `iOrderAdvanceTime` | `orderAdvanceTime` | 商城-预约提前期 |
| `planDefaultAttribute` | `planDefaultAttribute` | `planDefaultAttribute` | 制造-计划默认属性 |
| `planMethod` | `planMethod` | `planMethod` | 制造-计划方法 |
| `iProcessType` | `iProcessType` | `processType` | 零售-加工方式 |
| `iPurpose` | `iPurpose` | `purpose` | 制造-用途 |
| `requirementTrackingMethod` | `requirementTrackingMethod` | `requirementTrackingMethod` | 库存-需求跟踪方式 |
| `retailPriceDimension` | `retailPriceDimension` | `retailPriceDimension` | 零售-零售取价维度 |
| `scanCountUnit` | `scanCountUnit` | `scanCountUnit` | 库存-扫码计数单位 |
| `iServiceDurationUnit` | `iServiceDurationUnit` | `serviceDurationUnit` | 商城-服务时长单位 |
| `supplyDemandPolicy` | `supplyDemandPolicy` | `supplyDemandPolicy` | 制造-供需政策 |
| `supplyType` | `supplyType` | `supplyType` | 制造-供应类型 |
| `iValueManageType` | `iValueManageType` | `valueManageType` | 成本-价值管理模式 |
| `iWeighingMode` | `iWeighingMode` | `weighingMode` | 制造-称重方式 |

### 长整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `tenant_id` | `tenant_id` | `tenant` | 租户ID(旧) |
| `planStrategy` | `planStrategy` | `planStrategy` | 制造-时界 |
| `uorderDlyFeeRuleId` | `uorderDlyFeeRuleId` | `uorderDlyFeeRuleId` | 订货-运费模板 |

### 数值字段 (49个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `batchPrice` | `batchPrice` | `batchPrice` | 批发价 |
| `fArrivalAllowErrorLimit` | `fArrivalAllowErrorLimit` | `arrivalAllowErrorLimit` | 到货入库允差上下比例% |
| `iBatchDouble` | `iBatchDouble` | `batchDouble` | 制造-批量倍增 |
| `doublePick` | `doublePick` | `doublePick` | 制造-领料倍量 |
| `measurement_count` | `measurement_count` | `measurementCount` | 计量项目数量 |
| `compensation_amount` | `compensation_amount` | `compensationAmount` | 赔偿金额 |
| `molding_time` | `molding_time` | `moldingTime` | 成型时间 |
| `mold_cavities` | `mold_cavities` | `moldCavities` | 模具腔数 |
| `depositPercentage` | `depositPercentage` | `depositPercentage` | 商城-预付定金百分比 |
| `deposits` | `deposits` | `deposits` | 商城-预付定金金额 |
| `doubleReplenish` | `doubleReplenish` | `doubleReplenish` | 制造-补货倍量 |
| `iEconomicQuantity` | `iEconomicQuantity` | `economicQuantity` | 制造-经济批量 |
| `fLowestMarkPrice` | `fLowestMarkPrice` | `fLowestMarkPrice` | 最低零售价 |
| `fMarkPrice` | `fMarkPrice` | `fMarkPrice` | 建议零售价 |
| `fMarketPrice` | `fMarketPrice` | `fMarketPrice` | 市场价 |
| `fNoTaxCostPrice` | `fNoTaxCostPrice` | `fNoTaxCostPrice` | 成本-参考成本 |
| `fPrimeCosts` | `fPrimeCosts` | `fPrimeCosts` | 采购参考价 |
| `fSalePrice` | `fSalePrice` | `fSalePrice` | 线上零售价 |
| `fSettleAccountsRate` | `fSettleAccountsRate` | `fSettleAccountsRate` | 商城-结算费率 |
| `iFixedQuantity` | `iFixedQuantity` | `fixedQuantity` | 制造-固定批量 |
| `iFixedWastage` | `iFixedWastage` | `fixedWastage` | 制造-固定损耗量 |
| `highestStock` | `highestStock` | `highestStock` | 库存-最高库存 |
| `iDoubleSale` | `iDoubleSale` | `iDoubleSale` | 销售倍量 |
| `iMinOrderQuantity` | `iMinOrderQuantity` | `iMinOrderQuantity` | 批发-起订量 |
| `fInStoreExcessLimit` | `fInStoreExcessLimit` | `inStoreExcessLimit` | 库存-入库超量上限% |
| `fInStoreLessLimit` | `fInStoreLessLimit` | `inStoreLessLimit` | 库存-入库下限比例% |
| `fInvoiceAllowErrorLimit` | `fInvoiceAllowErrorLimit` | `invoiceAllowErrorLimit` | 开票允差上下比例% |
| `lInventoryCount` | `lInventoryCount` | `lInventoryCount` | 商城-线上库存量 |
| `iLeadTimeCoefficient` | `iLeadTimeCoefficient` | `leadTimeCoefficient` | 制造-提前期系数 |
| `iLeadTimeQuantity` | `iLeadTimeQuantity` | `leadTimeQuantity` | 制造-提前期批量 |
| `lowestStock` | `lowestStock` | `lowestStock` | 库存-最低库存 |
| `maxBatchPrice` | `maxBatchPrice` | `maxBatchPrice` | 最高批发价格 |
| `fMaxPrimeCosts` | `fMaxPrimeCosts` | `maxPrimeCosts` | 最高进价 |
| `minBatchPrice` | `minBatchPrice` | `minBatchPrice` | 最低批发价格 |
| `minimumDeposits` | `minimumDeposits` | `minimumDeposits` | 商城-最低定金金额 |
| `fOutStoreExcessLimit` | `fOutStoreExcessLimit` | `outStoreExcessLimit` | 库存-出库超量上限% |
| `fOutStoreLessLimit` | `fOutStoreLessLimit` | `outStoreLessLimit` | 库存-出库下限比例% |
| `fPlanOrderLimit` | `fPlanOrderLimit` | `planOrderLimit` | 计划订货超量上限% |
| `iPlanProduceLimit` | `iPlanProduceLimit` | `planProduceLimit` | 制造-计划下达生产允超上限% |
| `produceRate` | `produceRate` | `produceRate` | 生产单位换算率 |
| `purchase_order_quantity` | `purchase_order_quantity` | `purchaseOrderQuantity` | 采购-采购起订量 |
| `purchase_times` | `purchase_times` | `purchaseTimes` | 采购-采购倍量 |
| `iRejectRate` | `iRejectRate` | `rejectRate` | 制造-废品率 |
| `fRequestOrderLimit` | `fRequestOrderLimit` | `requestOrderLimit` | 请购订货超量上限% |
| `ropStock` | `ropStock` | `ropStock` | 库存-再订货点 |
| `safetyStock` | `safetyStock` | `safetyStock` | 库存-安全库存 |
| `iServiceDuration` | `iServiceDuration` | `serviceDuration` | 商城-服务时长 |
| `storageLossRate` | `storageLossRate` | `storageLossRate` | 库存-保管损耗率 |
| `iWastageRate` | `iWastageRate` | `wastageRate` | 制造-损耗率 |

### timestamp (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `beUpTime` | `beUpTime` | `beUpTime` | 批发-预约上架时间 |
| `mallDownTime` | `mallDownTime` | `mallDownTime` | 商城下架时间 |
| `mallUpTime` | `mallUpTime` | `mallUpTime` | 商城上架时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `stop_time` | `stop_time` | `stoptime` | 停用时间 |
| `uorderDownTime` | `uorderDownTime` | `uorderDownTime` | U订货下架时间 |
| `uorderUpTime` | `uorderUpTime` | `uorderUpTime` | U订货上架时间 |
| `create_time` | `create_time` | `createTime` | 创建时间 |

### other (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `production_mode` | `production_mode` | `productionMode` | 制造-生产模式 |
| `testRule` | `testRule` | `testRule` | 质检-检验规则 |

### multiLanguage (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cDisplayName` | `cDisplayName` | `displayName` | 显示名称 |
| `metaDescription` | `metaDescription` | `metaDescription` | 商城-搜索简介 |
| `receiptModel` | `receiptModel` | `receiptModel` | 开票型号 |
| `receiptName` | `receiptName` | `receiptName` | 开票名称 |
| `receiptSpec` | `receiptSpec` | `receiptSpec` | 开票规格 |
| `remark` | `remark` | `remark` | 备注 |
| `cTitleMemo` | `cTitleMemo` | `titleMemo` | 卖点 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `product_detail_character_def` | `product_detail_character_def` | `productExtendCharacterDef` | 物料详情自定义项 |
