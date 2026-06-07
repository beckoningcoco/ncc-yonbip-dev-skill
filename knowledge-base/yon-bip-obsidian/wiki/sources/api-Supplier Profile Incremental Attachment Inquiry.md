---
title: "供应商档案增量附件查询"
apiId: "1867215703301423109"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Supplier"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Supplier]
platform_version: "BIP"
source_type: community-api-docs
---

# 供应商档案增量附件查询

> `ContentType	application/json` 请求方式	POST | 分类: Supplier (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/api/vendor/incrementAttachment

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
| beginTime | string | 否 | 是 | 起始时间 示例：2023-10-01 00:00:00 |
| endTime | string | 否 | 否 | 结束时间 示例：2024-01-26 00:00:00 |
| businessType | string | 否 | 是 | 附件业务类型 示例：iuap-apdoc-vendor 默认值：iuap-apdoc-vendor |
| pageIndex | int | 否 | 是 | 当前页索引 示例：1 默认值：1 |
| pageSize | int | 否 | 是 | 每页数量 示例：10 默认值：10 |
| isDeleted | boolean | 否 | 是 | 查询新增附件为false 查询删除附件为true 示例：false 默认值：false |

## 3. 请求示例

Url: /yonbip/digitalModel/api/vendor/incrementAttachment?access_token=访问令牌
Body: {
	"beginTime": "2023-10-01 00:00:00",
	"endTime": "2024-01-26 00:00:00",
	"businessType": "iuap-apdoc-vendor",
	"pageIndex": 1,
	"pageSize": 10,
	"isDeleted": false
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| pageIndex | int | 否 | 当前页索引 |
| pageSize | int | 否 | 每页数量 |
| recordCount | int | 否 | 数据总数 |
| recordList | object | 是 | 数据列表 |
| archiveId | string | 否 | 供应商档案ID |
| attachmentBusinessType | string | 否 | 附件业务类型 |
| attachmentBusinessId | string | 否 | 附件业务ID |
| attachmentFileId | string | 否 | 文件ID |
| fileSize | long | 否 | 文件大小 |
| fileName | string | 否 | 文件名称 |
| downloadUrl | string | 否 | 下载地址 |
| fileExtension | string | 否 | 文件后缀 |
| filePath | string | 否 | 文件路径 |
| fileCreateTime | string | 否 | 文件创建时间 |
| syncTime | string | 否 | 同步时间 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"pageIndex": 0,
		"pageSize": 0,
		"recordCount": 0,
		"recordList": [
			{
				"archiveId": "",
				"attachmentBusinessType": "",
				"attachmentBusinessId": "",
				"attachmentFileId": "",
				"fileSize": 0,
				"fileName": "",
				"downloadUrl": "",
				"fileExtension": "",
				"filePath": "",
				"fileCreateTime": "",
				"syncTime": ""
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	error	异常


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

