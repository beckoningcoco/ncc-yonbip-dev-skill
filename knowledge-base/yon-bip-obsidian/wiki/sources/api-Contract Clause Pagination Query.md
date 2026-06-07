---
title: "合同条款分页查询"
apiId: "2214235823645130757"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "E-signature Configuration"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, E-signature Configuration]
platform_version: "BIP"
source_type: community-api-docs
---

# 合同条款分页查询

> `ContentType	application/json` 请求方式	POST | 分类: E-signature Configuration (PF)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/rest/contractTerms/integration/pageQuery

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	列表查询

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| pageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 是 | 当前分页 示例：1 默认值：1 |
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | 是 | 分页大小，建议分页大小不要超过500 示例：10 默认值：10 |
| tenantId | string | 否 | 否 | 租户ID 示例：qyxxx |
| termNum | string | 否 | 否 | 合同条款编码 示例：123 |
| termName | string | 否 | 否 | 合同条款名称，模糊查询 示例：条款1 |
| termStatus | string | 否 | 否 | 启用状态（1 启用 0 停用） 示例：1 |
| orgId | string | 否 | 否 | 组织ID 示例：1975428200000000000013 |
| orgCode | string | 否 | 否 | 组织编码 示例：org001 |
| ts | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 增量查询时间，即查询该时间点后新增或修改的数据 示例：2024-12-12 12:12:12 |

## 3. 请求示例

Url: /yonbip/digitalModel/rest/contractTerms/integration/pageQuery?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 10,
	"tenantId": "qyxxx",
	"termNum": "123",
	"termName": "条款1",
	"termStatus": "1",
	"orgId": "1975428200000000000013",
	"orgCode": "org001",
	"ts": "2024-12-12 12:12:12"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 接口状态 示例：200 |
| message | string | 否 | 接口信息 示例：操作成功 |
| data | object | 否 | 接口数据 |
| pageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 当前分页 示例：1 |
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | 分页大小 示例：10 |
| recordCount | number |
| 小数位数:0,最大长度:10 | 否 | 总数量 示例：100 |
| recordList | object | 是 | 数据 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 10,
		"recordCount": 100,
		"recordList": [
			{
				"id": "197542811111111119013",
				"outerSysId": "1975428123211239013",
				"termNum": "term001",
				"termName": "名称1",
				"categoryId": "19754281521221211239013",
				"orgId": "197542815555555239013",
				"orgCode": "orgCode1",
				"termStatus": "1",
				"termContent": "111${12",
				"keyWord": "关键字",
				"remark": "说明",
				"yTenantId": "qyxxxxxx",
				"ts": "2024-12-12 12:12:12",
				"dr": 0,
				"termName2": "名称2",
				"termName3": "名称3",
				"termName4": "名称4",
				"termName5": "名称5",
				"termName6": "名称6",
				"termVars": [
					{
						"variable": "变量1",
						"value": "值1",
						"termRequired": 8
					}
				]
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

500	未知异常	未知异常，请联系管理员

10000	服务内部异常	服务内部异常，请联系管理员


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

