---
title: "付款申请工作台单据保存"
apiId: "4428fa2e84534f67997d0e9ef31628fb"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Payment Application Workbench"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Payment Application Workbench]
platform_version: "BIP"
source_type: community-api-docs
---

# 付款申请工作台单据保存

> `ContentType	application/json` 请求方式	POST | 分类: Payment Application Workbench (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/fi/payapplybill/save

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 否 | 是 | 付款申请工作台主表[cmp.payapplicationbill.PayApplicationBill] |
| accentity | string | 否 | 是 | 会计主体ID，或会计主体code |
| billtype | string | 否 | 是 | 单据类型(1:付款申请单) |
| tradetype | string | 否 | 是 | 交易类型id，或交易类型code |
| code | string | 否 | 是 | 单据编号 示例：CTM00210708000001 |
| vouchdate | string | 否 | 是 | 单据日期 示例：2021-07-08 00:00:00 |
| settlemode | string | 否 | 否 | 结算方式id,或结算方式编码code |
| remark | string | 否 | 否 | 备注 |
| org | string | 否 | 是 | 付款申请组织id，或付款申请组织code |
| dept | string | 否 | 否 | 部门id，或部门code |
| operator | string | 否 | 否 | 业务员id，或业务员code |
| project | string | 否 | 否 | 项目id，或项目code |
| expenseitem | string | 否 | 否 | 费用项目id，或费用项目code |
| paymentMode | string | 否 | 否 | 付款方式(注:填对应数值就可以； 1：现金，2：银行汇款) |
| proposePaymentDate | string | 否 | 否 | 付款日期 示例：2021-07-21 |
| distanceProposePaymentDateDays | int | 否 | 否 | 距付款日天数 |
| caobject | string | 否 | 是 | 付款对象(1：客户，2：供应商，3：员工，4：其他) |
| supplier | string | 否 | 否 | 收款供应商id，或收款供应商code |
| supplierbankaccount | string | 否 | 否 | 收款供应商账户ID |
| customer | string | 否 | 否 | 收款客户ID，或收款客户code |
| customerbankaccount | string | 否 | 否 | 收款客户账户ID |
| employee | string | 否 | 否 | 收款员工ID，或收款员工code |
| staffBankAccount | string | 否 | 否 | 收款员工账户ID |
| retailer | string | 否 | 否 | 收款单位名称 |
| retailerAccountName | string | 否 | 否 | 收款账户名称 |
| retailerAccountNo | string | 否 | 否 | 收款账号 |
| retailerLineNumber | string | 否 | 否 | 收款账户联行号 |
| retailerAccountType | string | 否 | 否 | 收款对象类型（1：对私，2：对公，:3：银行内部户） |
| retailerBankType | string | 否 | 否 | 收款账户银行类别ID，或收款账户银行类别code |
| currency | string | 否 | 是 | 付款币种id，或付款币种code |
| natCurrency | string | 否 | 是 | 本币币种id，或本币币种code |
| paymentApplyAmountSum | double | 否 | 是 | 付款申请金额合计 |
| unpaidAmountSum | double | 否 | 是 | 未付款金额合计 |
| sourceSystem | string | 否 | 是 | 来源系统(1：应付，2：应收，3：采购，4：现金，5：第三方，6：供应链) |
| srcitem | string | 否 | 是 | 来源事项(1：应付事项，2：收款事项，3：红字应收，4：采购订单，5：手工录入，6：采购合同) |
| upcode | string | 否 | 否 | 来源单据号或来源单据ID，用于幂等性校验，字段需唯一。 示例：2157901798756608 |
| id | string | 否 | 否 | 付款申请单ID 新增时无需填写，修改时必填 |
| headItem!* | string | 否 | 否 | 表头固定自定义项，headItem!为固定值，*需要传的自定义项字段，例如headItem!define1 示例:"headItem!define8": "111" |
| _status | string | 否 | 是 | 操作标识, Insert:新增、 Update:更新 |
| payApplicationBill_b | object | 是 | 是 | 付款申请工作台子表[cmp.payapplicationbill.PayApplicationBill_b] |

## 3. 请求示例

Url: /yonbip/fi/payapplybill/save?access_token=访问令牌
Body: {
	"data": {
		"accentity": "",
		"billtype": "",
		"tradetype": "",
		"code": "CTM00210708000001",
		"vouchdate": "2021-07-08 00:00:00",
		"settlemode": "",
		"remark": "",
		"org": "",
		"dept": "",
		"operator": "",
		"project": "",
		"expenseitem": "",
		"paymentMode": "",
		"proposePaymentDate": "2021-07-21",
		"distanceProposePaymentDateDays": 0,
		"caobject": "",
		"supplier": "",
		"supplierbankaccount": "",
		"customer": "",
		"customerbankaccount": "",
		"employee": "",
		"staffBankAccount": "",
		"retailer": "",
		"retailerAccountName": "",
		"retailerAccountNo": "",
		"retailerLineNumber": "",
		"retailerAccountType": "",
		"retailerBankType": "",
		"currency": "",
		"natCurrency": "",
		"paymentApplyAmountSum": 0,
		"unpaidAmountSum": 0,
		"sourceSystem": "",
		"srcitem": "",
		"upcode": "2157901798756608",
		"id": "",
		"headItem!*": "",
		"_status": "",
		"payApplicationBill_b": [
			{
				"id": "",
				"quickType": "",
				"org": "",
				"dept": "",
				"operator": "",
				"project": "",
				"expenseitem": "",
				"material": "",
				"issue": "",
				"contractNo": "",
				"invoiceNo": "",
				"orderNo": "",
				"remark": "",
				"paymentApplyAmount": 0,
				"sourceid": "",
				"sourceautoid": "",
				"unpaidAmount": 0,
				"bodyItem!*": "",
				"_status": ""
			}
		]
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| code | string | 否 | 返回码，调用成功时返回200 |
| message | string | 否 | 调用失败时的错误信息 |
| data | object | 否 | 调用成功时的返回数据 |
| sucessCountAI | int | 否 | 成功数量AI |
| failCountAI | int | 否 | 失败数量AI |
| count | int | 否 | 数量 |
| sucessCount | string | 否 | 成功数量 |
| failCount | string | 否 | 失败数量 |
| messages | string | 否 | 返回信息集合 |
| infos | object | 否 | 记录集合 |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"sucessCountAI": 0,
		"failCountAI": 0,
		"count": 0,
		"sucessCount": "",
		"failCount": "",
		"messages": "",
		"infos": {
			"id": "",
			"accentity": "",
			"accentity_code": "",
			"accentity_name": "",
			"vouchdate": "",
			"code": "",
			"customer": "",
			"customer_code": "",
			"customer_name": "",
			"customerbankaccount": "",
			"customerbankaccount_bankAccountName": "",
			"retailer": "",
			"tradetype": "",
			"tradetype_name": "",
			"tradetype_code": "",
			"currency": "",
			"currency_name": "",
			"currency_priceDigit": "",
			"currency_moneyDigit": "",
			"natCurrency": "",
			"natCurrency_name": "",
			"natCurrency_priceDigit": "",
			"natCurrency_moneyDigit": "",
			"org_code": "",
			"org": "",
			"org_name": "",
			"dept_code": "",
			"dept": "",
			"dept_name": "",
			"operator_code": "",
			"operator": "",
			"operator_name": "",
			"project_code": "",
			"project": "",
			"project_name": "",
			"remark": "",
			"sourceSystem": "",
			"payBillStatus": "",
			"approvalStatus": "",
			"isWfControlled": "",
			"srcitem": "",
			"busiaccbook_code": "",
			"busiaccbook": "",
			"busiaccbook_name": "",
			"billtype": "",
			"supplierbankname": "",
			"caobject": "",
			"supplier": "",
			"supplier_name": "",
			"employee": "",
			"employee_name": "",
			"paymentApplyAmountSum": 0,
			"paymentPreemptAmountSum": "",
			"paidAmountSum": "",
			"unpaidAmountSum": "",
			"creator": "",
			"createTime": "",
			"createDate": "",
			"modifier": "",
			"modifyTime": "",
			"modifyDate": "",
			"auditor": "",
			"auditTime": "",
			"auditDate": "",
			"pubts": "",
			"status": "",
			"tenant": "",
			"payApplicationBill_b": [
				{
					"mainid": "",
					"quickType": "",
					"dept": "",
					"dept_code": "",
					"org_code": "",
					"org": "",
					"org_name": "",
					"dept_name": "",
					"operator": "",
					"operator_code": "",
					"operator_name": "",
					"project": "",
					"project_code": "",
					"project_name": "",
					"orderno": "",
					"remark": "",
					"srcbillno": "",
					"srcbillitemno": "",
					"srcbillitemid": "",
					"srcbillitemmainid": "",
					"topsrcbillitemid": "",
					"topsrcbillitemmainid": "",
					"srcinvoicebillitemid": "",
					"material": "",
					"material_code": "",
					"material_name": "",
					"issue": "",
					"contractNo": "",
					"orderNo": "",
					"invoiceNo": "",
					"paymentApplyAmount": 0,
					"paymentPreemptAmount": 0,
					"paidAmount": 0,
					"unpaidAmount": 0,
					"id": "",
					"pubts": "",
					"expenseitem": "",
					"expenseitem_code": "",
					"expenseitem_name": ""
				}
			]
		}
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	付款申请金额不能小于等于0	调整付款申请金额大于0


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

