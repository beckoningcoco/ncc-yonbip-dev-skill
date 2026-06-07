---
title: "产品线删除"
apiId: "2148312198917128199"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Product Line"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Product Line]
platform_version: "BIP"
source_type: community-api-docs
---

# 产品线删除

> `ContentType	application/json` 请求方式	POST | 分类: Product Line (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/batch/productline/delete

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	MDD幂等

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| code | string | 否 | 否 | 产品线编码 示例：code11 |

## 3. 请求示例

Url: /yonbip/digitalModel/batch/productline/delete?access_token=访问令牌
Body: [{
	"code": "code11"
}]

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| success | boolean | 否 | 调用结果 示例：true |
| message | string | 否 | message |
| code | number |
| 小数位数:0,最大长度:10 | 否 | 返回码 示例：200 |
| totalCount | number |
| 小数位数:0,最大长度:10 | 否 | 删除总数量 示例：3 |
| data | object | 否 | 详细返回结果 |
| count | number |
| 小数位数:0,最大长度:10 | 否 | 总数量 示例：3 |
| sucessCount | number |
| 小数位数:0,最大长度:10 | 否 | 成功数量 示例：2 |
| failCount | number |
| 小数位数:0,最大长度:10 | 否 | 失败数量 示例：1 |
| messages | string | 是 | 失败简要信息 示例：["[eis2]产品线已经被领域[内部结算]中[调价单]引用，不可删除！"] |
| infos | string | 是 | 成功信息 |
| failInfos | object | 是 | 失败详细信息 |

## 5. 正确返回示例

{
	"success": true,
	"message": "",
	"code": 200,
	"totalCount": 3,
	"data": {
		"count": 3,
		"sucessCount": 2,
		"failCount": 1,
		"messages": [
			"[eis2]产品线已经被领域[内部结算]中[调价单]引用，不可删除！"
		],
		"infos": [
			""
		],
		"failInfos": [
			{
				"code": "eis2",
				"id": 1857441233835130882,
				"message": "[eis2]产品线已经被领域[内部结算]中[调价单]引用，不可删除！"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

-1	系统异常，请稍后再试	检查入参是否填写正确，参数值是否真实存在，仍提示该信息请联系开发人员


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

