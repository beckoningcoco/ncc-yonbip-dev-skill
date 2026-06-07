---
title: "特征选配删除"
apiId: "1755505004099141634"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Characteristic selection sheet"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Characteristic selection sheet]
platform_version: "BIP"
source_type: community-api-docs
---

# 特征选配删除

> `ContentType	application/json` 请求方式	POST | 分类: Characteristic selection sheet (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/cts/batchdelete

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| data | object | 是 | 是 | 业务数据 |
| id | long | 否 | 否 | id，id和来源单据行id不能同时为空，有id时，以id为准 示例：1753368859170045952 |
| sourceSrcDocId | long | 否 | 否 | 来源单据行id 示例：1734886163199557641 |

## 3. 请求示例

Url: /yonbip/digitalModel/cts/batchdelete?access_token=访问令牌
Body: {
	"data": [
		{
			"id": 1753368859170045952,
			"sourceSrcDocId": 1734886163199557641
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 接口返回信息 示例：操作成功 |
| data | object | 否 | 接口返回数据 |
| count | long | 否 | 总计数 示例：1 |
| sucessCount | long | 否 | 成功计数 示例：1 |
| failCount | long | 否 | 失败计数 示例：0 |
| messages | string | 是 | 提示信息 |
| infos | string | 是 | 操作成功单据信息 |
| failinfos | object | 是 | 操作失败单据信息 |

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
			""
		],
		"failinfos": [
			{
				"id": 1753368859170045952,
				"sourceSrcDocId": 1757267237841403906,
				"message": "单据不存在或已失效"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码


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

