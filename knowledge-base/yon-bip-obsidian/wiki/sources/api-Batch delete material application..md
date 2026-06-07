---
title: "物料申请单批量删除"
apiId: "2196370718183129092"
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

# 物料申请单批量删除

> `ContentType	application/json` 请求方式	POST | 分类: Material (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/productapply/batchdelete

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	批量删除

事务和幂等性	MDD幂等

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 是 | 否 | 请求体 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| id | string | 否 | 否 | 主键（id与编码同时填入时已id为准） 示例：2149120674867183618 |
| applyCode | string | 否 | 否 | 申请单编码（id与编码同时填入时已id为准） 示例：WLXZ001 |

## 3. 请求示例

Url: /yonbip/digitalModel/productapply/batchdelete?access_token=访问令牌
Body: {
	"data": [
		{
			"resubmitCheckKey": "",
			"id": "2149120674867183618",
			"applyCode": "WLXZ001"
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，成功时为200 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 异步进度查询 |
| count | number |
| 小数位数:0,最大长度:10 | 否 | 总数 示例：2 |
| successCount | number |
| 小数位数:0,最大长度:10 | 否 | 成功数量 示例：1 |
| failCount | number |
| 小数位数:0,最大长度:10 | 否 | 失败数量 示例：1 |
| messages | object | 是 | 失败信息 |
| infos | object | 是 | 成功信息 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"count": 2,
		"successCount": 1,
		"failCount": 1,
		"messages": [
			{
				"message": "删除失败"
			}
		],
		"infos": [
			{}
		]
	}
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

