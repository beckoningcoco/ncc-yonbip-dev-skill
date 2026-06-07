---
title: "差异调整集成_生成固定资产变动"
apiId: "2066735162054934532"
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

# 差异调整集成_生成固定资产变动

>  请求方式	POST | Variance Adjustment Document (GAM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/am/inventoryDiffIntegrated/save
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
pk_diffalter	string	否	否	差异调整主键
pk_group	string	否	否	集团
pk_org	string	否	否	资产组织最新版本
pk_org_v	string	否	否	资产组织
bill_code	string	否	否	差异调整单号
bill_type	string	否	否	单据类型
transi_type	string	否	否	交易类型编码
pk_transitype	string	否	否	交易类型
bill_status	number
小数位数:0,最大长度:38	否	否	单据状态
invbillcode	string	否	否	盘点单号
invdate	date
格式:yyyy-MM-dd HH:mm:ss	否	否	盘点日期
pk_recorder	string	否	否	经办人
creator	string	否	否	创建人
creationtime	date
格式:yyyy-MM-dd HH:mm:ss	否	否	创建时间
auditor	string	否	否	审批人
audittime	date
格式:yyyy-MM-dd HH:mm:ss	否	否	审批时间
check_opinion	string	否	否	审批意见
modifier	string	否	否	最后修改人
modifiedtime	date
格式:yyyy-MM-dd HH:mm:ss	否	否	最后修改时间
billmaker	string	否	否	制单人
billmaketime	date
格式:yyyy-MM-dd HH:mm:ss	否	否	制单时间
memo	string	否	否	备注
busi_type	string	否	否	业务类型
billtype_src	string	否	否	来源单据类型
pk_bill_src	string	否	否	来源单据主键
pk_reduce	string	否	否	资产报废单主键
pre_text1	string	否	否	预置字符1
pre_text2	string	否	否	预置字符2
pre_text3	string	否	否	预置字符3
pre_text4	string	否	否	预置字符4
pre_text5	string	否	否	预置字符5
pre_text6	string	否	否	预置字符6
pre_text7	string	否	否	预置字符7
pre_text8	string	否	否	预置字符8
pre_text9	string	否	否	预置字符9
pre_text10	string	否	否	预置字符10
def1	string	否	否	自定义项1
def2	string	否	否	自定义项2
def3	string	否	否	自定义项3
def4	string	否	否	自定义项4
def5	string	否	否	自定义项5
def6	string	否	否	自定义项6
def7	string	否	否	自定义项7
def8	string	否	否	自定义项8
def9	string	否	否	自定义项9
def10	string	否	否	自定义项10
def11	string	否	否	自定义项11
def12	string	否	否	自定义项12
def13	string	否	否	自定义项13
def14	string	否	否	自定义项14
def15	string	否	否	自定义项15
def16	string	否	否	自定义项16
def17	string	否	否	自定义项17
def18	string	否	否	自定义项18
def19	string	否	否	自定义项19
def20	string	否	否	自定义项20
body	object	是	否	差异调整明细
pk_diffalter_b	string	否	否	差异调整子表
rowno	string	否	否	行号
pk_equip	string	否	否	设备
pk_mandept_before	string	否	否	盘点前管理部门最新版本
pk_mandept_before_v	string	否	否	盘点前管理部门
pk_mandept_after	string	否	否	盘点后管理部门最新版本
pk_mandept_after_v	string	否	否	盘点后管理部门
pk_usedunit_before	string	否	否	盘点前使用权最新版本
pk_usedunit_before_v	string	否	否	盘点前使用权
pk_usedunit_after	string	否	否	盘点后使用权最新版本
pk_usedunit_after_v	string	否	否	盘点后使用权
pk_usedept_before	string	否	否	盘点前使用部门最新版本
pk_usedept_before_v	string	否	否	盘点前使用部门
pk_usedept_after	string	否	否	盘点后使用部门最新版本
pk_usedept_after_v	string	否	否	盘点后使用部门
pk_assetuser_before	string	否	否	盘点前责任人
pk_assetuser_after	string	否	否	盘点后责任人
pk_position_before	string	否	否	盘点前位置
pk_position_after	string	否	否	盘点后位置
pk_usingstatus_before	string	否	否	盘点前设备状态
pk_usingstatus_after	string	否	否	盘点后设备状态
diffalert_reason	string	否	否	变动原因
dealresult	string	否	否	处理结果
checkusername	string	否	否	盘点人
check_date	date
格式:yyyy-MM-dd HH:mm:ss	否	否	盘点日期
memo	string	否	否	备注
pk_org	string	否	否	资产组织最新版本
pk_org_v	string	否	否	资产组织
pk_group	string	否	否	集团
status_date_before	date
格式:yyyy-MM-dd HH:mm:ss	否	否	状态变化前日期
status_date_after	date
格式:yyyy-MM-dd HH:mm:ss	否	否	状态变化后日期
alter_flag	string	否	否	成功变动标记
def1	string	否	否	自定义项1
def2	string	否	否	自定义项2
def3	string	否	否	自定义项3
def4	string	否	否	自定义项4
def5	string	否	否	自定义项5
def6	string	否	否	自定义项6
def7	string	否	否	自定义项7
def8	string	否	否	自定义项8
def9	string	否	否	自定义项9
def10	string	否	否	自定义项10
def11	string	否	否	自定义项11
def12	string	否	否	自定义项12
def13	string	否	否	自定义项13
def14	string	否	否	自定义项14
def15	string	否	否	自定义项15
def16	string	否	否	自定义项16
def17	string	否	否	自定义项17
def18	string	否	否	自定义项18
def19	string	否	否	自定义项19
def20	string	否	否	自定义项20

## 3. 请求示例

Url: /yonbip/am/inventoryDiffIntegrated/save?access_token=访问令牌
Body: {
	"pk_diffalter": "",
	"pk_group": "",
	"pk_org": "",
	"pk_org_v": "",
	"bill_code": "",
	"bill_type": "",
	"transi_type": "",
	"pk_transitype": "",
	"bill_status": 0,
	"invbillcode": "",
	"invdate": "2026-06-07 13:22:10",
	"pk_recorder": "",
	"creator": "",
	"creationtime": "2026-06-07 13:22:10",
	"auditor": "",
	"audittime": "2026-06-07 13:22:10",
	"check_opinion": "",
	"modifier": "",
	"modifiedtime": "2026-06-07 13:22:10",
	"billmaker": "",
	"billmaketime": "2026-06-07 13:22:10",
	"memo": "",
	"busi_type": "",
	"billtype_src": "",
	"pk_bill_src": "",
	"pk_reduce": "",
	"pre_text1": "",
	"pre_text2": "",
	"pre_text3": "",
	"pre_text4": "",
	"pre_text5": "",
	"pre_text6": "",
	"pre_text7": "",
	"pre_text8": "",
	"pre_text9": "",
	"pre_text10": "",
	"def1": "",
	"def2": "",
	"def3": "",
	"def4": "",
	"def5": "",
	"def6": "",
	"def7": "",
	"def8": "",
	"def9": "",
	"def10": "",
	"def11": "",
	"def12": "",
	"def13": "",
	"def14": "",
	"def15": "",
	"def16": "",
	"def17": "",
	"def18": "",
	"def19": "",
	"def20": "",
	"body": [
		{
			"pk_diffalter_b": "",
			"rowno": "",
			"pk_equip": "",
			"pk_mandept_before": "",
			"pk_mandept_before_v": "",
			"pk_mandept_after": "",
			"pk_mandept_after_v": "",
			"pk_usedunit_before": "",
			"pk_usedunit_before_v": "",
			"pk_usedunit_after": "",
			"pk_usedunit_after_v": "",
			"pk_usedept_before": "",
			"pk_usedept_before_v": "",
			"pk_usedept_after": "",
			"pk_usedept_after_v": "",
			"pk_assetuser_before": "",
			"pk_assetuser_after": "",
			"pk_position_before": "",
			"pk_position_after": "",
			"pk_usingstatus_before": "",
			"pk_usingstatus_after": "",
			"diffalert_reason": "",
			"dealresult": "",
			"checkusername": "",
			"check_date": "2026-06-07 13:22:10",
			"memo": "",
			"pk_org": "",
			"pk_org_v": "",
			"pk_group": "",
			"status_date_before": "2026-06-07 13:22:10",
			"status_date_after": "2026-06-07 13:22:10",
			"alter_flag": "",
			"def1": "",
			"def2": "",
			"def3": "",
			"def4": "",
			"def5": "",
			"def6": "",
			"def7": "",
			"def8": "",
			"def9": "",
			"def10": "",
			"def11": "",
			"def12": "",
			"def13": "",
			"def14": "",
			"def15": "",
			"def16": "",
			"def17": "",
			"def18": "",
			"def19": "",
			"def20": ""
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
_realtype	string	否	_realtype
_entityName	string	否	_entityName
_keyName	string	否	_keyName
pk_group	string	否	pk_group 示例：666666
pk_usedept_after	string	否	pk_usedept_after 示例：1947892480685899784
pk_user_before	string	否	pk_user_before 示例：1956048812535971842
pk_manager_after__name	string	否	pk_manager_after__name 示例：武慧峰
pk_location_before	string	否	pk_location_before 示例：1947781335490756616
pk_manager_after	string	否	pk_manager_after 示例：1956048812535971842
dr	number
小数位数:0,最大长度:10	否	dr 示例：0
pk_usedept_after__name	string	否	pk_usedept_after__name 示例：WUHF集团部门
pk_org	string	否	pk_org 示例：1947771225169199106
pk_user_before__name	string	否	pk_user_before__name 示例：武慧峰
pk_used_status_before__status_name	string	否	pk_used_status_before__status_name 示例：在用
pk_equip__equip_code	string	否	pk_equip__equip_code 示例：EAM-TEST-202408150001
pk_manager_before__name	string	否	pk_manager_before__name 示例：武慧峰
pk_manager_before	string	否	pk_manager_before 示例：1956048812535971842
pk_used_status_after__status_name	string	否	pk_used_status_after__status_name 示例：闲置
pk_used_status_before	string	否	pk_used_status_before 示例：PRESET01_0000LTCILMT7H2K2LB0000
pk_mandept_before__name	string	否	pk_mandept_before__name 示例：WUHF集团部门
id	string	否	id 示例：2066049006671233027
tenant	string	否	tenant 示例：0000LTCILMT7H2K2LB0000
pk_equip__pk_ownerorg	string	否	pk_equip__pk_ownerorg 示例：1947771225169199106
pk_usedept_before	string	否	pk_usedept_before 示例：1947892480685899784
pk_mandept_after__name	string	否	pk_mandept_after__name 示例：WUHF集团部门
pk_equip__pk_usedorg	string	否	pk_equip__pk_usedorg 示例：1947771225169199106
pk_mandept_after	string	否	pk_mandept_after 示例：1947892480685899784
pk_org__name	string	否	pk_org__name 示例：WUHF集团资产组织
status_date_before	string	否	status_date_before 示例：2024-08-15 00:00:00
main_id	string	否	main_id 示例：2066049006671233026
pk_location_after	string	否	pk_location_after 示例：1947781335490756616
pk_user_after	string	否	pk_user_after 示例：1956048812535971842
pk_used_status_after	string	否	pk_used_status_after 示例：PRESET03_0000LTCILMT7H2K2LB0000
pk_location_before__location_name	string	否	pk_location_before__location_name 示例：WUHF集团运行位置
pk_location_after__location_name	string	否	pk_location_after__location_name 示例：WUHF集团运行位置
pk_mandept_before	string	否	pk_mandept_before 示例：1947892480685899784
pk_equip	string	否	pk_equip 示例：2066047623688617993
pk_user_after__name	string	否	pk_user_after__name 示例：武慧峰
alter_flag	boolean	否	alter_flag 示例：false
pk_equip__equip_name	string	否	pk_equip__equip_name 示例：盘点测试资产1
pk_usedept_before__name	string	否	pk_usedept_before__name 示例：WUHF集团部门
bar_code_after	string	否	bar_code_after 示例：2312
pk_reason__name	string	否	pk_reason__name 示例：WUHF变动原因
pk_reason	string	否	pk_reason 示例：1947783285412200452
memo	string	否	memo 示例：asdfds
pk_mandept_before_	string	否	pk_mandept_before_ 示例：1947892480685899784
pk_mandept_after_	string	否	pk_mandept_after_ 示例：1947892480685899784
pk_usedept_before_	string	否	pk_usedept_before_ 示例：1947892480685899784
pk_usedept_after_	string	否	pk_usedept_after_ 示例：1947892480685899784
pk_user_before_	string	否	pk_user_before_ 示例：1956048812535971842
pk_user_after_	string	否	pk_user_after_ 示例：1956048812535971842
pk_manager_before_	string	否	pk_manager_before_ 示例：1956048812535971842
pk_manager_after_	string	否	pk_manager_after_ 示例：1956048812535971842
pk_org_	string	否	pk_org_ 示例：1947771225169199106
ytenant	string	否	ytenant 示例：0000LTCILMT7H2K2LB0000
_status	string	否	_status
_convert_bodyvos	string	否	_convert_bodyvos
_status	string	否	_status
resubmitCheckKey	string	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
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

