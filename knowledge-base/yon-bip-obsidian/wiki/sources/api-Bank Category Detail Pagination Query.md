---
title: "银行类别详情分页查询V5"
apiId: "2174249016696504329"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Bank Category"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Bank Category]
platform_version: "BIP"
source_type: community-api-docs
---

# 银行类别详情分页查询V5

> `ContentType	application/json` 请求方式	POST | 分类: Bank Category (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/basedoc/bank/batchQueryDetail

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
| pageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 是 | 页码 示例：1 默认值：1 |
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | 是 | 页大小 示例：50 默认值：50 |
| startTs | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | pubts开始时间 示例：2025-02-28 11:16:47 |
| endTs | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | pubts结束时间 示例：2025-03-28 11:16:47 |
| ids | string | 是 | 否 | 主键id集合 示例：["2211575684096589833"] |
| code | string | 否 | 否 | 编码 示例：01 |
| name | string | 否 | 否 | 名称 示例：中国工商银行 |

## 3. 请求示例

Url: /yonbip/digitalModel/basedoc/bank/batchQueryDetail?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 50,
	"startTs": "2025-02-28 11:16:47",
	"endTs": "2025-03-28 11:16:47",
	"ids": [
		"2211575684096589833"
	],
	"code": "01",
	"name": "中国工商银行"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功是返回200 示例：200 |
| data | object | 是 | 调用成功时的返回数据 |
| pageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 页码 示例：1 |
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | 页大小 示例：50 |
| recordCount | number |
| 小数位数:0,最大长度:10 | 否 | 总数 示例：100 |
| recordList | object | 是 | 响应数据 |

## 5. 正确返回示例

{
	"code": "200",
	"data": [
		{
			"pageIndex": 1,
			"pageSize": 50,
			"recordCount": 100,
			"recordList": [
				{
					"id": "2211575684096589833",
					"code": "01",
					"name": {
						"zh_CN": "中国工商银行",
						"en_US": "ICBC",
						"zh_TW": "中國工商銀行"
					},
					"country": "0001Z010000000079UJJ",
					"country___code": "CN",
					"country___name": {
						"zh_CN": "中国",
						"en_US": "China",
						"zh_TW": "中國"
					},
					"enable": 1,
					"pubts": "2024-09-05 18:26:36"
				}
			]
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-06-30

更新

请求说明


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

