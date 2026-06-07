---
title: "租出合同修改"
apiId: "1722894013210034183"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Lease-out Contract"
domain: "GAM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Lease-out Contract]
platform_version: "BIP"
source_type: community-api-docs
---

# 租出合同修改

>  请求方式	POST | Lease-out Contract (GAM)


## 1. 通过OpenAPI支持新增、保存租出合同；


## 2. 支持逐一保存；


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/am/rentoutcard/update
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
data	object	否	是	合同主表
id	string	否	是	主表主键 示例：1835123930930085896
pubts	string	否	是	时间戳 示例：2024-05-22 18:43:50
contract_code	string	否	否	合同号 示例：00460
contract_name	string	否	否	合同名称 示例：00460
plan_effective_date	date
格式:yyyy-MM-dd	否	否	计划生效日期 示例：2023-03-24
effective_date	date
格式:yyyy-MM-dd	否	否	实际生效日期 示例：2023-03-24
signed_date	date
格式:yyyy-MM-dd	否	否	合同签订日期 示例：2023-03-24
end_date	date
格式:yyyy-MM-dd	否	否	计划结束日期 示例：2023-04-09
actual_end_date	date
格式:yyyy-MM-dd	否	否	实际结束日期 示例：2023-04-09
closing_date	date
格式:yyyy-MM-dd	否	否	合同终止日期 示例：2023-04-09
pk_mandept	string	否	否	经办部门id或编码 示例：1549985269801811977
pk_recorder	string	否	否	经办人id或编码 示例：1549987150994341890
pk_jobmngfil	string	否	否	项目id或编码 示例：1993200580185030664
contract_way_synergy	string	否	否	协同 示例：1
customer_way	number
小数位数:-1,最大长度:1	否	否	承租对象类型（0：员工，1：客户） 示例：1 默认值：0
customer__name	string	否	否	承租方编码 示例：1555915752028504000
retail_tenant	string	否	否	散户承租方 示例：1993200580185030664
pk_org_in	string	否	否	承租组织id或编码 示例：1549232937556246532
origcurrtypeid	string	否	否	币种id或编码 示例：1547236147129221140
currrate	number
小数位数:2,最大长度:10	否	否	汇率 示例：5.75
currrate_type	string	否	否	汇率类型 示例：1
currrate_date	date
格式:yyyy-MM-dd	否	否	汇率日期 示例：2023-04-09
deposit	number
小数位数:2,最大长度:10	否	否	押金 示例：0
e_contract	string	否	否	合同模板id或code 示例：1835123930930085895
contract_process_id	string	否	否	签署流程id或code 示例：1835123930930085895
rent_basic	object	是	否	合同基本

## 3. 请求示例

Url: /yonbip/am/rentoutcard/update?access_token=访问令牌
Body: {
	"data": {
		"id": "1835123930930085896",
		"pubts": "2024-05-22 18:43:50",
		"contract_code": "00460",
		"contract_name": "00460",
		"plan_effective_date": "2023-03-24",
		"effective_date": "2023-03-24",
		"signed_date": "2023-03-24",
		"end_date": "2023-04-09",
		"actual_end_date": "2023-04-09",
		"closing_date": "2023-04-09",
		"pk_mandept": "1549985269801811977",
		"pk_recorder": "1549987150994341890",
		"pk_jobmngfil": "1993200580185030664",
		"contract_way_synergy": "1",
		"customer_way": 1,
		"customer__name": "1555915752028504000",
		"retail_tenant": "1993200580185030664",
		"pk_org_in": "1549232937556246532",
		"origcurrtypeid": "1547236147129221140",
		"currrate": 5.75,
		"currrate_type": "1",
		"currrate_date": "2023-04-09",
		"deposit": 0,
		"e_contract": "1835123930930085895",
		"contract_process_id": "1835123930930085895",
		"rent_basic": [
			{
				"id": "1835123930930085895",
				"pubts": "2024-05-22 18:43:50",
				"pk_equip": "132434343434",
				"pk_category": "132434343433434",
				"pk_material": "132434343433434",
				"pk_rent_object__rent_object": "136575343433434",
				"planned_lease_out_date": "2023-03-24",
				"begin_calculate_date": "2023-03-24",
				"planned_return_date": "2023-04-07",
				"rental_unit": "3",
				"rental_period": 1,
				"tax_id": "237462837428",
				"cycle_rent": 66666,
				"collection_period": 1,
				"rent_cycle_scheme": "0",
				"collection_date_type": "0",
				"specific_collection_date": "2023-04-07",
				"rent_count_style": "0",
				"pk_rent_count_method": "12342423432423",
				"_status": "Update",
				"pack_flag": true,
				"contain_subequip": true,
				"equip_status": "0",
				"num": 1,
				"memo": "备注",
				"rent_basic_cycleprice": [
					{
						"id": "1993200580185030664",
						"pubts": "2023-04-07",
						"begin_date": "2023-03-24",
						"end_date": "2023-04-09",
						"cycle_rent": 66666,
						"_status": "Update"
					}
				],
				"rent_basic_equippack": [
					{
						"id": "1993200580185030664",
						"pubts": "2024-05-22 18:43:50",
						"pk_equip": "1993200580185030664",
						"pk_rent_object": "1993200580185030664",
						"out_flag": true,
						"memo": "备注",
						"_status": "Update"
					}
				]
			}
		]
	}
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
code	string	否	返回编码 示例：200
message	string	否	返回信息 示例：操作成功！
data	object	否	返回数据
id	string	否	合同主表主键 示例：1687513498448822279
pk_org	string	否	出租组织主键 示例：1549238289085497348
pk_org__name	string	否	出租组织 示例：LYL
bill_code	string	否	合同编码 示例：ZCHT202303240001
contract_code	string	否	合同号 示例：00460
contract_name	string	否	合同名称 示例：00460
contract_code_v	long	否	合同版本号 示例：2
bill_status	long	否	合同状态（0：开立，1：已审核 ，2：已关闭 ，3：审核中，:7：生效，8：冻结，9：终止） 示例：7
contract_way	long	否	租赁方式（0: 外部租赁，1：内部租赁-协同，2：内部租赁-单方） 示例：0
contract_type	long	否	合同类型（0：框架协议，1：快捷租赁） 示例：0
beginning_of_period	boolean	否	期初 示例：false
plan_effective_date	string	否	计划生效日期 示例：2023-03-24
effective_date	string	否	实际生效日期 示例：2023-03-24
signed_date	string	否	合同签订日期 示例：2023-03-24
end_date	string	否	计划结束日期 示例：2023-04-09
actual_end_date	string	否	实际结束日期 示例：2023-04-09
cycle	long	否	合同周期（天） 示例：17
pk_fiorg	string	否	出租会计主体主键 示例：1549238289085497348
pk_fiorg__name	string	否	出租会计主体 示例：LYL
customer_out	string	否	出租方主键 示例：12131232131231321
customer_out__name	string	否	出租方 示例：出租方
pk_raorg	string	否	出租利润中心主键 示例：12131232131231321
pk_raorg__name	string	否	出租利润中心 示例：出租利润中心
pk_mandept	string	否	经办部门主键 示例：1549985269801811977
pk_mandept__name	string	否	经办部门 示例：资产部
pk_recorder	string	否	经办人主键 示例：1549987150994341890
pk_recorder__name	string	否	经办人 示例：资产-小刘
pk_jobmngfil	string	否	项目主键 示例：12312321312312
pk_jobmngfil__name	string	否	项目 示例：项目
renewed	boolean	否	已续签 示例：false
synergy	boolean	否	由协同生成 示例：false
bill_type	string	否	单据类型 示例：4BL0
pk_transitype	string	否	交易类型 示例：1547236147129223598
transi_type	string	否	交易类型编码 示例：4BL0-01
isWfControlled	boolean	否	是否审批流控制 示例：false
memo	string	否	备注 示例：备注
taxation_flag	boolean	否	同步税务 示例：false
taxation_result	string	否	同步税务异常信息 示例：税务异常信息
returncount	long	否	退回次数 示例：0
creator	string	否	创建人主键 示例：31b31483-645e-4f54-a4b3-817cfb17554e
creator__name	string	否	创建人 示例：昵称-刘艳丽
creationtime	string	否	创建时间 示例：2023-03-24 10:19:51
modifier	string	否	最后修改人主键 示例：31b31483-645e-4f54-a4b3-817cfb17554e
modifier__name	string	否	最后修改人 示例：昵称-刘艳丽
modifiedtime	string	否	最后修改时间 示例：2023-03-24 10:19:51
billmaker	string	否	制单人主键 示例：31b31483-645e-4f54-a4b3-817cfb17554e
billmaker__name	string	否	制单人 示例：昵称-刘艳丽
billmaketime	string	否	制单时间 示例：2023-03-24 10:19:51
auditor	string	否	审批人主键 示例：31b31483-645e-4f54-a4b3-817cfb17554e
auditor__name	string	否	审核人 示例：昵称-刘艳丽
audittime	string	否	审批时间 示例：2023-03-24 10:19:51
check_opinion	string	否	审批意见 示例：审批意见
src_pk_bill	string	否	来源单据主键 示例：1687272671060426755
src_bill_type	string	否	来源单据类型 示例：4BL0
src_transitype	string	否	来源交易类型 示例：4BL0-01
contract_v	boolean	否	合同最新版本 示例：true
verifystate	long	否	审批状态 （0：开立，1：审批中，2：审批通过，3：流程终止，4：退回制单） 示例：2
settlement_amount	BigDecimal	否	含税累计结算租金 示例：133332
calculate_rent	BigDecimal	否	含税累计收款租金 示例：0
amount_collected	BigDecimal	否	含税累计收款租金 示例：0
settlement_amount_currency	BigDecimal	否	本币含税累计结算租金 示例：133332
notaxsettlement_amount	BigDecimal	否	无税累计结算租金 示例：133332
notaxsettlement_amount_currency	BigDecimal	否	本币无税累计结算租金 示例：133332
settlement_amount_tax	BigDecimal	否	累计结算税额 示例：0
settlement_amount_tax_currency	BigDecimal	否	本币累计结算税额 示例：0
notaxcalculate_rent	BigDecimal	否	无税累计收款租金 示例：0
calculate_rent_currency	BigDecimal	否	本币含税累计收款租金 示例：23
notaxcalculate_rent_currency	BigDecimal	否	本币无税累计收款租金 示例：0
calculate_rent_tax	BigDecimal	否	累计收款税额 示例：0
calculate_rent_tax_currency	BigDecimal	否	本币累计收款税额 示例：0
customer_way	long	否	承租对象类型（0：员工，1：客户） 示例：1
customer	long	否	承租方主键 示例：1555915752028504000
customer__name	string	否	承租方 示例：大客户租赁
pk_org_in	string	否	承租组织主键 示例：1549232937556246532
pk_org_in__name	string	否	承租组织 示例：HT-Org-0915
pk_org_in__finorgid	string	否	承租会计主体 示例：1549232937556246532
retail_tenant	string	否	散户承租方 示例：散户承租方
customer__retailInvestors	boolean	否	承租方是否散户 示例：true
origcurrtypeid	string	否	币种主键 示例：1547236147129221140
origcurrtypeid__name	string	否	币种 示例：人民币
origcurrtypeid__moneyRount	long	否	币种金额舍入规则 示例：4
origcurrtypeid__priceRount	long	否	币种单价舍入规则 示例：4
origcurrtypeid__priceDigit	long	否	币种单价精度 示例：8
origcurrtypeid__moneyDigit	long	否	币种精度 示例：8
pk_currency	string	否	本币币种主键 示例：1547236147129221140
pk_currency__name	string	否	本币币种 示例：人民币
pk_currency__moneyDigit	long	否	本币币种精度 示例：8
pk_currency__priceDigit	long	否	本币币种单价精度 示例：8
pk_currency__moneyRount	long	否	本币币种金额舍入规则 示例：4
pk_currency__priceRount	long	否	本币币种单价舍入规则 示例：4
currrate	BigDecimal	否	汇率 示例：1
currrate_type	string	否	汇率类型主键 示例：0000L84AQ6V4GXJ0260000
currrate_type__name	string	否	汇率类型 示例：基准汇率
currrate_date	string	否	汇率日期 示例：2023-03-24
currrate_type__digit	long	否	汇率精度 示例：7
deposit	BigDecimal	否	押金 示例：0
deposit_currency	BigDecimal	否	本币押金 示例：0
deposit_collection	BigDecimal	否	押金余额 示例：0
deposit_collection_currency	BigDecimal	否	本币押金余额 示例：0
confirmed	boolean	否	已确认 示例：false
pk_identify_user	string	否	确认人主键 示例：31b31483-645e-4f54-a4b3-817cfb17554e
pk_identify_user__name	string	否	确认人 示例：昵称-刘艳丽
identify_date	string	否	确认时间 示例：2023-03-24 10:19:51
confirmation_description	string	否	确认说明 示例：确认说明
e_contract	string	否	合同模板 示例：13213232423434
e_contract_name	string	否	合同模板 示例：合同模板
e_contract_code	string	否	模板code 示例：2342
contract_process_id_name	string	否	签署流程 示例：签署流程
contract_process_code	string	否	签署流程code 示例：13221323
contract_process_id	string	否	签署流程主键 示例：132232432432432
cutoff_time	string	否	签署时限 示例：2023-03-24 10:19:51
sign_status	long	否	签署状态 （0：草稿，1：签署中，2：已完成，3：已撤销，4：已终止，5：已过期，6：已删除，7：已拒签） 示例：1
e_contract_url	string	否	合同地址 示例：www:xxx
sign_user	string	否	签署人 示例：签署人
sign_date	string	否	签署时间 示例：2023-03-24 10:19:51
rent_basic	object	是	合同基本
rent_detailed	object	是	租出明细
rent_change	object	是	合同变更
rent_process	object	是	执行过程
rent_situation	object	是	主要业务情况
rent_calculation	object	是	租金计算明细
rent_settlement	object	是	结算收款情况
pubts	string	否	时间戳 示例：2023-03-25 08:00:51

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功！",
	"data": {
		"id": "1687513498448822279",
		"pk_org": "1549238289085497348",
		"pk_org__name": "LYL",
		"bill_code": "ZCHT202303240001",
		"contract_code": "00460",
		"contract_name": "00460",
		"contract_code_v": 2,
		"bill_status": 7,
		"contract_way": 0,
		"contract_type": 0,
		"beginning_of_period": false,
		"plan_effective_date": "2023-03-24",
		"effective_date": "2023-03-24",
		"signed_date": "2023-03-24",
		"end_date": "2023-04-09",
		"actual_end_date": "2023-04-09",
		"cycle": 17,
		"pk_fiorg": "1549238289085497348",
		"pk_fiorg__name": "LYL",
		"customer_out": "12131232131231321",
		"customer_out__name": "出租方",
		"pk_raorg": "12131232131231321",
		"pk_raorg__name": "出租利润中心",
		"pk_mandept": "1549985269801811977",
		"pk_mandept__name": "资产部",
		"pk_recorder": "1549987150994341890",
		"pk_recorder__name": "资产-小刘",
		"pk_jobmngfil": "12312321312312",
		"pk_jobmngfil__name": "项目",
		"renewed": false,
		"synergy": false,
		"bill_type": "4BL0",
		"pk_transitype": "1547236147129223598",
		"transi_type": "4BL0-01",
		"isWfControlled": false,
		"memo": "备注",
		"taxation_flag": false,
		"taxation_result": "税务异常信息",
		"returncount": 0,
		"creator": "31b31483-645e-4f54-a4b3-817cfb17554e",
		"creator__name": "昵称-刘艳丽",
		"creationtime": "2023-03-24 10:19:51",
		"modifier": "31b31483-645e-4f54-a4b3-817cfb17554e",
		"modifier__name": "昵称-刘艳丽",
		"modifiedtime": "2023-03-24 10:19:51",
		"billmaker": "31b31483-645e-4f54-a4b3-817cfb17554e",
		"billmaker__name": "昵称-刘艳丽",
		"billmaketime": "2023-03-24 10:19:51",
		"auditor": "31b31483-645e-4f54-a4b3-817cfb17554e",
		"auditor__name": "昵称-刘艳丽",
		"audittime": "2023-03-24 10:19:51",
		"check_opinion": "审批意见",
		"src_pk_bill": "1687272671060426755",
		"src_bill_type": "4BL0",
		"src_transitype": "4BL0-01",
		"contract_v": true,
		"verifystate": 2,
		"settlement_amount": 133332,
		"calculate_rent": 0,
		"amount_collected": 0,
		"settlement_amount_currency": 133332,
		"notaxsettlement_amount": 133332,
		"notaxsettlement_amount_currency": 133332,
		"settlement_amount_tax": 0,
		"settlement_amount_tax_currency": 0,
		"notaxcalculate_rent": 0,
		"calculate_rent_currency": 23,
		"notaxcalculate_rent_currency": 0,
		"calculate_rent_tax": 0,
		"calculate_rent_tax_currency": 0,
		"customer_way": 1,
		"customer": 1555915752028504000,
		"customer__name": "大客户租赁",
		"pk_org_in": "1549232937556246532",
		"pk_org_in__name": "HT-Org-0915",
		"pk_org_in__finorgid": "1549232937556246532",
		"retail_tenant": "散户承租方",
		"customer__retailInvestors": true,
		"origcurrtypeid": "1547236147129221140",
		"origcurrtypeid__name": "人民币",
		"origcurrtypeid__moneyRount": 4,
		"origcurrtypeid__priceRount": 4,
		"origcurrtypeid__priceDigit": 8,
		"origcurrtypeid__moneyDigit": 8,
		"pk_currency": "1547236147129221140",
		"pk_currency__name": "人民币",
		"pk_currency__moneyDigit": 8,
		"pk_currency__priceDigit": 8,
		"pk_currency__moneyRount": 4,
		"pk_currency__priceRount": 4,
		"currrate": 1,
		"currrate_type": "0000L84AQ6V4GXJ0260000",
		"currrate_type__name": "基准汇率",
		"currrate_date": "2023-03-24",
		"currrate_type__digit": 7,
		"deposit": 0,
		"deposit_currency": 0,
		"deposit_collection": 0,
		"deposit_collection_currency": 0,
		"confirmed": false,
		"pk_identify_user": "31b31483-645e-4f54-a4b3-817cfb17554e",
		"pk_identify_user__name": "昵称-刘艳丽",
		"identify_date": "2023-03-24 10:19:51",
		"confirmation_description": "确认说明",
		"e_contract": "13213232423434",
		"e_contract_name": "合同模板",
		"e_contract_code": "2342",
		"contract_process_id_name": "签署流程",
		"contract_process_code": "13221323",
		"contract_process_id": "132232432432432",
		"cutoff_time": "2023-03-24 10:19:51",
		"sign_status": 1,
		"e_contract_url": "www:xxx",
		"sign_user": "签署人",
		"sign_date": "2023-03-24 10:19:51",
		"rent_basic": [
			{
				"id": "1687513498448822280",
				"main_id": "1687513498448822279",
				"pubts": "2023-03-24 18:07:08",
				"pk_equip": "132434343434",
				"pk_equip__equip_name": "11",
				"pk_equip__equip_code": "11",
				"pk_equip__spec": "规格",
				"model": "型号",
				"pk_category": "132434343433434",
				"pk_category__category_name": "资产类别名称",
				"pk_material": "132434343433434",
				"pk_material__code": "4353453",
				"pk_material__name": "物料名称",
				"pk_rent_object": "136575343433434",
				"pk_rent_object__rent_object": "136575343433434",
				"pk_rent_object__rent_object_explain": "租赁对象描述",
				"pk_rent_object__spec": "租赁对象规格",
				"pk_rent_object__model": "租赁对象型号",
				"planned_lease_out_date": "2023-03-24",
				"begin_calculate_date": "2023-03-24",
				"planned_return_date": "2023-04-07",
				"rental_unit": "3",
				"rental_period": 1,
				"tax_id": "237462837428",
				"tax_id__code": "VAT6",
				"tax_rate": 0.06,
				"cycle_rent": 66666,
				"notaxcycle_rent": 66666,
				"cycle_rent_currency": 66666,
				"notaxcycle_rent_currency": 66666,
				"collection_period": 1,
				"rent_cycle_scheme": "0",
				"collection_date_type": "0",
				"specific_collection_date": "2023-04-07",
				"rent_count_style": "0",
				"pk_rent_count_method": "12342423432423",
				"pk_rent_count_method__name": "租金计算方法名称",
				"less_cycle_rent": 9523.71428571,
				"less_cycle_rent_currency": 9523.71428571,
				"notaxless_cycle_rent": 9523.71428571,
				"notaxless_cycle_rent_currency": 9523.71428571,
				"num": 1,
				"planned_life_cycle": 17,
				"use_requirements": "使用要求",
				"rent_holiday": 0,
				"memo": "备注",
				"rent_basic_cycleprice": [
					{
						"id": "1687513498448822281",
						"main_id": "1687513498448822279",
						"rent_basic_id": "1687513498448822280",
						"begin_date": "2023-03-24",
						"end_date": "2023-04-09",
						"cycle_rent": 66666,
						"notaxcycle_rent": 66666,
						"cycle_rent_currency": 66666,
						"notaxcycle_rent_currency": 66666,
						"src_pk_bill": "1687513498448822279",
						"src_pk_bill_b": "1687513498448822280",
						"pubts": "2023-03-24 18:07:08"
					}
				]
			}
		],
		"rent_detailed": [
			{
				"rent_basic_id": "1687513498448822280",
				"rent_detailedid": "1687513498448822282",
				"id": "1687513498448822282",
				"main_id": "1687513498448822279",
				"pubts": "2023-03-24 18:07:08",
				"rent_out_handover": "1687273409794801669",
				"rent_detailed__src_pk_bill": "1687273409794801669",
				"rent_out_handover_b": "1687273409794801670",
				"rent_out_handover__bill_code": "ZCJJ202303240001",
				"rent_out_handover_b__pk_equip": "1664271652285317125",
				"rent_out_handover_b__pk_equip__equip_code": "EAM-TEST-01022023022100000103",
				"rent_out_handover_b__pk_equip__equip_name": "租金变动-归还",
				"rent_out_handover_b__pk_category": "1604357099037917200",
				"rent_out_handover_b__pk_category__category_name": "组装兼容赛扬",
				"rent_out_handover_b__pk_equip__spec": "大",
				"rent_out_handover_b__pk_equip__model": "小",
				"rent_out_handover_b__pk_rent_object": "123123213213213",
				"rent_out_handover_b__pk_rent_object__rent_object": "22222",
				"rent_out_handover_b__pk_rent_object__rent_object_explain": "22222",
				"rent_out_handover_b__pk_rent_object__spec": "规格",
				"rent_out_handover_b__pk_rent_object__model": "型号",
				"rent_out_handover_b__pk_material": "1232423432432",
				"rent_out_handover_b__pk_material__code": "2323",
				"rent_out_handover_b__pk_material__name": "物料名称",
				"rent_out_handover_b__rent_type": "3",
				"rent_out_handover_b__rental_period": 1,
				"rent_out_handover_b__cycle_rent": 66666,
				"tax_id": "12312341423142",
				"tax_id__code": "VAT6",
				"tax_rate": 0.06,
				"notaxcycle_rent": 66666,
				"cycle_rent_currency": 66666,
				"notaxcycle_rent_currency": 66666,
				"gather_money": 66666,
				"gather_money_currency": 66666,
				"notaxlgather_money": 66666,
				"notaxlgather_money_currency": 66666,
				"gather_money_tax": 0,
				"gather_money_tax_currency": 0,
				"amount_collected": 0,
				"amount_collected_currency": 0,
				"notaxamount_collected": 0,
				"notaxamount_collected_currency": 0,
				"amount_collected_tax": 0,
				"amount_collected_tax_currency": 0,
				"rent_out_handover_b__collection_period": 1,
				"rent_cycle_scheme": "0",
				"rent_out_handover_b__collection_date_type": "0",
				"rent_out_handover_b__specific_collection_date": "2023-06-27",
				"rent_out_handover_b__rent_count_style": "0",
				"rent_out_handover_b__pk_rent_count_method": "12321423424",
				"rent_out_handover_b__pk_rent_count_method__name": "计算名称",
				"rent_out_handover_b__less_cycle_rent": 9523.71428571,
				"less_cycle_rent_currency": 9523.71428571,
				"notaxless_cycle_rent": 9523.71428571,
				"notaxless_cycle_rent_currency": 9523.71428571,
				"rent_out_handover_b__pk_jobmngfil__name": "项目",
				"rent_out_handover_b__rent_out_date": "2023-03-24",
				"rent_out_handover_b__rent_out_begin_date": "2023-03-24",
				"rent_out_handover_b__end_date": "2023-04-09",
				"rent_out_handover_b__use_requirements": "使用要求",
				"rent_holiday": 0,
				"rent_out_handover_b__return_id": "1132312312321323",
				"rent_out_handover_b__return_code": "ZCGH121323423434",
				"rent_out_handover_b__back_flag": false,
				"rent_out_handover_b__return_date": "2023-04-09",
				"rent_out_handover_b__memo": "备注",
				"rent_out_handover_b__planned_return_date": "2023-04-09",
				"rent_detailed_cycleprice": [
					{
						"id": "1687513498448822281",
						"main_id": "1687513498448822279",
						"rent_basic_id": "1687513498448822280",
						"lease_out_details": "1687513498448822282",
						"begin_date": "2023-03-24",
						"end_date": "2023-04-09",
						"cycle_rent": 66666,
						"notaxcycle_rent": 66666,
						"cycle_rent_currency": 66666,
						"notaxcycle_rent_currency": 66666,
						"src_pk_bill": "1687513498448822279",
						"src_pk_bill_b": "1687513498448822280",
						"pubts": "2023-03-24 18:07:08"
					}
				]
			}
		],
		"rent_change": [
			{
				"contract_change": "HTBG202303240001",
				"src_transitype": "租出合同基本变更",
				"executor__name": "资产-小刘",
				"execution_date": "2023-03-24",
				"memo": "人民币"
			}
		],
		"rent_process": [
			{
				"id": "1687513507038756870",
				"main_id": "1687513498448822279",
				"pubts": "2023-03-24 18:07:08",
				"executor": "31b31483-645e-4f54-a4b3-817cfb17554e",
				"executor__name": "昵称-刘艳丽",
				"execution_date": "2023-03-24",
				"execution_process": "approve",
				"memo": "原因"
			}
		],
		"rent_situation": [
			{
				"bill_type_name": "租出交接",
				"src_transitype_name": "租出交接",
				"business_no": "ZCJJ202303240001",
				"pk_recorder": "1549987150994341890",
				"pk_recorder__name": "资产-小刘",
				"pk_mandept": "1549985269801811977",
				"pk_mandept__name": "资产部",
				"pk_recorder_date": "2023-03-24",
				"memo": "备注",
				"type": "4BL4",
				"src_transitype": "4BL4-01"
			}
		],
		"rent_calculation": [
			{
				"id": "1687513498448822284",
				"main_id": "1687513498448822279",
				"lease_out_details": "1687513498448822282",
				"pubts": "2023-03-25 08:00:51",
				"pk_equip": "1664271652285317125",
				"pk_equip__equip_code": "EAM-TEST-01022023022100000103",
				"pk_equip__equip_name": "租金变动-归还",
				"pk_category": "1664271652285317125",
				"pk_category__category_name": "租金变动-归还",
				"pk_equip__spec": "大",
				"pk_equip__model": "小",
				"pk_rent_object": "132324242423",
				"pk_rent_object__rent_object": "3333",
				"pk_rent_object__rent_object_explain": "3333",
				"pk_rent_object__spec": "3333",
				"pk_rent_object__model": "3333",
				"rent_type": "3",
				"rental_period": 1,
				"collection_period": 1,
				"rent_cycle_scheme": "0",
				"collection_date_type": "0",
				"specific_collection_date": "2023-03-24",
				"rent_calmode": "0",
				"pk_cal_means": "123123232",
				"pk_cal_means__name": "123232",
				"cycle_rent": 66666,
				"notaxcycle_rent": 66666,
				"cycle_rent_currency": 66666,
				"notaxcycle_rent_currency": 66666,
				"start_date": "2023-03-24",
				"end_date": "2023-03-30",
				"receivable_date": "2023-03-24",
				"incomplete_period_day": 0,
				"less_cycle_rent": 9523.71428571,
				"less_cycle_rent_currency": 9523.71428571,
				"notaxless_cycle_rent": 9523.71428571,
				"notaxless_cycle_rent_currency": 9523.71428571,
				"gather_money": 66666,
				"gather_money_currency": 66666,
				"notaxlgather_money": 66666,
				"notaxlgather_money_currency": 66666,
				"gather_money_tax": 0,
				"gather_money_tax_currency": 0,
				"adjustment_rent_after": 0,
				"adjustment_rent_after_currency": 0,
				"notaxadjustment_rent_after": 0,
				"notaxadjustment_rent_after_currency": 0,
				"adjustment_rent_after_tax": 0,
				"adjustment_rent_after_tax_currency": 0,
				"amount_collected": 100,
				"amount_collected_currency": 100,
				"notaxamount_collected": 100,
				"notaxamount_collected_currency": 100,
				"amount_collected_tax_currency": 0,
				"amount_collected_tax": 0,
				"receivable_flag": false,
				"use_tech": "使用要求",
				"memo": "备注",
				"taxation_flag": "taxation_result",
				"calculate_flag": true,
				"tax_id": "123132143224324",
				"tax_id__code": "VAT6",
				"tax_rate": 0
			}
		],
		"rent_settlement": [
			{
				"id": "1687943201348911112",
				"main_id": "1687513498448822279",
				"pubts": "2023-03-25 08:00:51",
				"rent_settlement": "1687943201348911109",
				"rent_settlement__bill_code": "ZCJS202303250005",
				"billmaketime": "2023-03-25",
				"gather_money": 66666,
				"settlement_amount_currency": 66666,
				"notaxsettlement_amount": 66666,
				"notaxsettlement_amount_currency": 66666,
				"settlement_amount_tax": 0,
				"settlement_amount_tax_currency": 0,
				"calculate_rent": 10,
				"amount_collected_currency": 10,
				"notaxamount_collected_currency": 10,
				"notaxamount_amount_collected_tax": 0,
				"amount_collected_tax_currency": 0
			}
		],
		"pubts": "2023-03-25 08:00:51"
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
code	服务端逻辑异常	服务端逻辑异常

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

