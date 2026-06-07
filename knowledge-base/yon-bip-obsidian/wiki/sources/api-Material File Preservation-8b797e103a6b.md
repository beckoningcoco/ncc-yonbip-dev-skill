---
title: "物料档案保存V1"
apiId: "8b797e103a6b49bea56ff3d5465d60e0"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Material"
domain: "MD"
date: 2026-06-07
tags: [YonBIP, OpenAPI]
source_type: community-api-docs
---

# 物料档案保存V1

>  请求方式	POST | Material (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/digitalModel/product/save
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

只看必填项
名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
企业自建获取token
服务商获取token
Body参数
名称	类型	数组	必填	描述
data	object	否	是	物料
detail	object	否	是	物料详情
orgId	string	否	是	管理组织id
isRegistrationManager	boolean	否	否	注册证管理, true:是、false:否、 示例：true
orgId_Code	string	否	否	管理组织编码
transType_Code	string	否	否	物料类型编码
isAuthorizationManager	boolean	否	否	授权书管理, true:是、false:否、 示例：true
orgId_Name	string	否	否	管理组织名称
sunshinePurchaseNo	string	否	否	阳光采购号
registrationNo	string	否	否	注册证号
productApplyRange_OrgId	string	否	否	使用组织id
productApplyRange_OrgId_Name	string	否	否	使用组织名称
id	string	否	否	物料ID 新增时无需填写，修改时必填 新增时无需填写，修改时必填
pubts	string	否	否	时间戳,格式为yyyy-MM-dd HHmmss
url	string	否	否	物料首图片链接地址
autoGenerateRangeData_	boolean	否	否	true：自动生成组织数据，false：不自动生成组织数据 示例：false
code	string	否	是	物料编码
name	muti_lang	否	是	物料名称,支持多语
modelDescription	muti_lang	否	否	规格说明,支持多语
model	muti_lang	否	否	型号,支持多语
erpCode	string	否	否	外部编码
platformCode	string	否	否	平台编码
manageClass	string	否	是	物料分类id
manageClass_Code	string	否	否	物料分类编码
manageClass_Name	string	否	否	物料分类名称
productClass	string	否	否	商品分类id
productClass_Code	string	否	否	商品分类编码
productClass_Name	string	否	否	商品分类名称
productTemplate	string	否	否	物料模板id
productTemplate_NameTips	string	否	否	物料模板提示
productTemplate_Name	string	否	否	物料模板名称
productLine	string	否	否	产品线id
productLine_Code	string	否	否	产品线编码
productLine_Name	string	否	否	产品线名称
brand	string	否	否	品牌id
brand_RandKeywords	string	否	否	品牌别名
brand_Name	string	否	否	物料品牌名称
placeOfOrigin	string	否	否	产地
manufacturer	string	否	否	生产厂商
platFormStaus	string	否	否	平台处理商家物料状态
cPlatFormRemark	string	否	否	平台处理商家物料备注
description	object	否	否	物料详情描述
realProductAttribute	long	否	是	物料类型，1：实物物料，2：虚拟物料 示例：0
realProductAttributeType	long	否	否	实物物料属性，1：普通物料，2：实体卡券，3：实体储值卡 示例：0
virtualProductAttribute	long	否	否	虚拟物料属性，7：服务，10：折扣，3：卡券，2：礼品卡，1：储值卡，4：其它，9：套餐，11：套件 示例：0
giftCardId	string	否	否	礼品卡id
giftCardId_Name	string	否	否	礼品卡名称
couponId	string	否	否	卡券id
couponType	string	否	否	卡券类型
couponId_Name	string	否	否	卡券名称
unitUseType	long	否	是	设置规则, 1:使用物料模板的计量单位、2:使用物料自己的计量单位、 示例：0
unit	string	否	是	主计量单位id
unit_Code	string	否	否	主计量单位code 示例：0722
unit_Name	string	否	否	主计量单位名称
enableAssistUnit	boolean	否	否	启用辅计量, true:启用、 示例：true
weight	long	否	否	重量 示例：0
weightUnit	string	否	否	重量单位id
weightUnit_Name	string	否	否	重量单位名称
volume	long	否	否	体积 示例：0
volumeUnit	string	否	否	体积单位id
volumeUnit_Name	string	否	否	体积单位名称
taxClass	string	否	否	税收分类码id
taxClass_Code	string	否	否	税收分类码
taxClass_Name	string	否	否	货物和劳务名称
customerServiceDay	long	否	否	售后服务期限 示例：0
dimensionCode	string	否	否	二维码
shareDescription	muti_lang	否	否	分享说明,支持多语
time	object	否	否	物料定金时间关联
keywords	muti_lang	否	否	关键字,支持多语
_status	string	否	是	操作标识, Insert:新增、Update:更新
productSpecFrees	object	是	否	物料规格
defaultSKUOrderProperties	object	是	否	默认SKU物料订单属性
productskus	object	是	否	物料SKU
skuOrderProperties	object	是	否	物料订单属性
productTags	object	是	否	标签[pc.product.ProductTag]
productAssistClasses	object	是	否	物料辅助分类
productspecitems	object	是	否	规格明细
productspecitemalbums	object	是	否	规格相册
productOrgs	object	是	是	物料分配的组织
productCustomers	object	是	否	物料分配的客户
productShops	object	是	否	物料分配的加盟商
productParams	object	是	否	物料参数
productCheckFrees	object	是	否	物料按规格核算
productAssistUnitExchanges	object	是	否	物料辅计量换算对照
productBarCodes	object	是	否	物料多条码

## 3. 请求示例

Url: /yonbip/digitalModel/product/save?access_token=访问令牌
Body: {
	"data": {
		"detail": {
			"exemption": true,
			"warehousingByResult": true,
			"salesReturnsExemption": true,
			"returnsWarehousingByResult": true,
			"periodicalInspection": true,
			"periodicalInspectionCycle": 0,
			"shortName": "",
			"mnemonicCode": "",
			"barCode": "",
			"businessAttribute": "",
			"saleChannel": "",
			"productApplyRangeId": "",
			"id": "",
			"pubts": "",
			"purchaseUnit": "",
			"purchaseUnit_Code": "",
			"purchaseUnit_Name": "",
			"inspectionUnit": 0,
			"inspectionUnit_Code": "",
			"inspectionUnit_Name": "",
			"purchasePriceUnit": 0,
			"purchasePriceUnit_Code": "",
			"purchasePriceUnit_Name": "",
			"stockUnit": "",
			"stockUnit_Code": "",
			"stockUnit_Name": "",
			"produceUnit": "",
			"produceUnit_Code": "",
			"produceUnit_Name": "",
			"batchPriceUnit": "",
			"batchPriceUnit_Code": "",
			"batchPriceUnit_Name": "",
			"batchUnit": "",
			"batchUnit_Code": "",
			"batchUnit_Name": "",
			"onlineUnit": "",
			"onlineUnit_Code": "",
			"onlineUnit_Name": "",
			"offlineUnit": "",
			"offlineUnit_Code": "",
			"offlineUnit_Name": "",
			"requireUnit": "",
			"requireUnit_Code": "",
			"requireUnit_Name": "",
			"batchPrice": 0,
			"fMarkPrice": 0,
			"fLowestMarkPrice": 0,
			"fSalePrice": 0,
			"fMarketPrice": 0,
			"isDisplayPrice": true,
			"priceAreaMessage": "",
			"receiptName": {
				"zh_CN": "中文",
				"en_US": "英文",
				"zh_TW": "繁体"
			},
			"inTaxrate": "",
			"inTaxrate_Code": "",
			"inTaxrate_Name": 0,
			"outTaxrate": "",
			"outTaxrate_Code": "",
			"outTaxrate_Name": 0,
			"preferentialPolicyType": "",
			"preferentialPolicyType_Name": "",
			"iOrder": 0,
			"stopstatus": true,
			"iStatus": true,
			"mallUpTime": "",
			"iUOrderStatus": true,
			"uorderUpTime": "",
			"productVendor": "",
			"productVendor_Name": "",
			"productBuyer": "",
			"productBuyer_Name": "",
			"fPrimeCosts": 0,
			"maxPrimeCosts": 0,
			"requestOrderLimit": 0,
			"canSale": true,
			"iMinOrderQuantity": 0,
			"deliveryDays": 0,
			"uorderDlyFeeRuleId": "",
			"uorderDlyFeeRuleId_Name": "",
			"beUpTime": "",
			"isBatchManage": true,
			"isExpiryDateManage": true,
			"isExpiryDateCalculationMethod": 0,
			"expireDateNo": 0,
			"expireDateUnit": "",
			"daysBeforeValidityReject": 0,
			"validityWarningDays": 0,
			"isSerialNoManage": true,
			"isBarcodeManage": true,
			"safetyStock": 0,
			"highestStock": 0,
			"lowestStock": 0,
			"ropStock": 0,
			"warehouseManager": "",
			"warehouseManager_Name": "",
			"deliveryWarehouse": "",
			"deliveryWarehouse_Name": "",
			"returnWarehouse": "",
			"returnWarehouse_Name": "",
			"inStoreExcessLimit": 0,
			"outStoreExcessLimit": 0,
			"storageLossRate": 0,
			"planDefaultAttribute": "",
			"allowNegativeInventory": true,
			"planMethod": "",
			"planStrategy": "",
			"planStrategy_Name": "",
			"keySubPart": true,
			"bindCarrier": true,
			"purpose": "",
			"utility": true,
			"supplyDemandPolicy": "",
			"fixedLeadTime": 0,
			"batchPolicy": "",
			"supplyType": "",
			"produceDepartment": "",
			"produceDepartment_Name": "",
			"manufacturePlanner": "",
			"manufacturePlanner_Name": "",
			"engineeringDrawingNo": "",
			"supplyTimes": 0,
			"planProduceLimit": 0,
			"weigh": true,
			"valueManageType": "",
			"costValuation": "",
			"checkByCost": true,
			"fNoTaxCostPrice": 0,
			"checkByBatch": true,
			"accountingByItem": true,
			"materialCost": true,
			"isCheckFree": "",
			"saleStyle": "",
			"salePoints": 0,
			"lInventoryCount": 0,
			"iBaseSaleCount": 0,
			"dlyFeeRuleId": "",
			"dlyFeeRuleId_Name": "",
			"metaDescription": {
				"zh_CN": "中文",
				"en_US": "英文",
				"zh_TW": "繁体"
			},
			"enableSubscribe": true,
			"enableDeposit": true,
			"depositDealPayType": "",
			"deposits": 0,
			"depositPercentage": 0,
			"enablemodifyDeposit": "",
			"minimumDeposits": 0,
			"depositPayType": "",
			"serviceDuration": 0,
			"serviceDurationUnit": "",
			"canOrder": true,
			"onlyOrder": true,
			"orderAdvanceTime": "",
			"iEnableCyclePurchase": true,
			"fSettleAccountsRate": 0,
			"isAllArea": true,
			"iEnableEcontract": true,
			"pageTitle": "",
			"isRecommend": true,
			"displayName": {
				"zh_CN": "中文",
				"en_US": "英文",
				"zh_TW": "繁体"
			},
			"titleMemo": {
				"zh_CN": "中文",
				"en_US": "英文",
				"zh_TW": "繁体"
			},
			"allowStorePurchase": true,
			"isSaleInOfflineStore": true,
			"isPriceChangeAllowed": true,
			"isOfflineStoreOrder": true,
			"isOfflineStoreReturn": true,
			"retailPriceDimension": "",
			"deliverQuantityChange": "",
			"isProcess": true,
			"processType": "",
			"isMaterial": true,
			"isWeight": true,
			"inventoryPlanStrategy": "0"
		},
		"orgId": "",
		"isRegistrationManager": true,
		"orgId_Code": "",
		"transType_Code": "",
		"isAuthorizationManager": true,
		"orgId_Name": "",
		"sunshinePurchaseNo": "",
		"registrationNo": "",
		"productApplyRange_OrgId": "",
		"productApplyRange_OrgId_Name": "",
		"id": "",
		"pubts": "",
		"url": "",
		"autoGenerateRangeData_": false,
		"code": "",
		"name": {
			"zh_CN": "中文",
			"en_US": "英文",
			"zh_TW": "繁体"
		},
		"modelDescription": {
			"zh_CN": "中文",
			"en_US": "英文",
			"zh_TW": "繁体"
		},
		"model": {
			"zh_CN": "中文",
			"en_US": "英文",
			"zh_TW": "繁体"
		},
		"erpCode": "",
		"platformCode": "",
		"manageClass": "",
		"manageClass_Code": "",
		"manageClass_Name": "",
		"productClass": "",
		"productClass_Code": "",
		"productClass_Name": "",
		"productTemplate": "",
		"productTemplate_NameTips": "",
		"productTemplate_Name": "",
		"productLine": "",
		"productLine_Code": "",
		"productLine_Name": "",
		"brand": "",
		"brand_RandKeywords": "",
		"brand_Name": "",
		"placeOfOrigin": "",
		"manufacturer": "",
		"platFormStaus": "",
		"cPlatFormRemark": "",
		"description": {
			"description": "",
			"id": "",
			"mobileDescription": ""
		},
		"realProductAttribute": 0,
		"realProductAttributeType": 0,
		"virtualProductAttribute": 0,
		"giftCardId": "",
		"giftCardId_Name": "",
		"couponId": "",
		"couponType": "",
		"couponId_Name": "",
		"unitUseType": 0,
		"unit": "",
		"unit_Code": "0722",
		"unit_Name": "",
		"enableAssistUnit": true,
		"weight": 0,
		"weightUnit": "",
		"weightUnit_Name": "",
		"volume": 0,
		"volumeUnit": "",
		"volumeUnit_Name": "",
		"taxClass": "",
		"taxClass_Code": "",
		"taxClass_Name": "",
		"customerServiceDay": 0,
		"dimensionCode": "",
		"shareDescription": {
			"zh_CN": "中文",
			"en_US": "英文",
			"zh_TW": "繁体"
		},
		"time": {
			"id": "",
			"productId": "",
			"productApplyRangeId": "",
			"iControlTime": true,
			"ControlTimeType": "",
			"dateRange": "",
			"dStartDate": "",
			"dEndDate": "",
			"RelativeDate": 0,
			"durationDate": 0
		},
		"keywords": {
			"zh_CN": "中文",
			"en_US": "英文",
			"zh_TW": "繁体"
		},
		"_status": "",
		"productSpecFrees": [
			{
				"id": "",
				"productId": "",
				"productApplyRangeId": "",
				"freeType": "",
				"checked": true,
				"_status": ""
			}
		],
		"defaultSKUOrderProperties": [
			{
				"id": "",
				"productId": "",
				"skuId": "",
				"productApplyRangeId": "",
				"skuPropertyTypeId": "",
				"skuPropertyTypeId_showItem": "",
				"skuPropertyTypeId_alias": "",
				"skuPropertyTypeId_type": "",
				"skuPropertyTypeId_userdefMode": "",
				"isShow": 0,
				"isRequired": 0,
				"iLimitNum": 0,
				"iOrder": 0,
				"_status": ""
			}
		],
		"productskus": [
			{
				"productId": "",
				"id": "",
				"isSKU": true,
				"specIds": "",
				"specs": "",
				"code": "",
				"name": {
					"zh_CN": "中文",
					"en_US": "英文",
					"zh_TW": "繁体"
				},
				"productSKUDetail": {
					"id": "",
					"pubts": "",
					"productId": "",
					"skuId": "",
					"productApplyRangeId": "",
					"shortName": "",
					"mnemonicCode": "",
					"barCode": "",
					"fNoTaxCostPrice": 0,
					"fPrimeCosts": 0,
					"batchPrice": 0,
					"iMinOrderQuantity": 0,
					"batchDeliveryDays": 0,
					"markPrice": 0,
					"fLowestMarkPrice": 0,
					"salePrice": 0,
					"fMarketPrice": 0,
					"fSettleAccountsRate": 0,
					"salePoints": 0,
					"inventoryCount": 0,
					"iOrder": "",
					"stopstatus": "",
					"ustatus": 0,
					"status": 0,
					"saled": 0
				},
				"modelDescription": {
					"zh_CN": "中文",
					"en_US": "英文",
					"zh_TW": "繁体"
				},
				"model": {
					"zh_CN": "中文",
					"en_US": "英文",
					"zh_TW": "繁体"
				},
				"erpCode": "",
				"batchUnit": "",
				"batchUnit_Name": "",
				"batchRate": 0,
				"weight": 0,
				"volume": 0,
				"_status": ""
			}
		],
		"skuOrderProperties": [
			{
				"id": "",
				"productId": "",
				"skuId": "",
				"productApplyRangeId": "",
				"skuPropertyTypeId": "",
				"skuPropertyTypeId_showItem": "",
				"skuPropertyTypeId_alias": "",
				"skuPropertyTypeId_type": "",
				"skuPropertyTypeId_userdefMode": "",
				"isShow": 0,
				"isRequired": 0,
				"iLimitNum": 0,
				"iOrder": 0,
				"_status": ""
			}
		],
		"productTags": [
			{
				"tagId": "",
				"tagId_name": "",
				"productId": "",
				"id": "",
				"productApplyRangeId": "",
				"_status": ""
			}
		],
		"productAssistClasses": [
			{
				"assClass_Name": "",
				"productClassId": "",
				"productId": "",
				"id": "",
				"_status": ""
			}
		],
		"productspecitems": [
			{
				"haveImg": {},
				"iSpecId_showItem": "",
				"specValue": "",
				"iSpecId": "",
				"lsSpecItems_id": "",
				"iOrder": 0,
				"productId": "",
				"id": "",
				"_status": ""
			}
		],
		"productspecitemalbums": [
			{
				"folder": "",
				"productId": "",
				"productSpecItemId": "",
				"sort": 0,
				"type": "",
				"size": 0,
				"imgName": "",
				"id": "",
				"_status": ""
			}
		],
		"productOrgs": [
			{
				"id": "",
				"pubts": "",
				"productId": "",
				"rangeType": "",
				"orgId_code": "",
				"orgId": "",
				"isCreator": true,
				"isApplied": true,
				"_status": ""
			}
		],
		"productCustomers": [
			{
				"id": "",
				"pubts": "",
				"productId": "",
				"rangeType": "",
				"customerId": "",
				"isCreator": true,
				"isApplied": true,
				"customerCode": "",
				"customerName": "",
				"_status": ""
			}
		],
		"productShops": [
			{
				"id": "",
				"pubts": "",
				"productId": "",
				"rangeType": "",
				"shopId": "",
				"customerId": "",
				"isCreator": true,
				"isApplied": true,
				"shopCode": "",
				"shopName": "",
				"_status": ""
			}
		],
		"productParams": [
			{
				"id": "",
				"productId": "",
				"productApplyRangeId": "",
				"param": "",
				"param_GroupName": "",
				"param_Name": "",
				"paramValue": "",
				"pubts": "",
				"_status": ""
			}
		],
		"productCheckFrees": [
			{
				"id": "",
				"productId": "",
				"productApplyRangeId": "",
				"_status": ""
			}
		],
		"productAssistUnitExchanges": [
			{
				"id": "",
				"productId": "",
				"unitExchangeType": "",
				"assistUnitCount": 0,
				"assistUnit": "",
				"assistUnit_Code": "",
				"assistUnit_Name": "",
				"mainUnitCount": 0,
				"iOrder": 0,
				"_status": ""
			}
		],
		"productBarCodes": [
			{
				"productId": "",
				"id": "",
				"pubts": "",
				"barCode": "",
				"_status": ""
			}
		]
	}
}

## 4. 返回值参数

名称	类型	数组	描述
billtype	string	否	事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、
creator	string	否	创建人
creator	string	否	创建人
displayCode	string	否	异常码
displayCode	string	否	异常码
message	string	否	信息 示例：操作成功
data	string	否	响应信息
salesOrgId	string	否	销售组织id
saleDepartmentId	string	否	销售部门id
transactionTypeId	string	否	交易类型id
settlementOrgId	string	否	开票组织id
bizId	string	否	商家id
createDate	string	否	创建时间
synSourceOrg	string	否	协同来源组织id
ecsuiteuser	string	否	气泡联系人
ecsuiteuser	string	否	气泡联系人
code	string	否	返回码，调用成功时返回200
message	string	否	调用失败时的错误信息
data	object	否	调用成功时的返回数据
detail	object	否	物料详情信息
orgId	string	否	管理组织ID
isRegistrationManager	string	否	注册证管理, true:是、false:否、
orgId_Code	string	否	管理组织编码
isAuthorizationManager	string	否	授权书管理, true:是、false:否、
orgId_Name	string	否	管理组织
sunshinePurchaseNo	string	否	阳光采购号
registrationNo	string	否	注册证号
productApplyRange_OrgId	string	否	使用组织ID
productApplyRange_OrgId_Name	string	否	使用组织
id	string	否	物料ID
pubts	string	否	时间戳,格式为yyyy-MM-dd HHmmss
url	string	否	物料首图片
code	string	否	物料编码
name	muti_lang	否	物料名称,支持多语
modelDescription	muti_lang	否	规格说明,支持多语
model	muti_lang	否	型号,支持多语
erpCode	string	否	外部编码
platformCode	string	否	平台编码
manageClass	string	否	物料分类ID
manageClass_Code	string	否	物料分类编码
manageClass_Name	string	否	物料分类
productClass	string	否	商品分类ID
productClass_Code	string	否	商品分类编码
productClass_Name	string	否	商品分类
productTemplate	string	否	物料模板ID
productTemplate_NameTips	string	否	物料模板提示
productTemplate_Name	string	否	物料模板
productLine	string	否	产品线ID
productLine_Code	string	否	产品线
productLine_Name	string	否	产品线
brand	string	否	品牌ID
brand_RandKeywords	string	否	品牌别名
brand_Name	string	否	物料品牌
placeOfOrigin	string	否	产地
manufacturer	string	否	生产厂商
platFormStaus	string	否	平台处理商家物料状态
cPlatFormRemark	string	否	平台处理商家物料备注
description	object	否	description
realProductAttribute	string	否	物料类型, 1:实物物料、2:虚拟物料、
realProductAttributeType	string	否	实物物料属性, 1:普通物料、2:实体卡券、3:实体储值卡、
virtualProductAttribute	string	否	虚拟物料属性, 7:服务、10:折扣、3:卡券、2:礼品卡、1:储值卡、4:其它、9:套餐、11:套件、
giftCardId	string	否	礼品卡ID
giftCardId_Name	string	否	礼品卡
couponId	string	否	卡券ID
couponType	string	否	卡券类型
couponId_Name	string	否	卡券
unitUseType	string	否	设置规则, 1:使用物料模板的计量单位、2:使用物料自己的计量单位、
unit	string	否	主计量单位ID
unit_Name	string	否	主计量单位
enableAssistUnit	string	否	启用辅计量, true:启用、
weight	int	否	重量
weightUnit	string	否	重量单位ID
weightUnit_Name	string	否	重量单位名称
volume	int	否	体积
volumeUnit	string	否	体积单位ID
volumeUnit_Name	string	否	体积单位名称
taxClass	string	否	税收分类码ID
taxClass_Code	string	否	税收分类码
taxClass_Name	string	否	货物和劳务名称
creator	string	否	创建人
createDate	string	否	创建日期
createTime	string	否	创建时间
modifier	string	否	修改人
modifyTime	string	否	修改时间
modifyDate	string	否	修改日期
customerServiceDay	int	否	售后服务期限
dimensionCode	string	否	二维码
shareDescription	muti_lang	否	分享说明,支持多语
time	object	否	物料定金时间关联
keywords	muti_lang	否	关键字,支持多语
productSpecFrees	object	是	物料规格
defaultSKUOrderProperties	object	是	默认SKU物料订单属性
productskus	object	是	物料SKU[pc.product.ProductSKU]
skuOrderProperties	object	是	物料订单属性
productTags	object	是	标签
productAssistClasses	object	是	物料辅助分类
productspecitems	object	是	规格明细
productspecitemalbums	object	是	规格相册
productOrgs	object	是	物料分配的组织
productCustomers	object	是	物料分配的客户
productShops	object	是	物料分配的加盟商
productParams	object	是	物料参数
productCheckFrees	object	是	物料按规格核算
productAssistUnitExchanges	object	是	物料辅计量换算对照[pc.product.ProductAssistUnitExchange]
productBarCodes	object	是	物料多条码

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"detail": {
			"exemption": "",
			"warehousingByResult": "",
			"salesReturnsExemption": "",
			"returnsWarehousingByResult": "",
			"periodicalInspection": "",
			"periodicalInspectionCycle": 0,
			"shortName": "",
			"mnemonicCode": "",
			"barCode": "",
			"businessAttribute": "",
			"saleChannel": "",
			"productApplyRangeId": "",
			"id": "",
			"pubts": "",
			"purchaseUnit": "",
			"purchaseUnit_Name": "",
			"purchasePriceUnit": "",
			"purchasePriceUnit_Name": "",
			"stockUnit": "",
			"stockUnit_Name": "",
			"produceUnit": "",
			"produceUnit_Name": "",
			"batchPriceUnit": "",
			"batchPriceUnit_Name": "",
			"batchUnit": "",
			"batchUnit_Name": "",
			"onlineUnit": "",
			"onlineUnit_Name": "",
			"offlineUnit": "",
			"offlineUnit_Name": "",
			"requireUnit": "",
			"requireUnit_Name": "",
			"batchPrice": 0,
			"fMarkPrice": 0,
			"fLowestMarkPrice": 0,
			"fSalePrice": 0,
			"fMarketPrice": 0,
			"isDisplayPrice": "",
			"priceAreaMessage": "",
			"receiptName": {
				"zh_CN": "中文",
				"en_US": "英文",
				"zh_TW": "繁体"
			},
			"inTaxrate": "",
			"inTaxrate_Name": "",
			"outTaxrate": "",
			"outTaxrate_Name": "",
			"preferentialPolicyType": "",
			"preferentialPolicyType_Name": "",
			"iOrder": 0,
			"stopstatus": "",
			"iStatus": "",
			"mallUpTime": "",
			"iUOrderStatus": "",
			"uorderUpTime": "",
			"productVendor": "",
			"productVendor_Name": "",
			"productBuyer": "",
			"productBuyer_Name": "",
			"fPrimeCosts": 0,
			"maxPrimeCosts": 0,
			"requestOrderLimit": 0,
			"canSale": "",
			"iMinOrderQuantity": 0,
			"deliveryDays": 0,
			"uorderDlyFeeRuleId": "",
			"uorderDlyFeeRuleId_Name": "",
			"beUpTime": "",
			"isBatchManage": "",
			"isExpiryDateManage": "",
			"expireDateNo": 0,
			"expireDateUnit": "",
			"daysBeforeValidityReject": 0,
			"validityWarningDays": 0,
			"isSerialNoManage": "",
			"isBarcodeManage": "",
			"safetyStock": 0,
			"highestStock": 0,
			"lowestStock": 0,
			"ropStock": 0,
			"warehouseManager": "",
			"warehouseManager_Name": "",
			"deliveryWarehouse": "",
			"deliveryWarehouse_Name": "",
			"returnWarehouse": "",
			"returnWarehouse_Name": "",
			"inStoreExcessLimit": 0,
			"outStoreExcessLimit": 0,
			"storageLossRate": 0,
			"planDefaultAttribute": "",
			"allowNegativeInventory": "",
			"planMethod": "",
			"planStrategy": "",
			"planStrategy_Name": "",
			"keySubPart": "",
			"bindCarrier": "",
			"purpose": "",
			"utility": "",
			"supplyDemandPolicy": "",
			"fixedLeadTime": 0,
			"batchPolicy": "",
			"supplyType": "",
			"produceDepartment": "",
			"produceDepartment_Name": "",
			"manufacturePlanner": "",
			"manufacturePlanner_Name": "",
			"engineeringDrawingNo": "",
			"supplyTimes": 0,
			"planProduceLimit": 0,
			"weigh": "",
			"valueManageType": "",
			"costValuation": "",
			"checkByCost": "",
			"fNoTaxCostPrice": 0,
			"checkByBatch": "",
			"accountingByItem": "",
			"materialCost": "",
			"isCheckFree": "",
			"saleStyle": "",
			"salePoints": 0,
			"lInventoryCount": 0,
			"iBaseSaleCount": 0,
			"dlyFeeRuleId": "",
			"dlyFeeRuleId_Name": "",
			"metaDescription": {
				"zh_CN": "中文",
				"en_US": "英文",
				"zh_TW": "繁体"
			},
			"enableSubscribe": "",
			"enableDeposit": "",
			"depositDealPayType": "",
			"deposits": 0,
			"depositPercentage": 0,
			"enablemodifyDeposit": "",
			"minimumDeposits": 0,
			"depositPayType": "",
			"serviceDuration": 0,
			"serviceDurationUnit": "",
			"canOrder": "",
			"onlyOrder": "",
			"orderAdvanceTime": "",
			"iEnableCyclePurchase": "",
			"fSettleAccountsRate": 0,
			"isAllArea": "",
			"iEnableEcontract": "",
			"pageTitle": "",
			"isRecommend": "",
			"displayName": {
				"zh_CN": "中文",
				"en_US": "英文",
				"zh_TW": "繁体"
			},
			"titleMemo": {
				"zh_CN": "中文",
				"en_US": "英文",
				"zh_TW": "繁体"
			},
			"allowStorePurchase": "",
			"isSaleInOfflineStore": "",
			"isPriceChangeAllowed": "",
			"isOfflineStoreOrder": "",
			"isOfflineStoreReturn": "",
			"retailPriceDimension": "",
			"deliverQuantityChange": "",
			"isProcess": "",
			"processType": "",
			"isMaterial": "",
			"isWeight": ""
		},
		"orgId": "",
		"isRegistrationManager": "",
		"orgId_Code": "",
		"isAuthorizationManager": "",
		"orgId_Name": "",
		"sunshinePurchaseNo": "",
		"registrationNo": "",
		"productApplyRange_OrgId": "",
		"productApplyRange_OrgId_Name": "",
		"id": "",
		"pubts": "",
		"url": "",
		"code": "",
		"name": {
			"zh_CN": "中文",
			"en_US": "英文",
			"zh_TW": "繁体"
		},
		"modelDescription": {
			"zh_CN": "中文",
			"en_US": "英文",
			"zh_TW": "繁体"
		},
		"model": {
			"zh_CN": "中文",
			"en_US": "英文",
			"zh_TW": "繁体"
		},
		"erpCode": "",
		"platformCode": "",
		"manageClass": "",
		"manageClass_Code": "",
		"manageClass_Name": "",
		"productClass": "",
		"productClass_Code": "",
		"productClass_Name": "",
		"productTemplate": "",
		"productTemplate_NameTips": "",
		"productTemplate_Name": "",
		"productLine": "",
		"productLine_Code": "",
		"productLine_Name": "",
		"brand": "",
		"brand_RandKeywords": "",
		"brand_Name": "",
		"placeOfOrigin": "",
		"manufacturer": "",
		"platFormStaus": "",
		"cPlatFormRemark": "",
		"description": {
			"id": "",
			"description": "",
			"mobileDescription": ""
		},
		"realProductAttribute": "",
		"realProductAttributeType": "",
		"virtualProductAttribute": "",
		"giftCardId": "",
		"giftCardId_Name": "",
		"couponId": "",
		"couponType": "",
		"couponId_Name": "",
		"unitUseType": "",
		"unit": "",
		"unit_Name": "",
		"enableAssistUnit": "",
		"weight": 0,
		"weightUnit": "",
		"weightUnit_Name": "",
		"volume": 0,
		"volumeUnit": "",
		"volumeUnit_Name": "",
		"taxClass": "",
		"taxClass_Code": "",
		"taxClass_Name": "",
		"creator": "",
		"createDate": "",
		"createTime": "",
		"modifier": "",
		"modifyTime": "",
		"modifyDate": "",
		"customerServiceDay": 0,
		"dimensionCode": "",
		"shareDescription": {
			"zh_CN": "中文",
			"en_US": "英文",
			"zh_TW": "繁体"
		},
		"time": {
			"id": "",
			"productId": "",
			"productApplyRangeId": "",
			"iControlTime": "",
			"ControlTimeType": "",
			"dateRange": "",
			"dStartDate": "",
			"dEndDate": "",
			"RelativeDate": 0,
			"durationDate": 0
		},
		"keywords": {
			"zh_CN": "中文",
			"en_US": "英文",
			"zh_TW": "繁体"
		},
		"productSpecFrees": [
			{
				"id": "",
				"productId": "",
				"productApplyRangeId": "",
				"freeType": "",
				"checked": true
			}
		],
		"defaultSKUOrderProperties": [
			{
				"id": "",
				"productId": "",
				"skuId": "",
				"productApplyRangeId": "",
				"skuPropertyTypeId": "",
				"skuPropertyTypeId_showItem": "",
				"skuPropertyTypeId_alias": "",
				"skuPropertyTypeId_type": "",
				"skuPropertyTypeId_userdefMode": "",
				"isShow": 0,
				"isRequired": 0,
				"iLimitNum": 0,
				"iOrder": 0
			}
		],
		"productskus": [
			{
				"productId": "",
				"id": "",
				"isSKU": "",
				"specIds": "",
				"specs": "",
				"code": "",
				"name": {
					"zh_CN": "中文",
					"en_US": "英文",
					"zh_TW": "繁体"
				},
				"productSKUDetail": {
					"id": "",
					"pubts": "",
					"productId": "",
					"skuId": "",
					"productApplyRangeId": "",
					"shortName": "",
					"mnemonicCode": "",
					"barCode": "",
					"fNoTaxCostPrice": 0,
					"fPrimeCosts": 0,
					"batchPrice": 0,
					"iMinOrderQuantity": 0,
					"batchDeliveryDays": 0,
					"markPrice": 0,
					"fLowestMarkPrice": 0,
					"salePrice": 0,
					"fMarketPrice": 0,
					"fSettleAccountsRate": 0,
					"salePoints": 0,
					"inventoryCount": 0,
					"iOrder": "",
					"stopstatus": true,
					"ustatus": 0,
					"status": 0,
					"saled": 0
				},
				"modelDescription": {
					"zh_CN": "中文",
					"en_US": "英文",
					"zh_TW": "繁体"
				},
				"model": {
					"zh_CN": "中文",
					"en_US": "英文",
					"zh_TW": "繁体"
				},
				"erpCode": "",
				"batchUnit": "",
				"batchUnit_Name": "",
				"batchRate": 0,
				"weight": 0,
				"volume": 0
			}
		],
		"skuOrderProperties": [
			{
				"id": "",
				"productId": "",
				"skuId": "",
				"productApplyRangeId": "",
				"skuPropertyTypeId": "",
				"skuPropertyTypeId_showItem": "",
				"skuPropertyTypeId_alias": "",
				"skuPropertyTypeId_type": "",
				"skuPropertyTypeId_userdefMode": "",
				"isShow": 0,
				"isRequired": 0,
				"iLimitNum": 0,
				"iOrder": 0
			}
		],
		"productTags": [
			{
				"tagId": "",
				"tagId_name": "",
				"productId": "",
				"id": "",
				"productApplyRangeId": ""
			}
		],
		"productAssistClasses": [
			{
				"assClass_Name": "",
				"productClassId": "",
				"productId": "",
				"id": ""
			}
		],
		"productspecitems": [
			{
				"haveImg": true,
				"iSpecId_showItem": "",
				"specValue": "",
				"iSpecId": "",
				"lsSpecItems_id": "",
				"iOrder": 0,
				"productId": "",
				"id": ""
			}
		],
		"productspecitemalbums": [
			{
				"folder": "",
				"productId": "",
				"productSpecItemId": "",
				"sort": 0,
				"type": "",
				"size": "",
				"imgName": "",
				"id": ""
			}
		],
		"productOrgs": [
			{
				"id": "",
				"pubts": "",
				"productId": "",
				"rangeType": "",
				"orgId": "",
				"isCreator": "",
				"isApplied": "",
				"orgCode": "",
				"orgName": ""
			}
		],
		"productCustomers": [
			{
				"id": "",
				"pubts": "",
				"productId": "",
				"rangeType": "",
				"customerId": "",
				"isCreator": "",
				"isApplied": "",
				"customerCode": "",
				"customerName": ""
			}
		],
		"productShops": [
			{
				"id": "",
				"pubts": "",
				"productId": "",
				"rangeType": "",
				"shopId": "",
				"customerId": "",
				"isCreator": "",
				"isApplied": "",
				"shopCode": "",
				"shopName": ""
			}
		],
		"productParams": [
			{
				"id": "",
				"productId": "",
				"productApplyRangeId": "",
				"param": "",
				"param_GroupName": "",
				"param_Name": "",
				"paramValue": "",
				"pubts": ""
			}
		],
		"productCheckFrees": [
			{
				"id": "",
				"productId": "",
				"productApplyRangeId": ""
			}
		],
		"productAssistUnitExchanges": [
			{
				"id": "",
				"productId": "",
				"unitExchangeType": "",
				"assistUnitCount": 0,
				"assistUnit": "",
				"assistUnit_Name": "",
				"mainUnitCount": 0,
				"iOrder": 0
			}
		],
		"productBarCodes": [
			{
				"productId": "",
				"id": "",
				"pubts": "",
				"barCode": ""
			}
		]
	}
}

## 6. 业务异常码

查看业务异常码
异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
999	服务端逻辑异常	检查入参是否填写正确，参数值是否真实存在，仍提示该信息请联系开发人员。

## 9. 接口变更日志

	序号	修改时间	变更内容概要
暂时没有数据哦~

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

