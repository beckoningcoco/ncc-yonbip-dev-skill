---
title: "租入合同修改"
apiId: "1722132206260846595"
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

# 租入合同修改

>  请求方式	POST | Lease-in Contract (GAM)


## 1. 通过OpenAPI支持修改合同信息，并保存；


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/am/rentin/update
请求方式	POST
ContentType	application/json
应用场景	开放API
API类别	详情查询
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	否	是	data
id	string	否	是	主键 示例：1457199914393010186
pubts	string	否	是	时间戳 示例：2024-01-12 17:10:59
contract_code	string	否	否	合同号 示例：00460
contract_name	string	否	否	合同名称 示例：合同名称
signed_date	date
格式:yyyy-MM-dd	否	否	合同签订日期 示例：2024-01-08
plan_effective_date	date
格式:yyyy-MM-dd	否	否	计划生效日期 示例：2024-01-08
plan_end_date	date
格式:yyyy-MM-dd	否	否	计划结束日期 示例：2024-05-08
pk_fiorg	string	否	否	承租会计主体id|code 示例：1456441337293307908
pk_raorg	string	否	否	承租利润中心id|code 示例：1456441337293307908
pk_costcenter_in	string	否	否	承租成本中心id|code 示例：1456441337293307908
customer_out	string	否	否	出租方id或编码 示例：1456441337293307908
pk_jobmngfil	string	否	否	项目id或编码 示例：1456441337293307908
pk_record_dept	string	否	否	经办部门id或编码 示例：1456441337293307908
pk_recorder	string	否	否	经办人id或编码 示例：1456441337293307908
pk_record_date	date
格式:yyyy-MM-dd	否	否	经办日期 示例：2024-01-08
origcurrtypeid	string	否	否	币种id或编码 示例：1456441337293307908
currrate_type	string	否	否	汇率类型id或编码 示例：1456441337293307908
currrate_date	date
格式:yyyy-MM-dd	否	否	汇率日期 示例：2024-01-08
deposit	number
小数位数:8,最大长度:28	否	否	押金 示例：1000
e_contract_code	string	否	否	电子合同模板code 示例：1503953777564581889
contract_process_code	string	否	否	电子合同签署流程code 示例：1503953777564581889
memo	string	否	否	备注 示例：备注
pk_transitype	string	否	否	交易类型id或编码 示例：4A3A-01
rent_basic	object	是	否	合同基本

## 3. 请求示例

Url: /yonbip/am/rentin/update?access_token=访问令牌
Body: {
	"data": {
		"id": "1457199914393010186",
		"pubts": "2024-01-12 17:10:59",
		"contract_code": "00460",
		"contract_name": "合同名称",
		"signed_date": "2024-01-08",
		"plan_effective_date": "2024-01-08",
		"plan_end_date": "2024-05-08",
		"pk_fiorg": "1456441337293307908",
		"pk_raorg": "1456441337293307908",
		"pk_costcenter_in": "1456441337293307908",
		"customer_out": "1456441337293307908",
		"pk_jobmngfil": "1456441337293307908",
		"pk_record_dept": "1456441337293307908",
		"pk_recorder": "1456441337293307908",
		"pk_record_date": "2024-01-08",
		"origcurrtypeid": "1456441337293307908",
		"currrate_type": "1456441337293307908",
		"currrate_date": "2024-01-08",
		"deposit": 1000,
		"e_contract_code": "1503953777564581889",
		"contract_process_code": "1503953777564581889",
		"memo": "备注",
		"pk_transitype": "4A3A-01",
		"rent_basic": [
			{
				"id": "1710409187580182535",
				"pk_equip__equip_name": "资产名称",
				"pk_category": "1710409187580182535",
				"pk_material": "1710409187580182535",
				"planned_lease_out_date": "2024-01-08",
				"begin_calculate_date": "2024-01-08",
				"planned_return_date": "2024-05-08",
				"rental_unit": "4",
				"rental_period": 1,
				"collection_period": 1,
				"rent_cycle_scheme": "0",
				"collection_date_type": "0",
				"first_collection_date": "2024-01-08",
				"rent_count_style": "0",
				"pk_rent_count_method": "1710409187580182535",
				"tax_id": "1710409187580182535",
				"rent_basic_cycleprice": [
					{
						"id": "1710409187580182535",
						"begin_date": "2024-01-08",
						"end_date": "2024-05-08",
						"cycle_rent": 1000
					}
				],
				"less_cycle_rent": 30,
				"num": 1,
				"ofuse_flag": true,
				"ofuse_price_rate": 0.1,
				"renewed_choose_flag": true,
				"buy_choose_flag": true
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
code	string	否	状态码 示例：200
message	string	否	返回消息 示例：操作成功！
data	object	否	返回数据
id	string	否	主键 示例：1871523795927826445
pk_org	string	否	承租组织id 示例：1783972665726337028
pk_org__name	string	否	承租组织名称 示例：HT-ORG-0705
customer	string	否	承租方 示例：1856782119544029193
customer__name	string	否	承租方名称 示例：HT大客户
bill_code	string	否	合同编码 示例：ZRHT202311270002
contract_code	string	否	合同号 示例：多基本编辑
contract_name	string	否	合同名称 示例：多基本编辑
contract_code_v	string	否	合同版本号 示例：1
bill_status	string	否	单据状态 示例：0
contract_way	string	否	租赁方式 示例：2
contract_type	string	否	合同类型 示例：1
signed_date	date
格式:yyyy-MM-dd	否	合同签订日期 示例：2023-11-27
pk_jobmngfil__name	string	否	项目名称
pk_fiorg	string	否	承租会计主体id 示例：1783972665726337028
pk_fiorg__name	string	否	承租会计主体名称 示例：HT-ORG-0705
pk_raorg__name	string	否	承租利润中心
pk_costcenter_in__name	string	否	承租利润中心名称
pk_record_dept	string	否	经办部门id 示例：1783973198279213064
pk_record_dept__name	string	否	经办部门名称 示例：HT租赁部
pk_recorder	string	否	经办人id 示例：1783974108833251336
pk_recorder__name	string	否	经办人名称 示例：HT-RENT
pk_record_date	date
格式:yyyy-MM-dd	否	经办日期 示例：2023-11-27
transi_type	string	否	交易类型code 示例：12
pk_transitype	string	否	交易类型id 示例：1768373859909107718
bill_type	string	否	单据类型code 示例：4A3A
contract_money	string	否	合同金额 示例：393.33
pk_org_out	string	否	出租组织id 示例：1765397000894808069
pk_org_out__name	string	否	出租组织名称 示例：hxx-组织
customer_out	string	否	出租方id 示例：1848580596019757061
customer_out__name	string	否	出租方名称 示例：LYL
pk_raorg_out__name	string	否	出租利润中心名称
e_contract_name	string	否	电子合同模板名称
contract_process_id_name	string	否	电子合同签署流程名称
plan_effective_date	date
格式:yyyy-MM-dd	否	计划生效日期 示例：2023-11-27
plan_end_date	date
格式:yyyy-MM-dd	否	计划结束日期 示例：2024-03-27
origcurrtypeid	string	否	币种id 示例：1763914111891537950
origcurrtypeid__name	string	否	币种名称 示例：人民币
pk_currency	string	否	本币id 示例：1763914111891537950
pk_currency__name	string	否	本币名称 示例：人民币
currrate	string	否	汇率 示例：1
currrate_type	string	否	汇率类型id 示例：0000LJPGZ3RX3YAKG10000
currrate_type__name	string	否	汇率类型名称 示例：基准汇率
currrate_date	string	否	汇率日期 示例：2023-11-27
deposit	string	否	押金 示例：100
deposit_currency	string	否	本币押金 示例：100
cycle	string	否	合同周期 示例：122
billmaker	string	否	制单人id 示例：ffde1766-84ad-4059-abd4-7f1a7c451354
billmaker__name	string	否	制单人名称 示例：gonghtk-test
billmaketime	date
格式:yyyy-MM-dd HH:mm:ss	否	制单时间 示例：2023-11-27 16:34:05
modifier	string	否	最后修改人id 示例：ffde1766-84ad-4059-abd4-7f1a7c451354
modifier__name	string	否	最后修改人名称 示例：gonghtk-test
modifiedtime	date
格式:yyyy-MM-dd HH:mm:ss	否	最后修改时间 示例：2024-01-04 16:33:40
auditor__name	string	否	审核人名称
creator	string	否	创建人id 示例：ffde1766-84ad-4059-abd4-7f1a7c451354
creator__name	string	否	创建人名称 示例：gonghtk-test
creationtime	string	否	创建时间 示例：2023-11-27 16:34:05
wbs__name	string	否	WBS任务
rent_basic	object	是	合同基本
rent_detailed	object	是	租金明细，自动交接合同才返回
rent_calculation	object	否	租金计算明细
errorDetail	string	否	错误消息

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功！",
	"data": {
		"id": "1871523795927826445",
		"pk_org": "1783972665726337028",
		"pk_org__name": "HT-ORG-0705",
		"customer": "1856782119544029193",
		"customer__name": "HT大客户",
		"bill_code": "ZRHT202311270002",
		"contract_code": "多基本编辑",
		"contract_name": "多基本编辑",
		"contract_code_v": "1",
		"bill_status": "0",
		"contract_way": "2",
		"contract_type": "1",
		"signed_date": "2023-11-27",
		"pk_jobmngfil__name": "",
		"pk_fiorg": "1783972665726337028",
		"pk_fiorg__name": "HT-ORG-0705",
		"pk_raorg__name": "",
		"pk_costcenter_in__name": "",
		"pk_record_dept": "1783973198279213064",
		"pk_record_dept__name": "HT租赁部",
		"pk_recorder": "1783974108833251336",
		"pk_recorder__name": "HT-RENT",
		"pk_record_date": "2023-11-27",
		"transi_type": "12",
		"pk_transitype": "1768373859909107718",
		"bill_type": "4A3A",
		"contract_money": "393.33",
		"pk_org_out": "1765397000894808069",
		"pk_org_out__name": "hxx-组织",
		"customer_out": "1848580596019757061",
		"customer_out__name": "LYL",
		"pk_raorg_out__name": "",
		"e_contract_name": "",
		"contract_process_id_name": "",
		"plan_effective_date": "2023-11-27",
		"plan_end_date": "2024-03-27",
		"origcurrtypeid": "1763914111891537950",
		"origcurrtypeid__name": "人民币",
		"pk_currency": "1763914111891537950",
		"pk_currency__name": "人民币",
		"currrate": "1",
		"currrate_type": "0000LJPGZ3RX3YAKG10000",
		"currrate_type__name": "基准汇率",
		"currrate_date": "2023-11-27",
		"deposit": "100",
		"deposit_currency": "100",
		"cycle": "122",
		"billmaker": "ffde1766-84ad-4059-abd4-7f1a7c451354",
		"billmaker__name": "gonghtk-test",
		"billmaketime": "2023-11-27 16:34:05",
		"modifier": "ffde1766-84ad-4059-abd4-7f1a7c451354",
		"modifier__name": "gonghtk-test",
		"modifiedtime": "2024-01-04 16:33:40",
		"auditor__name": "",
		"creator": "ffde1766-84ad-4059-abd4-7f1a7c451354",
		"creator__name": "gonghtk-test",
		"creationtime": "2023-11-27 16:34:05",
		"wbs__name": "",
		"rent_basic": [
			{
				"notaxcycle_rent_currency": "100",
				"pk_equip__spec": "",
				"rental_unit": "4",
				"rental_period": "1",
				"num": "1",
				"planned_return_date": "2024-03-27",
				"cycle_rent": "100",
				"collection_date_type": "0",
				"planned_lease_out_date": "2023-11-27",
				"less_cycle_rent": 3.33,
				"equip_code": "LIM20231127000001",
				"rent_count_style": "0",
				"planned_life_cycle": "122",
				"notaxless_cycle_rent": 3.33,
				"rent_holiday": "0",
				"id": "1871523795927826446",
				"pk_equip__model": "",
				"pk_category__category_name": "多个技术参数",
				"cycle_rent_currency": "100",
				"main_id": "1871523795927826445",
				"equip_name": "1",
				"pk_category": "1866123329812824066",
				"notaxcycle_rent": "100",
				"rent_basic_cycleprice": [
					{
						"end_date": "2024-03-27",
						"notaxcycle_rent_currency": "100",
						"cycle_rent_currency": "100",
						"begin_date": "2023-11-27",
						"main_id": "1871523795927826445",
						"cycle_rent": "100",
						"notaxcycle_rent": "100",
						"rent_basic_id": "1871523795927826446",
						"id": "1871523795927826447",
						"cycle_rent_tax": "0",
						"cycle_rent_tax_currency": "0"
					}
				],
				"begin_calculate_date": "2023-11-27",
				"collection_period": "1",
				"less_cycle_rent_currency": 3.33,
				"pk_equip__equip_name": "1",
				"notaxless_cycle_rent_currency": 3.33,
				"pk_equip__equip_code": "LIM20231127000001",
				"rent_cycle_scheme": "0"
			}
		],
		"rent_detailed": [
			{
				"buy_choose_flag": "",
				"collection_date_type": "0",
				"cycle_rent": "100",
				"cycle_rent_currency": "100",
				"cycle_rent_tax": "",
				"cycle_rent_tax_currency": "",
				"equip_code": "LIM20231127000001",
				"equip_name": "1",
				"less_cycle_rent": 3.33,
				"less_cycle_rent_currency": 3.33,
				"less_cycle_rent_tax": 0,
				"less_cycle_rent_tax_currency": 0,
				"main_id": "1871523795927826445",
				"model": "",
				"notaxcycle_rent": "100",
				"notaxcycle_rent_currency": "100",
				"notaxless_cycle_rent": 3.33,
				"notaxless_cycle_rent_currency": 3.33,
				"num": "1",
				"ofuse_flag": "",
				"ofuse_price_rate": 0,
				"pk_category": "1866123329812824066",
				"pk_equip": "",
				"pk_material": "",
				"pk_rent_count_method": "",
				"pk_rent_object": "",
				"planned_return_date": "2024-03-27",
				"rent_count_style": "0",
				"rent_cycle_scheme": "0",
				"rent_holiday": "0",
				"rental_period": "1",
				"rental_unit": "4",
				"spec": "",
				"tax_code": "",
				"tax_id": "",
				"tax_rate": "",
				"basic_id": "1871523795927826446",
				"start_date": "2023-11-27",
				"lease_in_date": "2023-11-27",
				"first_payment_date": "2026-06-07",
				"payment_date_type": "0",
				"pk_jobmngfil": "",
				"payment_period": "1",
				"id": "1899726063018180609",
				"end_date": "2024-03-27",
				"gather_money": 100,
				"gather_money_tax": 0,
				"notaxlgather_money": 100,
				"gather_money_currency": 100,
				"gather_money_tax_currency": 0,
				"notaxlgather_money_currency": 100
			}
		],
		"rent_calculation": {
			"id": "1899726063018180609",
			"main_id": "1871523795927826445",
			"basic_id": "1871523795927826446",
			"lease_in_details": "1871523795927826446",
			"pk_equip": "",
			"pk_equip__equip_code": "LIM20231127000001",
			"equip_code": "LIM20231127000001",
			"pk_equip__equip_name": "1",
			"equip_name": "1",
			"pk_category": "1866123329812824066",
			"pk_category__category_name": "",
			"pk_equip__spec": "",
			"spec": "",
			"pk_equip__model": "",
			"model": "",
			"rental_period": "1",
			"rent_type": "4",
			"collection_period": "1",
			"tax_code": "",
			"tax_id": "",
			"tax_rate": "",
			"cycle_rent": "100",
			"cycle_rent_currency": "100",
			"cycle_rent_tax": "",
			"cycle_rent_tax_currency": "",
			"notaxcycle_rent": "100",
			"notaxcycle_rent_currency": "100",
			"rent_count_style": "0",
			"pk_cal_means": "",
			"pk_cal_means__name": "",
			"start_date": "2026-06-07",
			"end_date": "2026-06-07",
			"collection_date_type": "0",
			"receivable_date": "2026-06-07",
			"incomplete_period_day": 3,
			"less_cycle_rent": 3.33,
			"less_cycle_rent_currency": 3.33,
			"less_cycle_rent_tax": 0,
			"less_cycle_rent_tax_currency": 0,
			"notaxless_cycle_rent": 3.33,
			"notaxless_cycle_rent_currency": 3.33,
			"gather_money": 100,
			"gather_money_tax": 0,
			"notaxlgather_money": 100,
			"gather_money_currency": 100,
			"gather_money_tax_currency": 0,
			"notaxlgather_money_currency": 100,
			"adjustment_rent": 100,
			"adjustment_rent_tax": 0,
			"notaxadjustment_rent": 100,
			"adjustment_rent_currency": 100,
			"adjustment_rent_tax_currency": 0,
			"notaxadjustment_rent_currency": 100,
			"lease_in_date": "2023-11-27",
			"begin_calculate_date": "2023-11-27",
			"holiday_flag": false,
			"holidays": 0,
			"pk_rent_object__rent_object": "",
			"pk_rent_object__rent_object_explain": ""
		}
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

