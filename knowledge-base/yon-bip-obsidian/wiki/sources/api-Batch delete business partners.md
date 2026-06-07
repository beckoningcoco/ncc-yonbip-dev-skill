---
title: "业务伙伴批量删除"
apiId: "1430020906109370368"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Business Partner"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Business Partner]
platform_version: "BIP"
source_type: community-api-docs
---

# 业务伙伴批量删除

> `ContentType	application/json` 请求方式	POST | 分类: Business Partner (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/businesspartner/batchdelete

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
| data | object | 是 | 是 | 业务伙伴 |
| id | string | 否 | 是 | 业务伙伴id 示例：1928999623863389 |

## 3. 请求示例

Url: /yonbip/digitalModel/businesspartner/batchdelete?access_token=访问令牌
Body: {
	"data": [
		{
			"id": "1928999623863389"
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 200：成功，其它：失败 示例：200 |
| message | string | 否 | 请求结果 示例：操作成功 |
| data | string | 否 | 请求结果数据 示例：正在批量删除。可根据asyncKey[delete_EDA68388-5589-9F64-F61C-7DA033FBC02B]调用[批量删除进度查询]API以查看删除进度及结果。 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": "正在批量删除。可根据asyncKey[delete_EDA68388-5589-9F64-F61C-7DA033FBC02B]调用[批量删除进度查询]API以查看删除进度及结果。"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	服务端逻辑异常	检查入参是否填写正确，参数值是否真实存在，仍提示该信息请联系开发人员


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

