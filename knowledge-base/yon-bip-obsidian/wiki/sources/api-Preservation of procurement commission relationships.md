---
title: "采购委托关系保存"
apiId: "763de125450842cb9f8a2724a64902d3"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Purchase Delegation"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Purchase Delegation]
platform_version: "BIP"
source_type: community-api-docs
---

# 采购委托关系保存

> `ContentType	application/json` 请求方式	POST | 分类: Purchase Delegation (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/purchaseDelegate/save

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
| data | object | 否 | 是 | 数据集合 |
| inventoryOrg | string | 否 | 否 | 需求组织id，需求组织id和需求组织编码不能同时为空，id和编码同时存在，以id为准 示例：2077270442905856 |
| inventoryOrgCode | string | 否 | 否 | 需求组织编码，需求组织id和需求组织编码不能同时为空，id和编码同时存在，以id为准 示例：002 |
| managementClass | long | 否 | 否 | 物料分类id，id和编码同时存在，以id为准 示例：2327889849274624 |
| managementClassCode | string | 否 | 否 | 物料分类编码，id和编码同时存在，以id为准 示例：002C |
| product | long | 否 | 否 | 物料id，id和编码同时存在，以id为准 示例：2327889849114624 |
| productCode | string | 否 | 否 | 物料编码，id和编码同时存在，以id为准 示例：002A |
| purchaseOrg | string | 否 | 否 | 采购组织id，采购组织id和采购组织编码不能同时为空，id和编码同时存在，以id为准 示例：2077265414787328 |
| purchaseOrgCode | string | 否 | 否 | 采购组织编码，采购组织id和采购组织编码不能同时为空，id和编码同时存在，以id为准 示例：003A |
| receiveOrg | string | 否 | 否 | 收货组织id，id和编码同时存在，以id为准 示例：2292931344355584 |
| receiveOrgCode | string | 否 | 否 | 收货组织编码，id和编码同时存在，以id为准 示例：001B |
| billingOrg | string | 否 | 否 | 开票组织id，开票组织id和开票组织编码不能同时为空，id和编码同时存在，以id为准 示例：2292385765512704 |
| billingOrgCode | string | 否 | 否 | 开票组织编码，开票组织id和开票组织编码不能同时为空，id和编码同时存在，以id为准 示例：002 |
| isDefault | string | 否 | 是 | 是否默认 1是0否 示例：0 |
| enable | string | 否 | 是 | 状态0未启用 1启用 示例：1 |

## 3. 请求示例

Url: /yonbip/digitalModel/purchaseDelegate/save?access_token=访问令牌
Body: {
	"data": {
		"inventoryOrg": "2077270442905856",
		"inventoryOrgCode": "002",
		"managementClass": 2327889849274624,
		"managementClassCode": "002C",
		"product": 2327889849114624,
		"productCode": "002A",
		"purchaseOrg": "2077265414787328",
		"purchaseOrgCode": "003A",
		"receiveOrg": "2292931344355584",
		"receiveOrgCode": "001B",
		"billingOrg": "2292385765512704",
		"billingOrgCode": "002",
		"isDefault": "0",
		"enable": "1"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 状态码 示例：200 |
| message | string | 否 | 提示信息 示例：操作成功 |
| data | object | 否 | 内容 |
| inventoryOrg | string | 否 | 需求组织id 示例：2077264420327936 |
| inventoryOrgCode | string | 否 | 需求组织编码 示例：0001G |
| managementClass | long | 否 | 物料分类id 示例：2312627530731776 |
| managementClassCode | string | 否 | 物料分类编码 示例：0001E |
| product | string | 否 | 物料id 示例：2312627530731000 |
| productCode | string | 否 | 物料编码 示例：0002A |
| receiveOrg | string | 否 | 收货组织id 示例：2175187487855104 |
| receiveOrgCode | string | 否 | 收货组织编码 示例：0001C |
| purchaseOrg | string | 否 | 采购组织id 示例：2077265414787328 |
| purchaseOrgCode | string | 否 | 采购组织编码 示例：0001D |
| billingOrg | string | 否 | 开票组织id 示例：2153733333176576 |
| billingOrgCode | string | 否 | 开票组织编码 示例：0001B |
| isDefault | long | 否 | 是否默认0否 1是 示例：0 |
| enable | long | 否 | 状态0未启用 1启用 示例：1 |
| dr | long | 否 | 是否删除 0否1是 示例：0 |
| id | string | 否 | 主键 示例：2353626891374848 |
| sysid | string | 否 | 系统标识 示例：diwork |
| yhtTenant | string | 否 | 友互通租户 示例：i88h0bai |
| tenant | string | 否 | 租户 示例：i88h0bai |
| yhtTenantId | string | 否 | 友互通租户id 示例：i88h0bai |
| displayCode | string | 否 | 业务异常码 示例：000-545-100001 |
| level | number |
| 小数位数:0,最大长度:1 | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"inventoryOrg": "2077264420327936",
		"inventoryOrgCode": "0001G",
		"managementClass": 2312627530731776,
		"managementClassCode": "0001E",
		"product": "2312627530731000",
		"productCode": "0002A",
		"receiveOrg": "2175187487855104",
		"receiveOrgCode": "0001C",
		"purchaseOrg": "2077265414787328",
		"purchaseOrgCode": "0001D",
		"billingOrg": "2153733333176576",
		"billingOrgCode": "0001B",
		"isDefault": 0,
		"enable": 1,
		"dr": 0,
		"id": "2353626891374848",
		"sysid": "diwork",
		"yhtTenant": "i88h0bai",
		"tenant": "i88h0bai",
		"yhtTenantId": "i88h0bai"
	},
	"displayCode": "000-545-100001",
	"level": 0
}

## 6. 业务异常码

000-545-000514

根据id未查询到任何数据,请输入正确的id


## 7. 错误返回码

999	需求组织+物料分类或物料+采购组织已经存在，请检查


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-02

更新

请求参数 (7)

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

