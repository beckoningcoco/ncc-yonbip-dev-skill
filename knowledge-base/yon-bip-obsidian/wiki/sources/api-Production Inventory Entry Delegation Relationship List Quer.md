---
title: "生产入库委托关系列表查询"
apiId: "16b76e7c839e466480a6e9854778b262"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Production Receipt Delegation"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Production Receipt Delegation]
platform_version: "BIP"
source_type: community-api-docs
---

# 生产入库委托关系列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Production Receipt Delegation (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/productstorageDelegate/list

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
| pageIndex | string | 否 | 是 | 当前页 示例：1 |
| pageSize | string | 否 | 是 | 每页条数 示例：20 |
| factoryOrg | string | 否 | 否 | 工厂组织 示例：1951614022816768 |
| factoryOrgCode | string | 否 | 否 | 工厂组织编码 示例：4532 |
| inventoryOrg | string | 否 | 否 | 入库库存组织 示例：1951591063933184 |
| inventoryOrgCode | string | 否 | 否 | 入库库存组织编码 示例：4567 |

## 3. 请求示例

Url: /yonbip/digitalModel/productstorageDelegate/list?access_token=访问令牌
Body: {
	"pageIndex": "1",
	"pageSize": "20",
	"factoryOrg": "1951614022816768",
	"factoryOrgCode": "4532",
	"inventoryOrg": "1951591063933184",
	"inventoryOrgCode": "4567"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 状态码 示例：200 |
| message | string | 否 | 提示信息 示例：操作成功 |
| data | object | 否 | 数据 |
| pageIndex | long | 否 | 页码 示例：1 |
| pageSize | long | 否 | 页面大小 示例：2 |
| recordCount | long | 否 | 总条数 示例：4 |
| recordList | object | 是 | 记录列表 |
| pageCount | long | 否 | 分页大小 示例：2 |
| beginPageIndex | long | 否 | 起始页码 示例：1 |
| endPageIndex | long | 否 | 终止页码 示例：2 |
| displayCode | string | 否 | 业务异常码 示例：000-545-100001 |
| level | number |
| 小数位数:0,最大长度:1 | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 2,
		"recordCount": 4,
		"recordList": [
			{
				"inventoryOrg": "2144393733083392",
				"inventoryOrg_name": "bx-全职能组织",
				"isDefault": 0,
				"creator": "1838579e-6b2a-40e0-8c36-9d64817ba53c",
				"enable": 1,
				"creator_userName": "19904568888",
				"factoryOrg": "2144393733083392",
				"id": "2342235347472640",
				"factoryOrg_name": "bx-全职能组织",
				"creationtime": "2021-07-13 14:45:00",
				"pubts": "2021-07-13 14:45:00",
				"modifier": "1838579e-6b2a-40e0-8c36-9d64817ba53c",
				"modifier_userName": "19904568888",
				"modifiedtime": "2021-07-13 14:45:00"
			}
		],
		"pageCount": 2,
		"beginPageIndex": 1,
		"endPageIndex": 2
	},
	"displayCode": "000-545-100001",
	"level": 0
}

## 6. 业务异常码

000-545-000514

根据id未查询到任何数据,请输入正确的id


## 7. 错误返回码

999	服务端逻辑异常


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-02

新增

返回参数 displayCode

新增

返回参数 level


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

