---
title: "职务新增更新"
apiId: "94362c70ac904dfaade94ec85992588c"
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

# 职务新增更新

> `ContentType	application/json` 请求方式	POST | 分类: Title (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/duty/dutysave

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	MDD幂等

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 否 | 是 | 职务 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| code | string | 否 | 否 | 职务编码 新增时必填 示例：LY007 |
| name | muti_lang | 否 | 否 | 职务名称 新增时必填 |
| jobtype_id | string | 否 | 是 | 职务类别，传id或编码 示例：d59cb8c6f18541bf82c8d50efd5e1066 |
| jobgrade_id | string | 否 | 否 | 职级，传id或编码 示例：2561357847859456 |
| maxrank_id | string | 否 | 否 | 最高职等，传id或编码 示例：2476725260161536 |
| minrank_id | string | 否 | 否 | 最低职等，传id或编码 示例：2476725251969536 |
| org_id | string | 否 | 否 | 所属组织，传id或编码 示例：666 |
| duties | string | 否 | 否 | 职责 示例：管理 |
| memo | muti_lang | 否 | 否 | 备注 |
| id | string | 否 | 否 | 职务id，更新时必填 |
| enable | long | 否 | 否 | 启动状态 0:未启用 1:启用 2:停用 新增时必填 示例：1 |
| _status | string | 否 | 是 | 操作标识 Insert:新增 Update:更新 示例：Insert |

## 3. 请求示例

Url: /yonbip/digitalModel/duty/dutysave?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"code": "LY007",
		"name": {
			"zh_CN": "中文",
			"en_US": "英文",
			"zh_TW": "繁体"
		},
		"jobtype_id": "d59cb8c6f18541bf82c8d50efd5e1066",
		"jobgrade_id": "2561357847859456",
		"maxrank_id": "2476725260161536",
		"minrank_id": "2476725251969536",
		"org_id": "666",
		"duties": "管理",
		"memo": {
			"zh_CN": "中文",
			"en_US": "英文",
			"zh_TW": "繁体"
		},
		"id": "",
		"enable": 1,
		"_status": "Insert"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 消息 示例：操作成功 |
| data | object | 否 | 职务数据 |
| count | long | 否 | 处理条数 示例：1 |
| sucessCount | long | 否 | 成功条数 示例：1 |
| failCount | long | 否 | 失败条数 示例：0 |
| messages | string | 是 | 返回信息 |
| infos | object | 是 | 数据信息 |
| failInfos | string | 是 | 失败信息 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			""
		],
		"infos": [
			{
				"code": "1888",
				"sysid": "diwork",
				"name": {
					"zh_CN": "职务68",
					"en_US": "Job",
					"zh_TW": "職務"
				},
				"jobtype_id": "d59cb8c6f18541bf82c8d50efd5e1066",
				"jobgrade_id": "2561357847859456",
				"maxrank_id": "2476725231555072",
				"minrank_id": "2476725248086528",
				"memo": {
					"zh_CN": "备注",
					"en_US": "memo",
					"zh_TW": "備註"
				},
				"duties": "总监",
				"enable": 1,
				"id": "2561376021139712",
				"pubts": "2021-12-15 10:06:26",
				"yhtTenant": "0000KURZD1WR4P0VIC0000",
				"tenant": "0000KURZD1WR4P0VIC0000",
				"yhtTenantId": "0000KURZD1WR4P0VIC0000",
				"yTenantId": "0000KURZD1WR4P0VIC0000",
				"org_id": "1945848780620300296"
			}
		],
		"failInfos": [
			""
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2024-11-21

新增

请求参数 user_define_character

添加特征


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

