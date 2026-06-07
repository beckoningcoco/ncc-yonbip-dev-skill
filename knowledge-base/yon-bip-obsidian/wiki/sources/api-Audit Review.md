---
title: "调出审核"
apiId: "e75fc452b9c348a69824918faaaab97e"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Transfer-out Document"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Transfer-out Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 调出审核

> `ContentType	application/json` 请求方式	POST | 分类: Transfer-out Document (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/storeout/batchaudit

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
| id | long | 否 | 是 | 主表id 示例：2292630096614144 |

## 3. 请求示例

Url: /yonbip/scm/storeout/batchaudit?access_token=访问令牌
Body: {
	"data": [
		{
			"id": 2292630096614144
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
| message | string | 否 | 返回信息描述 示例：操作成功 |
| data | object | 否 | 返回数据 |
| count | long | 否 | 总条数 示例：1 |
| sucessCount | long | 否 | 成功条数 示例：1 |
| failCount | long | 否 | 失败条数 示例：0 |
| messages | string | 是 | 错误数据信息 |
| infos | object | 是 | 成功数据信息 |
| failInfos | object | 是 | 失败信息 |

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
				"id": 2292630096614144,
				"verifystate": 2,
				"auditor": "YonSuite默认用户",
				"auditorId": 1849710350995712,
				"auditTime": "2021-06-08 13:54:51",
				"auditDate": "2021-06-08 00:00:00",
				"status": 1,
				"pubts": "2021-06-08 13:54:51"
			}
		],
		"failInfos": [
			{
				"id": 2292630096614144,
				"message": "未找到id为 124 的单据，请重新确认"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	服务端逻辑异常	根据提示检查，再操作即可


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

