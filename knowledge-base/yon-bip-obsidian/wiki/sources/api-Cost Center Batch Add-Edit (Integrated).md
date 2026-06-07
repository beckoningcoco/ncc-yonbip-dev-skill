---
title: "成本中心批量新增/编辑(集成)"
apiId: "2146991934557126660"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Cost Center"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Cost Center]
platform_version: "BIP"
source_type: community-api-docs
---

# 成本中心批量新增/编辑(集成)

> `ContentType	application/json` 请求方式	POST | 分类: Cost Center (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/AMP/bd/v1/integration/costcenter/batchSave

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	批量保存/更新

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 是 | 是 | 请求体 |
| id | string | 否 | 否 | id 示例：1819690017583792130 |
| sourceUnique | string | 否 | 是 | 来源系统唯一标识 |
| code | string | 否 | 是 | 编码 示例：1001 |
| name | string | 否 | 否 | 成本中心名称：中文 示例：行政部门成本 |
| name2 | string | 否 | 否 | 成本中心名称：英文 |
| name3 | string | 否 | 否 | 成本中心名称：繁体 |
| name4 | string | 否 | 否 | 成本中心名称预留 |
| name5 | string | 否 | 否 | 成本中心名称预留 |
| name6 | string | 否 | 否 | 成本中心名称预留 |
| relatedAdminOrg | string | 否 | 否 | 行政组织id |
| parent | string | 否 | 否 | 上级成本中心id |
| ccClass | string | 否 | 是 | 成本中心类别id 示例：1514492098242936839 |
| manager | string | 否 | 否 | 负责人id |
| enableDate | string | 否 | 是 | 生效日期 示例：2024-05-08 |
| expireDate | string | 否 | 是 | 失效时间 示例：9999-12-31 |
| effect | boolean | 否 | 是 | 是否生效 示例：true |
| shareAccentity | boolean | 否 | 否 | 共享给其他会计主体 示例：true |
| description | string | 否 | 否 | 描述：中文 |
| description2 | string | 否 | 否 | 描述：英文 |
| description3 | string | 否 | 否 | 描述：繁体 |
| description4 | string | 否 | 否 | 描述：预留字段 |
| description5 | string | 否 | 否 | 描述：预留字段 |
| description6 | string | 否 | 否 | 描述：预留字段 |
| accentity | string | 否 | 是 | 会计主体 示例：1819691117583792130 |
| orgUnit | string | 否 | 是 | 业务单元 示例：1819692227583792130 |
| relations | object | 是 | 否 | 对照关系 |
| dis | object | 是 | 否 | 利润中心 |
| character | object | 否 | 否 | 特征对象{特征编码：特征值} 示例：{"特征编码"：特征值} |
| accentities | object | 是 | 否 | 共享会计主体 |

## 3. 请求示例

Url: /yonbip/AMP/bd/v1/integration/costcenter/batchSave?access_token=访问令牌
Body: {
	"data": [
		{
			"id": "1819690017583792130",
			"sourceUnique": "",
			"code": "1001",
			"name": "行政部门成本",
			"name2": "",
			"name3": "",
			"name4": "",
			"name5": "",
			"name6": "",
			"relatedAdminOrg": "",
			"parent": "",
			"ccClass": "1514492098242936839",
			"manager": "",
			"enableDate": "2024-05-08",
			"expireDate": "9999-12-31",
			"effect": true,
			"shareAccentity": true,
			"description": "",
			"description2": "",
			"description3": "",
			"description4": "",
			"description5": "",
			"description6": "",
			"accentity": "1819691117583792130",
			"orgUnit": "1819692227583792130",
			"relations": [
				{
					"org": "",
					"dept": "",
					"workCenter": "",
					"isDefault": true
				}
			],
			"dis": [
				{
					"accPurpose": "",
					"enableDate": "2024-05-08",
					"profitCenter": ""
				}
			],
			"character": {},
			"accentities": [
				{
					"accentity": "",
					"org": ""
				}
			]
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回编码 示例：200 |
| message | string | 否 | 返回信息 |
| data | object | 否 | 返回数据 |
| count | string | 否 | 操作成本中心条数 示例：1 |
| sucessCount | string | 否 | 操作成本中心成功条数 示例：1 |
| failCount | string | 否 | 操作成本中心失败条数 示例：0 |
| infos | object | 是 | 操作成本中心的提示信息 |
| messages | object | 是 | 错误数据列表 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"count": "1",
		"sucessCount": "1",
		"failCount": "0",
		"infos": [
			{
				"data": {
					"code": "test007",
					"name": {
						"zh_CN": ""
					},
					"ccClass": "1514492098242936839",
					"enableDate": "2024-06-17 00:00:00",
					"expireDate": "9999-10-30 00:00:00",
					"effect": "true",
					"accentity": "1514558842038386692",
					"orgUnit": "1514558842038386692",
					"shareAccentity": true,
					"id": "2022099559817674762",
					"isDefault": "false",
					"objid": "1",
					"relations": [
						{
							"org": "1514558842038386692",
							"dept": "1946510343017070599",
							"header": "2022099559817674762",
							"id": "2022099559817674763",
							"effect": "true",
							"isDefault": "false"
						}
					],
					"sourceUnique": "",
					"targetUnique": "",
					"accentities": [
						{
							"id": "",
							"header": "",
							"accentity": "",
							"org": ""
						}
					]
				}
			}
		],
		"messages": [
			{
				"sourceUnique": "",
				"message": ""
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-06-27

新增

请求参数 (4)

删除

请求参数 isDefault

新增

返回参数 (6)

添加共享会计主体


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

