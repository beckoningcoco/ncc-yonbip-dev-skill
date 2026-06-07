---
title: "工单撤回"
apiId: "1960505004336349191"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Work Order Management"
domain: "MRO"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Work Order Management]
platform_version: "BIP"
source_type: community-api-docs
---

# 工单撤回

>  请求方式	POST | Work Order Management (MRO)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/am/workordercard/uncommit
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	是	否	工单参数项
id	string	否	否	工单主键 示例：2136519781996560384

## 3. 请求示例

Url: /yonbip/am/workordercard/uncommit?access_token=访问令牌
Body: {
	"data": [
		{
			"id": "2136519781996560384"
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
_realtype	string	否	_realtype
_entityName	string	否	_entityName
_keyName	string	否	_keyName
pk_group	string	否	pk_group 示例：666666
isWfControlled	boolean	否	isWfControlled 示例：true
tenant	string	否	tenant 示例：0000LUQD7N0U6RWWLD0000
bill_status	number
小数位数:0,最大长度:10	否	bill_status 示例：0
bill_type	string	否	bill_type 示例：4B36
pk_transitype	string	否	pk_transitype 示例：1970062217104590127
pk_transitype__name	string	否	pk_transitype__name 示例：工单管理
transi_type	string	否	transi_type 示例：4B36-01
pk_org	string	否	pk_org 示例：1970883363291004935
pk_org__name	string	否	pk_org__name 示例：WUHF集团组织
bill_code	string	否	bill_code 示例：WO2503280002
wo_content	string	否	wo_content 示例：AAA
pk_wo_status_init	string	否	pk_wo_status_init 示例：PRESET01_0000LUQD7N0U6RWWLD0000
pk_wo_status	string	否	pk_wo_status 示例：PRESET01_0000LUQD7N0U6RWWLD0000
pk_wo_status__name	string	否	pk_wo_status__name 示例：待审
wo_statustype	number
小数位数:0,最大长度:10	否	wo_statustype 示例：0
status_time	string	否	status_time 示例：2025-03-28 17:38:05
pk_worktype	string	否	pk_worktype 示例：PRESET02_0000LUQD7N0U6RWWLD0000
pk_worktype__name	string	否	pk_worktype__name 示例：日常维护
pk_equip	string	否	pk_equip 示例：2027908348455157767
pk_equip__equip_code	string	否	pk_equip__equip_code 示例：202406250001
pk_equip__equip_name	string	否	pk_equip__equip_name 示例：特种设备A
pk_ownerunit	string	否	pk_ownerunit 示例：2002258906863632392
pk_ownerunit__name	string	否	pk_ownerunit__name 示例：资产组织
pk_ownerorg	string	否	pk_ownerorg 示例：2002258906863632392
pk_ownerorg__name	string	否	pk_ownerorg__name 示例：资产组织
pk_mandept	string	否	pk_mandept 示例：2002260427273666563
pk_mandept__name	string	否	pk_mandept__name 示例：营销部门
pk_manager	string	否	pk_manager 示例：2002259688518844424
pk_manager__name	string	否	pk_manager__name 示例：刘龙
pk_usedorg	string	否	pk_usedorg 示例：2002258906863632392
pk_usedorg__name	string	否	pk_usedorg__name 示例：资产组织
pk_usedept__name	string	否	pk_usedept__name
pk_user__name	string	否	pk_user__name
pk_location__location_code	string	否	pk_location__location_code
pk_currtype__name	string	否	pk_currtype__name 示例：人民币
pk_equip_capital	string	否	pk_equip_capital
pk_equip_capital__equip_name	string	否	pk_equip_capital__equip_name
pk_costcenter_use__name	string	否	pk_costcenter_use__name
pk_profitcenter_use__name	string	否	pk_profitcenter_use__name
pk_priority__name	string	否	pk_priority__name
pk_parent_wo__bill_code	string	否	pk_parent_wo__bill_code
haschild_flag	boolean	否	haschild_flag 示例：false
pk_currtype	string	否	pk_currtype 示例：1970062208514654258
pk_currtype__moneyRount	string	否	pk_currtype__moneyRount 示例：4
pk_currtype__moneyDigit	string	否	pk_currtype__moneyDigit 示例：2
vchangerate__Digit	string	否	vchangerate__Digit 示例：0
pk_currtype__priceRount	string	否	pk_currtype__priceRount 示例：4
pk_currtype__priceDigit	string	否	pk_currtype__priceDigit 示例：2
pk_customer__name	string	否	pk_customer__name
pk_supplier__name	string	否	pk_supplier__name
pk_failure_detect__name	string	否	pk_failure_detect__name
pk_reportedby__name	string	否	pk_reportedby__name
report_time	string	否	report_time 示例：2025-03-28 17:37:33
pk_executor__name	string	否	pk_executor__name
pk_director__name	string	否	pk_director__name
pk_psn_group__name	string	否	pk_psn_group__name
pk_wo_dept__name	string	否	pk_wo_dept__name
pk_specialty__special_name	string	否	pk_specialty__special_name
pk_project__name	string	否	pk_project__name
pk_wbs_task__code	string	否	pk_wbs_task__code
pk_activity__code	string	否	pk_activity__code
pk_repair_plan__bill_code	string	否	pk_repair_plan__bill_code
dispatched	boolean	否	dispatched 示例：false
pk_std_job__name	string	否	pk_std_job__name
pk_safety_job	string	否	pk_safety_job
pk_inspection_road__name	string	否	pk_inspection_road__name
pk_overhaul__code	string	否	pk_overhaul__code
pk_provider__name	string	否	pk_provider__name
pk_contract__bill_code	string	否	pk_contract__bill_code
file_before_repair	string	否	file_before_repair 示例：7532ae74-34f1-31ee-8a99-ccb465f7b736
file_after_repair	string	否	file_after_repair 示例：3ecb2b6f-0ffb-89c4-5f5e-faa876c03be0
settle_flag	boolean	否	settle_flag 示例：false
haslatter_flag	boolean	否	haslatter_flag 示例：false
gen_failure_flag	boolean	否	gen_failure_flag 示例：false
pk_failure_type__name	string	否	pk_failure_type__name
pk_failure_symptom__name	string	否	pk_failure_symptom__name
pk_failure_reason__name	string	否	pk_failure_reason__name
pk_service_step__name	string	否	pk_service_step__name
pl_mtr_mny_org	number
小数位数:0,最大长度:10	否	pl_mtr_mny_org 示例：0
pl_mtr_mny_group	number
小数位数:0,最大长度:10	否	pl_mtr_mny_group 示例：0
pl_mtr_mny_global	number
小数位数:0,最大长度:10	否	pl_mtr_mny_global 示例：0
ac_mtr_mny_org	number
小数位数:0,最大长度:10	否	ac_mtr_mny_org 示例：0
ac_mtr_mny_group	number
小数位数:0,最大长度:10	否	ac_mtr_mny_group 示例：0
ac_mtr_mny_global	number
小数位数:0,最大长度:10	否	ac_mtr_mny_global 示例：0
pl_lbr_mny_org	number
小数位数:0,最大长度:10	否	pl_lbr_mny_org 示例：0
pl_lbr_mny_group	number
小数位数:0,最大长度:10	否	pl_lbr_mny_group 示例：0
pl_lbr_mny_global	number
小数位数:0,最大长度:10	否	pl_lbr_mny_global 示例：0
ac_lbr_mny_org	number
小数位数:0,最大长度:10	否	ac_lbr_mny_org 示例：0
ac_lbr_mny_group	number
小数位数:0,最大长度:10	否	ac_lbr_mny_group 示例：0
ac_lbr_mny_global	number
小数位数:0,最大长度:10	否	ac_lbr_mny_global 示例：0
pl_oth_mny_org	number
小数位数:0,最大长度:10	否	pl_oth_mny_org 示例：0
pl_oth_mny_group	number
小数位数:0,最大长度:10	否	pl_oth_mny_group 示例：0
pl_oth_mny_global	number
小数位数:0,最大长度:10	否	pl_oth_mny_global 示例：0
ac_oth_mny_org	number
小数位数:0,最大长度:10	否	ac_oth_mny_org 示例：0
ac_oth_mny_group	number
小数位数:0,最大长度:10	否	ac_oth_mny_group 示例：0
ac_oth_mny_global	number
小数位数:0,最大长度:10	否	ac_oth_mny_global 示例：0
pl_ttl_mny_org	number
小数位数:0,最大长度:10	否	pl_ttl_mny_org 示例：0
pl_ttl_mny_group	number
小数位数:0,最大长度:10	否	pl_ttl_mny_group 示例：0
pl_ttl_mny_global	number
小数位数:0,最大长度:10	否	pl_ttl_mny_global 示例：0
ac_ttl_mny_org	number
小数位数:0,最大长度:10	否	ac_ttl_mny_org 示例：0
ac_ttl_mny_group	number
小数位数:0,最大长度:10	否	ac_ttl_mny_group 示例：0
ac_ttl_mny_global	number
小数位数:0,最大长度:10	否	ac_ttl_mny_global 示例：0
pk_fiorg_ap	string	否	pk_fiorg_ap
pk_costcenter_repair__name	string	否	pk_costcenter_repair__name
pk_profitcenter_repair__name	string	否	pk_profitcenter_repair__name
pk_costcenter_bear__name	string	否	pk_costcenter_bear__name
pk_fiorg_apmt__name	string	否	pk_fiorg_apmt__name
pk_fiorg_armt__name	string	否	pk_fiorg_armt__name
pk_fiorg_ic	string	否	pk_fiorg_ic
pk_profitcen_ap	string	否	pk_profitcen_ap
pk_profitcen_apmt	string	否	pk_profitcen_apmt
pk_profitcen_armt	string	否	pk_profitcen_armt
pk_chkfactor	string	否	pk_chkfactor
pk_chkfactor_apmt	string	否	pk_chkfactor_apmt
pk_chkfactor_armt	string	否	pk_chkfactor_armt
id	string	否	id 示例：2232993552250961925
pubts	string	否	pubts 示例：2025-03-28 17:38:05
sysid	string	否	sysid 示例：RMM
billmaker	string	否	billmaker 示例：4c4c966a-b9c1-4fc1-bada-1e2aa7fa98e2
billmaker__name	string	否	billmaker__name 示例：刘龙
billmaketime	string	否	billmaketime 示例：2025-03-28 17:37:43
auditor__name	string	否	auditor__name
modifier__name	string	否	modifier__name
verifystate	number
小数位数:0,最大长度:10	否	verifystate 示例：0
push_status	number
小数位数:0,最大长度:10	否	push_status 示例：0
oid	string	否	oid
_status	string	否	_status
pk_org_	string	否	pk_org_ 示例：1970883363291004935
pk_ownerorg_	string	否	pk_ownerorg_ 示例：2002258906863632392
pk_mandept_	string	否	pk_mandept_ 示例：2002260427273666563
pk_manager_	string	否	pk_manager_ 示例：2002259688518844424
pk_usedorg_	string	否	pk_usedorg_ 示例：2002258906863632392
ytenant	string	否	ytenant 示例：0000LUQD7N0U6RWWLD0000
wo_source	string	是	wo_source
_oldwo_statustype	string	否	_oldwo_statustype
errorDetail	string	否	errorDetail

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功！",
	"data": {
		"_realtype": "",
		"_entityName": "",
		"_keyName": "",
		"pk_group": "666666",
		"isWfControlled": true,
		"tenant": "0000LUQD7N0U6RWWLD0000",
		"bill_status": 0,
		"bill_type": "4B36",
		"pk_transitype": "1970062217104590127",
		"pk_transitype__name": "工单管理",
		"transi_type": "4B36-01",
		"pk_org": "1970883363291004935",
		"pk_org__name": "WUHF集团组织",
		"bill_code": "WO2503280002",
		"wo_content": "AAA",
		"pk_wo_status_init": "PRESET01_0000LUQD7N0U6RWWLD0000",
		"pk_wo_status": "PRESET01_0000LUQD7N0U6RWWLD0000",
		"pk_wo_status__name": "待审",
		"wo_statustype": 0,
		"status_time": "2025-03-28 17:38:05",
		"pk_worktype": "PRESET02_0000LUQD7N0U6RWWLD0000",
		"pk_worktype__name": "日常维护",
		"pk_equip": "2027908348455157767",
		"pk_equip__equip_code": "202406250001",
		"pk_equip__equip_name": "特种设备A",
		"pk_ownerunit": "2002258906863632392",
		"pk_ownerunit__name": "资产组织",
		"pk_ownerorg": "2002258906863632392",
		"pk_ownerorg__name": "资产组织",
		"pk_mandept": "2002260427273666563",
		"pk_mandept__name": "营销部门",
		"pk_manager": "2002259688518844424",
		"pk_manager__name": "刘龙",
		"pk_usedorg": "2002258906863632392",
		"pk_usedorg__name": "资产组织",
		"pk_usedept__name": "",
		"pk_user__name": "",
		"pk_location__location_code": "",
		"pk_currtype__name": "人民币",
		"pk_equip_capital": "",
		"pk_equip_capital__equip_name": "",
		"pk_costcenter_use__name": "",
		"pk_profitcenter_use__name": "",
		"pk_priority__name": "",
		"pk_parent_wo__bill_code": "",
		"haschild_flag": false,
		"pk_currtype": "1970062208514654258",
		"pk_currtype__moneyRount": "4",
		"pk_currtype__moneyDigit": "2",
		"vchangerate__Digit": "0",
		"pk_currtype__priceRount": "4",
		"pk_currtype__priceDigit": "2",
		"pk_customer__name": "",
		"pk_supplier__name": "",
		"pk_failure_detect__name": "",
		"pk_reportedby__name": "",
		"report_time": "2025-03-28 17:37:33",
		"pk_executor__name": "",
		"pk_director__name": "",
		"pk_psn_group__name": "",
		"pk_wo_dept__name": "",
		"pk_specialty__special_name": "",
		"pk_project__name": "",
		"pk_wbs_task__code": "",
		"pk_activity__code": "",
		"pk_repair_plan__bill_code": "",
		"dispatched": false,
		"pk_std_job__name": "",
		"pk_safety_job": "",
		"pk_inspection_road__name": "",
		"pk_overhaul__code": "",
		"pk_provider__name": "",
		"pk_contract__bill_code": "",
		"file_before_repair": "7532ae74-34f1-31ee-8a99-ccb465f7b736",
		"file_after_repair": "3ecb2b6f-0ffb-89c4-5f5e-faa876c03be0",
		"settle_flag": false,
		"haslatter_flag": false,
		"gen_failure_flag": false,
		"pk_failure_type__name": "",
		"pk_failure_symptom__name": "",
		"pk_failure_reason__name": "",
		"pk_service_step__name": "",
		"pl_mtr_mny_org": 0,
		"pl_mtr_mny_group": 0,
		"pl_mtr_mny_global": 0,
		"ac_mtr_mny_org": 0,
		"ac_mtr_mny_group": 0,
		"ac_mtr_mny_global": 0,
		"pl_lbr_mny_org": 0,
		"pl_lbr_mny_group": 0,
		"pl_lbr_mny_global": 0,
		"ac_lbr_mny_org": 0,
		"ac_lbr_mny_group": 0,
		"ac_lbr_mny_global": 0,
		"pl_oth_mny_org": 0,
		"pl_oth_mny_group": 0,
		"pl_oth_mny_global": 0,
		"ac_oth_mny_org": 0,
		"ac_oth_mny_group": 0,
		"ac_oth_mny_global": 0,
		"pl_ttl_mny_org": 0,
		"pl_ttl_mny_group": 0,
		"pl_ttl_mny_global": 0,
		"ac_ttl_mny_org": 0,
		"ac_ttl_mny_group": 0,
		"ac_ttl_mny_global": 0,
		"pk_fiorg_ap": "",
		"pk_costcenter_repair__name": "",
		"pk_profitcenter_repair__name": "",
		"pk_costcenter_bear__name": "",
		"pk_fiorg_apmt__name": "",
		"pk_fiorg_armt__name": "",
		"pk_fiorg_ic": "",
		"pk_profitcen_ap": "",
		"pk_profitcen_apmt": "",
		"pk_profitcen_armt": "",
		"pk_chkfactor": "",
		"pk_chkfactor_apmt": "",
		"pk_chkfactor_armt": "",
		"id": "2232993552250961925",
		"pubts": "2025-03-28 17:38:05",
		"sysid": "RMM",
		"billmaker": "4c4c966a-b9c1-4fc1-bada-1e2aa7fa98e2",
		"billmaker__name": "刘龙",
		"billmaketime": "2025-03-28 17:37:43",
		"auditor__name": "",
		"modifier__name": "",
		"verifystate": 0,
		"push_status": 0,
		"oid": "",
		"_status": "",
		"pk_org_": "1970883363291004935",
		"pk_ownerorg_": "2002258906863632392",
		"pk_mandept_": "2002260427273666563",
		"pk_manager_": "2002259688518844424",
		"pk_usedorg_": "2002258906863632392",
		"ytenant": "0000LUQD7N0U6RWWLD0000",
		"wo_source": [
			""
		],
		"_oldwo_statustype": ""
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
999	报错具体提示信息	结合报错提示信息查找原因

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

