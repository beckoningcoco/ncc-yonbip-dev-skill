---
title: "材料预估价批量导入"
apiId: "1504713806343831560"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Estimated Material Price"
domain: "CO"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Estimated Material Price]
platform_version: "BIP"
source_type: community-api-docs
---

# 材料预估价批量导入

> `ContentType	application/json` 请求方式	POST | 分类: Estimated Material Price (CO)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/CO/eces/materialEstimatePrice/batchSave

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
| accentity | string | 否 | 否 | 会计主体id 示例：2 |
| accentityCode | string | 否 | 是 | 会计主体编码 示例：0909，id和编码同时存在，优先按id保存 |
| stockorg | string | 否 | 否 | 库存组织id 示例：4 |
| stockorgCode | string | 否 | 是 | 库存组织编码 示例：0909，id和编码同时存在，优先按id保存 |
| items | object | 是 | 是 | 表体物料信息 |
| product | string | 否 | 否 | 基础物料id 示例：33 |
| productCode | string | 否 | 是 | 基础物料编码 示例：product0909，id和编码同时存在，优先按id保存 |
| startDate | string | 否 | 是 | 生效日期 示例：2022-06-15，失效日期不能早于生效日期 |
| currency | string | 否 | 否 | 币种id 示例：12 |
| currencyCode | string | 否 | 是 | 币种编码 示例：CNY，id和编码同时存在，优先按id保存 |
| currencyPrice | BigDecimal | 否 | 是 | 单价，精度为录入币种的单价精度 示例：25 |
| endDate | string | 否 | 是 | 失效日期 示例：2022-06-30，失效日期不能早于生效日期 |
| characters | object | 否 | 否 | 成本特征JSON，key-value形式，key为成本敏感特征编码，value为特征引用的自定义档案编码 示例：{"cb202":"z00101","cb201":"1"} |

## 3. 请求示例

Url: /yonbip/CO/eces/materialEstimatePrice/batchSave?access_token=访问令牌
Body: {
	"accentity": "2",
	"accentityCode": "0909，id和编码同时存在，优先按id保存",
	"stockorg": "4",
	"stockorgCode": "0909，id和编码同时存在，优先按id保存",
	"items": [
		{
			"product": "33",
			"productCode": "product0909，id和编码同时存在，优先按id保存",
			"startDate": "2022-06-15，失效日期不能早于生效日期",
			"currency": "12",
			"currencyCode": "CNY，id和编码同时存在，优先按id保存",
			"currencyPrice": 25,
			"endDate": "2022-06-30，失效日期不能早于生效日期",
			"characters": {
				"cb202": "z00101",
				"cb201": "1"
			}
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | long | 否 | 返回码，成功时返回200 示例：200 |
| message | string | 否 | 返回信息描述 示例：操作成功 |
| data | object | 否 | 返回数据 |
| count | long | 否 | 总条数 示例：10 |
| sucessCount | long | 否 | 成功条数 示例：5 |
| failCount | long | 否 | 失败条数 示例：5 |
| messages | string | 是 | 错误信息 示例：物料为空或未查询到物料 |
| infos | object | 是 | 成功数据信息 |
| failInfos | object | 是 | 失败数据信息 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"count": 10,
		"sucessCount": 5,
		"failCount": 5,
		"messages": [
			"物料为空或未查询到物料"
		],
		"infos": [
			{
				"accentity": "",
				"accentityCode": "",
				"stockorg": "",
				"stockorgCode": "",
				"items": [
					{
						"product": 0,
						"productCode": "",
						"startDate": "",
						"endDate": "",
						"currency": "",
						"currencyCode": "",
						"characters": {},
						"currencyPrice": 123
					}
				]
			}
		],
		"failInfos": [
			{
				"accentity": "",
				"accentityCode": "",
				"stockorg": "",
				"stockorgCode": "",
				"items": [
					{
						"product": "",
						"productCode": "",
						"startDate": "",
						"endDate": "",
						"currency": "",
						"currencyCode": "",
						"currencyPrice": 0
					}
				]
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	系统异常	根据返回提示信息做相应处理


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

