---
title: "职务类别新增更新"
apiId: "8610548e34924b5cbcf5668a4ff7c057"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Job Category"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Job Category]
platform_version: "BIP"
source_type: community-api-docs
---

# 职务类别新增更新

> `ContentType	application/json` 请求方式	POST | 分类: Job Category (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/dutytype/stafforgsave

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
| data | object | 否 | 是 | 职务类别 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| code | string | 否 | 否 | 职务类别编码 新增时必填 示例：1512632312123 |
| name | muti_lang | 否 | 否 | 职务类别名称 新增时必填 |
| memo | muti_lang | 否 | 否 | 备注 |
| enable | long | 否 | 否 | 启动状态 0:未启用 1:启用 2:停用 新增时必填 示例：1 |
| id | string | 否 | 否 | 职务类别id，更新时必输 示例：2554335475553024 |
| parentid | string | 否 | 否 | 上级职务类别 传id或code 示例：1989职务类别 |
| _status | string | 否 | 是 | 操作标识 Insert:新增 Update:更新 示例：Update |

## 3. 请求示例

Url: /yonbip/digitalModel/dutytype/stafforgsave?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"code": "1512632312123",
		"name": {
			"zh_CN": "中文",
			"en_US": "英文",
			"zh_TW": "繁体"
		},
		"memo": {
			"zh_CN": "中文",
			"en_US": "英文",
			"zh_TW": "繁体"
		},
		"enable": 1,
		"id": "2554335475553024",
		"parentid": "1989职务类别",
		"_status": "Update"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 消息 示例：操作成功 |
| data | object | 否 | 职务类别数据 |
| count | long | 否 | 处理条数 示例：1 |
| sucessCount | long | 否 | 成功条数 示例：1 |
| failCount | long | 否 | 失败条数 示例：0 |
| messages | string | 是 | 返回信息 |
| infos | object | 是 | 数据信息 |
| failInfos | string | 是 | 失败信息 |
| org_id | string | 否 | 所属组织id |

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
				"code": "00747",
				"name": {
					"zh_CN": "职务类别1",
					"en_US": "dutyType",
					"zh_TW": "職務類別"
				},
				"memo": {
					"zh_CN": "备注",
					"en_US": "memo",
					"zh_TW": "備註"
				},
				"enable": 1,
				"parentid": "ade3d8630984493880bdf60baeb9cc8f",
				"id": "2561403409305856",
				"pubts": "2021-12-15 10:34:17",
				"yhtTenant": "0000KURZD1WR4P0VIC0000",
				"tenant": "0000KURZD1WR4P0VIC0000",
				"yhtTenantId": "0000KURZD1WR4P0VIC0000",
				"yTenantId": "0000KURZD1WR4P0VIC0000"
			}
		],
		"failInfos": [
			""
		],
		"org_id": ""
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	检查入参是否正确，参数值是否真实存在，仍提示该信息请联系开发人员	操作失败


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-06-19

新增

请求参数 user_define_character

HXRL-123878 职务类别接特征


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

