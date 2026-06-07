---
title: "客户级别新增保存-幂等"
apiId: "1972548238655881217"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Customer Grade"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Customer Grade]
platform_version: "BIP"
source_type: community-api-docs
---

# 客户级别新增保存-幂等

> `ContentType	application/json` 请求方式	POST | 分类: Customer Grade (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/cuslevel/idempotent/insert

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
| data | object | 否 | 是 | 客户级别 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| code | string | 否 | 是 | 客户级别编码 示例：code |
| name | object | 否 | 否 | 客户级别名称 |
| enabled | boolean | 否 | 否 | 启用状态, true:启用、false:停用、 示例：true |
| order | int | 否 | 否 | 排序号 示例：1 |
| comment | object | 否 | 否 | 备注 |

## 3. 请求示例

Url: /yonbip/digitalModel/cuslevel/idempotent/insert?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"code": "code",
		"name": {
			"simplifiedName": "简体",
			"englishName": "英文",
			"traditionalName": "繁体"
		},
		"enabled": true,
		"order": 1,
		"comment": {
			"simplifiedName": "简体",
			"englishName": "英文",
			"traditionalName": "繁体"
		}
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用失败时的错误信息 示例：处理成功 |
| data | object | 否 | 调用成功时的返回数据 |
| id | string | 否 | 客户级别ID 示例：123456 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "处理成功",
	"data": {
		"id": "123456"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	服务端逻辑异常	服务端逻辑异常


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

