---
title: "计量单位批量启用"
apiId: "8af4d5209ce44b1da65769ea9d6f362d"
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

# 计量单位批量启用

> `ContentType	application/json` 请求方式	POST | 分类: UoM (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/unit/batchStart

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	批量保存/更新

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 是 | 是 | 计量单位数据，id与编码必输其一,id和编码同时存在时，以id为准 |
| id | long | 否 | 否 | 计量单位id 示例：1924448344543488 |
| code | string | 否 | 否 | 计量单位编码 示例：20210826 |

## 3. 请求示例

Url: /yonbip/digitalModel/unit/batchStart?access_token=访问令牌
Body: {
	"data": [
		{
			"id": 1924448344543488,
			"code": "20210826"
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用完成时的返回信息 示例：操作成功 |
| data | object | 是 | 调用完成时的返回数据 |
| id | long | 否 | 计量单位id 示例：1971155824578816 |
| code | string | 否 | 计量单位编码 示例：20210830 |
| stoptime | string | 否 | 停用时间 示例：2020-10-24 00:00:00 |
| stopstatus | boolean | 否 | 是否停用,true是,false否 示例：false |
| tenant | long | 否 | 租户id 示例：1838010622546176 |
| pubts | string | 否 | 时间戳 示例：2020-10-24 13:49:03 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"id": 1971155824578816,
			"code": "20210830",
			"stoptime": "2020-10-24 00:00:00",
			"stopstatus": false,
			"tenant": 1838010622546176,
			"pubts": "2020-10-24 13:49:03"
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	服务端逻辑异常	检查入参是否填写正确，参数值是否真实存在，仍提示该信息请联系开发人员。


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

