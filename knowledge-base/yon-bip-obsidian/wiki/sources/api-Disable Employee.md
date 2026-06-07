---
title: "员工停用"
apiId: "da120be9960c4d10a5ca3a2c41e39570"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Employee"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Employee]
platform_version: "BIP"
source_type: community-api-docs
---

# 员工停用

> `ContentType	application/json` 请求方式	POST | 分类: Employee (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/staff/stop

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	MDD幂等

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 否 | 是 | data |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| id | string | 否 | 是 | 员工id 示例：1838065487581440 |
| enable | long | 否 | 否 | 0:未启用，1启用，2停用，接口需要传原状态，配合user_id解绑用户使用 示例：1 |
| user_id | string | 否 | 否 | 用户id。传递用户id会进行用户解绑操作。 |

## 3. 请求示例

Url: /yonbip/digitalModel/staff/stop?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"id": "1838065487581440",
		"enable": 1,
		"user_id": ""
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 编码 示例：200 |
| message | string | 否 | 说明 示例：操作成功 |
| data | object | 否 | 业务数据 |
| enable | long | 否 | 0:未启用，1:启用，2:停用 示例：2 |
| id | string | 否 | 员工id 示例：1681233566159104 |
| modifier | string | 否 | 修改者 示例：00001951-7ca3-47ac-a462-d5a66e3e6724 |
| modifiedtime | string | 否 | 修改时间 示例：2020-11-19 15:25:54 |
| yhtTenant | string | 否 | 租户 示例：pie4u55f |
| tenant | string | 否 | 租户id 示例：pie4u55f |
| yhtTenantId | string | 否 | 友户通租户id 示例：pie4u55f |
| user_id | string | 否 | 保留字段 示例：NULL |
| _keyNme | string | 否 | 保留字段 示例：NULL |
| _status | string | 否 | 保留字段 示例：NULL |
| _entityNme | string | 否 | 保留字段 示例：NULL |
| pubts | string | 否 | 时间戳 示例：2020-11-19 15:25:54 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"enable": 2,
		"id": "1681233566159104",
		"modifier": "00001951-7ca3-47ac-a462-d5a66e3e6724",
		"modifiedtime": "2020-11-19 15:25:54",
		"yhtTenant": "pie4u55f",
		"tenant": "pie4u55f",
		"yhtTenantId": "pie4u55f",
		"user_id": "NULL",
		"_keyNme": "NULL",
		"_status": "NULL",
		"_entityNme": "NULL",
		"pubts": "2020-11-19 15:25:54"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	服务端逻辑异常	联系管理员


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

