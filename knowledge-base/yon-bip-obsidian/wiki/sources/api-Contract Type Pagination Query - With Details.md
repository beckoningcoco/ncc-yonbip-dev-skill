---
title: "合同类型分页查询-带详情"
apiId: "2214482165768388616"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Contract Type"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Contract Type]
platform_version: "BIP"
source_type: community-api-docs
---

# 合同类型分页查询-带详情

> `ContentType	application/json` 请求方式	POST | 分类: Contract Type (PF)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/rest/integration/contractType/pageQueryWithDetail

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	详情批量查询

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| id | string | 否 | 否 | 合同类型主键 示例：22165490222222220003 |
| ids | string | 否 | 否 | 合同类型主键列表，如果多个，使用,拼接 示例：22165490222222220003, 22165490222423423232303 |
| code | string | 否 | 否 | 合同类型编码，模糊查询 示例：type001 |
| name | string | 否 | 否 | 合同类型名称，模糊查询 示例：类型1 |
| enable | string | 否 | 否 | 启用状态（1 启用 0 停用） 示例：1 |
| pubts | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 增量查询时间，即查询该时间点后新增或修改的数据 示例：2024-12-12 12:12:12 |
| page | object | 否 | 否 | 分页信息 |
| pageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 当前分页 示例：1 默认值：1 |
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 分页大小，建议分页大小不要超过500 示例：10 默认值：10 |

## 3. 请求示例

Url: /yonbip/digitalModel/rest/integration/contractType/pageQueryWithDetail?access_token=访问令牌
Body: {
	"id": "22165490222222220003",
	"ids": "22165490222222220003, 22165490222423423232303",
	"code": "type001",
	"name": "类型1",
	"enable": "1",
	"pubts": "2024-12-12 12:12:12",
	"page": {
		"pageIndex": 1,
		"pageSize": 10
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 接口状态 示例：200 |
| message | string | 否 | 接口信息 示例：接口信息 |
| data | object | 否 | 接口数据 |
| pageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 当前分页 示例：1 |
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | 分页大小 示例：20 |
| recordCount | number |
| 小数位数:0,最大长度:10 | 否 | 总数量 示例：7 |
| recordList | object | 是 | 数据 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "接口信息",
	"data": {
		"pageIndex": 1,
		"pageSize": 20,
		"recordCount": 7,
		"recordList": [
			{
				"id": "19111111111196004101",
				"code": "C3",
				"name": {
					"zh_CN": "资产租入合同",
					"en_US": "Asset Lease-in Contract"
				},
				"billTypeId": "1712222222227669506",
				"billTypeId___code": "PMC5004",
				"billTypeId___name": "项目活动",
				"enable": "0",
				"contractGroupId": "19753322222226004096",
				"remark": {
					"zh_CN": "",
					"en_US": ""
				},
				"adaptallorgs": false,
				"creator": "00001951-7ca3-4xxxxxxxxxd5a66e3e6724",
				"createTime": "2024-04-15 13:38:39",
				"modifier": "7071cd2f-c32xxxxxxxxxxxba1a5ab3e77b",
				"modifyTime": "2025-02-25 19:49:15",
				"pubts": "2025-02-25 19:49:15",
				"contractType_transTypeIdList": [
					{
						"id": "221002222222228",
						"transTypeId": "19752xxxxxx1503320",
						"transTypeId___code": "PMC5004-01",
						"transTypeId___name": "项目活动",
						"fkid": "19111111111196004101"
					}
				],
				"contracttypescopeList": [
					{
						"id": "2210001535557959685",
						"orgId": "1333333333316939013",
						"orgId___code": "sdfggf",
						"orgId___name": "test数1223",
						"adaptalldepts": false,
						"contracttypescope_deptIdsList": [
							{
								"id": "22102323232323223686",
								"fkid": "221002222222228",
								"deptIds": "197xxxx1233314881",
								"deptIds___code": "jhgfd",
								"deptIds___name": "test部门"
							}
						]
					}
				]
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

500	未知异常	未知异常，请联系管理员

10000	服务内部异常	服务内部异常，请联系管理员


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

