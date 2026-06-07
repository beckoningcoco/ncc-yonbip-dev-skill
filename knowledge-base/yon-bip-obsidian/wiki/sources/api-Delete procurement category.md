---
title: "采购品类删除"
apiId: "1841012691958235139"
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

# 采购品类删除

> `ContentType	application/json` 请求方式	POST | 分类: Procurement Category (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/purchaseclass/delete

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
| code | string | 否 | 否 | 采购品类编码 示例：code01 |

## 3. 请求示例

Url: /yonbip/digitalModel/purchaseclass/delete?access_token=访问令牌
Body: {
	"code": "code01"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 请求结果状态码 示例：200 |
| message | string | 否 | 请求结果信息 示例：处理成功 |
| data | object | 否 | 请求结果数据 示例：删除成功！ |

## 5. 正确返回示例

{
	"code": "200",
	"message": "处理成功",
	"data": "删除成功！"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	检查入参是否填写正确，参数值是否真实存在，仍提示该信息请联系开发人员	操作失败


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

