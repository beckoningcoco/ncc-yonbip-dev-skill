---
title: "合同类型分组分页查询"
apiId: "2214455081704620036"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Contract Type Group"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Contract Type Group]
platform_version: "BIP"
source_type: community-api-docs
---

# 合同类型分组分页查询

> `ContentType	application/json` 请求方式	POST | 分类: Contract Type Group (PF)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/rest/integration/contractTypeGroup/pageQuery

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
| id | string | 否 | 否 | 合同类型分组主键 示例：22165490222222220003 |
| ids | string | 否 | 否 | 合同类型分组主键列表，如果多个，使用,拼接 示例：22165490222222220003, 221654902221212121334344443 |
| name | string | 否 | 否 | 合同类型分组名称，模糊查询 示例：分组1 |
| pubts | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 增量查询时间，即查询该时间点后新增或修改的数据 示例：2024-12-12 12:12:12 |
| page | object | 否 | 否 | 分页信息 |
| pageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 当前分页 示例：1 默认值：1 |
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 分页大小，建议分页大小不要超过500 示例：10 默认值：10 |

## 3. 请求示例

Url: /yonbip/digitalModel/rest/integration/contractTypeGroup/pageQuery?access_token=访问令牌
Body: {
	"id": "22165490222222220003",
	"ids": "22165490222222220003, 221654902221212121334344443",
	"name": "分组1",
	"pubts": "2024-12-12 12:12:12",
	"page": {
		"pageIndex": 1,
		"pageSize": 10
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 接口状态 示例：200 |
| message | string | 否 | 接口信息 示例：操作成功 |
| data | object | 否 | 接口数据 |
| pageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 当前分页 示例：1 |
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | 分页大小 示例：20 |
| recordCount | number |
| 小数位数:0,最大长度:10 | 否 | 总数量 示例：15 |
| recordList | object | 是 | 数据列表 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 20,
		"recordCount": 15,
		"recordList": [
			{
				"id": "1975231356142092306",
				"name": {
					"zh_CN": "居间合同",
					"en_US": "En_123"
				},
				"remark": {
					"zh_CN": "说明123",
					"en_US": "En_12221"
				},
				"pubts": "2025-02-24 15:40:15",
				"level": 1,
				"creator": "00001951-7ca3-xxxxxxxxx6e3e6724",
				"createTime": "2024-04-15 13:38:39",
				"modifier": "00001951-7ca3-xxxxxxxxx6e3e6724",
				"modifyTime": "2024-04-15 18:38:39"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

500	未知异常	未知异常，请联系管理员

10000	服务内部错误	服务内部异常，请联系管理员


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

