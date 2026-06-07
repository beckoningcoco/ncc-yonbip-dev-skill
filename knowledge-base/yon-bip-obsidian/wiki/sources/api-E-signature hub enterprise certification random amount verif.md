---
title: "电子签hub企业认证随机金额校验（联动模式）"
apiId: "2275262008941084680"
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

# 电子签hub企业认证随机金额校验（联动模式）

> `ContentType	application/json` 请求方式	POST | 分类: E-signature Configuration (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/id/identity/publicMoney/v1/verify

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
| flowId | string | 否 | 是 | 实名认证流程ID，企业对公打款接口返回数据 示例：b9cf581b7412968da4efe4d96177418f |
| amount | string | 否 | 是 | 金额，该值为实际收到金额 *100后的值 例如用户收到金额为 0.34 则该值为34 示例：34 |

## 3. 请求示例

Url: /yonbip/id/identity/publicMoney/v1/verify?access_token=访问令牌
Body: {
	"flowId": "b9cf581b7412968da4efe4d96177418f",
	"amount": "34"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 响应码 示例：200 |
| message | string | 否 | 响应信息 示例：success |
| data | object | 否 | 响应数据 |
| flowId | string | 否 | 认证流水ID 示例：b9cf581b7412968da4efe4d96177418f |

## 5. 正确返回示例

{
	"code": "200",
	"message": "success",
	"data": {
		"flowId": "b9cf581b7412968da4efe4d96177418f"
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

