---
title: "专业列表查询"
apiId: "2163037468403695626"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Major"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Major]
platform_version: "BIP"
source_type: community-api-docs
---

# 专业列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Major (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/am/ampubspecialtylist/batchquery

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
| page | object | 否 | 是 | 分页 |
| pageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 是 | 页号 示例：1 默认值：1 |
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | 是 | 每页条数 示例：2 默认值：10 |
| condition | object | 否 | 否 | 查询条件 |
| simpleVOs | object | 是 | 否 | 扩展查询条件 |

## 3. 请求示例

Url: /yonbip/am/ampubspecialtylist/batchquery?access_token=访问令牌
Body: {
	"page": {
		"pageIndex": 1,
		"pageSize": 2
	},
	"condition": {
		"simpleVOs": [
			{
				"field": "special_code",
				"op": "eq",
				"value1": "specialty_001"
			}
		]
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回http状态码(200:正常，其他：异常) 示例：200 |
| message | string | 否 | 返回的信息 示例：操作成功！ |
| data | object | 否 | 查询到的数据 |
| pageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 页码 示例：1 |
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | 每页条数 示例：10 |
| recordCount | number |
| 小数位数:0,最大长度:10 | 否 | 总共条数 示例：1 |
| recordList | object | 是 | 详细数据列表 |
| pageCount | number |
| 小数位数:0,最大长度:10 | 否 | 总共页数 示例：1 |
| beginPageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 起始页 示例：1 |
| endPageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 结束页 示例：1 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功！",
	"data": {
		"pageIndex": 1,
		"pageSize": 10,
		"recordCount": 1,
		"recordList": [
			{
				"id": "2158707815055622144",
				"pk_org": "1991575777008156681",
				"pk_org__name": "北京分公司",
				"special_code": "01",
				"special_name": {
					"zh_CN": "测试数据"
				},
				"memo": "测试备注",
				"enablestate": 0,
				"creator": "1cf8f2e0-28fe-462d-a8f3-01a6b50b3a2b",
				"creator__name": "昵称-王浩伟",
				"creationtime": "2024-12-18 20:00:28",
				"modifier": "1e6c32a2-8ee0-4ee6-9d62-f7c21388ac16",
				"modifier__name": "昵称-郝小侠",
				"modifiedtime": "2024-12-19 18:22:36"
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

999	服务端逻辑异常	服务端逻辑异常


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

