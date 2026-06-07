---
title: "调拨申请删除"
apiId: "ad2c184937e74c6ea2a91e8d6db2d377"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Transfer Application"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Transfer Application]
platform_version: "BIP"
source_type: community-api-docs
---

# 调拨申请删除

> `ContentType	application/json` 请求方式	POST | 分类: Transfer Application (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/transferreq/batchdelete

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
| data | object | 是 | 是 | 请求体数据集合 |
| id | long | 否 | 是 | 主表id 示例：2175253964346368 |

## 3. 请求示例

Url: /yonbip/scm/transferreq/batchdelete?access_token=访问令牌
Body: {
	"data": [
		{
			"id": 2175253964346368
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
| code | long | 否 | 返回编码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 返回数据包 |
| count | long | 否 | 次数 示例：1 |
| sucessCount | long | 否 | 成功次数 示例：0 |
| failCount | long | 否 | 失败次数 示例：1 |
| messages | string | 是 | 返回信息 |
| infos | string | 是 | 信息 |
| failInfos | object | 否 | 失败原因 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"count": 1,
		"sucessCount": 0,
		"failCount": 1,
		"messages": [
			""
		],
		"infos": [
			""
		],
		"failInfos": {
			"id": 2175253964346368,
			"messages": "未查询到原单信息，请检查"
		}
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

"failCountAI": 1	"未查询到原单信息，请检查"	该单据已被删除或不存在！


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

