---
title: "行政区划详情分页查询-新集成"
apiId: "2250746138019233797"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Administrative Region"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Administrative Region]
platform_version: "BIP"
source_type: community-api-docs
---

# 行政区划详情分页查询-新集成

> `ContentType	application/json` 请求方式	POST | 分类: Administrative Region (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/basedoc/baseregion/batchQueryDetail

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
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | pubts开始时间 示例：2025-03-08 17:28:56 |
| endTs | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | pubts结束时间 示例：2025-03-08 17:28:56 |
| ids | string | 是 | 否 | 主键id集合 示例：["bfacf6bf-5cf3-11e9-817e-7cd30abea0c0","2211575684096589834"] |
| code | string | 否 | 否 | 编码 示例：110000000000 |
| name | string | 否 | 否 | 名称 示例：北京 |
| countryCode | string | 否 | 否 | 国家地区编码 示例：CN |

## 3. 请求示例

Url: /yonbip/digitalModel/basedoc/baseregion/batchQueryDetail?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 50,
	"startTs": "2025-03-08 17:28:56",
	"endTs": "2025-03-08 17:28:56",
	"ids": [
		"bfacf6bf-5cf3-11e9-817e-7cd30abea0c0",
		"2211575684096589834"
	],
	"code": "110000000000",
	"name": "北京",
	"countryCode": "CN"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回信息码 示例：200 |
| data | object | 否 | 请求体 |
| pageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 分页页码 示例：20 |
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | 分页条数 示例：1 |
| recordCount | number |
| 小数位数:0,最大长度:10 | 否 | 查询记录数 示例：1 |
| recordList | object | 是 | 处理数据 |

## 5. 正确返回示例

{
	"code": "200",
	"data": {
		"pageIndex": 20,
		"pageSize": 1,
		"recordCount": 1,
		"recordList": [
			{
				"id": "bfacf6bf-5cf3-11e9-817e-7cd30abea0c0",
				"code": "110000000000",
				"name": {
					"zh_CN": "北京",
					"en_US": "Beijing",
					"zh_TW": "北京"
				},
				"enable": 1,
				"parent": 0,
				"parent___code": "CN",
				"parent___name": {
					"zh_CN": "中国大陆",
					"en_US": "China",
					"zh_TW": "中國大陸"
				},
				"countryCode": "CN",
				"pathName": {
					"zh_CN": "北京,中国大陆",
					"en_US": "Beijing,China",
					"zh_TW": "北京,中國大陸"
				},
				"level": 2,
				"path": "0|bfacf6bf-5cf3-11e9-817e-7cd30abea0c0",
				"ispreset": 1,
				"slyCode": "110100",
				"enName": "Beijing",
				"pubts": "2025-03-07 10:53:35"
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

1	2025-11-11

新增

请求参数 countryCode

2	2025-07-04

更新

请求说明

更新

请求参数 pageIndex

更新

请求参数 pageSize

新增

返回参数 (5)

更新

返回参数 data

更新

返回参数 parent___name

更新

返回参数 pubts

删除

返回参数 objid

删除

返回参数 log


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

