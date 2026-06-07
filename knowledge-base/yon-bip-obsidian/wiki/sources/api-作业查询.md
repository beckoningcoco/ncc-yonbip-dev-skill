---
title: "作业查询"
apiId: "2506826699711184900"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "SSC Task"
domain: "SSC"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, SSC Task]
platform_version: "BIP"
source_type: community-api-docs
---

# 作业查询

> `ContentType	application/json` 请求方式	POST | 分类: SSC Task (SSC)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/FCC/systemDockingTask/query

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| select | object | 是 | 否 | select |
| field | string | 否 | 否 | field 示例：status |
| alias | string | 否 | 否 | alias 示例：taskStatus |
| joins | object | 是 | 否 | joins |
| entity | string | 否 | 否 | entity 示例：ssc.workgroup.Workgroup |
| alias | string | 否 | 否 | alias 示例：workgroup_table |
| joinType | string | 否 | 否 | joinType 示例：left |
| onCondition | string | 否 | 否 | onCondition 示例：workgroup = workgroup_table.id |
| where | object | 否 | 否 | where |
| simpleVOs | object | 是 | 否 | simpleVOs |
| groupBy | string | 是 | 否 | groupBy 示例：["status","workgroup"] |
| having | object | 否 | 否 | having |
| simpleVOs | object | 是 | 否 | simpleVOs |
| orderBy | object | 是 | 否 | orderBy |
| field | string | 否 | 否 | field 示例：cnt |
| direction | string | 否 | 否 | direction 示例：desc |
| pager | object | 否 | 否 | pager |
| pageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 否 | pageIndex 示例：0 |
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | 否 | pageSize 示例：50 |

## 3. 请求示例

Url: /yonbip/FCC/systemDockingTask/query?access_token=访问令牌
Body: {
	"select": [
		{
			"field": "status",
			"alias": "taskStatus"
		}
	],
	"joins": [
		{
			"entity": "ssc.workgroup.Workgroup",
			"alias": "workgroup_table",
			"joinType": "left",
			"onCondition": "workgroup = workgroup_table.id"
		}
	],
	"where": {
		"simpleVOs": [
			{
				"field": "status",
				"op": "in",
				"value1": [
					1,
					2
				]
			}
		]
	},
	"groupBy": [
		"status",
		"workgroup"
	],
	"having": {
		"simpleVOs": [
			{
				"field": "count(1)",
				"op": "gt",
				"value1": 10
			}
		]
	},
	"orderBy": [
		{
			"field": "cnt",
			"direction": "desc"
		}
	],
	"pager": {
		"pageIndex": 0,
		"pageSize": 50
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| code | string | 否 | code 示例：200 |
| message | string | 否 | message 示例：操作成功 |
| data | object | 否 | data |
| records | object | 是 | records |
| pagination | object | 否 | pagination |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"records": [
			{
				"status": "1001",
				"workgroup_name": "group-A",
				"cnt": 100
			}
		],
		"pagination": {
			"total": 100,
			"totalPages": 10,
			"pageIndex": 0,
			"pageSize": 10
		}
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1023000400001	传入参数不能为空	传入参数不能为空


## 9. 接口变更日志

序号	修改时间	变更内容概要

暂时没有数据哦~


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

