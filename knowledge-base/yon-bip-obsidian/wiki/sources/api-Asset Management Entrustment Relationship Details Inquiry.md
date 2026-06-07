---
title: "资产管理委托关系详情查询"
apiId: "96dd02319a364d798e09ecb5f68251ad"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Asset Management Delegation"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Asset Management Delegation]
platform_version: "BIP"
source_type: community-api-docs
---

# 资产管理委托关系详情查询

> `ContentType	application/json` 请求方式	GET | 分类: Asset Management Delegation (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/assetsDelegate/detail

请求方式	GET

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | string | query | 是 | 主键    示例: 1297742410125568 |

## 3. 请求示例

Url: /yonbip/digitalModel/assetsDelegate/detail?access_token=访问令牌&id=1297742410125568

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 状态码 示例：200 |
| message | string | 否 | 提示信息 示例：操作成功 |
| data | object | 否 | 响应数据 |
| financeOrg | string | 否 | 会计主体id 示例：2243046049255680 |
| financeOrg_name | string | 否 | 会计主体名称 示例：资产组织1 |
| assetsOrg | string | 否 | 资产组织id 示例：2246020692726016 |
| assetsOrg_Name | string | 否 | 资产组织名称 示例：全职能 |
| creator | string | 否 | 创建人 示例：1838579e-6b2a-40e0-8c36-9d64817ba53c |
| creator_userName | string | 否 | 创建人名称 示例：系统操作员 |
| modifier | string | 否 | 修改人 示例：cfb304c5-0d17-471c-9bc9-ed4206989561 |
| modifier_userName | string | 否 | 修改人名称 示例：小明 |
| modifiedtime | string | 否 | 修改时间 示例：2021-07-23 23:20:12 |
| enable | long | 否 | 启用状态 0-未启用；1-启用；2-停用 示例：1 |
| id | string | 否 | 主键 示例：2243052518281472 |
| creationtime | string | 否 | 创建时间 示例：2021-05-04 13:11:01 |
| pubts | string | 否 | 时间戳 示例：2021-07-23 23:20:13 |
| displayCode | string | 否 | 业务异常码 示例：000-545-100001 |
| level | number |
| 小数位数:0,最大长度:1 | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"financeOrg": "2243046049255680",
		"financeOrg_name": "资产组织1",
		"assetsOrg": "2246020692726016",
		"assetsOrg_Name": "全职能",
		"creator": "1838579e-6b2a-40e0-8c36-9d64817ba53c",
		"creator_userName": "系统操作员",
		"modifier": "cfb304c5-0d17-471c-9bc9-ed4206989561",
		"modifier_userName": "小明",
		"modifiedtime": "2021-07-23 23:20:12",
		"enable": 1,
		"id": "2243052518281472",
		"creationtime": "2021-05-04 13:11:01",
		"pubts": "2021-07-23 23:20:13"
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

