---
title: "资产盘亏保存"
apiId: "2066114908647849984"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Inventory Loss Document"
domain: "GAM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Inventory Loss Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 资产盘亏保存

>  请求方式	POST | Inventory Loss Document (GAM)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/am/inventoryLoss/save
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
data	object	否	否	资产盘亏对象
pk_group	string	否	否	集团 示例：666666
pk_org	string	否	否	资产组织主键 示例：1947771225169199106
bill_code	string	否	否	盘亏单号 示例：ZCPK202408150001
bill_status	number
小数位数:0,最大长度:10	否	否	单据状态 示例：0 默认值：0
src_bill_code	string	否	否	盘点单号 示例：ZCPD202408150002
inventory_date	date
格式:yyyy-MM-dd	否	否	盘点日期 示例：2024-08-15
src_bill_type	string	否	否	来源单据类型 示例：4A35
src_transitype	string	否	否	来源交易类型 示例：4A35-01
src_pk_bill	string	否	否	来源单据表头主键 示例：2066095375128199168
src_pk_transitype	string	否	否	来源交易类型主键
memo	string	否	否	备注
bill_type	string	否	否	单据类型 示例：4A21
pk_transitype	string	否	否	交易类型主键 示例：1944274228437583525
transi_type	string	否	否	交易类型主键 示例：4A21-01
_status	string	否	否	状态（仅支持Insert） 示例：Insert 默认值：Insert
bodyvos	object	是	否	资产盘亏对象子表

## 3. 请求示例

Url: /yonbip/am/inventoryLoss/save?access_token=访问令牌
Body: {
	"data": {
		"pk_group": "666666",
		"pk_org": "1947771225169199106",
		"bill_code": "ZCPK202408150001",
		"bill_status": 0,
		"src_bill_code": "ZCPD202408150002",
		"inventory_date": "2024-08-15",
		"src_bill_type": "4A35",
		"src_transitype": "4A35-01",
		"src_pk_bill": "2066095375128199168",
		"src_pk_transitype": "",
		"memo": "",
		"bill_type": "4A21",
		"pk_transitype": "1944274228437583525",
		"transi_type": "4A21-01",
		"_status": "Insert",
		"bodyvos": [
			{
				"pk_group": "666666",
				"pk_location_before": "1947781335490756616",
				"inventory_person": "",
				"inventory_date": "2024-08-15",
				"stock_out_flag": true,
				"pk_org": "1947771225169199106",
				"pk_equip": "2066047623688617993",
				"pk_addreducestyle": "",
				"pk_reason": "1947783379900432392",
				"memo": "",
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
_realtype	string	否	_realtype
_entityName	string	否	_entityName
_keyName	string	否	_keyName
pk_group	string	否	pk_group 示例：666666
pk_org	string	否	pk_org 示例：1947771225169199106
pk_org__name	string	否	pk_org__name 示例：WUHF集团资产组织
pk_org_v__name	string	否	pk_org_v__name
bill_code	string	否	bill_code 示例：ZCPK202408150001
bill_status	number
小数位数:0,最大长度:10	否	bill_status 示例：0
src_bill_code	string	否	src_bill_code 示例：ZCPD202408150002
inventory_date	string	否	inventory_date 示例：2024-08-15 00:00:00
pk_recorder	string	否	pk_recorder 示例：1956048812535971842
pk_recorder__name	string	否	pk_recorder__name 示例：武慧峰
src_bill_type	string	否	src_bill_type 示例：4A35
src_transitype	string	否	src_transitype 示例：4A35-01
src_pk_bill	string	否	src_pk_bill 示例：2066095375128199168
memo	string	否	memo 示例：412341234
dr	number
小数位数:0,最大长度:10	否	dr 示例：0
isWfControlled	boolean	否	isWfControlled 示例：false
returncount	number
小数位数:0,最大长度:10	否	returncount 示例：0
tenant	string	否	tenant 示例：0000LTCILMT7H2K2LB0000
bill_type	string	否	bill_type 示例：4A21
pk_transitype	string	否	pk_transitype 示例：1944274228437583525
transi_type	string	否	transi_type 示例：4A21-01
pk_transitype__name	string	否	pk_transitype__name 示例：资产盘亏
id	string	否	id 示例：2066095881934340100
pubts	string	否	pubts 示例：2024-08-15 20:34:32
sysid	string	否	sysid 示例：AUM
billmaker	string	否	billmaker 示例：f639d810-37d3-40d7-b74e-0e73bc2127b1
billmaker__name	string	否	billmaker__name 示例：昵称-API集团员工
billmaketime	string	否	billmaketime 示例：2024-08-15 20:33:37
modifier__name	string	否	modifier__name 示例：昵称-API集团员工
auditor__name	string	否	auditor__name
creator	string	否	creator 示例：f639d810-37d3-40d7-b74e-0e73bc2127b1
creator__name	string	否	creator__name 示例：昵称-API集团员工
creationtime	string	否	creationtime 示例：2024-08-15 20:33:37
verifystate	number
小数位数:0,最大长度:10	否	verifystate 示例：0
push_status	number
小数位数:0,最大长度:10	否	push_status 示例：0
bodyvos	object	是	bodyvos
_realtype	string	否	_realtype
_entityName	string	否	_entityName
_keyName	string	否	_keyName
pk_group	string	否	pk_group 示例：666666
pk_org__name	string	否	pk_org__name 示例：WUHF集团资产组织
pk_location_before	string	否	pk_location_before 示例：1947781335490756616
pk_equip__pk_location	string	否	pk_equip__pk_location 示例：1947781335490756616
main_id	string	否	main_id 示例：2066095881934340100
inventory_person	string	否	inventory_person 示例：自动化_普通员工（勿动）
pk_location_before__location_name	string	否	pk_location_before__location_name 示例：WUHF集团运行位置
inventory_date	string	否	inventory_date 示例：2024-08-15 00:00:00
stock_out_flag	boolean	否	stock_out_flag 示例：false
dr	number
小数位数:0,最大长度:10	否	dr 示例：0
pk_org	string	否	pk_org 示例：1947771225169199106
pk_equip__equip_code	string	否	pk_equip__equip_code 示例：EAM-TEST-202408150001
pk_equip	string	否	pk_equip 示例：2066047623688617993
pk_equip__equip_name	string	否	pk_equip__equip_name 示例：盘点测试资产1
id	string	否	id 示例：2066095881934340101
tenant	string	否	tenant 示例：0000LTCILMT7H2K2LB0000
pk_addreducestyle__name	string	否	pk_addreducestyle__name 示例：盘亏
pk_addreducestyle	string	否	pk_addreducestyle 示例：1944274228419232088
pk_reason__name	string	否	pk_reason__name 示例：WUHF减少原因
pk_reason	string	否	pk_reason 示例：1947783379900432392
memo	string	否	memo 示例：123423
_status	string	否	_status
pk_org_	string	否	pk_org_ 示例：1947771225169199106
ytenant	string	否	ytenant 示例：0000LTCILMT7H2K2LB0000
_convert_bodyvos	string	否	_convert_bodyvos
_status	string	否	_status
resubmitCheckKey	string	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
modifier	string	否	modifier 示例：f639d810-37d3-40d7-b74e-0e73bc2127b1
modifiedtime	string	否	modifiedtime 示例：2024-08-15 20:34:32
pk_org_	string	否	pk_org_ 示例：1947771225169199106
pk_recorder_	string	否	pk_recorder_ 示例：1956048812535971842
ytenant	string	否	ytenant 示例：0000LTCILMT7H2K2LB0000

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"_realtype": "",
		"_entityName": "",
		"_keyName": "",
		"pk_group": "666666",
		"pk_org": "1947771225169199106",
		"pk_org__name": "WUHF集团资产组织",
		"pk_org_v__name": "",
		"bill_code": "ZCPK202408150001",
		"bill_status": 0,
		"src_bill_code": "ZCPD202408150002",
		"inventory_date": "2024-08-15 00:00:00",
		"pk_recorder": "1956048812535971842",
		"pk_recorder__name": "武慧峰",
		"src_bill_type": "4A35",
		"src_transitype": "4A35-01",
		"src_pk_bill": "2066095375128199168",
		"memo": "412341234",
		"dr": 0,
		"isWfControlled": false,
		"returncount": 0,
		"tenant": "0000LTCILMT7H2K2LB0000",
		"bill_type": "4A21",
		"pk_transitype": "1944274228437583525",
		"transi_type": "4A21-01",
		"pk_transitype__name": "资产盘亏",
		"id": "2066095881934340100",
		"pubts": "2024-08-15 20:34:32",
		"sysid": "AUM",
		"billmaker": "f639d810-37d3-40d7-b74e-0e73bc2127b1",
		"billmaker__name": "昵称-API集团员工",
		"billmaketime": "2024-08-15 20:33:37",
		"modifier__name": "昵称-API集团员工",
		"auditor__name": "",
		"creator": "f639d810-37d3-40d7-b74e-0e73bc2127b1",
		"creator__name": "昵称-API集团员工",
		"creationtime": "2024-08-15 20:33:37",
		"verifystate": 0,
		"push_status": 0,
		"bodyvos": [
			{
				"_realtype": "",
				"_entityName": "",
				"_keyName": "",
				"pk_group": "666666",
				"pk_org__name": "WUHF集团资产组织",
				"pk_location_before": "1947781335490756616",
				"pk_equip__pk_location": "1947781335490756616",
				"main_id": "2066095881934340100",
				"inventory_person": "自动化_普通员工（勿动）",
				"pk_location_before__location_name": "WUHF集团运行位置",
				"inventory_date": "2024-08-15 00:00:00",
				"stock_out_flag": false,
				"dr": 0,
				"pk_org": "1947771225169199106",
				"pk_equip__equip_code": "EAM-TEST-202408150001",
				"pk_equip": "2066047623688617993",
				"pk_equip__equip_name": "盘点测试资产1",
				"id": "2066095881934340101",
				"tenant": "0000LTCILMT7H2K2LB0000",
				"pk_addreducestyle__name": "盘亏",
				"pk_addreducestyle": "1944274228419232088",
				"pk_reason__name": "WUHF减少原因",
				"pk_reason": "1947783379900432392",
				"memo": "123423",
				"_status": "",
				"pk_org_": "1947771225169199106",
				"ytenant": "0000LTCILMT7H2K2LB0000"
			}
		],
		"_convert_bodyvos": "",
		"_status": "",
		"resubmitCheckKey": "aum_inventory_loss_card_edit_b231de8a-b0ce-4f65-9ff3-9f2e6f7891e7",
		"modifier": "f639d810-37d3-40d7-b74e-0e73bc2127b1",
		"modifiedtime": "2024-08-15 20:34:32",
		"pk_org_": "1947771225169199106",
		"pk_recorder_": "1956048812535971842",
		"ytenant": "0000LTCILMT7H2K2LB0000"
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

