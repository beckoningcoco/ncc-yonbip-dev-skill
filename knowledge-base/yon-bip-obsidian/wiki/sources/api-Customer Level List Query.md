---
title: "客户级别列表查询"
apiId: "c39ed87b30a946baa90e2332c64e2304"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Customer Grade"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Customer Grade]
platform_version: "BIP"
source_type: community-api-docs
---

# 客户级别列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Customer Grade (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/cuslevel/list

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
| name | string | 否 | 否 | 客户级别名称 示例：name |
| code | string | 否 | 否 | 客户级别编码 示例：code |
| simpleVOs | object | 否 | 否 | 查询条件 示例：查询条件 |

## 3. 请求示例

Url: /yonbip/digitalModel/cuslevel/list?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 10,
	"name": "name",
	"code": "code",
	"simpleVOs": "查询条件"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用失败时的错误信息 示例：操作成功 |
| data | object | 否 | 调用成功时的返回数据 |
| pageSize | long | 否 | 每页行数 示例：10 |
| pageCount | long | 否 | 总页数 示例：1 |
| pageIndex | long | 否 | 当前页数 示例：1 |
| recordList | object | 是 | 查询结果数组 |
| recordCount | long | 否 | 总数 示例：2 |
| endPageIndex | long | 否 | 结束页码（有多少页） 示例：1 |
| beginPageIndex | long | 否 | 开始页码（第一页） 示例：1 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"pageSize": 10,
		"pageCount": 1,
		"pageIndex": 1,
		"recordList": [
			{
				"creator": "YS测试1",
				"code": "khjb02",
				"isEnabled": true,
				"name": "客户级别02",
				"pubts": "2019-12-04 11:37:47",
				"createTime": "2019-12-04 11:37:47",
				"order": 0,
				"id": 1511107254505728
			}
		],
		"recordCount": 2,
		"endPageIndex": 1,
		"beginPageIndex": 1
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

