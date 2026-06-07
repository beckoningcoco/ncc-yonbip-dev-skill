---
title: "业务期间详情分页查询-新集成"
apiId: "2201778107777548296"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Business Period"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Business Period]
platform_version: "BIP"
source_type: community-api-docs
---

# 业务期间详情分页查询-新集成

> `ContentType	application/json` 请求方式	POST | 分类: Business Period (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/basedoc/businessperiod/batchQueryDetail

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
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | pubts开始时间 示例：2025-03-08 17:38:46 |
| endTs | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | pubts结束时间 示例：2025-04-08 17:38:46 |
| ids | string | 是 | 否 | 主键id集合 示例：["2211575684096589833","2211575684096589834"] |
| code | string | 否 | 否 | 编码 示例：c001 |
| name | string | 否 | 否 | 名称 示例：n001 |

## 3. 请求示例

Url: /yonbip/digitalModel/basedoc/businessperiod/batchQueryDetail?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 10,
	"startTs": "2025-03-08 17:38:46",
	"endTs": "2025-04-08 17:38:46",
	"ids": [
		"2211575684096589833",
		"2211575684096589834"
	],
	"code": "c001",
	"name": "n001"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 状态码 示例：200 |
| data | object | 否 | data |
| pageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 页码 示例：1 |
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | 页大小 示例：10 |
| recordCount | string | 否 | 总数 |
| recordList | object | 是 | 结果集 |

## 5. 正确返回示例

{
	"code": "200",
	"data": {
		"pageIndex": 1,
		"pageSize": 10,
		"recordCount": "",
		"recordList": [
			{
				"id": "2201718029802799106",
				"code": "aa",
				"name": {
					"zh_CN": "",
					"en_US": "",
					"zh_TW": ""
				},
				"creator": "99ea7655-00a2-4bda-b23c-19ade37ea574",
				"endDate": "2026-02-13 00:00:00",
				"description": {
					"zh_CN": "",
					"en_US": "",
					"zh_TW": ""
				},
				"creator___code": "00000005",
				"type": "month",
				"creator___name": "测试环境管理员",
				"createTime": "2025-02-14 14:15:13",
				"enable": 0,
				"pubts": "2025-02-14 14:15:17",
				"BusinessYearVOList": [
					{
						"creator": "99ea7655-00a2-4bda-b23c-19ade37ea574",
						"code": "2025",
						"BusinessPeriodVOList": [
							{
								"creator": "99ea7655-00a2-4bda-b23c-19ade37ea574",
								"code": "2025-01",
								"businessyearId": "2201718029802799107",
								"endDate": "2025-03-13 00:00:00",
								"type": "month",
								"businessperiodSchemeId": "2201718029802799106",
								"createTime": "2025-02-14 14:15:17",
								"id": "2201718064143138821",
								"pubts": "2025-02-14 14:15:17",
								"startDate": "2025-02-14 00:00:00",
								"startPeriod": "1111211",
								"startPeriod___code": "2025-09",
								"endPeriod": "1111311",
								"endPeriod___code": "2025-11",
								"periodType": "month"
							}
						],
						"endDate": "2026-02-13 00:00:00",
						"modifier": "99ea7655-00a2-4bda-b23c-19ade37ea574",
						"modifier___code": "00000005",
						"creator___code": "00000005",
						"creator___name": "测试环境管理员",
						"modifier___name": "测试环境管理员",
						"modifyTime": "2025-02-14 14:15:17",
						"businessperiodSchemeId": "2201718029802799106",
						"createTime": "2025-02-14 14:15:14",
						"name": "2025",
						"id": "2201718029802799107",
						"pubts": "2025-02-14 14:15:17",
						"startDate": "2025-02-14 00:00:00"
					}
				],
				"startDate": "2025-02-14 00:00:00",
				"applicationScope": "feeControl-APPScope:费控,marketingExpense-APPScope:营销"
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

1	2025-07-29

更新

请求说明

更新

请求参数 (6)

业务期间详情分页查询


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

