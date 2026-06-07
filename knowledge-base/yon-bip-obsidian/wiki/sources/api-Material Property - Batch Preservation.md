---
title: "物料属性-批量保存"
apiId: "4eb8959e006e4a06ab94f28bbabb25f7"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Material"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Material]
platform_version: "BIP"
source_type: community-api-docs
---

# 物料属性-批量保存

> `ContentType	application/json` 请求方式	POST | 分类: Material (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/batch/productpro/save

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
| id | long | 否 | 否 | 物料属性id，修改时必传 示例：2288600497578556 |
| showItem | object | 否 | 是 | 属性名称 |
| userdefAlias | object | 否 | 是 | 别名 |
| type | string | 否 | 是 | 属性类型，Date：日期，DateTime：日期时间，Double：数值，Integer：整型，String：文本，Time：时间，CustArchive：自定义档案 示例：String 默认值：String |
| orderNum | long | 否 | 是 | 排序 示例：10 默认值：0 |
| isSerInput | boolean | 否 | 是 | 物料档案是否必输,true是，false否 示例：true 默认值：false |
| isWebShow | boolean | 否 | 是 | 前端显示，true是，false否 示例：true 默认值：false |
| isEnabled | boolean | 否 | 是 | 是否启用，true启用，false不启用 示例：true 默认值：false |
| userdefMode | string | 否 | 是 | 录入方式：0输入项，1选择项，属性类型为文本时，录入方式可以选择0输入项或1选择项。当属性类型不是文本时，录入方式只能是0输入项 示例：0 默认值：0 |
| maxInputLen | string | 否 | 否 | 录入长度 示例：255 默认值：255 |
| decimalDigits | string | 否 | 否 | 小数位。属性类型为数值时该参数可输入，最大为8，属性类型非数值则不能输入 |
| achiveDomain | string | 否 | 否 | 来源域，当属性类型为自定义档案时必输 示例：ucfbasedoc |
| achiveDefineCode | string | 否 | 否 | 自定义档案编码，当属性类型为自定义档案时必输 |
| achiveDefineName | string | 否 | 否 | 自定义档案名称，当属性类型为自定义档案时必输 |
| achiveReturn | string | 否 | 否 | 自定义档案返回值，code编码，name名称 |
| userdefDesc | object | 否 | 否 | 备注 |
| userdefines | object | 是 | 否 | 自定义选择项，当录入方式为1时，输入，当录入方式为0时，不输入 |
| _status | string | 否 | 是 | 操作标识, Insert:新增、Update:更新 示例：Insert |

## 3. 请求示例

Url: /yonbip/digitalModel/batch/productpro/save?access_token=访问令牌
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
				"en_US": "",
				"zh_TW": ""
			},
			"type": "String",
			"orderNum": 10,
			"isSerInput": true,
			"isWebShow": true,
			"isEnabled": true,
			"userdefMode": "0",
			"maxInputLen": "255",
			"decimalDigits": "",
			"achiveDomain": "ucfbasedoc",
			"achiveDefineCode": "",
			"achiveDefineName": "",
			"achiveReturn": "",
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
				"sourcetype": false,
				"showItem": {
					"zh_CN": "中文名称",
					"en_US": "英文名称",
					"zh_TW": "繁体名称"
				},
				"userdefAlias": {
					"zh_CN": "中文别名",
					"en_US": "英文别名",
					"zh_TW": "繁体别名"
				},
				"type": "String",
				"orderNum": 3,
				"isSerInput": false,
				"isWebShow": true,
				"isEnabled": false,
				"userdefMode": 1,
				"maxInputLen": 253,
				"userdefDesc": {
					"zh_CN": "备注中文",
					"en_US": "备注英文",
					"zh_TW": "备注繁体"
				},
				"userdefines": [
					{
						"code": "zs001",
						"name": "自定义1",
						"userdefid": 2490980652913733,
						"defineId": "define95",
						"id": 2599607881699584,
						"tenant": 2491026088726784,
						"yTenantId": "0000KV7VR8GU3W81730000"
					}
				],
				"isWebInput": false,
				"classname": "商品档案",
				"classId": "productArchive",
				"lockKeyRequestId": "7dc7abf0-2a36-4352-8f18-59ee19fd7140",
				"id": 2490980652913733,
				"defineId": "define95",
				"isDeleted": false,
				"pubts": "2022-01-11 10:17:53"
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

999	服务端逻辑异常	先检查参数，如果参数没问题，找相应开发解决


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

