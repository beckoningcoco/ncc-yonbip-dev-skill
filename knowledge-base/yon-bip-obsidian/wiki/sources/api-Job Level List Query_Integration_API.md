---
title: "职级列表查询_集成_API"
apiId: "2133459506210275334"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Job Level"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Job Level]
platform_version: "BIP"
source_type: community-api-docs
---

# 职级列表查询_集成_API

> `ContentType	application/json` 请求方式	POST | 分类: Job Level (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/rank/listForIntegration

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
| pageIndex | long | 否 | 是 | 页码 默认值：1 |
| pageSize | long | 否 | 是 | 每页大小 默认值：10 |
| codeOrName | string | 否 | 否 | 名称或编码 示例：1 |
| enableList | number |
| 小数位数:0,最大长度:10 | 是 | 否 | 启用状态，0初始态；1启用；2停用 示例：[1] |
| drList | number |
| 小数位数:0,最大长度:10 | 是 | 否 | 删除状态，0未删除；1已删除 示例：[0] |
| idList | string | 是 | 否 | ID 示例：["1"] |
| pubts | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 时间戳 示例：1900-01-01 00:00:00 |
| codeList | string | 是 | 否 | 编码 示例：["1"] |
| orgIds | string | 否 | 否 | 所属组织 示例：1 |
| distributionSite | string | 否 | 否 | 站点 示例：211212 |

## 3. 请求示例

Url: /yonbip/digitalModel/rank/listForIntegration?access_token=访问令牌
Body: {
	"pageIndex": 0,
	"pageSize": 0,
	"codeOrName": "1",
	"enableList": [
		1
	],
	"drList": [
		0
	],
	"idList": [
		"1"
	],
	"pubts": "1900-01-01 00:00:00",
	"codeList": [
		"1"
	],
	"orgIds": "1",
	"distributionSite": "211212"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | code 示例：200 |
| message | string | 否 | message 示例：操作成功 |
| data | object | 否 | data |
| pageIndex | number |
| 小数位数:0,最大长度:10 | 否 | pageIndex 示例：0 |
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | pageSize 示例：0 |
| recordCount | number |
| 小数位数:0,最大长度:10 | 否 | recordCount 示例：0 |
| recordList | object | 是 | recordList |
| pageCount | number |
| 小数位数:0,最大长度:10 | 否 | pageCount 示例：0 |
| beginPageIndex | number |
| 小数位数:0,最大长度:10 | 否 | beginPageIndex 示例：0 |
| endPageIndex | number |
| 小数位数:0,最大长度:10 | 否 | endPageIndex 示例：0 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 0,
		"pageSize": 0,
		"recordCount": 0,
		"recordList": [
			{
				"code": "",
				"enable": 0,
				"name": {
					"zh_CN": "中文",
					"en_US": "英文",
					"zh_TW": "繁体"
				},
				"id": "",
				"maxrank_id": "",
				"minrank_id": "",
				"minrank_id_name": "",
				"ranktype_id": "",
				"orderNo": 0,
				"memo": {
					"zh_CN": "中文",
					"en_US": "英文",
					"zh_TW": "繁体"
				},
				"orgGroupId": "1940320324493508610",
				"orgGroupDetailList": [
					{
						"ytenant": "0000LDVLBFJI3Y0MIR0000",
						"groupId": "1940320324493508610",
						"id": "1940320324493508611",
						"orgId": "6666"
					}
				],
				"distributionSite": "",
				"orgId": "3232",
				"creator": "21",
				"sysid": "sysid",
				"modifier": "modifier",
				"dr": 0,
				"modifyTime": "2026-06-07 11:42:23",
				"createTime": "2026-06-07 11:42:23",
				"tenantid": "",
				"ts": "2026-06-07 11:42:23",
				"hashCode": ""
			}
		],
		"pageCount": 0,
		"beginPageIndex": 0,
		"endPageIndex": 0
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

500	查询失败


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

