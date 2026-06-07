---
title: "成本中心批量新增/编辑"
apiId: "2002835798274605064"
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

# 成本中心批量新增/编辑

> `ContentType	application/json` 请求方式	POST | 分类: Cost Center (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/AMP/bd/v1/costcenter/batchSave

请求方式	POST

ContentType	application/json

应用场景	开放API

API类别	批量保存/更新

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| id | string | 否 | 否 | 成本中心id（新增不传该值，编辑时传值) 示例：1819690017583792130 |
| code | string | 否 | 是 | 成本中心编码 示例：1001 |
| name | string | 否 | 是 | 成本中心名称：中文 示例：行政部门成本 |
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
| expireDate | string | 否 | 是 | 失效日期 示例：9999-12-31 |
| effect | boolean | 否 | 是 | 是否生效 示例：true |
| isDefault | boolean | 否 | 否 | 是否默认成本中心 示例：true |
| description | string | 否 | 否 | 备注：中文 |
| description2 | string | 否 | 否 | 备注：英文 |
| description3 | string | 否 | 否 | 备注：繁体 |
| description4 | string | 否 | 否 | 备注预留多语 |
| description5 | string | 否 | 否 | 备注预留多语 |
| description6 | string | 否 | 否 | 备注预留多语 |
| accentity | string | 否 | 是 | 会计主体id 示例：1819691117583792130 |
| shareAccentity | boolean | 否 | 否 | 共享给其他会计主体 |
| orgUnit | string | 否 | 是 | 所属业务单元id 示例：1819692227583792130 |
| relations | object | 是 | 否 | 对照关系 |
| org | string | 否 | 否 | 业务单元id |
| dept | string | 否 | 是 | 部门id，设置”部门“时，需传入对应业务单元 |
| workCenter | string | 否 | 否 | 工作中心id |
| isDefault | boolean | 否 | 否 | 默认部门 示例：true |
| id | string | 否 | 否 | 对照关系id |
| _status | string | 否 | 否 | 对照关系操作类（共有三种类型：Insert、Update、Delete）型，分别代表 新增、编辑、删除, Insert时，对照关系id非必填。 Update、Delete时，对照关系id必填。 示例：Insert |
| dis | object | 是 | 否 | 利润中心 |
| accPurpose | string | 否 | 否 | 核算目的id |
| enableDate | string | 否 | 否 | 生效日期，设置”生效日期“必填，核算目的、利润中心也需要填写 示例：2024-05-08 |
| profitCenter | string | 否 | 否 | 利润中心id |
| id | string | 否 | 否 | 成本中心的利润中心id |
| _status | string | 否 | 否 | 利润中心操作类（共有三种类型：Insert、Update、Delete）型，分别代表 新增、编辑、删除, Insert时，利润中心id非必填。 Update、Delete时，利润中心id必填。 示例：Insert |
| accentities | object | 否 | 否 | 共享会计主体 |
| id | string | 否 | 否 | 共享会计主体id |
| accentity | string | 否 | 否 | 会计主体id |
| org | string | 否 | 否 | 业务单元id |
| _status | string | 否 | 否 | 共享会计主体操作类（共有三种类型：Insert、Update、Delete）型，分别代表 新增、编辑、删除, Insert时，共享会计主体id非必填。 Update、Delete时，共享会计主体id必填。 |

## 3. 请求示例

Url: /yonbip/AMP/bd/v1/costcenter/batchSave?access_token=访问令牌
Body: [{
	"id": "1819690017583792130",
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
	"isDefault": true,
	"description": "",
	"description2": "",
	"description3": "",
	"description4": "",
	"description5": "",
	"description6": "",
	"accentity": "1819691117583792130",
	"shareAccentity": true,
	"orgUnit": "1819692227583792130",
	"relations": [
		{
			"org": "",
			"dept": "",
			"workCenter": "",
			"isDefault": true,
			"id": "",
			"_status": "Insert"
		}
	],
	"dis": [
		{
			"accPurpose": "",
			"enableDate": "2024-05-08",
			"profitCenter": "",
			"id": "",
			"_status": "Insert"
		}
	],
	"accentities": {
		"id": "",
		"accentity": "",
		"org": "",
		"_status": ""
	}
}]

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回编码 示例：200 |
| message | string | 否 | 返回信息 |
| data | object | 否 | 返回数据 |
| count | string | 否 | 操作成本中心条数 示例：1 |
| sucessCount | string | 否 | 操作成本中心成功条数 示例：1 |
| failCount | string | 否 | 操作成本中心失败条数 示例：0 |
| infos | object | 是 | 操作成本中心的提示信息 |

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
						"zh_CN": "test007"
					},
					"ccClass": "1514492098242936839",
					"enableDate": "2024-06-17 00:00:00",
					"expireDate": "9999-10-30 00:00:00",
					"effect": "true",
					"accentity": "1514558842038386692",
					"orgUnit": "1514558842038386692",
					"id": "2022099559817674762",
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
					"accentities": {
						"id": "2283278273242726401",
						"accentity": "2001249864307965956",
						"org": "2001249864307965956"
					},
					"shareAccentity": "true"
				},
				"key": "1"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

code=0，success=false	表示新增报错	查看message信息


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-06-27

更新

请求说明

新增

请求参数 (6)

新增

返回参数 (5)

更新

返回参数 message

删除

返回参数 isDefault

添加共享会计主体


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

