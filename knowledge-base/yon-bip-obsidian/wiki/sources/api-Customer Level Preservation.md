---
title: "客户级别保存V2"
apiId: "209e80089a9d4a3186914fcfa3dd494b"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Customer Grade"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Customer Grade]
platform_version: "BIP"
source_type: community-api-docs
---

# 客户级别保存V2

> `ContentType	application/json` 请求方式	POST | 分类: Customer Grade (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/batch/cuslevel/save

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
| data | object | 是 | 是 | 客户级别 |
| code | string | 否 | 是 | 客户级别编码 示例：lytest0000 |
| name | object | 否 | 是 | 客户级别名称（多语） |
| isEnabled | boolean | 否 | 是 | 启用状态，true：是，false：否 示例：true |
| order | long | 否 | 否 | 排序 示例：0 |
| _status | string | 否 | 是 | Insert：新增，Update：修改 示例：Insert |
| id | string | 否 | 否 | 客户级别id，新增不填，修改必填 示例：123456 |
| comment | object | 否 | 否 | 备注（多语） |

## 3. 请求示例

Url: /yonbip/digitalModel/batch/cuslevel/save?access_token=访问令牌
Body: {
	"data": [
		{
			"code": "lytest0000",
			"name": {
				"zh_CN": "lytest0000",
				"en_US": "lytest0000",
				"zh_TW": "lytest0000"
			},
			"isEnabled": true,
			"order": 0,
			"_status": "Insert",
			"id": "123456",
			"comment": {
				"zh_CN": "中文",
				"en_US": "英文",
				"zh_TW": "繁体"
			}
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 200：成功，其它：失败 示例：200 |
| message | string | 否 | 调用结果 示例：操作成功 |
| data | object | 否 | 返回的数据 |
| successCountAI | long | 否 | 默认0 示例：0 |
| failCountAI | long | 否 | 默认0 示例：0 |
| count | long | 否 | 总条数 示例：1 |
| sucessCount | long | 否 | 成功条数 示例：1 |
| failCount | long | 否 | 失败条数 示例：0 |
| messages | string | 是 | 调用信息 |
| infos | object | 是 | 客户级别 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"successCountAI": 0,
		"failCountAI": 0,
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			""
		],
		"infos": [
			{
				"code": "003",
				"name": {
					"zh_CN": "003",
					"en_US": "003",
					"zh_TW": "003"
				},
				"isEnabled": true,
				"order": 1,
				"id": 2257047303983360,
				"comment": {
					"zh_CN": "中文",
					"en_US": "英文",
					"zh_TW": "繁体"
				},
				"creator": "YonSuite默认用户",
				"creatorId": 2155538209116416,
				"createTime": "2021-05-14 10:27:14",
				"createDate": "2021-05-14 10:27:14",
				"pubts": "2021-05-14 10:27:15",
				"modifier": "修改人",
				"modifierId": "2155538209116416",
				"modifyTime": "2021-05-14 10:27:14",
				"modifyDate": "2021-05-14 00:00:00",
				"tenant": 2155538208313600,
				"yTenantId": "csrka3z7"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	服务端逻辑异常	检查入参是否填写正确，参数值是否真实存在，仍提示该信息请联系开发人员。


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-17

更新

请求说明


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

