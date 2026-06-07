---
title: "资产管理委托关系列表查询"
apiId: "1f3f05d9a675450a816ef5d0d355c6ec"
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

# 资产管理委托关系列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Asset Management Delegation (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/assetsDelegate/list

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
| pageIndex | string | 否 | 是 | 当前页数 示例：1 |
| pageSize | string | 否 | 是 | 每页数量 示例：20 |
| financeOrg | string | 否 | 否 | 会计主体 示例：1951614022816768 |
| financeOrgCode | string | 否 | 否 | 会计主体编码 示例：45tr |
| assetsOrg | string | 否 | 否 | 资产组织 示例：1951591063933184 |
| assetsOrgCode | string | 否 | 否 | 资产组织编码 示例：23se |
| enable | string | 否 | 否 | 启用状态 0-未启用；1-启用；2-停用 示例：1 |

## 3. 请求示例

Url: /yonbip/digitalModel/assetsDelegate/list?access_token=访问令牌
Body: {
	"pageIndex": "1",
	"pageSize": "20",
	"financeOrg": "1951614022816768",
	"financeOrgCode": "45tr",
	"assetsOrg": "1951591063933184",
	"assetsOrgCode": "23se",
	"enable": "1"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 提示信息 示例：操作成功 |
| data | object | 否 | 后端服务返回的数据部分 |
| pageIndex | long | 否 | 当前页 示例：1 |
| pageSize | long | 否 | 每页数量 示例：1 |
| recordCount | long | 否 | 总条数 示例：8 |
| recordList | object | 是 | 记录列表 |
| pageCount | long | 否 | 总页数 示例：8 |
| beginPageIndex | long | 否 | 起始页 示例：1 |
| endPageIndex | long | 否 | 最后一页 示例：0 |
| displayCode | string | 否 | 业务异常码 示例：000-545-100001 |
| level | number |
| 小数位数:0,最大长度:1 | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 1,
		"recordCount": 8,
		"recordList": [
			{
				"financeOrg": "2243046049255680",
				"financeOrg_name": "资产组织1",
				"assetsOrg": "2243046049255680",
				"assetsOrg_Name": "资产组织1",
				"creator": "1838579e-6b2a-40e0-8c36-9d64817ba53c",
				"enable": 1,
				"creator_userName": "系统操作员",
				"modifier": "99ea7655-00a2-4bda-b23c-19ade37ea574",
				"modifier_userName": "小明",
				"id": "2243052518281472",
				"creationtime": "2021-05-04 13:11:01",
				"pubts": "2021-05-04 13:11:01"
			}
		],
		"pageCount": 8,
		"beginPageIndex": 1,
		"endPageIndex": 0
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

