---
title: "部门树查询"
apiId: "562fd787163f48beb14cd186ceb224ce"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Department"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Department]
platform_version: "BIP"
source_type: community-api-docs
---

# 部门树查询

> `ContentType	application/json` 请求方式	POST | 分类: Department (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/admindept/tree

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
| externalData | object | 否 | 是 | 业务数据 |
| parentorgid | string | 否 | 否 | 所属行政组织id，所属行政组织id和所属行政组织编码不能同时为空，所属行政组织id和所属行政组织编码同时存在，以所属行政组织编码为准 |
| parentorgcode | string | 否 | 否 | 所属行政组织编码，所属行政组织id和所属行政组织编码不能同时为空，所属行政组织id和所属行政组织编码同时存在，以所属行政组织编码为准 |
| enable | string | 是 | 是 | 是否启用 0未启用 1启用 2停用 |
| pubts | string | 否 | 否 | 时间戳，查询结果大于时间戳数据 例如"2023-10-10 00:00:00" |

## 3. 请求示例

Url: /yonbip/digitalModel/admindept/tree?access_token=访问令牌
Body: {
	"externalData": {
		"parentorgid": "",
		"parentorgcode": "",
		"enable": [
			""
		],
		"pubts": ""
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 |
| message | string | 否 | 调用失败时的错误信息 |
| data | object | 是 | 调用成功时的返回数据 |
| innercode | string | 否 | 内部码 |
| id | string | 否 | 主键id |
| expirationdate | string | 否 | 启用日期,格式为yyyy-MM-dd HHmmss |
| shortname | string | 否 | 简称 |
| name | string | 否 | 部门名称 |
| level | int | 否 | 层级 |
| principal_name | string | 否 | 负责人名称 |
| sort | int | 否 | 排序号 |
| depttype_name | string | 否 | 部门性质名称 |
| parentorgid_name | string | 否 | 组织单元名称 |
| branchleader_name | string | 否 | 分管领导名称 |
| orgid | string | 否 | 基本组织主键 |
| orgtype | string | 否 | 组织类型 1非部门 2部门 |
| isEnd | int | 否 | 是否末级1是 0否 |
| effectivedate | string | 否 | 启用日期,格式为yyyy-MM-dd HHmmss |
| parent_name | string | 否 | 所属上级名称 |
| code | string | 否 | 部门编码 |
| sysid | string | 否 | 应用主键 |
| parent_code | string | 否 | 上级组织 |
| branchleader | string | 否 | 分管领导id |
| enable | int | 否 | 状态, 0:未启用、1:启用、2:停用、 |
| parent | string | 否 | 上级组织id |
| is_biz_unit | string | 否 | 是否组织单元1是 0否 |
| parentorgid | string | 否 | 组织单元id |
| depttype | string | 否 | 部门性质id |
| dr | string | 否 | 删除标识0未删除 1已删除 |
| principal | string | 否 | 负责人id |
| pubts | string | 否 | 时间戳,格式为:yyyy-MM-dd HH:mm:ss 示例：格式为:yyyy-MM-dd HH:mm:ss |
| children | object | 是 | 子集内容 |
| displayCode | string | 否 | 业务异常码 示例：000-545-100001 |
| level | number |
| 小数位数:0,最大长度:1 | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": [
		{
			"innercode": "",
			"id": "",
			"expirationdate": "",
			"shortname": "",
			"name": "",
			"level": 0,
			"principal_name": "",
			"sort": 0,
			"depttype_name": "",
			"parentorgid_name": "",
			"branchleader_name": "",
			"orgid": "",
			"orgtype": "",
			"isEnd": 0,
			"effectivedate": "",
			"parent_name": "",
			"code": "",
			"sysid": "",
			"parent_code": "",
			"branchleader": "",
			"enable": 0,
			"parent": "",
			"is_biz_unit": "",
			"parentorgid": "",
			"depttype": "",
			"dr": "",
			"principal": "",
			"pubts": "格式为:yyyy-MM-dd HH:mm:ss",
			"children": [
				{
					"parent": "",
					"parent_code": "",
					"level": 0,
					"sort": 0,
					"isEnd": 0,
					"orgid": 0,
					"code": "",
					"name": "",
					"parent_name": "",
					"depttype": "",
					"depttype_name": "",
					"principal": "",
					"principal_name": "",
					"branchleader": "",
					"branchleader_name": "",
					"id": "",
					"pubts": "",
					"dr": "",
					"parentorgid": "",
					"parentorgid_name": "",
					"orgtype": "",
					"enable": 0,
					"innercode": "",
					"sysid": "",
					"effectivedate": "",
					"expirationdate": "",
					"is_biz_unit": ""
				}
			]
		}
	],
	"displayCode": "000-545-100001",
	"level": 0
}

## 6. 业务异常码

000-545-100001

所属组织不存在


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

