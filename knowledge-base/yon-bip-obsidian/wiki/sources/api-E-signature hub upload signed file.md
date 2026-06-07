---
title: "电子签hub上传签署文件"
apiId: "2275291858963791876"
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

# 电子签hub上传签署文件

> `ContentType	application/json` 请求方式	POST | 分类: E-signature Configuration (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/id/contract/v1/upload

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
| fileName | string | 否 | 是 | 文件名称 示例：示例文件.pdf |
| fileData | string | 否 | 是 | 待上传文件base64编码数据 示例：5rWL6K+V5paH5Lu25pWw5o2u |

## 3. 请求示例

Url: /yonbip/id/contract/v1/upload?access_token=访问令牌
Body: {
	"fileName": "示例文件.pdf",
	"fileData": "5rWL6K+V5paH5Lu25pWw5o2u"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 响应码 示例：200 |
| message | string | 否 | 响应信息 示例：success |
| data | object | 否 | 响应数据 |
| fileKey | string | 否 | 文件在电子签平台中的序列标识 示例：b9cf581b7412968da4efe4d96177418f |

## 5. 正确返回示例

{
	"code": "200",
	"message": "success",
	"data": {
		"fileKey": "b9cf581b7412968da4efe4d96177418f"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-08-15

更新

请求说明

新增

请求参数 fileName

新增

请求参数 fileData

删除

请求参数 fileData


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

