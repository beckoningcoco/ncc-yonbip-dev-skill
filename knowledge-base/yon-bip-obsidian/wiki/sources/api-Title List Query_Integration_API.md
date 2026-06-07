---
title: "职务列表查询_集成_API"
apiId: "2132737350434816006"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Title"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Title]
platform_version: "BIP"
source_type: community-api-docs
---

# 职务列表查询_集成_API

> `ContentType	application/json` 请求方式	POST | 分类: Title (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/duty/listForIntegration

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
| codeOrName | string | 否 | 否 | 名称或编码 示例：code |
| orgIdOrDeptId | string | 否 | 否 | 组织或者部门主键 示例：213 |
| enableList | number |
| 小数位数:0,最大长度:10 | 是 | 否 | 启用状态，0初始态；1启用；2，停用 示例：[1,0] |
| drList | number |
| 小数位数:0,最大长度:10 | 是 | 否 | 删除状态，0未删除；1已删除 示例：[0] |
| idList | string | 是 | 否 | 主键Id 示例：["1111"] |
| pubts | string | 否 | 否 | 时间戳 示例：2024-09-26 11:05:58 |
| pageIndex | long | 否 | 是 | 页码 示例：1 |
| codeList | string | 是 | 否 | 编码列表 示例：["111"] |
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | 是 | 每页大小，不超过500 示例：5 |
| distributionSite | string | 否 | 否 | 站点 示例：32323 |

## 3. 请求示例

Url: /yonbip/digitalModel/duty/listForIntegration?access_token=访问令牌
Body: {
	"codeOrName": "code",
	"orgIdOrDeptId": "213",
	"enableList": [
		1,
		0
	],
	"drList": [
		0
	],
	"idList": [
		"1111"
	],
	"pubts": "2024-09-26 11:05:58",
	"pageIndex": 1,
	"codeList": [
		"111"
	],
	"pageSize": 5,
	"distributionSite": "32323"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | code 示例：200 |
| message | string | 否 | message 示例：操作成功 |
| data | object | 否 | data |
| pageIndex | number |
| 小数位数:0,最大长度:10 | 否 | pageIndex 示例：1 |
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | pageSize 示例：5 |
| recordCount | number |
| 小数位数:0,最大长度:10 | 否 | recordCount 示例：1 |
| recordList | object | 是 | recordList |
| pageCount | number |
| 小数位数:0,最大长度:10 | 否 | pageCount 示例：1 |
| beginPageIndex | number |
| 小数位数:0,最大长度:10 | 否 | beginPageIndex 示例：1 |
| endPageIndex | number |
| 小数位数:0,最大长度:10 | 否 | endPageIndex 示例：1 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 5,
		"recordCount": 1,
		"recordList": [
			{
				"creator": "81ee321b-8c73-49ee-9335-3e53c795f66a",
				"code": "3",
				"sysid": "diwork",
				"jobtype_id": "1966343823366291458",
				"dr": 0,
				"user_define_character": {
					"ytenant": "0000LSU86TH67MZUOG0000",
					"id": "1966344373138358281"
				},
				"orgGroupId": "1940320324493508610",
				"orgGroupDetailList": [
					{
						"ytenant": "0000LDVLBFJI3Y0MIR0000",
						"groupId": "1940320324493508610",
						"id": "1940320324493508611",
						"orgId": "666666"
					}
				],
				"createTime": "2024-04-03 10:50:13",
				"enable": 1,
				"tenantid": "0000LSU86TH67MZUOG0000",
				"name": {
					"zh_TW": "繁体",
					"zh_CN": "中文",
					"en_US": "英文"
				},
				"id": "1966344373138358280",
				"pubts": "2024-05-11 14:38:38",
				"tenant": "0000LSU86TH67MZUOG0000",
				"modifier": "81ee321b-8c73-49ee-9335-3e53c795f66a",
				"modifyTime": "2024-04-03 10:50:13",
				"distributionSite": "站点",
				"memo": {
					"zh_TW": "繁体",
					"zh_CN": "中文",
					"en_US": "英文"
				},
				"jobgrade_id": "121212",
				"minrank_id": "1221",
				"maxrank_id": "12212",
				"org_id": "21212",
				"duties": "duties",
				"hashCode": "23232"
			}
		],
		"pageCount": 1,
		"beginPageIndex": 1,
		"endPageIndex": 1
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

