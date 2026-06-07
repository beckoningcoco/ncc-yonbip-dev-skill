---
title: "费用立账事项查询接口"
apiId: "2278259037117612037"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Document Entry and Management Event of Expense"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Document Entry and Management Event of Expense]
platform_version: "BIP"
source_type: community-api-docs
---

# 费用立账事项查询接口

> `ContentType	application/json` 请求方式	POST | 分类: Document Entry and Management Event of Expense (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/EFI/revenue/billQuery/queryExpenseClaimBill

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
| pageindex | number |
| 小数位数:0,最大长度:10 | 否 | 是 | 页号 示例：1 |
| pagesize | number |
| 小数位数:0,最大长度:10 | 否 | 是 | 每页行数 示例：20 |
| finance_org_id | string | 是 | 是 | 会计主体，会计主体编码，支持传入多个值 示例：[1525652227072458756] |
| start_date | date |
| 格式:yyyy-MM-dd | 否 | 是 | 单据开始日期，格式为：YYYY-MM-DD 示例：2025-05-28 |
| end_date | date |
| 格式:yyyy-MM-dd | 否 | 是 | 单据结束日期，格式为：YYYY-MM-DD 示例：2025-05-28 |
| oa_batch_no | string | 否 | 否 | 立账批次号，为空，返回所有批次立账数据 示例：001 |

## 3. 请求示例

Url: /yonbip/EFI/revenue/billQuery/queryExpenseClaimBill?access_token=访问令牌
Body: {
	"pageindex": 1,
	"pagesize": 20,
	"finance_org_id": [
		1525652227072458756
	],
	"start_date": "2025-05-28",
	"end_date": "2025-05-28",
	"oa_batch_no": "001"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 状态码 指请求响应成功：成功：200；失败：失败状态码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| pagecount | number |
| 小数位数:0,最大长度:10 | 否 | 总行数 示例：100 |
| pageindex | number |
| 小数位数:0,最大长度:10 | 否 | 页码 示例：1 |
| endpageindex | number |
| 小数位数:0,最大长度:10 | 否 | 结束页码 示例：10 |
| recordcount | number |
| 小数位数:0,最大长度:10 | 否 | 处理行数 示例：10 |
| beginpageindex | number |
| 小数位数:0,最大长度:10 | 否 | 开始页码 示例：1 |
| pagesize | number |
| 小数位数:0,最大长度:10 | 否 | 分页大小 示例：10 |
| recordlist | object | 是 | 业务数据 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pagecount": 100,
		"pageindex": 1,
		"endpageindex": 10,
		"recordcount": 10,
		"beginpageindex": 1,
		"pagesize": 10,
		"recordlist": [
			{
				"batch_no": "20250528001",
				"id": "1594672068154097667",
				"finance_org_id": "ORG_001",
				"finance_org_id_code": "CODE_001",
				"finance_org_id_name": "集团公司",
				"code": "BILL_001",
				"bill_date": "2025-05-28",
				"oa_date": "2025-05-28",
				"bustype": "TYPE_001",
				"bustype_code": "TYPE_CODE_001",
				"bustype_name": "销售交易",
				"sales_org_id": "SALES_ORG_001",
				"sales_org_id_code": "SALES_CODE_001",
				"sales_org_id_name": "华东销售部",
				"sales_channel_id": "CHANNEL_001",
				"sales_channel_id_code": "CHANNEL_CODE_001",
				"sales_channel_id_name": "线上渠道",
				"payment_channel_id": "PAY_CHANNEL_001",
				"payment_channel_id_code": "PAY_CODE_001",
				"payment_channel_id_name": "支付宝",
				"busi_date": "2025-05-28",
				"merchant_order_no": "MO_20250528001",
				"pay_serial_no": "PS_20250528001",
				"biz_type": "0",
				"expense_type_id": "EXPENSE_TYPE_001",
				"expense_type_id_code": "EXPENSE_CODE_001",
				"expense_type_id_name": "办公费用",
				"expense_project_id": "PROJECT_001",
				"expense_project_id_code": "PROJECT_CODE_001",
				"expense_project_id_name": "差旅费",
				"expense_amt": "1000.00",
				"tax_rate_id": "TAX_RATE_001",
				"tax_rate_id_code": "TAX_CODE_001",
				"tax_rate_id_name": "增值税",
				"tax_rate": "6.00",
				"tax_exclusive_amt": "943.40",
				"currency_id": "CNY",
				"currency_id_code": "CNY",
				"currency_id_name": "人民币",
				"merchant_no": "MERCHANT_001",
				"store_id": "STORE_001",
				"store_id_code": "STORE_CODE_001",
				"store_id_name": "XX旗舰店",
				"expense_departmen_id": "DEPT_001",
				"expense_department_id_code": "DEPT_CODE_001",
				"expense_department_id_name": "行政部",
				"post_status": "已过账",
				"ytenantId": "",
				"pubts": "2025-05-28 12:34:56",
				"creator": "USER_001",
				"creator_userName": "张三",
				"createTime": "2025-05-28 12:34:56"
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

