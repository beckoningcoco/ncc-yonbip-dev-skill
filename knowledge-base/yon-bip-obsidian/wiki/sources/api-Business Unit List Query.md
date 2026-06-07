---
title: "业务单元列表查询"
apiId: "a0ff2148a3b14dbd8390c9641179a735"
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

# 业务单元列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Business Unit (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/orgunit/querytree

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
| code | string | 否 | 否 | 组织编码 示例：yy1 |
| name | string | 否 | 否 | 组织名称 示例：测试组织 |
| enable | string | 否 | 否 | 状态, 0:未启用、1:启用、2:停用、 示例：1 |
| pubts | string | 否 | 否 | 时间戳，查询结果大于时间戳数据 例如"2023-10-10 00:00:00" 示例：2023-07-07 00:00:00 |

## 3. 请求示例

Url: /yonbip/digitalModel/orgunit/querytree?access_token=访问令牌
Body: {
	"code": "yy1",
	"name": "测试组织",
	"enable": "1",
	"pubts": "2023-07-07 00:00:00"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 提示信息 示例：操作成功 |
| data | object | 是 | 返回数据 |
| name | string | 否 | 组织名称 示例：yontest云创股份 |
| tenant | string | 否 | 租户 示例：umwz7rz7 |
| pubts | string | 否 | 时间戳 示例：2020-08-29 03:39:14 |
| id | string | 否 | 单元组织id 示例：1511040517705984 |
| level | long | 否 | 层级 示例：1 |
| taxpayername | string | 否 | 纳税人名称 示例：yontest云创股份 |
| modifiedtime | string | 否 | 修改时间 示例：2020-08-28 14:39:14 |
| dr | long | 否 | 删除标识 0：未删除 1：已删除 示例：0 |
| sort | long | 否 | 排序 示例：1 |
| orgid | string | 否 | 组织id 示例：1511040517705984 |
| code | string | 否 | 组织编码 示例：yontest |
| telephone | string | 否 | 电话 示例：62986688 |
| children | object | 是 | 子节点集合 |
| enable | long | 否 | 状态 0:未启用、1:启用、2:停用 示例：1 |
| shortname | string | 否 | 简称 示例：yontest云创股份 |
| tenantid | string | 否 | 租户 示例：umwz7rz7 |
| sysid | string | 否 | 系统id 示例：diwork |
| modifier | string | 否 | 修改人 示例：0b32d89f-3b0b-4008-9c4c-6145422af156 |
| address | string | 否 | 地址 示例：北清路68号 |
| companytype | string | 否 | 公司类型 示例：45ebda24614f424abe5dfb04e00f737c |
| creator | string | 否 | 创建者 示例：0b32d89f-3b0b-4008-9c4c-6145422af156 |
| displayorder | long | 否 | 展示顺序 示例：1 |
| parentid | string | 否 | 上级id |
| creationtime | string | 否 | 创建时间 示例：2019-12-05 00:29:54 |
| innercode | string | 否 | 内部码 示例：THUK |
| taxpayerid | string | 否 | 纳税人id 示例：111111111111111111 |
| orgtype | long | 否 | 组织类型 1：组织 2部门 示例：1 |
| parent | string | 否 | 上级节点 |
| exchangerate | string | 否 | 汇率类型 示例：umwz7rz7 |
| displayCode | string | 否 | 业务异常码 示例：000-545-100001 |
| level | number |
| 小数位数:0,最大长度:1 | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"name": "yontest云创股份",
			"tenant": "umwz7rz7",
			"pubts": "2020-08-29 03:39:14",
			"id": "1511040517705984",
			"level": 1,
			"taxpayername": "yontest云创股份",
			"modifiedtime": "2020-08-28 14:39:14",
			"dr": 0,
			"sort": 1,
			"orgid": "1511040517705984",
			"code": "yontest",
			"telephone": "62986688",
			"children": [
				{
					"isdefault": 0,
					"shortname": "北京仓储中心",
					"pubts": "2020-05-16 13:50:03",
					"id": "1511042233094400",
					"parent": "1511040517705984",
					"sort": 2,
					"creationtime": "2019-12-05 00:31:39",
					"dr": 0,
					"level": 2,
					"parentid": "1511040517705984",
					"taxpayerid": "123456789",
					"modifiedtime": "2019-12-05 03:49:52",
					"displayorder": 2,
					"effectivedate": "2019-12-05 00:31:42",
					"sysid": "diwork",
					"name": "仓储中心-北京",
					"orgid": "1511042233094400",
					"creator": "0b32d89f-3b0b-4008-9c4c-6145422af156",
					"code": "bj_cczx",
					"tenant": "umwz7rz7",
					"exchangerate": "umwz7rz7",
					"modifier": "0b32d89f-3b0b-4008-9c4c-6145422af156",
					"orgtype": 1,
					"ts": "2020-05-16 13:50:03",
					"isbizunit": 1,
					"innercode": "THUKZVPY",
					"companytype": "45ebda24614f424abe5dfb04e00f737j",
					"tenantid": "umwz7rz7",
					"enable": 1
				}
			],
			"enable": 1,
			"shortname": "yontest云创股份",
			"tenantid": "umwz7rz7",
			"sysid": "diwork",
			"modifier": "0b32d89f-3b0b-4008-9c4c-6145422af156",
			"address": "北清路68号",
			"companytype": "45ebda24614f424abe5dfb04e00f737c",
			"creator": "0b32d89f-3b0b-4008-9c4c-6145422af156",
			"displayorder": 1,
			"parentid": "",
			"creationtime": "2019-12-05 00:29:54",
			"innercode": "THUK",
			"taxpayerid": "111111111111111111",
			"orgtype": 1,
			"parent": "",
			"exchangerate": "umwz7rz7"
		}
	],
	"displayCode": "000-545-100001",
	"level": 0
}

## 6. 业务异常码

000-545-100011


## 7. 错误返回码

999	操作失败


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

