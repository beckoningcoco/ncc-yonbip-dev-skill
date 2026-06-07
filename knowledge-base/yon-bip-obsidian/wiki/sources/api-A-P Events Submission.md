---
title: "应付事项提交"
apiId: "0f39ca2298f04072906b93edb4bc6cc5"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "A/P Events"
domain: "FI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, A/P Events]
platform_version: "BIP"
source_type: community-api-docs
---

# 应付事项提交

> `ContentType	application/json` 请求方式	POST | 分类: A/P Events (FI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/fi/oap/batchsubmit

请求方式	POST

ContentType	application/json

应用场景	开放API

API类别	详情查询

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 是 | 是 | 业务数据 |
| id | long | 否 | 是 | 单据id 示例：2292711581880832 |

## 3. 请求示例

Url: /yonbip/fi/oap/batchsubmit?access_token=访问令牌
Body: {
	"data": [
		{
			"id": 2292711581880832
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 返回码，调用成功时返回200 示例：200 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| message | string | 否 | 调用状态信息 示例：操作成功 |
| data | object | 否 | 调用成功时的返回数据 |
| successCountAI | long | 否 | 提交成功数 示例：1 |
| failCountAI | long | 否 | 提交失败数 示例：0 |
| count | long | 否 | 总数 示例：1 |
| sucessCount | long | 否 | 提交成功数 示例：1 |
| failCount | long | 否 | 提交失败数 示例：0 |
| messages | string | 是 | 调用失败时的错误信息 |
| infos | object | 是 | 单据信息 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"successCountAI": 1,
		"failCountAI": 0,
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			""
		],
		"infos": [
			{
				"isWfControlled": true,
				"id": 2292711581880832,
				"verifystate": 1,
				"code": "OAPar210608000001",
				"billdirection": 2,
				"provisionalestimateflag": false,
				"creatorId": 2146872030253312,
				"exchRate": 1,
				"caobject": 2,
				"accentity": "2146873584521728",
				"vouchdate": "2021-06-08 00:00:00",
				"basebilltypecode": "arap_oap",
				"occupyamount": 0,
				"natCurrency": "2146685774992640",
				"billtype": 8,
				"balance": 100,
				"supplier": 2146895352500480,
				"lossearnflag": false,
				"currency": "2146685774992640",
				"pubts": "2021-06-08 15:38:26",
				"tenant": 2146685620752640,
				"createDate": "2021-06-08 00:00:00",
				"busiaccbook": 2146874084692480,
				"period": 2146685777908225,
				"auditstatus": 2,
				"creator": "陈执行",
				"oriSum": 100,
				"localbalance": 100,
				"maturitydate": "2021-06-08 00:00:00",
				"basebilltype": "HSFWYFGLYY1",
				"natSum": 100,
				"redflag": false,
				"srcitem": 6,
				"voucherstatus": 2,
				"exchangeRateType": "z41bro2w",
				"tradetype": "2146685777465610",
				"writeoffstatus": 2,
				"initflag": false,
				"createTime": "2021-06-08 15:06:50",
				"accountdate": "2021-06-08 00:00:00",
				"totalpayamount": 0,
				"oriMoney": 100,
				"bzhandletype": 1,
				"natMoney": 100,
				"status": 3
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

200	不支持审批流	输入有意义的单据id


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-06-25

更新

请求说明


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

