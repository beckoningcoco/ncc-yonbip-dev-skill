---
title: "文件删除"
apiId: "cd0f6b0352f74d33a2e86e2e97901084"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "File Services"
domain: "SYS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, File Services]
platform_version: "BIP"
source_type: community-api-docs
---

# 文件删除

> `ContentType	application/json` 请求方式	POST | 分类: File Services (SYS)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/uspace/iuap-apcom-file/rest/v1/file/delete

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	单条删除

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| businessType | string | query | 是 | 应用标识    示例: test |
| businessId | string | query | 是 | 业务标识    示例: 123 |
| fid | string | query | 是 | 文件id    示例: 123 |

## 3. 请求示例

Url: /yonbip/uspace/iuap-apcom-file/rest/v1/file/delete?access_token=访问令牌&businessType=test&businessId=123&fid=123

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 响应编码 示例：200 |
| data | object | 否 | 具体业务数据 |
| success | string | 否 | 成功删除条目数 示例：1 |

## 5. 正确返回示例

{
	"code": "200",
	"data": {
		"success": "1"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1090003500005	操作权限不足	删除人与上传人必须一致


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

