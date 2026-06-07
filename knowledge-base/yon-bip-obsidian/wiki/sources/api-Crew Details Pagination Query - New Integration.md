---
title: "班组详情分页查询-新集成"
apiId: "2178787439907700737"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Crew"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Crew]
platform_version: "BIP"
source_type: community-api-docs
---

# 班组详情分页查询-新集成

> `ContentType	application/json` 请求方式	POST | 分类: Crew (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/teamdefinition/batchQueryDetail

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
| 小数位数:0,最大长度:10 | 否 | 是 | 页大小 示例：10 默认值：10 |
| startTs | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | pubts开始时间 示例：2024-09-11 11:31:10 |
| endTs | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | pubts结束时间 示例：2024-09-11 11:31:50 |
| ids | string | 是 | 否 | 主键id集合 示例：["1509318234675871746","1509346048884080646"] |
| code | string | 否 | 否 | 编码 示例：banzu20220727163646954 |
| name | string | 否 | 否 | 名称 示例：压测班组20220727163646954 |

## 3. 请求示例

Url: /yonbip/digitalModel/teamdefinition/batchQueryDetail?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 10,
	"startTs": "2024-09-11 11:31:10",
	"endTs": "2024-09-11 11:31:50",
	"ids": [
		"1509318234675871746",
		"1509346048884080646"
	],
	"code": "banzu20220727163646954",
	"name": "压测班组20220727163646954"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | code 示例：200 |
| data | object | 否 | data |
| pageIndex | number |
| 小数位数:0,最大长度:10 | 否 | pageIndex 示例：1 |
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | pageSize 示例：10 |
| recordCount | number |
| 小数位数:0,最大长度:10 | 否 | recordCount 示例：2 |
| recordList | object | 是 | recordList |

## 5. 正确返回示例

{
	"code": "200",
	"data": {
		"pageIndex": 1,
		"pageSize": 10,
		"recordCount": 2,
		"recordList": [
			{
				"id": "1509346048884080646",
				"code": "banzu20220727163646954",
				"name": {
					"zh_CN": "自动化企业性质",
					"en_US": "Automated Enterprise Nature",
					"zh_TW": "自動化企業性質"
				},
				"is_shift": 1,
				"pk_org": "1624225669279907850",
				"pk_org___name": {
					"zh_CN": "伊利",
					"en_US": "",
					"zh_TW": ""
				},
				"pk_org___code": "test01",
				"pk_dept": "2429454100923416583",
				"pk_dept___name": {
					"zh_CN": "部门1",
					"en_US": "",
					"zh_TW": ""
				},
				"pk_dept___code": "",
				"operationList": [
					{
						"pk_team": "1509346048884080646",
						"pk_team___code": "banzu20220727163646954",
						"pk_team___name": "压测班组20220727163646954",
						"is_master": 0,
						"pk_operator": "7ae3e650cfcf11edae1008c0ebd50df6",
						"pk_operator___code": "7ae3e6d2cfcf11edae1008c0ebd50df6",
						"pk_dept": "1660017847957979142",
						"pk_dept___code": "1660017847957979142",
						"id": "2201878369521893385",
						"pubts": "2025-02-14 19:26:19",
						"start_date": "2025-02-14",
						"end_date": "2025-02-16"
					}
				],
				"enable": 1,
				"memo": "",
				"pubts": "2025-02-14 19:26:19"
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

1	2026-03-06

新增

返回参数 zh_CN

新增

返回参数 en_US

新增

返回参数 zh_TW

更新

返回参数 (12)

2	2025-12-18

更新

请求说明

新增

返回参数 (7)

3	2025-07-29

更新

请求参数 pageIndex

更新

请求参数 pageSize

班组详情分页查询


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

