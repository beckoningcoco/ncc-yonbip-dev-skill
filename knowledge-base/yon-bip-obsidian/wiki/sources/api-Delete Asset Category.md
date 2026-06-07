---
title: "资产类别删除"
apiId: "2006589719933091844"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Asset Category"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Asset Category]
platform_version: "BIP"
source_type: community-api-docs
---

# 资产类别删除

> `ContentType	application/json` 请求方式	POST | 分类: Asset Category (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/am/category/delete

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	批量删除

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 是 | 否 | data |
| id | string | 否 | 否 | 要删除的数据的id 示例：1476611216843472896 |

## 3. 请求示例

Url: /yonbip/am/category/delete?access_token=访问令牌
Body: {
	"data": [
		{
			"id": "1476611216843472896"
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | http 状态码(200:成功 其他：失败) 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功！ |
| data | object | 否 | 返回数据 |
| count | number |
| 小数位数:0,最大长度:10 | 否 | 总共需删除条数 示例：1 |
| sucessCount | number |
| 小数位数:0,最大长度:10 | 否 | 成功条数 示例：1 |
| failCount | number |
| 小数位数:0,最大长度:10 | 否 | 失败条数 示例：0 |
| messages | object | 是 | 详细信息 |
| infos | object | 是 | 信息 |
| failInfos | object | 是 | 失败单据及原因 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功！",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			{}
		],
		"infos": [
			{}
		],
		"failInfos": [
			{
				"id": "1483375231986302979",
				"message": "该单据已经被他人删除，请刷新界面"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	服务端逻辑异常	服务端逻辑异常


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

