---
title: "租入结算审批生成应付单_资产混合云"
apiId: "2284819788615647238"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Lease-in Settlement Document"
domain: "GAM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Lease-in Settlement Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 租入结算审批生成应付单_资产混合云

>  请求方式	POST | Lease-in Settlement Document (GAM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/am/yingfu/save
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
id	string	否	否	主键
pk_fiorg	string	否	否	出租会计主体
pk_raorg	string	否	否	出租利润中心
customer_out	string	否	否	出租方
transi_type	string	否	否	交易类型
bill_type	string	否	否	单据类型
origcurrtypeid	string	否	否	币种
account_days	date
格式:yyyy-MM-dd HH:mm:ss	否	否	结算日期
pk_recorder	string	否	否	经办人
currrate	number
小数位数:8,最大长度:20	否	否	汇率
currrate_date	date
格式:yyyy-MM-dd HH:mm:ss	否	否	汇率日期
currrate_type	string	否	否	组织汇率类型
project	string	否	否	项目
audittime	date
格式:yyyy-MM-dd HH:mm:ss	否	否	审批时间
auditor	string	否	否	审批人
card_pay_detaile	object	是	否	租出明细
id	string	否	否	租金明细id
gather_money_currency	number
小数位数:8,最大长度:20	否	否	本币租金金额
gather_money	number
小数位数:8,最大长度:20	否	否	租金金额
notaxlgather_money	number
小数位数:8,最大长度:20	否	否	无税租金金额
notaxlgather_money_currency	number
小数位数:8,最大长度:20	否	否	本币无税租金金额
notaxpayment_amount_currency	number
小数位数:8,最大长度:20	否	否	本币无税收款金额
contract_bill_code	string	否	否	合同编码
contract_id	string	否	否	合同id
equip_code	string	否	否	资产编码
card_pay_cost	object	是	否	费用明细
id	string	否	否	费用明细id
total_cost_amount_currency	number
小数位数:8,最大长度:20	否	否	本币费用金额
expense_amount	number
小数位数:8,最大长度:20	否	否	费用金额
total_cost_amount_tax_currency	number
小数位数:8,最大长度:20	否	否	本币税额
notaxtotal_cost_amount_currency	number
小数位数:8,最大长度:20	否	否	本币无税费用金额
notaxtotal_cost_amount	number
小数位数:8,最大长度:20	否	否	无税费用金额
contract_bill_code	string	否	否	合同编码
contract_id	string	否	否	合同id
equip_code	string	否	否	资产编码
card_payment_settlement	object	是	否	赔偿金明细
id	string	否	否	赔偿金明细id
compensation_money_currency	number
小数位数:8,最大长度:20	否	否	本币赔偿金
compensation_money	number
小数位数:8,最大长度:20	否	否	赔偿金
compensation_money_tax_currency	number
小数位数:8,最大长度:20	否	否	本币赔偿金税额
notaxcompensation_money_currency	number
小数位数:8,最大长度:20	否	否	本币无税赔偿金
notaxcompensation_money	number
小数位数:8,最大长度:20	否	否	无税赔偿金
contract_bill_code	string	否	否	合同编码
contract_id	string	否	否	合同id
equip_code	string	否	否	资产编码

## 3. 请求示例

Url: /yonbip/am/yingfu/save?access_token=访问令牌
Body: {
	"id": "",
	"pk_fiorg": "",
	"pk_raorg": "",
	"customer_out": "",
	"transi_type": "",
	"bill_type": "",
	"origcurrtypeid": "",
	"account_days": "2026-06-07 13:23:12",
	"pk_recorder": "",
	"currrate": 0,
	"currrate_date": "2026-06-07 13:23:12",
	"currrate_type": "",
	"project": "",
	"audittime": "2026-06-07 13:23:12",
	"auditor": "",
	"card_pay_detaile": [
		{
			"id": "",
			"gather_money_currency": 0,
			"gather_money": 0,
			"notaxlgather_money": 0,
			"notaxlgather_money_currency": 0,
			"notaxpayment_amount_currency": 0,
			"contract_bill_code": "",
			"contract_id": "",
			"equip_code": ""
		}
	],
	"card_pay_cost": [
		{
			"id": "",
			"total_cost_amount_currency": 0,
			"expense_amount": 0,
			"total_cost_amount_tax_currency": 0,
			"notaxtotal_cost_amount_currency": 0,
			"notaxtotal_cost_amount": 0,
			"contract_bill_code": "",
			"contract_id": "",
			"equip_code": ""
		}
	],
	"card_payment_settlement": [
		{
			"id": "",
			"compensation_money_currency": 0,
			"compensation_money": 0,
			"compensation_money_tax_currency": 0,
			"notaxcompensation_money_currency": 0,
			"notaxcompensation_money": 0,
			"contract_bill_code": "",
			"contract_id": "",
			"equip_code": ""
		}
	]
}

## 4. 返回值参数

名称	类型	数组	描述
billtype	string	否	事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、
creator	string	否	创建人
creator	string	否	创建人
displayCode	string	否	异常码
displayCode	string	否	异常码
message	string	否	信息 示例：操作成功
data	string	否	响应信息
salesOrgId	string	否	销售组织id
saleDepartmentId	string	否	销售部门id
transactionTypeId	string	否	交易类型id
settlementOrgId	string	否	开票组织id
bizId	string	否	商家id
createDate	string	否	创建时间
synSourceOrg	string	否	协同来源组织id
ecsuiteuser	string	否	气泡联系人
ecsuiteuser	string	否	气泡联系人
billtype	string	否	事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、
creator	string	否	创建人
displayCode	string	否	异常码
message	string	否	信息 示例：操作成功
data	string	否	响应信息
icaConfirmTime	DateTime	否	确认时间 示例：2022-09-26 00:00:00
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
code	string	否	单据编号
code	string	否	单据编号
message	string	否	message 示例：操作成功
data	object	否	data
successOrder	object	是	successOrder
failedOrder	object	是	failedOrder
failCount	number
小数位数:0,最大长度:10	否	failCount 示例：1
successCount	number
小数位数:0,最大长度:10	否	successCount 示例：1
count	number
小数位数:0,最大长度:10	否	count 示例：2
qms_qit_incominspectorder_sourcelistList	object	是	源单信息
product_name	string	否	物料名称 示例：Rachel物料3
message	string	否	返回信息 示例：操作成功！
data	object	否	返回数据
pageIndex	long	否	页码 示例：1
pageSize	long	否	每条页数 示例：2
recordCount	long	否	记录数 示例：5
recordList	object	是	返回数据
beginPageIndex	long	否	起始页 示例：1
endPageIndex	long	否	结束页 示例：2
pageCount	long	否	页数 示例：1
id	string	否	主键
pk_fiorg	string	否	出租会计主体
pk_raorg	string	否	出租利润中心
customer_out	string	否	出租方
transi_type	string	否	交易类型
bill_type	string	否	单据类型
origcurrtypeid	string	否	币种
account_days	date
格式:yyyy-MM-dd HH:mm:ss	否	结算日期
pk_recorder	string	否	经办人
currrate	number
小数位数:8,最大长度:20	否	汇率
currrate_date	date
格式:yyyy-MM-dd HH:mm:ss	否	汇率日期
currrate_type	string	否	组织汇率类型
project	string	否	项目
audittime	date
格式:yyyy-MM-dd HH:mm:ss	否	审批时间
auditor	string	否	审批人
card_pay_detaile	object	是	租出明细
id	string	否	租金明细id
gather_money_currency	number
小数位数:8,最大长度:20	否	本币租金金额
gather_money	number
小数位数:8,最大长度:20	否	租金金额
notaxlgather_money	number
小数位数:8,最大长度:20	否	无税租金金额
notaxlgather_money_currency	number
小数位数:8,最大长度:20	否	本币无税租金金额
notaxpayment_amount_currency	number
小数位数:8,最大长度:20	否	本币无税收款金额
contract_bill_code	string	否	合同编码
contract_id	string	否	合同id
equip_code	string	否	资产编码
card_pay_cost	object	是	费用明细
id	string	否	费用明细id
total_cost_amount_currency	number
小数位数:8,最大长度:20	否	本币费用金额
expense_amount	number
小数位数:8,最大长度:20	否	费用金额
total_cost_amount_tax_currency	number
小数位数:8,最大长度:20	否	本币税额
notaxtotal_cost_amount_currency	number
小数位数:8,最大长度:20	否	本币无税费用金额
notaxtotal_cost_amount	number
小数位数:8,最大长度:20	否	无税费用金额
contract_bill_code	string	否	合同编码
contract_id	string	否	合同id
equip_code	string	否	资产编码
card_payment_settlement	object	是	赔偿金明细
id	string	否	赔偿金明细id
compensation_money_currency	number
小数位数:8,最大长度:20	否	本币赔偿金
compensation_money	number
小数位数:8,最大长度:20	否	赔偿金
compensation_money_tax_currency	number
小数位数:8,最大长度:20	否	本币赔偿金税额
notaxcompensation_money_currency	number
小数位数:8,最大长度:20	否	本币无税赔偿金
notaxcompensation_money	number
小数位数:8,最大长度:20	否	无税赔偿金
contract_bill_code	string	否	合同编码
contract_id	string	否	合同id
equip_code	string	否	资产编码

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"id": "",
		"pk_fiorg": "",
		"pk_raorg": "",
		"customer_out": "",
		"transi_type": "",
		"bill_type": "",
		"origcurrtypeid": "",
		"account_days": "2026-06-07 13:23:12",
		"pk_recorder": "",
		"currrate": 0,
		"currrate_date": "2026-06-07 13:23:12",
		"currrate_type": "",
		"project": "",
		"audittime": "2026-06-07 13:23:12",
		"auditor": "",
		"card_pay_detaile": [
			{
				"id": "",
				"gather_money_currency": 0,
				"gather_money": 0,
				"notaxlgather_money": 0,
				"notaxlgather_money_currency": 0,
				"notaxpayment_amount_currency": 0,
				"contract_bill_code": "",
				"contract_id": "",
				"equip_code": ""
			}
		],
		"card_pay_cost": [
			{
				"id": "",
				"total_cost_amount_currency": 0,
				"expense_amount": 0,
				"total_cost_amount_tax_currency": 0,
				"notaxtotal_cost_amount_currency": 0,
				"notaxtotal_cost_amount": 0,
				"contract_bill_code": "",
				"contract_id": "",
				"equip_code": ""
			}
		],
		"card_payment_settlement": [
			{
				"id": "",
				"compensation_money_currency": 0,
				"compensation_money": 0,
				"compensation_money_tax_currency": 0,
				"notaxcompensation_money_currency": 0,
				"notaxcompensation_money": 0,
				"contract_bill_code": "",
				"contract_id": "",
				"equip_code": ""
			}
		]
	}
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
0	未传入优惠券档案id	coupon_id值填写有误
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

