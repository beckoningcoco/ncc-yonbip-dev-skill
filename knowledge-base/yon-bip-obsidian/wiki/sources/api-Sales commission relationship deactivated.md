---
title: "销售委托关系停用"
apiId: "8436a71161a0484ba43a8c908e2f7f85"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Sales Delegation"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Sales Delegation]
platform_version: "BIP"
source_type: community-api-docs
---

# 销售委托关系停用

> `ContentType	application/json` 请求方式	POST | 分类: Sales Delegation (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/salesDelegate/stop

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
| id | string | 否 | 是 | 委托关系ID 示例：2342175281172736 |

## 3. 请求示例

Url: /yonbip/digitalModel/salesDelegate/stop?access_token=访问令牌
Body: {
	"data": {
		"id": "2342175281172736"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 提示信息 示例：操作成功 |
| data | object | 否 | 后端服务返回的数据部分 |
| _entityName | string | 否 | 实体名称 |
| _keyName | string | 否 | 集合中的key值 |
| billingOrg | string | 否 | 出票组织 示例：2167883528327680 |
| inventoryOrg | string | 否 | 库存组织 示例：2167883528327680 |
| isDefault | long | 否 | 是否默认 0-否；1-是 示例：0 |
| enable | long | 否 | 启用状态 0-未启用；1-启用；2-停用 示例：2 |
| dr | long | 否 | 删除标识 0-未删除；1-已删除 示例：0 |
| id | string | 否 | 主键 示例：2336660455428352 |
| salesOrg | string | 否 | 销售组织 示例：2167883528327680 |
| pubts | string | 否 | 时间戳 示例：2021-07-23 17:02:56 |
| _status | string | 否 | 状态 |
| yhtTenant | string | 否 | 友互通租户 示例：ylwh6ffo |
| tenant | string | 否 | 租户 示例：ylwh6ffo |
| yhtTenantId | string | 否 | 友互通租户id 示例：ylwh6ffo |
| displayCode | string | 否 | 业务异常码 示例：000-545-100001 |
| level | string | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"_entityName": "",
		"_keyName": "",
		"billingOrg": "2167883528327680",
		"inventoryOrg": "2167883528327680",
		"isDefault": 0,
		"enable": 2,
		"dr": 0,
		"id": "2336660455428352",
		"salesOrg": "2167883528327680",
		"pubts": "2021-07-23 17:02:56",
		"_status": "",
		"yhtTenant": "ylwh6ffo",
		"tenant": "ylwh6ffo",
		"yhtTenantId": "ylwh6ffo"
	},
	"displayCode": "000-545-100001",
	"level": "0"
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

