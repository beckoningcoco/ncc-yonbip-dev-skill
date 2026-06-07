---
title: "客户属性保存"
apiId: "53e44066955b4c8a9262b6a9166fa0d9"
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

# 客户属性保存

> `ContentType	application/json` 请求方式	POST | 分类: Customer (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/customerpro/save

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
| data | object | 否 | 是 | 客户属性对象 |
| id | string | 否 | 否 | 客户属性主键,新增时无需填写，修改时必填 新增时无需填写，修改时必填 示例：12345 |
| orderNum | int | 否 | 是 | 排序号 示例：0 |
| decimalDigits | string | 否 | 否 | 小数位,最小0,最大8 示例：0 |
| isWebShow | boolean | 否 | 否 | 前端显示, true:是、false:否 示例：false |
| _status | string | 否 | 是 | 操作标识, Insert:新增、Update:更新 示例：Insert |
| type | string | 否 | 是 | 属性类型, Double:数值、String:文本、Integer:整型、Date:日期、Time:时间、DateTime:日期时间 示例：String |
| maxInputLen | int | 否 | 是 | 录入长度(最小1，最大255) 示例：255 |
| isEnabled | boolean | 否 | 否 | 启用状态, true:启用、false:停用 示例：false |
| userdefAlias | muti_lang | 否 | 是 | 属性别名,支持多语 |
| showItem | muti_lang | 否 | 是 | 属性名称 |
| pubts | string | 否 | 否 | 时间戳,格式为:yyyy-MM-dd HH:mm:ss 示例：格式为:yyyy-MM-dd HH:mm:ss |
| userdefMode | int | 否 | 是 | 录入方式, 0:输入项、1:选择项 示例：1 |
| userdefines | object | 是 | 否 | 客户属性枚举项子表 |
| isSerInput | boolean | 否 | 否 | 客商档案必输, true:是、false:否 示例：true |

## 3. 请求示例

Url: /yonbip/digitalModel/customerpro/save?access_token=访问令牌
Body: {
	"data": {
		"id": "12345",
		"orderNum": 0,
		"decimalDigits": "0",
		"isWebShow": false,
		"_status": "Insert",
		"type": "String",
		"maxInputLen": 255,
		"isEnabled": false,
		"userdefAlias": {
			"zh_CN": "中文",
			"en_US": "英文",
			"zh_TW": "繁体"
		},
		"showItem": {
			"zh_CN": "中文",
			"en_US": "英文",
			"zh_TW": "繁体"
		},
		"pubts": "格式为:yyyy-MM-dd HH:mm:ss",
		"userdefMode": 1,
		"userdefines": [
			{
				"name": "测试01",
				"_status": "Insert",
				"id": "123456",
				"code": "01"
			}
		],
		"isSerInput": true
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用失败时的错误信息 示例：操作成功 |
| data | object | 否 | 调用成功时的返回数据 |
| userdefines | object | 是 | 客户属性枚举项子表 |
| isDeleted | boolean | 否 | 是否已逻辑删除，true：是，false：否 示例：false |
| sourcetype | boolean | 否 | 属性来源, false:自定义项、true:系统预置 示例：属性来源, false:自定义项、true:系统预置 |
| orderNum | long | 否 | 排序号 示例：0 |
| showItem | muti_lang | 否 | 属性名称,支持多语 |
| pubts | string | 否 | 时间戳,格式为:yyyy-MM-dd HH:mm:ss 示例：2020-08-28 11:32:38 |
| classId | string | 否 | 分类id 示例：分类id |
| userdefAlias | muti_lang | 否 | 属性别名,支持多语 |
| isWebInput | boolean | 否 | 是否前端必输，true：是，false：否 示例：false |
| type | string | 否 | 属性类型, Double:数值、String:文本、Integer:整型、Date:日期、Time:时间、DateTime:日期时间 示例：String |
| maxInputLen | long | 否 | 录入长度 示例：255 |
| isWebShow | boolean | 否 | 前端显示, true:是、false:否 示例：false |
| isEnabled | boolean | 否 | 启用状态, true:启用、false:停用 示例：false |
| id | long | 否 | 客户属性主键 示例：1511004183810323 |
| isSerInput | boolean | 否 | 客商档案必输, true:是、false:否 示例：true |
| userdefMode | long | 否 | 录入方式, 0:输入项、1:选择项 示例：1 |
| tenant | long | 否 | 租户id 示例：1511008618713344 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"userdefines": [
			{
				"name": "测试01",
				"code": "01",
				"userdefid": 1511004183810323,
				"id": 1890476987879936
			}
		],
		"isDeleted": false,
		"sourcetype": "",
		"orderNum": 0,
		"showItem": {
			"zh_CN": "中文",
			"en_US": "英文",
			"zh_TW": "繁体"
		},
		"pubts": "2020-08-28 11:32:38",
		"classId": "分类id",
		"userdefAlias": {
			"zh_CN": "中文",
			"en_US": "英文",
			"zh_TW": "繁体"
		},
		"isWebInput": false,
		"type": "String",
		"maxInputLen": 255,
		"isWebShow": false,
		"isEnabled": false,
		"id": 1511004183810323,
		"isSerInput": true,
		"userdefMode": 1
	},
	"tenant": 1511008618713344
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

