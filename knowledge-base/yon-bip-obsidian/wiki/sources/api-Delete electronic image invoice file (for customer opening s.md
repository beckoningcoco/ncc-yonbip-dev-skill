---
title: "电子影像删除发票文件（客开场景专用）"
apiId: "2356755122126061571"
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

# 电子影像删除发票文件（客开场景专用）

> `ContentType	application/json` 请求方式	POST | 分类: File Services (SYS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/PFC/img/OtherSystem/deleteInvoice

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
| uuid | string | 否 | 是 | 请求编号，用于后台日志标记请求，要求全局唯一，长度不能超过32位 示例：13152995891 |
| barcode | string | 否 | 是 | 单据条码 示例：261X1001ZZ1000000000C0AO |
| factorycode | string | 否 | 是 | 厂商编码 示例：yc |
| billid | string | 否 | 是 | 单据主键 示例：1588548192006832133 |
| opTime | string | 否 | 是 | 操作时间 示例：2022-11-11 15:24:14 |
| data | object | 否 | 是 | 文件信息 |
| fphm | string | 否 | 是 | 发票号码 示例：2511700000039 |

## 3. 请求示例

Url: /yonbip/PFC/img/OtherSystem/deleteInvoice?access_token=访问令牌
Body: {
	"uuid": "13152995891",
	"barcode": "261X1001ZZ1000000000C0AO",
	"factorycode": "yc",
	"billid": "1588548192006832133",
	"opTime": "2022-11-11 15:24:14",
	"data": {
		"fphm": "2511700000039"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回编码 示例：200 |
| message | string | 否 | 返回消息 示例：请求成功 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "请求成功"
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

