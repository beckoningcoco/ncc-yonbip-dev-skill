---
title: "证件类型批量新增更新_集成_API"
apiId: "2132728477031333897"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Certificate Type Card"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Certificate Type Card]
platform_version: "BIP"
source_type: community-api-docs
---

# 证件类型批量新增更新_集成_API

> `ContentType	application/json` 请求方式	POST | 分类: Certificate Type Card (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/idtype/batchSaveOrUpdateForIntegration

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
| data | object | 是 | 否 | 数据 |
| name | object | 否 | 是 | 名称 |
| objid | string | 否 | 否 | 来源主键, 新增时必填, id和objid同时存在，两者需要保持一致 示例：123 |
| code | string | 否 | 是 | 编码 示例：0000001 |
| enable | int | 否 | 是 | 启用状态，0初始化 1启用 2停用 示例：1 |
| id | string | 否 | 否 | 主键 示例：232334242 |
| distributionSite | string | 否 | 否 | 来源 |
| pubs | string | 否 | 否 | 时间戳 |
| dr | string | 否 | 否 | 删除状态 |
| sysid | string | 否 | 否 | 应用标识 |

## 3. 请求示例

Url: /yonbip/digitalModel/idtype/batchSaveOrUpdateForIntegration?access_token=访问令牌
Body: {
	"data": [
		{
			"name": {
				"zh_CN": "",
				"en_US": "",
				"zh_TW": ""
			},
			"objid": "123",
			"code": "0000001",
			"enable": 1,
			"id": "232334242",
			"distributionSite": "",
			"pubs": "",
			"dr": "",
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
| failInfos | object | 是 | failInfos |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"count": 2,
		"sucessCount": 2,
		"failCount": 0,
		"messages": [
			{
				"sourceUnique": "11",
				"messages": "错误信息描述"
			}
		],
		"infos": [
			{
				"data": {
					"sourceUnique": "11",
					"targetUnique": "21",
					"code": "1472146898874793985",
					"enable": 1,
					"name": {
						"zh_CN": "职务1"
					},
					"id": "1472146898874793985",
					"pubts": "2022-06-07 13:40:56",
					"memo": "",
					"distributionSite": ""
				}
			}
		],
		"failInfos": [
			{}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	操作失败


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-03-10

更新

请求参数 (9)

支持商开、海外


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

