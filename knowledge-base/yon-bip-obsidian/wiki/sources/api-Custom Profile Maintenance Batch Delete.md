---
title: "自定义档案维护批量删除V2"
apiId: "2198839319378001920"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "User-defined File Maintenance"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, User-defined File Maintenance]
platform_version: "BIP"
source_type: community-api-docs
---

# 自定义档案维护批量删除V2

> `ContentType	application/json` 请求方式	POST | 分类: User-defined File Maintenance (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/async/customerdoc/batchDelete

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
| data | object | 是 | 否 | 请求体 |
| sourceUnique | string | 否 | 是 | 源系统唯一标识 示例：2217322771360776203 |
| id | string | 否 | 否 | 档案ID。与档案编码二选一输入，全传入以档案ID为准。 示例：2217322771360776203 |
| code | string | 否 | 否 | 档案编码 示例：code01 |

## 3. 请求示例

Url: /yonbip/digitalModel/async/customerdoc/batchDelete?access_token=访问令牌
Body: {
	"data": [
		{
			"sourceUnique": "2217322771360776203",
			"id": "2217322771360776203",
			"code": "code01"
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功是返回200 示例：200 |
| message | string | 否 | 提示信息 示例：异步执行中，请调用结果查询接口查询执行结果 |
| data | object | 否 | 响应数据 |
| jobId | string | 否 | 任务ID，用于查询异步任务执行结果，具体请调用【汇率批量删除结果查询】接口查询结果 示例：2217253570730524676 |
| displayCode | string | 否 | 业务异常码 示例：000-525-000066 |
| level | number |
| 小数位数:0,最大长度:1 | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "异步执行中，请调用结果查询接口查询执行结果",
	"data": {
		"jobId": "2217253570730524676"
	},
	"displayCode": "000-525-000066",
	"level": 0
}

## 6. 业务异常码

000-525-000066

传入的数据列表为空或存在空对象，请检查代码


## 7. 错误返回码

999-999-999999	调⽤失败时的错误信息


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-01

更新

请求说明

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

