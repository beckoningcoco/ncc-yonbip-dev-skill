---
title: "计量单位分组保存"
apiId: "1aa5c713231e4dd4ab79994df2b2a14c"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "UoM"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, UoM]
platform_version: "BIP"
source_type: community-api-docs
---

# 计量单位分组保存

> `ContentType	application/json` 请求方式	POST | 分类: UoM (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/bill/save

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
| data | object | 否 | 是 | 计量单位分组 |
| code | string | 否 | 是 | 计量单位分组编码，当计量单位分组编码已存在时，均为修改操作 示例：miaoa |
| name | object | 否 | 是 | 计量单位分组名称（多语） |
| desc | string | 否 | 否 | 备注 示例：备注 |
| id | string | 否 | 否 | 计量单位分组id，新增时不填，修改必填 示例：123456 |
| stopstatus | string | 否 | 是 | 是否停用状态，true：已停用，false：已启用 示例：false |
| _status | string | 否 | 是 | Insert：新增，Update：修改 示例：Insert |

## 3. 请求示例

Url: /yonbip/digitalModel/bill/save?access_token=访问令牌
Body: {
	"data": {
		"code": "miaoa",
		"name": {
			"zh_CN": "中文",
			"en_US": "英文",
			"zh_TW": "繁体"
		},
		"desc": "备注",
		"id": "123456",
		"stopstatus": "false",
		"_status": "Insert"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 请求结果状态码 示例：200 |
| message | string | 否 | 请求结果信息 示例：操作成功 |
| data | object | 否 | 请求出参数据 |
| code | string | 否 | 计量单位分组编码 示例：lccc |
| name | object | 否 | 计量单位分组名称 |
| desc | string | 否 | 计量单位分组备注 示例：cdc |
| creator | string | 否 | 创建者 示例：19768888888 |
| createDate | string | 否 | 创建日期 示例：2021-03-11 11:56:05 |
| createTime | string | 否 | 创建时间 示例：2021-03-11 11:56:05 |
| modifier | string | 否 | 修改者 示例：19768888888 |
| modifierId | string | 否 | 修改者id 示例：19768888888 |
| modifyTime | string | 否 | 修改时间 示例：2021-03-11 11:56:05 |
| modifyDate | string | 否 | 修改日期 示例：2021-03-11 11:56:05 |
| stopstatus | boolean | 否 | 是否停用状态，true：已停用，false：已启用 示例：false |
| id | long | 否 | 计量单位分组id 示例：2166537673298176 |
| isEnabled | boolean | 否 | 启用状态,true：是，false：否 示例：true |
| creatorId | long | 否 | 创建者id 示例：1738913618350336 |
| pubts | string | 否 | 时间戳 示例：2021-03-11 11:56:06 |
| tenant | long | 否 | 租户id 示例：1738913615384832 |
| yTenantId | string | 否 | 租户id 示例：csrka3z7 |
| stoptime | string | 否 | 停用时间 示例：2021-03-11 11:56:06 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"code": "lccc",
		"name": {
			"zh_CN": "lcc",
			"en_US": "lcc",
			"zh_TW": "lcc"
		},
		"desc": "cdc",
		"creator": "19768888888",
		"createDate": "2021-03-11 11:56:05",
		"createTime": "2021-03-11 11:56:05",
		"modifier": "19768888888",
		"modifierId": "19768888888",
		"modifyTime": "2021-03-11 11:56:05",
		"modifyDate": "2021-03-11 11:56:05",
		"stopstatus": false,
		"id": 2166537673298176,
		"isEnabled": true,
		"creatorId": 1738913618350336,
		"pubts": "2021-03-11 11:56:06",
		"tenant": 1738913615384832,
		"yTenantId": "csrka3z7",
		"stoptime": "2021-03-11 11:56:06"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	服务端逻辑异常	检查入参是否填写正确，参数值是否真实存在，仍提示该信息请联系开发人员


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

