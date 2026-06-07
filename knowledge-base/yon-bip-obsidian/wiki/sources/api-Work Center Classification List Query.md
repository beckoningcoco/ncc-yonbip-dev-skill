---
title: "工作中心分类列表查询"
apiId: "2fa9df177f71440e8f96e9ee5551022d"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Work Center Catg."
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Work Center Catg.]
platform_version: "BIP"
source_type: community-api-docs
---

# 工作中心分类列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Work Center Catg. (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/mfg/workcenter-category/list

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	列表查询

事务和幂等性

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| pageIndex | long | 否 | 否 | 页号 示例：1 默认值：1 |
| pageSize | long | 否 | 否 | 每页行数 示例：10 默认值：10 |
| stopstatus | boolean | 否 | 否 | 启用状态。true:停用；false:启用。 示例：false |
| orgId | string | 否 | 否 | 组织id 示例：1866605942198528 |
| orgCode | string | 否 | 否 | 组织编码 示例：LGC1 |
| code | string | 否 | 否 | 编码 示例：20 |
| name | string | 否 | 否 | 名称 示例：解冻 |
| startTime | string | 否 | 否 | 时间戳起始时间。要求：起始时间<结束时间。格式：yyyy-MM-dd HH:mm:ss 示例：2021-07-23 14:42:27 |
| endTime | string | 否 | 否 | 时间戳结束时间。要求：起始时间<结束时间。格式：yyyy-MM-dd HH:mm:ss 示例：2021-07-23 14:42:27 |
| pubts | string | 否 | 否 | 时间戳 示例：2024-05-06 23:10:00|2024-05-08 12:09:00 |

## 3. 请求示例

Url: /yonbip/mfg/workcenter-category/list?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 10,
	"stopstatus": false,
	"orgId": "1866605942198528",
	"orgCode": "LGC1",
	"code": "20",
	"name": "解冻",
	"startTime": "2021-07-23 14:42:27",
	"endTime": "2021-07-23 14:42:27",
	"pubts": "2024-05-06 23:10:00|2024-05-08 12:09:00"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 接口调用返回码，成功时返回200 示例：200 |
| message | string | 否 | 接口调用返回信息 示例：操作成功 |
| data | object | 否 | 接口调用返回数据 |
| pageIndex | long | 否 | 当前页数 示例：1 |
| pageSize | long | 否 | 每页条数 示例：10 |
| recordCount | long | 否 | 总条数 示例：58 |
| recordList | object | 是 | 数据集合 |
| pageCount | long | 否 | 总页数 示例：6 |
| beginPageIndex | long | 否 | 开始页码 示例：1 |
| endPageIndex | long | 否 | 结束页码 示例：6 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 10,
		"recordCount": 58,
		"recordList": [
			{
				"creator": "张汉卿",
				"creatorId": 1870886213226752,
				"createTime": "2021-07-10 10:28:31",
				"id": 2337736480166144,
				"code": "GZC_112",
				"name": "工作中心分类一",
				"orgId": "1866605942198528",
				"stopstatus": false,
				"orgId_name": "L工厂1",
				"memo": "",
				"pubts": "2021-07-10 10:28:31",
				"createDate": "2021-07-10 00:00:00",
				"main_id": "2337736480166144",
				"main_": "",
				"workCenterCategoryAttrextItem_id": "2337736480166144",
				"workCenterCategoryAttrextItem_": "aaa"
			}
		],
		"pageCount": 6,
		"beginPageIndex": 1,
		"endPageIndex": 6
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码


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

