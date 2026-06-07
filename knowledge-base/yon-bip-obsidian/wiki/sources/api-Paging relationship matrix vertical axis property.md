---
title: "分页关系矩阵纵轴属性"
apiId: "1961124561958731781"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Collaboration Relationship"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Collaboration Relationship]
platform_version: "BIP"
source_type: community-api-docs
---

# 分页关系矩阵纵轴属性

> `ContentType	application/json` 请求方式	POST | 分类: Collaboration Relationship (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/openapi/query/matrix/row

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
| matrixId | string | 否 | 是 | 矩阵id |
| parentId | string | 否 | 否 | 父级组织id（查询组织时，逐级查询） |
| pageNo | number |
| 小数位数:0,最大长度:10 | 否 | 是 | 页数，此参数只在组织类型查询时生效，其他属性为全部查询，页数为1时返回的企业账号级在矩阵中不会进行使用，可忽略 |
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | 是 | 每页数量（最大1000），此参数只在组织类型查询时生效，其他属性为全部查询，查询属性为用户时最大分页为500 |

## 3. 请求示例

Url: /yonbip/digitalModel/openapi/query/matrix/row?access_token=访问令牌
Body: {
	"matrixId": "",
	"parentId": "",
	"pageNo": 0,
	"pageSize": 0
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | number |
| 小数位数:0,最大长度:10 | 否 | 接口响应编码（200表示成功） 示例：200 |
| data | object | 是 | 矩阵纵轴数据 |
| data | object | 否 | 矩阵纵轴数据 |
| total | number |
| 小数位数:0,最大长度:10 | 否 | 总数 |
| start | number |
| 小数位数:0,最大长度:10 | 否 | 查询偏移量 |
| sort | string | 否 | 排序参数 |
| order | string | 否 | 排序方式 |
| errcode | number |
| 小数位数:0,最大长度:10 | 否 | 接口响应编码（0表示成功） |
| errmsg | string | 否 | 接口响应内容（成功标记：ok，失败返回错误信息） |
| extendData | string | 否 | 扩展信息 |
| displayCode | string | 否 | 业务异常码 示例：000-530-000001 |
| level | number |
| 小数位数:0,最大长度:1 | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"code": 200,
	"data": [
		{
			"data": {
				"id": "",
				"name": "",
				"columnCode": "",
				"code": "",
				"parent": "",
				"editAble": true,
				"type": 0
			},
			"total": 0,
			"start": 0,
			"sort": "",
			"order": "",
			"errcode": 0,
			"errmsg": "",
			"extendData": "",
			"displayCode": "000-530-000001",
			"level": 0
		}
	]
}

## 6. 业务异常码

000-530-000001

租户信息不能为空

000-530-000003

参数不能全部为空


## 7. 错误返回码

30009	Required request body is missing	缺少请求体


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-03

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

