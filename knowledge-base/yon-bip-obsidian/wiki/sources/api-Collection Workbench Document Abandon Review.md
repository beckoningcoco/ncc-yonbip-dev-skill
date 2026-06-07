---
title: "收款工作台单据弃审"
apiId: "1526340246552182784"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Collection Workbench"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Collection Workbench]
platform_version: "BIP"
source_type: community-api-docs
---

# 收款工作台单据弃审

> `ContentType	application/json` 请求方式	POST | 分类: Collection Workbench (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/receivebill/batchunaudit

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
| data | object | 是 | 是 | 业务数据 |
| id | long | 否 | 是 | 单据id 示例：1930625070685696 |

## 3. 请求示例

Url: /yonbip/ctm/receivebill/batchunaudit?access_token=访问令牌
Body: {
	"data": [
		{
			"id": 1930625070685696
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
| code | long | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用失败时的错误信息 示例：操作成功 |
| data | object | 否 | 调用成功时的返回数据 |
| count | int | 否 | 数量 示例：1 |
| sucessCount | int | 否 | 成功数量 示例：1 |
| failCount | int | 否 | 失败数量 示例：0 |
| messages | string | 是 | 返回信息集合 |
| infos | object | 是 | 数据集合 |
| failInfos | object | 是 | 返回错误信息 |

## 5. 正确返回示例

{
	"code": 200,
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
				"id": 2356110846218752,
				"auditstatus": 2,
				"verifystate": 0,
				"status": 0,
				"pubts": "2021-07-26 12:24:56"
			}
		],
		"failInfos": [
			{
				"id": 2356110846218752,
				"message": "未审批，不能进行取消审批！"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	服务逻辑异常	请检查传入数据的正确性


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

