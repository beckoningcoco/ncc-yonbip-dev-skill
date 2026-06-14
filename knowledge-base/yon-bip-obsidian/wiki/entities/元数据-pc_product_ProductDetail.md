---
tags: [BIP, 元数据, 数据字典, pc.product.ProductDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 物料业务信息 (`pc.product.ProductDetail`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`productdetail` | domain：`productcenter` | 应用：`GZTBDM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 物料业务信息 |
| 物理表 | `productdetail` |
| domain/服务域 | `productcenter` |
| schema | `iuap_apdoc_coredoc` |
| 所属应用 | `GZTBDM` |
| 直连字段 | 282 个 |
| 子表 | 8 个 |
| 关联引用 | 48 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `productTagNew` | `pc.product.ProductTagNew` | composition |
| `skuTagNew` | `pc.product.SkuTagNew` | composition |
| `productParameters` | `pc.product.ProductParameters` | composition |
| `productSkuDetailNew` | `pc.product.ProductSkuDetailNew` | composition |
| `productCheckFreeNew` | `pc.product.ProductCheckFreeNew` | composition |
| `ProductSkuOrderProperty` | `pc.product.ProductSkuOrderProperty` | composition |
| `productLoadWay` | `pc.product.ProductLoadWay` | composition |
| `productDepositTimeDetail` | `pc.product.ProductDepositTimeDetail` | composition |

## 关联引用 (48个)

| 字段名 | 引用类型 |
|--------|---------|
| `costItems` | `finbd.bd_expenseitemref` |
| `material_status` | `productcenter.pc_materialstatusref` |
| `produceUnitId` | `productcenter.pc_unitref_new` |
| `demandPlanningUnitId` | `` |
| `batchPriceUnitId` | `productcenter.pc_unitref_new` |
| `` | `` |
| `product_detail_character_def` | `` |
| `warehouseManager` | `ucf-staff-center.bd_staff_ref` |
| `BOMSource` | `productcenter.pc_nomalproductref` |
| `offlineUnitId` | `productcenter.pc_unitref_new` |
| `orgId` | `productcenter.aa_adminorgrangeref` |
| `inTaxrate` | `yonbip-fi-taxpubdoc.RefTable_839443ba26` |
| `productApplyRangeId` | `` |
| `outTaxrate` | `yonbip-fi-taxpubdoc.RefTable_839443ba26` |
| `requireUnitId` | `productcenter.pc_unitref_new` |
| `customerId` | `` |
| `purchasePriceUnitId` | `productcenter.pc_unitref_new` |
| `shopId` | `` |
| `billingUnitId` | `` |
| `taxClass` | `productcenter.pc_taxrevenueref` |
| `manufacturePlanner` | `ucf-staff-center.bd_staff_ref` |
| `productId` | `` |
| `receiptWarehouse` | `productcenter.aa_warehouse` |
| `dlyFeeRuleId` | `umall.um_deliverytyperef` |
| `productBuyer` | `ucf-staff-center.bd_staff_ref` |
| `ytenant_id` | `` |
| `produceDepartment` | `ucf-org-center.bd_adminorgsharetreeref` |
| `OMSWarehouse` | `productcenter.aa_warehouse` |
| `measurement_unit` | `` |
| `onlineUnitId` | `productcenter.pc_unitref_new` |
| `productVendor` | `yssupplier.aa_vendor` |
| `stockUnitId` | `productcenter.pc_unitref_new` |
| `costClass` | `productcenter.pc_costclassref` |
| `purchaseUnitId` | `productcenter.pc_unitref_new` |
| `deliveryWarehouse` | `productcenter.aa_warehouse` |
| `batchUnitId` | `productcenter.pc_unitref_new` |
| `preferentialPolicyType` | `productcenter.pc_taxrevenuepolicyref` |
| `inspectionUnitId` | `productcenter.pc_unitref_new` |
| `returnWarehouse` | `productcenter.aa_warehouse` |

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

> 共 282 个直连字段

### 文本字段 (14个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `shortName` | `shortName` | `shortName` | 物料简称 |
| `mnemonicCode` | `mnemonicCode` | `mnemonicCode` | 助记码 |
| `cErpOuterCode` | `cErpOuterCode` | `erpOuterCode` | 商家商品外部编码 |
| `cBarCode` | `cBarCode` | `barCode` | 条形码 |
| `businessAttribute` | `businessAttribute` | `businessAttribute` | 业务属性 |
| `saleChannel` | `saleChannel` | `saleChannel` | 销售渠道 |
| `priceAreaMessage` | `priceAreaMessage` | `priceAreaMessage` | 价格提示信息 |
| `cEngineeringDrawingNo` | `cEngineeringDrawingNo` | `engineeringDrawingNo` | 工程图号 |
| `manufacturing_strategy` | `manufacturing_strategy` | `manufacturingStrategy` | 制造策略 |
| `productAttribute` | `productAttribute` | `saleStyle` | 销售方式 |
| `pageTitle` | `pageTitle` | `pageTitle` | SEO设置相关 |
| `` | `creator` | `creator` | 创建人 |
| `` | `modifier` | `modifier` | 修改人 |
| `delivery_method` | `delivery_method` | `deliveryMethod` | 商城-配送方式 |

### 引用字段 (39个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户 |
| `productId` | `productId` | `productId` | 物料 |
| `orgId` | `orgId` | `orgId` | 使用组织 |
| `material_status` | `material_status` | `materialStatus` | 物料状态(组织级) |
| `costItems` | `costItems` | `costItems` | 费用项目 |
| `purchaseUnitId` | `purchaseUnitId` | `purchaseUnit` | 采购单位 |
| `purchasePriceUnitId` | `purchasePriceUnitId` | `purchasePriceUnit` | 采购计价单位 |
| `stockUnitId` | `stockUnitId` | `stockUnit` | 库存单位 |
| `produceUnitId` | `produceUnitId` | `produceUnit` | 生产单位 |
| `batchPriceUnitId` | `batchPriceUnitId` | `batchPriceUnit` | 批发计价单位 |
| `inspectionUnitId` | `inspectionUnitId` | `inspectionUnit` | 检验单位 |
| `batchUnitId` | `batchUnitId` | `batchUnit` | 批发销售单位 |
| `onlineUnitId` | `onlineUnitId` | `onlineUnit` | 线上零售单位 |
| `offlineUnitId` | `offlineUnitId` | `offlineUnit` | 线下零售单位 |
| `requireUnitId` | `requireUnitId` | `requireUnit` | 要货单位 |
| `demandPlanningUnitId` | `demandPlanningUnitId` | `demandPlanningUnit` | 需求计划单位 |
| `inTaxrate` | `inTaxrate` | `inTaxrate` | 进项税率 |
| `outTaxrate` | `outTaxrate` | `outTaxrate` | 销项税率 |
| `billingUnitId` | `billingUnitId` | `billingUnit` | 开票单位 |
| `preferentialPolicyType` | `preferentialPolicyType` | `preferentialPolicyType` | 优惠政策类型 |
| `productVendor` | `productVendor` | `productVendor` | 供应商 |
| `productBuyer` | `productBuyer` | `productBuyer` | 采购员 |
| `receiptWarehouse` | `receiptWarehouse` | `receiptWarehouse` | 收货仓库 |
| `OMSWarehouse` | `OMSWarehouse` | `omsWarehouse` | 电商仓 |
| `warehouseManager` | `warehouseManager` | `warehouseManager` | 库管员 |
| `deliveryWarehouse` | `deliveryWarehouse` | `deliveryWarehouse` | 发货仓库 |
| `returnWarehouse` | `returnWarehouse` | `returnWarehouse` | 退货仓库 |
| `produceDepartment` | `produceDepartment` | `produceDepartment` | 生产部门 |
| `manufacturePlanner` | `manufacturePlanner` | `manufacturePlanner` | 计划员 |
| `BOMSource` | `BOMSource` | `BOMSource` | 共享BOM来源 |
| `measurement_unit` | `measurement_unit` | `measurementUnit` | 计量项目单位 |
| `dlyFeeRuleId` | `dlyFeeRuleId` | `dlyFeeRuleId` | 商城运费模板 |
| `productApplyRangeId` | `productApplyRangeId` | `productApplyRangeId` | 物料分配范围 |
| `shopId` | `shopId` | `shopId` | 商家 |
| `customerId` | `customerId` | `customerId` | 客户 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `costClass` | `costClass` | `costClass` | 成本分类 |
| `taxClass` | `taxClass` | `taxClass` | 税收分类码 |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 布尔字段 (55个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isDisplayPrice` | `isDisplayPrice` | `isDisplayPrice` | 线上显示价格 |
| `isBatchManage` | `isBatchManage` | `isBatchManage` | 批次管理 |
| `isExpiryDateManage` | `isExpiryDateManage` | `isExpiryDateManage` | 有效期管理 |
| `isSerialNoManage` | `isSerialNoManage` | `isSerialNoManage` | 序列号管理 |
| `isBarcodeManage` | `isBarcodeManage` | `isBarcodeManage` | 条码管理 |
| `reservation` | `reservation` | `reservation` | 可预留 |
| `bWarehousingByResult` | `bWarehousingByResult` | `warehousingByResult` | 根据检验结果入库 |
| `bPeriodicalInspection` | `bPeriodicalInspection` | `periodicalInspection` | 定期检验 |
| `bExemption` | `bExemption` | `exemption` | 免检 |
| `bSalesReturnsExemption` | `bSalesReturnsExemption` | `salesReturnsExemption` | 销售退货免检 |
| `bReturnsWarehousingByResult` | `bReturnsWarehousingByResult` | `returnsWarehousingByResult` | 退货根据检验结果入库 |
| `bECNControl` | `bECNControl` | `ECNControl` | ECN管控 |
| `bBindCarrier` | `bBindCarrier` | `bindCarrier` | 绑定载具 |
| `bWeigh` | `bWeigh` | `weigh` | 是否过磅 |
| `bWorkingPlan` | `bWorkingPlan` | `workingPlan` | 排工序计划 |
| `bUtility` | `bUtility` | `utility` | 公用工程 |
| `bKeySubPart` | `bKeySubPart` | `keySubPart` | 关键子件 |
| `bPrepareFeed` | `bPrepareFeed` | `prepareFeed` | 是否长周期备料 |
| `bSpecialMaterials` | `bSpecialMaterials` | `specialMaterials` | 是否专用料 |
| `bVirtualPart` | `bVirtualPart` | `virtualPart` | 是否虚拟件 |
| `bLogisticsRelated` | `bLogisticsRelated` | `logisticsRelated` | 物流相关 |
| `bFixedReturn` | `bFixedReturn` | `fixedReturn` | 固定回空 |
| `bReviewGrossWeight` | `bReviewGrossWeight` | `reviewGrossWeight` | 复核毛重 |
| `bSpecialCarTransport` | `bSpecialCarTransport` | `specialCarTransport` | 专车运输 |
| `checkByBatch` | `checkByBatch` | `checkByBatch` | 按批次核算 |
| `bEnableSubscribe` | `bEnableSubscribe` | `enableSubscribe` | 启用预订业务 |
| `enableDeposit` | `enableDeposit` | `enableDeposit` | 启用定金业务 |
| `enablemodifyDeposit` | `enablemodifyDeposit` | `enablemodifyDeposit` | 订单改价时可修改定金 |
| `iEnableCyclePurchase` | `iEnableCyclePurchase` | `iEnableCyclePurchase` | 启用周期购 |
| `bCanOrder` | `bCanOrder` | `canOrder` | 可预约 |
| `bOnlyOrder` | `bOnlyOrder` | `onlyOrder` | 仅预约 |
| `iEnableEcontract` | `iEnableEcontract` | `iEnableEcontract` | 是否启用合同管理 |
| `isAllArea` | `isAllArea` | `isAllArea` | 是否适用所有区域 |
| `isRecommend` | `isRecommend` | `isRecommend` | 推荐物料 |
| `allowStorePurchase` | `allowStorePurchase` | `allowStorePurchase` | 允许门店自采 |
| `isSaleInOfflineStore` | `isSaleInOfflineStore` | `isSaleInOfflineStore` | 允许门店销售 |
| `isPriceChangeAllowed` | `isPriceChangeAllowed` | `isPriceChangeAllowed` | 允许开单改价 |
| `isOfflineStoreOrder` | `isOfflineStoreOrder` | `isOfflineStoreOrder` | 允许门店要货 |
| `isOfflineStoreReturn` | `isOfflineStoreReturn` | `isOfflineStoreReturn` | 允许门店退货 |
| `isProcess` | `isProcess` | `isProcess` | 加工 |
| `isMaterial` | `isMaterial` | `isMaterial` | 材料 |
| `isWeight` | `isWeight` | `isWeight` | 是否称重 |
| `saleChannelOfOnlineBatch` | `saleChannelOfOnlineBatch` | `saleChannelOfOnlineBatch` | 线上批发 |
| `saleChannelOfOnlineRetail` | `saleChannelOfOnlineRetail` | `saleChannelOfOnlineRetail` | 线上零售 |
| `saleChannelOfOfflineRetail` | `saleChannelOfOfflineRetail` | `saleChannelOfOfflineRetail` | 线下零售 |
| `saleChannelOfDistribution` | `saleChannelOfDistribution` | `saleChannelOfDistribution` | 微分销 |
| `iUOrderStatus` | `iUOrderStatus` | `iUOrderStatus` | 订货上架 |
| `iStatus` | `iStatus` | `iStatus` | 商城上架 |
| `isCreator` | `isCreator` | `isCreator` | 是否创建者 |
| `canSale` | `canSale` | `canSale` | B2B是否可售 |
| `bAllowNegativeInventory` | `bAllowNegativeInventory` | `allowNegativeInventory` | 允许负库存 |
| `bAccountingByItem` | `bAccountingByItem` | `accountingByItem` | 按单品核算 |
| `bCheckByCost` | `bCheckByCost` | `checkByCost` | 按费用核算 |
| `bMaterialCost` | `bMaterialCost` | `materialCost` | 材料费用化 |
| `stopstatus` | `stopstatus` | `stopstatus` | 启用状态 |

### 整数 (67个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `mallupcount` | `mallupcount` | `mallupcount` | 商城上架数量 |
| `malldowncount` | `malldowncount` | `malldowncount` | 商城下架数量 |
| `uorderupcount` | `uorderupcount` | `uorderupcount` | 订货上架数量 |
| `uorderdowncount` | `uorderdowncount` | `uorderdowncount` | 订货下架数量 |
| `deliveryDays` | `deliveryDays` | `deliveryDays` | 交货周期 |
| `overSigning` | `overSigning` | `overSigning` | 超量签收 |
| `expireDateNo` | `expireDateNo` | `expireDateNo` | 保质期 |
| `iDaysBeforeValidityReject` | `iDaysBeforeValidityReject` | `daysBeforeValidityReject` | 近效期拒收天数 |
| `iValidityWarningDays` | `iValidityWarningDays` | `validityWarningDays` | 近效期预警天数 |
| `manageByInventory` | `manageByInventory` | `manageByInventory` | 项目库存 |
| `iMaximumTurnoverDays` | `iMaximumTurnoverDays` | `maximumTurnoverDays` | 最大周转天数 |
| `iABCClass` | `iABCClass` | `iABCClass` | ABC分类 |
| `atpInspection` | `atpInspection` | `atpInspection` | ATP检查 |
| `inspectionType` | `inspectionType` | `inspectionType` | 采购检验 |
| `inspectionControlPoint` | `inspectionControlPoint` | `inspectionControlPoint` | 采购检验控制点 |
| `productInspection` | `productInspection` | `productInspection` | 产品检验 |
| `productInspectionCtrlPoint` | `productInspectionCtrlPoint` | `productInspectionCtrlPoint` | 产品检验控制点 |
| `outSourceInspection` | `outSourceInspection` | `outSourceInspection` | 委外检验 |
| `transferInspection` | `transferInspection` | `transferInspection` | 调拨检验 |
| `productFirstInspection` | `productFirstInspection` | `productFirstInspection` | 产品首检 |
| `firstInspectionCtrlMethod` | `firstInspectionCtrlMethod` | `firstInspectionCtrlMethod` | 首检控制方式 |
| `enable_stock_period_recheck` | `enable_stock_period_recheck` | `enableStockPeriodRecheck` | 启用库存周期复检 |
| `review_cycle` | `review_cycle` | `reviewCycle` | 复检周期 |
| `recheck_reminder_lead_time` | `recheck_reminder_lead_time` | `recheckReminderLeadTime` | 复检提醒提前期 |
| `enable_stock_expire_check` | `enable_stock_expire_check` | `enableStockExpireCheck` | 启用库存临期检验 |
| `effective_lead_time` | `effective_lead_time` | `effectiveLeadTime` | 有效期提前期 |
| `check_reminder_lead_time` | `check_reminder_lead_time` | `checkReminderLeadTime` | 检验提醒提前期 |
| `send_inspection` | `send_inspection` | `sendInspection` | 发货检验 |
| `return_inspection` | `return_inspection` | `returnInspection` | 退货检验 |
| `plan_check_days` | `plan_check_days` | `planCheckDays` | 计划检验天数 |
| `single_Inspection` | `single_Inspection` | `singleInspection` | 单件检验 |
| `iPeriodicalInspectionCycle` | `iPeriodicalInspectionCycle` | `periodicalInspectionCycle` | 定期检验周期 |
| `full_set_inspection` | `full_set_inspection` | `fullSetInspection` | 齐套检查 |
| `mto_strategy` | `mto_strategy` | `mtoStrategy` | MTO策略 |
| `projectTrackStrategy` | `projectTrackStrategy` | `projectTrackStrategy` | 项目跟踪策略 |
| `iFrontLeadTime` | `iFrontLeadTime` | `frontLeadTime` | 前段提前期 |
| `iBehindLeadTime` | `iBehindLeadTime` | `behindLeadTime` | 后段提前期 |
| `iFixedLeadTime` | `iFixedLeadTime` | `fixedLeadTime` | 固定提前期 |
| `direct_production` | `direct_production` | `directProduction` | 是否直接生产 |
| `iDemandConsolidationNumber` | `iDemandConsolidationNumber` | `demandConsolidationNumber` | 需求合并时格数 |
| `iResetForwardDays` | `iResetForwardDays` | `resetForwardDays` | 重排前移天数 |
| `iResetBackwardDays` | `iResetBackwardDays` | `resetBackwardDays` | 重排后移天数 |
| `iBeyondSupplyDays` | `iBeyondSupplyDays` | `beyondSupplyDays` | 超期供给天数 |
| `strategy_comparison_rule` | `strategy_comparison_rule` | `strategyComparisonRule` | 策略对比方式 |
| `iSupplyTimes` | `iSupplyTimes` | `supplyTimes` | 供应倍数 |
| `checkByProject` | `checkByProject` | `checkByProject` | 按项目核算 |
| `checkBySalesOrders` | `checkBySalesOrders` | `checkBySalesOrders` | 按销售订单核算 |
| `checkByRevenueManagement` | `checkByRevenueManagement` | `checkByRevenueManagement` | 收入管理核算 |
| `checkByClient` | `checkByClient` | `checkByClient` | 按客户核算 |
| `checkByOutsourcing` | `checkByOutsourcing` | `checkByOutsourcing` | 按委外商核算 |
| `turnover_materials` | `turnover_materials` | `turnoverMaterials` | 周转材 |
| `amortization_method` | `amortization_method` | `amortizationMethod` | 摊销方式 |
| `salePoints` | `salePoints` | `salePoints` | 销售积分 |
| `iBaseSaleCount` | `iBaseSaleCount` | `iBaseSaleCount` | 初始销量 |
| `depositDealPayType` | `depositDealPayType` | `depositDealPayType` | 定金设置方式 |
| `depositPayType` | `depositPayType` | `depositPayType` | 支付尾款方式 |
| `enable_spare_parts_management` | `enable_spare_parts_management` | `enableSparePartsManagement` | 启用备件管理 |
| `business_attr_purchase` | `business_attr_purchase` | `businessAttributePurchase` | 采购 |
| `business_attr_sale` | `business_attr_sale` | `businessAttributeSale` | 销售 |
| `business_attr_self_create` | `business_attr_self_create` | `businessAttributeSelfCreate` | 自制 |
| `business_attr_outsourcing` | `business_attr_outsourcing` | `businessAttributeOutSourcing` | 委外 |
| `outSourceInspectionCtrlPoint` | `outSourceInspectionCtrlPoint` | `outSourceInspectionCtrlPoint` | 委外检验控制点 |
| `transferInspectionCtrlPoint` | `transferInspectionCtrlPoint` | `transferInspectionCtrlPoint` | 调拨检验控制点 |
| `sendInspectionCtrlPoint` | `sendInspectionCtrlPoint` | `sendInspectionCtrlPoint` | 发货检验控制点 |
| `returnInspectionCtrlPoint` | `returnInspectionCtrlPoint` | `returnInspectionCtrlPoint` | 退货检验控制点 |
| `iRangeType` | `iRangeType` | `rangeType` | 物料适用范围类型 |
| `iOrder` | `iOrder` | `iOrder` | 排序号 |

### 短整数 (27个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `expirydate_calculation_method` | `expirydate_calculation_method` | `isExpiryDateCalculationMethod` | 有效期推算方式 |
| `expireDateUnit` | `expireDateUnit` | `expireDateUnit` | 保质期单位 |
| `scanCountUnit` | `scanCountUnit` | `scanCountUnit` | 扫码计数单位 |
| `supplyType` | `supplyType` | `supplyType` | 供应类型 |
| `iPurpose` | `iPurpose` | `purpose` | 用途 |
| `planDefaultAttribute` | `planDefaultAttribute` | `planDefaultAttribute` | 计划默认属性 |
| `planMethod` | `planMethod` | `planMethod` | 计划方法 |
| `inventoryPlanStrategy` | `inventoryPlanStrategy` | `inventoryPlanStrategy` | 库存规划策略 |
| `iBOMType` | `iBOMType` | `BOMType` | 物料BOM类型 |
| `iBatchRule` | `iBatchRule` | `batchRule` | 批量规则 |
| `lossType` | `lossType` | `lossType` | 损耗类型 |
| `iDemandConsolidation` | `iDemandConsolidation` | `demandConsolidation` | 物料需求合并 |
| `iDemandConsolidationType` | `iDemandConsolidationType` | `demandConsolidationType` | 需求合并类型 |
| `iDemandConsolidationUnit` | `iDemandConsolidationUnit` | `demandConsolidationUnit` | 需求合并时格 |
| `iDemandConsolidationDateType` | `iDemandConsolidationDateType` | `demandConsolidationDateType` | 需求合并日 |
| `supplyDemandPolicy` | `supplyDemandPolicy` | `supplyDemandPolicy` | 供需政策 |
| `iWeighingMode` | `iWeighingMode` | `weighingMode` | 称重方式 |
| `iValueManageType` | `iValueManageType` | `valueManageType` | 价值管理模式 |
| `iCostValuation` | `iCostValuation` | `costValuation` | 成本计价方法 |
| `iOrderAdvanceTime` | `iOrderAdvanceTime` | `orderAdvanceTime` | 预约提前期 |
| `iServiceDurationUnit` | `iServiceDurationUnit` | `serviceDurationUnit` | 服务时长单位 |
| `retailPriceDimension` | `retailPriceDimension` | `retailPriceDimension` | 零售取价维度 |
| `deliverQuantityChange` | `deliverQuantityChange` | `deliverQuantityChange` | 交货数量改变时 |
| `iProcessType` | `iProcessType` | `processType` | 加工方式 |
| `requirementTrackingMethod` | `requirementTrackingMethod` | `requirementTrackingMethod` | 需求跟踪方式 |
| `batchPolicy` | `batchPolicy` | `batchPolicy` | 批量政策 |
| `isCheckFree` | `isCheckFree` | `isCheckFree` | 按规格核算 |

### 长整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `planStrategy` | `planStrategy` | `planStrategy` | 时界 |
| `uorderDlyFeeRuleId` | `uorderDlyFeeRuleId` | `uorderDlyFeeRuleId` | 运费模板 |
| `tenant_id` | `tenant_id` | `tenant` | 租户(废弃) |

### 数值字段 (47个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `fMarkPrice` | `fMarkPrice` | `fMarkPrice` | 建议零售价 |
| `fSalePrice` | `fSalePrice` | `fSalePrice` | 线上零售价 |
| `fMarketPrice` | `fMarketPrice` | `fMarketPrice` | 市场价 |
| `fPrimeCosts` | `fPrimeCosts` | `fPrimeCosts` | 采购参考价 |
| `fMaxPrimeCosts` | `fMaxPrimeCosts` | `maxPrimeCosts` | 最高进价 |
| `fRequestOrderLimit` | `fRequestOrderLimit` | `requestOrderLimit` | 请购订货超量上限 |
| `purchase_order_quantity` | `purchase_order_quantity` | `purchaseOrderQuantity` | 采购起订量 |
| `purchase_times` | `purchase_times` | `purchaseTimes` | 采购倍量 |
| `fArrivalAllowErrorLimit` | `fArrivalAllowErrorLimit` | `arrivalAllowErrorLimit` | 到货入库允差上下比例 |
| `fInvoiceAllowErrorLimit` | `fInvoiceAllowErrorLimit` | `invoiceAllowErrorLimit` | 开票允差上下比例 |
| `iMinOrderQuantity` | `iMinOrderQuantity` | `iMinOrderQuantity` | 销售起订量 |
| `iDoubleSale` | `iDoubleSale` | `iDoubleSale` | 销售倍量 |
| `safetyStock` | `safetyStock` | `safetyStock` | 安全库存 |
| `highestStock` | `highestStock` | `highestStock` | 最高库存 |
| `lowestStock` | `lowestStock` | `lowestStock` | 最低库存 |
| `ropStock` | `ropStock` | `ropStock` | 再订货点 |
| `fInStoreExcessLimit` | `fInStoreExcessLimit` | `inStoreExcessLimit` | 入库超量上限 |
| `fOutStoreExcessLimit` | `fOutStoreExcessLimit` | `outStoreExcessLimit` | 出库超量上限 |
| `fInStoreLessLimit` | `fInStoreLessLimit` | `inStoreLessLimit` | 入库下限比例 |
| `fOutStoreLessLimit` | `fOutStoreLessLimit` | `outStoreLessLimit` | 出库下限比例 |
| `storageLossRate` | `storageLossRate` | `storageLossRate` | 保管损耗率 |
| `doubleReplenish` | `doubleReplenish` | `doubleReplenish` | 补货倍量 |
| `doublePick` | `doublePick` | `doublePick` | 领料倍量 |
| `iPlanProduceLimit` | `iPlanProduceLimit` | `planProduceLimit` | 计划下达超量上限 |
| `iEconomicQuantity` | `iEconomicQuantity` | `economicQuantity` | 经济批量 |
| `iFixedQuantity` | `iFixedQuantity` | `fixedQuantity` | 固定批量 |
| `iBatchDouble` | `iBatchDouble` | `batchDouble` | 批量倍量 |
| `iLeadTimeCoefficient` | `iLeadTimeCoefficient` | `leadTimeCoefficient` | 提前期系数 |
| `iLeadTimeQuantity` | `iLeadTimeQuantity` | `leadTimeQuantity` | 提前期批量 |
| `iFixedWastage` | `iFixedWastage` | `fixedWastage` | 固定损耗量 |
| `iWastageRate` | `iWastageRate` | `wastageRate` | 损耗率 |
| `iRejectRate` | `iRejectRate` | `rejectRate` | 废品率 |
| `fNoTaxCostPrice` | `fNoTaxCostPrice` | `fNoTaxCostPrice` | 参考成本 |
| `measurement_count` | `measurement_count` | `measurementCount` | 计量项目数量 |
| `compensation_amount` | `compensation_amount` | `compensationAmount` | 赔偿金额 |
| `molding_time` | `molding_time` | `moldingTime` | 成型时间 |
| `mold_cavities` | `mold_cavities` | `moldCavities` | 模具腔数 |
| `lInventoryCount` | `lInventoryCount` | `lInventoryCount` | 线上库存量 |
| `minimumDeposits` | `minimumDeposits` | `minimumDeposits` | 最低定金金额 |
| `fSettleAccountsRate` | `fSettleAccountsRate` | `fSettleAccountsRate` | 结算费率 |
| `depositPercentage` | `depositPercentage` | `depositPercentage` | 成交金额百分比 |
| `deposits` | `deposits` | `deposits` | 固定金额 |
| `iServiceDuration` | `iServiceDuration` | `serviceDuration` | 服务时长 |
| `fLowestMarkPrice` | `fLowestMarkPrice` | `fLowestMarkPrice` | 最低零售价 |
| `batchPrice` | `batchPrice` | `batchPrice` | 批发价 |
| `maxBatchPrice` | `maxBatchPrice` | `maxBatchPrice` | 最高批发价格 |
| `minBatchPrice` | `minBatchPrice` | `minBatchPrice` | 最低批发价格 |

### multiLanguage (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `receiptName` | `receiptName` | `receiptName` | 开票名称 |
| `receiptSpec` | `receiptSpec` | `receiptSpec` | 开票规格 |
| `receiptModel` | `receiptModel` | `receiptModel` | 开票型号 |
| `metaDescription` | `metaDescription` | `metaDescription` | 搜索简介 |
| `cDisplayName` | `cDisplayName` | `displayName` | 显示名称 |
| `cTitleMemo` | `cTitleMemo` | `titleMemo` | 卖点 |
| `remark` | `remark` | `remark` | 备注 |

### timestamp (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `mallUpTime` | `mallUpTime` | `mallUpTime` | 商城上架时间 |
| `mallDownTime` | `mallDownTime` | `mallDownTime` | 商城下架时间 |
| `uorderUpTime` | `uorderUpTime` | `uorderUpTime` | 订货上架时间 |
| `uorderDownTime` | `uorderDownTime` | `uorderDownTime` | 订货下架时间 |
| `stop_time` | `stop_time` | `stoptime` | 停用时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `beUpTime` | `beUpTime` | `beUpTime` | 预约上架时间 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### other (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `testRule` | `testRule` | `testRule` | 检验规则 |
| `production_mode` | `production_mode` | `productionMode` | 生产模式 |
| `` | `` | `ProductSkuOrderProperty` | 物料订单属性(整合) |
| `` | `` | `productCheckFreeNew` | 指定核算的规格(整合) |
| `` | `` | `productDepositTimeDetail` | 物料定金时间关联明细表 |
| `` | `` | `productLoadWay` | 物料装载方式(整合) |
| `` | `` | `productParameters` | 物料参数表(整合) |
| `` | `` | `productSkuDetailNew` | 物料SKU详情(整合) |
| `` | `` | `productTagNew` | 物料标签关联表(整合) |
| `` | `` | `skuTagNew` | SKU标签关联表(整合) |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `product_detail_character_def` | `product_detail_character_def` | `productExtendCharacterDef` | 物料详情自定义项 |
