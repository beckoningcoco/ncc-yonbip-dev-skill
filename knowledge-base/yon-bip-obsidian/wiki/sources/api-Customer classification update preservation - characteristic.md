---
title: "客户分类更新保存-特征"
apiId: "1695117205590507523"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Customer Category"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Customer Category]
platform_version: "BIP"
source_type: community-api-docs
---

# 客户分类更新保存-特征

> `ContentType	application/json` 请求方式	POST | 分类: Customer Category (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/custcategory/newupdate

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| id | long | 否 | 否 | id，id与code至少填写一个 示例：123456 |
| code | string | 否 | 否 | 编码，id与code至少填写一个 示例：code |
| name | object | 否 | 否 | 名称 |
| simplifiedName | string | 否 | 否 | 简体 示例：简体 |
| englishName | string | 否 | 否 | 英文 示例：英文 |
| traditionalName | string | 否 | 否 | 繁体 示例：繁体 |
| parentCode | string | 否 | 否 | 上级分类编码 示例：code01 |
| order | int | 否 | 否 | 排序号 示例：1 |
| isEnabled | boolean | 否 | 否 | 启用状态 true：启用 false：停用 示例：true |
| comment | object | 否 | 否 | 备注 |
| simplifiedName | string | 否 | 否 | 简体 示例：简体 |
| englishName | string | 否 | 否 | 英文 示例：英文 |
| traditionalName | string | 否 | 否 | 繁体 示例：繁体 |

## 3. 请求示例

Url: /yonbip/digitalModel/custcategory/newupdate?access_token=访问令牌
Body: {
	"id": 123456,
	"code": "code",
	"name": {
		"simplifiedName": "简体",
		"englishName": "英文",
		"traditionalName": "繁体"
	},
	"parentCode": "code01",
	"order": 1,
	"isEnabled": true,
	"comment": {
		"simplifiedName": "简体",
		"englishName": "英文",
		"traditionalName": "繁体"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 示例："200" |
| message | string | 否 | 提示信息 示例：成功 |
| data | object | 否 | 返回结果,id |
| id | long | 否 | id 示例：123456 |

## 5. 正确返回示例

{
	"code": "\"200\"",
	"message": "成功",
	"data": {
		"id": 123456
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	服务端逻辑异常	服务端逻辑异常


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

