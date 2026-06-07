---
title: "BIP客户组织级字段查询接口"
apiId: "1773534331910225921"
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

# BIP客户组织级字段查询接口

> `ContentType	application/json` 请求方式	POST | 分类: Customer (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/u8c/merchant/listMerchantApplyRangeDetail

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	列表查询

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| pubts | string | 否 | 否 | 时间戳 示例：2020-05-06 15:00:45 |
| pageSize | long | 否 | 否 | 分页大小 示例：10 |
| pageIndex | long | 否 | 否 | 页码 示例：1 |
| isShowGlobal | boolean | 否 | 否 | 是否显示企业账号级组织 示例：false |
| merchantId | long | 否 | 否 | 客户id 示例：1751864160225329200 |
| funcTypeList | string | 是 | 否 | 组织职能 示例：["salesorg"] |
| isExistPotential | boolean | 否 | 否 | 是否存在潜客 示例：false |

## 3. 请求示例

Url: /yonbip/digitalModel/u8c/merchant/listMerchantApplyRangeDetail?access_token=访问令牌
Body: {
	"pubts": "2020-05-06 15:00:45",
	"pageSize": 10,
	"pageIndex": 1,
	"isShowGlobal": false,
	"merchantId": 1751864160225329200,
	"funcTypeList": [
		"salesorg"
	],
	"isExistPotential": false
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 返回码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 返回实体 |
| pageIndex | long | 否 | 页码 示例：1 |
| pageSize | long | 否 | 分页大小 示例：1 |
| recordList | object | 是 | 返回集合 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 1,
		"recordList": [
			{
				"signBack": false,
				"merchantApplyRangeId": "1664420198137462786",
				"merchantApplyRangeId_orgId": "1664403301750800394",
				"payway": 99,
				"id": "1664420189547528195"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


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

