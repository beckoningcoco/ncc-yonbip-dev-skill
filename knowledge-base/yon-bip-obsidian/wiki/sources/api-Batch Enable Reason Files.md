---
title: "原因档案批量启用"
apiId: "b72ea387ca94413fb787a29d055b2b8e"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Reason File"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Reason File]
platform_version: "BIP"
source_type: community-api-docs
---

# 原因档案批量启用

> `ContentType	application/json` 请求方式	POST | 分类: Reason File (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/reason/unstop

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
| data | object | 是 | 是 | 原因档案 |
| id | long | 否 | 是 | 原因档案id 示例：1973895263768832 |

## 3. 请求示例

Url: /yonbip/digitalModel/reason/unstop?access_token=访问令牌
Body: {
	"data": [
		{
			"id": 1973895263768832
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 200：成功，其它：失败 示例：200 |
| message | string | 否 | 请求结果 示例：操作成功 |
| data | object | 是 | 请求结果数据 |
| _realtype | string | 否 | 框架返回字段，无实际意义 |
| _entityName | string | 否 | 框架返回字段，无实际意义 |
| _keyName | string | 否 | 框架返回字段，无实际意义 |
| id | long | 否 | 原因档案id 示例：2330629333717248 |
| _status | string | 否 | 框架返回字段，无实际意义 |
| stoptime | string | 否 | 停用时间 |
| stopstatus | boolean | 否 | 是否停用状态，true：已停用，false：已启用 示例：false |
| tenant | long | 否 | 租户id 示例：2237604242395392 |
| pubts | string | 否 | 时间戳 示例：2021-08-24 20:44:31 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"_realtype": "",
			"_entityName": "",
			"_keyName": "",
			"id": 2330629333717248,
			"_status": "",
			"stoptime": "",
			"stopstatus": false,
			"tenant": 2237604242395392,
			"pubts": "2021-08-24 20:44:31"
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

