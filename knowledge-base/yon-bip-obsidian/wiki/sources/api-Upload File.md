---
title: "文件上传"
apiId: "c21414e7f9eb48b795ad432b0768d8bf"
apiPath: "请求方式	POST"
method: "ContentType	multipart/form-data"
category: "File Services"
domain: "SYS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, File Services]
platform_version: "BIP"
source_type: community-api-docs
---

# 文件上传

> `ContentType	multipart/form-data` 请求方式	POST | 分类: File Services (SYS)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/uspace/iuap-apcom-file/rest/v1/file

请求方式	POST

ContentType	multipart/form-data

应用场景	开放API/集成API

API类别	单条保存/更新

事务和幂等性	MDD幂等

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| businessType | string | query | 是 | 应用标识    示例: test |
| businessId | string | query | 是 | 业务标识    示例: 123 |
| usePrivateBucket | string | query | 否 | 是否启用私有桶    示例: false    默认值: false |
| resubmitCheckKey | string | query | 否 | 幂等标识 |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| files | file | 否 | 是 | 文件 |

## 3. 请求示例

Url: /yonbip/uspace/iuap-apcom-file/rest/v1/file?access_token=访问令牌&businessType=test&businessId=123&usePrivateBucket=false&resubmitCheckKey=

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 业务返回编码 示例：200 |
| data | object | 否 | 业务消息体 |
| data | object | 是 | 具体返回数据 |

## 5. 正确返回示例

{
	"code": "200",
	"data": {
		"data": [
			{
				"id": "6188e00d93db980027b8bff2",
				"fileExtension": ".bmp",
				"fileSize": 1205242,
				"fileSizeText": "1 MB",
				"fileName": "新建位图图像 (2)",
				"copy": false
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1090003500065	上传信息未包含租户及用户信息	检查绑定用户身份


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

