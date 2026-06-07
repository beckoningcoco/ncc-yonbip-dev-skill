---
title: "物料模板批量启用"
apiId: "49fc649dfa274d709e3cbbdb6aec5f1f"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Material Template"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Material Template]
platform_version: "BIP"
source_type: community-api-docs
---

# 物料模板批量启用

> `ContentType	application/json` 请求方式	POST | 分类: Material Template (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/producttpl/batchStart

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
| data | object | 是 | 是 | 参数数据体 |
| id | long | 否 | 是 | 物料模板id 示例：2291425763545344 |

## 3. 请求示例

Url: /yonbip/digitalModel/producttpl/batchStart?access_token=访问令牌
Body: {
	"data": [
		{
			"id": 2291425763545344
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 请求结果状态码 示例：200 |
| message | string | 否 | 请求结果信息 示例：操作成功 |
| data | object | 否 | 请求结果数据 |
| _realtype | string | 否 | 真实类型 |
| _entityName | string | 否 | 实体名称 |
| _keyName | string | 否 | 关键字 |
| id | long | 否 | 物料模板id 示例：2335512430842112 |
| _status | string | 否 | 实体状态 |
| stoptime | string | 否 | 停用时间 |
| stopstatus | boolean | 否 | 是否为停用状态，true:已停用，false：已启用 示例：false |
| tenant | long | 否 | 租户id 示例：2285367277588736 |
| pubts | string | 否 | 时间戳 示例：2021-07-21 17:40:33 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"_realtype": "",
		"_entityName": "",
		"_keyName": "",
		"id": 2335512430842112,
		"_status": "",
		"stoptime": "",
		"stopstatus": false,
		"tenant": 2285367277588736,
		"pubts": "2021-07-21 17:40:33"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	停用失败	操作失败


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

