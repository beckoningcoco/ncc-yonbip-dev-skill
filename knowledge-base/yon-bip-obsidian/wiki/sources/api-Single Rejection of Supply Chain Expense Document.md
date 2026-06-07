---
title: "供应链费用单单个弃审"
apiId: "1466104429604765696"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Supply Chain Expense Document"
domain: "SCCS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Supply Chain Expense Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 供应链费用单单个弃审

> `ContentType	application/json` 请求方式	POST | 分类: Supply Chain Expense Document (SCCS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/sd/scmmp/expense/batchunaudit

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
| data | object | 是 | 是 | 请求数据 |
| id | long | 否 | 是 | 费用单id 示例：1458253652809059334 |

## 3. 请求示例

Url: /yonbip/sd/scmmp/expense/batchunaudit?access_token=访问令牌
Body: {
	"data": [
		{
			"id": 1458253652809059334
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
| message | string | 否 | 调用成功时返回的信息 示例：操作成功 |
| salesOrgId | string | 否 | 销售组织id |
| saleDepartmentId | string | 否 | 销售部门id |
| transactionTypeId | string | 否 | 交易类型id |
| settlementOrgId | string | 否 | 开票组织id |
| bizId | string | 否 | 商家id |
| createDate | string | 否 | 创建时间 |
| synSourceOrg | string | 否 | 协同来源组织id |
| ecsuiteuser | string | 否 | 气泡联系人 |
| ecsuiteuser | string | 否 | 气泡联系人 |
| data | object | 否 | 调用成功时的返回数据 |
| count | int | 否 | 返回数据总数 示例：1 |
| sucessCount | int | 否 | 返回成功数 示例：1 |
| failCount | int | 否 | 返回失败数 示例：0 |
| messages | string | 是 | 返回信息 |
| infos | object | 是 | 返回成功数据 |
| failInfos | object | 是 | 返回失败数据 |

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
				"verifystate": 0,
				"code": "FYD20220527000008",
				"modifier": "wanghao",
				"creatorId": 1437883445064237000,
				"modifierId": 2510689921126656,
				"exchRate": 1,
				"orgId": "2353226125496576",
				"settlementOrg": "2353226125496576",
				"vouchdate": "2022-05-27 00:00:00",
				"modifyTime": "2022-06-27 00:00:00",
				"exchRateDate": "2022-07-24 00:00:00",
				"natCurrency": "2351874939032064",
				"currency": "2351874939032064",
				"id": 1464036566121316400,
				"pubts": "2022-05-30 10:39:16",
				"isFlowCoreBill": false,
				"tenant": 2351873187860736,
				"createDate": "2022-05-27 00:00:00",
				"sourceid": 1464036205319946200,
				"creator": "zhaozitong",
				"modifyDate": "2022-07-15 00:00:00",
				"oriSum": 200,
				"isWfControlled": false,
				"ytenant": "0000KRBF48WG59AUYJ0000",
				"natSum": 200,
				"sourceType": "voucher_order",
				"createTime": "2022-05-27 15:24:48",
				"exchRateType": "0000KRBF48WG59AUYJ0000",
				"upcode": "BJD20220527000003",
				"invoicingAgentId": 2520655774487040,
				"natMoney": 98.04,
				"status": 0
			}
		],
		"failInfos": [
			{}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	服务端逻辑异常	检查传入数据的正确性


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

