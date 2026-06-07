---
title: "根据code查询采购品类-特征"
apiId: "1841011850144645123"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Procurement Category"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Procurement Category]
platform_version: "BIP"
source_type: community-api-docs
---

# 根据code查询采购品类-特征

> `ContentType	application/json` 请求方式	GET | 分类: Procurement Category (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/purchaseclass/newdetailbycode

请求方式	GET

ContentType	application/json

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| code | string | query | 是 | 采购品类编码    示例: code |

## 3. 请求示例

Url: /yonbip/digitalModel/purchaseclass/newdetailbycode?access_token=访问令牌&code=code

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用返回信息 示例：处理成功 |
| data | object | 否 | 调用成功时的返回数据 |
| id | long | 否 | 采购品类ID 示例：123456 |
| code | string | 否 | 品类编码 示例：code |
| name | string | 否 | 品类名称 示例：品类名称 |
| parent | long | 否 | 上级品类id 示例：1234567 |
| parentName | string | 否 | 上级品类名称 示例：上级品类 |
| template | long | 否 | 物料模板id 示例：123456789 |
| order | int | 否 | 排序号 示例：1 |
| level | int | 否 | 层级 示例：1 |
| stopStatus | boolean | 否 | 启用状态 true：停用 false：启用 示例：true |
| orgName | string | 否 | 管理组织名称 示例：管理组织 |
| orgId | string | 否 | 管理组织id 示例：12345456 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "处理成功",
	"data": {
		"id": 123456,
		"code": "code",
		"name": "品类名称",
		"parent": 1234567,
		"parentName": "上级品类",
		"template": 123456789,
		"order": 1,
		"level": 1,
		"stopStatus": true,
		"orgName": "管理组织",
		"orgId": "12345456"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	服务端逻辑异常	检查入参是否填写正确，参数值是否真实存在，仍提示该信息请联系开发人员


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

