---
title: "营收立账事项查询接口"
apiId: "2278255961921028104"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Document Entry and Management Event of Operating Revenue"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Document Entry and Management Event of Operating Revenue]
platform_version: "BIP"
source_type: community-api-docs
---

# 营收立账事项查询接口

> `ContentType	application/json` 请求方式	POST | 分类: Document Entry and Management Event of Operating Revenue (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/EFI/revenue/billQuery/queryAccountBill

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

Url: /yonbip/EFI/revenue/billQuery/queryAccountBill?access_token=访问令牌
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
| code | string | 否 | 状态码 成功：200；失败：失败状态码； 示例：200 |
| message | string | 否 | 返回信息 若失败，则返回失败原因； 若成功，则返回查询成功； 若为空，则返回查询数据为空； 示例：查询成功 |
| data | object | 否 | 返回数据 |
| pagecount | number |
| 小数位数:0,最大长度:10 | 否 | 总行数 总返回记录行数 示例：100 |
| pageindex | number |
| 小数位数:0,最大长度:10 | 否 | 页码 第几页 示例：1 |
| recordcount | number |
| 小数位数:0,最大长度:10 | 否 | 处理行数 当前页的总条数 示例：10 |
| beginpageindex | number |
| 小数位数:0,最大长度:10 | 否 | 开始页码 开始 示例：1 |
| endpageindex | number |
| 小数位数:0,最大长度:10 | 否 | 结束页码 示例：10 |
| pagesize | number |
| 小数位数:0,最大长度:10 | 否 | 分页大小 每页行数 示例：10 |
| recordlist | object | 是 | 业务数据 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "查询成功",
	"data": {
		"pagecount": 100,
		"pageindex": 1,
		"recordcount": 10,
		"beginpageindex": 1,
		"endpageindex": 10,
		"pagesize": 10,
		"recordlist": [
			{
				"batch_no": "20250528001",
				"id": "1594672068154097667",
				"code": "BILL_001",
				"finance_org": "ORG_001",
				"finance_org_code": "CODE_001",
				"finance_org_name": "集团公司",
				"bill_date": "2025-05-28",
				"oa_date": "2025-05-28",
				"bustype": "TYPE_CODE_001",
				"bustype_name": "销售交易",
				"sales_org": "SALES_ORG_001",
				"sales_org_id_code": "SALES_CODE_001",
				"sales_org_id_name": "华东销售部",
				"dept": "DEPT_001",
				"dept_code": "DEPT_CODE_001",
				"dept_name": "行政部",
				"store": "STORE_001",
				"store_code": "STORE_CODE_001",
				"store_name": "XX旗舰店",
				"staff": "USER_001",
				"staff_code": "EMP_CODE_001",
				"staff_name": "张三",
				"object_type": "1",
				"vendor": "VENDOR_001",
				"vendor_code": "VENDOR_CODE_001",
				"vendor_name": "供应商A",
				"customer": "CUSTOMER_001",
				"customer_code": "CUSTOMER_CODE_001",
				"customer_name": "客户A",
				"employee": "EMPLOYEE_001",
				"employee_code": "EMPLOYEE_CODE_001",
				"employee_name": "李四",
				"sales_channel": "CHANNEL_001",
				"sales_channel_code": "CHANNEL_CODE_001",
				"sales_channel_name": "线上渠道",
				"payment_channel": "PAY_CHANNEL_001",
				"payment_channel_code": "PAY_CODE_001",
				"payment_channel_name": "支付宝",
				"bill_direction": "收入",
				"ori_currency": "CNY",
				"ori_currency_code": "CNY",
				"ori_currency_name": "人民币",
				"ori_tax_included_amount": "10000.00",
				"contract_code": "CONTRACT_001",
				"business_order_number": "BUSI_001",
				"bln_write_off": "N",
				"write_off_state": "0",
				"post_status": "已过账",
				"remarks": "无",
				"src_system_code": "ERP",
				"ytenantId": "TENANT_001",
				"pubts": "2025-05-28 12:34:56",
				"creator": "USER_001",
				"createTime": "2025-05-28 12:34:56",
				"creator_userName": "张三",
				"rev_account_bill_b": [
					{
						"id": "SUB_1594672068154097667",
						"dept": "DEPT_001",
						"dept_code": "DEPT_CODE_001",
						"dept_name": "行政部",
						"staff": "USER_001",
						"staff_code": "EMP_CODE_001",
						"staff_name": "张三",
						"expense_item": "EXPENSE_001",
						"expense_item_code": "EXPENSE_CODE_001",
						"expense_item_name": "差旅费",
						"material": "MATERIAL_001",
						"material_code": "MATERIAL_CODE_001",
						"material_name": "电脑",
						"material_category": "CATEGORY_001",
						"material_category_code": "CATEGORY_CODE_001",
						"material_category_name": "电子产品",
						"ori_currency": "CNY",
						"ori_currency_name": "人民币",
						"ori_tax_excluded_amount": "8547.01",
						"ori_tax_included_amount": "10000.00",
						"ori_tax_included_price": "100.00",
						"quantity": "100",
						"tax_subject": "TAX_001",
						"tax_subject_name": "销售货物",
						"tax_rate": "0.13",
						"ori_tax_amount": "1452.99",
						"unit": "UNIT_001",
						"unit_name": "台",
						"bln_package": "N",
						"invoice_type": "增值税专用发票",
						"invoice_number": "12345678",
						"invoice_code": "1100194130",
						"invoice_date": "2025-05-28",
						"contract_code": "CONTRACT_001",
						"src_bill_code": "SRC_001",
						"src_bill_id": "SRC_ID_001",
						"src_bill_child_id": "SRC_CHILD_001",
						"src_bill_type": "销售订单"
					}
				],
				"rev_account_bill_pay": [
					{
						"id": "PAY_1594672068154097667",
						"pay_amt": "10000.00",
						"pay_date": "2025-05-28",
						"payment_channel": "PAY_CHANNEL_001",
						"payment_channel_code": "PAY_CODE_001",
						"payment_channel_name": "支付宝"
					}
				]
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

