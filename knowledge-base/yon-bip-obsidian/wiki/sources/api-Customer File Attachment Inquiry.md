---
title: "客户档案附件查询"
apiId: "1903221582379614208"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Customer"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Customer]
platform_version: "BIP"
source_type: community-api-docs
---

# 客户档案附件查询

> `ContentType	application/json` 请求方式	POST | 分类: Customer (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/merchant/queryfilebyid

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
| id | long | 否 | 是 | 客户id； 示例：1731971993608650753 |
| fileType | string | 否 | 否 | 附件类型，merchantLogo,frontIdCard,backIdCard,businessLicenseNew,certificate,merchant,attachment，填写时，查询当前类型附件，不填写时查询指定所有附件 示例：merchantLogo |

## 3. 请求示例

Url: /yonbip/digitalModel/merchant/queryfilebyid?access_token=访问令牌
Body: {
	"id": 1731971993608650753,
	"fileType": "merchantLogo"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| message | string | 否 | 调用失败时的错误信息； 示例：处理成功 |
| code | string | 否 | 返回码，调用成功时返回200； 示例：200 |
| data | object | 是 | 调用成功时的返回数据； |
| fileType | string | 否 | 客户附件类型 示例：frontIdCard |
| fileInfos | object | 是 | 附件信息 |

## 5. 正确返回示例

{
	"message": "处理成功",
	"code": "200",
	"data": [
		{
			"fileType": "frontIdCard",
			"fileInfos": [
				{
					"fileUrl": "附件url",
					"fileName": "附件名称",
					"fileSize": "11816"
				}
			]
		}
	]
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

