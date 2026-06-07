---
title: "物料模板批量保存V3"
apiId: "1909187034267779076"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Material Template"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Material Template]
platform_version: "BIP"
source_type: community-api-docs
---

# 物料模板批量保存V3

> `ContentType	application/json` 请求方式	POST | 分类: Material Template (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/producttpl/batchsavenew

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
| name | object | 否 | 是 | 物料模板名称 |
| simplifiedName | string | 否 | 是 | 中文名称 示例：模版01 |
| englishName | string | 否 | 否 | 英文名称 示例：template01 |
| traditionalName | string | 否 | 否 | 繁体名称 示例：模板01 |
| involveSKUNaming | boolean | 否 | 否 | 物料名称参与SKU名称命名 true: 参与命名，false：不参与命名，默认true 示例：true |
| isOptionalTemplate | int | 否 | 否 | 是否选配模版 （0标识不是选配模版，1为选配模版，默认为0） 示例：0 |
| nameSpacer | int | 否 | 否 | 名称间隔符号（枚举类型，0表示空格；1为中文顿号；2为反斜杠符号，3为中文逗号；其余值暂不支持） 示例：1 |
| stopStatus | int | 否 | 是 | 停用状态（0表示该模板启用，1表示该模板停用，默认为0） 示例：0 |
| units | object | 是 | 否 | 计量单位信息（该实体内字段优先级ID>编码>名称。即如填写ID以ID为准，ID未填写，编码填写则以编码为准，如果ID和编码都没填写则以名称为准） |
| unit | long | 否 | 否 | 主计量单位ID（字段优先级ID>编码>名称。即如填写ID以ID为准，ID未填写，编码填写则以编码为准，如果ID和编码都没填写则以名称为准） 示例：1525697375763955700 |
| unitCode | string | 否 | 否 | 主计量单位编码（字段优先级ID>编码>名称。即如填写ID以ID为准，ID未填写，编码填写则以编码为准，如果ID和编码都没填写则以名称为准） 示例：HUR |
| unitName | string | 否 | 否 | 主计量单位名称（字段优先级ID>编码>名称。即如填写ID以ID为准，ID未填写，编码填写则以编码为准，如果ID和编码都没填写则以名称为准） 示例：小时 |
| purchaseUnit | long | 否 | 否 | 采购单位ID（字段优先级ID>编码>名称。即如填写ID以ID为准，ID未填写，编码填写则以编码为准，如果ID和编码都没填写则以名称为准） 示例：1525697375763955700 |
| purchaseUnitCode | string | 否 | 否 | 采购单位编码（字段优先级ID>编码>名称。即如填写ID以ID为准，ID未填写，编码填写则以编码为准，如果ID和编码都没填写则以名称为准） 示例：HUR |
| purchaseUnitName | string | 否 | 否 | 采购单位名称（字段优先级ID>编码>名称。即如填写ID以ID为准，ID未填写，编码填写则以编码为准，如果ID和编码都没填写则以名称为准） 示例：小时 |
| purchasePriceUnit | long | 否 | 否 | 采购计价单位ID（字段优先级ID>编码>名称。即如填写ID以ID为准，ID未填写，编码填写则以编码为准，如果ID和编码都没填写则以名称为准） 示例：1525697375763955700 |
| purchasePriceUnitCode | string | 否 | 否 | 采购计量单位编码（字段优先级ID>编码>名称。即如填写ID以ID为准，ID未填写，编码填写则以编码为准，如果ID和编码都没填写则以名称为准） 示例：HUR |
| purchasePriceUnitName | string | 否 | 否 | 采购计价单位名称（字段优先级ID>编码>名称。即如填写ID以ID为准，ID未填写，编码填写则以编码为准，如果ID和编码都没填写则以名称为准） 示例：小时 |
| stockUnit | long | 否 | 否 | 库存单位ID（字段优先级ID>编码>名称。即如填写ID以ID为准，ID未填写，编码填写则以编码为准，如果ID和编码都没填写则以名称为准） 示例：1525697375763955700 |
| stockUnitCode | string | 否 | 否 | 库存单位编码（字段优先级ID>编码>名称。即如填写ID以ID为准，ID未填写，编码填写则以编码为准，如果ID和编码都没填写则以名称为准） 示例：HUR |
| stockUnitName | string | 否 | 否 | 库存单位名称（字段优先级ID>编码>名称。即如填写ID以ID为准，ID未填写，编码填写则以编码为准，如果ID和编码都没填写则以名称为准） 示例：小时 |
| batchUnit | long | 否 | 否 | 批发销售单位ID（字段优先级ID>编码>名称。即如填写ID以ID为准，ID未填写，编码填写则以编码为准，如果ID和编码都没填写则以名称为准） 示例：1525697375763955700 |
| batchUnitCode | string | 否 | 否 | 批发销售单位编码（字段优先级ID>编码>名称。即如填写ID以ID为准，ID未填写，编码填写则以编码为准，如果ID和编码都没填写则以名称为准） 示例：HUR |
| batchUnitName | string | 否 | 否 | 批发销售单位名称（字段优先级ID>编码>名称。即如填写ID以ID为准，ID未填写，编码填写则以编码为准，如果ID和编码都没填写则以名称为准） 示例：小时 |
| onlineUnit | long | 否 | 否 | 线上零售单位ID（字段优先级ID>编码>名称。即如填写ID以ID为准，ID未填写，编码填写则以编码为准，如果ID和编码都没填写则以名称为准） 示例：1525697375763955700 |
| onlineUnitCode | string | 否 | 否 | 线上零售单位编码（字段优先级ID>编码>名称。即如填写ID以ID为准，ID未填写，编码填写则以编码为准，如果ID和编码都没填写则以名称为准） 示例：HUR |
| onlineUnitName | string | 否 | 否 | 线上零售单位名称字段优先级ID>编码>名称。即如填写ID以ID为准，ID未填写，编码填写则以编码为准，如果ID和编码都没填写则以名称为准） 示例：小时 |
| offlineUnit | long | 否 | 否 | 线下零售单位ID字段优先级ID>编码>名称。即如填写ID以ID为准，ID未填写，编码填写则以编码为准，如果ID和编码都没填写则以名称为准） 示例：1525697375763955700 |
| offlineUnitCode | string | 否 | 否 | 线下零售单位编码字段优先级ID>编码>名称。即如填写ID以ID为准，ID未填写，编码填写则以编码为准，如果ID和编码都没填写则以名称为准） 示例：HUR |
| offlineUnitName | string | 否 | 否 | 线下零售单位名称（字段优先级ID>编码>名称。即如填写ID以ID为准，ID未填写，编码填写则以编码为准，如果ID和编码都没填写则以名称为准） 示例：小时 |
| requireUnit | long | 否 | 否 | 要货单位ID（字段优先级ID>编码>名称。即如填写ID以ID为准，ID未填写，编码填写则以编码为准，如果ID和编码都没填写则以名称为准） 示例：1525697375763955700 |
| requireUnitCode | string | 否 | 否 | 要货单位编码（字段优先级ID>编码>名称。即如填写ID以ID为准，ID未填写，编码填写则以编码为准，如果ID和编码都没填写则以名称为准） 示例：HUR |
| requireUnitName | string | 否 | 否 | 要货单位名称（字段优先级ID>编码>名称。即如填写ID以ID为准，ID未填写，编码填写则以编码为准，如果ID和编码都没填写则以名称为准） 示例：小时 |
| batchPriceUnit | long | 否 | 否 | 批发计价单位ID（字段优先级ID>编码>名称。即如填写ID以ID为准，ID未填写，编码填写则以编码为准，如果ID和编码都没填写则以名称为准） 示例：1525697375763955700 |
| batchPriceUnitCode | string | 否 | 否 | 批发计价单位编码（字段优先级ID>编码>名称。即如填写ID以ID为准，ID未填写，编码填写则以编码为准，如果ID和编码都没填写则以名称为准） 示例：HUR |
| batchPriceUnitName | string | 否 | 否 | 批发计价单位名称字段优先级ID>编码>名称。即如填写ID以ID为准，ID未填写，编码填写则以编码为准，如果ID和编码都没填写则以名称为准） 示例：小时 |
| produceUnit | long | 否 | 否 | 生产单位ID（字段优先级ID>编码>名称。即如填写ID以ID为准，ID未填写，编码填写则以编码为准，如果ID和编码都没填写则以名称为准） 示例：1525697375763955700 |
| produceUnitCode | string | 否 | 否 | 生产单位编码（字段优先级ID>编码>名称。即如填写ID以ID为准，ID未填写，编码填写则以编码为准，如果ID和编码都没填写则以名称为准） 示例：HUR |
| produceUnitName | string | 否 | 否 | 生产单位名称（字段优先级ID>编码>名称。即如填写ID以ID为准，ID未填写，编码填写则以编码为准，如果ID和编码都没填写则以名称为准） 示例：小时 |
| enableAssistUnit | boolean | 否 | 否 | 启用辅计量（true表示启用辅计量，false表示不启用辅计量） 示例：true |
| productTplAssistUnitExchangesList | object | 是 | 否 | 物料模板辅计量单位信息（启用辅计量单位时必输） |
| unitExchangeType | int | 否 | 否 | 换算方式（0为固定换算，1为浮动换算） 示例：0 |
| assistUnitCount | BigDecimal | 否 | 否 | 辅计量数量 示例：1 |
| assistUnit | long | 否 | 否 | 辅计量单位ID（字段优先级ID>编码>名称。即如填写ID以ID为准，ID未填写，编码填写则以编码为准，如果ID和编码都没填写则以名称为准） 示例：1534493288405926000 |
| assistUnitCode | string | 否 | 否 | 辅计量单位编码（字段优先级ID>编码>名称。即如填写ID以ID为准，ID未填写，编码填写则以编码为准，如果ID和编码都没填写则以名称为准） 示例：SEC |
| assistUnitName | string | 否 | 否 | 辅计量单位名称（字段优先级ID>编码>名称。即如填写ID以ID为准，ID未填写，编码填写则以编码为准，如果ID和编码都没填写则以名称为准） 示例：秒 |
| mainUnitCount | BigDecimal | 否 | 否 | 主计量数量 示例：3 |
| order | int | 否 | 否 | 排序 示例：1 |
| brands | object | 是 | 否 | 关联品牌信息 |
| brandCode | string | 否 | 否 | 品牌编码（填写了编码则以编码为准） 示例：000012 |
| brandName | string | 否 | 否 | 品牌名称（填写了编码则以编码为准） 示例：a1 |
| orderPropertySums | object | 是 | 否 | 订单属性信息 |
| propertyTypeShowItem | string | 否 | 否 | 订单属性名称 示例：订单01 |
| isShow | boolean | 否 | 否 | 是否前端显示（true为显示，false为不显示，默认为false） 示例：false |
| isRequired | boolean | 否 | 否 | 是否必输（true为必输，false为不必输，默认为false） 示例：false |
| alias | string | 否 | 否 | 属性别名 示例：DD01 |
| limitNum | int | 否 | 否 | 字数限制 示例：100 |
| parameters | object | 是 | 否 | 物料参数信息 |
| name | object | 否 | 否 | 参数名称 |
| group | object | 否 | 否 | 分组名称 |
| isFilter | boolean | 否 | 否 | 加入分类查询条件（true表示加入分类查询条件，false表示不加入分类查询条件） 示例：false |
| freeCTCode | string | 否 | 否 | 自由项特征组编码（isOptionalTemplate=1,是选配模板时，不可填写） 示例：free_ct_sjy |
| freeCharacters | object | 是 | 否 | 自由项特征组特征信息（isOptionalTemplate=1,是选配模板时，不可填写） |
| characteristics | long | 否 | 否 | 特征组ID 示例：1659179066623787000 |
| characteristicsName | string | 否 | 否 | 特征组名称 示例：测试自由项特征组 |
| characterCode | string | 否 | 否 | 特征编码 示例：qinyr_size |
| twoDimensionalInput | int | 否 | 否 | 二维录入（0表示不启用二维录入，1表示启用二维录入，默认为0） 示例：0 |
| batchSens | int | 否 | 否 | 批次敏感（0表示不启用批次敏感，1表示启用批次敏感，默认为0） 示例：0 |
| costAffec | int | 否 | 否 | 成本敏感（0表示不启用成本敏感，1表示启用成本敏感，默认为0） 示例：0 |
| manuAffec | int | 否 | 否 | 工艺敏感（0表示不启用工艺敏感，1表示启用工艺敏感，默认为0） 示例：0 |
| skuSens | int | 否 | 否 | SKU敏感（0表示不启用SKU敏感，1表示启用SKU敏感，默认为0） 示例：0 |
| stockSens | int | 否 | 否 | 仅现存量敏感（0表示不启用仅现存量敏感，1表示启用仅现存量敏感，默认为0） 示例：0 |
| snSens | int | 否 | 否 | 序列号敏感（0表示不启用序列号敏感，1表示启用序列号敏感，默认为0） 示例：0 |
| bomAffec | int | 否 | 否 | BOM敏感（0表示不启用BOM敏感，1表示启用BOM敏感，默认为0） 示例：0 |
| characterOrder | int | 否 | 否 | 排序 示例：1 |
| materialPropCTCode | string | 否 | 否 | 物料属性特征组编码 示例：product_ct |
| skuPropCTCode | string | 否 | 否 | SKU属性特征组编码（isOptionalTemplate=1,是选配模板时，不可填写） 示例：SKU |
| optionCTCode | string | 否 | 否 | 选配特征组编码（isOptionalTemplate=0,非选配模板时，不可填写 ） 示例：选配01 |

## 3. 请求示例

Url: /yonbip/digitalModel/producttpl/batchsavenew?access_token=访问令牌
Body: [{
	"name": {
		"simplifiedName": "模版01",
		"englishName": "template01",
		"traditionalName": "模板01"
	},
	"involveSKUNaming": true,
	"isOptionalTemplate": 0,
	"nameSpacer": 1,
	"stopStatus": 0,
	"units": [
		{
			"unit": 1525697375763955700,
			"unitCode": "HUR",
			"unitName": "小时",
			"purchaseUnit": 1525697375763955700,
			"purchaseUnitCode": "HUR",
			"purchaseUnitName": "小时",
			"purchasePriceUnit": 1525697375763955700,
			"purchasePriceUnitCode": "HUR",
			"purchasePriceUnitName": "小时",
			"stockUnit": 1525697375763955700,
			"stockUnitCode": "HUR",
			"stockUnitName": "小时",
			"batchUnit": 1525697375763955700,
			"batchUnitCode": "HUR",
			"batchUnitName": "小时",
			"onlineUnit": 1525697375763955700,
			"onlineUnitCode": "HUR",
			"onlineUnitName": "小时",
			"offlineUnit": 1525697375763955700,
			"offlineUnitCode": "HUR",
			"offlineUnitName": "小时",
			"requireUnit": 1525697375763955700,
			"requireUnitCode": "HUR",
			"requireUnitName": "小时",
			"batchPriceUnit": 1525697375763955700,
			"batchPriceUnitCode": "HUR",
			"batchPriceUnitName": "小时",
			"produceUnit": 1525697375763955700,
			"produceUnitCode": "HUR",
			"produceUnitName": "小时",
			"enableAssistUnit": true
		}
	],
	"productTplAssistUnitExchangesList": [
		{
			"unitExchangeType": 0,
			"assistUnitCount": 1,
			"assistUnit": 1534493288405926000,
			"assistUnitCode": "SEC",
			"assistUnitName": "秒",
			"mainUnitCount": 3,
			"order": 1
		}
	],
	"brands": [
		{
			"brandCode": "000012",
			"brandName": "a1"
		}
	],
	"orderPropertySums": [
		{
			"propertyTypeShowItem": "订单01",
			"isShow": false,
			"isRequired": false,
			"alias": "DD01",
			"limitNum": 100
		}
	],
	"parameters": [
		{
			"name": {
				"simplifiedName": "参数101",
				"englishName": "param101",
				"traditionalName": "参数101"
			},
			"group": {
				"simplifiedName": "分组101",
				"englishName": "group101",
				"traditionalName": "分组101"
			},
			"isFilter": false
		}
	],
	"freeCTCode": "free_ct_sjy",
	"freeCharacters": [
		{
			"characteristics": 1659179066623787000,
			"characteristicsName": "测试自由项特征组",
			"characterCode": "qinyr_size",
			"twoDimensionalInput": 0,
			"batchSens": 0,
			"costAffec": 0,
			"manuAffec": 0,
			"skuSens": 0,
			"stockSens": 0,
			"snSens": 0,
			"bomAffec": 0,
			"characterOrder": 1
		}
	],
	"materialPropCTCode": "product_ct",
	"skuPropCTCode": "SKU",
	"optionCTCode": "选配01"
}]

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| message | string | 否 | 处理返回信息 示例：处理成功 |
| code | string | 否 | 处理返回结果码 示例：200 |
| data | object | 否 | 返回数据 |
| count | number |
| 小数位数:0,最大长度:19 | 否 | 数量 示例：2 |
| successCount | number |
| 小数位数:0,最大长度:19 | 否 | 成功数量 示例：1 |
| failCount | number |
| 小数位数:0,最大长度:19 | 否 | 失败数量 示例：1 |
| messages | object | 是 | 失败详细信息 示例：["物料模板名称[模板00]，是选配模板时，SKU属性特征组不可填值"] |
| infos | object | 是 | 成功详细信息 |

## 5. 正确返回示例

{
	"message": "处理成功",
	"code": "200",
	"data": {
		"count": 2,
		"successCount": 1,
		"failCount": 1,
		"messages": [
			"物料模板名称[模板00]，是选配模板时，SKU属性特征组不可填值"
		],
		"infos": [
			{
				"id": 1918383967882444807,
				"name": "模板01"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

-1	系统异常，请稍后再试	系统异常，请稍后再试


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-17

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

