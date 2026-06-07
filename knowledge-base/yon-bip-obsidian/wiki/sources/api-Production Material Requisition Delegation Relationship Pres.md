---
title: "生产领料委托关系保存"
apiId: "609b75b4fb894280a12cae6dd7a2aa8c"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Production Picking Delegation"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Production Picking Delegation]
platform_version: "BIP"
source_type: community-api-docs
---

# 生产领料委托关系保存

> `ContentType	application/json` 请求方式	POST | 分类: Production Picking Delegation (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/pickingDelegate/save

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
| data | object | 否 | 是 | 数据参数 |
| factoryOrg | string | 否 | 否 | 工厂组织id，工厂组织id和工厂组织编码不能同时为空，id和编码同时存在，以id为准 示例：2144393733083392 |
| factoryOrgCode | string | 否 | 否 | 工厂组织编码，工厂组织id和工厂组织编码不能同时为空，id和编码同时存在，以id为准 示例：xxx |
| inventoryOrg | string | 否 | 否 | 发料库存组织id，库存组织id和库存组织编码不能同时为空，id和编码同时存在，以id为准 示例：2144393733083392 |
| inventoryOrgCode | string | 否 | 否 | 发料库存组织编码，库存组织id和库存组织编码不能同时为空，id和编码同时存在，以id为准 示例：456 |
| isDefault | string | 否 | 是 | 是否默认0否，1是 示例：0 |
| enable | string | 否 | 是 | 启用状态0未启用，1启用 示例：1 |

## 3. 请求示例

Url: /yonbip/digitalModel/pickingDelegate/save?access_token=访问令牌
Body: {
	"data": {
		"factoryOrg": "2144393733083392",
		"factoryOrgCode": "xxx",
		"inventoryOrg": "2144393733083392",
		"inventoryOrgCode": "456",
		"isDefault": "0",
		"enable": "1"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 响应编码 示例：200 |
| message | string | 否 | 响应信息 示例：操作成功 |
| data | object | 否 | 响应数据 |
| factoryOrg | string | 否 | 工厂组织主键 示例：2144393733083393 |
| inventoryOrg | string | 否 | 发料库存组织主键 示例：2144393733083392 |
| isDefault | string | 否 | 是否默认，0代表不是默认，1代表是默认 示例：0 |
| enable | long | 否 | 启用状态，0未启用，1启用，2停用 示例：1 |
| dr | long | 否 | 删除状态0未删除，1删除 示例：0 |
| id | string | 否 | 主键 示例：2343365892657408 |
| creator | string | 否 | 创建者 示例：1838579e-6b2a-40e0-8c36-9d64817ba53c |
| creationtime | string | 否 | 创建时间 示例：2021-07-14 09:55:03 |
| dataSource | string | 否 | 元数据uri 示例：bd.delegate.ProductStorageDelegateVO |
| sysid | string | 否 | 系统id 示例：diwork |
| pubts | string | 否 | 时间戳 示例：2021-07-14 09:55:03 |
| yhtTenant | string | 否 | 友互通租户id 示例：rw4c7fpf |
| tenant | string | 否 | 租户id 示例：rw4c7fpf |
| yhtTenantId | string | 否 | 友互通租户id 示例：rw4c7fpf |
| yTenantId | string | 否 | Y租户主键 示例：rw4c7fpf |
| displayCode | string | 否 | 业务异常码 示例：000-545-100001 |
| level | number |
| 小数位数:0,最大长度:1 | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"factoryOrg": "2144393733083393",
		"inventoryOrg": "2144393733083392",
		"isDefault": "0",
		"enable": 1,
		"dr": 0,
		"id": "2343365892657408",
		"creator": "1838579e-6b2a-40e0-8c36-9d64817ba53c",
		"creationtime": "2021-07-14 09:55:03",
		"dataSource": "bd.delegate.ProductStorageDelegateVO",
		"sysid": "diwork",
		"pubts": "2021-07-14 09:55:03",
		"yhtTenant": "rw4c7fpf",
		"tenant": "rw4c7fpf",
		"yhtTenantId": "rw4c7fpf",
		"yTenantId": "rw4c7fpf"
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

更新

请求参数 factoryOrgCode

更新

请求参数 inventoryOrgCode

新增

返回参数 displayCode

新增

返回参数 level

删除

错误码 999


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

