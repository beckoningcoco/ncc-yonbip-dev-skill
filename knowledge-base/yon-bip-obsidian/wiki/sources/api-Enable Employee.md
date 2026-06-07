---
title: "员工启用"
apiId: "0e639a6bee784900a2543b4561d3edea"
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

# 员工启用

> `ContentType	application/json` 请求方式	POST | 分类: Employee (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/staff/unstop

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
| data | object | 否 | 否 | data |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| id | string | 否 | 否 | 员工id |
| enable | long | 否 | 否 | 0:未启用，1启用，2停用，接口需要传原状态 |

## 3. 请求示例

Url: /yonbip/digitalModel/staff/unstop?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"id": "",
		"enable": 0
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 编码 示例：200 |
| message | string | 否 | 说明 示例：操作成功 |
| data | object | 否 | data |
| enable | long | 否 | 0:未启用，1:启用，2:停用 |
| yhtTenant | string | 否 | 租户 示例：yovt4kdg |
| tenant | string | 否 | 租户id 示例：yovt4kdg |
| id | string | 否 | 员工id |
| modifiedtime | string | 否 | 修改时间 示例：2020-09-02 17:13:47 |
| pubts | string | 否 | 时间戳 示例：2020-09-03 06:13:47 |
| user_id | string | 否 | 用户id 示例：64d9d904-2ce3-4c2a-a7d0-7c6af3bc20e1 |
| modifier | string | 否 | 修改者 示例：605089 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"enable": 0,
		"yhtTenant": "yovt4kdg",
		"tenant": "yovt4kdg",
		"id": "",
		"modifiedtime": "2020-09-02 17:13:47",
		"pubts": "2020-09-03 06:13:47",
		"user_id": "64d9d904-2ce3-4c2a-a7d0-7c6af3bc20e1",
		"modifier": "605089"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


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

