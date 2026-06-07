---
title: "根据客户编码查询客户地址信息"
apiId: "1709844201768222725"
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

# 根据客户编码查询客户地址信息

> `ContentType	application/json` 请求方式	POST | 分类: Customer (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/merchant/listaddressbycodelist

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| codeList | string | 是 | 是 | 客户编码集合 示例：[ "000000002", "000000003" ] |
| pageIndex | int | 否 | 是 | 分页页码 示例：1 默认值：1 |
| pageSize | int | 否 | 是 | 分页大小；最大1000 示例：200 默认值：200 |

## 3. 请求示例

Url: /yonbip/digitalModel/merchant/listaddressbycodelist?access_token=访问令牌
Body: {
	"codeList": [
		"000000002",
		"000000003"
	],
	"pageIndex": 1,
	"pageSize": 200
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 接口返回信息 示例：操作成功 |
| data | object | 是 | 数据信息 |
| id | long | 否 | 客户档案地址信息主键id 示例：1707487089244766211 |
| merchantId | long | 否 | 客户主键id 示例：1707487089244766210 |
| addressCode | string | 否 | 客户档案地址信息地址编码 示例：1 |
| regionCode | string | 否 | 客户档案地址信息行政区划编码 示例：000002 |
| address | string | 否 | 客户档案地址信息详细地址 示例：地址档案测试001-001 |
| zipCode | string | 否 | 客户档案地址信息邮政编码 示例：157499 |
| receiver | string | 否 | 客户档案地址信息联系人姓名 示例：asdasd |
| mobile | string | 否 | 客户档案地址信息联系人手机号 示例：13624631152 |
| telePhone | string | 否 | 客户档案地址信息固定电话 示例：76112311 |
| email | string | 否 | 客户档案地址信息邮箱 示例：sada@yonyou.com |
| qq | string | 否 | 客户档案地址信息qq 示例：122131 |
| weChat | string | 否 | 客户档案地址信息微信 示例：12321312 |
| shipregion | long | 否 | 客户档案地址信息运输区域id 示例：1707487518741495811 |
| isDefault | boolean | 否 | 客户档案地址信息默认地址；true：是；false：否； 示例：true |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"id": 1707487089244766211,
			"merchantId": 1707487089244766210,
			"addressCode": "1",
			"regionCode": "000002",
			"address": "地址档案测试001-001",
			"zipCode": "157499",
			"receiver": "asdasd",
			"mobile": "13624631152",
			"telePhone": "76112311",
			"email": "sada@yonyou.com",
			"qq": "122131",
			"weChat": "12321312",
			"shipregion": 1707487518741495811,
			"isDefault": true
		}
	]
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

