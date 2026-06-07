---
title: "基础档案删除回调"
apiId: "1737876010190766081"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Delete Log"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Delete Log]
platform_version: "BIP"
source_type: community-api-docs
---

# 基础档案删除回调

> `ContentType	application/json` 请求方式	POST | 分类: Delete Log (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/ucfbasedoc/rest/open/api/deletecallback

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
| domain | string | 否 | 是 | 服务名 示例：ucfbasedoc |
| fullname | string | 否 | 是 | 元数据url 示例：bd.bank.BankVO |
| ids | string | 是 | 是 | 主键集合 示例：["123"] |
| refcheckJson | string | 否 | 是 | 校验结果,json格式，key：主键，value：true-存在引用，false-没有引用 示例：{'123':true} |

## 3. 请求示例

Url: /yonbip/digitalModel/ucfbasedoc/rest/open/api/deletecallback?access_token=访问令牌
Body: {
	"domain": "ucfbasedoc",
	"fullname": "bd.bank.BankVO",
	"ids": [
		"123"
	],
	"refcheckJson": "{'123':true}"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 |
| message | string | 否 | 返回信息 |
| data | object | 否 | 返回数据 |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	操作失败


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

