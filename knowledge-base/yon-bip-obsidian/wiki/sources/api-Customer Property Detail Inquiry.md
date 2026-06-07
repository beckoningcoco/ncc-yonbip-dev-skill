---
title: "客户属性详情查询"
apiId: "08a0bb249cf547e0a80c08c2dae36fb6"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Customer"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Customer]
platform_version: "BIP"
source_type: community-api-docs
---

# 客户属性详情查询

> `ContentType	application/json` 请求方式	GET | 分类: Customer (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/customerpro/detail

请求方式	GET

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | string | query | 是 | 客户属性id    示例: 1511004183810319 |

## 3. 请求示例

Url: /yonbip/digitalModel/customerpro/detail?access_token=访问令牌&id=1511004183810319

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用失败时的错误信息 示例：处理成功 |
| data | object | 否 | 调用成功时的返回数据 |
| id | string | 否 | 主表关联标识 示例：1511004183810319 |
| sourcetype | string | 否 | 属性来源, false:自定义项、true:系统预置、 示例：false |
| showItem | muti_lang | 否 | 属性名称,支持多语 |
| userdefAlias | muti_lang | 否 | 属性别名,支持多语 |
| type | string | 否 | 属性类型, Double:数值、String:文本、Integer:整型、Date:日期、Time:时间、DateTime:日期时间、 示例：String |
| length | string | 否 | 属性长度 示例：50 |
| orderNum | int | 否 | 排序 示例：1 |
| isSerInput | string | 否 | 客商档案必输, true:是、false:否、 示例：false |
| isWebShow | string | 否 | 前端显示, true:是、false:否、 示例：false |
| isEnabled | string | 否 | 启用状态, true:启用、false:停用、 示例：false |
| userdefMode | string | 否 | 录入方式, 0:输入项、1:选择项、 示例：0 |
| maxInputLen | int | 否 | 录入长度 示例：50 |
| decimalDigits | int | 否 | 小数位 示例：0 |
| userdefDesc | muti_lang | 否 | 属性备注,支持多语 |
| pubts | string | 否 | 时间戳,格式为:yyyy-MM-dd HH:mm:ss 示例：格式为:yyyy-MM-dd HH:mm:ss |
| userdefines | object | 是 | 客户属性枚举项子表[pc.userdef.Userdefine] |

## 5. 正确返回示例

{
	"code": "200",
	"message": "处理成功",
	"data": {
		"id": "1511004183810319",
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
		"length": "50",
		"orderNum": 1,
		"isSerInput": "false",
		"isWebShow": "false",
		"isEnabled": "false",
		"userdefMode": "0",
		"maxInputLen": 50,
		"decimalDigits": 0,
		"userdefDesc": {
			"zh_CN": "中文",
			"en_US": "英文",
			"zh_TW": "繁体"
		},
		"pubts": "格式为:yyyy-MM-dd HH:mm:ss",
		"userdefines": [
			{
				"userdefid": "主表关联标识",
				"id": "子表主键",
				"code": "编码",
				"name": "名称",
				"pubts": "格式为:yyyy-MM-dd HH:mm:ss"
			}
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

