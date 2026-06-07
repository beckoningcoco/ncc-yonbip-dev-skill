---
title: "物料申请单批量提交"
apiId: "2425147786219487238"
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

# 物料申请单批量提交

> `ContentType	application/json` 请求方式	POST | 分类: Material (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/PFC/productapply/batchsubmit

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	其他

事务和幂等性	MDD幂等

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 是 | 否 | 请求体 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| id | string | 否 | 否 | 申请单id（id与编码同时填入时，已id为准） 示例：2425092707544203272 |
| applyCode | string | 否 | 否 | 申请单编码（id与编码同时填入时，已id为准） 示例：WLXZ000013 |

## 3. 请求示例

Url: /yonbip/PFC/productapply/batchsubmit?access_token=访问令牌
Body: {
	"data": [
		{
			"resubmitCheckKey": "",
			"id": "2425092707544203272",
			"applyCode": "WLXZ000013"
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，成功时为200 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 返回结果 |
| count | number |
| 小数位数:0,最大长度:10 | 否 | 总数 示例：2 |
| successCount | number |
| 小数位数:0,最大长度:10 | 否 | 成功总数 示例：1 |
| failCount | number |
| 小数位数:0,最大长度:10 | 否 | 失败总数 示例：1 |
| messages | object | 是 | 错误数据列表 |
| infos | object | 是 | 成功数据列表 |

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
				"message": ""
			}
		],
		"infos": [
			{
				"id": 2425092707544203272,
				"applyCode": "WLXZ000013"
			}
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

