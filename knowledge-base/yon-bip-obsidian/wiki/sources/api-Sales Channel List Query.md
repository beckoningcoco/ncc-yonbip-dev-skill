---
title: "销售渠道列表查询"
apiId: "4e0fa3b4abf542ac998f0978b180781e"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Sales Channel"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Sales Channel]
platform_version: "BIP"
source_type: community-api-docs
---

# 销售渠道列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Sales Channel (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/customerType/list

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
| simple | object | 否 | 否 | 查询条件 |
| id | string | 否 | 否 | 销售渠道id 示例：123456 |
| code | string | 否 | 否 | 销售渠道编码 示例：code |
| name | string | 否 | 否 | 销售渠道名称 示例：名称 |
| pubts | string | 否 | 否 | 时间戳，查询大于所传时间戳的数据 示例：2020-08-29 10:49:17 |
| pageIndex | long | 否 | 是 | 当前页索引 示例：1 默认值：1 |
| pageSize | long | 否 | 是 | 页大小 示例：10 默认值：10 |

## 3. 请求示例

Url: /yonbip/digitalModel/customerType/list?access_token=访问令牌
Body: {
	"simple": {
		"id": "123456",
		"code": "code",
		"name": "名称",
		"pubts": "2020-08-29 10:49:17"
	},
	"pageIndex": 1,
	"pageSize": 10
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 请求完成结果状态码 示例：200 |
| message | string | 否 | 请求完成返回信息 示例：操作成功 |
| data | object | 否 | 请求完成返回数据 |
| pageIndex | long | 否 | 当前页索引 示例：1 |
| pageSize | long | 否 | 页大小 示例：10 |
| recordCount | long | 否 | 记录条数 示例：3 |
| recordList | object | 是 | 数据列表 |
| pageCount | long | 否 | 页数 示例：1 |
| beginPageIndex | long | 否 | 起始页索引 示例：1 |
| endPageIndex | long | 否 | 尾页索引 示例：1 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 10,
		"recordCount": 3,
		"recordList": [
			{
				"creator": "19904588888",
				"code": "客户类型编码1",
				"createTime": "2021-08-13 14:07:38",
				"name": "客户类型名称1",
				"comment": "客户类型备注",
				"id": 2386081522209024,
				"pubts": "2021-08-13 14:07:39",
				"stopstatus": false
			}
		],
		"pageCount": 1,
		"beginPageIndex": 1,
		"endPageIndex": 1
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

