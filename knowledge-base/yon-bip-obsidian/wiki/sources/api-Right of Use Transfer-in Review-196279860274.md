---
title: "使用权调入保存"
apiId: "1962798602743447552"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Right of Use Transfer-in"
domain: "GAM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Right of Use Transfer-in]
platform_version: "BIP"
source_type: community-api-docs
---

# 使用权调入保存

>  请求方式	POST | Right of Use Transfer-in (GAM)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/am/deployUsedin/save
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	批量保存/更新
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	是	否	data
pk_usedorg_out	string	否	否	pk_usedorg_out 示例：1980536027314389001
pk_group	string	否	否	集团
pk_usedorg_in	string	否	否	pk_usedorg_in 示例：1980535426005860360
bill_status	number
小数位数:0,最大长度:10	否	否	bill_status 示例：0
bill_code	string	否	否	bill_code 示例：SYDR202406190001
bill_type	string	否	否	bill_type 示例：4A48
pk_transitype	string	否	否	pk_transitype 示例：null
transi_type	string	否	否	transi_type 示例：4A48-01
bill_date	string	否	否	bill_date 示例：2024-06-19 00:00:00
pk_recorder	string	否	否	pk_recorder 示例：1982040657426907136
memo	string	否	否	memo 示例：1221212
pk_usedorg_out_v	string	否	否	pk_usedorg_out_v
pk_usedorg_in_v	string	否	否	pk_usedorg_in_v
pk_org_v	string	否	否	pk_org_v
pk_org	string	否	否	pk_org 示例：1980535426005860360
pk_org__name	string	否	否	pk_org__name 示例：WUHF集团资产组织
id	string	否	否	id 示例：2023608922899742728
pubts	string	否	否	pubts 示例：2024-09-05 14:44:31
tenant	string	否	否	tenant 示例：0000LV53NH2Z4URDOP0000
sysid	string	否	否	sysid 示例：AUM
isWfControlled	boolean	否	否	isWfControlled 示例：false
returncount	number
小数位数:0,最大长度:10	否	否	returncount 示例：0
verifystate	number
小数位数:0,最大长度:10	否	否	verifystate 示例：0
pk_transitype__name	string	否	否	pk_transitype__name
billmaker	string	否	否	billmaker 示例：018532e9-5aff-43e3-8157-c583afb6db67
billmaker__name	string	否	否	billmaker__name 示例：昵称-15727377404
billmaketime	string	否	否	billmaketime 示例：2024-06-19 14:38:04
modifier	string	否	否	modifier 示例：018532e9-5aff-43e3-8157-c583afb6db67
modifier__name	string	否	否	modifier__name 示例：昵称-15727377404
modifiedtime	string	否	否	modifiedtime 示例：2024-09-05 14:44:29
auditor__name	string	否	否	auditor__name
creator	string	否	否	creator 示例：018532e9-5aff-43e3-8157-c583afb6db67
creator__name	string	否	否	creator__name 示例：昵称-15727377404
creationtime	string	否	否	creationtime 示例：2024-06-19 14:38:04
bodyvos	object	是	否	bodyvos
_status	string	否	否	_status 示例：Update
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»

## 3. 请求示例

Url: /yonbip/am/deployUsedin/save?access_token=访问令牌
Body: {
	"data": [
		{
			"pk_usedorg_out": "1980536027314389001",
			"pk_group": "",
			"pk_usedorg_in": "1980535426005860360",
			"bill_status": 0,
			"bill_code": "SYDR202406190001",
			"bill_type": "4A48",
			"pk_transitype": "null",
			"transi_type": "4A48-01",
			"bill_date": "2024-06-19 00:00:00",
			"pk_recorder": "1982040657426907136",
			"memo": "1221212",
			"pk_usedorg_out_v": "",
			"pk_usedorg_in_v": "",
			"pk_org_v": "",
			"pk_org": "1980535426005860360",
			"pk_org__name": "WUHF集团资产组织",
			"id": "2023608922899742728",
			"pubts": "2024-09-05 14:44:31",
			"tenant": "0000LV53NH2Z4URDOP0000",
			"sysid": "AUM",
			"isWfControlled": false,
			"returncount": 0,
			"verifystate": 0,
			"pk_transitype__name": "",
			"billmaker": "018532e9-5aff-43e3-8157-c583afb6db67",
			"billmaker__name": "昵称-15727377404",
			"billmaketime": "2024-06-19 14:38:04",
			"modifier": "018532e9-5aff-43e3-8157-c583afb6db67",
			"modifier__name": "昵称-15727377404",
			"modifiedtime": "2024-09-05 14:44:29",
			"auditor__name": "",
			"creator": "018532e9-5aff-43e3-8157-c583afb6db67",
			"creator__name": "昵称-15727377404",
			"creationtime": "2024-06-19 14:38:04",
			"bodyvos": [
				{
					"bill_code_src": "SYDC202406190002",
					"src_pk_bill": "2023608751101050886",
					"pk_usedept_before": "1980537255661928456",
					"src_bill_type": "4A47",
					"pk_costcenter_used_out": "2001976521241133059",
					"memo": "sss",
					"main_id": "2023608922899742728",
					"src_pk_bill_b": "2023608751101050887",
					"pk_equip__pk_category": "1986521605413011465",
					"pk_org": "1980535426005860360",
					"src_transitype": "4A47-01",
					"pk_equip__equip_code": "202405210001",
					"pk_equip": "2001987250055282690",
					"pk_costcenter_used_out__name": "有效类别",
					"pk_equip__pk_category__category_name": "技术参数类别",
					"pk_equip__equip_name": "001",
					"id": "2023608922899742729",
					"pubts": "2024-06-19 14:38:05",
					"tenant": "0000LV53NH2Z4URDOP0000",
					"stock_in_flag": false,
					"pk_usedept_before__name": "WUHF资产部门",
					"pk_equip__pk_ownerorg": "1980536027314389001",
					"_id": "rowId_4",
					"pk_equip__special_flag": false,
					"_tableDisplayOutlineAll": false,
					"pk_usedept_after__name": "销售部",
					"pk_usedept_after": "1978272493666304000",
					"pk_costcenter_used_in__name": "",
					"pk_costcenter_used_in": "",
					"pk_profitcenter_used_in__name": "WUHF集团利润中心",
					"pk_profitcenter_used_in": "1980542272197885954",
					"pk_jobmngfil_after__name": "33",
					"pk_jobmngfil_after": "2013084466317623301",
					"pk_user_after__name": "朱一龙",
					"pk_user_after": "1978274091385749505",
					"pk_location_after__name": "使用位置-新",
					"pk_location_after": "1988813700609867776",
					"pk_icorg_in": "",
					"pk_icorg_in__name": "",
					"pk_addreducestyle": "",
					"pk_warehouse_in": "",
					"pk_warehouse_in__name": "",
					"_realtype": "",
					"_entityName": "",
					"_keyName": "",
					"pk_usedept_after_": "1978272493666304000",
					"pk_user_after_": "1978274091385749505",
					"pk_org_": "1980535426005860360",
					"pk_usedept_before_": "1980537255661928456",
					"ytenant": "0000LV53NH2Z4URDOP0000",
					"_status": "Unchanged",
					"pk_reason": "",
					"pk_usedunit_out": "",
					"pk_usedunit_in": "",
					"pk_user_before": "",
					"accu_dep_before": 0,
					"accu_dep": 0,
					"dep_amount_before": 0,
					"dep_amount": 0,
					"net_money_before": 0,
					"net_money": 0,
					"new_value_before": 0,
					"new_value": 0,
					"origin_value_before": 0,
					"origin_value": 0,
					"pk_jobmngfil": "",
					"pk_location_before": "",
					"pk_warehouse_out": "",
					"pre_devaluate": 0,
					"pre_devaluate_before": 0,
					"salvage_before": 0,
					"salvage": 0,
					"begin_date_before": "2026-06-07",
					"begin_date": "2026-06-07",
					"salvage_rate": 0,
					"salvage_rate_before": 0,
					"service_month": 0,
					"service_month_before": 0,
					"used_month": 0,
					"used_month_before": 0,
					"pk_currency": "",
					"pk_icorg_out": "",
					"pk_org_v": "",
					"pk_usedunit_out_v": "",
					"pk_usedunit_in_v": "",
					"pk_icorg_out_v": "",
					"pk_icorg_in_v": "",
					"pk_group": "",
					"pk_usedept_before_v": "",
					"pk_usedept_after_v": "",
					"pk_profitcenter_used_out": "",
					"pk_jobmngfil_before": ""
				}
			],
			"_status": "Update",
			"resubmitCheckKey": "aum_deploy_usedin_card_edit_7c09dee6-7a5e-4ee8-8f12-edb29830c5ff"
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
_realtype	string	否	_realtype
_entityName	string	否	_entityName
_keyName	string	否	_keyName
pk_usedorg_out	string	否	pk_usedorg_out 示例：1980536027314389001
pk_usedorg_out__name	string	否	pk_usedorg_out__name 示例：WUHF资产组织
pk_usedorg_in	string	否	pk_usedorg_in 示例：1980535426005860360
pk_usedorg_in__name	string	否	pk_usedorg_in__name 示例：WUHF集团资产组织
bill_status	number
小数位数:0,最大长度:10	否	bill_status 示例：0
bill_code	string	否	bill_code 示例：SYDR202406190001
bill_type	string	否	bill_type 示例：4A48
pk_transitype	string	否	pk_transitype 示例：null
transi_type	string	否	transi_type 示例：4A48-01
bill_date	string	否	bill_date 示例：2024-06-19 00:00:00
pk_recorder	string	否	pk_recorder 示例：1982040657426907136
pk_recorder__name	string	否	pk_recorder__name 示例：武慧峰
memo	string	否	memo 示例：1221212
pk_usedorg_out_v	string	否	pk_usedorg_out_v
pk_usedorg_in_v	string	否	pk_usedorg_in_v
pk_org_v	string	否	pk_org_v
pk_org	string	否	pk_org 示例：1980535426005860360
pk_org__name	string	否	pk_org__name 示例：WUHF集团资产组织
id	string	否	id 示例：2023608922899742728
pubts	string	否	pubts 示例：2024-09-05 14:44:51
tenant	string	否	tenant 示例：0000LV53NH2Z4URDOP0000
sysid	string	否	sysid 示例：AUM
isWfControlled	boolean	否	isWfControlled 示例：false
returncount	number
小数位数:0,最大长度:10	否	returncount 示例：0
verifystate	number
小数位数:0,最大长度:10	否	verifystate 示例：0
pk_transitype__name	string	否	pk_transitype__name
billmaker	string	否	billmaker 示例：018532e9-5aff-43e3-8157-c583afb6db67
billmaker__name	string	否	billmaker__name 示例：昵称-15727377404
billmaketime	string	否	billmaketime 示例：2024-06-19 14:38:04
modifier	string	否	modifier 示例：018532e9-5aff-43e3-8157-c583afb6db67
modifier__name	string	否	modifier__name 示例：昵称-15727377404
modifiedtime	string	否	modifiedtime 示例：2024-09-05 14:44:50
auditor__name	string	否	auditor__name
creator	string	否	creator 示例：018532e9-5aff-43e3-8157-c583afb6db67
creator__name	string	否	creator__name 示例：昵称-15727377404
creationtime	string	否	creationtime 示例：2024-06-19 14:38:04
bodyvos	object	是	bodyvos
_realtype	string	否	_realtype
_entityName	string	否	_entityName
_keyName	string	否	_keyName
bill_code_src	string	否	bill_code_src 示例：SYDC202406190002
src_pk_bill	string	否	src_pk_bill 示例：2023608751101050886
pk_usedept_before	string	否	pk_usedept_before 示例：1980537255661928456
src_bill_type	string	否	src_bill_type 示例：4A47
pk_costcenter_used_out	string	否	pk_costcenter_used_out 示例：2001976521241133059
memo	string	否	memo 示例：sss
main_id	string	否	main_id 示例：2023608922899742728
src_pk_bill_b	string	否	src_pk_bill_b 示例：2023608751101050887
pk_equip__pk_category	string	否	pk_equip__pk_category 示例：1986521605413011465
pk_org	string	否	pk_org 示例：1980535426005860360
src_transitype	string	否	src_transitype 示例：4A47-01
pk_equip__equip_code	string	否	pk_equip__equip_code 示例：202405210001
pk_equip	string	否	pk_equip 示例：2001987250055282690
pk_costcenter_used_out__name	string	否	pk_costcenter_used_out__name 示例：有效类别
pk_equip__pk_category__category_name	string	否	pk_equip__pk_category__category_name 示例：技术参数类别
pk_equip__equip_name	string	否	pk_equip__equip_name 示例：001
id	string	否	id 示例：2023608922899742729
tenant	string	否	tenant 示例：0000LV53NH2Z4URDOP0000
stock_in_flag	boolean	否	stock_in_flag 示例：false
pk_usedept_before__name	string	否	pk_usedept_before__name 示例：WUHF资产部门
pk_equip__pk_ownerorg	string	否	pk_equip__pk_ownerorg 示例：1980536027314389001
pk_equip__special_flag	boolean	否	pk_equip__special_flag 示例：false
pk_usedept_after__name	string	否	pk_usedept_after__name 示例：销售部
pk_usedept_after	string	否	pk_usedept_after 示例：1978272493666304000
pk_costcenter_used_in__name	string	否	pk_costcenter_used_in__name
pk_costcenter_used_in	string	否	pk_costcenter_used_in
pk_profitcenter_used_in__name	string	否	pk_profitcenter_used_in__name 示例：WUHF集团利润中心
pk_profitcenter_used_in	string	否	pk_profitcenter_used_in 示例：1980542272197885954
pk_jobmngfil_after__name	string	否	pk_jobmngfil_after__name 示例：33
pk_jobmngfil_after	string	否	pk_jobmngfil_after 示例：2013084466317623301
pk_user_after__name	string	否	pk_user_after__name 示例：朱一龙
pk_user_after	string	否	pk_user_after 示例：1978274091385749505
pk_location_after__name	string	否	pk_location_after__name 示例：使用位置-新
pk_location_after	string	否	pk_location_after 示例：1988813700609867776
pk_icorg_in	string	否	pk_icorg_in
pk_icorg_in__name	string	否	pk_icorg_in__name
pk_warehouse_in	string	否	pk_warehouse_in
pk_warehouse_in__name	string	否	pk_warehouse_in__name
pk_usedept_after_	string	否	pk_usedept_after_ 示例：1978272493666304000
pk_user_after_	string	否	pk_user_after_ 示例：1978274091385749505
pk_org_	string	否	pk_org_ 示例：1980535426005860360
pk_usedept_before_	string	否	pk_usedept_before_ 示例：1980537255661928456
ytenant	string	否	ytenant 示例：0000LV53NH2Z4URDOP0000
_status	string	否	_status
_convert_bodyvos	string	否	_convert_bodyvos
_status	string	否	_status
resubmitCheckKey	string	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
pk_usedorg_out_	string	否	pk_usedorg_out_ 示例：1980536027314389001
pk_usedorg_in_	string	否	pk_usedorg_in_ 示例：1980535426005860360
pk_recorder_	string	否	pk_recorder_ 示例：1982040657426907136
pk_org_	string	否	pk_org_ 示例：1980535426005860360
ytenant	string	否	ytenant 示例：0000LV53NH2Z4URDOP0000
bizFlow	string	否	bizFlow
isFlowCoreBill	string	否	isFlowCoreBill
bizFlow_name	string	否	bizFlow_name
bizFlow_version	string	否	bizFlow_version

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"_realtype": "",
		"_entityName": "",
		"_keyName": "",
		"pk_usedorg_out": "1980536027314389001",
		"pk_usedorg_out__name": "WUHF资产组织",
		"pk_usedorg_in": "1980535426005860360",
		"pk_usedorg_in__name": "WUHF集团资产组织",
		"bill_status": 0,
		"bill_code": "SYDR202406190001",
		"bill_type": "4A48",
		"pk_transitype": "null",
		"transi_type": "4A48-01",
		"bill_date": "2024-06-19 00:00:00",
		"pk_recorder": "1982040657426907136",
		"pk_recorder__name": "武慧峰",
		"memo": "1221212",
		"pk_usedorg_out_v": "",
		"pk_usedorg_in_v": "",
		"pk_org_v": "",
		"pk_org": "1980535426005860360",
		"pk_org__name": "WUHF集团资产组织",
		"id": "2023608922899742728",
		"pubts": "2024-09-05 14:44:51",
		"tenant": "0000LV53NH2Z4URDOP0000",
		"sysid": "AUM",
		"isWfControlled": false,
		"returncount": 0,
		"verifystate": 0,
		"pk_transitype__name": "",
		"billmaker": "018532e9-5aff-43e3-8157-c583afb6db67",
		"billmaker__name": "昵称-15727377404",
		"billmaketime": "2024-06-19 14:38:04",
		"modifier": "018532e9-5aff-43e3-8157-c583afb6db67",
		"modifier__name": "昵称-15727377404",
		"modifiedtime": "2024-09-05 14:44:50",
		"auditor__name": "",
		"creator": "018532e9-5aff-43e3-8157-c583afb6db67",
		"creator__name": "昵称-15727377404",
		"creationtime": "2024-06-19 14:38:04",
		"bodyvos": [
			{
				"_realtype": "",
				"_entityName": "",
				"_keyName": "",
				"bill_code_src": "SYDC202406190002",
				"src_pk_bill": "2023608751101050886",
				"pk_usedept_before": "1980537255661928456",
				"src_bill_type": "4A47",
				"pk_costcenter_used_out": "2001976521241133059",
				"memo": "sss",
				"main_id": "2023608922899742728",
				"src_pk_bill_b": "2023608751101050887",
				"pk_equip__pk_category": "1986521605413011465",
				"pk_org": "1980535426005860360",
				"src_transitype": "4A47-01",
				"pk_equip__equip_code": "202405210001",
				"pk_equip": "2001987250055282690",
				"pk_costcenter_used_out__name": "有效类别",
				"pk_equip__pk_category__category_name": "技术参数类别",
				"pk_equip__equip_name": "001",
				"id": "2023608922899742729",
				"tenant": "0000LV53NH2Z4URDOP0000",
				"stock_in_flag": false,
				"pk_usedept_before__name": "WUHF资产部门",
				"pk_equip__pk_ownerorg": "1980536027314389001",
				"pk_equip__special_flag": false,
				"pk_usedept_after__name": "销售部",
				"pk_usedept_after": "1978272493666304000",
				"pk_costcenter_used_in__name": "",
				"pk_costcenter_used_in": "",
				"pk_profitcenter_used_in__name": "WUHF集团利润中心",
				"pk_profitcenter_used_in": "1980542272197885954",
				"pk_jobmngfil_after__name": "33",
				"pk_jobmngfil_after": "2013084466317623301",
				"pk_user_after__name": "朱一龙",
				"pk_user_after": "1978274091385749505",
				"pk_location_after__name": "使用位置-新",
				"pk_location_after": "1988813700609867776",
				"pk_icorg_in": "",
				"pk_icorg_in__name": "",
				"pk_warehouse_in": "",
				"pk_warehouse_in__name": "",
				"pk_usedept_after_": "1978272493666304000",
				"pk_user_after_": "1978274091385749505",
				"pk_org_": "1980535426005860360",
				"pk_usedept_before_": "1980537255661928456",
				"ytenant": "0000LV53NH2Z4URDOP0000",
				"_status": ""
			}
		],
		"_convert_bodyvos": "",
		"_status": "",
		"resubmitCheckKey": "aum_deploy_usedin_card_edit_7c09dee6-7a5e-4ee8-8f12-edb29830c5ff",
		"pk_usedorg_out_": "1980536027314389001",
		"pk_usedorg_in_": "1980535426005860360",
		"pk_recorder_": "1982040657426907136",
		"pk_org_": "1980535426005860360",
		"ytenant": "0000LV53NH2Z4URDOP0000",
		"bizFlow": "",
		"isFlowCoreBill": "",
		"bizFlow_name": "",
		"bizFlow_version": ""
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

