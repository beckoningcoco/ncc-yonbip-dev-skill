---
title: "维修合同结算详情查询"
apiId: "2095437440643760133"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Outsourced Maintenance Settlement"
domain: "MRO"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Outsourced Maintenance Settlement]
platform_version: "BIP"
source_type: community-api-docs
---

# 维修合同结算详情查询

>  请求方式	POST | Outsourced Maintenance Settlement (MRO)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/am/ommsettlecard/detail
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
id	string	否	是	维修合同结算主键 示例：1993903529019310088

## 3. 请求示例

Url: /yonbip/am/ommsettlecard/detail?access_token=访问令牌
Body: {
	"id": "1993903529019310088"
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
小数位数:0,最大长度:10	否	状态码（200：成功，其他：失败） 示例：200
message	string	否	返回信息 示例：操作成功！
data	object	否	返回数据
pk_fiorg_armt	string	否	维修会计主体 示例：1790633799219413000
tax_settle_total_money	number
小数位数:0,最大长度:10	否	含税结算总金额 示例：0
settle_type	string	否	结算类型 示例：1
pk_currency__moneyRount	number
小数位数:0,最大长度:10	否	币种金额精度 示例：4
ori_currency__priceDigit	number
小数位数:0,最大长度:10	否	本币币种单价舍入规则 示例：3
currrate_type__digit	number
小数位数:0,最大长度:10	否	汇率类型精度 示例：7
settle_date	string	否	结算日期 示例：2023-10-07 00:00:00
pk_org	string	否	维修组织id 示例：1790633799219413000
pk_transitype	string	否	交易类型id 示例：1763914120481473315
ori_currency__moneyRount	number
小数位数:0,最大长度:10	否	本币币种金额精度 示例：4
pk_fiorg_armt__name	string	否	维修会计主体 示例：bx-维修组织
currrate_type	string	否	汇率类型id 示例：0000LJPGZ3RX3YAKG10000
handle_date	string	否	汇率日期 示例：2023-10-07 00:00:00
bill_type	string	否	单据类型 示例：4C08
id	string	否	维修合同结算id 示例：1833607575547412482
pk_currency__priceDigit	number
小数位数:0,最大长度:10	否	比重单价精度 示例：3
ori_settle_total_tax	number
小数位数:0,最大长度:10	否	本币结算总税额 示例：0
pk_currency__name	string	否	币种 示例：人民币
pk_currency	string	否	币种id 示例：1763914111891537950
isWfControlled	boolean	否	审批状态 示例：true
pk_provider__name	string	否	供应商 示例：wml供应商
pk_currency__moneyDigit	number
小数位数:0,最大长度:10	否	币种金额精度 示例：2
ori_currency__priceRount	number
小数位数:0,最大长度:10	否	本币币种单价舍入规则 示例：4
tax_free_settle_total_money	number
小数位数:0,最大长度:10	否	无税结算总金额 示例：0
detail	object	是	结算明细信息
returncount	number
小数位数:0,最大长度:10	否	退回次数 示例：0
verifystate	number
小数位数:0,最大长度:10	否	审批状态 示例：2
currrate	number
小数位数:0,最大长度:10	否	汇率 示例：1
settle_total_tax	number
小数位数:0,最大长度:10	否	结算总税额 示例：0
ori_currency__moneyDigit	number
小数位数:0,最大长度:10	否	本币币种金额精度 示例：2
bill_code	string	否	单据编码 示例：WXJS202310070003
pk_currency__priceRount	number
小数位数:0,最大长度:10	否	币种单价舍入规则 示例：4
currrate_type__name	string	否	汇率类型 示例：基准汇率
postAccountStatus	number
小数位数:0,最大长度:10	否	过账状态 示例：99
ori_currency	string	否	本币币种 示例：1763914111891537950
ori_tax_free_settle_total_money	number
小数位数:0,最大长度:10	否	本币无税结算总金额 示例：0
bill_status	number
小数位数:0,最大长度:10	否	审核状态 示例：1
currrate_date	string	否	汇率日期 示例：2023-10-07 00:00:00
ori_tax_settle_total_money	number
小数位数:0,最大长度:10	否	本币含税结算总金额 示例：0
transi_type	string	否	交易类型 示例：4C08-01
ori_need_bill_total_money	number
小数位数:0,最大长度:10	否	本币需收发票总额 示例：0
pk_provider	string	否	供应商 示例：1796572716778651653
need_bill_total_money	number
小数位数:0,最大长度:10	否	需收发票总额 示例：0

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功！",
	"data": {
		"pk_fiorg_armt": "1790633799219413000",
		"tax_settle_total_money": 0,
		"settle_type": "1",
		"pk_currency__moneyRount": 4,
		"ori_currency__priceDigit": 3,
		"currrate_type__digit": 7,
		"settle_date": "2023-10-07 00:00:00",
		"pk_org": "1790633799219413000",
		"pk_transitype": "1763914120481473315",
		"ori_currency__moneyRount": 4,
		"pk_fiorg_armt__name": "bx-维修组织",
		"currrate_type": "0000LJPGZ3RX3YAKG10000",
		"handle_date": "2023-10-07 00:00:00",
		"bill_type": "4C08",
		"id": "1833607575547412482",
		"pk_currency__priceDigit": 3,
		"ori_settle_total_tax": 0,
		"pk_currency__name": "人民币",
		"pk_currency": "1763914111891537950",
		"isWfControlled": true,
		"pk_provider__name": "wml供应商",
		"pk_currency__moneyDigit": 2,
		"ori_currency__priceRount": 4,
		"tax_free_settle_total_money": 0,
		"detail": [
			{
				"repair_num": 1,
				"tax_free_settle_fee": 0,
				"num": 1,
				"settle_total_times": 0,
				"tax_unit_price": 1,
				"ori_act_pay_tax": 0,
				"tax_free_act_pay_money": 0,
				"pk_contract__bill_code": "WXHT202309190001",
				"pk_contract__sign_formal": "0",
				"ori_tax_unit_price": 1,
				"ori_tax_free_act_pay_money": 0,
				"pk_contract": "1820154028569395209",
				"pk_contract__contract_name": "ZC-83848 维修合同结算---维修合同结算支持移动审批-开发自测子任务",
				"tax_rate": 0,
				"tax_settle_fee": 0,
				"src_pk_bill_b": "1820154028569395210",
				"ori_tax_settle_fee": 0,
				"act_pay_tax": 0,
				"ori_tax_free_settle_fee": 0,
				"settle_tax": 0,
				"tax_free_unit_price": 1,
				"id": "1833607575547412483",
				"ori_tax_free_unit_price": 1,
				"ori_tax_act_pay_money": 0,
				"main_id": "1833607575547412482",
				"tax_act_pay_money": 0,
				"pk_contract__contract_code": "111",
				"tax_id": "10000",
				"ori_settle_tax": 0,
				"tax_code": "NL",
				"maintain_obj": "1"
			}
		],
		"returncount": 0,
		"verifystate": 2,
		"currrate": 1,
		"settle_total_tax": 0,
		"ori_currency__moneyDigit": 2,
		"bill_code": "WXJS202310070003",
		"pk_currency__priceRount": 4,
		"currrate_type__name": "基准汇率",
		"postAccountStatus": 99,
		"ori_currency": "1763914111891537950",
		"ori_tax_free_settle_total_money": 0,
		"bill_status": 1,
		"currrate_date": "2023-10-07 00:00:00",
		"ori_tax_settle_total_money": 0,
		"transi_type": "4C08-01",
		"ori_need_bill_total_money": 0,
		"pk_provider": "1796572716778651653",
		"need_bill_total_money": 0
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
999	报错具体提示信息	报错具体提示信息

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

