---
title: "品牌属性启用"
apiId: "7976f12762ce4f11aa4c6ebd4362dffb"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Brand"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Brand]
platform_version: "BIP"
source_type: community-api-docs
---

# 品牌属性启用

> `ContentType	application/json` 请求方式	POST | 分类: Brand (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/productbrandpro/unstop

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
| data | object | 是 | 是 | 请求数据 |
| id | long | 否 | 是 | 品牌属性id 示例：1838006558658992 |

## 3. 请求示例

Url: /yonbip/digitalModel/productbrandpro/unstop?access_token=访问令牌
Body: {
	"data": [
		{
			"id": 1838006558658992
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 请求结果状态码，200成功，其它失败 示例：200 |
| message | string | 否 | 请求结果信息 示例：操作成功 |
| data | object | 否 | 请求结果数据 |
| id | long | 否 | 品牌属性id 示例：2490980652913590 |
| isEnabled | boolean | 否 | 是否启用，true：启用，false：停用 示例：true |
| isSerInput | boolean | 否 | 品牌档案必输，true：必输，false：不必输 示例：true |
| isWebInput | boolean | 否 | 前端是否必输，固定false 示例：false |
| isWebShow | boolean | 否 | 前端是否显示，true：显示，false：不显示 示例：true |
| classname | string | 否 | 分类 示例：商品订单 |
| classId | string | 否 | 分类ID 示例：productBrand |
| pubts | string | 否 | 时间戳 示例：2022-03-22 15:51:18 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"id": 2490980652913590,
		"isEnabled": true,
		"isSerInput": true,
		"isWebInput": false,
		"isWebShow": true,
		"classname": "商品订单",
		"classId": "productBrand",
		"pubts": "2022-03-22 15:51:18"
	}
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

