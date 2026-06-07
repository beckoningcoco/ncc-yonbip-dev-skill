---
title: "固定自定义项列表查询"
apiId: "770a3cd01b1e4d11a543bca35e29b247"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Characteristic"
domain: "BMM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Characteristic]
platform_version: "BIP"
source_type: community-api-docs
---

# 固定自定义项列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Characteristic (BMM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/attrextfixed/list

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
| billnum | string | 否 | 否 | UI模板编码 示例：attrextfixedlist |
| condition | object | 否 | 否 | 条件数组 |
| commonVOs | object | 是 | 否 | 条件 |
| externalData | object | 否 | 否 | 扩展数据 |
| classId | string | 否 | 否 | 标识表头，表体 示例：billHead |
| ownDomain | string | 否 | 否 | 自定义项服务域（userdefine） 示例：userdefine |
| pageSize | string | 否 | 否 | 一页数量 示例：1 |
| pageIndex | string | 否 | 否 | 第几页 示例：10 |

## 3. 请求示例

Url: /yonbip/digitalModel/attrextfixed/list?access_token=访问令牌
Body: {
	"billnum": "attrextfixedlist",
	"condition": {
		"commonVOs": [
			{
				"itemName": "isDefault",
				"value1": true
			}
		]
	},
	"externalData": {
		"classId": "billHead"
	},
	"ownDomain": "userdefine",
	"pageSize": "1",
	"pageIndex": "10"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 返回编码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 数据 |
| pageIndex | long | 否 | 当前页数 示例：1 |
| recordList | object | 是 | 返回结果数组 |
| pageCount | long | 否 | 总页数 示例：0 |
| recordCount | long | 否 | 总数 示例：4 |
| beginPageIndex | long | 否 | 开始页码（第一页） 示例：1 |
| endPageIndex | long | 否 | 结束页码（有多少页） 示例：0 |
| pageSize | long | 否 | 每页行数 示例：10 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"recordList": [
			{
				"defineId": "自定义项4",
				"showitem_resid": "R_YS_PF_GZTBDM_0000096814",
				"maxinputlen": 255,
				"showitem": {
					"0": "固",
					"1": "定",
					"2": "自",
					"3": "定",
					"4": "义",
					"5": "2",
					"zh_CN": "中文",
					"en_US": "英文",
					"zh_TW": "繁体"
				},
				"type": "String",
				"isInput": false,
				"status": 0,
				"decimaldigits": 0,
				"refresh": "0",
				"isEnabled": false,
				"id": 1904625991897344,
				"dr": false,
				"pubts": "2020-09-08 00:26:35"
			}
		],
		"pageCount": 0,
		"recordCount": 4,
		"beginPageIndex": 1,
		"endPageIndex": 0,
		"pageSize": 10
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	服务端逻辑异常	正确输入参数格式


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

