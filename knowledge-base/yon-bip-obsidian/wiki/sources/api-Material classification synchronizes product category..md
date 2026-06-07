---
title: "物料分类同步商品分类"
apiId: "c0db7d3096e141fd8cdf9991179c5eb4"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Material Category"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Material Category]
platform_version: "BIP"
source_type: community-api-docs
---

# 物料分类同步商品分类

> `ContentType	application/json` 请求方式	POST | 分类: Material Category (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/productCls/syncProductclass

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |

## 3. 请求示例

Url: /yonbip/digitalModel/productCls/syncProductclass?access_token=访问令牌

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 请求结果状态码，200：成功，其它：失败 示例：200 |
| message | string | 否 | 请求结果信息 示例：操作成功 |
| data | string | 否 | 提示信息 示例：物料分类数据同步到商品分类成功 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": "物料分类数据同步到商品分类成功"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	系统发生错误	操作失败


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

