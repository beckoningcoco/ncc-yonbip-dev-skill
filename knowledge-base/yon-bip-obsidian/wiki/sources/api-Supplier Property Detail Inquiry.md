---
title: "供应商属性详情查询"
apiId: "09ec0d3535784ac4ad180ae3da901cde"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Supplier"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Supplier]
platform_version: "BIP"
source_type: community-api-docs
---

# 供应商属性详情查询

> `ContentType	application/json` 请求方式	GET | 分类: Supplier (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/vendorpro/detail

请求方式	GET

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | string | query | 是 | 业务数据ID |

## 3. 请求示例

Url: /yonbip/digitalModel/vendorpro/detail?access_token=访问令牌&id=

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 |
| message | string | 否 | 调用失败时的错误信息 |
| data | object | 否 | 调用成功时的返回数据 |
| sourcetype | string | 否 | 属性来源, false:自定义项、true:系统预置、 |
| showItem | muti_lang | 否 | 属性名称,支持多语 |
| userdefAlias | muti_lang | 否 | 属性别名,支持多语 |
| type | string | 否 | 属性类型, Double:数值、String:文本、Integer:整型、Date:日期、Time:时间、DateTime:日期时间、 |
| id | string | 否 | 主键ID |
| length | string | 否 | 属性长度 |
| orderNum | int | 否 | 排序 |
| isSerInput | string | 否 | 供应商档案必输, true:是、false:否、 |
| isWebShow | string | 否 | 前端显示, true:是、false:否、 |
| isEnabled | string | 否 | 启用状态, true:启用、false:停用、 |
| userdefMode | string | 否 | 录入方式, 0:输入项、1:选择项、 |
| maxInputLen | int | 否 | 录入长度 |
| decimalDigits | int | 否 | 小数位 |
| userdefDesc | muti_lang | 否 | 属性备注,支持多语 |
| checkPro | string | 否 | 是否关联 |
| pubts | string | 否 | 时间戳,格式为:yyyy-MM-dd HH:mm:ss |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"sourcetype": "",
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
		"type": "",
		"id": "",
		"length": "",
		"orderNum": 0,
		"isSerInput": "",
		"isWebShow": "",
		"isEnabled": "",
		"userdefMode": "",
		"maxInputLen": 0,
		"decimalDigits": 0,
		"userdefDesc": {
			"zh_CN": "中文",
			"en_US": "英文",
			"zh_TW": "繁体"
		},
		"checkPro": "",
		"pubts": ""
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	服务端逻辑异常	联系管理员


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-06-24

更新

请求说明

更新

请求参数 id

更新

返回参数 (19)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

