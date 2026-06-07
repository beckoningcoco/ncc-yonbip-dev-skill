---
title: "岗位列表查询_集成_API"
apiId: "2128313594229555209"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Position"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Position]
platform_version: "BIP"
source_type: community-api-docs
---

# 岗位列表查询_集成_API

> `ContentType	application/json` 请求方式	POST | 分类: Position (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/position/listForIntegration

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
| 小数位数:0,最大长度:10 | 是 | 否 | 启用状态，0初始态；1启用；2停用 示例：[1,0] |
| drList | number |
| 小数位数:0,最大长度:10 | 是 | 否 | 删除状态，0未删除；1已删除 示例：[0] |
| idList | string | 是 | 否 | 主键Id 示例：["1111"] |
| pubts | string | 否 | 否 | 时间戳 示例：2024-09-26 11:05:58 |
| pageIndex | long | 否 | 是 | 页码 示例：1 |
| codeList | string | 是 | 否 | 编码列表 示例：["111"] |
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | 是 | 每页大小，不超过500 示例：5 |
| distributionSite | string | 否 | 否 | 站点 示例：23232 |

## 3. 请求示例

Url: /yonbip/digitalModel/position/listForIntegration?access_token=访问令牌
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
	"distributionSite": "23232"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | number |
| 小数位数:0,最大长度:10 | 否 | code 示例：200 |
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
	"code": 200,
	"message": "操作成功",
	"data": {
		"pageIndex": 0,
		"pageSize": 0,
		"recordCount": 0,
		"recordList": [
			{
				"code": "",
				"name": {
					"zh_TW": "",
					"zh_CN": "",
					"en_US": ""
				},
				"org_id": "",
				"org_id_code": "",
				"org_id_name": "",
				"dept_id": "",
				"dept_id_code": "",
				"dept_id_name": "",
				"jobtype_id": "",
				"job_id": "",
				"jobgrade_id": "",
				"maxrank_id": "",
				"minrank_id": "",
				"duties": "",
				"freeze": 0,
				"os_base_post_id": "",
				"os_base_post_id_post_sequence_id": "",
				"reqedu": "reqedu",
				"user_define_character": {
					"ytenant": "0000LSU86TH67MZUOG0000",
					"id": "1966344373138358281",
					"pubts": "2024-04-03 10:50:14",
					"dr": 1,
					"parentid": "parentid",
					"professional": "professional",
					"tenantid": "tenantid"
				},
				"memo": {
					"zh_TW": "繁体",
					"zh_CN": "中文",
					"en_US": "英文"
				},
				"enable": 0,
				"id": "",
				"pubts": "",
				"sysid": "",
				"distributionSite": "",
				"reqworkyear": "1",
				"level": 1,
				"reqother": "1",
				"reqexp": "1",
				"reqtitle": "2",
				"age": 1,
				"dr": 1,
				"creator": "21212",
				"createTime": "2026-06-07 11:41:55",
				"modifier": "",
				"modifyTime": "2026-06-07 11:41:55"
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

