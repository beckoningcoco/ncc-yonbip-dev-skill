---
title: "物料档案自定义保存V1"
apiId: "6f592f4cd5ae45f5b7880ae111d2c47d"
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

# 物料档案自定义保存V1

> `ContentType	application/json` 请求方式	POST | 分类: Material (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/product/universalSave

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
| data | object | 否 | 是 | 物料档案 |
| realProductAttribute | string | 否 | 是 | 物料类型，1：实物物料，2：虚拟物料 示例：1 |
| realProductAttributeType | string | 否 | 否 | 实物物料属性, 1:普通物料、2:实体卡券、3:实体储值卡、4：设备，20：描述性物料 示例：1 |
| virtualProductAttribute | string | 否 | 否 | 虚拟物料属性, 7:服务、10:折扣、3:卡券、2:礼品卡、1:储值卡、4:其它、9:套餐、11:套件、 |
| detail!businessAttribute | string | 否 | 否 | 业务属性, 1:采购、7:销售、3:自制、2:委外,可多选，逗号分隔 示例：1,7 |
| autoGenerateRangeData_ | boolean | 否 | 是 | 是否自动共享组织级数据 示例：false |
| orgId | string | 否 | 否 | 创建组织id，单组织可以不传，多组织需要传参 示例：2233535513022720 |
| unitUseType | string | 否 | 是 | 计量单位设置规则，1： 使用物料模板的计量单位，2： 使用物料自己的计量单位 示例：1 |
| saleStyle | string | 否 | 否 | 销售方式, 1:现金购买、2:积分兑换、 示例：1 |
| code | string | 否 | 是 | 物料编码 示例：testapi001 |
| name | string | 否 | 是 | 物料名称 示例：API测试001 |
| detail!shortName | string | 否 | 否 | 物料简称 示例：API测试001 |
| platformCode | string | 否 | 否 | 平台编码 示例：upcdevtest0000005 |
| productClass_Code | string | 否 | 否 | 商品分类编码 示例：SGSC |
| manageClass_Code | string | 否 | 是 | 物料分类编码 示例：shengxian |
| productTemplate | string | 否 | 否 | 物料模板id 示例：123456789 |
| productTemplate_name | string | 否 | 否 | 物料模板名称 示例：fzcp |
| unit | string | 否 | 否 | 主计量单位id，（主计量单位code和id必须任选其一，不可以都为空） 示例：2261943102066944 |
| unit_Code | string | 否 | 否 | 主计量单位code，（主计量单位id和code必须任选其一，不可以都为空） 示例：0722 |
| taxClass | string | 否 | 否 | 税收分类id 示例：1010101000000000000 |
| taxClass_Code | string | 否 | 否 | 税收分类码 示例：1010112000000000000 |
| modelDescription | muti_lang | 否 | 否 | 规格说明,支持多语 |
| model | muti_lang | 否 | 否 | 型号,支持多语 |
| detail!mnemonicCode | string | 否 | 否 | 物料助记码 示例：APICS001 |
| detail!saleChannel | string | 否 | 否 | 销售渠道, 1:销售批发、2:线上零售、3:线下零售、4:微分销，可多选，逗号分隔 示例：1,2,3,4 |
| detail!isRecommend | string | 否 | 是 | 推荐物料, true:是、false:否、 示例：false |
| detail!purchasePriceUnit_Code | string | 否 | 是 | 采购计价单位code 示例：BOX |
| detail!produceUnit_Code | string | 否 | 是 | 生产单位code 示例：BOX |
| detail!purchaseUnit_Code | string | 否 | 是 | 采购单位code 示例：BOX |
| detail!stockUnit_Code | string | 否 | 是 | 库存单位code 示例：BOX |
| detail!inspectionUnit_Code | string | 否 | 是 | 检验单位code |
| detail!batchPriceUnit_Code | string | 否 | 是 | 批发计价单位code 示例：BOX |
| detail!batchUnit_Code | string | 否 | 是 | 批发销售单位code 示例：BOX |
| detail!onlineUnit_Code | string | 否 | 是 | 线上零售单位Code 示例：BOX |
| detail!offlineUnit_Code | string | 否 | 是 | 线下零售单位Code 示例：BOX |
| detail!requireUnit_Code | string | 否 | 是 | 要货单位Code 示例：BOX |
| detail!batchPrice | Decimal | 否 | 否 | 批发价 示例：100 |
| detail!fMarkPrice | Decimal | 否 | 否 | 建议零售价 示例：12 |
| detail!fSalePrice | Decimal | 否 | 否 | 线上零售价 示例：11.9 |
| detail!fMarketPrice | Decimal | 否 | 否 | 市场价 示例：12 |
| detail!fPrimeCosts | long | 否 | 否 | 采购参考价 示例：10 |
| detail!fSettleAccountsRate | string | 否 | 否 | 结算费率 |
| detail!isDisplayPrice | string | 否 | 否 | 线上显示价格, true:是、false:否、 示例：true |
| detail!inTaxrate | long | 否 | 否 | 进项税率id 示例：13 |
| detail!inTaxrate_Code | string | 否 | 否 | 进项税率编码 示例：123 |
| detail!outTaxrate | string | 否 | 否 | 销项税率id 示例：4 |
| detail!outTaxrate_Code | string | 否 | 否 | 销项税率编码 示例：456 |
| detail!isBatchManage | string | 否 | 否 | 批次管理, true:是、false:否、 示例：false |
| detail!isExpiryDateManage | boolean | 否 | 否 | 有效期管理, true:是、false:否、 示例：false |
| detail!isExpiryDateCalculationMethod | short | 否 | 否 | 有效期推算方式，0按日，1按月，2不推算，当批次管理为是，有效期管理为是时，如果有效期推算方式未传值，默认为0 示例：0 |
| detail!isSerialNoManage | string | 否 | 否 | 序列号管理, true:是、false:否、 示例：false |
| detail!canSale | string | 否 | 否 | 是否可售, true:是、false:否、 示例：true |
| detail!uorderDlyFeeRuleId | string | 否 | 否 | 订货运费模板id |
| detail!uorderDlyFeeRuleId_Name | string | 否 | 否 | 订货运费模板名称 |
| detail!iEnableCyclePurchase | boolean | 否 | 否 | 启用周期购, true:是、false:否、 示例：false |
| detail!enableSubscribe | string | 否 | 否 | 启用预订业务, true:是、false:否、 示例：false |
| detail!enableDeposit | string | 否 | 否 | 启用定金业务, true:是、false:否、 示例：false |
| detail!depositDealPayType | string | 否 | 否 | 定金设置方式, 0:固定金额、1:成交金额百分比、 示例：0 |
| detail!enablemodifyDeposit | string | 否 | 否 | 订单改价时可修改定金, true:是、false:否、 示例：false |
| detail!depositPayType | string | 否 | 否 | 支付尾款方式, 0:线上支付尾款、1:线下支付尾款、 示例：0 |
| detail!lInventoryCount | string | 否 | 否 | 线上库存量 |
| detail!dlyFeeRuleId | string | 否 | 否 | 商城运费模板id |
| detail!dlyFeeRuleId_Name | string | 否 | 否 | 商城运费模板名称 |
| detail!valueManageType | int | 否 | 否 | 价值管理模式：0：存货核算；1：固定资产； 99:费用 示例：0 |
| detail!isAllArea | string | 否 | 否 | 适用所有区域, true:是、false:否、 示例：false |
| detail!iEnableEcontract | string | 否 | 否 | 启用合同管理, true:是、false:否、 示例：false |
| detail!serviceDurationUnit | string | 否 | 否 | 商城-服务时长单位，1:分钟、2:小时 示例：1 |
| detail!canOrder | boolean | 否 | 否 | 可预约, true:是、false:否、 示例：false |
| detail!onlyOrder | boolean | 否 | 否 | 仅预约, true:是、false:否、 示例：false |
| detail!orderAdvanceTime | long | 否 | 否 | 预约提前期, 0:无、1:一天、2:两天、3:三天、4:一周、5:两周、6:一月、 示例：0 |
| detail!allowStorePurchase | string | 否 | 否 | 允许门店自采, true:是、false:否、 示例：true |
| detail!isPriceChangeAllowed | string | 否 | 否 | 允许开单改价, true:是、false:否、 示例：false |
| detail!isSaleInOfflineStore | string | 否 | 否 | 允许门店销售, true:是、false:否、 示例：true |
| detail!isOfflineStoreOrder | string | 否 | 否 | 允许门店要货, true:是、false:否、 示例：true |
| detail!isOfflineStoreReturn | string | 否 | 否 | 允许门店退货, true:是、false:否、 示例：true |
| detail!isWeight | boolean | 否 | 否 | 是否称重, true:是、false:否、 示例：false |
| detail!isProcess | string | 否 | 否 | 加工, true:是、false:否、 示例：false |
| detail!processType | string | 否 | 否 | 加工方式, 0:预制、1:现制、2:订制、 示例：0 |
| detail!isMaterial | string | 否 | 否 | 零售-材料, true:是、false:否、 示例：false |
| detail!retailPriceDimension | string | 否 | 否 | 零售价取价维度, 1:物料、2:物料SKU、 示例：1 |
| detail!deliverQuantityChange | string | 否 | 否 | 交货数量改变时, 1:单价不变重算金额、2:金额不变重算单价、 示例：1 |
| detail!checkByBatch | boolean | 否 | 否 | 按批次核算, true:是、false:否、 示例：false |
| detail!isCheckFree | string | 否 | 否 | 按规格核算, 0:不按规格核算、1:指定规格核算、2:按SKU核算、 示例：0 |
| detail!iStatus | string | 否 | 否 | 商城上架, true:是、false:否、 示例：false |
| detail!iUOrderStatus | string | 否 | 否 | 订货上架, true:是、false:否、 示例：false |
| productOrgs | object | 是 | 是 | 物料分配的组织 |
| _status | string | 否 | 否 | 操作标识, Insert:新增、Update:更新 示例：Insert |
| source | long | 否 | 否 | 来源，0：UI界面录入，1：Excel导入，2：批量导入，3：商城升级，4：零售升级，5：订货升级，6：U8API导入，7：NCAPI导入，8：其他，9：渠道云，10：NCCAPI导入，11：U8C，12：社会化初始化，13：社会化下发 示例：11 |

## 3. 请求示例

Url: /yonbip/digitalModel/product/universalSave?access_token=访问令牌
Body: {
	"data": {
		"realProductAttribute": "1",
		"realProductAttributeType": "1",
		"virtualProductAttribute": "",
		"detail!businessAttribute": "1,7",
		"autoGenerateRangeData_": false,
		"orgId": "2233535513022720",
		"unitUseType": "1",
		"saleStyle": "1",
		"code": "testapi001",
		"name": "API测试001",
		"detail!shortName": "API测试001",
		"platformCode": "upcdevtest0000005",
		"productClass_Code": "SGSC",
		"manageClass_Code": "shengxian",
		"productTemplate": "123456789",
		"productTemplate_name": "fzcp",
		"unit": "2261943102066944",
		"unit_Code": "0722",
		"taxClass": "1010101000000000000",
		"taxClass_Code": "1010112000000000000",
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
		"detail!mnemonicCode": "APICS001",
		"detail!saleChannel": "1,2,3,4",
		"detail!isRecommend": "false",
		"detail!purchasePriceUnit_Code": "BOX",
		"detail!produceUnit_Code": "BOX",
		"detail!purchaseUnit_Code": "BOX",
		"detail!stockUnit_Code": "BOX",
		"detail!inspectionUnit_Code": "",
		"detail!batchPriceUnit_Code": "BOX",
		"detail!batchUnit_Code": "BOX",
		"detail!onlineUnit_Code": "BOX",
		"detail!offlineUnit_Code": "BOX",
		"detail!requireUnit_Code": "BOX",
		"detail!batchPrice": 100,
		"detail!fMarkPrice": 12,
		"detail!fSalePrice": 11.9,
		"detail!fMarketPrice": 12,
		"detail!fPrimeCosts": 10,
		"detail!fSettleAccountsRate": "",
		"detail!isDisplayPrice": "true",
		"detail!inTaxrate": 13,
		"detail!inTaxrate_Code": "123",
		"detail!outTaxrate": "4",
		"detail!outTaxrate_Code": "456",
		"detail!isBatchManage": "false",
		"detail!isExpiryDateManage": false,
		"detail!isExpiryDateCalculationMethod": 0,
		"detail!isSerialNoManage": "false",
		"detail!canSale": "true",
		"detail!uorderDlyFeeRuleId": "",
		"detail!uorderDlyFeeRuleId_Name": "",
		"detail!iEnableCyclePurchase": false,
		"detail!enableSubscribe": "false",
		"detail!enableDeposit": "false",
		"detail!depositDealPayType": "0",
		"detail!enablemodifyDeposit": "false",
		"detail!depositPayType": "0",
		"detail!lInventoryCount": "",
		"detail!dlyFeeRuleId": "",
		"detail!dlyFeeRuleId_Name": "",
		"detail!valueManageType": 0,
		"detail!isAllArea": "false",
		"detail!iEnableEcontract": "false",
		"detail!serviceDurationUnit": "1",
		"detail!canOrder": false,
		"detail!onlyOrder": false,
		"detail!orderAdvanceTime": 0,
		"detail!allowStorePurchase": "true",
		"detail!isPriceChangeAllowed": "false",
		"detail!isSaleInOfflineStore": "true",
		"detail!isOfflineStoreOrder": "true",
		"detail!isOfflineStoreReturn": "true",
		"detail!isWeight": false,
		"detail!isProcess": "false",
		"detail!processType": "0",
		"detail!isMaterial": "false",
		"detail!retailPriceDimension": "1",
		"detail!deliverQuantityChange": "1",
		"detail!checkByBatch": false,
		"detail!isCheckFree": "0",
		"detail!iStatus": "false",
		"detail!iUOrderStatus": "false",
		"productOrgs": [
			{
				"rangeType": 1,
				"orgId": "2233535513022720",
				"org_code": "upcdevtest",
				"isCreator": true,
				"_status": "Insert"
			}
		],
		"_status": "Insert",
		"source": 11
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 请求结果状态码 示例：200 |
| message | string | 否 | 请求结果信息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| successCountAI | int | 否 | 成功数量初始值 示例：0 |
| failCountAI | int | 否 | 失败数量初始值 示例：0 |
| count | int | 否 | 返回值数量 示例：1 |
| sucessCount | int | 否 | 成功数量 示例：1 |
| failCount | int | 否 | 失败数量 示例：0 |
| messages | string | 是 | 失败原因列表 |
| infos | object | 是 | 成功数据列表 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"successCountAI": 0,
		"failCountAI": 0,
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			""
		],
		"infos": [
			{
				"modifierId": 2155538209116416,
				"productSpecFrees": [
					""
				],
				"productApplyRange": [
					{
						"productId": 2287297693880576,
						"rangeType": 1,
						"isApplied": true,
						"id": 2287297699254528,
						"isCreator": true,
						"orgId": "2163951720681984",
						"tenant": 2155538208313600
					}
				],
				"model": {
					"zh_CN": "中文",
					"en_US": "英文",
					"zh_TW": "繁体"
				},
				"id": 2287297693880576,
				"isCreator": true,
				"tenant": 2155538208313600,
				"productClass": 2282757129965824,
				"hasSpecs": false,
				"realProductAttribute": 1,
				"taxClass_Code": "1090500000000000000",
				"modelDescription": {
					"zh_CN": "中文",
					"en_US": "英文",
					"zh_TW": "繁体"
				},
				"isEnabled": true,
				"platformCode": "22",
				"orgId": "2163951720681984",
				"taxClass": "1090500000000000000",
				"productClass_Code": "00001",
				"namemultiLangText": {
					"textMap": {
						"zh_CN": "刘05"
					}
				},
				"modifier": "YonSuite默认用户",
				"source": 1,
				"modifyTime": "2021-06-04 19:32:33",
				"modifyDate": "2021-06-04 19:32:33",
				"unitUseType": 1,
				"unit": 2263072642208000,
				"name": {
					"zh_CN": "刘05"
				},
				"code": "liu05",
				"specItems_": [
					""
				],
				"realProductAttributeType": 1,
				"productApplyRangeId": 2287297699254528,
				"defaultSKUId": 2287297709445376,
				"manageClass": 2263035643990272,
				"autoGenerateRangeData_": "false",
				"manageClass_Code": "00001",
				"saleStyle": "1",
				"eventNotify_status": "Update",
				"pubts": "2021-06-04 19:32:33",
				"detail": {
					"valueManageType": 0,
					"inTaxrate": "2155547427149056",
					"isBatchManage": true,
					"canSale": true,
					"uorderUpTime": "2021-06-04 19:32:33",
					"onlyOrder": true,
					"dlyFeeRuleId": 2,
					"isProcess": true,
					"offlineUnit_Code": "00004",
					"fSalePrice": 23,
					"serviceDurationUnit": 1,
					"stockUnit_Code": "00004",
					"fPrimeCosts": 23,
					"mallUpTime": "2021-06-04 19:32:33",
					"businessAttribute": "1",
					"deliverQuantityChange": 1,
					"iEnableCyclePurchase": true,
					"mnemonicCode": "ZJM",
					"produceUnit_Code": "00004",
					"orderAdvanceTime": 2,
					"saleChannelOfDistribution": false,
					"isExpiryDateManage": true,
					"batchUnit_Code": "00004",
					"isOfflineStoreReturn": true,
					"saleChannel": "1",
					"batchPrice": 123,
					"purchasePriceUnit_Code": "00004",
					"processType": 0,
					"dlyFeeRuleId_Name": "2",
					"onlineUnit_Code": "00004",
					"shortName": "JC",
					"saleChannelOfOfflineRetail": false,
					"produceUnit": 2263072642208000,
					"uorderDlyFeeRuleId": 123,
					"depositDealPayType": 0,
					"tenant": 2155538208313600,
					"lInventoryCount": 1,
					"fMarketPrice": 23,
					"requireUnit_Code": "00004",
					"isCheckFree": 0,
					"purchaseUnit_Code": "00004",
					"allowStorePurchase": true,
					"purchasePriceUnit": 2263072642208000,
					"isSerialNoManage": false,
					"enablemodifyDeposit": true,
					"isDisplayPrice": false,
					"onlineUnit": 2263072642208000,
					"batchUnit": 2263072642208000,
					"saleChannelOfOnlineRetail": false,
					"saleChannelOfOnlineBatch": true,
					"isWeight": true,
					"fMarkPrice": 23,
					"retailPriceDimension": 1,
					"batchPriceUnit_Code": "00004",
					"productApplyRangeId": 2287297699254528,
					"isRecommend": false,
					"canOrder": true,
					"stockUnit": 2263072642208000,
					"outTaxrate": "2155547427149056",
					"depositPayType": 0,
					"isAllArea": true,
					"batchPriceUnit": 2263072642208000,
					"isOfflineStoreOrder": true,
					"iEnableEcontract": true,
					"requireUnit": 2263072642208000,
					"outTaxrate_Code": "VAT13",
					"fSettleAccountsRate": 45,
					"isPriceChangeAllowed": true,
					"iStatus": true,
					"enableDeposit": true,
					"id": 2287297693880576,
					"isSaleInOfflineStore": true,
					"isMaterial": true,
					"uorderDlyFeeRuleId_Name": "123",
					"virtualProductAttribute": 0,
					"iUOrderStatus": true,
					"enableSubscribe": true,
					"checkByBatch": true,
					"purchaseUnit": 2263072642208000,
					"offlineUnit": 2263072642208000,
					"inTaxrate_Code": "VAT13"
				}
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	检查入参是否填写正确，参数值是否真实存在，仍提示该信息请联系开发人员	操作失败


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

