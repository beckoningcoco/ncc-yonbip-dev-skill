---
title: "客户属性-批量保存"
apiId: "1d33d6bf7c744a3fa38d01acbb37de62"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Customer"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Customer]
platform_version: "BIP"
source_type: community-api-docs
---

# 客户属性-批量保存

> `ContentType	application/json` 请求方式	POST | 分类: Customer (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/batch/customerpro/save

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
| data | object | 是 | 是 | 数据集合 |
| id | long | 否 | 否 | 客户属性id，修改时必传 示例：2288600497578556 |
| showItem | object | 否 | 是 | 属性名称 |
| userdefAlias | object | 否 | 是 | 属性别名 |
| type | string | 否 | 是 | 属性类型，Date：日期，DateTime：日期时间，Double：数值，Integer：整型，String：文本，Time：时间 示例：String |
| orderNum | long | 否 | 是 | 排序 示例：10 默认值：0 |
| isSerInput | boolean | 否 | 是 | 客商档案必输：true:是、false:否 示例：false 默认值：false |
| isEnabled | boolean | 否 | 是 | 启用状态, true:是、false:否 示例：true 默认值：false |
| userdefMode | string | 否 | 是 | 录入方式：0输入项，1选择项，属性类型为文本时，录入方式可以选择0输入项或1选择项。当属性类型不是文本时，录入方式只能是0输入项 示例：0 默认值：0 |
| maxInputLen | string | 否 | 否 | 录入长度。属性类型为数值、文本、整型时，该参数必填。属性类型为日期、时间、日期时间、引用档案时该参数不填。属性类型为数值或整型时，录入长度最大为15；属性类型为文本时，录入长度最大为255 示例：255 |
| decimalDigits | string | 否 | 否 | 小数位。属性类型为数值时该参数可输入，最大为8，属性类型非数值则不能输入 |
| userdefDesc | object | 否 | 否 | 备注 |
| userdefines | object | 是 | 否 | 自定义项值集合，当录入方式为1时，输入，当录入方式为0时，不可输入 |
| _status | string | 否 | 是 | 操作标识, Insert:新增、Update:更新 示例：Insert |

## 3. 请求示例

Url: /yonbip/digitalModel/batch/customerpro/save?access_token=访问令牌
Body: {
	"data": [
		{
			"id": 2288600497578556,
			"showItem": {
				"zh_CN": "20210728",
				"en_US": "",
				"zh_TW": ""
			},
			"userdefAlias": {
				"zh_CN": "20210728-1",
				"en_US": ""
			},
			"type": "String",
			"orderNum": 10,
			"isSerInput": false,
			"isEnabled": true,
			"userdefMode": "0",
			"maxInputLen": "255",
			"decimalDigits": "",
			"userdefDesc": {
				"zh_CN": "测试20210728",
				"en_US": "",
				"zh_TW": ""
			},
			"userdefines": [
				{
					"id": "",
					"code": "",
					"name": "",
					"_status": ""
				}
			],
			"_status": "Insert"
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 请求结果状态码，200：成功，其它：失败 示例：200 |
| message | string | 否 | 请求结果信息 示例：操作成功 |
| data | object | 否 | 请求结果数据 |
| count | long | 否 | 总条数 示例：1 |
| sucessCount | long | 否 | 成功条数 示例：1 |
| failCount | long | 否 | 失败条数 示例：0 |
| messages | string | 是 | 请求结果信息 |
| infos | object | 是 | 保存的数据 |
| failInfos | string | 是 | 错误信息 |

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
				"showItem": {
					"zh_CN": "名称中文1",
					"en_US": "英文2",
					"zh_TW": "繁体3"
				},
				"userdefAlias": {
					"zh_CN": "别名中文",
					"en_US": "英文",
					"zh_TW": "繁体"
				},
				"type": "Double",
				"sourcetype": false,
				"orderNum": 0,
				"isSerInput": false,
				"isWebShow": false,
				"isEnabled": false,
				"userdefMode": 1,
				"maxInputLen": 15,
				"decimalDigits": 3,
				"userdefDesc": {
					"zh_CN": "备注1",
					"en_US": "备注英2",
					"zh_TW": "备注2"
				},
				"userdefines": [
					{
						"code": "zs001",
						"name": "自定义1",
						"userdefid": 2490980652913432,
						"defineId": "customerDefine4",
						"id": 2598545364177152,
						"tenant": 2491026088726784,
						"yTenantId": "0000KV7VR8GU3W81730000"
					}
				],
				"isWebInput": false,
				"classname": "客户自定义",
				"classId": "productcustomer",
				"lockKeyRequestId": "96e06f72-ed20-46fb-b550-316e28d0f83c",
				"id": 2490980652913432,
				"defineId": "customerDefine4",
				"isDeleted": false,
				"pubts": "2022-01-10 16:17:02"
			}
		],
		"failInfos": [
			""
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


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

