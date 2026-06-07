---
title: "企业现金账户详情分页查询V4"
apiId: "2173699252292681732"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Enterprise Cash Account Details"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Enterprise Cash Account Details]
platform_version: "BIP"
source_type: community-api-docs
---

# 企业现金账户详情分页查询V4

> `ContentType	application/json` 请求方式	POST | 分类: Enterprise Cash Account Details (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/orgfincashacct/batchQueryDetail

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
| 小数位数:0,最大长度:10 | 否 | 是 | 页码 示例：1 |
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | 是 | 页大小 示例：10 |
| startTs | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | pubts开始时间 示例：2022-05-18 14:27:49 |
| endTs | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | pubts结束时间 示例：2022-05-18 14:27:49 |
| ids | string | 是 | 否 | 主键id集合 示例：["1457327655336542218","1473824289923792897"] |
| code | string | 否 | 否 | 编码 示例：10134744866 |
| name | string | 否 | 否 | 名称 示例：缓存1234744866 |
| orgid | string | 否 | 否 | 组织id 示例：1457327303151321092 |
| orgid___code | string | 否 | 否 | 组织编码 示例：测试组织1 |

## 3. 请求示例

Url: /yonbip/digitalModel/orgfincashacct/batchQueryDetail?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 10,
	"startTs": "2022-05-18 14:27:49",
	"endTs": "2022-05-18 14:27:49",
	"ids": [
		"1457327655336542218",
		"1473824289923792897"
	],
	"code": "10134744866",
	"name": "缓存1234744866",
	"orgid": "1457327303151321092",
	"orgid___code": "测试组织1"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| data | object | 否 | 返回数据 |
| pageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 当前页数 示例：1 |
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | 每行页数 示例：10 |
| recordCount | number |
| 小数位数:0,最大长度:10 | 否 | 总数 示例：2 |
| recordList | object | 是 | 处理数据 |

## 5. 正确返回示例

{
	"code": "200",
	"data": {
		"pageIndex": 1,
		"pageSize": 10,
		"recordCount": 2,
		"recordList": [
			{
				"id": "1457327655336542218",
				"code": "10134744866",
				"name": {
					"zh_CN": "缓存1234744866",
					"en_US": "Cache 1234744866",
					"zh_TW": "緩存 1234744866"
				},
				"description": {
					"zh_CN": "简体中文",
					"en_US": "Simplified Chinese",
					"zh_TW": "簡體中文"
				},
				"enable": 1,
				"log": "",
				"orgid": 1457327303151321092,
				"orgid___code": "ceshizuzhi1",
				"orgid___name": "测试组织1",
				"pubts": "2024-09-11 11:31:20",
				"account": "",
				"accountOpenDate": "2026-06-07 11:48:35",
				"currency": NaN,
				"currency___code": "ABC",
				"currency___name": "蒙古币",
				"isdefault": false
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

