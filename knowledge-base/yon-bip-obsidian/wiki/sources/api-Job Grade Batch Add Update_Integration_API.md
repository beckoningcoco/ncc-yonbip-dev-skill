---
title: "职等批量新增更新_集成_API"
apiId: "2133469530663944193"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Job Grade"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Job Grade]
platform_version: "BIP"
source_type: community-api-docs
---

# 职等批量新增更新_集成_API

> `ContentType	application/json` 请求方式	POST | 分类: Job Grade (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/grade/batchSaveOrUpdateForIntegration

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
| data | object | 是 | 否 | data |
| code | string | 否 | 是 | 编码 示例：1 |
| name | muti_lang | 否 | 是 | 名称 |
| enable | number |
| 小数位数:0,最大长度:10 | 否 | 是 | 启用状态，0初始化 1启用 2停用 示例：1 |
| objid | string | 否 | 否 | objid和id，二选一，若都填写，则需要一致 示例：objid |
| id | string | 否 | 否 | objid和id，二选一，若都填写，则需要一致 示例：1 |
| org_id | string | 否 | 是 | 所属组织ID 示例：2332 |
| memo | object | 否 | 否 | 备注 |
| jobrankorder | number |
| 小数位数:0,最大长度:10 | 否 | 是 | 顺序号 示例：1 |
| orgGroupId | string | 否 | 是 | 适用范围ID 示例：33333333 |
| hashCode | string | 否 | 是 | 哈希码 示例：2323232 |
| orgGroupDetailList | object | 是 | 是 | 适用范围数据 |
| distributionSite | string | 否 | 否 | distributionSite |
| ts | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | ts |
| sysid | string | 否 | 是 | sysid 默认值：diwork |
| dr | string | 否 | 否 | 删除状态，0，未删除，1，删除 |
| creator | string | 否 | 否 | 创建人 |
| modifier | string | 否 | 否 | 修改人 |
| createTime | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 创建时间 |
| modifyTime | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 修改时间 |

## 3. 请求示例

Url: /yonbip/digitalModel/grade/batchSaveOrUpdateForIntegration?access_token=访问令牌
Body: {
	"data": [
		{
			"code": "1",
			"name": {
				"zh_TW": "繁体",
				"en_US": "英文",
				"zh_CN": "中文"
			},
			"enable": 1,
			"objid": "objid",
			"id": "1",
			"org_id": "2332",
			"memo": {
				"zh_CN": "中文",
				"en_US": "英文",
				"zh_TW": "繁体"
			},
			"jobrankorder": 1,
			"orgGroupId": "33333333",
			"hashCode": "2323232",
			"orgGroupDetailList": [
				{
					"id": "23232",
					"orgId": "323232",
					"groupId": "23232"
				}
			],
			"distributionSite": "",
			"ts": "2026-06-07 11:42:54",
			"sysid": "",
			"dr": "",
			"creator": "",
			"modifier": "",
			"createTime": "2026-06-07 11:42:54",
			"modifyTime": "2026-06-07 11:42:54"
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | number |
| 小数位数:0,最大长度:10 | 否 | 响应码 示例：200 |
| message | string | 否 | 响应信息 示例：操作成功 |
| data | object | 否 | 响应数据 |
| sucessCount | number |
| 小数位数:0,最大长度:10 | 否 | 成功数量 示例：1 |
| failCount | number |
| 小数位数:0,最大长度:10 | 否 | 失败数量 示例：0 |
| count | number |
| 小数位数:0,最大长度:10 | 否 | 数据总量 示例：1 |
| messages | object | 是 | 失败原因 |
| infos | object | 是 | 数据信息 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"sucessCount": 1,
		"failCount": 0,
		"count": 1,
		"messages": [
			{
				"sourceUnique": "1111",
				"message": "失败原因"
			}
		],
		"infos": [
			{
				"data": {
					"name": {
						"zh_CN": "中文",
						"en_US": "英文",
						"zh_TW": "繁体"
					},
					"code": "1",
					"enable": 1,
					"objid": "objid",
					"jobrankorder": 1,
					"org_id": "2121",
					"memo": {
						"zh_CN": "中文",
						"en_US": "英文",
						"zh_TW": "繁体"
					},
					"orgGroupId": "适用范围ID",
					"hashCode": "121",
					"id": "2121",
					"orgGroupDetailList": {
						"groupId": "2121",
						"id": "3333",
						"orgId": "2112"
					},
					"_status": "Insert",
					"vid": "1112212",
					"creator": "21323",
					"createTime": "2024-03-25 22:44:40",
					"yhtTenant": "0000M0Q43BMZ17WMCB0000",
					"sourceUnique": "666",
					"targetUnique": "2144436240047407112"
				}
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	后端处理失败


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

