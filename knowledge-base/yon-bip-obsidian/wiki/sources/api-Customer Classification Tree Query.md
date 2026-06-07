---
title: "客户分类树查询V2"
apiId: "1694407591093862401"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Customer Category"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Customer Category]
platform_version: "BIP"
source_type: community-api-docs
---

# 客户分类树查询V2

> `ContentType	application/json` 请求方式	POST | 分类: Customer Category (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/custcategory/newtree

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
| pageIndex | int | 否 | 是 | 页码 示例：1 默认值：1 |
| pageSize | int | 否 | 是 | 分页大小 示例：100 默认值：100 |
| name | string | 否 | 否 | 名称 示例：名称 |
| code | string | 否 | 否 | 编码 示例：code |
| beganTime | DateTime | 否 | 否 | 开始时间戳，包含 示例：2023-04-19 14:00:00 |
| endTime | DateTime | 否 | 否 | 结束时间戳，不包含 示例：2023-04-19 14:10:00 |
| pubts | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 时间戳，包含 示例：2023-04-19 14:00:00 |

## 3. 请求示例

Url: /yonbip/digitalModel/custcategory/newtree?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 100,
	"name": "名称",
	"code": "code",
	"beganTime": "2023-04-19 14:00:00",
	"endTime": "2023-04-19 14:10:00",
	"pubts": "2023-04-19 14:00:00"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 示例："200" |
| message | string | 否 | 调用返回信息 示例：操作成功 |
| data | object | 是 | 调用成功时的返回数据 |
| id | long | 否 | ID 示例：123456 |
| code | string | 否 | 分类编码 示例：code |
| name | object | 否 | 分类名称,支持多语 |
| parent | long | 否 | 上级分类id 示例：166246548 |
| order | int | 否 | 排序号 示例：1 |
| level | int | 否 | 层级 示例：1 |
| isEnabled | boolean | 否 | 启用状态 true：启用 false：停用 示例：true |
| comment | object | 否 | 备注,支持多语 |
| orgId | string | 否 | 管理组织id 示例：666666 |

## 5. 正确返回示例

{
	"code": "\"200\"",
	"message": "操作成功",
	"data": [
		{
			"id": 123456,
			"code": "code",
			"name": {
				"simplifiedName": "简体",
				"englishName": "英文",
				"traditionalName": "繁体"
			},
			"parent": 166246548,
			"order": 1,
			"level": 1,
			"isEnabled": true,
			"comment": {
				"simplifiedName": "简体",
				"englishName": "英文",
				"traditionalName": "繁体"
			},
			"orgId": "666666"
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	服务端逻辑异常	检查入参是否填写正确，参数值是否真实存在，仍提示该信息请联系开发人员


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-17

更新

请求说明


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

