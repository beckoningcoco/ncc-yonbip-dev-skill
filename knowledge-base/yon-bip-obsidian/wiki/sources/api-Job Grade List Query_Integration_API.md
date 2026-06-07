---
title: "职等列表查询_集成_API"
apiId: "2133466575726444548"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Job Grade"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Job Grade]
platform_version: "BIP"
source_type: community-api-docs
---

# 职等列表查询_集成_API

> `ContentType	application/json` 请求方式	POST | 分类: Job Grade (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/grade/listForIntegration

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	列表查询

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| pageIndex | int | 否 | 是 | 页码 默认值：1 |
| pageSize | int | 否 | 是 | 每页大小 默认值：10 |
| codeOrName | string | 否 | 否 | 名称或编码 示例：1 |
| idList | string | 是 | 否 | ID 示例：["1"] |
| enableList | number |
| 小数位数:0,最大长度:10 | 是 | 否 | 启用状态，0，初始态；1，启用；2，停用 示例：[1] |
| drList | number |
| 小数位数:0,最大长度:10 | 是 | 否 | 删除状态，0未删除，1删除 示例：[0] |
| pubts | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 时间戳 示例：1900-01-01 00:00:00 |
| codeList | string | 是 | 否 | 编码 示例：["1"] |
| orgIds | string | 否 | 否 | 所属组织 示例：111 |
| distributionSite | string | 否 | 否 | 站点 示例：21213 |

## 3. 请求示例

Url: /yonbip/digitalModel/grade/listForIntegration?access_token=访问令牌
Body: {
	"pageIndex": 0,
	"pageSize": 0,
	"codeOrName": "1",
	"idList": [
		"1"
	],
	"enableList": [
		1
	],
	"drList": [
		0
	],
	"pubts": "1900-01-01 00:00:00",
	"codeList": [
		"1"
	],
	"orgIds": "111",
	"distributionSite": "21213"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | code 示例：200 |
| message | string | 否 | message 示例：操作成功 |
| data | object | 否 | data |
| pageIndex | number |
| 小数位数:0,最大长度:10 | 否 | pageIndex 示例：1 |
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | pageSize 示例：10 |
| recordCount | number |
| 小数位数:0,最大长度:10 | 否 | recordCount 示例：212 |
| recordList | object | 是 | recordList |
| pageCount | number |
| 小数位数:0,最大长度:10 | 否 | pageCount 示例：22 |
| beginPageIndex | number |
| 小数位数:0,最大长度:10 | 否 | beginPageIndex 示例：1 |
| endPageIndex | number |
| 小数位数:0,最大长度:10 | 否 | endPageIndex 示例：10 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 10,
		"recordCount": 212,
		"recordList": [
			{
				"code": "职等code23500421",
				"sysid": "diwork",
				"ytenant": "0000LDVLBFJI3Y0MIR0000",
				"orgGroupDetailList": [
					{
						"ytenant": "0000LDVLBFJI3Y0MIR0000",
						"groupId": "1940320324493508610",
						"id": "1940320324493508611",
						"orgId": "666666"
					}
				],
				"memo": {
					"zh_TW": "職等",
					"zh_CN": "职等",
					"en_US": "jobrank"
				},
				"dr": 0,
				"jobrankorder": 2,
				"enable": 1,
				"org_id": "666666",
				"orgGroupId": "1940320324493508610",
				"tenantid": "0000LDVLBFJI3Y0MIR0000",
				"name": {
					"zh_TW": "职等namezh_TW23500421",
					"zh_CN": "职等namezh_CN23500421",
					"en_US": "职等nameen_US23500421"
				},
				"id": "1655485996151078916",
				"pubts": "2024-03-25 22:41:37",
				"tenant": "0000LDVLBFJI3Y0MIR0000",
				"ts": "2024-03-25 22:41:37",
				"user_define_character": {
					"ytenant": "0000LSU86TH67MZUOG0000",
					"id": "1966344373138358281",
					"pubts": "2024-04-03 10:50:14"
				},
				"distributionSite": "",
				"creator": "2121",
				"objid": "qwqw",
				"createTime": "2026-06-07 11:42:52",
				"modifyTime": "2026-06-07 11:42:52",
				"modifier": ""
			}
		],
		"pageCount": 22,
		"beginPageIndex": 1,
		"endPageIndex": 10
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	操作失败


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

