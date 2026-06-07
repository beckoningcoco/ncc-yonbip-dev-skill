---
title: "客户属性列表查询"
apiId: "447de15efea84422940432201ecaffcf"
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

# 客户属性列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Customer (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/customerpro/list

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
| pageIndex | int | 否 | 是 | 页号 示例：1 默认值：1 |
| pageSize | int | 否 | 是 | 每页行数 示例：10 默认值：10 |
| showItem | string | 否 | 否 | 属性名称 示例：属性名称 |
| type | string | 否 | 否 | 属性类型(String文本 Double数值 Integer整型 Date日期 Time时间 DateTime日期时间) 示例：String |

## 3. 请求示例

Url: /yonbip/digitalModel/customerpro/list?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 10,
	"showItem": "属性名称",
	"type": "String"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用失败时的错误信息 示例：处理成功 |
| data | object | 否 | 调用成功时的返回数据 |
| pageIndex | int | 否 | 当前页 示例：1 |
| pageSize | int | 否 | 页大小 示例：10 |
| pageCount | int | 否 | 页数 示例：1 |
| beginPageIndex | int | 否 | 起始页索引 示例：1 |
| endPageIndex | int | 否 | 结束页索引 示例：1 |
| recordCount | int | 否 | 数据条数 示例：1 |
| pubts | string | 否 | 时间戳 示例：2019-12-04 11:33:30 |
| recordList | object | 是 | 数据列表 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "处理成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 10,
		"pageCount": 1,
		"beginPageIndex": 1,
		"endPageIndex": 1,
		"recordCount": 1,
		"pubts": "2019-12-04 11:33:30",
		"recordList": [
			{
				"showItem": "属性名称",
				"item": "项目号",
				"sourcetype": "false",
				"userdefAlias": "属性别名",
				"type": "String",
				"id": "客户属性id",
				"maxInputLen": "255",
				"decimalDigits": "0",
				"isWebShow": "false",
				"orderNum": "1",
				"iorder": "系统顺序",
				"isSerInput": "false",
				"pubts": "2019-12-04 11:33:30",
				"isEnabled": "false"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	服务端逻辑异常	检查入参是否填写正确，参数值是否真实存在，仍提示该信息请联系开发人员。


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

