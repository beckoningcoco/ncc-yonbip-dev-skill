---
title: "车辆分页查询V3"
apiId: "2227854340304928773"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Vehicle"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Vehicle]
platform_version: "BIP"
source_type: community-api-docs
---

# 车辆分页查询V3

> `ContentType	application/json` 请求方式	POST | 分类: Vehicle (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/basedoc/vehicle/batchQueryDetail

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
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | pubts开始时间 示例：2024-09-11 11:30:45 |
| endTs | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | pubts结束时间 示例：2024-09-11 11:30:55 |
| ids | string | 是 | 否 | 主键id集合 示例：["1427710093411483649","1427711588070064129"] |
| vmainlicense | string | 否 | 否 | 车牌号 示例：aacccd |

## 3. 请求示例

Url: /yonbip/digitalModel/basedoc/vehicle/batchQueryDetail?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 10,
	"startTs": "2024-09-11 11:30:45",
	"endTs": "2024-09-11 11:30:55",
	"ids": [
		"1427710093411483649",
		"1427711588070064129"
	],
	"vmainlicense": "aacccd"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| success | boolean | 否 | 是否调用成功 示例：true |
| data | object | 否 | 返回数据 |
| pageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 当前页数 示例：1 |
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | 每行页数 示例：3 |
| recordCount | string | 否 | 总数 |
| recordList | object | 是 | 消息体 |

## 5. 正确返回示例

{
	"code": "200",
	"success": true,
	"data": {
		"pageIndex": 1,
		"pageSize": 3,
		"recordCount": "",
		"recordList": [
			{
				"id": "2148930794371940361",
				"vmainlicense": "111",
				"ccarrierid": "3004531958878464",
				"ccarrierid___name": "cysbe",
				"ccarrierid___code": "cysbe",
				"fleet": "xxxx",
				"owner": "2",
				"ivehiclesort": "0",
				"ntypeaxlenum": "5",
				"emission": "0",
				"energytype": "新能源",
				"terminalid": "111",
				"cartypeid": "3253648653734144",
				"cartypeid___vcode": "2",
				"cartypeid___vname": "2",
				"pk_vehicletype": "1",
				"carlength": "5",
				"nbaseload": 2,
				"nloadfactor": 2,
				"nmaxload": 5.88,
				"ndbaseestload": 1.39,
				"ndnewestload": 1.59,
				"maxoverload": 8.2,
				"cmeamunit": "1554602256549019654",
				"cmeamunit___code": "TNE",
				"cmeamunit___name": "吨1",
				"precision": 4,
				"btarevalidctrl": "0",
				"ttarevalidtime": "2025-04-06 14:52:20",
				"adminvehicle": "0",
				"iscold": 0,
				"isblack": "0",
				"bcombine": "0",
				"vrfid": "111",
				"etc": "111",
				"benable": "0",
				"vremark": "111",
				"carrierList": [
					{
						"id": "2148930794371940362",
						"pk_vehicle": "2148930794371940361",
						"carrierid": "3004531958878464",
						"carrierid___name": "cysbe",
						"carrierid___code": "cysbe",
						"is_default": 1,
						"sourceUnique": "2148930794371940362"
					}
				],
				"materielList": [
					{
						"id": "2148930794371940363",
						"pk_vehicle": "2148930794371940361",
						"materielclassificationid": "3004531958878464",
						"materielclassificationid___code": "cysbe",
						"materielclassificationid___name": "cysbe",
						"materielid": "3253648653734144",
						"materielid___code": "2",
						"materielid___name": "2"
					}
				],
				"clientList": [
					{
						"id": "2148930794371940364",
						"pk_vehicle": "2148930794371940361",
						"clientclassificationid": "3004531958878464",
						"clientclassificationid___code": "cysbe",
						"clientclassificationid___name": "cysbe",
						"clientid": "3253648653734144",
						"clientid___code": "2",
						"clientid___name": "2"
					}
				],
				"supplierList": [
					{
						"id": "2148930794371940365",
						"pk_vehicle": "2148930794371940361",
						"supplierclassificationid": "3004531958878464",
						"supplierclassificationid___code": "cysbe",
						"supplierclassificationid___name": "cysbe",
						"supplierid": "3004531958878464",
						"supplierid___code": "cysbe",
						"supplierid___name": "cysbe"
					}
				],
				"certificateList": [
					{
						"id": "2148930794371940366",
						"pk_vehicle": "2148930794371940361",
						"licensetype": "5",
						"drivingnumber": "111",
						"enddate": "2025-01-06",
						"status": "1",
						"attachmentId": "111"
					}
				],
				"driverList": [
					{
						"driverid": "",
						"driverid___name": ""
					}
				],
				"sourceUnique": "2148930794371940361",
				"pubts": "2025-04-03 18:37:46"
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

1	2026-01-15

更新

请求说明

车辆分页查询

2	2025-07-29

更新

请求参数 pageIndex

更新

请求参数 pageSize

车辆分页查询

3	2025-06-30

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

