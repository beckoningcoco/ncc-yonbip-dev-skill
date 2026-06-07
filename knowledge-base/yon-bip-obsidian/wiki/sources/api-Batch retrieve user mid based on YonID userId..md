---
title: "根据友户通userId批量获取用户mid"
apiId: "dfc912ad-0150-4343-ab2b-71323ac2c582"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Mobile Configuration"
domain: "SYS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Mobile Configuration]
platform_version: "BIP"
source_type: community-api-docs
---

# 根据友户通userId批量获取用户mid

> `ContentType	application/json` 请求方式	POST | 分类: Mobile Configuration (SYS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/uspace/batchDoConvert/get_memberIds

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
| userIds | string | 是 | 是 | 友户通用户id集合(list) |

## 3. 请求示例

Url: /yonbip/uspace/batchDoConvert/get_memberIds?access_token=访问令牌
Body: {
	"userIds": [
		""
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 错误信息 示例：success |
| data | object | 否 | 数据 |
| qzId | string | 否 | 空间ID |
| memberIds | string | 是 | 空间用户ID |

## 5. 正确返回示例

{
	"code": "200",
	"message": "success",
	"data": {
		"qzId": "",
		"memberIds": [
			""
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-12-29

新增

返回参数 (5)

删除

返回参数 qzId

删除

返回参数 memberIds

2	2025-10-16

更新

请求说明

更新

请求参数 userIds


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

