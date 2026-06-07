---
title: "采购品类更新保存-特征"
apiId: "1841010716273278976"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Procurement Category"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Procurement Category]
platform_version: "BIP"
source_type: community-api-docs
---

# 采购品类更新保存-特征

> `ContentType	application/json` 请求方式	POST | 分类: Procurement Category (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/purchaseclass/newupdate

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
| id | long | 否 | 否 | id，id与code至少填写一个 示例：123456 |
| code | string | 否 | 否 | 编码，id与code至少填写一个 示例：code |
| name | string | 否 | 否 | 名称 示例：名称 |
| parentCode | string | 否 | 否 | 上级品类编码 示例：code01 |
| order | int | 否 | 否 | 排序号 示例：1 |
| stopStatus | boolean | 否 | 否 | 启用状态 true：停用 false：启用 示例：true |
| categoryManagerCode | string | 否 | 否 | 品类经理编码 示例：code03 |
| categoryGradeCode | string | 否 | 否 | 品类等级编码 示例：code04 |

## 3. 请求示例

Url: /yonbip/digitalModel/purchaseclass/newupdate?access_token=访问令牌
Body: {
	"id": 123456,
	"code": "code",
	"name": "名称",
	"parentCode": "code01",
	"order": 1,
	"stopStatus": true,
	"categoryManagerCode": "code03",
	"categoryGradeCode": "code04"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 示例："200" |
| message | string | 否 | 提示信息 示例：处理成功 |
| data | object | 否 | 返回结果,id |
| id | long | 否 | id 示例：123456 |

## 5. 正确返回示例

{
	"code": "\"200\"",
	"message": "处理成功",
	"data": {
		"id": 123456
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	服务端逻辑异常	服务端逻辑异常


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-01

新增

请求参数 categoryManagerCode

新增

请求参数 categoryGradeCode


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

