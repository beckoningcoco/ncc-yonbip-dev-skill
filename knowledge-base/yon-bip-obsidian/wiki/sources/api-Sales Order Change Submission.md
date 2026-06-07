---
title: "销售订单变更提交"
apiId: "2366470802020761600"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "SO Change"
domain: "SCMSD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, SO Change]
platform_version: "BIP"
source_type: community-api-docs
---

# 销售订单变更提交

> `ContentType	application/json` 请求方式	POST | 分类: SO Change (SCMSD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/SCC/voucherorderchange/batchsubmit

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
| data | object | 是 | 是 | 销售订单变更[voucher.orderchange.OrderChange] |
| id | number |
| 小数位数:0,最大长度:28 | 否 | 否 | 变更单id。id、code和originalOrderId三者不能同时为空，同时存在时，按照id>code>originalOrderId的优先级取值。 示例：666999888777 |
| code | string | 否 | 否 | 单据编号。id、code和originalOrderId三者不能同时为空，同时存在时，按照id>code>originalOrderId的优先级取值。 |
| originalOrderId | string | 否 | 否 | 原订单id。id、code和originalOrderId三者不能同时为空，同时存在时，按照id>code>originalOrderId的优先级取值。 |

## 3. 请求示例

Url: /yonbip/SCC/voucherorderchange/batchsubmit?access_token=访问令牌
Body: {
	"data": [
		{
			"id": 666999888777,
			"code": "",
			"originalOrderId": ""
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用信息 示例：操作成功 |
| salesOrgId | string | 否 | 销售组织id |
| saleDepartmentId | string | 否 | 销售部门id |
| transactionTypeId | string | 否 | 交易类型id |
| settlementOrgId | string | 否 | 开票组织id |
| bizId | string | 否 | 商家id |
| createDate | string | 否 | 创建时间 |
| synSourceOrg | string | 否 | 协同来源组织id |
| ecsuiteuser | string | 否 | 气泡联系人 |
| data | object | 否 | 调用的返回数据 |
| ecsuiteuser | string | 否 | 气泡联系人 |
| count | number |
| 小数位数:0,最大长度:28 | 否 | 返回数据总数 示例：1 |
| sucessCount | number |
| 小数位数:0,最大长度:28 | 否 | 返回成功数 示例：1 |
| failCount | number |
| 小数位数:0,最大长度:28 | 否 | 返回失败数 示例：0 |
| messages | string | 是 | 返回信息 |
| infos | object | 是 | 单据信息 |
| failInfos | string | 是 | 失败单据信息 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			""
		],
		"infos": [
			{
				"id": 2479299821097216,
				"code": "UO-164820211018000003",
				"originalOrderId": 0,
				"agentId": 2352188003832064,
				"salesOrgId": "2352090091131648",
				"transactionTypeId": "2350786624983808",
				"isWfControlled": true,
				"bizFlow": "2d54b723-e941-11eb-a68a-0624d60000dc",
				"verifystate": 1,
				"status": 3,
				"nextStatus": "APPROVING",
				"nextStatusName": "审批中",
				"pubts": "2021-11-10 18:30:22"
			}
		],
		"failInfos": [
			""
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	根据入参未查询到单据，请检查！	根据入参未查询到单据，请检查！


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

