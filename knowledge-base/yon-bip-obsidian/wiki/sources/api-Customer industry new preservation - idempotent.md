---
title: "客户行业新增保存-幂等"
apiId: "58f48094c3d841e7b30be96a9012ba81"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Customer's Industry"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Customer's Industry]
platform_version: "BIP"
source_type: community-api-docs
---

# 客户行业新增保存-幂等

> `ContentType	application/json` 请求方式	POST | 分类: Customer's Industry (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/customertrade/idempotent/insert

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	MDD幂等

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 否 | 是 | 客户行业 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| code | string | 否 | 是 | 行业编码 示例：123 |
| name | object | 否 | 是 | 行业名称,支持多语 |
| order | int | 否 | 否 | 排序号 |
| parentCode | string | 否 | 否 | 上级行业编码 示例：parent |
| stopStatus | boolean | 否 | 否 | 停用状态, false:启用、true:停用 示例：true |

## 3. 请求示例

Url: /yonbip/digitalModel/customertrade/idempotent/insert?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"code": "123",
		"name": {
			"simplifiedName": "简体",
			"englishName": "英文",
			"traditionalName": "繁体"
		},
		"order": 0,
		"parentCode": "parent",
		"stopStatus": true
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用失败时的错误信息 示例：处理成功 |
| data | object | 否 | 调用成功时的返回数据 |
| id | string | 否 | 行业ID 示例：123456 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "处理成功",
	"data": {
		"id": "123456"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	服务端逻辑异常	服务端逻辑异常


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

