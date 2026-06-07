---
title: "维度成员表达式解析"
apiId: "2331737401471795208"
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

# 维度成员表达式解析

> `ContentType	application/json` 请求方式	POST | 分类: Planning, Budgeting& Forecasting (EPM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/FCC/bp/dimExpression/parseDimMembers

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
| dimCode | string | 否 | 否 | 维度编码 示例：PERIOD |
| dimHierCode | string | 否 | 否 | 体系编码 示例：YQM |
| contextDims | object | 否 | 否 | 上下文维度成员 |
| YEARS | string | 否 | 否 | YEARS 示例：2023 |
| expressions | string | 是 | 否 | 成员表达式 示例：["#RULE#Nplus3@12"] |

## 3. 请求示例

Url: /yonbip/FCC/bp/dimExpression/parseDimMembers?access_token=访问令牌
Body: {
	"dimCode": "PERIOD",
	"dimHierCode": "YQM",
	"contextDims": {
		"YEARS": "2023"
	},
	"expressions": [
		"#RULE#Nplus3@12"
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | number |
| 小数位数:0,最大长度:10 | 否 | code 示例：200 |
| data | object | 否 | data |
| dimCode | string | 否 | 维度编码 示例：PERIOD |
| dimName | string | 否 | 维度名称 示例：期间 |
| dimHierCode | string | 否 | 体系编码 示例：YQM |
| dimHierName | string | 否 | 体系名称 示例：年期间（季度月） |
| dimMembers | object | 是 | 维度成员 |
| success | boolean | 否 | success 示例：true |

## 5. 正确返回示例

{
	"code": 200,
	"data": {
		"dimCode": "PERIOD",
		"dimName": "期间",
		"dimHierCode": "YQM",
		"dimHierName": "年期间（季度月）",
		"dimMembers": [
			{
				"memberCode": "3",
				"memberName": "3月",
				"pk": "YEARS2024-PERIOD3",
				"parentPK": "YEARS2024-PERIODQ1",
				"parentMemberCode": "Q1"
			}
		]
	},
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

