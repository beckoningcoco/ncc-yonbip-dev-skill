---
title: "物料规格列表查询"
apiId: "6e71317d261e45e1a2a3f1a3295ea902"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Material Specification"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Material Specification]
platform_version: "BIP"
source_type: community-api-docs
---

# 物料规格列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Material Specification (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/spepro/list

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
| schemeName | string | 否 | 否 | 默认方案名称 |
| isDefault | string | 否 | 否 | 是否默认方案 |
| pageIndex | int | 否 | 是 | 页码 |
| pageSize | int | 否 | 是 | 每页条数 |
| showItem | string | 否 | 否 | 规格名称 |
| isShowSpec | boolean | 否 | 否 | 单独显示, true:是、false:否、 |

## 3. 请求示例

Url: /yonbip/digitalModel/spepro/list?access_token=访问令牌
Body: {
	"schemeName": "",
	"isDefault": "",
	"pageIndex": 0,
	"pageSize": 0,
	"showItem": "",
	"isShowSpec": true
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 |
| message | string | 否 | 调用失败时的错误信息 |
| data | object | 否 | 调用成功时的返回数据 |
| pageIndex | int | 否 | 页码 |
| pageSize | int | 否 | 每页条数 |
| pageCount | int | 否 | 总页数 |
| beginPageIndex | int | 否 | 开始页码 |
| endPageIndex | int | 否 | 结束页码 |
| recordCount | int | 否 | 总条数 |
| pubts | string | 否 | 时间戳,格式为:yyyy-MM-dd HH:mm:ss |
| recordList | object | 是 | 记录条数 |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"pageIndex": 0,
		"pageSize": 0,
		"pageCount": 0,
		"beginPageIndex": 0,
		"endPageIndex": 0,
		"recordCount": 0,
		"pubts": "",
		"recordList": [
			{
				"showItem": "",
				"item": "",
				"userDefSpecViews": {
					"names": ""
				},
				"iorder": 0,
				"erpCode": "",
				"isShowSpec": true,
				"pubts": "",
				"userdefDesc": "",
				"orderNum": 0,
				"defineId": "",
				"isEnabled": true,
				"id": 0
			}
		]
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

