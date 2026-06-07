---
title: "SKU属性保存"
apiId: "e006e4d61c0a4b5abe36839de1f44e67"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Product SKU File"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Product SKU File]
platform_version: "BIP"
source_type: community-api-docs
---

# SKU属性保存

> `ContentType	application/json` 请求方式	POST | 分类: Product SKU File (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/pc_productskupro/save

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
| data | object | 否 | 是 | SKU属性 |
| sourcetype | string | 否 | 否 | true：系统预置，false：自定项 示例：false |
| showItem | muti_lang | 否 | 是 | 属性名称 |
| userdefAlias | muti_lang | 否 | 是 | 属性别名 |
| type | string | 否 | 是 | 属性类型，Date：日期，DateTime：日期时间，Double：数值，Integer：整型，ReferArchive：引用档案，String：文本，Time：时间 示例：String |
| orderNum | string | 否 | 是 | 排序 示例：0 |
| isSerInput | string | 否 | 否 | 管理端必输，true或false 示例：false |
| isWebShow | string | 否 | 否 | 前端显示，true或false 示例：false |
| isEnabled | boolean | 否 | 是 | 是否启用，true或false 示例：false |
| userdefMode | string | 否 | 是 | 录入方式 示例：0 |
| maxInputLen | string | 否 | 是 | 录入长度 示例：255 |
| decimalDigits | string | 否 | 否 | 小数位 |
| achiveDomainName | string | 否 | 否 | 来源域编码 |
| achiveName | string | 否 | 否 | 引用档案名称 |
| achiveReturnCaption | string | 否 | 否 | 档案返回值名称 |
| userdefines | string | 是 | 否 | 自定义项值集合 |
| id | long | 否 | 否 | SKU属性id，更新时必填 |
| _status | string | 否 | 是 | 实体状态，如Insert，Update，Unchanged 示例：Insert |

## 3. 请求示例

Url: /yonbip/digitalModel/pc_productskupro/save?access_token=访问令牌
Body: {
	"data": {
		"sourcetype": "false",
		"showItem": {
			"zh_CN": "中文",
			"en_US": "英文",
			"zh_TW": "繁体"
		},
		"userdefAlias": {
			"zh_CN": "中文",
			"en_US": "英文",
			"zh_TW": "繁体"
		},
		"type": "String",
		"orderNum": "0",
		"isSerInput": "false",
		"isWebShow": "false",
		"isEnabled": false,
		"userdefMode": "0",
		"maxInputLen": "255",
		"decimalDigits": "",
		"achiveDomainName": "",
		"achiveName": "",
		"achiveReturnCaption": "",
		"userdefines": [
			""
		],
		"id": 0,
		"_status": "Insert"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 请求结果状态码 示例：200 |
| message | string | 否 | 请求结果信息 示例：操作成功 |
| data | object | 否 | 返回值数据 |
| successCountAI | long | 否 | 成功数量初始值 示例：0 |
| failCountAI | long | 否 | 失败数量初始值 示例：0 |
| count | long | 否 | 数量 示例：1 |
| sucessCount | long | 否 | 成功数 示例：1 |
| failCount | long | 否 | 失败数 示例：0 |
| messages | string | 是 | 失败原因列表 |
| infos | object | 是 | 成功数据列表 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"successCountAI": 0,
		"failCountAI": 0,
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			""
		],
		"infos": [
			{
				"isSerInput": false,
				"isEnabled": false,
				"showItem": {
					"zh_CN": "中文",
					"en_US": "英文",
					"zh_TW": "繁体"
				},
				"userdefAlias": {
					"zh_TW": "繁体",
					"en_US": "英文",
					"zh_CN": "中文"
				},
				"orderNum": 0,
				"sourcetype": false,
				"isWebShow": false,
				"type": "Date",
				"userdefines": [
					""
				],
				"userdefMode": 0,
				"maxInputLen": 255,
				"isWebInput": false,
				"showItemResid": "S_YS_PF_GZTSYS_0001085772",
				"classname": "商品SKU",
				"classId": "productSku",
				"lockKeyRequestId": "a898d9be-282f-42ee-a4e0-c20d8acc5082",
				"id": 2035077693123613,
				"defineId": "define124",
				"isDeleted": false,
				"tenant": 2067791299383552,
				"pubts": "2021-06-03 19:40:56"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	服务端逻辑异常	检查入参是否填写正确，参数值是否真实存在，仍提示该信息请联系开发人员。


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

