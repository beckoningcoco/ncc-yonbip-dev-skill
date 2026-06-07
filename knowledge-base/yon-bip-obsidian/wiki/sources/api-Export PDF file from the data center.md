---
title: "数据中心导出PDF文件"
apiId: "2094839168879296515"
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

# 数据中心导出PDF文件

> `ContentType	application/json` 请求方式	POST | 分类: Planning, Budgeting& Forecasting (EPM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/qyjx/bp/file/downApiForms

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
| exportFileType | string | 否 | 是 | 导出文件的类型 示例：pbf |
| sheetExpInfo | object | 是 | 否 | 表单导出基本信息 |
| sheetPk | string | 否 | 否 | 表单pk 示例：2080064876437307396 |
| sheetCode | string | 否 | 否 | 表单编码 |
| taskId | string | 否 | 否 | 任务ID |
| year | string | 否 | 否 | 年 示例：2024 |
| dimParams | object | 是 | 否 | 参数维维度对应维度编码 |
| syscode | string | 否 | 是 | 系统编码,计划预算：BP 示例:BP 示例：BP |

## 3. 请求示例

Url: /yonbip/qyjx/bp/file/downApiForms?access_token=访问令牌
Body: {
	"exportFileType": "pbf",
	"sheetExpInfo": [
		{
			"sheetPk": "2080064876437307396",
			"sheetCode": "",
			"taskId": "",
			"year": "2024",
			"dimParams": [
				{}
			]
		}
	],
	"syscode": "BP"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | number |
| 小数位数:0,最大长度:10 | 否 | code 示例：200 |
| data | string | 否 | data 示例：2094746646611492873 |
| success | boolean | 否 | success 示例：true |

## 5. 正确返回示例

{
	"code": 200,
	"data": "2094746646611492873",
	"success": true
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

