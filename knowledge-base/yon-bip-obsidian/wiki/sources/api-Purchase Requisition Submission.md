---
title: "请购单提交"
apiId: "324a3688535943d3a0aa5881dbcb299d"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Purchase Requisition"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Purchase Requisition]
platform_version: "BIP"
source_type: community-api-docs
---

# 请购单提交

> `ContentType	application/json` 请求方式	POST | 分类: Purchase Requisition (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/api/upu/batchsubmit

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
| data | object | 是 | 是 | 请求体 |
| id | long | 否 | 是 | 请购单主表id 示例：2282796996055296 |

## 3. 请求示例

Url: /yonbip/scm/api/upu/batchsubmit?access_token=访问令牌
Body: {
	"data": [
		{
			"id": 2282796996055296
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
| code | string | 否 | 返回编码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| successCountAI | long | 否 | 成功 示例：1 |
| failCountAI | long | 否 | 失败 示例：0 |
| count | long | 否 | 数量 示例：1 |
| sucessCount | long | 否 | 成功数 示例：1 |
| failCount | long | 否 | 失败数 示例：0 |
| messages | string | 是 | 返回信息 示例：["操作成功"] |
| infos | object | 是 | 信息 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"successCountAI": 1,
		"failCountAI": 0,
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			"操作成功"
		],
		"infos": [
			{
				"storeDocumentStatus": 0,
				"verifystate": 1,
				"creator": "19904568888",
				"code": "QG210603000010",
				"org": "2223363336933632",
				"isWfControlled": true,
				"creatorId": 2219040599511296,
				"bustype": "2219042288652546",
				"vouchdate": "2021-06-03 00:00:00",
				"totalQuantity": 42,
				"createTime": "2021-06-03 14:39:22",
				"bizstatus": "0",
				"currency": "2219042358972928",
				"id": 2285606703305472,
				"pubts": "2021-06-04 10:54:52",
				"isUretailVoucher": false,
				"tenant": 2219040597283072,
				"status": 3,
				"createDate": "2021-06-03 00:00:00"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	当前单据不是最新状态，请刷新重试。

999	服务端逻辑异常


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

