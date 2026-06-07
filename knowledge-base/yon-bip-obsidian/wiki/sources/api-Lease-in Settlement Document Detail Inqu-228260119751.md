---
title: "租入结算单详情查询"
apiId: "2282601197512687624"
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

# 租入结算单详情查询

>  请求方式	POST | Lease-in Settlement Document (GAM)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/am/rentinsettlementcard/detail
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	详情查询
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
id	string	否	是	租入结算单主表主键 示例：123456789

## 3. 请求示例

Url: /yonbip/am/rentinsettlementcard/detail?access_token=访问令牌
Body: {
	"id": "123456789"
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
code	number
小数位数:0,最大长度:10	否	code 示例：200
message	string	否	message 示例：操作成功！
data	object	否	data
pk_recorder	string	否	pk_recorder 示例：2091771050461757445
notaxsettlement_rent_sum_currency	number
小数位数:0,最大长度:10	否	notaxsettlement_rent_sum_currency 示例：1014
settlement_money_sum_currency	number
小数位数:0,最大长度:10	否	settlement_money_sum_currency 示例：1042
notaxsettlement_other_sum_currency	number
小数位数:0,最大长度:10	否	notaxsettlement_other_sum_currency 示例：24
synergy	boolean	否	synergy 示例：false
currrate_type__digit	number
小数位数:0,最大长度:10	否	currrate_type__digit 示例：6
pk_recorder_date	string	否	pk_recorder_date 示例：2025-06-03
settlement_cost_sum_tax	number
小数位数:0,最大长度:10	否	settlement_cost_sum_tax 示例：0
customer_out__name	string	否	customer_out__name 示例：散户
pk_org	string	否	pk_org 示例：2091769779160350723
notaxsettlement_other_sum	number
小数位数:0,最大长度:10	否	notaxsettlement_other_sum 示例：24
notaxsettlement_rent_sum	number
小数位数:0,最大长度:10	否	notaxsettlement_rent_sum 示例：1014
pk_transitype	string	否	pk_transitype 示例：2084475473001185293
auto_settlement	boolean	否	auto_settlement 示例：false
payable_withholding_tax	number
小数位数:0,最大长度:10	否	payable_withholding_tax 示例：1
settlement_money_sum_tax_currency	number
小数位数:0,最大长度:10	否	settlement_money_sum_tax_currency 示例：0
currrate_type	string	否	currrate_type 示例：0000M0UNBGU65MDR0L0000
notaxsettlement_money_sum	number
小数位数:0,最大长度:10	否	notaxsettlement_money_sum 示例：1042
bill_type	string	否	bill_type 示例：4A3E
pk_fiorg__code	string	否	pk_fiorg__code 示例：HT001
id	string	否	id 示例：2282607322297008129
settlement_rent_sum_tax	number
小数位数:0,最大长度:10	否	settlement_rent_sum_tax 示例：0
creator__name	string	否	creator__name 示例：G.Haitao
pk_currency__priceDigit	number
小数位数:0,最大长度:10	否	pk_currency__priceDigit 示例：3
payment_settlement	object	是	payment_settlement
pay_detail	object	是	pay_detail
pk_currency__name	string	否	pk_currency__name 示例：人民币
settlement_rent_sum_tax_currency	number
小数位数:0,最大长度:10	否	settlement_rent_sum_tax_currency 示例：0
pk_currency	string	否	pk_currency 示例：2084475361311588412
audittime	string	否	audittime 示例：2025-06-03 14:01:11
sysid	string	否	sysid 示例：LIM
origcurrtypeid	string	否	origcurrtypeid 示例：2084475361311588412
isWfControlled	boolean	否	isWfControlled 示例：false
pk_org__name	string	否	pk_org__name 示例：HT资产组织
pk_transitype__name	string	否	pk_transitype__name 示例：租入结算单
deposit_deduction_amount	number
小数位数:0,最大长度:10	否	deposit_deduction_amount 示例：10
pay_cost	object	是	pay_cost
settlement_cost_sum_tax_currency	number
小数位数:0,最大长度:10	否	settlement_cost_sum_tax_currency 示例：0
settlement_cost_sum_currency	number
小数位数:0,最大长度:10	否	settlement_cost_sum_currency 示例：4
billmaker__name	string	否	billmaker__name 示例：G.Haitao
contract_way	number
小数位数:0,最大长度:10	否	contract_way 示例：0
account_days	string	否	account_days 示例：2025-06-03
received_payment_amount	number
小数位数:2,最大长度:10	否	received_payment_amount 示例：176.99
need_payment_amount	number
小数位数:0,最大长度:10	否	need_payment_amount 示例：0
pk_recorder__name	string	否	pk_recorder__name 示例：HTRENT
billmaker	string	否	billmaker 示例：01322068-92ff-43ff-b0f2-6566e44c0a15
settlement_rent_sum_currency	number
小数位数:0,最大长度:10	否	settlement_rent_sum_currency 示例：1014
origcurrtypeid__moneyDigit	number
小数位数:0,最大长度:10	否	origcurrtypeid__moneyDigit 示例：2
receipt	object	是	receipt
creationtime	string	否	creationtime 示例：2025-06-03 14:01:06
pk_fiorg__name	string	否	pk_fiorg__name 示例：HT资产组织
returncount	number
小数位数:0,最大长度:10	否	returncount 示例：0
verifystate	number
小数位数:0,最大长度:10	否	verifystate 示例：2
customer_out	string	否	customer_out 示例：2173612906443177988
currrate	number
小数位数:0,最大长度:10	否	currrate 示例：1
origcurrtypeid__pricedigit	number
小数位数:0,最大长度:10	否	origcurrtypeid__pricedigit 示例：3
pk_org__code	string	否	pk_org__code 示例：HT001
synergy_flag	boolean	否	synergy_flag 示例：false
pk_mandept__name	string	否	pk_mandept__name 示例：HT租赁部
bill_code	string	否	bill_code 示例：ZRJS202506030001
contract_detail	object	是	contract_detail
confirmed	boolean	否	confirmed 示例：false
currrate_type__name	string	否	currrate_type__name 示例：基准汇率
settlement_money_sum_tax	number
小数位数:0,最大长度:10	否	settlement_money_sum_tax 示例：0
pk_mandept	string	否	pk_mandept 示例：2091770535093993473
postAccountStatus	number
小数位数:0,最大长度:10	否	postAccountStatus 示例：0
pk_fiorg	string	否	pk_fiorg 示例：2091769779160350723
pk_currency__digit	number
小数位数:0,最大长度:10	否	pk_currency__digit 示例：2
received_receipt_amount	number
小数位数:2,最大长度:10	否	received_receipt_amount 示例：176.99
notaxsettlement_money_sum_currency	number
小数位数:0,最大长度:10	否	notaxsettlement_money_sum_currency 示例：1042
settlement_other_sum_currency	number
小数位数:0,最大长度:10	否	settlement_other_sum_currency 示例：24
pubts	string	否	pubts 示例：2025-06-03 14:01:11
settlement_other_sum_tax	number
小数位数:0,最大长度:10	否	settlement_other_sum_tax 示例：0
need_receipt_amount	number
小数位数:0,最大长度:10	否	need_receipt_amount 示例：0
creator	string	否	creator 示例：01322068-92ff-43ff-b0f2-6566e44c0a15
billmaketime	string	否	billmaketime 示例：2025-06-03 14:01:06
settlement_other_sum_tax_currency	number
小数位数:0,最大长度:10	否	settlement_other_sum_tax_currency 示例：0
settlement_money_sum	number
小数位数:0,最大长度:10	否	settlement_money_sum 示例：1042
origcurrtypeid__name	string	否	origcurrtypeid__name 示例：人民币
auditor	string	否	auditor 示例：01322068-92ff-43ff-b0f2-6566e44c0a15
auditor__name	string	否	auditor__name 示例：G.Haitao
pay_operate	object	是	pay_operate
bill_status	number
小数位数:0,最大长度:10	否	bill_status 示例：1
notaxsettlement_cost_sum_currency	number
小数位数:0,最大长度:10	否	notaxsettlement_cost_sum_currency 示例：4
settlement_cost_sum	number
小数位数:0,最大长度:10	否	settlement_cost_sum 示例：4
deposit_deduction_sum	number
小数位数:0,最大长度:10	否	deposit_deduction_sum 示例：10
settlement_rent_sum	number
小数位数:0,最大长度:10	否	settlement_rent_sum 示例：1014
currrate_date	string	否	currrate_date 示例：2025-06-03
notaxsettlement_cost_sum	number
小数位数:0,最大长度:10	否	notaxsettlement_cost_sum 示例：4
deposit_settlement	object	是	deposit_settlement
transi_type	string	否	transi_type 示例：4A3E-01
tax_calculation_time	string	否	tax_calculation_time 示例：1
settlement_other_sum	number
小数位数:0,最大长度:10	否	settlement_other_sum 示例：24
_viewmodel	string	否	_viewmodel
masterOrgKeyField	string	否	masterOrgKeyField 示例：pk_org
transTypeKeyField	string	否	transTypeKeyField 示例：pk_transitype
_mddFormulaExecuteFlag	string	否	_mddFormulaExecuteFlag 示例：true
AMC_LIM04	string	否	AMC_LIM04 示例：1
AMC_LIM05	string	否	AMC_LIM05 示例：1
errorDetail	string	否	errorDetail

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功！",
	"data": {
		"pk_recorder": "2091771050461757445",
		"notaxsettlement_rent_sum_currency": 1014,
		"settlement_money_sum_currency": 1042,
		"notaxsettlement_other_sum_currency": 24,
		"synergy": false,
		"currrate_type__digit": 6,
		"pk_recorder_date": "2025-06-03",
		"settlement_cost_sum_tax": 0,
		"customer_out__name": "散户",
		"pk_org": "2091769779160350723",
		"notaxsettlement_other_sum": 24,
		"notaxsettlement_rent_sum": 1014,
		"pk_transitype": "2084475473001185293",
		"auto_settlement": false,
		"payable_withholding_tax": 1,
		"settlement_money_sum_tax_currency": 0,
		"currrate_type": "0000M0UNBGU65MDR0L0000",
		"notaxsettlement_money_sum": 1042,
		"bill_type": "4A3E",
		"pk_fiorg__code": "HT001",
		"id": "2282607322297008129",
		"settlement_rent_sum_tax": 0,
		"creator__name": "G.Haitao",
		"pk_currency__priceDigit": 3,
		"payment_settlement": [
			{
				"src_pk_bill": "2282603465416376323",
				"ori_advance_amount": 2.16,
				"loc_advance_amount": 2.16,
				"contract_id": "2282602623602786306",
				"cut_payment_code": "ZRGH202506030001",
				"tax_withhold_id": "2133499131662434309",
				"src_pk_bill_b": "2282603465416376324",
				"compensation_money_currency": 24,
				"contract_code": "结算sw",
				"notaxcompensation_money": 24,
				"need_receipt_flag": false,
				"compensation_money_tax": 0,
				"pay_type": "0",
				"id": "2282607322297008136",
				"pubts": "2025-06-03 14:01:07",
				"notaxcompensation_money_currency": 24,
				"main_id": "2282607322297008129",
				"contract_name": "结算sw",
				"compensation_money_tax_currency": 0,
				"src_transitype": "4A31-01",
				"tax_withhold_id__taxCode": "HT001",
				"contract_bill_code": "ZRHT202506030003",
				"taxwithhold_damages": [
					{
						"pay_damages": "2282607322297008136",
						"ori_advance_amount": 2.16,
						"tax_ation_date": "2025-06-03",
						"loc_advance_amount": 2.16,
						"tax_rate_type": 1,
						"tax_withhold_id": "2133499131662434309",
						"ori_tax_base": 24,
						"tax_holdingtype_id": "2133498487408427011",
						"tax_rate_id__code": "HT001",
						"tax_holdingtype_id__description": "代扣税类型-增值",
						"tax_rate_id": "2133497911891722249",
						"tax_withhold_id__taxCode": "HT001",
						"tax_rate_id__ntaxrate": 9,
						"id": "2282607322297008137",
						"pubts": "2025-06-03 14:01:07",
						"tax_category_id": "10000",
						"loc_tax_base": 24
					}
				],
				"src_pk_transitype": "2084475473001185351",
				"compensation_money": 24,
				"src_pk_transitype_name": "租入归还"
			}
		],
		"pay_detail": [
			{
				"notaxcycle_rent_currency": 1000,
				"gather_money_currency": 1014,
				"rental_unit": "4",
				"contract_id": "2282602623602786306",
				"taxwithhold_detail": [
					{
						"ori_advance_amount": 91.26,
						"tax_ation_date": "2025-06-03",
						"loc_advance_amount": 91.26,
						"tax_rate_type": 1,
						"tax_withhold_id": "2133499131662434309",
						"ori_tax_base": 1014,
						"tax_holdingtype_id": "2133498487408427011",
						"tax_rate_id__code": "HT001",
						"tax_holdingtype_id__description": "代扣税类型-增值",
						"tax_rate_id": "2133497911891722249",
						"tax_withhold_id__taxCode": "HT001",
						"tax_rate_id__ntaxrate": 9,
						"id": "2282607322297008139",
						"pubts": "2025-06-03 14:01:07",
						"tax_category_id": "10000",
						"loc_tax_base": 1014,
						"pay_detail": "2282607322297008138"
					}
				],
				"notaxadjustment_rent": 1014,
				"rental_period": 1,
				"src_pk_bill_b": "2282602623602786317",
				"less_cycle_rent": 33.333,
				"equip_code": "LIM20250603000001",
				"rent_count_style": "1",
				"contract_code": "结算sw",
				"pk_rent_count_method__name": "租入运营",
				"need_receipt_flag": false,
				"id": "2282607322297008138",
				"gather_money": 1014,
				"cycle_rent_currency": 1000,
				"equip_name": "结算sw",
				"refundapply_flag": 0,
				"notaxcycle_rent": 1000,
				"tax_withhold_id__taxCode": "HT001",
				"contract_bill_code": "ZRHT202506030003",
				"less_cycle_rent_currency": 33.333,
				"adjustment_rent_tax_currency": 0,
				"gather_money_tax_currency": 0,
				"src_pk_transitype": "4A3A-01",
				"notaxless_cycle_rent_currency": 33.333,
				"end_date": "2025-07-02",
				"ori_advance_amount": 91.26,
				"src_pk_bill": "2282602623602786306",
				"pk_rent_count_method": "2227016452463919108",
				"src_bill_type": "4A3A",
				"loc_advance_amount": 91.26,
				"notaxadjustment_rent_currency": 1014,
				"tax_withhold_id": "2133499131662434309",
				"cycle_rent": 1000,
				"collection_date_type": "0",
				"adjustment_rent": 1014,
				"receivable_date": "2025-06-03",
				"notaxless_cycle_rent": 33.333,
				"cycle_rent_tax_currency": 0,
				"pubts": "2025-06-03 14:01:07",
				"adjustment_rent_currency": 1014,
				"start_date": "2025-06-03",
				"main_id": "2282607322297008129",
				"contract_name": "结算sw",
				"notaxlgather_money": 1014,
				"collection_period": 1,
				"notaxlgather_money_currency": 1014,
				"gather_money_tax": 0,
				"adjustment_rent_tax": 0,
				"incomplete_period_day": 0,
				"cycle_rent_tax": 0,
				"pk_equip__equip_code": "LIM20250603000001",
				"pk_equip__equip_name": "结算sw",
				"pk_equip__spec": "",
				"pk_equip__model": ""
			}
		],
		"pk_currency__name": "人民币",
		"settlement_rent_sum_tax_currency": 0,
		"pk_currency": "2084475361311588412",
		"audittime": "2025-06-03 14:01:11",
		"sysid": "LIM",
		"origcurrtypeid": "2084475361311588412",
		"isWfControlled": false,
		"pk_org__name": "HT资产组织",
		"pk_transitype__name": "租入结算单",
		"deposit_deduction_amount": 10,
		"pay_cost": [
			{
				"src_pk_bill": "2282602967200169987",
				"total_cost_amount_currency": 4,
				"ori_advance_amount": 0.36,
				"expense_item": "2092133270832021509",
				"loc_advance_amount": 0.36,
				"contract_id": "2282602623602786306",
				"notaxtotal_cost_amount_currency": 4,
				"tax_withhold_id": "2133499131662434309",
				"src_pk_bill_b": "2282602967200169988",
				"equip_code": "LIM20250603000001",
				"contract_code": "结算sw",
				"pay_cost_code": "ZRFY202506030001",
				"expense_item__code": "SF",
				"need_receipt_flag": false,
				"id": "2282607322297008131",
				"pubts": "2025-06-03 14:01:07",
				"main_id": "2282607322297008129",
				"equip_name": "结算sw",
				"identify_date": "2025-06-03",
				"contract_name": "结算sw",
				"notaxtotal_cost_amount": 4,
				"total_cost_amount_tax": 0,
				"taxwithhold_cost": [
					{
						"ori_advance_amount": 0.36,
						"tax_ation_date": "2025-06-03",
						"loc_advance_amount": 0.36,
						"pay_cost": "2282607322297008131",
						"tax_rate_type": 1,
						"tax_withhold_id": "2133499131662434309",
						"ori_tax_base": 4,
						"tax_holdingtype_id": "2133498487408427011",
						"tax_rate_id__code": "HT001",
						"tax_holdingtype_id__description": "代扣税类型-增值",
						"tax_rate_id": "2133497911891722249",
						"tax_withhold_id__taxCode": "HT001",
						"tax_rate_id__ntaxrate": 9,
						"id": "2282607322297008132",
						"pubts": "2025-06-03 14:01:07",
						"tax_category_id": "10000",
						"loc_tax_base": 4
					}
				],
				"pay_cost_id": "2282602967200169987",
				"expense_item__name": "水费",
				"expense_amount": 4,
				"total_cost_amount_tax_currency": 0,
				"tax_withhold_id__taxCode": "HT001",
				"contract_bill_code": "ZRHT202506030003",
				"pk_equip__equip_code": "LIM20250603000001",
				"pk_equip__equip_name": "结算sw"
			}
		],
		"settlement_cost_sum_tax_currency": 0,
		"settlement_cost_sum_currency": 4,
		"billmaker__name": "G.Haitao",
		"contract_way": 0,
		"account_days": "2025-06-03",
		"received_payment_amount": 176.99,
		"need_payment_amount": 0,
		"pk_recorder__name": "HTRENT",
		"billmaker": "01322068-92ff-43ff-b0f2-6566e44c0a15",
		"settlement_rent_sum_currency": 1014,
		"origcurrtypeid__moneyDigit": 2,
		"receipt": [
			{
				"src_pk_bill": "2132006218208116737",
				"pk_drawer": "徐玉林",
				"bill_num": "07272396",
				"bill_date": "2023-08-04",
				"rent_tax": 23.01,
				"contract_id": "2282602623602786306",
				"bill_code": "011002300911",
				"main_id": "2282607322297008129",
				"contract_name": "结算sw",
				"rent_cost": 176.99,
				"confirmed": "王思思",
				"rent_bill_cost": 176.99,
				"taxpayer_code_in": "91110000600001760P",
				"contract_code": "结算sw",
				"contract_bill_code": "ZRHT202506030003",
				"pk_payee": "徐玉林",
				"check_code": "78669647912412758378",
				"bill_type": "invoice",
				"invoice_type": "8",
				"id": "2282607322297008133",
				"merge_tax": 200,
				"pubts": "2025-06-03 14:01:07",
				"data_base_rent_bill_cost": 176.99
			}
		],
		"creationtime": "2025-06-03 14:01:06",
		"pk_fiorg__name": "HT资产组织",
		"returncount": 0,
		"verifystate": 2,
		"customer_out": "2173612906443177988",
		"currrate": 1,
		"origcurrtypeid__pricedigit": 3,
		"pk_org__code": "HT001",
		"synergy_flag": false,
		"pk_mandept__name": "HT租赁部",
		"bill_code": "ZRJS202506030001",
		"contract_detail": [
			{
				"src_pk_bill": "2282602623602786306",
				"src_bill_type": "4A3A",
				"gather_money_currency": 1014,
				"settlement_expense": 4,
				"contract_id": "2282602623602786306",
				"need_deposit_amount": 1000,
				"other_settlement_tax_currency": 0,
				"contract_code": "结算sw",
				"other_settlement_tax": 0,
				"need_receipt_flag": false,
				"received_receipt_amount": 176.99,
				"id": "2282607322297008134",
				"pubts": "2025-06-03 14:01:07",
				"need_receipt_amount": 0,
				"gather_money": 1014,
				"deposit_deduction_amount": 10,
				"main_id": "2282607322297008129",
				"contract_name": "结算sw",
				"other_settlement_currency": 24,
				"notaxlgather_money": 1014,
				"other_settlement": 24,
				"contract_bill_code": "ZRHT202506030003",
				"notaxlgather_money_currency": 1014,
				"gather_money_tax": 0,
				"gather_money_tax_currency": 0,
				"src_pk_transitype": "4A3A-01"
			}
		],
		"confirmed": false,
		"currrate_type__name": "基准汇率",
		"settlement_money_sum_tax": 0,
		"pk_mandept": "2091770535093993473",
		"postAccountStatus": 0,
		"pk_fiorg": "2091769779160350723",
		"pk_currency__digit": 2,
		"received_receipt_amount": 176.99,
		"notaxsettlement_money_sum_currency": 1042,
		"settlement_other_sum_currency": 24,
		"pubts": "2025-06-03 14:01:11",
		"settlement_other_sum_tax": 0,
		"need_receipt_amount": 0,
		"creator": "01322068-92ff-43ff-b0f2-6566e44c0a15",
		"billmaketime": "2025-06-03 14:01:06",
		"settlement_other_sum_tax_currency": 0,
		"settlement_money_sum": 1042,
		"origcurrtypeid__name": "人民币",
		"auditor": "01322068-92ff-43ff-b0f2-6566e44c0a15",
		"auditor__name": "G.Haitao",
		"pay_operate": [
			{
				"src_pk_bill": "2282603164768665606",
				"pay_operate_status": 1,
				"contract_id": "2282602623602786306",
				"num": 14,
				"pay_operate_code": "ZRYY202506030001",
				"pk_recorder_date": "2025-06-03",
				"main_id": "2282607322297008129",
				"equip_name": "结算sw",
				"contract_name": "结算sw",
				"pay_operate_id": "2282603164768665606",
				"src_pk_bill_b": "2282603164768665607",
				"pk_project": "2177457211386626057",
				"equip_code": "LIM20250603000001",
				"contract_code": "结算sw",
				"contract_bill_code": "ZRHT202506030003",
				"pk_project_name": "运营项目",
				"id": "2282607322297008135",
				"pubts": "2025-06-03 14:01:07",
				"pk_equip__equip_code": "LIM20250603000001",
				"pk_equip__equip_name": "结算sw"
			}
		],
		"bill_status": 1,
		"notaxsettlement_cost_sum_currency": 4,
		"settlement_cost_sum": 4,
		"deposit_deduction_sum": 10,
		"settlement_rent_sum": 1014,
		"currrate_date": "2025-06-03",
		"notaxsettlement_cost_sum": 4,
		"deposit_settlement": [
			{
				"deposit_deduction_amount_currency": 10,
				"need_deposit_amount_currency": 1000,
				"contract_code": "结算sw",
				"contract_bill_code": "ZRHT202506030003",
				"contract_id": "2282602623602786306",
				"deposit_deduction_amount": 10,
				"main_id": "2282607322297008129",
				"contract_name": "结算sw",
				"need_deposit_amount": 1000,
				"id": "2282607322297008130",
				"pubts": "2025-06-03 14:01:07"
			}
		],
		"transi_type": "4A3E-01",
		"tax_calculation_time": "1",
		"settlement_other_sum": 24,
		"_viewmodel": "",
		"masterOrgKeyField": "pk_org",
		"transTypeKeyField": "pk_transitype",
		"_mddFormulaExecuteFlag": "true",
		"AMC_LIM04": "1",
		"AMC_LIM05": "1"
	},
	"errorDetail": ""
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
999	服务端逻辑异常	服务端逻辑异常

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

