---
title: "员工类别批量新增"
apiId: "c4b1ded0619a4716bcd7a28e28161c47"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Employee Category"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Employee Category]
platform_version: "BIP"
source_type: community-api-docs
---

# 员工类别批量新增

> `ContentType	application/json` 请求方式	POST | 分类: Employee Category (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/psnlcatg/batchSave

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
| data | object | 是 | 否 | 入参 |
| id | string | 否 | 否 | 员工类别ID 新增时不填，修改时必填 示例：2570495368401408 |
| code | string | 否 | 是 | 编码 示例：01 |
| parent | string | 否 | 否 | 上级员工类别ID或上级员工类别编码 示例：2570495368401408 或 01 |
| enable | int | 否 | 否 | 启用状态，1 启用 2 停用 如不填写默认为启用 示例：1 默认值：1 |
| memo | string | 否 | 否 | 备注 示例：test |
| _status | string | 否 | 是 | 操作标识，Insert新增 Update更新 示例：Insert |
| name | muti_lang | 否 | 是 | 名称，支持多语 |

## 3. 请求示例

Url: /yonbip/digitalModel/psnlcatg/batchSave?access_token=访问令牌
Body: {
	"data": [
		{
			"id": "2570495368401408",
			"code": "01",
			"parent": "2570495368401408 或 01",
			"enable": 1,
			"memo": "test",
			"_status": "Insert",
			"name": ""
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 返回消息 示例：操作成功 |
| data | object | 否 | 响应 |
| count | int | 否 | 总数 示例：1 |
| sucessCount | int | 否 | 成功条数 示例：2 |
| failCount | int | 否 | 失败条数 示例：0 |
| messages | string | 是 | 返回消息 |
| infos | object | 是 | 成功信息 |
| failInfos | object | 是 | 失败信息 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"count": 1,
		"sucessCount": 2,
		"failCount": 0,
		"messages": [
			""
		],
		"infos": [
			{
				"code": "11",
				"name": {
					"zh_CN": "测试",
					"en_US": "test",
					"zh_TW": "测试",
					"__rowNum": 1,
					"__orginSheetName": "PsnlCatg(2)"
				},
				"parent": "d1170ea764cb4d95a30554cda58866c9",
				"sysid": "diwork",
				"enable": 1,
				"memo": "test",
				"fromApi_orgStaff": true,
				"id": "f46bf63c95ce4261a80b19a2c419c773",
				"creator": "00001951-7ca3-47ac-a462-d5a66e3e6724",
				"creationtime": "2021-04-20 10:51:49",
				"dr": 0,
				"pubts": "2021-04-20 10:51:50",
				"yhtTenantId": "hxetunde",
				"tenant": "hxetunde",
				"yTenantId": "hxetunde",
				"yhtTenant": "hxetunde"
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

999	后台逻辑异常	联系管理员


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-03-13

更新

请求参数 enable

更新

请求参数 name

删除

请求参数 zh_CN

删除

请求参数 en_US

删除

请求参数 zh_TW

更新

返回参数 enable

更新

返回参数 failInfos

2	2023-12-27

更新

请求参数 name

name处理


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

