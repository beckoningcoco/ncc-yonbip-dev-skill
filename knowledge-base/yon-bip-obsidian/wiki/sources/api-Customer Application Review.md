---
title: "客户申请单审核"
apiId: "1639042619377451017"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Customer"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Customer]
platform_version: "BIP"
source_type: community-api-docs
---

# 客户申请单审核

> `ContentType	application/json` 请求方式	POST | 分类: Customer (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/customerApply/auditByCode

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
| codeList | object | 是 | 是 | 申请单列表 |
| code | string | 否 | 是 | 申请编码 示例：202302010001071 |
| effectTime | string | 否 | 是 | 生效时间 示例：2023-02-02 10:32:00 |

## 3. 请求示例

Url: /yonbip/digitalModel/customerApply/auditByCode?access_token=访问令牌
Body: {
	"codeList": [
		{
			"code": "202302010001071",
			"effectTime": "2023-02-02 10:32:00"
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 状态码 示例：200 |
| message | string | 否 | 请求结果信息 示例：操作成功 |
| data | object | 否 | 请求返回的数据 |
| count | long | 否 | 总数 示例：3 |
| sucessCount | long | 否 | 成功数 示例：1 |
| failCount | long | 否 | 失败数 示例：2 |
| messages | object | 是 | 请求提示信息 |
| infos | object | 是 | 申请单列表 |
| failInfos | object | 是 | 审核失败列表 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"count": 3,
		"sucessCount": 1,
		"failCount": 2,
		"messages": [
			{}
		],
		"infos": [
			{
				"applyType": 0,
				"verifystate": 2,
				"applicationOrg_Name": "宝可梦宇宙aa",
				"creator": "yonyou2023",
				"bizOperator_Name": "test12",
				"applyDepartment_Name": "由基拉",
				"effectType": 0,
				"id": 1639041055893487621,
				"applyCode": "20230118000306000000",
				"status": 1,
				"auditor": "默认用户",
				"auditorId": 1525641755939569666
			}
		],
		"failInfos": [
			{
				"id": 1639019254639493128,
				"message": "已审核"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	服务端逻辑异常	检查入参是否填写正确


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

