---
title: "查询印章详情"
apiId: "1814324916230553604"
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

# 查询印章详情

> `ContentType	application/json` 请求方式	POST | 分类: E-signature Configuration (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/uspace/rest/v1/seal/details

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
| sealId | string | 否 | 是 | 印章ID 示例：1801111111111114770 |

## 3. 请求示例

Url: /yonbip/uspace/rest/v1/seal/details?access_token=访问令牌
Body: {
	"sealId": "1801111111111114770"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| sealId | string | 否 | 印章ID 示例：1806666666666664770 |
| sealName | string | 否 | 印章名称 示例：印章1 |
| sealType | string | 否 | 印章类型 1 公章 2 个人章 5 法人章 示例：2 |
| sealImage | string | 否 | 印章预览图片 示例：iVBOxxxxxxxxxxxxxAAVKS |
| isDefault | boolean | 否 | 是否默认 示例：false |
| createTime | string | 否 | 创建时间 示例：2024-02-01 00:00:00 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"sealId": "1806666666666664770",
		"sealName": "印章1",
		"sealType": "2",
		"sealImage": "iVBOxxxxxxxxxxxxxAAVKS",
		"isDefault": false,
		"createTime": "2024-02-01 00:00:00"
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

