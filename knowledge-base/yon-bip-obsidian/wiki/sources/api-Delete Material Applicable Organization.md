---
title: "物料适用组织删除"
apiId: "2129778341283102722"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Material"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Material]
platform_version: "BIP"
source_type: community-api-docs
---

# 物料适用组织删除

> `ContentType	application/json` 请求方式	POST | 分类: Material (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/productapplyrange/cancelorg

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	MDD幂等

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| productIds | number |
| 小数位数:0,最大长度:22 | 是 | 是 | 待删除物料适用范围物料主键 示例：[1998419669848424453] |
| orgIds | string | 是 | 是 | 待删除物料适用范围组织主键 示例：["1556760666614267907"] |

## 3. 请求示例

Url: /yonbip/digitalModel/productapplyrange/cancelorg?access_token=访问令牌
Body: [{
	"productIds": [
		1998419669848424453
	],
	"orgIds": [
		"1556760666614267907"
	]
}]

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| success | boolean | 否 | success 示例：true |
| message | string | 否 | message 示例：处理成功 |
| code | number |
| 小数位数:0,最大长度:10 | 否 | code 示例：200 |
| totalCount | number |
| 小数位数:0,最大长度:10 | 否 | totalCount 示例：0 |
| data | object | 否 | data |
| count | number |
| 小数位数:0,最大长度:10 | 否 | count 示例：1 |
| successCount | number |
| 小数位数:0,最大长度:10 | 否 | successCount 示例：1 |
| failCount | number |
| 小数位数:0,最大长度:10 | 否 | failCount 示例：0 |
| messages | string | 是 | messages |
| infos | string | 是 | infos |
| failInfos | string | 是 | failInfos |

## 5. 正确返回示例

{
	"success": true,
	"message": "处理成功",
	"code": 200,
	"totalCount": 0,
	"data": {
		"count": 1,
		"successCount": 1,
		"failCount": 0,
		"messages": [
			""
		],
		"infos": [
			""
		],
		"failInfos": [
			""
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	参数错误


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

