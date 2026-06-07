---
title: "研发项目预算新增"
apiId: "1904927655059783689"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Tax Related Data Management"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Tax Related Data Management]
platform_version: "BIP"
source_type: community-api-docs
---

# 研发项目预算新增

> `ContentType	application/json` 请求方式	POST | 分类: Tax Related Data Management (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/yonbip-fi-taxgateway/yonbip-fi-taxspec/api/tax-rd-budget/save

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
| orgCode | string | 否 | 是 | 组织编码 示例：101 |
| projectCode | string | 否 | 是 | 项目编码 示例：101 |
| year | string | 否 | 是 | 预算年份，格式：YYYY 示例：2023 |
| accumulatedRate | number |
| 小数位数:2,最大长度:13 | 否 | 否 | 累计执行率 示例：1.11 |
| accumulatedNumber | number |
| 小数位数:2,最大长度:13 | 否 | 否 | 累计执行数 示例：1.11 |
| yearAmount | number |
| 小数位数:2,最大长度:13 | 否 | 是 | 年预算金额 示例：1 |
| sourceId | string | 否 | 是 | 来源id 示例：101 |
| monthBudgets | object | 是 | 是 | 月度预算明细 |
| month | string | 否 | 是 | 预算月份，需要填写1-12  ，格式MM 示例：11 |
| monthAmount | number |
| 小数位数:2,最大长度:13 | 否 | 是 | 月预算金额 示例：1 |
| realityNumber | number |
| 小数位数:2,最大长度:13 | 否 | 否 | 实际执行数 示例：1.11 |
| realityRate | number |
| 小数位数:2,最大长度:13 | 否 | 否 | 实际执行率 示例：1.11 |

## 3. 请求示例

Url: /yonbip/tax/yonbip-fi-taxgateway/yonbip-fi-taxspec/api/tax-rd-budget/save?access_token=访问令牌
Body: [{
	"orgCode": "101",
	"projectCode": "101",
	"year": "2023",
	"accumulatedRate": 1.11,
	"accumulatedNumber": 1.11,
	"yearAmount": 1,
	"sourceId": "101",
	"monthBudgets": [
		{
			"month": "11",
			"monthAmount": 1,
			"realityNumber": 1.11,
			"realityRate": 1.11
		}
	]
}]

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 描述信息 示例：操作成功 |
| data | object | 是 | 返回对象 示例：[{"sourceId":"111","id":"111"}] |
| sourceId | string | 否 | 来源ID 示例：111 |
| id | string | 否 | 数据ID 示例：111 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"sourceId": "111",
			"id": "111"
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

9999	系统异常	根据具体返回信息调整参数

1001	参数异常	根据具体返回信息调整参数


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

