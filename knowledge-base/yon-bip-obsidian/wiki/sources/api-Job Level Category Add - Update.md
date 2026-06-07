---
title: "职级类别新增|更新"
apiId: "1815030304469942278"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Job Level Category"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Job Level Category]
platform_version: "BIP"
source_type: community-api-docs
---

# 职级类别新增|更新

> `ContentType	application/json` 请求方式	POST | 分类: Job Level Category (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/bd_rank_type/save

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
| data | object | 否 | 是 | 数据 |
| enable | string | 否 | 是 | 启用状态，0初始化 1启用 2停用 示例：1 |
| name | object | 否 | 是 | 职级类别名称 |
| id | string | 否 | 否 | 主键(更新时必填，新增时可以不填) |
| code | string | 否 | 是 | 职级类别编码 示例：0001 |
| memo | string | 否 | 否 | 备注 示例：备注 |
| _status | string | 否 | 是 | 操作标识，Insert新增 Update更新 示例：Insert |

## 3. 请求示例

Url: /yonbip/digitalModel/bd_rank_type/save?access_token=访问令牌
Body: {
	"data": {
		"enable": "1",
		"name": {
			"en_US": "英文",
			"zh_TW": "繁体",
			"zh_CN": "简体"
		},
		"id": "",
		"code": "0001",
		"memo": "备注",
		"_status": "Insert"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | int | 否 | 状态码 示例：200 |
| message | string | 否 | 返回状态 示例：操作成功 |
| data | object | 否 | 业务数据 |
| code | string | 否 | 编码 |
| name | object | 否 | 名称 |
| enable | int | 否 | 启用状态，0初始化 1启用 2停用 |
| id | string | 否 | 主键 |
| pubts | string | 否 | 时间戳 |
| sysid | string | 否 | 系统标识 |
| dr | int | 否 | 删除状态，0未删除 1已删除 |
| memo | string | 否 | 备注 |
| creator | string | 否 | 创建人 |
| creationtime | string | 否 | 创建时间 |
| yhtTenant | string | 否 | 友互通租户 |
| tenant | string | 否 | 租户ID |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"code": "",
		"name": {
			"en_US": "",
			"zh_TW": "",
			"zh_CN": ""
		},
		"enable": 0,
		"id": "",
		"pubts": "",
		"sysid": "",
		"dr": 0,
		"memo": "",
		"creator": "",
		"creationtime": "",
		"yhtTenant": "",
		"tenant": ""
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-06-20

新增

请求参数 user_define_character

HXRL-123878 职级类别接特征


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

