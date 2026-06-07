---
title: "职能共享保存"
apiId: "2126959614369988616"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Function Sharing Settings"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Function Sharing Settings]
platform_version: "BIP"
source_type: community-api-docs
---

# 职能共享保存

> `ContentType	application/json` 请求方式	POST | 分类: Function Sharing Settings (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/funshare/save

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
| shareOrgId | string | 否 | 否 | 共享组织主键，当共享组织编码为空时，必输 示例：123 |
| shareOrgCode | string | 否 | 否 | 共享组织编码，当共享组织主键为空时，必输 示例：code |
| shareDeptId | string | 否 | 否 | 共享部门主键 示例：456 |
| shareDeptCode | string | 否 | 否 | 共享部门编码 示例：code2 |
| enable | number |
| 小数位数:0,最大长度:1 | 否 | 否 | 保存后的状态。0：未启用；1：启用；2：停用 示例：1 默认值：1 |
| description | string | 否 | 否 | 备注 示例：备注 |
| serviceOrgList | object | 是 | 否 | 服务组织列表。如存在重复的服务组织，则会覆盖掉旧的记录。 |
| serviceOrgId | string | 否 | 否 | 服务组织主键 示例：789 |
| serviceOrgCode | string | 否 | 否 | 服务组织编码 示例：code3 |
| funcTypeList | string | 是 | 否 | 共享业务职能编码。仅支持以下职能：purchaseorg：采购，salesorg：销售，inventoryorg：库存，factoryorg：工厂，assetsorg：资产，maintainorg：维修，other：其他 示例：["inventoryorg","other"] |

## 3. 请求示例

Url: /yonbip/digitalModel/funshare/save?access_token=访问令牌
Body: {
	"shareOrgId": "123",
	"shareOrgCode": "code",
	"shareDeptId": "456",
	"shareDeptCode": "code2",
	"enable": 1,
	"description": "备注",
	"serviceOrgList": [
		{
			"serviceOrgId": "789",
			"serviceOrgCode": "code3",
			"funcTypeList": [
				"inventoryorg",
				"other"
			]
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | number |
| 小数位数:0,最大长度:10 | 否 | code 示例：200 |
| message | string | 否 | message 示例：操作成功 |
| data | object | 否 | data |
| id | string | 否 | id 示例：2126843924961034255 |
| pubts | string | 否 | pubts 示例：Tue Nov 05 20:43:18 CST 2024 |
| shareOrgId | string | 否 | shareOrgId 示例：2002799548625321990 |
| shareOrgCode | string | 否 | shareOrgCode 示例：098bx |
| shareOrgName | string | 否 | shareOrgName 示例：Sivir |
| enable | number |
| 小数位数:0,最大长度:1 | 否 | enable 示例：1 |
| serviceOrgList | object | 是 | serviceOrgList |
| traceId | string | 否 | traceId 示例：e33930cbc5a541e3 |
| uploadable | string | 否 | uploadable 示例：0 |
| displayCode | string | 否 | 业务异常码 示例：000-545-100001 |
| level | number |
| 小数位数:0,最大长度:1 | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"id": "2126843924961034255",
		"pubts": "Tue Nov 05 20:43:18 CST 2024",
		"shareOrgId": "2002799548625321990",
		"shareOrgCode": "098bx",
		"shareOrgName": "Sivir",
		"enable": 1,
		"serviceOrgList": [
			{
				"id": "2126958823926136840",
				"serviceOrgId": "1973012447192154121",
				"serviceOrgCode": "zz",
				"serviceOrgName": "zz",
				"funcTypeList": [
					"other",
					"assetsorg"
				]
			}
		]
	},
	"traceId": "e33930cbc5a541e3",
	"uploadable": "0",
	"displayCode": "000-545-100001",
	"level": 0
}

## 6. 业务异常码

000-545-000514

根据id未查询到任何数据,请输入正确的id


## 7. 错误返回码

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-09-20

更新

请求说明

更新

请求参数 shareOrgId

更新

请求参数 shareOrgCode

2	2025-07-02

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

