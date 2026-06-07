---
title: "税目税率保存接口（废弃）"
apiId: "007b9474b01b46838001923434159638"
apiPath: "请求方式	POST"
method: "ContentType	0"
category: "Material Information"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Material Information]
platform_version: "BIP"
source_type: community-api-docs
---

# 税目税率保存接口（废弃）

> `ContentType	0` 请求方式	POST | 分类: Material Information (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/taxrate/save

请求方式	POST

ContentType	0

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 否 | 是 | 税目税率详情[bd.taxrate.TaxRateVO] |
| code | string | 否 | 是 | 税目编码 |
| name | muti_lang | 否 | 是 | 税目名称,支持多语 |
| ntaxRate | int | 否 | 是 | 税率 |
| scope | string | 否 | 否 | 适用范围, 1:全部、2:采购、3:销售、 |
| id | string | 否 | 否 | 主键，新增时不填，更新时必填 |
| country | string | 否 | 否 | 国家id |
| country_name | string | 否 | 否 | 国家名称 |
| taxFree | string | 否 | 否 | 免税, false:否、true:是、 |
| noTaxation | string | 否 | 否 | 不征税, false:否、true:是、 |
| pubts | string | 否 | 否 | 时间戳 |
| enable | string | 否 | 否 | 状态, 1:启用、2:停用 |
| creator_userName | string | 否 | 否 | 创建人 |
| creationtime | string | 否 | 否 | 创建时间 |
| modifier_userName | string | 否 | 否 | 最后修改人 |
| modifiedtime | string | 否 | 否 | 最后修改时间 |
| sysid | string | 否 | 是 | 应用标识 |
| _status | string | 否 | 是 | 操作标识, Insert:新增、Update:更新 |

## 3. 请求示例

Url: /yonbip/digitalModel/taxrate/save?access_token=访问令牌
Body: {
	"data": {
		"code": "",
		"name": {
			"zh_CN": "中文",
			"en_US": "英文",
			"zh_TW": "繁体"
		},
		"ntaxRate": 0,
		"scope": "",
		"id": "",
		"country": "",
		"country_name": "",
		"taxFree": "",
		"noTaxation": "",
		"pubts": "",
		"enable": "",
		"creator_userName": "",
		"creationtime": "",
		"modifier_userName": "",
		"modifiedtime": "",
		"sysid": "",
		"_status": ""
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 |
| message | string | 否 | 调用失败时的错误信息 |
| data | object | 否 | 调用成功时的返回数据 |
| code | string | 否 | 税目编码 |
| name | muti_lang | 否 | 税目名称 |
| ntaxRate | int | 否 | 税率 |
| scope | string | 否 | 适用范围, 1:全部、2:采购、3:销售、 |
| id | string | 否 | 主键 |
| country | string | 否 | 国家id |
| country_name | string | 否 | 国家名称 |
| taxFree | string | 否 | 免税, false:否、true:是、 |
| noTaxation | string | 否 | 不征税, false:否、true:是、 |
| pubts | string | 否 | 时间戳 |
| enable | string | 否 | 状态, 0:未启用、1:启用、2:停用、 |
| creator_userName | string | 否 | 创建人 |
| creationtime | string | 否 | 创建时间 |
| modifier_userName | string | 否 | 最后修改人 |
| modifiedtime | string | 否 | 最后修改时间 |
| sysid | string | 否 | 应用标识 |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"code": "",
		"name": {
			"zh_CN": "中文",
			"en_US": "英文",
			"zh_TW": "繁体"
		},
		"ntaxRate": 0,
		"scope": "",
		"id": "",
		"country": "",
		"country_name": "",
		"taxFree": "",
		"noTaxation": "",
		"pubts": "",
		"enable": "",
		"creator_userName": "",
		"creationtime": "",
		"modifier_userName": "",
		"modifiedtime": "",
		"sysid": ""
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	操作失败


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

