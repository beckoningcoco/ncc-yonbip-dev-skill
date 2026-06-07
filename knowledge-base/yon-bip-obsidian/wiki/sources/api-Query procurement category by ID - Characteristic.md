---
title: "根据id查询采购品类-特征"
apiId: "1841012236691701773"
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

# 根据id查询采购品类-特征

> `ContentType	application/json` 请求方式	GET | 分类: Procurement Category (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/purchaseclass/newdetail

请求方式	GET

ContentType	application/json

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | long | query | 是 | 采购品类ID    示例: 123456 |

## 3. 请求示例

Url: /yonbip/digitalModel/purchaseclass/newdetail?access_token=访问令牌&id=123456

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用返回信息 示例：处理成功 |
| data | object | 否 | 调用成功时的返回数据 |
| code | string | 否 | 品类编码 示例：code |
| name | string | 否 | 品类名称 示例：品类名称 |
| parent | long | 否 | 上级品类id 示例：12345678 |
| parentName | string | 否 | 上级品类名称 示例：上级品类 |
| order | int | 否 | 排序号 示例：1 |
| level | int | 否 | 层级 示例：1 |
| id | long | 否 | 采购品类ID 示例：1426543 |
| stopStatus | boolean | 否 | 启用状态 true：停用 false：启用 示例：true |
| orgName | string | 否 | 管理组织名称 示例：管理组织 |
| orgId | string | 否 | 管理组织id 示例：145623494 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "处理成功",
	"data": {
		"code": "code",
		"name": "品类名称",
		"parent": 12345678,
		"parentName": "上级品类",
		"order": 1,
		"level": 1,
		"id": 1426543,
		"stopStatus": true,
		"orgName": "管理组织",
		"orgId": "145623494"
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

