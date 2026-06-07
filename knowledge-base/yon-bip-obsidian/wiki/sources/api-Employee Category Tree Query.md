---
title: "员工类别树查询"
apiId: "c7679af1235d4619af929457e1385fb1"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Employee Category"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Employee Category]
platform_version: "BIP"
source_type: community-api-docs
---

# 员工类别树查询

> `ContentType	application/json` 请求方式	POST | 分类: Employee Category (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/psnlcatg/tree

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
| pubts | string | 否 | 否 | 时间戳 示例：2020-11-23 16:11:09 |
| code | string | 否 | 否 | 编码 示例：001 |

## 3. 请求示例

Url: /yonbip/digitalModel/psnlcatg/tree?access_token=访问令牌
Body: {
	"pubts": "2020-11-23 16:11:09",
	"code": "001"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 |
| message | string | 否 | 调用失败时的错误信息 |
| data | object | 否 | 调用成功时的返回数据 |
| level | int | 否 | 层级 |
| isEnd | int | 否 | 是否末级 1:是 0:否 |
| id | string | 否 | 主键 |
| creator | string | 否 | 创建者 |
| tenant | string | 否 | 租户id |
| ts | string | 否 | 返回时间 |
| name | string | 否 | 员工类别名称 |
| parent_name | string | 否 | 上级人员名称 |
| path | string | 否 | 路径 |
| memo | string | 否 | 备注 |
| parent | string | 否 | 上级分类id |
| sysid | string | 否 | 应用标识 |
| enable | int | 否 | 启用状态, 1:启用、2:停用 |
| parentid | string | 否 | 上级分类id |
| sort | int | 否 | 排序号 |
| code | string | 否 | 员工类别编码 |
| creationtime | string | 否 | 创建时间,格式为:yyyy-MM-dd HH:mm:ss |
| pageIndex | int | 否 | 当前页数 |
| pageSize | int | 否 | 每页行数 |
| pageCount | int | 否 | 总页数 |
| beginPageIndex | int | 否 | 开始页码（第一页） |
| endPageIndex | int | 否 | 结束页码（有多少页） |
| recordCount | int | 否 | 总数 |
| pubts | string | 否 | 时间戳,格式为:yyyy-MM-dd HH:mm:ss 示例：格式为:yyyy-MM-dd HH:mm:ss |
| children | object | 是 | 下级 |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"level": 0,
		"isEnd": 0,
		"id": "",
		"creator": "",
		"tenant": "",
		"ts": "",
		"name": "",
		"parent_name": "",
		"path": "",
		"memo": "",
		"parent": "",
		"sysid": "",
		"enable": 0,
		"parentid": "",
		"sort": 0,
		"code": "",
		"creationtime": "",
		"pageIndex": 0,
		"pageSize": 0,
		"pageCount": 0,
		"beginPageIndex": 0,
		"endPageIndex": 0,
		"recordCount": 0,
		"pubts": "格式为:yyyy-MM-dd HH:mm:ss",
		"children": [
			{
				"tenant": "",
				"creator": "",
				"parentid": "",
				"ts": "",
				"creationtime": "",
				"code": "",
				"name": "",
				"parent": "",
				"parent_name": "",
				"enable": 0,
				"memo": "",
				"level": 0,
				"path": "",
				"sort": 0,
				"isEnd": 0,
				"id": "",
				"pubts": "",
				"sysid": ""
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-03-13

更新

请求说明

更新

返回参数 (23)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

