---
title: "盘点差异单删除"
apiId: "94a656c947794c1588873f5b9cee7620"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Inventory Variance Document"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Inventory Variance Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 盘点差异单删除

> `ContentType	application/json` 请求方式	POST | 分类: Inventory Variance Document (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/storecheckdifference/batchdelete

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
| data | object | 是 | 是 | data |
| id | long | 否 | 是 | 主表id 示例：2172161512886528 |

## 3. 请求示例

Url: /yonbip/scm/storecheckdifference/batchdelete?access_token=访问令牌
Body: {
	"data": [
		{
			"id": 2172161512886528
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
| code | long | 否 | 状态码 示例：200 |
| message | object | 否 | 返回信息 |
| data | object | 否 | 返回数据包 |
| count | long | 否 | 总数 示例：1 |
| sucessCount | long | 否 | 成功数 示例：0 |
| failCount | long | 否 | 失败数 示例：1 |
| messages | object | 是 | 返回信息 |
| infos | object | 是 | 成功信息 |
| failInfos | object | 是 | 失败信息 |

## 5. 正确返回示例

{
	"code": 200,
	"message": {},
	"data": {
		"count": 1,
		"sucessCount": 0,
		"failCount": 1,
		"messages": [
			{}
		],
		"infos": [
			{}
		],
		"failInfos": [
			{
				"code": "PDCYD20220513000001",
				"id": 1453670739798392834,
				"message": "已参与审批流程的单据不允许删除"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

200	批量操作通常不存在错误码，如果删除失败，请参照messages的提示处理	参照返回messages的提示处理


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

