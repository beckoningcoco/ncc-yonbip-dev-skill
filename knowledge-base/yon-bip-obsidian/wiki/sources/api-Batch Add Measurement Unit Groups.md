---
title: "计量单位分组批量新增"
apiId: "1909376888997412871"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "UoM"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, UoM]
platform_version: "BIP"
source_type: community-api-docs
---

# 计量单位分组批量新增

> `ContentType	application/json` 请求方式	POST | 分类: UoM (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/unitgroup/batchsave

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
| code | string | 否 | 否 | 编码 示例：code01 |
| name | object | 否 | 否 | 名称 |
| simplifiedName | string | 否 | 否 | 简体 示例：中文 |
| englishName | string | 否 | 否 | 英文 示例：英文 |
| traditionalName | string | 否 | 否 | 繁体 示例：繁体 |
| desc | string | 否 | 否 | 备注 示例：备注 |
| stopStatus | boolean | 否 | 否 | 启用状态，true:停用,false:启用 示例：true |

## 3. 请求示例

Url: /yonbip/digitalModel/unitgroup/batchsave?access_token=访问令牌
Body: [{
	"code": "code01",
	"name": {
		"simplifiedName": "中文",
		"englishName": "英文",
		"traditionalName": "繁体"
	},
	"desc": "备注",
	"stopStatus": true
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

999	服务端逻辑异常	检查入参是否填写正确，参数值是否真实存在，仍提示该信息请联系开发人员


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

