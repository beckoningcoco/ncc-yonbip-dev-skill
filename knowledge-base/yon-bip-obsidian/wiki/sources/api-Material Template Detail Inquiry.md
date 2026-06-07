---
title: "物料模板详情查询V2"
apiId: "1694296497469784065"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Material Template"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Material Template]
platform_version: "BIP"
source_type: community-api-docs
---

# 物料模板详情查询V2

> `ContentType	application/json` 请求方式	GET | 分类: Material Template (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/producttpl/detailnew

请求方式	GET

ContentType	application/json

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| templateId | long | query | 是 | 物料模板id    示例: 2004369977645727747 |

## 3. 请求示例

Url: /yonbip/digitalModel/producttpl/detailnew?access_token=访问令牌&templateId=2004369977645727747

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| message | string | 否 | 返回值的提示信息 示例：物料模板列表查询成功 |
| code | string | 否 | 返回值编码，成功时为200 示例：200 |
| data | object | 是 | 返回值的数据 |
| name | object | 否 | 物料模板名称 |
| enableCyclePurchase | boolean | 否 | 启用周期购（true表示启用，false表示未启用） 示例：false |
| enableWeighing | boolean | 否 | 启用称重（true表示启用，false表示未启用） 示例：false |
| skuBusinessDynamic | boolean | 否 | SKU随业务动态产生（true表示开启，false表示未不开启） 示例：false |
| involveSKUNaming | boolean | 否 | 物料名称参与SKU名称命名（true表示参与，false表示未参与） 示例：true |
| isOptionalTemplate | int | 否 | 是否选配模板 0表示不是。1表示是选配模版 示例：0 |
| nameSpacer | int | 否 | SKU名称间隔符（枚举类型，0表示空格；1为中文顿号；2为反斜杠符号，3为中文逗号） 示例：1 |
| stopStatus | int | 否 | 启用状态 0表示启用，1表示停用 示例：0 |
| units | object | 是 | 计量单位信息 |
| productTplAssistUnitExchangesList | object | 是 | 物料模板辅计量换算对照 |
| brands | object | 是 | 关联品牌信息 |
| freeCTCode | string | 否 | 自由项特征组编码 示例：free_ct_sjy |
| freeCharacters | object | 是 | 自由项特征组特征信息 |
| materialPropCTCode | string | 否 | 物料属性特征组编码 示例：product_ct |
| productPropCharacters | object | 是 | 物料属性特征组特征信息 |
| skuPropCTCode | string | 否 | SKU属性特征组编码 示例：SKU |
| skuCharacters | object | 是 | SKU属性特征组特征信息 |
| optionCTCode | string | 否 | 选配特征组编码 |
| optionCharacters | object | 是 | 选配特征组特征信息 |
| parameters | object | 否 | 物料参数 |
| orderPropertySums | object | 否 | 商品订单属性 |

## 5. 正确返回示例

{
	"message": "物料模板列表查询成功",
	"code": "200",
	"data": [
		{
			"name": {
				"simplifiedName": "模版AA-副本13213",
				"englishName": "name1",
				"traditionalName": "名稱"
			},
			"enableCyclePurchase": false,
			"enableWeighing": false,
			"skuBusinessDynamic": false,
			"involveSKUNaming": true,
			"isOptionalTemplate": 0,
			"nameSpacer": 1,
			"stopStatus": 0,
			"units": [
				{
					"unit": 1525697375763955700,
					"unitName": "小时",
					"purchaseUnit": 1525697375763955700,
					"purchaseUnitName": "小时",
					"purchasePriceUnit": 1525697375763955700,
					"purchasePriceUnitName": "小时",
					"stockUnit": 1525697375763955700,
					"stockUnitName": "小时",
					"batchUnit": 1525697375763955700,
					"batchUnitName": "小时",
					"onlineUnit": 1525697375763955700,
					"onlineUnitName": "小时",
					"offlineUnit": 1525697375763955700,
					"offlineUnitName": "小时",
					"requireUnit": 1525697375763955700,
					"requireUnitName": "小时",
					"batchPriceUnit": 1525697375763955700,
					"batchPriceUnitName": "小时",
					"produceUnit": 1525697375763955700,
					"produceUnitName": "小时",
					"enableAssistUnit": true
				}
			],
			"productTplAssistUnitExchangesList": [
				{
					"unitExchangeType": 0,
					"assistUnitCount": 1,
					"assistUnit": 1534493288405926000,
					"assistUnitName": "秒",
					"mainUnitCount": 3,
					"order": 1
				}
			],
			"brands": [
				{
					"brandName": "11"
				}
			],
			"freeCTCode": "free_ct_sjy",
			"freeCharacters": [
				{
					"characteristics": 1659179066623787000,
					"characteristicsType": 3,
					"characteristicsName": "测试自由项特征组",
					"characterCode": "qinyr_size",
					"twoDimensionalInput": 0,
					"batchSens": 0,
					"costAffec": 0,
					"manuAffec": 0,
					"priceAffec": 0,
					"skuSens": 0,
					"stockSens": 0,
					"snsens": 0,
					"bomaffec": 0,
					"iorder": 1,
					"characterName": "TZ"
				}
			],
			"materialPropCTCode": "product_ct",
			"productPropCharacters": [
				{
					"characteristics": 1659177924162486300,
					"characteristicsType": 1,
					"characteristicsName": "测试物料属性特征组",
					"characterCode": "js_05",
					"webShow": 0,
					"iorder": 3,
					"characterName": "TZ"
				}
			],
			"skuPropCTCode": "SKU",
			"skuCharacters": [
				{
					"characteristics": 1659835165831594000,
					"characteristicsType": 2,
					"characteristicsName": "SKU属性特征组1",
					"characterCode": "Q123",
					"iorder": 1,
					"characterName": "TZ"
				}
			],
			"optionCTCode": "",
			"optionCharacters": [
				{
					"characteristics": 0,
					"characteristicsType": 0,
					"characteristicsName": "",
					"characterCode": "",
					"iorder": "",
					"characterName": "TZ"
				}
			],
			"parameters": {
				"name": {
					"simplifiedName": "屬性1",
					"englishName": "attr1",
					"traditionalName": "屬性1"
				},
				"group": {
					"simplifiedName": "組1",
					"englishName": "group1",
					"traditionalName": "組1"
				},
				"isFilter": false
			},
			"orderPropertySums": {
				"name": "1",
				"isShow": false,
				"isRequired": false,
				"alias": "1",
				"limitNum": 50
			}
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	服务端逻辑异常	检查入参是否填写正确，参数值是否真实存在，仍提示该信息请联系开发人员


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-09-12

更新

请求说明

新增

返回参数 (4)

2	2025-07-17

更新

请求说明


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

