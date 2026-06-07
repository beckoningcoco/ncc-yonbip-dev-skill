---
title: "货位查询"
apiId: "fb819a71d3c34d9a983afc703a467006"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Storage Bin File"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Storage Bin File]
platform_version: "BIP"
source_type: community-api-docs
---

# 货位查询

> `ContentType	application/json` 请求方式	POST | 分类: Storage Bin File (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/goodsposition/tree

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
| condition | object | 否 | 否 | 查询条件 |
| isExtend | string | 否 | 否 | true：simpleVOs参数才会生效，false：simpleVOs参数不生效 示例：true |
| simpleVOs | object | 是 | 否 | 查询条件 |

## 3. 请求示例

Url: /yonbip/digitalModel/goodsposition/tree?access_token=访问令牌
Body: {
	"condition": {
		"isExtend": "true",
		"simpleVOs": [
			{
				"op": "eq",
				"field": "warehouseId",
				"value1": 2065944114469376
			}
		]
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 请求结果状态码 示例：200 |
| message | string | 否 | 请求结果信息 示例：操作成功 |
| data | object | 是 | 查询到的数据 |
| path | string | 否 | 货位树id路径 示例：2059157198655744, |
| code | string | 否 | 货位编码 示例：货位1 |
| warehouseId | long | 否 | 货位所属仓库id 示例：1916524028399872 |
| level | long | 否 | 该货位是第几层 示例：1 |
| warehouseId_name | string | 否 | 货位所属仓库名称 示例：eee |
| name | string | 否 | 货位名称 示例：huowei1 |
| id | long | 否 | 货位id 示例：2059157198655744 |
| pubts | string | 否 | 时间戳 示例：2020-12-26 05:23:01 |
| isEnd | boolean | 否 | true：是末级货位，false：非末级货位 示例：true |
| stopstatus | boolean | 否 | true：停用，false：启用 示例：false |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": [
		{
			"path": "2059157198655744,",
			"code": "货位1",
			"warehouseId": 1916524028399872,
			"level": 1,
			"warehouseId_name": "eee",
			"name": "huowei1",
			"id": 2059157198655744,
			"pubts": "2020-12-26 05:23:01",
			"isEnd": true,
			"stopstatus": false
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	服务端逻辑异常	检查入参是否填写正确，参数值是否真实存在，仍提示该信息请联系开发人员。


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

