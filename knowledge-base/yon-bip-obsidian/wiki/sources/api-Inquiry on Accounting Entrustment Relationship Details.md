---
title: "核算委托关系详情查询"
apiId: "c96a3d2547954ca5bb96104352598880"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Accounting Delegation"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Accounting Delegation]
platform_version: "BIP"
source_type: community-api-docs
---

# 核算委托关系详情查询

> `ContentType	application/json` 请求方式	GET | 分类: Accounting Delegation (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/accountDelegate/detail

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

Url: /yonbip/digitalModel/accountDelegate/detail?access_token=访问令牌&id=1297742410125568

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 状态码 示例：200 |
| message | string | 否 | 提示信息 示例：操作成功 |
| data | object | 否 | 后端服务返回的数据部分 |
| admin_org_name | string | 否 | 业务单元名称 示例：ym采购库存组织 |
| modifier | string | 否 | 修改人 示例：99ea7655-00a2-4bda-b23c-19ade37ea574 |
| modifier_userName | string | 否 | 修改人名称 示例：不要乱改我叫吴签 |
| adminOrg | string | 否 | 业务单元 示例：1294961444212992 |
| finOrg | string | 否 | 会计主体 示例：1293432671916288 |
| modifiedtime | string | 否 | 修改时间 示例：2019-07-06 18:11:51 |
| enable | long | 否 | 启用状态 0-未启用；1-启用；2-停用 示例：1 |
| fin_org_name | string | 否 | 会计主体名称 示例：王宁的组织 |
| id | string | 否 | 主键 示例：1297742410125568 |
| pubts | string | 否 | 时间戳 示例：2019-07-06 18:11:47 |
| creator | string | 否 | 创建人 示例：1838579e-6b2a-40e0-8c36-9d64817ba53c |
| creator_userName | string | 否 | 创建人名称 示例：不要乱改我叫吴签 |
| creationtime | string | 否 | 创建时间 示例：2021-07-07 09:43:54 |
| dataSource | string | 否 | 数据源 示例：bd.delegate.PurchaseDelegateVO |
| displayCode | string | 否 | 业务异常码 示例：000-545-100001 |
| level | number |
| 小数位数:0,最大长度:1 | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"admin_org_name": "ym采购库存组织",
		"modifier": "99ea7655-00a2-4bda-b23c-19ade37ea574",
		"modifier_userName": "不要乱改我叫吴签",
		"adminOrg": "1294961444212992",
		"finOrg": "1293432671916288",
		"modifiedtime": "2019-07-06 18:11:51",
		"enable": 1,
		"fin_org_name": "王宁的组织",
		"id": "1297742410125568",
		"pubts": "2019-07-06 18:11:47",
		"creator": "1838579e-6b2a-40e0-8c36-9d64817ba53c",
		"creator_userName": "不要乱改我叫吴签",
		"creationtime": "2021-07-07 09:43:54",
		"dataSource": "bd.delegate.PurchaseDelegateVO"
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

