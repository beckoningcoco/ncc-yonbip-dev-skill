---
title: "查询签署回调事件数据"
apiId: "1815674188804915209"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "E-signature Configuration"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, E-signature Configuration]
platform_version: "BIP"
source_type: community-api-docs
---

# 查询签署回调事件数据

> `ContentType	application/json` 请求方式	POST | 分类: E-signature Configuration (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/uspace/rest/v1/signFlow/eventData/queryOne

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
| flowId | string | 否 | 是 | 签署流程/任务ID 示例：1803333333333334770 |

## 3. 请求示例

Url: /yonbip/uspace/rest/v1/signFlow/eventData/queryOne?access_token=访问令牌
Body: {
	"flowId": "1803333333333334770"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 是 | 返回数据 |
| event | string | 否 | 签署事件类型 SIGN_FLOW_UPDATE:签署过程更新 SIGN_FLOW_COMPLETE:签署完成 示例：SIGN_FLOW_UPDATE |
| bizId | string | 否 | 业务ID 示例：123 |
| flowId | string | 否 | 签署流程ID 示例：1806666666666664770 |
| status | string | 否 | 签署状态 1 签署完成 2 签署链接过期 3 拒绝签署 4 静默签署失败 示例：1 |
| signTime | string | 否 | 签署时间 示例：2024-02-01 00:00:00 |
| createTime | string | 否 | 合同创建时间 示例：2024-02-01 00:00:00 |
| endTime | string | 否 | 签署完成时间 示例：2024-02-01 00:00:00 |
| tenantId | string | 否 | 租户ID 发起签署时传递有值 示例：qyxxxxx |
| accountInfo | object | 否 | 签署人信息 |
| finishDocUrls | object | 是 | 签署完成合同文档信息 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"event": "SIGN_FLOW_UPDATE",
			"bizId": "123",
			"flowId": "1806666666666664770",
			"status": "1",
			"signTime": "2024-02-01 00:00:00",
			"createTime": "2024-02-01 00:00:00",
			"endTime": "2024-02-01 00:00:00",
			"tenantId": "qyxxxxx",
			"accountInfo": {
				"accountId": "ed4a02a5-****-****-9854-eea0b9b11575",
				"accountUniqueId": "ed4a02a5-****-****-9854-eea0b9b11575",
				"companyId": "1800000000000004770",
				"companyUniqueId": "1800000000000004770",
				"companyAuthId": "1800000000000004770",
				"authId": "12132312",
				"name": "第五**",
				"signUrl": "https://temp.com/sign"
			},
			"finishDocUrls": [
				{
					"docId": "1801111111111114770",
					"docFileKey": "1801111111111114770",
					"signFileKey": "1801111111111114770",
					"downloadUrl": "https://temp.com/download"
				}
			]
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

500	接口调用错误	接口调用错误


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

