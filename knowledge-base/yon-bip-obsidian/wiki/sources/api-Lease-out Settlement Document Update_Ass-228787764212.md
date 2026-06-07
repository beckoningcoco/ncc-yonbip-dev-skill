---
title: "租出结算单详情查询"
apiId: "2287877642127933446"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Lease-out Settlement Document"
domain: "GAM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Lease-out Settlement Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 租出结算单详情查询

>  请求方式	POST | Lease-out Settlement Document (GAM)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/am/rentoutpaymentcard/detail
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
id	string	否	是	租出结算单主表主键 示例：123456789

## 3. 请求示例

Url: /yonbip/am/rentoutpaymentcard/detail?access_token=访问令牌
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
stay_invoice_total	number
小数位数:0,最大长度:10	否	stay_invoice_total 示例：0
notaxsettlement_amount	number
小数位数:0,最大长度:10	否	notaxsettlement_amount 示例：1042
synergy	boolean	否	synergy 示例：false
notaxsettlement_rent_currency	number
小数位数:0,最大长度:10	否	notaxsettlement_rent_currency 示例：1014
settlement_cost	number
小数位数:0,最大长度:10	否	settlement_cost 示例：4
currrate_type__digit	number
小数位数:0,最大长度:10	否	currrate_type__digit 示例：6
invoicing_customers__name	string	否	invoicing_customers__name 示例：HT新客户
deposit_deduction_total_currency	number
小数位数:0,最大长度:10	否	deposit_deduction_total_currency 示例：0
pk_org	string	否	pk_org 示例：2091769779160350723
settlement_rent_tax	number
小数位数:0,最大长度:10	否	settlement_rent_tax 示例：0
pk_transitype	string	否	pk_transitype 示例：2084475473001185355
auto_settlement	boolean	否	auto_settlement 示例：false
currrate_type	string	否	currrate_type 示例：0000M0UNBGU65MDR0L0000
deposit_collection_total_currency	number
小数位数:0,最大长度:10	否	deposit_collection_total_currency 示例：0
bill_type	string	否	bill_type 示例：4BLE
id	string	否	id 示例：2282610844170190856
creator__name	string	否	creator__name 示例：G.Haitao
pk_currency__priceDigit	number
小数位数:0,最大长度:10	否	pk_currency__priceDigit 示例：3
amount_collected_tax_currency	number
小数位数:0,最大长度:10	否	amount_collected_tax_currency 示例：0
notaxsettle_accounts_total	number
小数位数:0,最大长度:10	否	notaxsettle_accounts_total 示例：24
notaxsettle_accounts_total_currency	number
小数位数:0,最大长度:10	否	notaxsettle_accounts_total_currency 示例：24
stay_invoice_total_currency	number
小数位数:0,最大长度:10	否	stay_invoice_total_currency 示例：0
pay_damages	object	是	pay_damages
customer_way	number
小数位数:0,最大长度:10	否	customer_way 示例：1
settlement_rent_currency	number
小数位数:0,最大长度:10	否	settlement_rent_currency 示例：1014
pk_currency__name	string	否	pk_currency__name 示例：人民币
settlement_rent	number
小数位数:0,最大长度:10	否	settlement_rent 示例：1014
pk_currency	string	否	pk_currency 示例：2084475361311588412
audittime	string	否	audittime 示例：2025-06-03 14:08:03
sysid	string	否	sysid 示例：LOM
origcurrtypeid	string	否	origcurrtypeid 示例：2084475361311588412
deposit_collection_total	number
小数位数:0,最大长度:10	否	deposit_collection_total 示例：0
isWfControlled	boolean	否	isWfControlled 示例：false
pk_org__name	string	否	pk_org__name 示例：HT资产组织
pk_transitype__name	string	否	pk_transitype__name 示例：租出结算单
pay_cost	object	是	pay_cost
enterprise_nature	string	否	enterprise_nature 示例：0
origcurrtypeid__priceDigit	number
小数位数:0,最大长度:10	否	origcurrtypeid__priceDigit 示例：3
settlement_rent_tax_currency	number
小数位数:0,最大长度:10	否	settlement_rent_tax_currency 示例：0
settle_accounts_total	number
小数位数:0,最大长度:10	否	settle_accounts_total 示例：24
billmaker__name	string	否	billmaker__name 示例：G.Haitao
contract_way	number
小数位数:0,最大长度:10	否	contract_way 示例：0
account_days	string	否	account_days 示例：2025-06-03
customer__name	string	否	customer__name 示例：HT新客户
pk_recorder__name	string	否	pk_recorder__name 示例：HTRENT
billmaker	string	否	billmaker 示例：01322068-92ff-43ff-b0f2-6566e44c0a15
settlement_cost_currency	number
小数位数:0,最大长度:10	否	settlement_cost_currency 示例：4
settlement_amount	number
小数位数:0,最大长度:10	否	settlement_amount 示例：1042
origcurrtypeid__moneyDigit	number
小数位数:0,最大长度:10	否	origcurrtypeid__moneyDigit 示例：2
creationtime	string	否	creationtime 示例：2025-06-03 14:07:56
notaxsettlement_cost_currency	number
小数位数:0,最大长度:10	否	notaxsettlement_cost_currency 示例：4
pk_fiorg__name	string	否	pk_fiorg__name 示例：HT资产组织
pk_raorg__name	string	否	pk_raorg__name 示例：HT资产组织
returncount	number
小数位数:0,最大长度:10	否	returncount 示例：0
verifystate	number
小数位数:0,最大长度:10	否	verifystate 示例：2
currrate	number
小数位数:0,最大长度:10	否	currrate 示例：1
pk_mandept__name	string	否	pk_mandept__name 示例：HT租赁部
bill_code	string	否	bill_code 示例：ZCJS202506030002
settlement_cost_tax_currency	number
小数位数:0,最大长度:10	否	settlement_cost_tax_currency 示例：0
invoicing_customers	string	否	invoicing_customers 示例：2174209554692702210
settle_accounts_total_tax	number
小数位数:0,最大长度:10	否	settle_accounts_total_tax 示例：0
contract_detaile	object	是	contract_detaile
confirmed	boolean	否	confirmed 示例：false
currrate_type__name	string	否	currrate_type__name 示例：基准汇率
pk_mandept	string	否	pk_mandept 示例：2091770535093993473
amount_collected_tax	number
小数位数:0,最大长度:10	否	amount_collected_tax 示例：0
settlement_cost_tax	number
小数位数:0,最大长度:10	否	settlement_cost_tax 示例：0
postAccountStatus	number
小数位数:0,最大长度:10	否	postAccountStatus 示例：0
settle_accounts_total_tax_currency	number
小数位数:0,最大长度:10	否	settle_accounts_total_tax_currency 示例：0
pk_fiorg	string	否	pk_fiorg 示例：2091769779160350723
pk_currency__digit	number
小数位数:0,最大长度:10	否	pk_currency__digit 示例：2
notaxamount_collected	number
小数位数:0,最大长度:10	否	notaxamount_collected 示例：0
settlement_amount_currency	number
小数位数:0,最大长度:10	否	settlement_amount_currency 示例：1042
settlement_amount_tax	number
小数位数:0,最大长度:10	否	settlement_amount_tax 示例：0
pubts	string	否	pubts 示例：2025-06-03 14:08:03
amount_collected_currency	number
小数位数:0,最大长度:10	否	amount_collected_currency 示例：0
real_invoice_total_currency	number
小数位数:0,最大长度:10	否	real_invoice_total_currency 示例：0
pk_raorg	string	否	pk_raorg 示例：2091769779160350723
creator	string	否	creator 示例：01322068-92ff-43ff-b0f2-6566e44c0a15
billmaketime	string	否	billmaketime 示例：2025-06-03 14:07:56
origcurrtypeid__name	string	否	origcurrtypeid__name 示例：人民币
auditor	string	否	auditor 示例：01322068-92ff-43ff-b0f2-6566e44c0a15
notaxsettlement_amount_currency	number
小数位数:0,最大长度:10	否	notaxsettlement_amount_currency 示例：1042
settlement_amount_tax_currency	number
小数位数:0,最大长度:10	否	settlement_amount_tax_currency 示例：0
auditor__name	string	否	auditor__name 示例：G.Haitao
notaxsettlement_rent	number
小数位数:0,最大长度:10	否	notaxsettlement_rent 示例：1014
bill_status	number
小数位数:0,最大长度:10	否	bill_status 示例：1
notaxsettlement_cost	number
小数位数:0,最大长度:10	否	notaxsettlement_cost 示例：4
currrate_date	string	否	currrate_date 示例：2025-06-03
notaxamount_collected_currency	number
小数位数:0,最大长度:10	否	notaxamount_collected_currency 示例：0
pay_deposit	object	是	pay_deposit
transi_type	string	否	transi_type 示例：4BLE-01
settle_accounts_total_currency	number
小数位数:0,最大长度:10	否	settle_accounts_total_currency 示例：24
customer	string	否	customer 示例：2174209554692702210
_viewmodel	string	否	_viewmodel
masterOrgKeyField	string	否	masterOrgKeyField 示例：pk_org
transTypeKeyField	string	否	transTypeKeyField 示例：pk_transitype
_mddFormulaExecuteFlag	string	否	_mddFormulaExecuteFlag 示例：true
orgParameter	string	否	orgParameter 示例：1
errorDetail	string	否	errorDetail

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功！",
	"data": {
		"pk_recorder": "2091771050461757445",
		"stay_invoice_total": 0,
		"notaxsettlement_amount": 1042,
		"synergy": false,
		"notaxsettlement_rent_currency": 1014,
		"settlement_cost": 4,
		"currrate_type__digit": 6,
		"invoicing_customers__name": "HT新客户",
		"deposit_deduction_total_currency": 0,
		"pk_org": "2091769779160350723",
		"settlement_rent_tax": 0,
		"pk_transitype": "2084475473001185355",
		"auto_settlement": false,
		"currrate_type": "0000M0UNBGU65MDR0L0000",
		"deposit_collection_total_currency": 0,
		"bill_type": "4BLE",
		"id": "2282610844170190856",
		"creator__name": "G.Haitao",
		"pk_currency__priceDigit": 3,
		"amount_collected_tax_currency": 0,
		"notaxsettle_accounts_total": 24,
		"notaxsettle_accounts_total_currency": 24,
		"stay_invoice_total_currency": 0,
		"pay_damages": [
			{
				"src_pk_bill": "2282609255032291330",
				"contract_id": "2282608164110598150",
				"notaxcompensation_money_currency": 24,
				"main_id": "2282610844170190856",
				"equip_name": "租出结算单全数据",
				"contract_name": "结算sw",
				"invoiced_flag": false,
				"src_pk_bill_b": "2282609255032291331",
				"compensation_money_tax_currency": 0,
				"compensation_money_currency": 24,
				"equip_code": "EAM-2025060300001",
				"pk_equip__equip_code": "EAM-2025060300001",
				"pk_equip": "2282534093088358401",
				"contract_code": "结算sw",
				"contract_bill_code": "ZCHT202506030004",
				"notaxcompensation_money": 24,
				"compensation_money_tax": 0,
				"pk_equip__equip_name": "租出结算单全数据",
				"id": "2282610844170190857",
				"pubts": "2025-06-03 14:07:56",
				"compensation_money": 24,
				"invoicing_flag": false
			}
		],
		"customer_way": 1,
		"settlement_rent_currency": 1014,
		"pk_currency__name": "人民币",
		"settlement_rent": 1014,
		"pk_currency": "2084475361311588412",
		"audittime": "2025-06-03 14:08:03",
		"sysid": "LOM",
		"origcurrtypeid": "2084475361311588412",
		"deposit_collection_total": 0,
		"isWfControlled": false,
		"pk_org__name": "HT资产组织",
		"pk_transitype__name": "租出结算单",
		"pay_cost": [
			{
				"src_pk_bill": "2282608713866412032",
				"pk_recorder": "2091771050461757445",
				"notaxsettlement_amount": 4,
				"expense_item": "2091793856744390657",
				"pk_mandept__name": "HT租赁部",
				"contract_id": "2282608164110598150",
				"pk_recorder_date": "2025-06-03",
				"invoiced_flag": false,
				"src_pk_bill_b": "2282608713866412033",
				"pk_mandept": "2091770535093993473",
				"equip_code": "EAM-2025060300001",
				"pk_equip__equip_code": "EAM-2025060300001",
				"contract_code": "结算sw",
				"pay_cost_code": "ZCFY202506030002",
				"expense_item__code": "HT001",
				"settlement_amount_currency": 4,
				"settlement_amount_tax": 0,
				"id": "2282610844170190860",
				"pubts": "2025-06-03 14:07:56",
				"pay_cost_status": 1,
				"main_id": "2282610844170190856",
				"notaxsettlement_amount_currency": 4,
				"settlement_amount_tax_currency": 0,
				"identify_date": "2025-06-03",
				"equip_name": "租出结算单全数据",
				"contract_name": "结算sw",
				"pay_cost_id": "2282608713866412032",
				"expense_item__name": "租赁费用项目",
				"pk_equip": "2282534093088358401",
				"pk_recorder__name": "HTRENT",
				"contract_bill_code": "ZCHT202506030004",
				"settlement_amount": 4,
				"pk_equip__equip_name": "租出结算单全数据",
				"invoicing_flag": false
			}
		],
		"enterprise_nature": "0",
		"origcurrtypeid__priceDigit": 3,
		"settlement_rent_tax_currency": 0,
		"settle_accounts_total": 24,
		"billmaker__name": "G.Haitao",
		"contract_way": 0,
		"account_days": "2025-06-03",
		"customer__name": "HT新客户",
		"pk_recorder__name": "HTRENT",
		"billmaker": "01322068-92ff-43ff-b0f2-6566e44c0a15",
		"settlement_cost_currency": 4,
		"settlement_amount": 1042,
		"origcurrtypeid__moneyDigit": 2,
		"creationtime": "2025-06-03 14:07:56",
		"notaxsettlement_cost_currency": 4,
		"pk_fiorg__name": "HT资产组织",
		"pk_raorg__name": "HT资产组织",
		"returncount": 0,
		"verifystate": 2,
		"currrate": 1,
		"pk_mandept__name": "HT租赁部",
		"bill_code": "ZCJS202506030002",
		"settlement_cost_tax_currency": 0,
		"invoicing_customers": "2174209554692702210",
		"settle_accounts_total_tax": 0,
		"contract_detaile": [
			{
				"pk_recorder": "2091771050461757445",
				"stay_invoice_total": 0,
				"gather_money_currency": 1014,
				"contract_id": "2282608164110598150",
				"notaxadjustment_rent": 4,
				"total_settlement_tax_currency": 0,
				"gather_deposit_currency": 34,
				"invoiced_flag": false,
				"settlement_money_currency": 24,
				"total_settlement": 1042,
				"contract_code": "结算sw",
				"id": "2282610844170190861",
				"gather_money": 1014,
				"stay_invoice_total_currency": 0,
				"notaxtotal_settlement_currency": 1042,
				"gather_deposit": 34,
				"pk_recorder__name": "HTRENT",
				"contract_bill_code": "ZCHT202506030004",
				"deposit_collection": 0,
				"adjustment_rent_tax_currency": 0,
				"notaxsettlement_money": 24,
				"gather_money_tax_currency": 0,
				"src_pk_transitype": "4BL0-01",
				"invoicing_flag": false,
				"pay_detaile": [
					{
						"notaxcycle_rent_currency": 1000,
						"rental_unit": "4",
						"contract_id": "2282608164110598150",
						"rental_period": 1,
						"notaxadjustment_rent": 1014,
						"invoiced_flag": false,
						"equip_status": "0",
						"src_pk_bill_b": "2282608438988505102",
						"tax_rate": 0,
						"less_cycle_rent": 33.333,
						"pk_equip__equip_code": "EAM-2025060300001",
						"equip_code": "EAM-2025060300001",
						"contract_code": "结算sw",
						"less_cycle_rent_tax": 0,
						"id": "2282610844170190864",
						"pk_cal_means": "2226299673961824264",
						"gather_money": 1014,
						"cycle_rent_currency": 1000,
						"equip_name": "租出结算单全数据",
						"notaxcycle_rent": 1000,
						"less_cycle_rent_currency": 33.333,
						"less_cycle_rent_tax_currency": 0,
						"adjustment_rent_tax_currency": 0,
						"invoicing_flag": false,
						"src_pk_transitype": "4BL0-01",
						"notaxless_cycle_rent_currency": 33.333,
						"end_date": "2025-07-02",
						"src_bill_type": "4BL0",
						"notaxadjustment_rent_currency": 1014,
						"cycle_rent": 1000,
						"adjustment_rent": 1014,
						"before_gather_money": 1000,
						"receivable_date": "2025-06-03",
						"notaxless_cycle_rent": 33.333,
						"cycle_rent_tax_currency": 0,
						"pubts": "2025-06-03 14:07:56",
						"adjustment_rent_currency": 1014,
						"start_date": "2025-06-03",
						"pk_category__category_name": "HT租赁",
						"main_id": "2282610844170190861",
						"contract_name": "结算sw",
						"pk_category": "2091780963254140935",
						"pk_equip": "2282534093088358401",
						"collection_period": 1,
						"pk_equip__equip_name": "租出结算单全数据",
						"adjustment_rent_tax": 0,
						"incomplete_period_day": 0,
						"cycle_rent_tax": 0
					}
				],
				"src_pk_bill": "2282608164110598150",
				"src_bill_type": "4BL0",
				"notaxsettlement_money_currency": 24,
				"notaxadjustment_rent_currency": 4,
				"settlement_money_tax": 0,
				"pk_mandept__name": "HT租赁部",
				"pk_mandept": "2091770535093993473",
				"total_settlement_currency": 1042,
				"adjustment_rent": 4,
				"notaxtotal_settlement": 1042,
				"pubts": "2025-06-03 14:07:56",
				"adjustment_rent_currency": 4,
				"settlement_money": 24,
				"main_id": "2282610844170190856",
				"settlement_money_tax_currency": 0,
				"contract_name": "结算sw",
				"notaxlgather_money": 1014,
				"pay_operate": [
					{
						"src_pk_bill": "2282608971564449792",
						"contract_id": "2282608164110598150",
						"num": 14,
						"pk_recorder_date": "2025-06-03",
						"src_pk_bill_b": "2282608971564449793",
						"pk_project": "2177457211386626057",
						"calculation_id": "2282608438988505102",
						"pk_equip__equip_code": "EAM-2025060300001",
						"contract_code": "结算sw",
						"id": "2282610844170190862",
						"pubts": "2025-06-03 14:07:56",
						"pay_operate_status": 1,
						"pay_operate_code": "ZCYY202506030001",
						"main_id": "2282610844170190861",
						"contract_name": "结算sw",
						"pay_operate_id": "2282608971564449792",
						"pk_equip": "2282534093088358401",
						"contract_bill_code": "ZCHT202506030004",
						"pk_equip__equip_name": "租出结算单全数据",
						"pk_project_name": "运营项目",
						"pk_project__data_accuracy": 2
					}
				],
				"contract_bill_status": 7,
				"renewed": false,
				"notaxlgather_money_currency": 1014,
				"gather_money_tax": 0,
				"deposit_collection_currency": 0,
				"adjustment_rent_tax": 0,
				"total_settlement_tax": 0
			}
		],
		"confirmed": false,
		"currrate_type__name": "基准汇率",
		"pk_mandept": "2091770535093993473",
		"amount_collected_tax": 0,
		"settlement_cost_tax": 0,
		"postAccountStatus": 0,
		"settle_accounts_total_tax_currency": 0,
		"pk_fiorg": "2091769779160350723",
		"pk_currency__digit": 2,
		"notaxamount_collected": 0,
		"settlement_amount_currency": 1042,
		"settlement_amount_tax": 0,
		"pubts": "2025-06-03 14:08:03",
		"amount_collected_currency": 0,
		"real_invoice_total_currency": 0,
		"pk_raorg": "2091769779160350723",
		"creator": "01322068-92ff-43ff-b0f2-6566e44c0a15",
		"billmaketime": "2025-06-03 14:07:56",
		"origcurrtypeid__name": "人民币",
		"auditor": "01322068-92ff-43ff-b0f2-6566e44c0a15",
		"notaxsettlement_amount_currency": 1042,
		"settlement_amount_tax_currency": 0,
		"auditor__name": "G.Haitao",
		"notaxsettlement_rent": 1014,
		"bill_status": 1,
		"notaxsettlement_cost": 4,
		"currrate_date": "2025-06-03",
		"notaxamount_collected_currency": 0,
		"pay_deposit": [
			{
				"contract_id": "2282608164110598150",
				"main_id": "2282610844170190856",
				"contract_name": "结算sw",
				"contract_code": "结算sw",
				"contract_bill_code": "ZCHT202506030004",
				"deposit_collection": 34,
				"deposit_collection_currency": 34,
				"settlement_amount_currency": 34,
				"settlement_amount": 34,
				"id": "2282610844170190858",
				"pubts": "2025-06-03 14:07:56",
				"settlement_type": "0"
			}
		],
		"transi_type": "4BLE-01",
		"settle_accounts_total_currency": 24,
		"customer": "2174209554692702210",
		"_viewmodel": "",
		"masterOrgKeyField": "pk_org",
		"transTypeKeyField": "pk_transitype",
		"_mddFormulaExecuteFlag": "true",
		"orgParameter": "1"
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

