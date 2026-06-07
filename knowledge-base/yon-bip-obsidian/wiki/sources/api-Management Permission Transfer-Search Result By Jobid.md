---
title: "管理权移交-根据任务主键查询结果"
apiId: "2392476012947963910"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Management Permission Transfer Card"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Management Permission Transfer Card]
platform_version: "BIP"
source_type: community-api-docs
---

# 管理权移交-根据任务主键查询结果

> `ContentType	application/json` 请求方式	GET | 分类: Management Permission Transfer Card (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/PFC/transfermc/api/getTaskStatus/{taskId}

请求方式	GET

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| taskId | string | path | 是 | 任务ID    示例: 2388392745345 |

## 3. 请求示例

Url: /yonbip/PFC/transfermc/api/getTaskStatus/2388392745345?access_token=访问令牌

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | number |
| 小数位数:0,最大长度:10 | 否 | 返回码，调用成功是返回200 示例：200 |
| data | object | 否 | 调用成功时的返回数据 |
| totalCount | number |
| 小数位数:0,最大长度:10 | 否 | 总数 示例：10 |
| successCount | number |
| 小数位数:0,最大长度:10 | 否 | 成功总数 示例：9 |
| failCount | number |
| 小数位数:0,最大长度:10 | 否 | 失败总数 示例：1 |
| status | string | 否 | 状态码 . 1:成功; 0 :失败 ;2 :待处理 ;3 :处理中 示例：0 |
| messages | number |
| 小数位数:0,最大长度:1 | 否 | 消息 示例：操作成功 |

## 5. 正确返回示例

{
	"code": 200,
	"data": {
		"totalCount": 10,
		"successCount": 9,
		"failCount": 1,
		"status": "0"
	},
	"messages": NaN
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

