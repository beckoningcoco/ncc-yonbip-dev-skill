---
title: "物料规格详情查询"
apiId: "f47c05e10d514211abd4b90ce194a976"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Material Specification"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Material Specification]
platform_version: "BIP"
source_type: community-api-docs
---

# 物料规格详情查询

> `ContentType	application/json` 请求方式	GET | 分类: Material Specification (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/spepro/detail

请求方式	GET

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | string | query | 是 | 规格ID |

## 3. 请求示例

Url: /yonbip/digitalModel/spepro/detail?access_token=访问令牌&id=

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 |
| message | string | 否 | 调用失败时的错误信息 |
| data | object | 否 | 调用成功时的返回数据 |
| id | long | 否 | 规格ID |
| showItem | muti_lang | 否 | 规格名称,支持多语 |
| erpCode | string | 否 | 外部编码 |
| pubts | string | 否 | 时间戳,格式为:yyyy-MM-dd HH:mm:ss |
| isShowSpec | boolean | 否 | 单独显示, true:是、false:否、 |
| userdefDesc | muti_lang | 否 | 规格备注,支持多语 |
| defineId | string | 否 | 项目号 |
| isEnabled | boolean | 否 | 启用状态, true:启用、false:停用、 |
| checkPro | object | 否 | 是否关联 |
| userdefinespecs | object | 是 | 规格枚举项子表 |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"id": 0,
		"showItem": {
			"zh_CN": "中文",
			"en_US": "英文",
			"zh_TW": "繁体"
		},
		"erpCode": "",
		"pubts": "",
		"isShowSpec": true,
		"userdefDesc": {
			"zh_CN": "中文",
			"en_US": "英文",
			"zh_TW": "繁体"
		},
		"defineId": "",
		"isEnabled": true,
		"checkPro": {
			"checkHead": 0,
			"checkBody": [
				0
			]
		},
		"userdefinespecs": [
			{
				"userdefid": 0,
				"pubts": "",
				"id": 0,
				"name": "",
				"erpName": "",
				"barCode": "",
				"orderNum": 0
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

