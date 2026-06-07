---
title: "物料状态服务控制点保存"
apiId: "1661472141165461505"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Life Cycle Template"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Life Cycle Template]
platform_version: "BIP"
source_type: community-api-docs
---

# 物料状态服务控制点保存

> `ContentType	application/json` 请求方式	POST | 分类: Life Cycle Template (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/serviceControl/save

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
| serviceCode | string | 否 | 是 | 工作台注册服务编码 示例：pc_product |
| serviceName | string | 否 | 否 | 服务名称 示例：物料创建 |
| action | string | 否 | 是 | 控制动作编码 示例：save |
| actionName | string | 否 | 是 | 控制动作名称 示例：保存 |
| stopstatus | int | 否 | 否 | 是否停用（0：启用；1：停用） 示例：0 |

## 3. 请求示例

Url: /yonbip/digitalModel/serviceControl/save?access_token=访问令牌
Body: {
	"serviceCode": "pc_product",
	"serviceName": "物料创建",
	"action": "save",
	"actionName": "保存",
	"stopstatus": 0
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用失败时的错误信息 示例：操作成功 |
| data | object | 否 | 调用成功时的返回数据 |
| id | string | 否 | 服务控制类型ID 示例：1656281741820166145 |
| serviceCode | string | 否 | 工作台注册服务编码 示例：pc_product |
| serviceName | string | 否 | 服务名称 示例：物料创建 |
| action | string | 否 | 控制类型--控制动作编码 示例：save |
| actionName | string | 否 | 控制类型名称 -控制动作名称 示例：保存 |
| stopstatus | int | 否 | 是否停用 示例：0 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"id": "1656281741820166145",
		"serviceCode": "pc_product",
		"serviceName": "物料创建",
		"action": "save",
		"actionName": "保存",
		"stopstatus": 0
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	服务端逻辑异常	检查入参是否填写正确，参数值是否真实存在，仍提示该信息请联系开发人员。


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

