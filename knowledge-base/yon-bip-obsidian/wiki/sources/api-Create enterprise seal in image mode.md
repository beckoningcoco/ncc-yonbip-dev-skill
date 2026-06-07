---
title: "图片模式创建企业印章"
apiId: "1814313551747088390"
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

# 图片模式创建企业印章

> `ContentType	application/json` 请求方式	POST | 分类: E-signature Configuration (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/uspace/rest/v1/seal/image/company/create

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
| companyAppAuthId | string | 否 | 是 | 企业应用授权ID 示例：1800000000000004770 |
| sealName | string | 否 | 是 | 印章名称 示例：企业公章1 |
| sealType | string | 否 | 是 | 印章类型 1.公章 4: 法人章 示例：1 |
| imageData | string | 否 | 是 | 印章图片文件Base64字符串 示例：iVBOxxxxxxxxxxxxxAAVKS |
| isDefault | boolean | 否 | 否 | 是否默认印章 示例：false 默认值：false |

## 3. 请求示例

Url: /yonbip/uspace/rest/v1/seal/image/company/create?access_token=访问令牌
Body: {
	"companyAppAuthId": "1800000000000004770",
	"sealName": "企业公章1",
	"sealType": "1",
	"imageData": "iVBOxxxxxxxxxxxxxAAVKS",
	"isDefault": false
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| sealId | string | 否 | 印章ID 示例：1806666666666664770 |
| sealName | string | 否 | 印章名称 示例：印章1 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"sealId": "1806666666666664770",
		"sealName": "印章1"
	}
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

