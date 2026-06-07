---
title: "顶级组织查询"
apiId: "1509206642769526787"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Business Unit"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Business Unit]
platform_version: "BIP"
source_type: community-api-docs
---

# 顶级组织查询

> `ContentType	application/json` 请求方式	POST | 分类: Business Unit (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/queryRootOrgInfos

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
| funcType | string | 否 | 是 | 职能类型，树形结构的职能有 adminorg-人力职能；financeorg-会计主体；salesorg-销售组织；orgunit-业务单元 示例：adminorg |
| id | string | 否 | 否 | 当前组织主键,主键和编码，两者输入一个即可，同时输入以id为准 |
| code | string | 否 | 否 | 当前组织编码，主键和编码，两者输入一个即可，同时输入以id为准 示例：AAAF123 |

## 3. 请求示例

Url: /yonbip/digitalModel/queryRootOrgInfos?access_token=访问令牌
Body: {
	"funcType": "adminorg",
	"id": "",
	"code": "AAAF123"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 状态码 示例：200 |
| message | string | 否 | 提示信息 示例：操作成功 |
| data | object | 否 | 后端服务返回的数据部分 |
| is_biz_unit | long | 否 | 是否是组织，1 是组织，0 不是组织 示例：1 |
| id | string | 否 | 主键 示例：2652290198573312 |
| code | string | 否 | 编码 示例：AAAF123 |
| name | string | 否 | 名称 示例：AAAF123 |
| shortname | string | 否 | 简称 示例：213 |
| orgtype | long | 否 | 是否是部门，2 是部门，1 不是部门 示例：1 |
| enable | long | 否 | 启用状态 0-未启用；1-启用；2-停用 示例：1 |
| effectivedate | string | 否 | 生效时间 示例：2022-03-23 15:35:44 |
| expirationdate | string | 否 | 失效时间 示例：2022-04-26 14:18:04 |
| parentid | string | 否 | 父节点id |
| creator | string | 否 | 创建人 示例：99ea7655-00a2-4bda-b23c-19ade37ea574 |
| creationtime | string | 否 | 创建时间 示例：2022-02-17 15:29:07 |
| modifier | string | 否 | 修改人 示例：99ea7655-00a2-4bda-b23c-19ade37ea574 |
| modifiedtime | string | 否 | 修改时间 示例：2022-06-08 10:33:00 |
| companytype | string | 否 | 公司类型id 示例：45ebda24614f424abe5dfb04e00f737c |
| displayorder | long | 否 | 排序 示例：0 |
| exchangerate | string | 否 | 汇率类型id 示例：d1pf7qji |
| displayCode | string | 否 | 业务异常码 示例：000-545-100001 |
| level | number |
| 小数位数:0,最大长度:1 | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"is_biz_unit": 1,
		"id": "2652290198573312",
		"code": "AAAF123",
		"name": "AAAF123",
		"shortname": "213",
		"orgtype": 1,
		"enable": 1,
		"effectivedate": "2022-03-23 15:35:44",
		"expirationdate": "2022-04-26 14:18:04",
		"parentid": "",
		"creator": "99ea7655-00a2-4bda-b23c-19ade37ea574",
		"creationtime": "2022-02-17 15:29:07",
		"modifier": "99ea7655-00a2-4bda-b23c-19ade37ea574",
		"modifiedtime": "2022-06-08 10:33:00",
		"companytype": "45ebda24614f424abe5dfb04e00f737c",
		"displayorder": 0,
		"exchangerate": "d1pf7qji"
	},
	"displayCode": "000-545-100001",
	"level": 0
}

## 6. 业务异常码

000-545-000510

id、code两者之间至少输入一个

000-545-000511

根据code未查询到对应的id，请检查该code


## 7. 错误返回码

999	根据code未查询到对应的id，请检查该codeAAAF123xxxxx是否在对应的职能表中存在	修改code


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

