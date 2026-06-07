---
title: "入库通知单删除"
apiId: "2cef81027539474fa82da8e8c9439ae5"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Receipt Notice"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Receipt Notice]
platform_version: "BIP"
source_type: community-api-docs
---

# 入库通知单删除

> `ContentType	application/json` 请求方式	POST | 分类: Receipt Notice (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/sd/stock/storenotice/delete

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
| data | object | 是 | 是 | 表头参数 |
| _status | string | 否 | 是 | 数据状态（Delete） 示例：Delete |
| srcBill | string | 否 | 是 | 入库通知单来源单据ID 示例：680448073273600 |
| id__pk | string | 否 | 是 | 来源单据主键 示例：680448073273600 |
| srcBillRow | string | 否 | 否 | 入库通知单来源单据行ID 示例：680448073273601 |
| key | string | 否 | 是 | 主键字段 示例：id__pk |

## 3. 请求示例

Url: /yonbip/sd/stock/storenotice/delete?access_token=访问令牌
Body: {
	"data": [
		{
			"_status": "Delete",
			"srcBill": "680448073273600",
			"id__pk": "680448073273600",
			"srcBillRow": "680448073273601"
		}
	],
	"key": "id__pk"
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
| code | string | 否 | 请求返回编码 示例：200 |
| message | string | 否 | 请求返回提示信息 示例：操作成功 |
| data | object | 否 | 请求返回数据集 |
| count | long | 否 | 返回总数 示例：1 |
| sucessCount | long | 否 | 返回成功总数 示例：1 |
| failCount | long | 否 | 返回失败总数 示例：0 |
| messages | string | 是 | 提示信息 |
| infos | string | 是 | 请求提示信息 |
| failInfos | string | 是 | 请求失败提示信息 |

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
			""
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

200	来源单据ID为680448073273600的入库通知单不存在！	确认要删除的单子是否存在


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

