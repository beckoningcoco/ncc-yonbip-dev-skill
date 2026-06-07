---
title: "批量修改矩阵数据"
apiId: "1961154214412943367"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Collaboration Relationship"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Collaboration Relationship]
platform_version: "BIP"
source_type: community-api-docs
---

# 批量修改矩阵数据

> `ContentType	application/json` 请求方式	POST | 分类: Collaboration Relationship (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/openapi/update/matrix/data/batch

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
| matrixId | string | 否 | 是 | 矩阵id |
| dataType | number |
| 小数位数:0,最大长度:10 | 否 | 是 | 矩阵参与人数据类型（9:用户） |
| originAssigneeList | string | 是 | 是 | 原始审批人List(需传递用户id) |
| targetAssigneeList | string | 是 | 是 | 目标审批人List(需传递用户id) |
| matrixAxisXIdList | string | 是 | 否 | 横轴坐标List |
| matrixAxisYIdList | string | 是 | 否 | 纵轴坐标List |

## 3. 请求示例

Url: /yonbip/digitalModel/openapi/update/matrix/data/batch?access_token=访问令牌
Body: {
	"matrixId": "",
	"dataType": 0,
	"originAssigneeList": [
		""
	],
	"targetAssigneeList": [
		""
	],
	"matrixAxisXIdList": [
		""
	],
	"matrixAxisYIdList": [
		""
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 接口返回编码（200表示成功） 示例：200 |
| data | object | 否 | 修改返回结果 |
| data | object | 否 | 修改返回结果 |
| errcode | number |
| 小数位数:0,最大长度:10 | 否 | 接口返回编码（0表示成功） 示例：0 |
| errmsg | string | 否 | 接口返回信息（成功信息，报错信息等） 示例：ok |
| displayCode | string | 否 | 业务异常码 示例：000-530-300016 |
| level | number |
| 小数位数:0,最大长度:1 | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"code": "200",
	"data": {
		"data": {},
		"errcode": 0,
		"errmsg": "ok",
		"displayCode": "000-530-300016",
		"level": 0
	}
}

## 6. 业务异常码

000-530-300016

矩阵数据更新中，请稍后重试

000-530-300017

原审批人不存在，请确认


## 7. 错误返回码

30009	Required request body is missing	缺少请求体


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-03

新增

返回参数 displayCode

新增

返回参数 level


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

