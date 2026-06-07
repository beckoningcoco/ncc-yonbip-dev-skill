---
title: "分配签署配置"
apiId: "1857242978239643655"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "E-signature Configuration"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, E-signature Configuration]
platform_version: "BIP"
source_type: community-api-docs
---

# 分配签署配置

> `ContentType	application/json` 请求方式	POST | 分类: E-signature Configuration (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/uspace/rest/contract/config/allocate

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
| processId | string | 否 | 是 | 业务方合同签署配置ID 示例：1804444444444444770 |
| appCode | string | 否 | 否 | 应用编码 示例：ycContoootManagement |
| objectRefCode | string | 否 | 否 | 参照业务对象编码 示例：transtype.bd_billlllltyperef |
| tenantId | string | 否 | 否 | 租户ID 示例：qy2222222 |
| refDataList | object | 是 | 是 | 分配数据列表 |
| id | string | 否 | 是 | 分配数据ID 示例：180444422222244770 |
| code | string | 否 | 否 | 分配数据编码 示例：code001 |
| name | string | 否 | 否 | 分配数据名称 示例：name0001 |

## 3. 请求示例

Url: /yonbip/uspace/rest/contract/config/allocate?access_token=访问令牌
Body: [{
	"processId": "1804444444444444770",
	"appCode": "ycContoootManagement",
	"objectRefCode": "transtype.bd_billlllltyperef",
	"tenantId": "qy2222222",
	"refDataList": [
		{
			"id": "180444422222244770",
			"code": "code001",
			"name": "name0001"
		}
	]
}]

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 返回数据 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

500	接口调用错误	接口调用错误


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

