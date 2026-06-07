---
title: "附件批量删除"
apiId: "2095595151842869253"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Reimbursement"
domain: "ZNBZ"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Reimbursement]
platform_version: "BIP"
source_type: community-api-docs
---

# 附件批量删除

> `ContentType	application/json` 请求方式	POST | 分类: Reimbursement (ZNBZ)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/znbz/rbsm/api/attach/attachBatchDelete

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	MDD幂等

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| attachmentAss | string | 否 | 是 | 单据附件id 示例：aMvMBEUfMIJgy3q2zOPict9HrcbFH9ci |
| fileDataList | string | 是 | 是 | 所删除文件id 示例：["66f21ed2c364f1452261e68b","66f21ed3c364f1452261e6b9"] |

## 3. 请求示例

Url: /yonbip/znbz/rbsm/api/attach/attachBatchDelete?access_token=访问令牌
Body: {
	"attachmentAss": "aMvMBEUfMIJgy3q2zOPict9HrcbFH9ci",
	"fileDataList": [
		"66f21ed2c364f1452261e68b",
		"66f21ed3c364f1452261e6b9"
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| code | number |
| 小数位数:0,最大长度:10 | 否 | 方法返回的状态码，一般200指操作成功 示例：200 |
| message | string | 否 | 方法执行结果信息 示例：操作成功 |
| data | object | 否 | 方法返回数据 |
| result | string | 否 | 结果 示例：success |
| code | string | 否 | 方法状态码 示例：200 |
| message | string | 否 | 方法执行结果 示例：操作成功 |
| traceId | string | 否 | traceId 示例：eef6b6bf2afff4f9 |
| uploadable | string | 否 | uploadable 示例：0 |

## 5. 正确返回示例

{
	"displayCode": "",
	"code": 200,
	"message": "操作成功",
	"data": {
		"result": "success",
		"code": "200",
		"message": "操作成功"
	},
	"traceId": "eef6b6bf2afff4f9",
	"uploadable": "0"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-11

更新

请求说明

新增

返回参数 displayCode


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

