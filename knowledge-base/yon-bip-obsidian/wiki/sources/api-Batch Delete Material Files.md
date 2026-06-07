---
title: "物料档案批量删除"
apiId: "559de3b8988e4778a719a4b9643756f7"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Material"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Material]
platform_version: "BIP"
source_type: community-api-docs
---

# 物料档案批量删除

> `ContentType	application/json` 请求方式	POST | 分类: Material (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/product/batchdelete

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
| data | object | 是 | 否 | 参数数据体 |
| productId | long | 否 | 是 | 物料id 示例：2323526375264512 |
| createOrgId | long | 否 | 是 | 创建组织id 示例：2282542348554496 |
| pubts | string | 否 | 否 | 时间戳 示例：2021-07-19 18:33:09 |

## 3. 请求示例

Url: /yonbip/digitalModel/product/batchdelete?access_token=访问令牌
Body: {
	"data": [
		{
			"productId": 2323526375264512,
			"createOrgId": 2282542348554496,
			"pubts": "2021-07-19 18:33:09"
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 调用完成，返回编码 示例：200 |
| message | string | 否 | 调用完成，返回信息 示例：操作成功 |
| data | string | 否 | 调用完成，返回数据 示例：正在批量删除。可根据asyncKey[delete_29EA4E70-251E-EE1B-58CE-32DD371BF9B7]调用[批量删除进度查询]API以查看删除进度及结果。 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": "正在批量删除。可根据asyncKey[delete_29EA4E70-251E-EE1B-58CE-32DD371BF9B7]调用[批量删除进度查询]API以查看删除进度及结果。"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	操作失败	检查入参是否填写正确，参数值是否真实存在，仍提示该信息请联系开发人员


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

