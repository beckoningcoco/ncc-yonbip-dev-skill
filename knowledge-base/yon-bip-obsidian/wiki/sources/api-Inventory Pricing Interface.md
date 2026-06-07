---
title: "存货取价接口"
apiId: "2179555955573784579"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Inventory Accounting"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Inventory Accounting]
platform_version: "BIP"
source_type: community-api-docs
---

# 存货取价接口

> `ContentType	application/json` 请求方式	POST | 分类: Inventory Accounting (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/EFI/fieia/costQuery

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| accentity | string | 否 | 是 | 会计主体：必填项，会计主体不可为空 示例：2110503739147157514 |
| accbook | string | 否 | 否 | 账簿：非必填项，为空默认取会计主体下主账簿 示例：2110508446426595337 |
| busiDate | string | 否 | 否 | 业务日期：非必填项，会计期间和业务日期不可同时为空 示例：2024-01-05 |
| periodCode | string | 否 | 否 | 会计期间：非必填项，会计期间和业务日期不可同时为空 示例：2024-01 |
| costDomainId | string | 否 | 否 | 成本域：非必填项，为空时根据会计主体+账簿下的存货参数中的成本域创建方式决定，根据创建方式，结合库存组织、仓库信息匹配符合的成本域；①创建方式=会计主体，根据会计主体匹配成本域；②创建方式=库存组织，根据会计主体+账簿+库存组织匹配；③创建方式=库存组织+仓库，根据会计主体+账簿+库存组织+仓库匹配；④创建方式=仓库，根据会计主体+账簿+仓库匹配； 示例：2110530771657687044 |
| inventoryOrg | string | 否 | 否 | 库存组织：非必填项，取决于成本域创建方式：①创建方式为库存组织或库存组织+仓库时，用于匹配成本域；②成本域和库存组织不可同时为空；③同时有值时需要校验成本域一致性； 示例：2110503739147157514 |
| warehouse | number |
| 小数位数:0,最大长度:20 | 否 | 否 | 仓库：非必填项，取决于成本域创建方式：①创建方式为仓库或库存组织+仓库时，用于匹配成本域；②成本域和仓库不可同时为空；③同时有值时需要校验成本域一致性； 示例：1976183842479276032 |
| currencyIds | string | 是 | 否 | 币种：非必填项，不传值默认去账簿本币 示例：["1940574191319777332"] 最大请求量：4 |
| referencePriceStrategy | string | 否 | 否 | 价格库参考成本匹配模式：非必填项，默认为0（0：模糊匹配；1：精准匹配） 示例：0 |
| blnIncludeZeroCost | boolean | 否 | 否 | 是否包含0成本：非必填项，默认为否 示例：false |
| costSchemaList | string | 是 | 是 | 取价方案：必填项，（3：期间结存；4：价格库参考成本；5：实时结存成本） 示例：["3", "4", "5"] 最大请求量：3 |
| materialDtoList | object | 是 | 是 | 取价物料信息：必填项，需要进行取价的物料或存货对象结合 最大请求量：100 |
| inventoryObjId | string | 否 | 否 | 存货对象：非必填项，存货对象和物料不可同时为空 示例：2178784854328475651 |
| material | number |
| 小数位数:0,最大长度:20 | 否 | 否 | 物料：非必填项，存货对象和物料不可同时为空 示例：2110529234078269442 |
| characteristicsValue | object | 否 | 否 | 物料特征组：非必填项，与物料参数配合 示例：{"CBTZ01": "1940574225679515684", "CBTZ01_name": "群众"} |
| batchNo | string | 否 | 否 | 批次号：非必填项，与物料参数配合 示例：20240101 |
| wbs | string | 否 | 否 | 核算wbs：非必填项，与物料参数配合 |
| mtoId | string | 否 | 否 | MTO订单id：非必填项，与物料参数配合 |
| mtoRowId | string | 否 | 否 | MTO订单行id：非必填项，与物料参数配合 |
| materialRowUniqueId | string | 否 | 否 | 物料行取价唯一id,必填:如果不填无法知道返回的价格对应的哪行 |
| accpurposeEnum | string | 否 | 否 | 核算目的 0:默认(法人核算目的) 1:利润中心 |

## 3. 请求示例

Url: /yonbip/EFI/fieia/costQuery?access_token=访问令牌
Body: {
	"accentity": "2110503739147157514",
	"accbook": "2110508446426595337",
	"busiDate": "2024-01-05",
	"periodCode": "2024-01",
	"costDomainId": "2110530771657687044",
	"inventoryOrg": "2110503739147157514",
	"warehouse": 1976183842479276032,
	"currencyIds": [
		"1940574191319777332"
	],
	"referencePriceStrategy": "0",
	"blnIncludeZeroCost": false,
	"costSchemaList": [
		"3",
		"4",
		"5"
	],
	"materialDtoList": [
		{
			"inventoryObjId": "2178784854328475651",
			"material": 2110529234078269442,
			"characteristicsValue": {
				"CBTZ01": "1940574225679515684",
				"CBTZ01_name": "群众"
			},
			"batchNo": "20240101",
			"wbs": "",
			"mtoId": "",
			"mtoRowId": "",
			"materialRowUniqueId": ""
		}
	],
	"accpurposeEnum": ""
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| CostResultDto | object | 是 | 取价结果 |
| inventoryObjId | string | 否 | 存货对象 示例：2178784854328475651 |
| material | number |
| 小数位数:-1,最大长度:20 | 否 | 物料 示例：2110529234078269442 |
| characteristicsValue | object | 否 | 物料特征组 示例：{"CBTZ01": "1940574225679515684", "CBTZ01_name": "群众"} |
| batchNo | string | 否 | 批次号 示例：20240101 |
| wbs | string | 否 | 核算wbs |
| mtoId | string | 否 | MTO订单id |
| mtoRowId | string | 否 | MTO订单行id |
| blnSuccess | boolean | 否 | 取价状态 示例：true |
| costPriceList | object | 是 | 取价结果 |
| priceSource | string | 否 | 取价来源（同取价方案） 示例：3 |
| priceSourceDescription | string | 否 | 取价来源描述（期间结存为期间、价格库为生效日期、实时结存为来源单据号） |
| failureReason | string | 否 | 失败原因 |
| materialRowUniqueId | string | 否 | 物料行取价唯一id,和入参一一对应 示例：dert12345 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"CostResultDto": [
			{
				"inventoryObjId": "2178784854328475651",
				"material": 2110529234078269442,
				"characteristicsValue": {
					"CBTZ01": "1940574225679515684",
					"CBTZ01_name": "群众"
				},
				"batchNo": "20240101",
				"wbs": "",
				"mtoId": "",
				"mtoRowId": "",
				"blnSuccess": true,
				"costPriceList": [
					{
						"currencyId": "1940574191319777332",
						"price": 1
					}
				],
				"priceSource": "3",
				"priceSourceDescription": "",
				"failureReason": "",
				"materialRowUniqueId": "dert12345"
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

1	2025-12-08

更新

请求说明

新增

请求参数 materialRowUniqueId

新增

请求参数 accpurposeEnum

新增

返回参数 materialRowUniqueId

新增两个参数: 1:materialRowUniqueId(物料行取价唯一id) 2:accpurposeEnum(核算目的) 0:默认(法人核算目的) 1:利润中心


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

