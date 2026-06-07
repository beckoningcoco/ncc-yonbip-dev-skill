---
title: "差异调整保存"
apiId: "2066093811768492041"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Variance Adjustment Document"
domain: "GAM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Variance Adjustment Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 差异调整保存

>  请求方式	POST | Variance Adjustment Document (GAM)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/am/inventoryDiff/save
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
data	object	否	是	差异调整单对象
push_status	string	否	否	固资对接生单状态
error_msg	string	否	否	固资对接异常信息
pk_group	string	否	否	集团 示例：666666
pk_org	string	否	是	资产组织 示例：1947771225169199106
bill_code	string	否	否	差异调整单号 示例：CYTZ202408150001
bill_status	number
小数位数:0,最大长度:10	否	是	单据状态 示例：0 默认值：0
src_bill_code	string	否	否	盘点单号 示例：ZCPD202408150001
inventory_date	date
格式:yyyy-MM-dd	否	否	盘点日期 示例：2024-08-15
pk_recorder	string	否	否	经办人 示例：1956048812535971842
src_bill_type	string	否	否	来源单据类型 示例：4A35
src_transitype	string	否	否	来源交易类型 示例：4A35-01
src_pk_bill	string	否	否	来源单据表头主键 示例：2066048139087839235
memo	string	否	否	备注
bill_type	string	否	否	单据类型 示例：4A46
transi_type	string	否	否	交易类型编码 示例：4A46-01
pk_transitype	string	否	否	交易类型主键 示例：1944274228437583536
_status	string	否	否	状态（仅支持Insert） 示例：Insert 默认值：Insert
bodyvos	object	是	否	差异调整子表对象

## 3. 请求示例

Url: /yonbip/am/inventoryDiff/save?access_token=访问令牌
Body: {
	"data": {
		"push_status": "",
		"error_msg": "",
		"pk_group": "666666",
		"pk_org": "1947771225169199106",
		"bill_code": "CYTZ202408150001",
		"bill_status": 0,
		"src_bill_code": "ZCPD202408150001",
		"inventory_date": "2024-08-15",
		"pk_recorder": "1956048812535971842",
		"src_bill_type": "4A35",
		"src_transitype": "4A35-01",
		"src_pk_bill": "2066048139087839235",
		"memo": "",
		"bill_type": "4A46",
		"transi_type": "4A46-01",
		"pk_transitype": "1944274228437583536",
		"_status": "Insert",
		"bodyvos": [
			{
				"pk_group": "666666",
				"pk_org": "1947771225169199106",
				"pk_usedept_before": "1947892480685899784",
				"pk_usedept_after": "1947892480685899784",
				"pk_user_before": "1956048812535971842",
				"pk_user_after": "1956048812535971842",
				"pk_location_before": "1947781335490756616",
				"pk_location_after": "1947781335490756616",
				"pk_manager_before": "1956048812535971842",
				"pk_manager_after": "1956048812535971842",
				"pk_equip": "2066047623688617993",
				"pk_equip__equip_code": "EAM-TEST-202408150001",
				"pk_equip__pk_usedorg": "1947771225169199106",
				"pk_equip__pk_ownerorg": "1947771225169199106",
				"pk_used_status_before": "PRESET01_0000LTCILMT7H2K2LB0000",
				"pk_used_status_after": "PRESET01_0000LTCILMT7H2K2LB0000",
				"pk_mandept_before": "1947892480685899784",
				"pk_mandept_after": "1947892480685899784",
				"status_date_before": "2024-08-15",
				"status_date_after": "2024-08-15",
				"alter_flag": true,
				"bar_code": "",
				"bar_code_after": "2312",
				"pk_reason": "1947783285412200452",
				"_status": "Insert"
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
code	number
小数位数:0,最大长度:10	否	code 示例：200
message	string	否	message 示例：操作成功！
data	object	否	data
_realtype	string	否	_realtype
_entityName	string	否	_entityName
_keyName	string	否	_keyName
pk_group	string	否	pk_group 示例：666666
pk_org	string	否	pk_org 示例：1947771225169199106
pk_org__name	string	否	pk_org__name 示例：WUHF集团资产组织
pk_org_v__name	string	否	pk_org_v__name
bill_code	string	否	bill_code 示例：CYTZ202408150001
bill_status	number
小数位数:0,最大长度:10	否	bill_status 示例：0
src_bill_code	string	否	src_bill_code 示例：ZCPD202408150001
inventory_date	string	否	inventory_date 示例：2024-08-15 00:00:00
pk_recorder	string	否	pk_recorder 示例：1956048812535971842
pk_recorder__name	string	否	pk_recorder__name 示例：武慧峰
src_bill_type	string	否	src_bill_type 示例：4A35
src_transitype	string	否	src_transitype 示例：4A35-01
src_pk_bill	string	否	src_pk_bill 示例：2066048139087839235
memo	string	否	memo 示例：请问日期
dr	number
小数位数:0,最大长度:10	否	dr 示例：0
isWfControlled	boolean	否	isWfControlled 示例：false
verifystate	number
小数位数:0,最大长度:10	否	verifystate 示例：0
returncount	number
小数位数:0,最大长度:10	否	returncount 示例：0
tenant	string	否	tenant 示例：0000LTCILMT7H2K2LB0000
bill_type	string	否	bill_type 示例：4A46
pk_transitype	string	否	pk_transitype 示例：1944274228437583536
transi_type	string	否	transi_type 示例：4A46-01
pk_transitype__name	string	否	pk_transitype__name 示例：差异调整
push_status	number
小数位数:0,最大长度:10	否	push_status 示例：0
id	string	否	id 示例：2066049006671233026
pubts	string	否	pubts 示例：2024-08-15 19:04:23
sysid	string	否	sysid 示例：AUM
billmaker	string	否	billmaker 示例：f639d810-37d3-40d7-b74e-0e73bc2127b1
billmaker__name	string	否	billmaker__name 示例：昵称-API集团员工
billmaketime	string	否	billmaketime 示例：2024-08-15 19:02:40
modifier	string	否	modifier 示例：f639d810-37d3-40d7-b74e-0e73bc2127b1
modifier__name	string	否	modifier__name 示例：昵称-API集团员工
modifiedtime	string	否	modifiedtime 示例：2024-08-15 19:04:23
auditor__name	string	否	auditor__name
creator	string	否	creator 示例：f639d810-37d3-40d7-b74e-0e73bc2127b1
creator__name	string	否	creator__name 示例：昵称-API集团员工
creationtime	string	否	creationtime 示例：2024-08-15 19:02:40
bodyvos	object	是	bodyvos
_convert_bodyvos	string	否	_convert_bodyvos
_status	string	否	_status
resubmitCheckKey	string	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
pk_org_	string	否	pk_org_ 示例：1947771225169199106
pk_recorder_	string	否	pk_recorder_ 示例：1956048812535971842
ytenant	string	否	ytenant 示例：0000LTCILMT7H2K2LB0000
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
		"pk_org": "1947771225169199106",
		"pk_org__name": "WUHF集团资产组织",
		"pk_org_v__name": "",
		"bill_code": "CYTZ202408150001",
		"bill_status": 0,
		"src_bill_code": "ZCPD202408150001",
		"inventory_date": "2024-08-15 00:00:00",
		"pk_recorder": "1956048812535971842",
		"pk_recorder__name": "武慧峰",
		"src_bill_type": "4A35",
		"src_transitype": "4A35-01",
		"src_pk_bill": "2066048139087839235",
		"memo": "请问日期",
		"dr": 0,
		"isWfControlled": false,
		"verifystate": 0,
		"returncount": 0,
		"tenant": "0000LTCILMT7H2K2LB0000",
		"bill_type": "4A46",
		"pk_transitype": "1944274228437583536",
		"transi_type": "4A46-01",
		"pk_transitype__name": "差异调整",
		"push_status": 0,
		"id": "2066049006671233026",
		"pubts": "2024-08-15 19:04:23",
		"sysid": "AUM",
		"billmaker": "f639d810-37d3-40d7-b74e-0e73bc2127b1",
		"billmaker__name": "昵称-API集团员工",
		"billmaketime": "2024-08-15 19:02:40",
		"modifier": "f639d810-37d3-40d7-b74e-0e73bc2127b1",
		"modifier__name": "昵称-API集团员工",
		"modifiedtime": "2024-08-15 19:04:23",
		"auditor__name": "",
		"creator": "f639d810-37d3-40d7-b74e-0e73bc2127b1",
		"creator__name": "昵称-API集团员工",
		"creationtime": "2024-08-15 19:02:40",
		"bodyvos": [
			{
				"_realtype": "",
				"_entityName": "",
				"_keyName": "",
				"pk_group": "666666",
				"pk_usedept_after": "1947892480685899784",
				"pk_user_before": "1956048812535971842",
				"pk_manager_after__name": "武慧峰",
				"pk_location_before": "1947781335490756616",
				"pk_manager_after": "1956048812535971842",
				"dr": 0,
				"pk_usedept_after__name": "WUHF集团部门",
				"pk_org": "1947771225169199106",
				"pk_user_before__name": "武慧峰",
				"pk_used_status_before__status_name": "在用",
				"pk_equip__equip_code": "EAM-TEST-202408150001",
				"pk_manager_before__name": "武慧峰",
				"pk_manager_before": "1956048812535971842",
				"pk_used_status_after__status_name": "闲置",
				"pk_used_status_before": "PRESET01_0000LTCILMT7H2K2LB0000",
				"pk_mandept_before__name": "WUHF集团部门",
				"id": "2066049006671233027",
				"tenant": "0000LTCILMT7H2K2LB0000",
				"pk_equip__pk_ownerorg": "1947771225169199106",
				"pk_usedept_before": "1947892480685899784",
				"pk_mandept_after__name": "WUHF集团部门",
				"pk_equip__pk_usedorg": "1947771225169199106",
				"pk_mandept_after": "1947892480685899784",
				"pk_org__name": "WUHF集团资产组织",
				"status_date_before": "2024-08-15 00:00:00",
				"main_id": "2066049006671233026",
				"pk_location_after": "1947781335490756616",
				"pk_user_after": "1956048812535971842",
				"pk_used_status_after": "PRESET03_0000LTCILMT7H2K2LB0000",
				"pk_location_before__location_name": "WUHF集团运行位置",
				"pk_location_after__location_name": "WUHF集团运行位置",
				"pk_mandept_before": "1947892480685899784",
				"pk_equip": "2066047623688617993",
				"pk_user_after__name": "武慧峰",
				"alter_flag": false,
				"pk_equip__equip_name": "盘点测试资产1",
				"pk_usedept_before__name": "WUHF集团部门",
				"bar_code_after": "2312",
				"pk_reason__name": "WUHF变动原因",
				"pk_reason": "1947783285412200452",
				"memo": "asdfds",
				"pk_mandept_before_": "1947892480685899784",
				"pk_mandept_after_": "1947892480685899784",
				"pk_usedept_before_": "1947892480685899784",
				"pk_usedept_after_": "1947892480685899784",
				"pk_user_before_": "1956048812535971842",
				"pk_user_after_": "1956048812535971842",
				"pk_manager_before_": "1956048812535971842",
				"pk_manager_after_": "1956048812535971842",
				"pk_org_": "1947771225169199106",
				"ytenant": "0000LTCILMT7H2K2LB0000",
				"_status": ""
			}
		],
		"_convert_bodyvos": "",
		"_status": "",
		"resubmitCheckKey": "aum_inventory_diff_card_edit_47b199b2-9a71-4059-9f6b-a552f472d9a2",
		"pk_org_": "1947771225169199106",
		"pk_recorder_": "1956048812535971842",
		"ytenant": "0000LTCILMT7H2K2LB0000"
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

