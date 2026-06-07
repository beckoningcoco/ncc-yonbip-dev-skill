---
title: "员工列表查询__hyf"
apiId: "2535020024685920264"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Employee"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Employee]
platform_version: "BIP"
source_type: community-api-docs
---

# 员工列表查询__hyf

> `ContentType	application/json` 请求方式	POST | 分类: Employee (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/PFC/staff/list_hyf

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
| schemeName | string | 否 | 否 | 默认方案名称 |
| isDefault | object | 否 | 否 | 是否默认方案 |
| pageIndex | int | 否 | 是 | 页号 默认值：1 |
| pageSize | int | 否 | 是 | 每页行数 默认值：10 |
| code | string | 否 | 否 | 编码 |
| name | string | 否 | 否 | 名称 |
| mobile | string | 否 | 否 | 手机号 |
| email | string | 否 | 否 | 邮箱 |
| mainJobList.org_id | string | 否 | 否 | 任职组织ID |
| mainJobList.dept_id | string | 否 | 否 | 部门ID |
| enable | int | 否 | 否 | 员工状态（0:未启用，1启用，2停用，接口需要传原状态） |
| simple | object | 否 | 否 | 扩展查询 |
| pubts | string | 否 | 否 | 查询大于该时间戳的数据 |

## 3. 请求示例

Url: /yonbip/PFC/staff/list_hyf?access_token=访问令牌
Body: {
	"schemeName": "",
	"isDefault": {},
	"pageIndex": 0,
	"pageSize": 0,
	"code": "",
	"name": "",
	"mobile": "",
	"email": "",
	"mainJobList.org_id": "",
	"mainJobList.dept_id": "",
	"enable": 0,
	"simple": {
		"pubts": ""
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 编码 示例：200表示成功 |
| message | string | 否 | 说明 示例：操作成功 |
| data | object | 否 | 返回数据 |
| pageCount | string | 否 | 总页数 |
| pageSIze | int | 否 | 每页行数 示例：10 |
| recordCount | int | 否 | 总数 |
| recordList | object | 是 | 返回数据集合 |
| beginPageIndex | int | 否 | 开始页码（第一页） |
| pageIndex | int | 否 | 当前页数 示例：1 |
| endPageIndex | int | 否 | 结束页码（有多少页） |

## 5. 正确返回示例

{
	"code": "200表示成功",
	"message": "操作成功",
	"data": {
		"pageCount": "",
		"pageSIze": 10,
		"recordCount": 0,
		"recordList": [
			{
				"dr": "",
				"ordernumber": "",
				"user_id": "",
				"dept_id": "",
				"email": "",
				"id": "",
				"name": "",
				"pubts": "格式为:yyyy-MM-dd HH:mm:ss",
				"mobile": "",
				"org_id": "",
				"enable": 1,
				"enddate": "没有任职结束时间则不展示",
				"code": ""
			}
		],
		"beginPageIndex": 0,
		"pageIndex": 1,
		"endPageIndex": 0
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


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

