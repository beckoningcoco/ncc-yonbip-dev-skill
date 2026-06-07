---
title: "物料分类删除"
apiId: "ea9ae936432a4cc2a345f18f7558dfa1"
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

# 物料分类删除

> `ContentType	application/json` 请求方式	POST | 分类: Material Category (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/productclass/delete

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	单条删除

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 否 | 是 | 物料数据 |
| code | string | 否 | 是 | 物料分类code 示例：112233 |

## 3. 请求示例

Url: /yonbip/digitalModel/productclass/delete?access_token=访问令牌
Body: {
	"data": {
		"code": "112233"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 请求结果状态码 示例：200 |
| message | string | 否 | 请求结果信息 示例：操作成功 |
| data | object | 否 | 请求结果数据 |
| count | long | 否 | 本次选择记录数 示例：1 |
| sucessCount | long | 否 | 成功记录数 示例：1 |
| messages | string | 是 | 失败原因列表 示例：["编码[code]不存在"] |
| infos | string | 是 | 异步执行成功后，返回信息 示例：["操作成功"] |
| failCount | object | 是 | 失败记录数 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"messages": [
			"编码[code]不存在"
		],
		"infos": [
			"操作成功"
		],
		"failCount": [
			{
				"code": "00001",
				"id": 2502148054667520,
				"message": "物料分类 已被如下实体/属性引用: 商品分类/物料分类,物料/物料分类"
			}
		]
	}
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

