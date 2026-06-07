---
title: "货位物料对照查询"
apiId: "1479057630224187400"
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

# 货位物料对照查询

> `ContentType	application/json` 请求方式	POST | 分类: Storage Bin File (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/goodscomparison/list

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
| pageIndex | long | 否 | 是 | 当前页数 示例：1 默认值：1 |
| pageSize | long | 否 | 是 | 每页行数 示例：10 默认值：10 |
| simple | object | 否 | 否 | 查询条件 |
| warehouseId | long | 是 | 否 | 仓库id |
| warehouseId.code | string | 是 | 否 | 仓库编码 |
| productId | long | 是 | 否 | 物料id |
| productId.code | string | 是 | 否 | 物料编码 |
| positionId | long | 是 | 否 | 货位id |
| positionId.code | string | 是 | 否 | 货位编码 |

## 3. 请求示例

Url: /yonbip/digitalModel/goodscomparison/list?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 10,
	"simple": {
		"warehouseId": [
			0
		],
		"warehouseId.code": [
			""
		],
		"productId": [
			0
		],
		"productId.code": [
			""
		],
		"positionId": [
			0
		],
		"positionId.code": [
			""
		]
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用失败时的错误信息 示例：操作成功 |
| data | object | 否 | 调用成功时的返回数据 |
| pageIndex | long | 否 | 当前页数 示例：1 |
| pageSize | long | 否 | 每页行数 示例：10 |
| recordCount | long | 否 | 总数 示例：1 |
| recordList | object | 是 | 数据列表 |
| pageCount | long | 否 | 总页数 示例：1 |
| beginPageIndex | long | 否 | 开始页数 示例：1 |
| endPageIndex | long | 否 | 结束页数 示例：1 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 10,
		"recordCount": 1,
		"recordList": [
			{
				"productId_code": "222000004",
				"inPriority": 0,
				"productId": 2192449053741312,
				"productId_name": "规格物料-SKU2",
				"positionId_code": "whhw2467516",
				"outPriority": 0,
				"productId_model": "xinghao",
				"positionId_name": "货位",
				"unit_name": "个",
				"manageClass_name": "444",
				"positionId": 2318145801933056,
				"warehouseId": 2272818888265984,
				"warehouseId_name": "货位仓",
				"mnemonicCode": "GGWL-SKU2",
				"warehouseId_code": "#货位仓",
				"id": 1499490782577426400,
				"pubts": "2022-07-14 09:55:02"
			}
		],
		"pageCount": 1,
		"beginPageIndex": 1,
		"endPageIndex": 1
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	NULL	联系开发人员


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

