---
title: "获取文件下载地址"
apiId: "1654792711122714625"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "File Services"
domain: "SYS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, File Services]
platform_version: "BIP"
source_type: community-api-docs
---

# 获取文件下载地址

> `ContentType	application/json` 请求方式	GET | 分类: File Services (SYS)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/uspace/iuap-apcom-file/rest/v1/openapi/{businessType}/{fileId}/queryFile

请求方式	GET

ContentType	application/json

应用场景	开放API/集成API

API类别	详情查询

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| businessType | string | path | 是 | 应用标识 |
| fileId | string | path | 是 | 文件ID |
| token | string | query | 是 | 文件服务的SDK中CooperationFileService.queryAccessTokenFile接口返回的accessToken值 |

## 3. 请求示例

Url: /yonbip/uspace/iuap-apcom-file/rest/v1/openapi/{businessType}/{fileId}/queryFile?access_token=访问令牌&token=

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | int | 否 | 返回状态码 示例：200 |
| data | object | 否 | 结果对象 |
| url | string | 否 | 下载文件的安全url地址 示例：https://bip-test.yyuap.com/iuap-apcom-file/rest/v1/file/xxxxx/0/ocstream?downThumb=false&token=iuapFileToken6d3fa1b8fa46d63c49027b06bceecab9&isWaterMark=false&fileName= |

## 5. 正确返回示例

{
	"code": 200,
	"data": {
		"url": "https://bip-test.yyuap.com/iuap-apcom-file/rest/v1/file/xxxxx/0/ocstream?downThumb=false&token=iuapFileToken6d3fa1b8fa46d63c49027b06bceecab9&isWaterMark=false&fileName="
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

40101	验证未通过,请求拒绝	重新获取文件服务sdk接口返回的token信息


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

