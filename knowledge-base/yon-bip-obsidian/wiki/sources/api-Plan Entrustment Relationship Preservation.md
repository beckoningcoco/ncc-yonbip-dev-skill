---
title: "计划委托关系保存"
apiId: "4376303a808d4ca1bc14328261864961"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Plan Delegation"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Plan Delegation]
platform_version: "BIP"
source_type: community-api-docs
---

# 计划委托关系保存

> `ContentType	application/json` 请求方式	POST | 分类: Plan Delegation (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/planDelegate/save

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
| inventoryOrg | string | 否 | 否 | 库存组织id，库存组织id和库存组织编码不能同时为空，id和编码同时存在，以id为准 示例：1968544023319040 |
| inventoryOrgCode | string | 否 | 否 | 库存组织编码，库存组织id和库存组织编码不能同时为空，id和编码同时存在，以id为准 示例：234 |
| planClass | string | 否 | 否 | 物料计划分类， id和编码同时存在，以id为准 示例：1978520156082432 |
| planClassCode | string | 否 | 否 | 物料计划分类编码， id和编码同时存在，以id为准 示例：tyu |
| planOrg | string | 否 | 否 | 计划组织id，计划组织id和计划组织编码不能同时为空，id和编码同时存在，以id为准 示例：1930355100128256 |
| planOrgCode | string | 否 | 否 | 计划组织编码，计划组织id和计划组织编码不能同时为空，id和编码同时存在，以id为准 示例：eee |
| enable | string | 否 | 是 | 启用状态 0-未启用；1-启用 示例：0 |

## 3. 请求示例

Url: /yonbip/digitalModel/planDelegate/save?access_token=访问令牌
Body: {
	"data": {
		"inventoryOrg": "1968544023319040",
		"inventoryOrgCode": "234",
		"planClass": "1978520156082432",
		"planClassCode": "tyu",
		"planOrg": "1930355100128256",
		"planOrgCode": "eee",
		"enable": "0"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| inventoryOrg | string | 否 | 库存组织 示例：1955870188671488 |
| enable | long | 否 | 启用状态0：未启用；1：启用；2：停用 示例：0 |
| planOrg | string | 否 | 计划组织 示例：1930355100128256 |
| planClass | long | 否 | 物料计划分类 示例：1978520156082432 |
| planClassCode | string | 否 | 物料计划分类编码 示例：erty |
| dr | long | 否 | 删除标志 0未删除 1删除 示例：0 |
| id | string | 否 | 主键 示例：2353502743531776 |
| creator | string | 否 | 创建人 示例：00001951-7ca3-47ac-a462-d5a66e3e6724 |
| creationtime | string | 否 | 创建时间 示例：2021-07-21 13:46:47 |
| dataSource | string | 否 | 数据源 示例：bd.delegate.PlanDelegateVO |
| sysid | string | 否 | 系统id 示例：diwork |
| pubts | string | 否 | 时间戳 示例：2021-07-21 13:46:48 |
| yhtTenant | string | 否 | 友互通租户 示例：axva6bo3 |
| tenant | string | 否 | 租户 示例：axva6bo3 |
| yhtTenantId | string | 否 | 友互通租户id 示例：axva6bo3 |
| yTenantId | string | 否 | 租户id 示例：axva6bo3 |
| displayCode | string | 否 | 业务异常码 示例：000-545-100001 |
| level | number |
| 小数位数:0,最大长度:1 | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"inventoryOrg": "1955870188671488",
		"enable": 0,
		"planOrg": "1930355100128256",
		"planClass": 1978520156082432,
		"planClassCode": "erty",
		"dr": 0,
		"id": "2353502743531776",
		"creator": "00001951-7ca3-47ac-a462-d5a66e3e6724",
		"creationtime": "2021-07-21 13:46:47",
		"dataSource": "bd.delegate.PlanDelegateVO",
		"sysid": "diwork",
		"pubts": "2021-07-21 13:46:48",
		"yhtTenant": "axva6bo3",
		"tenant": "axva6bo3",
		"yhtTenantId": "axva6bo3",
		"yTenantId": "axva6bo3"
	},
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

