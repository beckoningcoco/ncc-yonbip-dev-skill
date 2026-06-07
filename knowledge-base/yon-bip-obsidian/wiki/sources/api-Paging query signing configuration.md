---
title: "分页查询签署配置"
apiId: "1857335766690562051"
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

# 分页查询签署配置

> `ContentType	application/json` 请求方式	POST | 分类: E-signature Configuration (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/uspace/rest/contract/config/getByPage

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
| tenantId | string | 否 | 否 | 租户ID 示例：qy2222222 |
| companyIdNumber | string | 否 | 否 | 统一社会信息代码 示例：900000000000000P |
| processCode | string | 否 | 否 | 合同签署配置编码 示例：code0001 |
| orgId | string | 否 | 否 | 所属组织ID 示例：180444222322222244770 |
| contractObjectCode | string | 否 | 否 | 业务对象编码 示例：transtype.bd_billllllllltyperef |
| distributedFlag | int | 否 | 否 | 是否只包含已分配的模板，默认是 1是 0否 示例：1 默认值：1 |
| refs | object | 是 | 否 | 分配参照数据查询列表 |
| refCode | string | 否 | 否 | 参照编码 示例：transtype.bd_billlllltyperef |
| refDataIDs | string | 否 | 否 | 参照id序列 多个英文逗号隔开 示例：18044442222224444770,180444433333333444770 |

## 3. 请求示例

Url: /yonbip/uspace/rest/contract/config/getByPage?access_token=访问令牌
Body: {
	"tenantId": "qy2222222",
	"companyIdNumber": "900000000000000P",
	"processCode": "code0001",
	"orgId": "180444222322222244770",
	"contractObjectCode": "transtype.bd_billllllllltyperef",
	"distributedFlag": 1,
	"refs": [
		{
			"refCode": "transtype.bd_billlllltyperef",
			"refDataIDs": "18044442222224444770,180444433333333444770"
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| page | int | 否 | 当前页 示例：1 |
| size | int | 否 | 分页大小 示例：10 |
| totalPage | int | 否 | 总分页数 示例：2 |
| totalCount | int | 否 | 总数量 示例：12 |
| contents | object | 是 | 返回数据 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"page": 1,
		"size": 10,
		"totalPage": 2,
		"totalCount": 12,
		"contents": [
			{
				"id": "1804422222222444770",
				"contractProcessId": "1804444444444444770",
				"processCode": "code001",
				"processName": "name0001",
				"businessObjectCode": "objectCode0001",
				"processExplain": "说明xxxx",
				"orderFlag": 1,
				"tenantId": "qy2222222",
				"orgId": "180444333333344770",
				"createTime": "2023-11-01 11:11:11",
				"status": 1,
				"defaultFlag": 1,
				"mainstayId": "1804444666666666",
				"signers": [
					{
						"mainstayType": 1,
						"signOrder": 1,
						"mainstayId": "1804444666666666",
						"sourceId": "1804444666663333666",
						"sourceType": 1,
						"companyId": "180444462222263333666",
						"providerCompanyId": "1804444611113333666",
						"companyAppAuthId": "18044446122222233666",
						"orgId": "18044488888888333666",
						"tenantId": "qy33333333",
						"mainstayName": "测试企业",
						"transactorId": "1804444441234351234444770",
						"providerUserId": "18044444412343512333334770",
						"transactorName": "李四"
					}
				]
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

500	接口调用错误	接口调用错误


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

