---
title: "销售区域批量停用"
apiId: "4d39bc7647784c30af215f8901064b3f"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Sales Region"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Sales Region]
platform_version: "BIP"
source_type: community-api-docs
---

# 销售区域批量停用

> `ContentType	application/json` 请求方式	POST | 分类: Sales Region (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/salearealist/batchStop

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
| data | object | 是 | 是 | 销售区域数据，id与编码必传其一,id与编码同时存在时以id为准 |
| id | long | 否 | 否 | 销售区域id 示例：2394931097276672 |
| code | string | 否 | 否 | 销售区域编码 示例：20210819 |

## 3. 请求示例

Url: /yonbip/digitalModel/salearealist/batchStop?access_token=访问令牌
Body: {
	"data": [
		{
			"id": 2394931097276672,
			"code": "20210819"
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用完成返回信息 示例：操作成功 |
| data | object | 是 | 调用完成返回数据 |
| id | long | 否 | 销售区域id 示例：2394931097276672 |
| code | string | 否 | 销售区域编码 示例：20210830 |
| stoptime | string | 否 | 停用时间 示例：2021-08-19 21:13:01 |
| stopstatus | boolean | 否 | 是否停用，true是，false否 示例：true |
| tenant | long | 否 | 租户id 示例：2302391788065024 |
| pubts | string | 否 | 时间戳 示例：2021-08-19 21:13:01 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"id": 2394931097276672,
			"code": "20210830",
			"stoptime": "2021-08-19 21:13:01",
			"stopstatus": true,
			"tenant": 2302391788065024,
			"pubts": "2021-08-19 21:13:01"
		}
	]
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

