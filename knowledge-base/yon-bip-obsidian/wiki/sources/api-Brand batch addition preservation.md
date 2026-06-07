---
title: "品牌批量新增保存V2"
apiId: "1909388622848065538"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Brand"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Brand]
platform_version: "BIP"
source_type: community-api-docs
---

# 品牌批量新增保存V2

> `ContentType	application/json` 请求方式	POST | 分类: Brand (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/brand/batchadd

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
| code | string | 否 | 是 | 编码 示例：code |
| name | object | 否 | 是 | 名称 |
| simplifiedName | string | 否 | 是 | 简体 示例：简体 |
| englishName | string | 否 | 否 | 英文 示例：英文 |
| traditionalName | string | 否 | 否 | 繁体 示例：繁体 |
| brandClassCode | string | 否 | 否 | 品牌分组编码 示例：code01 |
| orderNumber | int | 否 | 是 | 排序号 示例：1 |
| stopStatus | boolean | 否 | 否 | 启用状态 true：停用 false：启用 默认：false 示例：true |
| randKeywords | object | 否 | 否 | 品牌别名 |
| simplifiedName | string | 否 | 否 | 简体 示例：简体 |
| englishName | string | 否 | 否 | 英文 示例：英文 |
| traditionalName | string | 否 | 否 | 繁体 示例：繁体 |
| brandDesc | object | 否 | 否 | 品牌描述 |
| simplifiedName | string | 否 | 否 | 简体 示例：简体 |
| englishName | string | 否 | 否 | 英文 示例：英文 |
| traditionalName | string | 否 | 否 | 繁体 示例：繁体 |
| brandUrl | object | 否 | 否 | 品牌网址 |
| simplifiedName | string | 否 | 否 | 简体 示例：简体 |
| englishName | string | 否 | 否 | 英文 示例：英文 |
| traditionalName | string | 否 | 否 | 繁体 示例：繁体 |
| adImage | string | 否 | 否 | 广告图片 示例：广告图片 |
| brandLogo | string | 否 | 否 | logo 示例：logo |
| productTplBrands | object | 是 | 否 | 关联模板 |
| productTplTemp | long | 否 | 否 | 物料模板id 示例：123456 |

## 3. 请求示例

Url: /yonbip/digitalModel/brand/batchadd?access_token=访问令牌
Body: [{
	"code": "code",
	"name": {
		"simplifiedName": "简体",
		"englishName": "英文",
		"traditionalName": "繁体"
	},
	"brandClassCode": "code01",
	"orderNumber": 1,
	"stopStatus": true,
	"randKeywords": {
		"simplifiedName": "简体",
		"englishName": "英文",
		"traditionalName": "繁体"
	},
	"brandDesc": {
		"simplifiedName": "简体",
		"englishName": "英文",
		"traditionalName": "繁体"
	},
	"brandUrl": {
		"simplifiedName": "简体",
		"englishName": "英文",
		"traditionalName": "繁体"
	},
	"adImage": "广告图片",
	"brandLogo": "logo",
	"productTplBrands": [
		{
			"productTplTemp": 123456
		}
	]
}]

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 示例："200" |
| message | string | 否 | 提示信息 示例：处理成功 |
| data | object | 否 | 返回结果,id |
| count | number |
| 小数位数:-,最大长度:- | 否 | 总数 示例：10 |
| sucessCount | number |
| 小数位数:-,最大长度:- | 否 | 成功数量 示例：10 |
| failCount | number |
| 小数位数:-,最大长度:- | 否 | 失败数量 示例：0 |
| messages | string | 是 | 失败信息 示例：["编码已经存在"] |
| infos | object | 是 | 返回信息 |

## 5. 正确返回示例

{
	"code": "\"200\"",
	"message": "处理成功",
	"data": {
		"count": 10,
		"sucessCount": 10,
		"failCount": 0,
		"messages": [
			"编码已经存在"
		],
		"infos": [
			{
				"id": 123456,
				"code": "code"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	服务端逻辑异常	服务端逻辑异常


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-17

更新

请求说明


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

