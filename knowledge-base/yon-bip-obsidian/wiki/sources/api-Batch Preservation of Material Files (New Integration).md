---
title: "物料档案批量保存(新集成)"
apiId: "2150440466883543040"
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

# 物料档案批量保存(新集成)

> `ContentType	application/json` 请求方式	POST | 分类: Material (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/product/batch/save

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	批量保存/更新

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 是 | 否 | 请求体 |
| sourceUnique | string | 否 | 否 | 来源唯一性标识 示例：2149120674867183618 |
| targetUnique | string | 否 | 否 | 目标唯一性标识 |
| erpCode | string | 否 | 否 | 商家编码 示例：test1 |
| brand___code | string | 否 | 否 | 物料品牌编码 示例：test1 |
| code | string | 否 | 是 | 物料编码 示例：test1 |
| costClass___code | string | 否 | 否 | 成本分类编码 示例：test1 |
| couponId___cTitle | string | 否 | 否 | 卡券名称 示例：test1 |
| couponType | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 卡券类型 |
| cPlatFormRemark | string | 否 | 否 | 平台处理商家物料备注 示例：测试备注 |
| creatorType | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 创建者类型 示例：1 |
| customerServiceDay | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 售后服务期限（天） 示例：1 |
| enableAssistUnit | boolean | 否 | 否 | 启用辅计量（true：启用，false：停用。新增时如果未传，默认为false） 示例：false |
| giftCardId___giftCardCode | string | 否 | 否 | 礼品卡编码 示例：test1 |
| height | number |
| 小数位数:8,最大长度:19 | 否 | 否 | 库存-高 示例：1 |
| homepageBusinessId | string | 否 | 否 | 物料首页图片业务ID 示例：c16b0bf4-2941-43a4-b382-ab1167de5b17 |
| id | number |
| 小数位数:0,最大长度:19 | 否 | 否 | 物料ID |
| imgBusinessId | string | 否 | 否 | 物料图片业务ID 示例：df6a101d-d11f-4971-95d4-1a9db4df9e1e |
| internalSupplyOrgId___code | string | 否 | 否 | 内部供应组织编码 示例：test1 |
| isAuthorizationManager | boolean | 否 | 否 | 医药-授权书管理（false：否，true：是。新增时如果未传，默认为false） 示例：false |
| isBatch | number |
| 小数位数:0,最大长度:1 | 否 | 否 | 是否批量 示例：1 |
| isDerivedMaterial | number |
| 小数位数:0,最大长度:1 | 否 | 否 | 是否派生物料（0代表否，1代表是。当是否可选配为是时，是否派生物料默认为否无需传参，并且选配物料只能为空。当是否可选配为否时，是否派生物料可以为是也可以为否，当是否派生物料为是时，选配物料必填。新增时不传，默认为0） 示例：0 |
| isOptionalMaterial | number |
| 小数位数:0,最大长度:1 | 否 | 否 | 是否可选配（0代表否，1代表是。当是否可选配为是时，是否派生物料默认为否无需传参，并且选配物料只能为空。当是否可选配为否时，是否派生物料可以为是也可以为否，当是否派生物料为是时，选配物料必填。新增时不传，默认为0） 示例：0 |
| isRegistrationManager | boolean | 否 | 否 | 医药-注册证管理（true：是，false：否。新增时如果不传，默认为false） 示例：false |
| keywords | object | 否 | 否 | 关键字，根据租户开通的语言传入，语言编码可以在【语言设置】菜单下查看 |
| length | number |
| 小数位数:8,最大长度:19 | 否 | 否 | 库存-长 示例：3 |
| lifeCycleTemplate___code | string | 否 | 否 | 物料生命周期模板编码 示例：test1 |
| manageClass___code | string | 否 | 否 | 物料分类编码 示例：test1 |
| manufacturer | string | 否 | 否 | 生产厂商 示例：生产厂商 |
| materialStatus___code | string | 否 | 否 | 物料状态编码 示例：system_01 |
| model | object | 否 | 否 | 型号，根据租户开通的语言传入，语言编码可以在【语言设置】菜单下查看 |
| modelDescription | object | 否 | 否 | 规格说明，根据租户开通的语言传入，语言编码可以在【语言设置】菜单下查看 |
| name | object | 否 | 是 | 名称，根据租户开通的语言传入，语言编码可以在【语言设置】菜单下查看 |
| netWeight | number |
| 小数位数:8,最大长度:19 | 否 | 否 | 库存-净重 示例：1 |
| netWeightUnit___code | string | 否 | 否 | 库存-净重单位编码 示例：kg |
| optionalMaterialId___code | string | 否 | 否 | 特征-选配物料编码 示例：test |
| optionalType | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 选配方式（0表示特征选配，1表示组件选配。是否选配为是且选配方式不传时，默认为特征选配！选配方式为特征选配时，物料模板只能选择是否选配模板为是的模板！选配方式为组件选配时，物料模板可以不传或者选择是否选配模板为否的模板！） 示例：0 |
| orgId___code | string | 否 | 否 | 创建者组织编码 示例：global00 |
| placeOfOrigin | string | 否 | 否 | 产地 示例：用友产业园 |
| planClass___code | string | 否 | 否 | 计划分类编码 示例：test1 |
| platformCode | string | 否 | 否 | 平台编码 示例：平台编码 |
| productClass___code | string | 否 | 否 | 商品分类编码 示例：test1 |
| productFamily | number |
| 小数位数:0,最大长度:1 | 否 | 否 | 制造-产品族，0：否，1：是 示例：1 |
| productLine___code | string | 否 | 否 | 产品线编码 示例：test1 |
| productTemplate___name | string | 否 | 否 | 物料模板名称 示例：test1 |
| ptoPriceType | number |
| 小数位数:0,最大长度:1 | 否 | 否 | PTO定价类型-按母件定价，0：按母件定价，1：按子件定价 示例：0 |
| purchaseClass___code | string | 否 | 否 | 采购分类编码 示例：test1 |
| realProductAttribute | number |
| 小数位数:0,最大长度:10 | 否 | 是 | 物料性质，1：实物物料，2：虚拟物料 示例：1 |
| realProductAttributeType | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 实物物料属性，1：普通物料，2：实体卡券，20：描述性物料，3：实体储值卡，4：设备 示例：1 |
| registrationNo | string | 否 | 否 | 医药-注册证号 示例：12345678 |
| salesAndOperations | number |
| 小数位数:0,最大长度:1 | 否 | 否 | 制造-参与SOP，0：否，1：是 示例：0 |
| shareDescription | object | 否 | 否 | 分享说明，根据租户开通的语言传入，语言编码可以在【语言设置】菜单下查看 |
| shop___code | string | 否 | 否 | 创建者商家编码 |
| sunshinePurchaseNo | string | 否 | 否 | 医药-阳光采购号 示例：123456 |
| taxClass___code | string | 否 | 否 | 税收分类码编码 示例：1010105000000000000 |
| transType___code | string | 否 | 否 | 交易类型-物料类型编码 示例：SYCSR002 |
| unit___code | string | 否 | 否 | 主计量单位编码 示例：KGM |
| unitUseType | number |
| 小数位数:0,最大长度:1 | 否 | 是 | 计量单位设置规则，1：使用物料模板的计量单位，2：使用物料自己的计量单位 示例：2 |
| useSku | number |
| 小数位数:0,最大长度:1 | 否 | 否 | 商品SKU，0：否，1：是 示例：1 |
| videoBusinessId | string | 否 | 否 | 物料视频业务ID 示例：e78c2cd4-7685-65a5-c396-bc1354de7c25 |
| virtualProductAttribute | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 虚拟物料属性，1：储值卡，10：折扣，11：套件，16：PTO，2：礼品卡，3：卡券，4：其它，7：服务，9：套餐 示例：7 |
| volume | number |
| 小数位数:8,最大长度:19 | 否 | 否 | 库存-体积 示例：1 |
| volumeUnit___code | string | 否 | 否 | 库存-体积单位编码 示例：MTQ |
| weight | number |
| 小数位数:8,最大长度:19 | 否 | 否 | 库存-毛重 示例：1 |
| weightUnit___code | string | 否 | 否 | 库存-毛重单位编码 示例：kg |
| width | number |
| 小数位数:8,最大长度:19 | 否 | 否 | 库存-宽 示例：1 |
| productOrgs | object | 是 | 否 | 分配关系 |
| productAssistUnitExchanges | object | 是 | 否 | 辅计量 |
| productTags | object | 是 | 否 | 标签 |
| productAssistClasses | object | 是 | 否 | 辅助分类 |
| productBarCodes | object | 是 | 否 | 条码 |
| description | object | 否 | 否 | 物料详情描述 |
| detail | object | 否 | 否 | 物料详情 |
| matchRule | string | 否 | 否 | 数据匹配规则，"id"：表示根据物料id匹配物料。如果不传默认按照物料编码匹配物料，物料存在，做更新操作，否则做新增操作。 示例：id |

## 3. 请求示例

Url: /yonbip/digitalModel/product/batch/save?access_token=访问令牌
Body: {
	"data": [
		{
			"sourceUnique": "2149120674867183618",
			"targetUnique": "",
			"erpCode": "test1",
			"brand___code": "test1",
			"code": "test1",
			"costClass___code": "test1",
			"couponId___cTitle": "test1",
			"couponType": 0,
			"cPlatFormRemark": "测试备注",
			"creatorType": 1,
			"customerServiceDay": 1,
			"enableAssistUnit": false,
			"giftCardId___giftCardCode": "test1",
			"height": 1,
			"homepageBusinessId": "c16b0bf4-2941-43a4-b382-ab1167de5b17",
			"id": 0,
			"imgBusinessId": "df6a101d-d11f-4971-95d4-1a9db4df9e1e",
			"internalSupplyOrgId___code": "test1",
			"isAuthorizationManager": false,
			"isBatch": 1,
			"isDerivedMaterial": 0,
			"isOptionalMaterial": 0,
			"isRegistrationManager": false,
			"keywords": {
				"zh_CN": "简体",
				"en_US": "英文",
				"zh_TW": "繁体"
			},
			"length": 3,
			"lifeCycleTemplate___code": "test1",
			"manageClass___code": "test1",
			"manufacturer": "生产厂商",
			"materialStatus___code": "system_01",
			"model": {
				"zh_CN": "简体",
				"en_US": "英文",
				"zh_TW": "繁体"
			},
			"modelDescription": {
				"zh_CN": "简体",
				"en_US": "英文",
				"zh_TW": "繁体"
			},
			"name": {
				"zh_CN": "简体",
				"en_US": "英文",
				"zh_TW": "繁体"
			},
			"netWeight": 1,
			"netWeightUnit___code": "kg",
			"optionalMaterialId___code": "test",
			"optionalType": 0,
			"orgId___code": "global00",
			"placeOfOrigin": "用友产业园",
			"planClass___code": "test1",
			"platformCode": "平台编码",
			"productClass___code": "test1",
			"productFamily": 1,
			"productLine___code": "test1",
			"productTemplate___name": "test1",
			"ptoPriceType": 0,
			"purchaseClass___code": "test1",
			"realProductAttribute": 1,
			"realProductAttributeType": 1,
			"registrationNo": "12345678",
			"salesAndOperations": 0,
			"shareDescription": {
				"zh_CN": "简体",
				"en_US": "英文",
				"zh_TW": "繁体"
			},
			"shop___code": "",
			"sunshinePurchaseNo": "123456",
			"taxClass___code": "1010105000000000000",
			"transType___code": "SYCSR002",
			"unit___code": "KGM",
			"unitUseType": 2,
			"useSku": 1,
			"videoBusinessId": "e78c2cd4-7685-65a5-c396-bc1354de7c25",
			"virtualProductAttribute": 7,
			"volume": 1,
			"volumeUnit___code": "MTQ",
			"weight": 1,
			"weightUnit___code": "kg",
			"width": 1,
			"productOrgs": [
				{
					"orgId___code": "global00",
					"rangeType": 1
				}
			],
			"productAssistUnitExchanges": [
				{
					"unitExchangeType": 0,
					"assistUnit___code": "TNE",
					"assistUnitCount": 1,
					"mainUnitCount": 1000,
					"iOrder": 0,
					"balance": 0
				}
			],
			"productTags": [
				{
					"tagId___name": "tag01"
				}
			],
			"productAssistClasses": [
				{
					"productClassId___code": "test1"
				}
			],
			"productBarCodes": [
				{
					"barCode": "10101"
				}
			],
			"description": {
				"description": "物料电脑端描述",
				"mobileDescription": "物料手机端描述"
			},
			"detail": {
				"stopstatus": false,
				"accountingByItem": false,
				"allowNegativeInventory": false,
				"allowStorePurchase": true,
				"arrivalAllowErrorLimit": 1,
				"atpInspection": 0,
				"barCode": "10101",
				"batchDouble": 10,
				"batchPolicy": 0,
				"batchPrice": 0,
				"batchPriceUnit___code": "KGM",
				"batchRule": 0,
				"batchUnit___code": "KGM",
				"behindLeadTime": 10,
				"beyondSupplyDays": 10,
				"billingUnit___code": "KGM",
				"bindCarrier": true,
				"BOMSource___code": "",
				"BOMType": 0,
				"businessAttribute": "1,7",
				"canOrder": true,
				"canSale": true,
				"checkByBatch": false,
				"checkByClient": 0,
				"checkByCost": false,
				"checkByOutsourcing": 0,
				"checkByProject": 0,
				"checkByRevenueManagement": 0,
				"checkBySalesOrders": 0,
				"checkReminderLeadTime": 5,
				"costItems___code": "test1",
				"costValuation": 1,
				"customerId___code": "",
				"daysBeforeValidityReject": 0,
				"deliverQuantityChange": 1,
				"deliveryDays": 0,
				"deliveryWarehouse___code": "000036",
				"demandConsolidation": 0,
				"demandConsolidationDateType": 0,
				"demandConsolidationNumber": 1,
				"demandConsolidationType": 0,
				"demandConsolidationUnit": 0,
				"demandPlanningUnit___code": "KGM",
				"depositDealPayType": 0,
				"depositPayType": 0,
				"depositPercentage": 10,
				"deposits": 100,
				"directProduction": 0,
				"displayName": {
					"zh_CN": "简体",
					"en_US": "英文",
					"zh_TW": "繁体"
				},
				"dlyFeeRuleId___dlyFeeRuleId___code": "test1",
				"doublePick": 10,
				"doubleReplenish": 10,
				"ECNControl": false,
				"economicQuantity": 10,
				"effectiveLeadTime": 5,
				"enableDeposit": false,
				"enablemodifyDeposit": false,
				"enableSparePartsManagement": 0,
				"enableStockExpireCheck": 0,
				"enableStockPeriodRecheck": 0,
				"enableSubscribe": false,
				"engineeringDrawingNo": "10101",
				"erpOuterCode": "test1",
				"exemption": false,
				"expireDateNo": 0,
				"expireDateUnit": 1,
				"fixedLeadTime": 0,
				"fixedQuantity": 10,
				"fixedReturn": true,
				"fixedWastage": 10,
				"fLowestMarkPrice": 8,
				"fMarketPrice": 10,
				"fMarkPrice": 10,
				"fNoTaxCostPrice": 1,
				"fPrimeCosts": 8,
				"frontLeadTime": 10,
				"fSalePrice": 10,
				"fSettleAccountsRate": 5,
				"fullSetInspection": 0,
				"highestStock": 10,
				"iABCClass": 1,
				"iBaseSaleCount": 0,
				"iDoubleSale": 0,
				"iEnableCyclePurchase": false,
				"iEnableEcontract": false,
				"iMinOrderQuantity": 1,
				"inspectionType": 0,
				"inspectionUnit___code": "KGM",
				"inStoreExcessLimit": 1,
				"inStoreLessLimit": 1,
				"inTaxrate___code": "VATR6",
				"inventoryPlanStrategy": 0,
				"invoiceAllowErrorLimit": 1,
				"iOrder": 0,
				"isAllArea": true,
				"isBarcodeManage": false,
				"isBatchManage": false,
				"isCheckFree": 0,
				"isCreator": true,
				"isDisplayPrice": true,
				"isExpiryDateCalculationMethod": 0,
				"isExpiryDateManage": false,
				"isMaterial": false,
				"isOfflineStoreOrder": true,
				"isOfflineStoreReturn": true,
				"isPriceChangeAllowed": false,
				"isProcess": false,
				"isRecommend": false,
				"isSaleInOfflineStore": true,
				"isSerialNoManage": false,
				"iStatus": false,
				"isWeight": false,
				"iUOrderStatus": false,
				"keySubPart": false,
				"leadTimeCoefficient": 1,
				"leadTimeQuantity": 1,
				"lInventoryCount": 1,
				"logisticsRelated": false,
				"lossType": 0,
				"lowestStock": 1,
				"malldowncount": 1,
				"mallupcount": 1,
				"manageByInventory": 0,
				"manufacturePlanner___code": "test1",
				"manufacturingStrategy": "MTO",
				"materialCost": false,
				"materialStatus___code": "system_01",
				"maxBatchPrice": 1,
				"maximumTurnoverDays": 1,
				"maxPrimeCosts": 0,
				"metaDescription": {
					"zh_CN": "简体",
					"en_US": "英文",
					"zh_TW": "繁体"
				},
				"minBatchPrice": 1,
				"minimumDeposits": 0,
				"mnemonicCode": "test1",
				"mtoStrategy": 0,
				"offlineUnit___code": "KGM",
				"omsWarehouse___code": "test1",
				"onlineUnit___code": "KGM",
				"onlyOrder": true,
				"orderAdvanceTime": 0,
				"orgId___code": "global00",
				"outStoreExcessLimit": 1,
				"outStoreLessLimit": 1,
				"outTaxrate___code": "VATR6",
				"overSigning": 0,
				"pageTitle": "test",
				"periodicalInspection": false,
				"periodicalInspectionCycle": 1,
				"planCheckDays": 1,
				"planDefaultAttribute": 1,
				"planMethod": 0,
				"planProduceLimit": 0,
				"planStrategy___code": "test1",
				"preferentialPolicyType___taxRevenueCode": "1110101000000000000",
				"prepareFeed": false,
				"priceAreaMessage": "价格提示信息",
				"processType": 0,
				"produceDepartment___code": "00012",
				"produceUnit___code": "KGM",
				"productBuyer___code": "test1",
				"productionMode": 1,
				"productVendor___code": "0001000102",
				"projectTrackStrategy": 0,
				"purchaseOrderQuantity": 0,
				"purchasePriceUnit___code": "KGM",
				"purchaseTimes": 0,
				"purchaseUnit___code": "KGM",
				"purpose": 1,
				"rangeType": 1,
				"receiptModel": {
					"zh_CN": "简体",
					"en_US": "英文",
					"zh_TW": "繁体"
				},
				"receiptName": {
					"zh_CN": "简体",
					"en_US": "英文",
					"zh_TW": "繁体"
				},
				"receiptSpec": {
					"zh_CN": "简体",
					"en_US": "英文",
					"zh_TW": "繁体"
				},
				"receiptWarehouse___code": "test1",
				"recheckReminderLeadTime": 1,
				"rejectRate": 0,
				"remark": {
					"zh_CN": "简体",
					"en_US": "英文",
					"zh_TW": "繁体"
				},
				"requestOrderLimit": 0,
				"requirementTrackingMethod": 0,
				"requireUnit___code": "KGM",
				"reservation": false,
				"resetBackwardDays": 0,
				"resetForwardDays": 0,
				"retailPriceDimension": 1,
				"returnInspection": 0,
				"returnsWarehousingByResult": true,
				"returnWarehouse___code": "test1",
				"reviewCycle": 0,
				"reviewGrossWeight": false,
				"ropStock": 0,
				"safetyStock": 10,
				"saleChannel": "1,2,3",
				"saleChannelOfDistribution": false,
				"saleChannelOfOfflineRetail": false,
				"saleChannelOfOnlineBatch": false,
				"saleChannelOfOnlineRetail": false,
				"salePoints": 0,
				"salesReturnsExemption": false,
				"saleStyle": "1",
				"scanCountUnit": 0,
				"sendInspection": 0,
				"serviceDuration": 0,
				"serviceDurationUnit": 1,
				"shopId___code": "test1",
				"shortName": "物料简称",
				"singleInspection": 0,
				"specialCarTransport": false,
				"specialMaterials": false,
				"stockUnit___code": "KGM",
				"storageLossRate": 1,
				"strategyComparisonRule": 0,
				"supplyDemandPolicy": 0,
				"supplyTimes": 0,
				"supplyType": 0,
				"testRule": 1,
				"titleMemo": {
					"zh_CN": "简体",
					"en_US": "英文",
					"zh_TW": "繁体"
				},
				"uorderDlyFeeRuleId": 2281192894353664,
				"uorderdowncount": 0,
				"uorderupcount": 0,
				"utility": false,
				"validityWarningDays": 0,
				"valueManageType": 0,
				"virtualPart": false,
				"warehouseManager___code": "test1",
				"warehousingByResult": false,
				"wastageRate": 0,
				"weigh": false,
				"weighingMode": 0,
				"workingPlan": false,
				"deliveryMethod": "1,2,3",
				"inspectionControlPoint": 0,
				"productInspection": 0,
				"productInspectionCtrlPoint": 0,
				"outSourceInspection": 0,
				"transferInspection": 0,
				"productFirstInspection": 0,
				"firstInspectionCtrlMethod": 0,
				"turnoverMaterials": 0,
				"amortizationMethod": 0,
				"measurementUnit": 2117922410379345924,
				"measurementUnit___code": "KGM",
				"measurementCount": 2,
				"compensationAmount": 2,
				"moldingTime": 10,
				"moldCavities": 5,
				"costClass___code": "test1",
				"taxClass___code": "1010105000000000000"
			}
		}
	],
	"matchRule": "id"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，成功时为200 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 返回结果 |
| count | number |
| 小数位数:0,最大长度:10 | 否 | 总数 示例：2 |
| successCount | number |
| 小数位数:0,最大长度:10 | 否 | 成功总数 示例：1 |
| failCount | number |
| 小数位数:0,最大长度:10 | 否 | 失败总数 示例：1 |
| messages | object | 是 | 错误数据列表 |
| infos | object | 是 | 返回数据列表 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"count": 2,
		"successCount": 1,
		"failCount": 1,
		"messages": [
			{
				"sourceUnique": "0001511000000000GVEI",
				"message": "错误提示信息"
			}
		],
		"infos": [
			{
				"data": {
					"sourceUnique": "0001511000000000GVEI",
					"targetUnique": "2288730399308775431"
				}
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-03-24

新增

请求参数 (5)

更新

请求参数 (32)

子表增加成本分类编码、税收分类码

2	2025-12-26

新增

请求参数 (16)

更新

请求参数 (16)

3	2025-09-24

更新

请求说明

更新

请求参数 manageClass___code

更新

请求参数 orgId___code

更新

请求参数 detail

删除

请求参数 (4)

4	2025-08-20

新增

请求参数 deliveryMethod

更新

请求参数 width

width字段去掉默认值

5	2025-08-12

新增

请求参数 deliveryMethod

增加商城配送方式字段

6	2025-07-10

更新

请求说明

新增

请求参数 matchRule

更新

请求参数 (87)

新增

返回参数 (10)

更新

返回参数 message

删除

返回参数 jobId


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

