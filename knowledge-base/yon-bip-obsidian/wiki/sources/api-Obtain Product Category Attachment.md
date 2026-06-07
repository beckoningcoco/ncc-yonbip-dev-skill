---
title: "获取商品分类附件"
apiId: "2074174973108813830"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Product Category"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Product Category]
platform_version: "BIP"
source_type: community-api-docs
---

# 获取商品分类附件

> `ContentType	application/json` 请求方式	POST | 分类: Product Category (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/attachment/queryPresentationClassFiles

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
| businessIds | string | 是 | 是 | 附件业务id集合 示例：["123","321"] |

## 3. 请求示例

Url: /yonbip/digitalModel/attachment/queryPresentationClassFiles?access_token=访问令牌
Body: {
	"businessIds": [
		"123",
		"321"
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 后端服务影响码 示例：200 |
| data | object | 否 | 返回具体数据对象 |
| bussinessId | object | 是 | 附件业务id |

## 5. 正确返回示例

{
	"code": "200",
	"data": {
		"bussinessId": [
			{
				"id": "6565cf9f1xxa4b52490a9958",
				"filePath": "https://xxx.oss-cn-beijing-internal.aliyuncs.com/iuap-apcom-file-private/iuap-apcom-file/0000KN5SBWCXXXE9SF0000/2024072616/dfec9f76-1d2f-4481-b759-1b371a0ff65e.png?Expires=1722963021&OSSAccessKeyId=BFFAI5tByXGxxx8mi4vNB75r&Signature=vYZdkMiLPwQTvmibUlJ5HG",
				"fileSize": 695083,
				"name": "1721982353779821.png",
				"yhtUserId": "30950820-8b32-b7a60c037680",
				"tenantId": "0000KN5XXXX43JE9SF0000",
				"ctime": 1721982367540,
				"utime": 1722849828985
			}
		]
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

