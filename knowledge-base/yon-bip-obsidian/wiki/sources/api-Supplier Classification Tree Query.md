---
title: "供应商分类树查询"
apiId: "d42a42a68ce4469abfabfb6b4936aa12"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Supplier Category"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Supplier Category]
platform_version: "BIP"
source_type: community-api-docs
---

# 供应商分类树查询

> `ContentType	application/json` 请求方式	POST | 分类: Supplier Category (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/vendorclassification/tree

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	其他

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |

## 3. 请求示例

Url: /yonbip/digitalModel/vendorclassification/tree?access_token=访问令牌

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 |
| message | string | 否 | 调用失败时的错误信息 |
| data | object | 是 | 调用成功时的返回数据 |
| children | object | 是 | 子分类 |
| name | string | 否 | 供应商分类 |
| code | string | 否 | 编码 |
| erpCode | string | 否 | 外部编码 |
| level | int | 否 | 层级 |
| path | string | 否 | 路径 |
| order | int | 否 | 排序 |
| isEnd | int | 否 | 是否末级 |
| id | int | 否 | 分类ID |
| pubts | Date | 否 | 时间戳 |
| isEnabled | string | 否 | 是否启用, true:是、false:否、 |
| comment | string | 否 | 备注 |
| creator | string | 否 | 创建人 |
| createTime | string | 否 | 创建时间 |
| modifier | string | 否 | 修改人 |
| modifyTime | string | 否 | 修改时间 |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": [
		{
			"children": [
				{
					"isEnd": "",
					"isEnabled": "",
					"children": [
						{}
					],
					"code": "",
					"createTime": "",
					"name": "",
					"order": "",
					"comment": "",
					"level": "",
					"parent": "",
					"modifyTime": "",
					"erpCode": "",
					"parent_name": "",
					"modifier": "",
					"id": "",
					"pubts": "",
					"path": "",
					"creator": ""
				}
			],
			"name": "",
			"code": "",
			"erpCode": "",
			"level": 0,
			"path": "",
			"order": 0,
			"isEnd": 0,
			"id": 0,
			"pubts": "",
			"isEnabled": "",
			"comment": "",
			"creator": "",
			"createTime": "",
			"modifier": "",
			"modifyTime": ""
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	服务逻辑异常


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-25

更新

返回参数 data


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

