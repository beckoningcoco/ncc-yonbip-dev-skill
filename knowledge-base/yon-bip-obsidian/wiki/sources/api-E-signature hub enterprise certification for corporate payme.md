---
title: "电子签hub企业认证对公打款（联动模式）"
apiId: "2275260952379129863"
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

# 电子签hub企业认证对公打款（联动模式）

> `ContentType	application/json` 请求方式	POST | 分类: E-signature Configuration (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/id/identity/publicMoney/v1/send

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
| flowId | string | 否 | 是 | 实名认证流程ID，企业三要素接口返回数据 示例：44532df36f8f430dfa3b8618ba10b3e1 |
| accountNumber | string | 否 | 是 | 待认证电子签企业对公账号 示例：273623829763 |
| depositBank | string | 否 | 是 | 企业对公账号开户行 银联号或者支行全称 示例：招商银行中关村支行 |
| accountProv | string | 否 | 是 | 企业对公账户开户行所在省 示例：吉林省 |
| accountCity | string | 否 | 是 | 企业对公账户开户行开户行所在市 示例：吉林市 |

## 3. 请求示例

Url: /yonbip/id/identity/publicMoney/v1/send?access_token=访问令牌
Body: {
	"flowId": "44532df36f8f430dfa3b8618ba10b3e1",
	"accountNumber": "273623829763",
	"depositBank": "招商银行中关村支行",
	"accountProv": "吉林省",
	"accountCity": "吉林市"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 响应码 示例：200 |
| message | string | 否 | 响应信息 示例：success |
| data | object | 否 | 响应数据 |
| verifyId | string | 否 | 对公打款验证流水号 示例：b9cf581b7412968da4efe4d96177418f |

## 5. 正确返回示例

{
	"code": "200",
	"message": "success",
	"data": {
		"verifyId": "b9cf581b7412968da4efe4d96177418f"
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

