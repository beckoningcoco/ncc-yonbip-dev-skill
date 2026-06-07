---
title: "存货成本查询"
apiId: "7f6a12451ad54612a2c469547c7b6336"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Inventory Accounting"
domain: "FI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Inventory Accounting]
platform_version: "BIP"
source_type: community-api-docs
---

# 存货成本查询

> `ContentType	application/json` 请求方式	POST | 分类: Inventory Accounting (FI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/fi/fina/queryBalance

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
| dataType | string | 否 | 是 | 数据类型：1.期初成本 2.期末成本 3.年初成本 4.最新成本 示例：1 |
| accBody | string | 否 | 是 | 会计主体 示例：1746236822491392 |
| dataTime | long | 否 | 是 | 查询时间戳 示例：1615358696882 |
| resultCount | long | 否 | 是 | 返回明细条数,最多10条 示例：10 默认值：1 |
| date | string | 否 | 是 | 取数日期 示例：2019-09-12 12:12:12 |
| params | object | 是 | 是 | 查询参数子项，参数必传，为空时值为空数组[] |
| stockOrg | string | 否 | 否 | 库存组织，根据会计主体的成本域层级确定是否传参，例如：成本域层级为库存组织+仓库，则库存组织和仓库id都要传值 示例：1362549404881152 |
| warehouse | string | 否 | 否 | 仓库ID，根据会计主体的成本域层级确定是否传参，例如：成本域层级为库存组织+仓库，则库存组织和仓库id都要传值 示例：2001009921675520 |
| materialId | string | 否 | 否 | 物料ID 示例：1470258881155328 |
| batchCode | string | 否 | 否 | 批次号 示例：0000001 |
| freevalue1 | string | 否 | 否 | 规格自由项值1 示例：白色 |
| freevalue2 | string | 否 | 否 | 规格自由项值2 示例：M码 |
| freevalue3 | string | 否 | 否 | 规格自由项值3 示例：成本规格3a |
| freevalue4 | string | 否 | 否 | 规格自由项值4 示例：成本规格3a |
| freevalue5 | string | 否 | 否 | 规格自由项值5 示例：棉 |
| freevalue6 | string | 否 | 否 | 规格自由项值6 示例：物料规格11 |
| freevalue7 | string | 否 | 否 | 规格自由项值7 示例：物料规格12 |
| freevalue8 | string | 否 | 否 | 规格自由项值8 示例：物料规格a |
| freevalue9 | string | 否 | 否 | 规格自由项值9 示例：物料规格C |
| freevalue10 | string | 否 | 否 | 规格自由项值10 示例：棉麻 |

## 3. 请求示例

Url: /yonbip/fi/fina/queryBalance?access_token=访问令牌
Body: {
	"dataType": "1",
	"accBody": "1746236822491392",
	"dataTime": 1615358696882,
	"resultCount": 10,
	"date": "2019-09-12 12:12:12",
	"params": [
		{
			"stockOrg": "1362549404881152",
			"warehouse": "2001009921675520",
			"materialId": "1470258881155328",
			"batchCode": "0000001",
			"freevalue1": "白色",
			"freevalue2": "M码",
			"freevalue3": "成本规格3a",
			"freevalue4": "成本规格3a",
			"freevalue5": "棉",
			"freevalue6": "物料规格11",
			"freevalue7": "物料规格12",
			"freevalue8": "物料规格a",
			"freevalue9": "物料规格C",
			"freevalue10": "棉麻"
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| status | long | 否 | status 示例：200 |
| code | string | 否 | code 示例：200 |
| message | string | 否 | 描述信息 示例：查询成功 |
| msg | string | 否 | 描述信息 示例：查询成功 |
| data | object | 否 | 业务数据 |
| tenantId | long | 否 | 租户id 示例：1958606806667520 |
| dataType | string | 否 | 数据类型 1.期初成本 2.期末成本 3.年初成本 4.最新成本 示例：1 |
| date | string | 否 | 取数日期 示例：2020-11-12 12:12:12 |
| resultCount | long | 否 | 返回数 示例：1 |
| dataTime | long | 否 | 时间戳 示例：1615880055540 |
| dataList | object | 是 | dataList |

## 5. 正确返回示例

{
	"status": 200,
	"code": "200",
	"message": "查询成功",
	"msg": "查询成功",
	"data": {
		"tenantId": 1958606806667520,
		"dataType": "1",
		"date": "2020-11-12 12:12:12",
		"resultCount": 1,
		"dataTime": 1615880055540,
		"dataList": [
			{
				"num": "10.00",
				"price": "50.00",
				"money": "500.00",
				"accBody": "2080120785195264",
				"accpurpose": "",
				"stockOrg": "",
				"warehouse": "",
				"materialId": "",
				"batchCode": "",
				"freevalue1": "",
				"freevalue2": "",
				"freevalue3": "",
				"freevalue4": "",
				"freevalue5": "",
				"freevalue6": "",
				"freevalue7": "",
				"freevalue8": "",
				"freevalue9": "",
				"freevalue10": "",
				"dataList": [
					{
						"num": "10.00",
						"price": "50.00",
						"money": "500.00",
						"costreg": {
							"accbooktype": 2063147411940096,
							"pricingmethod": 1,
							"code": "yx5",
							"name": "yx5",
							"id": 2063362710279680,
							"pubts": "1616412421498",
							"tenant_id": 1958606806667520,
							"accentity": "2063146257060864",
							"costdomainlevel": 1,
							"isDefault": false,
							"name2": "",
							"name3": "",
							"name4": "",
							"name5": ""
						},
						"costobject": {
							"material": 2063351892054272,
							"materialclass": 2063337111032064,
							"batchcode": "Q20201105JGRK20201105000000001",
							"speciid": 1038134,
							"id": 2063395383399936,
							"pubts": "2021-03-19T10:56:25.000+00:00",
							"tenant_id": 1958606806667520,
							"code": "ICO000818",
							"name": "玻璃:玻璃颜色:无色"
						}
					}
				]
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

315001	未知原因，联系管理员

310008	参数校验失败，参数[{0}]是必填的。


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

