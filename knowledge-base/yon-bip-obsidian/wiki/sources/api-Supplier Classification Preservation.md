---
title: "供应商分类保存"
apiId: "efd658153bc04dc08a380a9a7c08db9b"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Supplier Category"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Supplier Category]
platform_version: "BIP"
source_type: community-api-docs
---

# 供应商分类保存

> `ContentType	application/json` 请求方式	POST | 分类: Supplier Category (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/vendorclassification/save

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
| data | object | 否 | 是 | 供应商分类[aa.vendorclass.VendorClass] |
| name | muti_lang | 否 | 是 | 分类名称,支持多语 |
| code | string | 否 | 是 | 分类编码 示例：32232311code |
| parent | long | 否 | 否 | 上级分类id 示例：1602036390269184 |
| parent_name | string | 否 | 否 | 上级分类名称 示例：111 |
| erpCode | string | 否 | 否 | 外部编码 示例：outsidecode |
| order | long | 否 | 否 | 排序号 示例：0 |
| level | long | 否 | 否 | 层级 示例：2 |
| path | string | 否 | 否 | 路径 示例：1602036390269184|1602042466177280| |
| isEnd | boolean | 否 | 否 | 是否末级 示例：true |
| id | long | 否 | 否 | 分类ID 示例：1602042466177280 |
| pubts | string | 否 | 否 | 时间戳 示例：2020-09-10 16:53:09 |
| comment | muti_lang | 否 | 否 | 备注,支持多语 |
| isEnabled | boolean | 否 | 是 | 是否启用, true:是、false:否、 示例：true |
| _status | string | 否 | 是 | 操作标识, Insert:新增、Update:更新 示例：Update |

## 3. 请求示例

Url: /yonbip/digitalModel/vendorclassification/save?access_token=访问令牌
Body: {
	"data": {
		"name": {
			"zh_CN": "中文",
			"en_US": "英文",
			"zh_TW": "繁体"
		},
		"code": "32232311code",
		"parent": 1602036390269184,
		"parent_name": "111",
		"erpCode": "outsidecode",
		"order": 0,
		"level": 2,
		"path": "1602036390269184|1602042466177280|",
		"isEnd": true,
		"id": 1602042466177280,
		"pubts": "2020-09-10 16:53:09",
		"comment": {
			"zh_CN": "中文",
			"en_US": "英文",
			"zh_TW": "繁体"
		},
		"isEnabled": true,
		"_status": "Update"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 |
| message | string | 否 | 调用失败时的错误信息 |
| data | object | 否 | 调用成功时的返回数据 |
| name | muti_lang | 否 | 分类名称,支持多语 |
| code | string | 否 | 分类编码 |
| parent | string | 否 | 上级分类id |
| parent_name | string | 否 | 上级分类名称 |
| erpCode | string | 否 | 外部编码 |
| order | int | 否 | 排序号 |
| level | int | 否 | 层级 |
| path | string | 否 | 路径 |
| isEnd | string | 否 | 是否末级 |
| id | string | 否 | 分类ID |
| pubts | Date | 否 | 时间戳 |
| comment | muti_lang | 否 | 备注,支持多语 |
| isEnabled | string | 否 | 是否启用, true:是、false:否、 |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"name": {
			"zh_CN": "中文",
			"en_US": "英文",
			"zh_TW": "繁体"
		},
		"code": "",
		"parent": "",
		"parent_name": "",
		"erpCode": "",
		"order": 0,
		"level": 0,
		"path": "",
		"isEnd": "",
		"id": "",
		"pubts": "",
		"comment": {
			"zh_CN": "中文",
			"en_US": "英文",
			"zh_TW": "繁体"
		},
		"isEnabled": ""
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	分类编码 (123)已经存在	根据错误信息修改分类编码


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

