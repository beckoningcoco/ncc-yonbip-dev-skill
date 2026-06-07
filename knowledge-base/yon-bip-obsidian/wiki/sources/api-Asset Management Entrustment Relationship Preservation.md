---
title: "资产管理委托关系保存"
apiId: "fbe73d24c3b444b6a3b48b9210d01995"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Asset Management Delegation"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Asset Management Delegation]
platform_version: "BIP"
source_type: community-api-docs
---

# 资产管理委托关系保存

> `ContentType	application/json` 请求方式	POST | 分类: Asset Management Delegation (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/assetsDelegate/save

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
| financeOrg | string | 否 | 否 | 会计主体id，会计主体id和会计主体编码不能同时为空，id和编码同时存在，以id为准 示例：2175471207666176 |
| financeOrgCode | string | 否 | 否 | 会计主体编码，会计主体id和会计主体编码不能同时为空，id和编码同时存在，以id为准 示例：45 |
| assetsOrg | string | 否 | 否 | 资产组织id，资产组织id和资产组织编码不能同时为空，id和编码同时存在，以id为准 示例：2175454748643840 |
| assetsOrgCode | string | 否 | 否 | 资产组织编码，资产组织id和资产组织编码不能同时为空，id和编码同时存在，以id为准 示例：6789 |
| enable | string | 否 | 是 | 启用状态 0-未启用；1-启用 示例：0 |

## 3. 请求示例

Url: /yonbip/digitalModel/assetsDelegate/save?access_token=访问令牌
Body: {
	"data": {
		"financeOrg": "2175471207666176",
		"financeOrgCode": "45",
		"assetsOrg": "2175454748643840",
		"assetsOrgCode": "6789",
		"enable": "0"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 状态码 示例：200 |
| message | string | 否 | 提示信息 示例：操作成功 |
| data | object | 否 | 响应数据 |
| financeOrg | string | 否 | 会计主体id 示例：2247136741298688 |
| financeOrgCode | string | 否 | 会计主体编码 示例：ersd |
| assetsOrg | string | 否 | 资产组织id 示例：2246039092695296 |
| assetsOrgCode | string | 否 | 资产组织编码 示例：ys_uy |
| enable | long | 否 | 启用状态 0-未启用；1-启用；2-停用 示例：1 |
| dr | long | 否 | 删除标志位 0-未删除，1-已删除 示例：0 |
| id | string | 否 | 主键 示例：2360910550520064 |
| creator | string | 否 | 创建人 示例：cfb304c5-0d17-471c-9bc9-ed4206989561 |
| creationtime | string | 否 | 创建时间 示例：2021-07-26 19:22:24 |
| dataSource | string | 否 | 数据源 示例：bd.delegate.AssetsDelegateVO |
| sysid | string | 否 | 系统id 示例：diwork |
| pubts | string | 否 | 时间戳 示例：2021-07-26 19:22:24 |
| yhtTenant | string | 否 | 友互通租户 示例：0000KO42POTJDOJAJU0000 |
| tenant | string | 否 | 租户 示例：0000KO42POTJDOJAJU0000 |
| yhtTenantId | string | 否 | 友互通租户Id 示例：0000KO42POTJDOJAJU0000 |
| yTenantId | string | 否 | 租户id 示例：0000KO42POTJDOJAJU0000 |
| displayCode | string | 否 | 业务异常码 示例：000-545-100001 |
| level | number |
| 小数位数:0,最大长度:1 | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"financeOrg": "2247136741298688",
		"financeOrgCode": "ersd",
		"assetsOrg": "2246039092695296",
		"assetsOrgCode": "ys_uy",
		"enable": 1,
		"dr": 0,
		"id": "2360910550520064",
		"creator": "cfb304c5-0d17-471c-9bc9-ed4206989561",
		"creationtime": "2021-07-26 19:22:24",
		"dataSource": "bd.delegate.AssetsDelegateVO",
		"sysid": "diwork",
		"pubts": "2021-07-26 19:22:24",
		"yhtTenant": "0000KO42POTJDOJAJU0000",
		"tenant": "0000KO42POTJDOJAJU0000",
		"yhtTenantId": "0000KO42POTJDOJAJU0000",
		"yTenantId": "0000KO42POTJDOJAJU0000"
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

