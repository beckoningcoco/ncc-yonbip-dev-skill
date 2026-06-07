---
title: "供应链费用单审核"
apiId: "1459468945650614272"
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

# 供应链费用单审核

> `ContentType	application/json` 请求方式	POST | 分类: Supply Chain Expense Document (SCCS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/sd/scmmp/expense/batchaudit

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
| id | long | 否 | 是 | 费用单id 示例：1458252550809059334 |

## 3. 请求示例

Url: /yonbip/sd/scmmp/expense/batchaudit?access_token=访问令牌
Body: {
	"data": [
		{
			"id": 1458252550809059334
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
| displayCode | string | 否 | 异常码 示例：010-006-000136 |
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
	"displayCode": "010-006-000136",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			""
		],
		"infos": [
			{
				"verifystate": 2,
				"code": "FYD20220517000003",
				"modifier": "wanghao",
				"creatorId": 2510689921126656,
				"modifierId": 2510689921126656,
				"exchRate": 1,
				"orgId": "2401805309253120",
				"settlementOrg": "2352269171479296",
				"vouchdate": "2022-05-17 00:00:00",
				"modifyTime": "2022-06-17 00:00:00",
				"natCurrency": "2351874939032064",
				"exchRateDate": "2022-05-17 00:00:00",
				"currency": "2351874939032064",
				"id": 1456618289956388900,
				"pubts": "2022-05-23 16:31:16",
				"isFlowCoreBill": false,
				"tenant": 2351873187860736,
				"createDate": "2022-05-17 00:00:00",
				"auditDate": "2022-05-23 00:00:00",
				"sourceid": 1456617551247179800,
				"creator": "wangwenfeng",
				"modifyDate": "2022-07-15 00:00:00",
				"oriSum": 4,
				"isWfControlled": false,
				"ytenant": "0000KRBF48WG59AUYJ0000",
				"auditor": "YonSuite默认用户",
				"natSum": 4,
				"auditorId": 2351873188811008,
				"sourceType": "voucher_order",
				"createTime": "2022-05-17 15:31:35",
				"auditTime": "2022-05-23 16:31:16",
				"exchRateType": "0000KRBF48WG59AUYJ0000",
				"upcode": "UO-312020220517000003",
				"invoicingAgentId": 2434524464353536,
				"natMoney": 98.04,
				"status": 1
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

1	2025-06-23

新增

返回参数 displayCode

增加displayCode


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

