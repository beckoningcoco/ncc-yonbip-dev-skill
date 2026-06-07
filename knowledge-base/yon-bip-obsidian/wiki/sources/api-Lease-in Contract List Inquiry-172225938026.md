---
title: "租出交接来源生单保存"
apiId: "1722259380263976961"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Lease-in Contract"
domain: "GAM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Lease-in Contract]
platform_version: "BIP"
source_type: community-api-docs
---

# 租出交接来源生单保存

>  请求方式	POST | Lease-in Contract (GAM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/am/lomrentdivertcard/save
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
data	object	是	否	租出交接
bill_code	string	否	否	单据编码 示例：ZCJJ202406110001
pk_record_date	date
格式:yyyy-MM-dd	否	否	经办日期 示例：2024-06-11
pk_recorder	string	否	否	经办人id或code 示例：1976253781712568326或00000001
pk_dept	string	否	否	经办部门id或code 示例：1976253781712568326或033bx
currrate	number
小数位数:6,最大长度:10	否	否	汇率 示例：1.000000
currrate_type	string	否	否	汇率类型id或code 示例：0000LUOWYQE74EIUBN0000或01
currrate_date	date
格式:yyyy-MM-dd	否	否	汇率日期 示例：2024-06-11 00:00:00
memo	string	否	否	备注 示例：1969341280960380937
src_pk_bill	string	否	是	上游单据id 示例：2017736938005463043
bodyvos	object	是	否	租出交接明细

## 3. 请求示例

Url: /yonbip/am/lomrentdivertcard/save?access_token=访问令牌
Body: {
	"data": [
		{
			"bill_code": "ZCJJ202406110001",
			"pk_record_date": "2024-06-11",
			"pk_recorder": "1976253781712568326或00000001",
			"pk_dept": "1976253781712568326或033bx",
			"currrate": 1,
			"currrate_type": "0000LUOWYQE74EIUBN0000或01",
			"currrate_date": "2024-06-11 00:00:00",
			"memo": "1969341280960380937",
			"src_pk_bill": "2017736938005463043",
			"bodyvos": [
				{
					"src_pk_bill": "2017736938005463043",
					"src_pk_bill_b": "2017736938005463044",
					"pk_equip": "2017718469739937799或202405090485",
					"pk_rent_object": "201771846973993",
					"rent_out_date": "2024-06-11",
					"rent_out_begin_date": "2024-06-11",
					"planned_return_date": "2024-06-29",
					"rent_holiday": 0,
					"tax_id": "2017718469739937",
					"contain_subequip": true,
					"specific_collection_date": "2024-06-29"
				}
			]
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
code	number
小数位数:0,最大长度:10	否	code 示例：200
message	string	否	message 示例：操作成功！
data	object	否	data
_entityName	string	否	_entityName
_keyName	string	否	_keyName
pk_org__name	string	否	pk_org__name 示例：HT资产组织
bill_code	string	否	bill_code 示例：ZCJJ202406110001
pk_dept__name	string	否	pk_dept__name 示例：HT租赁一部
bill_status	number
小数位数:0,最大长度:10	否	bill_status 示例：0
pk_jobmngfil__name	string	否	pk_jobmngfil__name
pk_fiorg__name	string	否	pk_fiorg__name 示例：HT资产组织
pk_raorg__name	string	否	pk_raorg__name 示例：HT资产组织
origcurrtypeid__name	string	否	origcurrtypeid__name 示例：人民币
pk_currency__name	string	否	pk_currency__name 示例：人民币
currrate	number
小数位数:0,最大长度:10	否	currrate 示例：1
currrate_type__name	string	否	currrate_type__name 示例：基准汇率
currrate_date	string	否	currrate_date 示例：2024-06-11 00:00:00
contract_way	number
小数位数:0,最大长度:10	否	contract_way 示例：0
be_synergy	boolean	否	be_synergy 示例：false
confirmed	boolean	否	confirmed 示例：false
verifystate	number
小数位数:0,最大长度:10	否	verifystate 示例：0
postAccountStatus	number
小数位数:0,最大长度:10	否	postAccountStatus 示例：0
id	string	否	id 示例：2017737565070688265
pk_psndoc__name	string	否	pk_psndoc__name
pubts	string	否	pubts 示例：2024-07-03 09:53:39
sysid	string	否	sysid 示例：LOM
pk_org	string	否	pk_org 示例：1969341280960380937
customer_way	number
小数位数:0,最大长度:10	否	customer_way 示例：1
pk_fiorg	string	否	pk_fiorg 示例：1969341280960380937
pk_raorg	string	否	pk_raorg 示例：1969341280960380937
pk_dept	string	否	pk_dept 示例：1976253781712568326
synergy	boolean	否	synergy 示例：false
origcurrtypeid	string	否	origcurrtypeid 示例：1969308072258043953
origcurrtypeid__moneyDigit	string	否	origcurrtypeid__moneyDigit 示例：2
billmaker	string	否	billmaker 示例：ffde1766-84ad-4059-abd4-7f1a7c451354
billmaker__name	string	否	billmaker__name 示例：G.tao
billmaketime	string	否	billmaketime 示例：2024-06-11 16:46:08
modifier	string	否	modifier 示例：ffde1766-84ad-4059-abd4-7f1a7c451354
modifier__name	string	否	modifier__name 示例：G.tao
modifiedtime	string	否	modifiedtime 示例：2024-07-03 09:53:37
auditor__name	string	否	auditor__name
creator	string	否	creator 示例：ffde1766-84ad-4059-abd4-7f1a7c451354
creator__name	string	否	creator__name 示例：G.tao
creationtime	string	否	creationtime 示例：2024-06-11 16:46:08
pk_currency	string	否	pk_currency 示例：1969308072258043953
pk_currency__moneyDigit	string	否	pk_currency__moneyDigit 示例：2
currrate_type	string	否	currrate_type 示例：0000LUOWYQE74EIUBN0000
currrate_type__digit	string	否	currrate_type__digit 示例：6
origcurrtypeid__priceDigit	string	否	origcurrtypeid__priceDigit 示例：2
transi_type	string	否	transi_type 示例：4BL4-01
pk_transitype	string	否	pk_transitype 示例：1969308072258045458
bill_type	string	否	bill_type 示例：4BL4
isWfControlled	boolean	否	isWfControlled 示例：false
returncount	number
小数位数:0,最大长度:10	否	returncount 示例：0
src_pk_bill	string	否	src_pk_bill 示例：2017736938005463043
src_bill_type	string	否	src_bill_type 示例：4BL0
pk_currency__priceDigit	string	否	pk_currency__priceDigit 示例：2
isFlowCoreBill	boolean	否	isFlowCoreBill 示例：false
bodyvos	object	是	bodyvos
_status	string	否	_status
resubmitCheckKey	string	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
pk_org_	string	否	pk_org_ 示例：1969341280960380937
pk_dept_	string	否	pk_dept_ 示例：1976253781712568326

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功！",
	"data": {
		"_entityName": "",
		"_keyName": "",
		"pk_org__name": "HT资产组织",
		"bill_code": "ZCJJ202406110001",
		"pk_dept__name": "HT租赁一部",
		"bill_status": 0,
		"pk_jobmngfil__name": "",
		"pk_fiorg__name": "HT资产组织",
		"pk_raorg__name": "HT资产组织",
		"origcurrtypeid__name": "人民币",
		"pk_currency__name": "人民币",
		"currrate": 1,
		"currrate_type__name": "基准汇率",
		"currrate_date": "2024-06-11 00:00:00",
		"contract_way": 0,
		"be_synergy": false,
		"confirmed": false,
		"verifystate": 0,
		"postAccountStatus": 0,
		"id": "2017737565070688265",
		"pk_psndoc__name": "",
		"pubts": "2024-07-03 09:53:39",
		"sysid": "LOM",
		"pk_org": "1969341280960380937",
		"customer_way": 1,
		"pk_fiorg": "1969341280960380937",
		"pk_raorg": "1969341280960380937",
		"pk_dept": "1976253781712568326",
		"synergy": false,
		"origcurrtypeid": "1969308072258043953",
		"origcurrtypeid__moneyDigit": "2",
		"billmaker": "ffde1766-84ad-4059-abd4-7f1a7c451354",
		"billmaker__name": "G.tao",
		"billmaketime": "2024-06-11 16:46:08",
		"modifier": "ffde1766-84ad-4059-abd4-7f1a7c451354",
		"modifier__name": "G.tao",
		"modifiedtime": "2024-07-03 09:53:37",
		"auditor__name": "",
		"creator": "ffde1766-84ad-4059-abd4-7f1a7c451354",
		"creator__name": "G.tao",
		"creationtime": "2024-06-11 16:46:08",
		"pk_currency": "1969308072258043953",
		"pk_currency__moneyDigit": "2",
		"currrate_type": "0000LUOWYQE74EIUBN0000",
		"currrate_type__digit": "6",
		"origcurrtypeid__priceDigit": "2",
		"transi_type": "4BL4-01",
		"pk_transitype": "1969308072258045458",
		"bill_type": "4BL4",
		"isWfControlled": false,
		"returncount": 0,
		"src_pk_bill": "2017736938005463043",
		"src_bill_type": "4BL0",
		"pk_currency__priceDigit": "2",
		"isFlowCoreBill": false,
		"bodyvos": [
			{
				"_entityName": "",
				"_keyName": "",
				"notaxcycle_rent_currency": 6,
				"gather_money_currency": 6,
				"planned_return_date": "2024-06-29 00:00:00",
				"rental_period": 1,
				"equip_status": 0,
				"src_pk_bill_b": "2017736938005463044",
				"less_cycle_rent": 0.2,
				"rent_count_style": "0",
				"pk_equip__equip_code": "202406110001",
				"contract_code": "我",
				"id": "2017737565070688266",
				"pk_status_after": "PRESET01_0000LUOWYQE74EIUBN0000",
				"gather_money": 6,
				"area": 0,
				"rent_type": "4",
				"cycle_rent_currency": 6,
				"status_date_before": "2024-06-11 00:00:00",
				"equip_name": "我",
				"notaxcycle_rent": 6,
				"rent_cycle_scheme": "0",
				"contract_bill_code": "ZCHT202406110001",
				"less_cycle_rent_currency": 0.2,
				"gather_money_tax_currency": 0,
				"notaxless_cycle_rent_currency": 0.2,
				"end_date": "2024-06-29 00:00:00",
				"src_pk_bill": "2017736938005463043",
				"pk_usedorg_before__name": "HT资产组织",
				"rent_out_begin_date": "2024-06-11 00:00:00",
				"back_flag": false,
				"cycle_rent": 6,
				"collection_date_type": "0",
				"status_date_after": "2024-06-11 00:00:00",
				"pk_equip__pk_category": "1971168935558512642",
				"rent_out_date": "2024-06-11 00:00:00",
				"pk_usedorg_before": "1969341280960380937",
				"notaxless_cycle_rent": 0.2,
				"asset_type": 0,
				"rent_holiday": 0,
				"pk_status_before": "PRESET01_0000LUOWYQE74EIUBN0000",
				"pk_category__category_name": "装卸机械",
				"main_id": "2017737565070688265",
				"contract_name": "我",
				"pk_category": "1971168935558512642",
				"notaxlgather_money": 6,
				"pk_equip": "2017718469739937799",
				"collection_period": 1,
				"notaxlgather_money_currency": 6,
				"gather_money_tax": 0,
				"pk_equip__pk_category__category_name": "装卸机械",
				"pk_equip__equip_name": "我",
				"rent_detailed_cycleprice": [
					{
						"cycle_rent_tax": "0",
						"cycle_rent_tax_currency": "0",
						"dr": "0",
						"less_cycle_rent_tax": "0",
						"less_cycle_rent_tax_currency": "0",
						"id": "2017736938005463045",
						"main_id": "2017736938005463043",
						"pubts": "2024-06-11 16:44:04",
						"rent_basic_id": "2017736938005463044",
						"begin_date": "2024-06-11",
						"end_date": "2024-06-29",
						"cycle_rent": "6",
						"notaxcycle_rent": "6",
						"cycle_rent_currency": "6",
						"notaxcycle_rent_currency": "6",
						"less_cycle_rent": "0.2",
						"notaxless_cycle_rent": "0.2",
						"less_cycle_rent_currency": "0.2",
						"notaxless_cycle_rent_currency": "0.2"
					}
				],
				"pk_org": "1969341280960380937",
				"pk_usedorg_before_": "1969341280960380937",
				"_status": ""
			}
		],
		"_status": "",
		"resubmitCheckKey": "lom_rentdivert_card_edit_73df6991-ec66-472a-8d3d-5f77662d9a5b",
		"pk_org_": "1969341280960380937",
		"pk_dept_": "1976253781712568326"
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
999	报错具体提示信息，例如：服务端逻辑异常	查看日志找对应异常服务定位产生原因

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

