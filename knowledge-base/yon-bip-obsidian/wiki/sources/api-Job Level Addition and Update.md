---
title: "职级新增更新"
apiId: "6cadac2736794c62bb2b6702a2eac294"
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

# 职级新增更新

> `ContentType	application/json` 请求方式	POST | 分类: Job Level (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/rank/ranksave

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	批量保存/更新

事务和幂等性	MDD幂等

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 否 | 是 | 职级 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| code | string | 否 | 否 | 职级编码 新增时必填 示例：LY007 |
| name | muti_lang | 否 | 否 | 职级名称 新增时必填 |
| ranktype_id | string | 否 | 否 | 职级类别，传id或code 示例：d59cb8c6f18541bf82c8d50efd5e1066 |
| maxrank_id | string | 否 | 否 | 最高职等，传id或code 示例：2476725260161536 |
| minrank_id | string | 否 | 否 | 最低职等，传id或code 示例：2476725251969536 |
| memo | muti_lang | 否 | 否 | 备注 |
| id | string | 否 | 否 | 职级id，更新时必填 |
| enable | string | 否 | 否 | 启动状态 0:未启用 1:启用 2:停用 新增时必填 示例：1 |
| orderNo | long | 否 | 否 | 顺序号 示例：1 |
| _status | string | 否 | 是 | 操作标识 Insert:新增 Update:更新 示例：Insert |
| org_id | string | 否 | 否 | 所属组织，传id或编码 示例：666 |

## 3. 请求示例

Url: /yonbip/digitalModel/rank/ranksave?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"code": "LY007",
		"name": {
			"zh_CN": "中文",
			"en_US": "英文",
			"zh_TW": "繁体"
		},
		"ranktype_id": "d59cb8c6f18541bf82c8d50efd5e1066",
		"maxrank_id": "2476725260161536",
		"minrank_id": "2476725251969536",
		"memo": {
			"zh_CN": "中文",
			"en_US": "英文",
			"zh_TW": "繁体"
		},
		"id": "",
		"enable": "1",
		"orderNo": 1,
		"_status": "Insert",
		"org_id": "666"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 消息 示例：操作成功 |
| data | object | 否 | 职级数据 |
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
				"code": "LY008",
				"name": {
					"zh_CN": "大神仙",
					"en_US": "godlike",
					"zh_TW": "大嬸"
				},
				"jobtype_id": "d59cb8c6f18541bf82c8d50efd5e1066",
				"maxrank_id": "2476725231555072",
				"minrank_id": "2476725232734720",
				"memo": {
					"zh_CN": "123",
					"en_US": "123",
					"zh_TW": "123"
				},
				"enable": 1,
				"id": "2560483904934656",
				"orderNo": 1,
				"pubts": "2021-12-14 18:58:55",
				"yhtTenant": "0000KURZD1WR4P0VIC0000",
				"tenant": "0000KURZD1WR4P0VIC0000",
				"yhtTenantId": "0000KURZD1WR4P0VIC0000",
				"yTenantId": "0000KURZD1WR4P0VIC0000",
				"org_id": "22121333123"
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

999	检查入参是否正确，参数值是否真实存在，仍提示该信息请联系开发	操作失败


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

