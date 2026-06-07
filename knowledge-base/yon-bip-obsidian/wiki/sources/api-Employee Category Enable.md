---
title: "员工类别启用"
apiId: "ac1e5ae840bb4369af34bf63775bc956"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Employee Category"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Employee Category]
platform_version: "BIP"
source_type: community-api-docs
---

# 员工类别启用

> `ContentType	application/json` 请求方式	POST | 分类: Employee Category (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/psnlcatg/enable

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
| data | object | 否 | 是 | 入参 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| id | string | 否 | 是 | 员工类别ID 示例：2570452638945792 |

## 3. 请求示例

Url: /yonbip/digitalModel/psnlcatg/enable?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"id": "2570452638945792"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | int | 否 | 状态码 示例：200 |
| message | string | 否 | 返回状态 示例：操作成功 |
| data | object | 否 | 响应 |
| id | string | 否 | 员工类别ID 示例：2564246919319808 |
| parent | string | 否 | 上级员工类别ID 示例：de9878970c984628bcce767c3a4d8a75 |
| modifier | string | 否 | 修改人 示例：65e24ddd-7af0-4fd0-a7de-c2e437697ae5 |
| modifiedtime | DateTime | 否 | 修改时间，yyyy-MM-dd HH:mm:ss 示例：2021-12-17 13:46:26 |
| pubts | DateTime | 否 | 时间戳，yyyy-MM-dd HH:mm:ss 示例：2021-12-17 13:46:26 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"id": "2564246919319808",
		"parent": "de9878970c984628bcce767c3a4d8a75",
		"modifier": "65e24ddd-7af0-4fd0-a7de-c2e437697ae5",
		"modifiedtime": "2021-12-17 13:46:26",
		"pubts": "2021-12-17 13:46:26"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	上级档案节点已经关闭，请先启用上级档案	先启用上级档案


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

