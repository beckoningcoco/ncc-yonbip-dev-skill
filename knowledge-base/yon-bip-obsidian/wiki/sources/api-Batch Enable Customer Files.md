---
title: "客户档案批量启用"
apiId: "803cbec204734c50808328ab54bfca9f"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Customer"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Customer]
platform_version: "BIP"
source_type: community-api-docs
---

# 客户档案批量启用

> `ContentType	application/json` 请求方式	POST | 分类: Customer (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/merchant/unstop

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	批量保存/更新

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 是 | 是 | 客户 |
| merchantId | long | 否 | 否 | 客户档案id 示例：1970281713914112 |
| merchantCode | string | 否 | 否 | 客户档案编码；优先级大于id。 示例：code00 |
| orgId | long | 否 | 否 | 使用组织id 示例：1970281714585857 |
| orgCode | string | 否 | 否 | 使用组织编码；优先级大于id。 示例：glonal00 |

## 3. 请求示例

Url: /yonbip/digitalModel/merchant/unstop?access_token=访问令牌
Body: {
	"data": [
		{
			"merchantId": 1970281713914112,
			"merchantCode": "code00",
			"orgId": 1970281714585857,
			"orgCode": "glonal00"
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用失败时的错误信息 示例：操作成功 |
| data | object | 否 | 调用成功时的返回数据 |
| _realtype | string | 否 | 框架无效字段，已停用 |
| _entityName | string | 否 | 框架无效字段，已停用 |
| _keyName | string | 否 | 框架无效字段，已停用 |
| id | long | 否 | 客户档案id 示例：1970281713914112 |
| merchantApplyRangeId | string | 否 | 客户适用范围id 示例：1970281714585857 |
| _status | string | 否 | 客户档案更新状态 示例：更新状态 |
| merchantId | string | 否 | 客户档案id 示例：1970281713914112 |
| orgId | string | 否 | 使用组织id 示例：1970281714585857 |
| isCreator | string | 否 | 是否创建者：true是，false否 示例：true |
| pubts | string | 否 | 时间戳 示例：2020-10-23 20:46:58 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"_realtype": "",
		"_entityName": "",
		"_keyName": "",
		"id": 1970281713914112,
		"merchantApplyRangeId": "1970281714585857",
		"_status": "更新状态",
		"merchantId": "1970281713914112",
		"orgId": "1970281714585857",
		"isCreator": "true",
		"pubts": "2020-10-23 20:46:58"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	检查入参是否填写正确，参数值是否真实存在，仍提示该信息请联系开发人员	操作失败


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-17

新增

请求参数 merchantCode

新增

请求参数 orgCode

更新

请求参数 merchantId

更新

请求参数 orgId


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

