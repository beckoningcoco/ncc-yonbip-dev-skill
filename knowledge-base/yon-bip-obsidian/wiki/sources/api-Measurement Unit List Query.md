---
title: "计量单位列表查询"
apiId: "31b0329fb44b4665a370d6dc35754be1"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "UoM"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, UoM]
platform_version: "BIP"
source_type: community-api-docs
---

# 计量单位列表查询

> `ContentType	application/json` 请求方式	POST | 分类: UoM (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/unit/list

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
| code | string | 否 | 否 | 计量单位编码 示例：XXX |
| open_pubts_begin | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 开始时间 示例：2024-01-10 10:37:59 |
| open_pubts_end | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 结束时间 示例：2024-02-22 10:37:59 |
| pageIndex | long | 否 | 是 | 当前页索引 示例：1 |
| pageSize | long | 否 | 是 | 页大小 示例：10 |
| simple | object | 否 | 否 | 查询条件 |
| name | string | 否 | 否 | 计量单位名称 示例：名称 |
| code | string | 否 | 否 | 计量单位编码 示例：编码 |

## 3. 请求示例

Url: /yonbip/digitalModel/unit/list?access_token=访问令牌
Body: {
	"code": "XXX",
	"open_pubts_begin": "2024-01-10 10:37:59",
	"open_pubts_end": "2024-02-22 10:37:59",
	"pageIndex": 1,
	"pageSize": 10,
	"simple": {
		"name": "名称",
		"code": "编码"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 示例："200" |
| message | string | 否 | 调用失败时的错误信息 示例：处理成功 |
| data | object | 否 | 调用成功时的返回数据 |
| pageIndex | int | 否 | 当前页数 示例：1 |
| pageSize | int | 否 | 每页行数 示例：10 |
| pageCount | int | 否 | 总页数 示例：1 |
| beginPageIndex | int | 否 | 开始页码（第一页） 示例：1 |
| endPageIndex | int | 否 | 结束页码（有多少页） 示例：1 |
| recordCount | int | 否 | 总数 示例：1 |
| pubts | string | 否 | 时间戳,格式为:yyyy-MM-dd HH:mm:ss 示例：2024-04-02 00:00:00 |
| recordList | object | 是 | 结果列表 |

## 5. 正确返回示例

{
	"code": "\"200\"",
	"message": "处理成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 10,
		"pageCount": 1,
		"beginPageIndex": 1,
		"endPageIndex": 1,
		"recordCount": 1,
		"pubts": "2024-04-02 00:00:00",
		"recordList": [
			{
				"code": "编码",
				"name": "名称",
				"unitGroup_name": "分组名称",
				"unitGroup": "123456",
				"truncationType": 4,
				"precision": 0,
				"creator": "创建人",
				"createDate": "时间戳,格式为:yyyy-MM-dd HH:mm:ss",
				"createTime": "时间戳,格式为:yyyy-MM-dd HH:mm:ss",
				"stopstatus": false,
				"modifier": "修改人",
				"modifyDate": "时间戳,格式为:yyyy-MM-dd HH:mm:ss",
				"modifyTime": "时间戳,格式为:yyyy-MM-dd HH:mm:ss",
				"id": 123456789,
				"pubts": "2024-04-02 00:00:00"
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

