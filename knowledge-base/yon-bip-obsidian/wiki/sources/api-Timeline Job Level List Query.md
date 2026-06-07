---
title: "时间轴职级列表查询"
apiId: "1955576898721939459"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Job Level"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Job Level]
platform_version: "BIP"
source_type: community-api-docs
---

# 时间轴职级列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Job Level (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/ranktimeline/list

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
| pageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 是 | 页码 默认值：1 |
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | 是 | 每页大小 默认值：10 |
| name_code | string | 否 | 否 | 名称或编码 |
| timelineDate | date |
| 格式:yyyy-MM-dd | 否 | 否 | 业务日期，时间轴租户填写 示例：2024-03-19 |
| pubts | string | 否 | 否 | 时间戳 示例：2020-11-23 16:11:20 |

## 3. 请求示例

Url: /yonbip/digitalModel/ranktimeline/list?access_token=访问令牌
Body: {
	"pageIndex": 0,
	"pageSize": 0,
	"name_code": "",
	"timelineDate": "2024-03-19",
	"pubts": "2020-11-23 16:11:20"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 返回状态 示例：操作成功 |
| data | object | 否 | 业务数据 |
| pageIndex | int | 否 | 页码 |
| pageSize | int | 否 | 每页大小 |
| recordCount | int | 否 | 列表数量 |
| recordList | object | 是 | 列表数据 |
| pageCount | int | 否 | 页码总数 |
| beginPageIndex | int | 否 | 开始页码 |
| endPageIndex | int | 否 | 结束页码 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 0,
		"pageSize": 0,
		"recordCount": 0,
		"recordList": [
			{
				"code": "",
				"enable": 0,
				"name": "",
				"id": "",
				"maxrank_id": "",
				"maxrank_id_name": "",
				"minrank_id": "",
				"minrank_id_name": "",
				"ranktype_id": "",
				"ranktype_id_name": "",
				"orderNo": 0,
				"memo": "",
				"pubts": "",
				"starttime": "2024-02-22"
			}
		],
		"pageCount": 0,
		"beginPageIndex": 0,
		"endPageIndex": 0
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

500	查询失败


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

