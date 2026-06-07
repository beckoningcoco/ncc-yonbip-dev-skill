---
title: "指标数据查询"
apiId: "1692611074993422342"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Financial Reports"
domain: "EPM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Financial Reports]
platform_version: "BIP"
source_type: community-api-docs
---

# 指标数据查询

> `ContentType	application/json` 请求方式	POST | 分类: Financial Reports (EPM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/qyjx/queryData/externalQuery

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
| sheetCode | string | 否 | 是 | 表单编码 示例：zzy002 |
| queryFloatData | string | 否 | 否 | 是否查询浮动区数据,如果查询则填入大写的Y,否者填入N; 如果填入N 参数floatVar不生效，items中的浮动指标也不会查询 示例：Y 默认值：N |
| floatVar | string | 是 | 否 | 填入需要查询的浮动区id,如果参数queryFloatData是N时该参数不生效,如果为Y时 items里指定了其他浮动区的指标也会过滤 示例：["F_1","F_2"] |
| items | string | 是 | 否 | 填入需要指定查询的指标编码,固定区指标不受控制,浮动指标会受到参数queryFloatData和floatVar控制 示例：["ZB01","ZB02"] |
| params | object | 是 | 是 | 参数维度:根据表单挂的维度进行传递;维度参考企业报表中报表数据中心下wrapper接口里的dimcode参数 |
| ENTITY | string | 否 | 是 | 主体维度，必填 示例：[None] |
| YEARS | string | 否 | 是 | 年期间维度,必填 示例：2023 |
| PERIOD | string | 否 | 否 | 期间 根据周期类型 选择月份,季度 Q1,Q2,Q3,Q4或者上半年,下半年等 示例：3 |
| ACCOUNT | string | 否 | 否 | 科目,根据表单挂的维度判断是否传递 示例：CurrRate |
| VIEW | string | 否 | 否 | 度量维,根据表单挂的维度判断是否传递 示例：HYTD |
| SCENARIO | string | 否 | 否 | 业务方案,根据表单挂的维度判断是否传递 示例：Actual |
| CURRENCY | string | 否 | 否 | 币种,根据表单挂的维度判断是否传递 示例：CNY |
| VERSION | string | 否 | 否 | 版本,根据表单挂的维度进行判断是否传递 示例：v0 |
| P1~P12 | string | 否 | 否 | P维度,根据表单挂的维度进行判断是否传递 示例：[None] |
| ISTALLY | string | 否 | 否 | 是否计账维度,根据表单挂的维度判断是否传递 示例：N |

## 3. 请求示例

Url: /yonbip/qyjx/queryData/externalQuery?access_token=访问令牌
Body: [{
	"sheetCode": "zzy002",
	"queryFloatData": "Y",
	"floatVar": [
		"F_1",
		"F_2"
	],
	"items": [
		"ZB01",
		"ZB02"
	],
	"params": [
		{
			"ENTITY": "[None]",
			"YEARS": "2023",
			"PERIOD": "3",
			"ACCOUNT": "CurrRate",
			"VIEW": "HYTD",
			"SCENARIO": "Actual",
			"CURRENCY": "CNY",
			"VERSION": "v0",
			"P1~P12": "[None]",
			"ISTALLY": "N"
		}
	]
}]

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | long | 否 | 状态码 示例：200 |
| data | object | 是 | 响应数据 |
| sheetCode | string | 否 | 表单编码 示例：zzy002 |
| params | object | 否 | 参数维度:根据表单挂的维度进行传递维度参考企业报表中报表数据中心下queryFormatSheet接口里的dimcode参数 |
| items | object | 是 | 固定指标列表 |
| errMsg | string | 否 | 每个指标的错误信息 示例：查询的表单数量超过查询最大限制数10,请分批查询 |
| errCode | string | 否 | 错误编码 示例：50001 |
| floatItems | object | 是 | 浮动区指标数据 |
| success | boolean | 否 | 成功标识 示例：true |

## 5. 正确返回示例

{
	"code": 200,
	"data": [
		{
			"sheetCode": "zzy002",
			"params": {
				"PERIOD": "3",
				"ENTITY": "[None]",
				"YEARS": "2023"
			},
			"items": [
				{
					"itemCode": "ZB23",
					"itemName": "暂无名称",
					"itemType": 2,
					"value": "1.000"
				}
			],
			"errMsg": "查询的表单数量超过查询最大限制数10,请分批查询",
			"errCode": "50001",
			"floatItems": [
				{
					"varId": "F_1",
					"itemData": [
						{
							"itemName": "",
							"itemCode": "",
							"itemType": "",
							"value": ""
						}
					]
				}
			]
		}
	],
	"success": true
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

50001	查询的表单数量超过查询最大限制数10,请分批查询	该表单不存在该租户下

50002	单个表单维度组合数量超过查询最大限制数100,请分批查询

50003	企业报表{0}表单不存在，请确认表单是否启用、发布及有可读权限!

50004	未查询到可用指标，请确认指标是否存在！

50005	维度{0}没有设置成员值!


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-05-13

更新

请求说明

更新

请求参数 PERIOD

更新

返回参数 itemType

返回结果透传

2	2025-06-26

更新

请求参数 params


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

