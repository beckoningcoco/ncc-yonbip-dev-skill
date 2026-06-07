---
title: "预算系统注册的增加维度"
apiId: "1471377343812468736"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Budget Execution Control"
domain: "EPM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Budget Execution Control]
platform_version: "BIP"
source_type: community-api-docs
---

# 预算系统注册的增加维度

> `ContentType	application/json` 请求方式	POST | 分类: Budget Execution Control (EPM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/qyjx/yonbip-fi-sepmbcdc/open/addField

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
| data | object | 是 | 是 | 数据仓库封装data |
| cubeCode | string | 否 | 是 | 预算系统的模型编码 示例：wxy0802 |
| sysCode | string | 否 | 是 | 预算系统的系统编码 示例：EBDG |
| fields | object | 是 | 是 | 维度字段信息 |

## 3. 请求示例

Url: /yonbip/qyjx/yonbip-fi-sepmbcdc/open/addField?access_token=访问令牌
Body: {
	"data": [
		{
			"cubeCode": "wxy0802",
			"sysCode": "EBDG",
			"fields": [
				{
					"fieldId": "1800812000112",
					"fieldCode": "pk_busimemo",
					"fieldName": "费用项目",
					"fieldName2": "",
					"fieldName3": "",
					"isActiveDim": 0,
					"mappingFixedValue": "",
					"isQueryCondition": 1,
					"metadata": "finbd&bd.expenseitem.ExpenseItem",
					"fixedUrl": "BUDGET",
					"refUrl": {
						"url": "",
						"type": "bip",
						"refType": "",
						"param": {
							"refCode": "",
							"domainKey": ""
						}
					}
				}
			]
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| message | string | 否 | 接口结果提示信息（成功：无，失败：报错信息） 示例：失败：模型信息相关的方案数据已经存在，模型和模型维度信息不允许修改! |
| code | string | 否 | 响应码 示例：成功：200 |
| data | string | 否 | 返回数据 示例：null |

## 5. 正确返回示例

{
	"message": "失败：模型信息相关的方案数据已经存在，模型和模型维度信息不允许修改!",
	"code": "成功：200",
	"data": "null"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

500	同一租户下存在字段编码已经存在的情况，不允许新增，请重新输入字段编码!	同一租户下存在字段编码已经存在的情况，不允许新增，请重新输入字段编码!


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-04-27

更新

请求参数 (13)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

