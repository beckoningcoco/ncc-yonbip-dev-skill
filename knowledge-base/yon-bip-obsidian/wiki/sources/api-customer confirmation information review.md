---
title: "客户确认信息审核"
apiId: "2423116704777764873"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Customer Confirmation Information"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Customer Confirmation Information]
platform_version: "BIP"
source_type: community-api-docs
---

# 客户确认信息审核

> `ContentType	application/json` 请求方式	POST | 分类: Customer Confirmation Information (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/EFI/fiercl/recConfirmInfo/audit

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
| data | object | 否 | 否 | data |
| ids | string | 是 | 否 | 客户确认信息主表id 示例：["2422256354086354952"] |

## 3. 请求示例

Url: /yonbip/EFI/fiercl/recConfirmInfo/audit?access_token=访问令牌
Body: {
	"data": {
		"ids": [
			"2422256354086354952"
		]
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | number |
| 小数位数:0,最大长度:10 | 否 | code 示例：200 |
| message | string | 否 | message 示例：操作成功 |
| data | object | 否 | data |
| successList | string | 是 | successList |
| failNum | number |
| 小数位数:0,最大长度:10 | 否 | failNum 示例：10 |
| totalNum | number |
| 小数位数:0,最大长度:10 | 否 | totalNum 示例：10 |
| successNum | number |
| 小数位数:0,最大长度:10 | 否 | successNum 示例：0 |
| failList | object | 是 | failList |
| traceId | string | 否 | traceId 示例：0000L6YQ8AVLFUZPXD0000 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"successList": [
			""
		],
		"failNum": 10,
		"totalNum": 10,
		"successNum": 0,
		"failList": [
			{
				"code": "000056",
				"id": "1794123374243348483",
				"status": "fail",
				"errorMsg": "审核不通过，报错信息：当前单据无法审核，请检查单据状态！"
			}
		]
	},
	"traceId": "0000L6YQ8AVLFUZPXD0000"
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

