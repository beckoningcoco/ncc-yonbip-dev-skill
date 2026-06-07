---
title: "固定自定义项详情查询"
apiId: "67da9b95665248f793ee17e4cb2d303c"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Characteristic"
domain: "BMM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Characteristic]
platform_version: "BIP"
source_type: community-api-docs
---

# 固定自定义项详情查询

> `ContentType	application/json` 请求方式	GET | 分类: Characteristic (BMM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/attrextfixed/detail

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

Url: /yonbip/digitalModel/attrextfixed/detail?access_token=访问令牌&id=

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回编码 |
| message | string | 否 | 返回信息 |
| data | object | 否 | 数据信息 |
| isEnabled | boolean | 否 | 是否启用, true,false |
| creator_userName | string | 否 | 创建人用户名 |
| showitem | muti_lang | 否 | 名称 |
| type | string | 否 | 类型, String:文本、Double:数值、Integer:整型、Date:日期、Time:时间、DateTime:日期时间、Archive:自定义枚举、BaseArchive:基本档案、CustArchive:自定义档案 |
| decimaldigits | string | 否 | 精度 |
| bShowIt | boolean | 否 | 是否展示 |
| creator | string | 否 | 创建人 |
| creationtime | string | 否 | 创建时间,格式为:yyyy-MM-dd HH:mm:ss |
| pubts | string | 否 | 时间戳,格式为:yyyy-MM-dd HH:mm:ss |
| id | int | 否 | 主键 |
| modifiedtime | string | 否 | 修改时间,格式为:yyyy-MM-dd HH:mm:ss |
| maxinputlen | int | 否 | 长度 |
| isInput | boolean | 否 | 是否必输, true:是、false:否、 |
| modifier | string | 否 | 修改人 |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"isEnabled": true,
		"creator_userName": "",
		"showitem": {
			"zh_CN": "中文",
			"en_US": "英文",
			"zh_TW": "繁体"
		},
		"type": "",
		"decimaldigits": "",
		"bShowIt": true,
		"creator": "",
		"creationtime": "",
		"pubts": "",
		"id": 0,
		"modifiedtime": "",
		"maxinputlen": 0,
		"isInput": true,
		"modifier": ""
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	For input string: \"null\"	没有数据情况，请输入正确id


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

