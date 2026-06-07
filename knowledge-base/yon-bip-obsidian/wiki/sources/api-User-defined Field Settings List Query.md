---
title: "自定义项设置列表查询"
apiId: "36cda255d3ec4fd6976b4a193f5b2a3e"
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

# 自定义项设置列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Characteristic (BMM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/attrext/list

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
| billnum | string | 否 | 否 | ui模板编码 示例：attrextfixedlist |
| condition | object | 否 | 否 | 条件 |
| commonVOs | object | 是 | 否 | 扩展数据 |
| filtersId | string | 否 | 否 | ui模板的filtersId 示例：148699 |
| solutionId | long | 否 | 否 | ui模板的id 示例：171054 |
| externalData | object | 否 | 否 | 扩展参数 |
| classId | string | 否 | 否 | 标识（表头，表体） 示例：billHead |
| ownDomain | string | 否 | 否 | 就是userdefine 示例：userdefine |
| pageSize | string | 否 | 否 | 一页数量 |
| pageIndex | string | 否 | 否 | 页码 |
| totalCount | string | 否 | 否 | 总数 |

## 3. 请求示例

Url: /yonbip/digitalModel/attrext/list?access_token=访问令牌
Body: {
	"billnum": "attrextfixedlist",
	"condition": {
		"commonVOs": [
			{
				"itemName": "schemeName",
				"value1": "P_YS_PF_GZTTMP_0000075908"
			}
		],
		"filtersId": "148699",
		"solutionId": 171054
	},
	"externalData": {
		"classId": "billHead"
	},
	"ownDomain": "userdefine",
	"pageSize": "",
	"pageIndex": "",
	"totalCount": ""
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 |
| message | string | 否 | 调用失败时的错误信息 |
| data | object | 否 | 调用成功时的返回数据 |
| pageSize | int | 否 | 每页行数 |
| pageCount | int | 否 | 总页数 |
| recordList | object | 是 | 结果数据 |
| beginPageIndex | int | 否 | 开始页码（第一页） |
| pageIndex | int | 否 | 当前页数 |
| recordCount | int | 否 | 总数 |
| endPageIndex | int | 否 | 结束页码（有多少页） |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"pageSize": 0,
		"pageCount": 0,
		"recordList": [
			{
				"decimaldigits": 0,
				"alloList": "",
				"docname": "",
				"showitem": {
					"zh_CN": "中文",
					"en_US": "英文",
					"zh_TW": "繁体"
				},
				"id": "",
				"maxinputlen": 0,
				"alloList_hidden": "",
				"ref_name": "",
				"isEnabled": "",
				"type": "",
				"pubts": ""
			}
		],
		"beginPageIndex": 0,
		"pageIndex": 0,
		"recordCount": 0,
		"endPageIndex": 0
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	服务端逻辑异常	正确输入编码


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

