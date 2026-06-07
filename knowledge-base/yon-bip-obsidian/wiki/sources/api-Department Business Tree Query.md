---
title: "部门业务树查询"
apiId: "2050484852636516355"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Department"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Department]
platform_version: "BIP"
source_type: community-api-docs
---

# 部门业务树查询

> `ContentType	application/json` 请求方式	POST | 分类: Department (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/admindept/getbizdept

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
| parentorgid | string | 否 | 否 | 组织主键。组织主键和组织编码至少传一个，建议使用主键 示例：123456789 |
| code | string | 否 | 否 | 组织编码。组织主键和组织编码至少传一个，建议使用主键 示例：dept_code |
| enable | object | 是 | 否 | 部门状态。0：未启用，1：启用，2：停用 示例：[0, 1, 2] |
| funcCode | string | 否 | 否 | 业务职能。如需支持职能共享逻辑，需传递该参数。如果是不区分传 all（区分大小写），传空或者传 null 则不追加职能共享逻辑。 支持的职能有：salesorg 销售组织，inventoryorg 库存组织，purchaseorg 采购组织，financeorg 会计主体，factoryorg 工厂组织，other 其他，如需查询全部职能请传递 all 示例：all |
| accountingDelegate | boolean | 否 | 否 | 是否添加核算委托关系的逻辑 示例：true 默认值：false |

## 3. 请求示例

Url: /yonbip/digitalModel/admindept/getbizdept?access_token=访问令牌
Body: {
	"parentorgid": "123456789",
	"code": "dept_code",
	"enable": [
		0,
		1,
		2
	],
	"funcCode": "all",
	"accountingDelegate": true
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | code 示例：200 |
| message | string | 否 | message |
| data | object | 否 | data |
| id | string | 否 | id 示例：“12345566” |
| code | string | 否 | code 示例：”code“ |
| name | string | 否 | name 示例：部门名称 |
| parentId | string | 否 | parentId 示例：9999999 |
| parentCode | string | 否 | parentCode 示例：parentCode |
| isBizUnit | number |
| 小数位数:0,最大长度:10 | 否 | isBizUnit 示例：1 |
| orgType | number |
| 小数位数:0,最大长度:10 | 否 | orgType 示例：2 |
| children | object | 是 | children |
| displayCode | string | 否 | 业务异常码 示例：000-545-100001 |
| level | number |
| 小数位数:0,最大长度:1 | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"id": "“12345566”",
		"code": "”code“",
		"name": "部门名称",
		"parentId": "9999999",
		"parentCode": "parentCode",
		"isBizUnit": 1,
		"orgType": 2,
		"children": [
			{
				"id": "“1234”",
				"code": "”code2“",
				"name": "部门名称",
				"parentId": "12345566",
				"parentCode": "code",
				"isBizUnit": 1,
				"orgType": 2
			}
		]
	},
	"displayCode": "000-545-100001",
	"level": 0
}

## 6. 业务异常码

000-545-000510

id、code两者之间至少输入一个


## 7. 错误返回码

999	null


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-02

新增

返回参数 (19)

更新

返回参数 code

删除

返回参数 (7)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

