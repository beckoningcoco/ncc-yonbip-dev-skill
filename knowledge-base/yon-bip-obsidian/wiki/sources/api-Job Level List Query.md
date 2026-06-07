---
title: "职级列表查询"
apiId: "da819bb60aac444286ce9945e988c9e8"
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

# 职级列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Job Level (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/rank/list

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
| pageIndex | long | 否 | 是 | 页码 默认值：1 |
| pageSize | long | 否 | 是 | 每页大小 默认值：10 |
| name_code | string | 否 | 否 | 名称或编码 |

## 3. 请求示例

Url: /yonbip/digitalModel/rank/list?access_token=访问令牌
Body: {
	"pageIndex": 0,
	"pageSize": 0,
	"name_code": ""
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
				"name": {
					"zh_CN": "中文",
					"en_US": "英文",
					"zh_TW": "繁体"
				},
				"id": "",
				"maxrank_id": "",
				"maxrank_id_name": "",
				"minrank_id": "",
				"minrank_id_name": "",
				"ranktype_id": "",
				"ranktype_id_name": "",
				"orderNo": 0,
				"memo": {
					"zh_CN": "中文",
					"en_US": "英文",
					"zh_TW": "繁体"
				},
				"pubts": ""
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

1	2024-03-21

更新

请求参数 name_code

更新

返回参数 (23)

不进行时间轴适配，退回修改前一版本


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

