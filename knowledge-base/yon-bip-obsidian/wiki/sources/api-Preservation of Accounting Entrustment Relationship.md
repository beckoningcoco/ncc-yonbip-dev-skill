---
title: "核算委托关系保存"
apiId: "7035902e8070487b90a3cd74768dc4a6"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Accounting Delegation"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Accounting Delegation]
platform_version: "BIP"
source_type: community-api-docs
---

# 核算委托关系保存

> `ContentType	application/json` 请求方式	POST | 分类: Accounting Delegation (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/accountDelegate/save

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
| adminOrg | string | 否 | 否 | 业务单元id，业务单元id和业务单元编码不能同时为空，id和编码同时存在，以id为准 示例：2175471207666176 |
| adminOrgCode | string | 否 | 否 | 业务单元编码，业务单元id和业务单元编码不能同时为空，id和编码同时存在，以id为准 示例：34er |
| finOrg | string | 否 | 否 | 会计主体id，会计主体id和会计主体编码不能同时为空，id和编码同时存在，以id为准 示例：2175454748643840 |
| finOrgCode | string | 否 | 否 | 会计主体编码，会计主体id和会计主体编码不能同时为空，id和编码同时存在，以id为准 示例：tyu |
| enable | string | 否 | 是 | 启用状态 0-未启用；1-启用 示例：0 |

## 3. 请求示例

Url: /yonbip/digitalModel/accountDelegate/save?access_token=访问令牌
Body: {
	"data": {
		"adminOrg": "2175471207666176",
		"adminOrgCode": "34er",
		"finOrg": "2175454748643840",
		"finOrgCode": "tyu",
		"enable": "0"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 返回码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 后端服务返回的数据部分 |
| adminOrg | string | 否 | 业务单元 示例：2175471207666176 |
| finOrg | string | 否 | 会计主体 示例：2175454748643840 |
| dataSource | string | 否 | 数据源 示例：bd.delegate.AccountingDelegateVO |
| enable | long | 否 | 启用状态0：未启用；1：启用；2：停用 示例：0 |
| id | string | 否 | 主键 示例：2342175281172736 |
| creator | string | 否 | 创建人 示例：99ea7655-00a2-4bda-b23c-19ade37ea574 |
| dr | long | 否 | 删除标识 0-未删除；1-已删除 示例：0 |
| creationtime | string | 否 | 创建时间 示例：2021-07-13 13:43:54 |
| sysid | string | 否 | 系统id 示例：diwork |
| pubts | string | 否 | 时间戳 示例：2021-07-13 13:43:55 |
| yhtTenant | string | 否 | 友互通租户 示例：czqne4bp |
| tenant | string | 否 | 租户 示例：czqne4bp |
| yhtTenantId | string | 否 | 友互通租户id 示例：czqne4bp |
| yTenantId | string | 否 | 租户id 示例：czqne4bp |
| displayCode | string | 否 | 业务异常码 示例：000-545-100001 |
| level | number |
| 小数位数:0,最大长度:1 | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"adminOrg": "2175471207666176",
		"finOrg": "2175454748643840",
		"dataSource": "bd.delegate.AccountingDelegateVO",
		"enable": 0,
		"id": "2342175281172736",
		"creator": "99ea7655-00a2-4bda-b23c-19ade37ea574",
		"dr": 0,
		"creationtime": "2021-07-13 13:43:54",
		"sysid": "diwork",
		"pubts": "2021-07-13 13:43:55",
		"yhtTenant": "czqne4bp",
		"tenant": "czqne4bp",
		"yhtTenantId": "czqne4bp",
		"yTenantId": "czqne4bp"
	},
	"displayCode": "000-545-100001",
	"level": 0
}

## 6. 业务异常码

000-545-000514

根据id未查询到任何数据,请输入正确的id


## 7. 错误返回码

999	组织单元+会计主体已经存在，不允许重复，请检查


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

