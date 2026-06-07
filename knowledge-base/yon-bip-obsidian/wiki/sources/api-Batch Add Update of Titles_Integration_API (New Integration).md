---
title: "职务批量新增更新_集成_API(新集成)"
apiId: "2304739761043537926"
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

# 职务批量新增更新_集成_API(新集成)

> `ContentType	application/json` 请求方式	POST | 分类: Title (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/PFC/duty/batchSaveOrUpdateForIntegrationMdd

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	批量保存/更新

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 是 | 否 | 数据 |
| name | muti_lang | 否 | 是 | 名称 |
| id | string | 否 | 否 | id |
| objid | string | 否 | 否 | 来源系统主键 示例：123 |
| code | string | 否 | 是 | 编码 示例：0000001 |
| enable | int | 否 | 是 | 启用状态，0初始化 1启用 2停用 示例：1 |
| jobtype_id | string | 否 | 是 | 所属职务类别ID或者编码 示例：1793555717112725505 |
| jobgrade_id | string | 否 | 否 | 职级ID或者编码 示例：1793555717112725505 |
| maxrank_id | string | 否 | 否 | 最高职等ID或者编码 示例：1793555004148154378 |
| minrank_id | string | 否 | 否 | 最低职等ID或者编码 示例：1793555004148154378 |
| org_id | string | 否 | 是 | 所属组织ID或者编码 示例：666 |
| duties | string | 否 | 否 | 职责 示例：职责 |
| memo | muti_lang | 否 | 否 | 备注 |
| distributionSite | string | 否 | 否 | distributionSite |
| dr | string | 否 | 否 | 删除状态 |
| modifyTime | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 修改时间 |
| createTime | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 创建时间 |
| creator | string | 否 | 否 | 创建人 |
| modifier | string | 否 | 否 | 修改人 |
| sysid | string | 否 | 否 | sysid 默认值：diwork |

## 3. 请求示例

Url: /yonbip/PFC/duty/batchSaveOrUpdateForIntegrationMdd?access_token=访问令牌
Body: {
	"data": [
		{
			"name": {
				"zh_TW": "繁体",
				"en_US": "英文",
				"zh_CN": "中文"
			},
			"id": "",
			"objid": "123",
			"code": "0000001",
			"enable": 1,
			"jobtype_id": "1793555717112725505",
			"jobgrade_id": "1793555717112725505",
			"maxrank_id": "1793555004148154378",
			"minrank_id": "1793555004148154378",
			"org_id": "666",
			"duties": "职责",
			"memo": {
				"zh_TW": "繁体",
				"en_US": "英文",
				"zh_CN": "中文"
			},
			"distributionSite": "",
			"dr": "",
			"modifyTime": "2026-06-07 11:42:05",
			"createTime": "2026-06-07 11:42:05",
			"creator": "",
			"modifier": "",
			"sysid": ""
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | code 示例：200 |
| message | string | 否 | message 示例：操作成功 |
| data | object | 否 | data |
| count | number |
| 小数位数:0,最大长度:10 | 否 | count 示例：2 |
| sucessCount | number |
| 小数位数:0,最大长度:10 | 否 | sucessCount 示例：2 |
| failCount | number |
| 小数位数:0,最大长度:10 | 否 | failCount 示例：0 |
| messages | object | 是 | messages |
| infos | object | 是 | infos |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"count": 2,
		"sucessCount": 2,
		"failCount": 0,
		"messages": [
			{}
		],
		"infos": [
			{
				"data": {
					"code": "1472146898874793985",
					"enable": 1,
					"name": {
						"zh_CN": "职务1"
					},
					"jobtype_id": "551c3b4bf27a4b49a5ed834fe8cc0347",
					"id": "1472146898874793985",
					"pubts": "2022-06-07 13:40:56",
					"user_define_character": {},
					"memo": {
						"zh_CN": "备注"
					},
					"org_id": "1945848780620300296"
				}
			}
		]
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

