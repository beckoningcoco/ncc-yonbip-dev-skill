---
title: "电子签hub变更签署人"
apiId: "2275317053241950215"
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

# 电子签hub变更签署人

> `ContentType	application/json` 请求方式	POST | 分类: E-signature Configuration (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/id/signFlow/v1/changeSigner

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
| signFlowId | string | 否 | 是 | 签署流程id 示例：37fe7c2f8a674c13b0a85cc4c68f400f |
| signerId | string | 否 | 否 | 签署节点ID 示例：SSDSEWE |
| newSignerAccountId | string | 否 | 否 | 新签署人电子签用户accountId 示例：22fd9bb100f943c8aab8aba8190f326b |

## 3. 请求示例

Url: /yonbip/id/signFlow/v1/changeSigner?access_token=访问令牌
Body: {
	"signFlowId": "37fe7c2f8a674c13b0a85cc4c68f400f",
	"signerId": "SSDSEWE",
	"newSignerAccountId": "22fd9bb100f943c8aab8aba8190f326b"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 响应码 示例：200 |
| message | string | 否 | 响应信息 示例：success |
| data | object | 否 | 响应数据 |
| signerId | string | 否 | 签署节点ID 示例：SSDSEWE |
| newSignerAccountId | string | 否 | 新签署人accountId 示例：22fd9bb100f943c8aab8aba8190f326b |
| newSignerName | string | 否 | 新签署人姓名 示例：李四 |
| oldSignerAccountId | string | 否 | 原签署人accountId 示例：86af143248e444f3aac4a63aa6e28e3f |
| oldSignerName | string | 否 | 原签署人姓名 示例：张三 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "success",
	"data": {
		"signerId": "SSDSEWE",
		"newSignerAccountId": "22fd9bb100f943c8aab8aba8190f326b",
		"newSignerName": "李四",
		"oldSignerAccountId": "86af143248e444f3aac4a63aa6e28e3f",
		"oldSignerName": "张三"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-08-15

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

