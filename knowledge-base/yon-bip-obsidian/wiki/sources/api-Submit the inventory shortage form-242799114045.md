---
title: "资产盘亏集成_弃审删除固定资产减少"
apiId: "2427991140459872256"
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

# 资产盘亏集成_弃审删除固定资产减少

>  请求方式	POST | Inventory Loss Document (GAM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/am/inventoryLossIntegrated/unapprove
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
pk_redeploy_out	string	否	否	调出单主键
pk_group	string	否	否	集团
pk_org	string	否	否	资产组织最新版本
bill_code	string	否	否	调出单号
bill_date	date
格式:yyyy-MM-dd HH:mm:ss	否	否	调拨日期
bill_type	string	否	否	单据类型
bill_status	number
小数位数:0,最大长度:4	否	否	单据状态
busi_type	string	否	否	业务类型
pk_transitype	string	否	否	交易类型
transi_type	string	否	否	交易类型编码
workflow_status	number
小数位数:0,最大长度:38	否	否	工作流状态
pk_usedorg_out	string	否	否	调出使用管理组织最新版本
pk_usedorg_in	string	否	否	调入使用管理组织最新版本
pk_recorder	string	否	否	经办人
auditor	string	否	否	审批人
audittime	date
格式:yyyy-MM-dd HH:mm:ss	否	否	审批时间
check_opinion	string	否	否	审批意见
creator	string	否	否	创建人
creationtime	date
格式:yyyy-MM-dd HH:mm:ss	否	否	创建时间
modifier	string	否	否	最后修改人
modifiedtime	date
格式:yyyy-MM-dd HH:mm:ss	否	否	最后修改时间
memo	string	否	否	备注
pk_org_v	string	否	否	资产组织
pk_usedorg_out_v	string	否	否	调出使用管理组织
pk_usedorg_in_v	string	否	否	调入使用管理组织
billmaker	string	否	否	制单人
billmaketime	date
格式:yyyy-MM-dd HH:mm:ss	否	否	制单时间
saga_gtxid	string	否	否	全局事务
saga_btxid	string	否	否	子事务
saga_frozen	number
小数位数:0,最大长度:38	否	否	冻结状态
saga_status	number
小数位数:0,最大长度:38	否	否	事务状态
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
body	object	是	否	所有权调出明细
pk_redeploy_out_b	string	否	否	调出单子表主键
pk_org	string	否	否	资产组织最新版本
rowno	string	否	否	行号
pk_equip	string	否	否	设备
pk_usedunit_in	string	否	否	调入使用权最新版本
pk_usedept_after	string	否	否	调入使用部门最新版本
pk_user_after	string	否	否	调入责任人
pk_location_after	string	否	否	调入位置
pk_icorg_in	string	否	否	调入库存组织最新版本
pk_warehouse_in	string	否	否	调入仓库
pk_addreducestyle	string	否	否	调拨方式
pk_reason	string	否	否	调拨原因
pk_currency	string	否	否	财务币种
origin_value	number
小数位数:8,最大长度:28	否	否	原值
accu_dep	number
小数位数:8,最大长度:28	否	否	累计折旧
new_value	number
小数位数:8,最大长度:28	否	否	净值
net_money	number
小数位数:8,最大长度:28	否	否	净额
dep_amount	number
小数位数:8,最大长度:28	否	否	月折旧额
used_month	number
小数位数:0,最大长度:38	否	否	已计提期数
service_month	number
小数位数:0,最大长度:38	否	否	使用月限
salvage	number
小数位数:8,最大长度:28	否	否	净残值
begin_date	date
格式:yyyy-MM-dd HH:mm:ss	否	否	开始使用日期
salvage_rate	number
小数位数:8,最大长度:28	否	否	净残值率%
pre_devaluate	number
小数位数:8,最大长度:28	否	否	减值准备
pk_usedunit_out	string	否	否	调出使用权最新版本
pk_usedept_before	string	否	否	调出使用部门最新版本
pk_user_before	string	否	否	调出责任人
pk_location_before	string	否	否	调拨前位置
pk_icorg_out	string	否	否	调出库存组织最新版本
pk_warehouse_out	string	否	否	调出仓库
origin_value_before	number
小数位数:8,最大长度:28	否	否	调拨前原值
accu_dep_before	number
小数位数:8,最大长度:28	否	否	调拨前累计折旧
new_value_before	number
小数位数:8,最大长度:28	否	否	调拨前净值
net_money_before	number
小数位数:8,最大长度:28	否	否	调拨前净额
dep_amount_before	number
小数位数:8,最大长度:28	否	否	调拨前月折旧额
used_month_before	number
小数位数:0,最大长度:38	否	否	调拨前已计提月份
service_month_before	number
小数位数:0,最大长度:38	否	否	调拨前使用月限
salvage_before	number
小数位数:8,最大长度:28	否	否	调拨前净残值
salvage_rate_before	number
小数位数:8,最大长度:28	否	否	调拨前净残值率%
begin_date_before	date
格式:yyyy-MM-dd HH:mm:ss	否	否	调拨前开始使用日期
pre_devaluate_before	number
小数位数:8,最大长度:28	否	否	调拨前减值准备
pk_card_before	string	否	否	调拨前卡片
associate_flag_before	string	否	否	联动固定资产
pk_jobmngfil	string	否	否	项目
pk_status_before	string	否	否	调拨前状态
pk_status_after	string	否	否	调拨后状态
status_date_before	date
格式:yyyy-MM-dd HH:mm:ss	否	否	调拨前状态日期
status_date_after	date
格式:yyyy-MM-dd HH:mm:ss	否	否	调拨后状态日期
stock_out_flag	string	否	否	出库标志
stock_in_flag	string	否	否	入库标志
memo	string	否	否	备注
pk_org_v	string	否	否	资产组织
pk_usedunit_in_v	string	否	否	调入使用权
pk_usedunit_out_v	string	否	否	调出使用权
pk_icorg_in_v	string	否	否	调入库存组织
pk_icorg_out_v	string	否	否	调出库存组织
pk_group	string	否	否	集团
pk_usedorg_out	string	否	否	调出使用管理组织最新版本
pk_usedorg_out_v	string	否	否	调出使用管理组织
pk_usedept_after_v	string	否	否	调入使用部门
pk_usedept_before_v	string	否	否	调出使用部门
pk_org_before	string	否	否	调拨前设备主组织最新版本
pk_org_before_v	string	否	否	调拨前设备主组织
pk_org_after	string	否	否	调拨后设备主组织最新版本
pk_org_after_v	string	否	否	调拨后设备主组织
bill_type_src	string	否	否	来源单据类型
pk_bill_src	string	否	否	来源单据主键
pk_bill_b_src	string	否	否	来源单据表体主键
pk_transitype_src	string	否	否	来源交易类型
transi_type_src	string	否	否	来源交易类型编码
equip_name	string	否	否	设备名称
pk_category	string	否	否	设备类别
equip_spec	string	否	否	规格
equip_model	string	否	否	型号
bill_code_src	string	否	否	来源单据号
isapprove_deployin	string	否	否	下游单据是否审批
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
pk_faorg_in	string	否	否	调入财务组织
pk_faorg_out	string	否	否	调出财务组织

## 3. 请求示例

Url: /yonbip/am/inventoryLossIntegrated/unapprove?access_token=访问令牌
Body: {
	"pk_redeploy_out": "",
	"pk_group": "",
	"pk_org": "",
	"bill_code": "",
	"bill_date": "2026-06-07 13:22:25",
	"bill_type": "",
	"bill_status": 0,
	"busi_type": "",
	"pk_transitype": "",
	"transi_type": "",
	"workflow_status": 0,
	"pk_usedorg_out": "",
	"pk_usedorg_in": "",
	"pk_recorder": "",
	"auditor": "",
	"audittime": "2026-06-07 13:22:25",
	"check_opinion": "",
	"creator": "",
	"creationtime": "2026-06-07 13:22:25",
	"modifier": "",
	"modifiedtime": "2026-06-07 13:22:25",
	"memo": "",
	"pk_org_v": "",
	"pk_usedorg_out_v": "",
	"pk_usedorg_in_v": "",
	"billmaker": "",
	"billmaketime": "2026-06-07 13:22:25",
	"saga_gtxid": "",
	"saga_btxid": "",
	"saga_frozen": 0,
	"saga_status": 0,
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
			"pk_redeploy_out_b": "",
			"pk_org": "",
			"rowno": "",
			"pk_equip": "",
			"pk_usedunit_in": "",
			"pk_usedept_after": "",
			"pk_user_after": "",
			"pk_location_after": "",
			"pk_icorg_in": "",
			"pk_warehouse_in": "",
			"pk_addreducestyle": "",
			"pk_reason": "",
			"pk_currency": "",
			"origin_value": 0,
			"accu_dep": 0,
			"new_value": 0,
			"net_money": 0,
			"dep_amount": 0,
			"used_month": 0,
			"service_month": 0,
			"salvage": 0,
			"begin_date": "2026-06-07 13:22:25",
			"salvage_rate": 0,
			"pre_devaluate": 0,
			"pk_usedunit_out": "",
			"pk_usedept_before": "",
			"pk_user_before": "",
			"pk_location_before": "",
			"pk_icorg_out": "",
			"pk_warehouse_out": "",
			"origin_value_before": 0,
			"accu_dep_before": 0,
			"new_value_before": 0,
			"net_money_before": 0,
			"dep_amount_before": 0,
			"used_month_before": 0,
			"service_month_before": 0,
			"salvage_before": 0,
			"salvage_rate_before": 0,
			"begin_date_before": "2026-06-07 13:22:25",
			"pre_devaluate_before": 0,
			"pk_card_before": "",
			"associate_flag_before": "",
			"pk_jobmngfil": "",
			"pk_status_before": "",
			"pk_status_after": "",
			"status_date_before": "2026-06-07 13:22:25",
			"status_date_after": "2026-06-07 13:22:25",
			"stock_out_flag": "",
			"stock_in_flag": "",
			"memo": "",
			"pk_org_v": "",
			"pk_usedunit_in_v": "",
			"pk_usedunit_out_v": "",
			"pk_icorg_in_v": "",
			"pk_icorg_out_v": "",
			"pk_group": "",
			"pk_usedorg_out": "",
			"pk_usedorg_out_v": "",
			"pk_usedept_after_v": "",
			"pk_usedept_before_v": "",
			"pk_org_before": "",
			"pk_org_before_v": "",
			"pk_org_after": "",
			"pk_org_after_v": "",
			"bill_type_src": "",
			"pk_bill_src": "",
			"pk_bill_b_src": "",
			"pk_transitype_src": "",
			"transi_type_src": "",
			"equip_name": "",
			"pk_category": "",
			"equip_spec": "",
			"equip_model": "",
			"bill_code_src": "",
			"isapprove_deployin": "",
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
			"pk_faorg_in": "",
			"pk_faorg_out": ""
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

