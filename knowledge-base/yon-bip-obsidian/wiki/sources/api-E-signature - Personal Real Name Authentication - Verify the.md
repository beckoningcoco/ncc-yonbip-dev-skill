---
title: "电子签-个人实名认证-对加签的数字签名进行校验"
apiId: "1853652626081054721"
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

# 电子签-个人实名认证-对加签的数字签名进行校验

> `ContentType	application/json` 请求方式	POST | 分类: E-signature Configuration (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/rest/signature/verify

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
| oriData | string | 否 | 是 | 待签名原文，base64编码后的数据 示例：MTIzNDU= |
| signData | string | 否 | 是 | 加签后的签名数据 示例：OGE2NmFmMzAzYWM4NDAwOWE0NWIwMTVlZGE0NGQ5MmGkCaLQvMtDWNRwGhoxjraxg8uEmYE68YpGoSPnFKCywGrCMLNqAIhXi5LBtU5h8FUm9imSS5CpcT82f9NA0Iz/tuZmr2/4Dz9BYbsdxMopawcHLCx3rz3STS8M2uLt22wFgVxerx95V7+0Jg+7FZwVW9NsvyFg5FM32G7qShfjzq5zhnvaj7ppjFFRwTAGJe0lN7TuUTo9eHPbmQD55Q5 |

## 3. 请求示例

Url: /yonbip/digitalModel/rest/signature/verify?access_token=访问令牌
Body: {
	"oriData": "MTIzNDU=",
	"signData": "OGE2NmFmMzAzYWM4NDAwOWE0NWIwMTVlZGE0NGQ5MmGkCaLQvMtDWNRwGhoxjraxg8uEmYE68YpGoSPnFKCywGrCMLNqAIhXi5LBtU5h8FUm9imSS5CpcT82f9NA0Iz/tuZmr2/4Dz9BYbsdxMopawcHLCx3rz3STS8M2uLt22wFgVxerx95V7+0Jg+7FZwVW9NsvyFg5FM32G7qShfjzq5zhnvaj7ppjFFRwTAGJe0lN7TuUTo9eHPbmQD55Q5"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | int | 否 | 返回编码 示例：0 |
| msg | string | 否 | 返回信息 示例：success |
| data | object | 否 | 返回数据 |
| certInfo | object | 否 | 签署事件，非签名数据不返回该字段 |
| signDate | string | 否 | 加签时间，非签名数据不返回该字段 示例：2022-08-22 11:25:48 |
| verify | boolean | 否 | 验证是否通过true是false否 示例：true |

## 5. 正确返回示例

{
	"code": 0,
	"msg": "success",
	"data": {
		"certInfo": {
			"sn": "69F6000000000224DB39826F",
			"cn": "C=CN,OU=DJ9001,CN=用友网络科技股份有限公司",
			"beforeDate": "2022-05-16 00:00:00",
			"endDate": "2023-05-16 23:59:59"
		},
		"signDate": "2022-08-22 11:25:48",
		"verify": true
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

-1	验签失败	验签失败

1000	调用第三方验签发生错误	调用第三方验签发生错误


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

