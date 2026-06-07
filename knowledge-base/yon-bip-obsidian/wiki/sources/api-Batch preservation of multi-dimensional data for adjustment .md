---
title: "调整单批量保存多维数据"
apiId: "2255143918270676993"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Planning, Budgeting& Forecasting"
domain: "EPM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Planning, Budgeting& Forecasting]
platform_version: "BIP"
source_type: community-api-docs
---

# 调整单批量保存多维数据

> `ContentType	application/json` 请求方式	POST | 分类: Planning, Budgeting& Forecasting (EPM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/qyjx/bp/bill/data/set/ext

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
| budget_adjust_type | string | 否 | 否 | 单据类型，1-调整单；2-调剂单 示例：1 |
| budget_version | string | 否 | 是 | 版本编码 示例：v0 |
| scenario | string | 否 | 是 | 场景编码 示例：Budget |
| bustype | string | 否 | 是 | 交易类型，用于查询“调整单设置”数据 示例：1824836522171957253 |
| budget_bill_adjust_linesList | object | 是 | 是 | 调整单/调剂单子表对象列表 |
| cube_code | string | 否 | 是 | 模型编码 示例：hjpcube |
| sheet_code | string | 否 | 是 | 表单编码 示例：WK_FORM2 |
| period_code | string | 否 | 是 | 期间编码 示例：1 |
| years_code | string | 否 | 是 | 年编码 示例：2019 |
| entity_code | string | 否 | 是 | 主体（组织）编码 示例：A002 |
| account_code | string | 否 | 是 | 科目编码 示例：AverageRate |
| reserved_field_1 | string | 否 | 否 | 预留字段1 示例：CNY |
| reserved_field_2 | string | 否 | 否 | 预留字段2 示例：zdy4 |
| reserved_field_3 | string | 否 | 否 | 预留字段3 |
| reserved_field_4 | string | 否 | 否 | 预留字段4 |
| reserved_field_5 | string | 否 | 否 | 预留字段5 |
| reserved_field_6 | string | 否 | 否 | 预留字段6 |
| reserved_field_7 | string | 否 | 否 | 预留字段7 |
| reserved_field_8 | string | 否 | 否 | 预留字段8 |
| reserved_field_9 | string | 否 | 否 | 预留字段9 |
| reserved_field_10 | string | 否 | 否 | 预留字段10 |
| reserved_field_11 | string | 否 | 否 | 预留字段11 |
| reserved_field_12 | string | 否 | 否 | 预留字段12 |
| reserved_field_13 | string | 否 | 否 | 预留字段13 |
| reserved_field_14 | string | 否 | 否 | 预留字段14 |
| reserved_field_15 | string | 否 | 否 | 预留字段15 |
| reserved_field_16 | string | 否 | 否 | 预留字段16 |
| reserved_field_17 | string | 否 | 否 | 预留字段17 |
| reserved_field_18 | string | 否 | 否 | 预留字段18 |
| reserved_field_19 | string | 否 | 否 | 预留字段19 |
| reserved_field_20 | string | 否 | 否 | 预留字段20 |
| extendData | object | 否 | 否 | 扩展数据map |

## 3. 请求示例

Url: /yonbip/qyjx/bp/bill/data/set/ext?access_token=访问令牌
Body: {
	"budget_adjust_type": "1",
	"budget_version": "v0",
	"scenario": "Budget",
	"bustype": "1824836522171957253",
	"budget_bill_adjust_linesList": [
		{
			"cube_code": "hjpcube",
			"sheet_code": "WK_FORM2",
			"period_code": "1",
			"years_code": "2019",
			"entity_code": "A002",
			"account_code": "AverageRate",
			"reserved_field_1": "CNY",
			"reserved_field_2": "zdy4",
			"reserved_field_3": "",
			"reserved_field_4": "",
			"reserved_field_5": "",
			"reserved_field_6": "",
			"reserved_field_7": "",
			"reserved_field_8": "",
			"reserved_field_9": "",
			"reserved_field_10": "",
			"reserved_field_11": "",
			"reserved_field_12": "",
			"reserved_field_13": "",
			"reserved_field_14": "",
			"reserved_field_15": "",
			"reserved_field_16": "",
			"reserved_field_17": "",
			"reserved_field_18": "",
			"reserved_field_19": "",
			"reserved_field_20": "",
			"extendData": {
				"dimCodes": [
					"PERIOD"
				],
				"PERIOD": [
					"1",
					"2",
					"3"
				],
				"values": [
					11.34,
					1.56,
					9877
				]
			}
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


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

