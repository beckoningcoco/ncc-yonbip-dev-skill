---
title: "物料分类分配组织"
apiId: "2177296416248954887"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Material Category"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Material Category]
platform_version: "BIP"
source_type: community-api-docs
---

# 物料分类分配组织

> `ContentType	application/json` 请求方式	POST | 分类: Material Category (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/managementclass/addsuitorg

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
| id | number |
| 小数位数:0,最大长度:19 | 否 | 否 | 物料分类id 示例：2110632124406038535 |
| orgIds | string | 是 | 否 | 使用组织id集合 示例：["2007992602296582147","1981143722337239047"] |

## 3. 请求示例

Url: /yonbip/digitalModel/managementclass/addsuitorg?access_token=访问令牌
Body: [{
	"id": 2110632124406038535,
	"orgIds": [
		"2007992602296582147",
		"1981143722337239047"
	]
}]

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 成功或异常失败描述 示例：处理成功 |
| data | object | 否 | 详细返回结果 |
| count | number |
| 小数位数:0,最大长度:10 | 否 | 数量 示例：1 |
| successCount | number |
| 小数位数:0,最大长度:10 | 否 | 成功数量 示例：1 |
| failCount | number |
| 小数位数:0,最大长度:10 | 否 | 失败数量 示例：0 |
| messages | string | 是 | 失败详细信息 示例：["分配组织不能为空"] |
| infos | object | 是 | 成功详细信息 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "处理成功",
	"data": {
		"count": 1,
		"successCount": 1,
		"failCount": 0,
		"messages": [
			"分配组织不能为空"
		],
		"infos": [
			{
				"id": 2110632124406038535
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

118000	入参不能为空


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

