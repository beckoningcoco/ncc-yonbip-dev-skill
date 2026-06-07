---
title: "语义模型-获取模型列表_报表平台"
apiId: "2320540739582296066"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Report Platform"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Report Platform]
platform_version: "BIP"
source_type: community-api-docs
---

# 语义模型-获取模型列表_报表平台

> `ContentType	application/json` 请求方式	GET | 分类: Report Platform (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/CPC/semantic/v1/list_copy_report

请求方式	GET

ContentType	application/json

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| domain | string | query | 否 | 领域编码，一般和应用编码配套使用，非必须    示例: HR |
| appCode | string | query | 否 | 应用编码，非必输，和领域编码配套使用    示例: HROTD |

## 3. 请求示例

Url: /yonbip/CPC/semantic/v1/list_copy_report?access_token=访问令牌&domain=HR&appCode=HROTD

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 编码 示例：200 |
| message | string | 否 | 提示信息 示例：操作成功 |
| data | object | 否 | 数据结构 |
| status | int | 否 | 执行状态码 示例：1 |
| msg | string | 否 | 执行信息 示例：SUCCESS |
| data | object | 是 | 返回结果 |
| detail | string | 否 | 详细错误信息 示例：null |
| errorStack | object | 是 | 错误堆栈信息 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"status": 1,
		"msg": "SUCCESS",
		"data": [
			{
				"code": "HCM_TA_001",
				"domain": "HR",
				"codeName": "休假模型",
				"label": "休假模型",
				"appCode": "HRODT",
				"id": "12afd8e4-cf73-4742-818e-05b04df28a8f"
			}
		],
		"detail": "null",
		"errorStack": [
			{}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

500	服务器异常	检查智能分析服务是否正常


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

