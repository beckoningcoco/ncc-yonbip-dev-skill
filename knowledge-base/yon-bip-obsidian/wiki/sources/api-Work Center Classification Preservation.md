---
title: "工作中心分类保存V2"
apiId: "1933835327599280137"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Work Center Catg."
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Work Center Catg.]
platform_version: "BIP"
source_type: community-api-docs
---

# 工作中心分类保存V2

> `ContentType	application/json` 请求方式	POST | 分类: Work Center Catg. (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/mfg/workcenter-category/V1

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	单条保存/更新

事务和幂等性	MDD幂等

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 否 | 是 | 工作中心分类数据集 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| id | long | 否 | 否 | 工作中心分类id。主键， 新增时无需填写，修改时必填 示例：2337736480166144 |
| orgId | string | 否 | 否 | 组织id,组织id和组织编码不能同时为空，id和编码同时存在，以id为准 示例：1866605942198528 |
| orgCode | string | 否 | 否 | 组织编码,组织id和组织编码不能同时为空，id和编码同时存在，以id为准 示例：L工厂1 |
| code | string | 否 | 是 | 编码。同一组织下编码不能重复 示例：WCC001 |
| name | string | 否 | 是 | 工作中心分类名称.同一组织下不能重复。 示例：预制类 |
| memo | string | 否 | 否 | 备注 示例：备注信息 |
| defines | object | 否 | 否 | 固定自定义项。例：{ "id":"2357782025966080", "define43":"yyy" }更新自定义项id必填。 |
| workCenterCategoryAttrextItem | object | 否 | 否 | 自由自定义项，例：{ "id":"2357782025966080", "define1":"yyy" }，更新自定义项值时自由自定义项id为必填项 |
| _status | string | 否 | 是 | 数据状态，枚举值，Insert：插入，Update：更新 示例：Insert |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |

## 3. 请求示例

Url: /yonbip/mfg/workcenter-category/V1?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "951ada30e0969e954f5d9058fff6a512",
		"id": 2337736480166144,
		"orgId": "1866605942198528",
		"orgCode": "L工厂1",
		"code": "WCC001",
		"name": "预制类",
		"memo": "备注信息",
		"defines": {
			"id": ""
		},
		"workCenterCategoryAttrextItem": {
			"id": ""
		},
		"_status": "Insert"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 接口调用返回码，成功时返回200 示例：200 |
| message | string | 否 | 接口调用返回信息 示例：操作成功 |
| data | object | 否 | 接口调用返回数据 |
| sucessCount | long | 否 | 成功数 示例：1 |
| failCount | long | 否 | 失败数 示例：0 |
| count | long | 否 | 记录总数 示例：1 |
| messages | string | 是 | 数据返回信息汇总 |
| infos | object | 是 | 返回详细信息 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"sucessCount": 1,
		"failCount": 0,
		"count": 1,
		"messages": [
			""
		],
		"infos": [
			{
				"code": 200,
				"data": {
					"code": "15",
					"name": "15",
					"id": 2357782025966080,
					"orgId": "1866605942198528",
					"orgCode": "#中国电信全职能组织",
					"modifier": "15810437080",
					"modifierId": 1866554948653312,
					"modifyTime": "2022-12-27 12:00:00",
					"modifyDate": "2022-12-27 12:00:00",
					"tenant": 1861077976273152,
					"memo": "备注",
					"defines": {
						"id": "2371776882397440",
						"define1": "222",
						"yTenantId": "tl27pqwt",
						"pubts": "2022-12-27 12:00:00"
					},
					"workCenterCategoryAttrextItem": {
						"id": "2371983099466496",
						"define1": "111",
						"yTenantId": "tl27pqwt",
						"pubts": "2022-12-27 12:00:00"
					},
					"pubts": "2022-12-27 12:00:00",
					"creator": "张三",
					"creatorId": "2192008994279680",
					"createTime": "2022-12-27 12:00:00",
					"createDate": "2022-12-27 12:00:00",
					"yTenantId": "csrka3z7"
				},
				"rowNum": 1,
				"message": "操作成功"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-06-26

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

