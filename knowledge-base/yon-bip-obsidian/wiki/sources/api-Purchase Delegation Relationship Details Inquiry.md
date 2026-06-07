---
title: "采购委托关系详情查询"
apiId: "2724f82d429c4cb6a99c1ebeb32c7a35"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Purchase Delegation"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Purchase Delegation]
platform_version: "BIP"
source_type: community-api-docs
---

# 采购委托关系详情查询

> `ContentType	application/json` 请求方式	GET | 分类: Purchase Delegation (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/purchaseDelegate/detail

请求方式	GET

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | string | query | 是 | 主键    示例: 2192414706536704 |

## 3. 请求示例

Url: /yonbip/digitalModel/purchaseDelegate/detail?access_token=访问令牌&id=2192414706536704

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 状态码 示例：200 |
| message | string | 否 | 提示信息 示例：操作成功 |
| data | object | 否 | 内容 |
| product | long | 否 | 物料id 示例：2176909670207744 |
| product_name | string | 否 | 物料名称 示例：0318 新物料 |
| billingOrg | string | 否 | 开票组织id 示例：2166975486939648 |
| billingOrg_name | string | 否 | 开票组织名称 示例：cc1234 |
| inventoryOrg | string | 否 | 需求组织id 示例：2166975486939648 |
| inventoryOrg_name | string | 否 | 需求组织名称 示例：cc1234 |
| purchaseOrg | string | 否 | 采购组织id 示例：2169507551334656 |
| purchase_org_name | string | 否 | 采购组织名称 示例：随单参数测试 |
| isDefault | long | 否 | 是否默认 0否1是 示例：1 |
| enable | long | 否 | 状态 0未启用 1启用 2停用 示例：2 |
| id | string | 否 | 主键 示例：2192414706536704 |
| pubts | string | 否 | 时间戳 示例：2021-07-21 11:32:44 |
| managementClass | long | 否 | 物料分类id |
| managementClass_name | string | 否 | 物料分类名称 |
| displayCode | string | 否 | 业务异常码 示例：000-545-100001 |
| level | number |
| 小数位数:0,最大长度:1 | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"product": 2176909670207744,
		"product_name": "0318 新物料",
		"billingOrg": "2166975486939648",
		"billingOrg_name": "cc1234",
		"inventoryOrg": "2166975486939648",
		"inventoryOrg_name": "cc1234",
		"purchaseOrg": "2169507551334656",
		"purchase_org_name": "随单参数测试",
		"isDefault": 1,
		"enable": 2,
		"id": "2192414706536704",
		"pubts": "2021-07-21 11:32:44",
		"managementClass": 0,
		"managementClass_name": ""
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

