---
title: "按物料skuId查询制造物料"
apiId: "0b5307d3b5f64af5ba72cb81a75e538e"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "BOM Maintenance"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, BOM Maintenance]
platform_version: "BIP"
source_type: community-api-docs
---

# 按物料skuId查询制造物料

> `ContentType	application/json` 请求方式	POST | 分类: BOM Maintenance (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/mfg/material/querybyskuid

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
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| skuId | long | 是 | 否 | 物料skuId 示例：[2104222509388032,2104224250335488,2107178162671883] |

## 3. 请求示例

Url: /yonbip/mfg/material/querybyskuid?access_token=访问令牌
Body: {
	"skuId": [
		2104222509388032,
		2104224250335488,
		2107178162671883
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 接口返回信息 示例：操作成功 |
| data | object | 是 | 接口返回数据 |
| skuId | long | 否 | 物料skuId 示例：2104222509388032 |
| materialId | long | 否 | 制造物料Id 示例：2104222525722880 |
| productId | long | 否 | 物料Id 示例：2104222495756544 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"skuId": 2104222509388032,
			"materialId": 2104222525722880,
			"productId": 2104222495756544
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码


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

