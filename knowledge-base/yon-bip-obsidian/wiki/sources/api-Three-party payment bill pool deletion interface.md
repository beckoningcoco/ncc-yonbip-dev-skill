---
title: "三方支付账单池删除接口"
apiId: "2283433167039758337"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Third-Party Bill Pool"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Third-Party Bill Pool]
platform_version: "BIP"
source_type: community-api-docs
---

# 三方支付账单池删除接口

> `ContentType	application/json` 请求方式	POST | 分类: Third-Party Bill Pool (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/EFI/revenue/threpaybill/batchDelete

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	MDD幂等

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| ids | string | 是 | 否 | 单据主键，支持单条或批量ID 示例：[1001, 1002, 1003] 最大请求量：1000 |
| source_unique | string | 是 | 否 | 来源数据唯一标识，支持单条或批量 示例：[1001, 1002, 1003] 最大请求量：1000 |
| is_expense_deleted | boolean | 否 | 否 | 是否级联删除费用报账单池，默认是false，传true会自动删除费用报账单 默认值：false |

## 3. 请求示例

Url: /yonbip/EFI/revenue/threpaybill/batchDelete?access_token=访问令牌
Body: {
	"ids": [
		1001,
		1002,
		1003
	],
	"source_unique": [
		1001,
		1002,
		1003
	],
	"is_expense_deleted": true
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| count | number |
| 小数位数:0,最大长度:10 | 否 | 数量，小数位数:0,最大长度:10 |
| successCount | number |
| 小数位数:0,最大长度:10 | 否 | 成功数，小数位数:0,最大长度:10 |
| failCount | number |
| 小数位数:0,最大长度:10 | 否 | 失败数，小数位数:0,最大长度:10 |
| messages | object | 否 | 返回消息 |
| id | string | 否 | 单据主键 |
| source_unique | string | 否 | 单据来源唯一标识 |
| message | string | 否 | 错误描述 |
| infos | object | 否 | 成功数据 |
| data | object | 否 | 成功数据体 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"count": 0,
		"successCount": 0,
		"failCount": 0,
		"messages": {
			"id": "",
			"source_unique": "",
			"message": ""
		},
		"infos": {
			"data": {
				"id": "",
				"sourceUnique": "",
				"message": ""
			}
		}
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

