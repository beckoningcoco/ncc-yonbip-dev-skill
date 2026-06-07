---
title: "成本中心批量删除"
apiId: "2002821066540449798"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Cost Center"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Cost Center]
platform_version: "BIP"
source_type: community-api-docs
---

# 成本中心批量删除

> `ContentType	application/json` 请求方式	POST | 分类: Cost Center (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/AMP/bd/v1/costcenter/batchDelete

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
| ids | string | 是 | 是 | 成本中心id 示例：["1954464596563066881"] |

## 3. 请求示例

Url: /yonbip/AMP/bd/v1/costcenter/batchDelete?access_token=访问令牌
Body: {
	"ids": [
		"1954464596563066881"
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 200表示成功 |
| data | object | 否 | 返回信息 |
| success | boolean | 否 | true 成功。false失败 示例：true |
| message | string | 否 | 删除信息 示例：成本中心为异步删除，请在成本中节点查询删除结果！如果查询不到的情况下，证明已经成功删除 |

## 5. 正确返回示例

{
	"code": "",
	"data": {
		"success": true,
		"message": "成本中心为异步删除，请在成本中节点查询删除结果！如果查询不到的情况下，证明已经成功删除"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

code=0，success=false	表示删除失败	查看message信息


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

