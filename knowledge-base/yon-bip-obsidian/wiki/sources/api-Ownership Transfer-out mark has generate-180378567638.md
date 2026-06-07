---
title: "所有权调出集成_生成固定资产减少"
apiId: "1803785676383584264"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Ownership Transfer-out"
domain: "GAM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Ownership Transfer-out]
platform_version: "BIP"
source_type: community-api-docs
---

# 所有权调出集成_生成固定资产减少

>  请求方式	POST | Ownership Transfer-out (GAM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/am/deployOutIntegrate/save
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

Url: /yonbip/am/deployOutIntegrate/save?access_token=访问令牌
Body: {
	"pk_redeploy_out": "",
	"pk_group": "",
	"pk_org": "",
	"bill_code": "",
	"bill_date": "2026-06-07 13:22:30",
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
	"audittime": "2026-06-07 13:22:30",
	"check_opinion": "",
	"creator": "",
	"creationtime": "2026-06-07 13:22:30",
	"modifier": "",
	"modifiedtime": "2026-06-07 13:22:30",
	"memo": "",
	"pk_org_v": "",
	"pk_usedorg_out_v": "",
	"pk_usedorg_in_v": "",
	"billmaker": "",
	"billmaketime": "2026-06-07 13:22:30",
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
			"begin_date": "2026-06-07 13:22:30",
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
			"begin_date_before": "2026-06-07 13:22:30",
			"pre_devaluate_before": 0,
			"pk_card_before": "",
			"associate_flag_before": "",
			"pk_jobmngfil": "",
			"pk_status_before": "",
			"pk_status_after": "",
			"status_date_before": "2026-06-07 13:22:30",
			"status_date_after": "2026-06-07 13:22:30",
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
code	number
小数位数:0,最大长度:10	否	code 示例：200
message	string	否	返回信息 示例：操作成功！
message	string	否	message 示例：操作成功！
data	object	否	返回数据
pageIndex	long	否	页码 示例：1
pageSize	long	否	每条页数 示例：2
recordCount	long	否	记录数 示例：5
recordList	object	是	返回数据
beginPageIndex	long	否	起始页 示例：1
endPageIndex	long	否	结束页 示例：2
pageCount	long	否	页数 示例：1
data	object	否	data
_entityName	string	否	_entityName 示例：aum.deploy.DeployOutHeadVO
pk_org	string	否	pk_org 示例：1840412186705920004
pk_ownerorg_out__name	string	否	pk_ownerorg_out__name 示例：aa
pk_ownerorg_in	string	否	pk_ownerorg_in 示例：1764630529618477058
bill_code	string	否	bill_code 示例：ZCDC202408160002
pk_ownerorg_in__name	string	否	pk_ownerorg_in__name 示例：全职能组织1
pk_ownerunit_out__name	string	否	pk_ownerunit_out__name 示例：aa
bill_status	number
小数位数:0,最大长度:10	否	bill_status 示例：0
bill_date	string	否	bill_date 示例：2024-08-16 00:00:00
postAccountStatus	number
小数位数:0,最大长度:10	否	postAccountStatus 示例：99
bill_type	string	否	bill_type 示例：4A33
pk_ownerunit_in	string	否	pk_ownerunit_in 示例：1764630529618477058
pk_ownerunit_in__name	string	否	pk_ownerunit_in__name 示例：全职能组织1
pk_currency__name	string	否	pk_currency__name 示例：印尼盾
total_amount	number
小数位数:0,最大长度:10	否	total_amount 示例：0
notaxtotal_amount	number
小数位数:0,最大长度:10	否	notaxtotal_amount 示例：0
pk_transitype	string	否	pk_transitype 示例：1763914120481474159
total_amount_tax	number
小数位数:0,最大长度:10	否	total_amount_tax 示例：0
actual_invoice_amount	number
小数位数:0,最大长度:10	否	actual_invoice_amount 示例：0
pk_ownerorg_out	string	否	pk_ownerorg_out 示例：1840412186705920004
pk_ownerunit_out	string	否	pk_ownerunit_out 示例：1840412186705920004
transi_type	string	否	transi_type 示例：4A33-01
pk_currency__moneyRount	string	否	pk_currency__moneyRount 示例：4
pk_currency__priceRount	string	否	pk_currency__priceRount 示例：4
pk_currency	string	否	pk_currency 示例：1763914111891537954
pk_currency__digit	string	否	pk_currency__digit 示例：0
pk_recorder_in__name	string	否	pk_recorder_in__name 示例：刘龙
pk_recorder_in	string	否	pk_recorder_in 示例：1764632960553713664
verifystate	number
小数位数:0,最大长度:10	否	verifystate 示例：0
push_status	number
小数位数:0,最大长度:10	否	push_status 示例：0
pk_transitype__name	string	否	pk_transitype__name 示例：所有权调出
billmaker	string	否	billmaker 示例：c92cfebd-4be8-4863-a572-d8b715a0ec26
billmaker__name	string	否	billmaker__name 示例：刘龙
billmaketime	string	否	billmaketime 示例：2024-08-16 15:33:45
bodyvos	object	是	bodyvos
resubmitCheckKey	string	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
id	string	否	id 示例：2066683502088159235
sysid	string	否	sysid 示例：AUM
creator	string	否	creator 示例：c92cfebd-4be8-4863-a572-d8b715a0ec26
creator__name	string	否	creator__name 示例：刘龙
creationtime	string	否	creationtime 示例：2024-08-16 15:33:45
isWfControlled	boolean	否	isWfControlled 示例：true
tenant	string	否	tenant 示例：0000LJPGZ3RX3YAKG10000
ytenant	string	否	ytenant 示例：0000LJPGZ3RX3YAKG10000
bizFlow	string	否	bizFlow 示例：70d22ff0-df7b-4a93-a48c-c9ba67d67bef
isFlowCoreBill	boolean	否	isFlowCoreBill 示例：true
bizFlow_name	string	否	bizFlow_name 示例：所有权调出推单所有权调入
bizFlow_version	string	否	bizFlow_version 示例：V1.0
pubts	string	否	pubts 示例：2024-08-16 15:33:45

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功！",
	"data": {
		"_entityName": "aum.deploy.DeployOutHeadVO",
		"pk_org": "1840412186705920004",
		"pk_ownerorg_out__name": "aa",
		"pk_ownerorg_in": "1764630529618477058",
		"bill_code": "ZCDC202408160002",
		"pk_ownerorg_in__name": "全职能组织1",
		"pk_ownerunit_out__name": "aa",
		"bill_status": 0,
		"bill_date": "2024-08-16 00:00:00",
		"postAccountStatus": 99,
		"bill_type": "4A33",
		"pk_ownerunit_in": "1764630529618477058",
		"pk_ownerunit_in__name": "全职能组织1",
		"pk_currency__name": "印尼盾",
		"total_amount": 0,
		"notaxtotal_amount": 0,
		"pk_transitype": "1763914120481474159",
		"total_amount_tax": 0,
		"actual_invoice_amount": 0,
		"pk_ownerorg_out": "1840412186705920004",
		"pk_ownerunit_out": "1840412186705920004",
		"transi_type": "4A33-01",
		"pk_currency__moneyRount": "4",
		"pk_currency__priceRount": "4",
		"pk_currency": "1763914111891537954",
		"pk_currency__digit": "0",
		"pk_recorder_in__name": "刘龙",
		"pk_recorder_in": "1764632960553713664",
		"verifystate": 0,
		"push_status": 0,
		"pk_transitype__name": "所有权调出",
		"billmaker": "c92cfebd-4be8-4863-a572-d8b715a0ec26",
		"billmaker__name": "刘龙",
		"billmaketime": "2024-08-16 15:33:45",
		"bodyvos": [
			{
				"assets_amount": 0,
				"notaxassets_amount": 0,
				"assets_amount_tax": 0,
				"amount_received": 0,
				"collection_tax": 0,
				"real_opening_amount": 0,
				"hasDefaultInit": true,
				"rowno": "10",
				"pk_org": "1840412186705920004",
				"pk_org__name": "aa",
				"ttt_id": "rowId_685",
				"total_amount": "0",
				"notaxtotal_amount": "0",
				"total_amount_tax": "0",
				"pk_equip__materialFree": {
					"ytenant": "0000LJPGZ3RX3YAKG10000",
					"dr": "0"
				},
				"pk_equip__equip_code": "EAM2024031300000004",
				"pk_equip": "1950896655586820106",
				"equip_name": "闲置",
				"pk_category": "1887817020660514823",
				"pk_category__category_name": "资产类别asdf33333111",
				"pk_mandept_before": "1840412822361079813",
				"pk_mandept_before__name": "AA",
				"associate_status_flag_before": false,
				"associate_flag_before": false,
				"pk_usedorg_out": "1840412186705920004",
				"pk_usedorg_out__name": "aa",
				"pk_status_before__status_name": "闲置",
				"pk_status_before": "PRESET03_0000LJPGZ3RX3YAKG10000",
				"status_date_before": "2024-03-13 00:00:00",
				"pk_status_after": "PRESET01_0000LJPGZ3RX3YAKG10000",
				"status_date_after": "2024-08-16 15:33:42",
				"pk_status_after__status_name": "在用",
				"id": "2066683502088159236",
				"main_id": "2066683502088159235",
				"tenant": "0000LJPGZ3RX3YAKG10000",
				"ytenant": "0000LJPGZ3RX3YAKG10000"
			}
		],
		"resubmitCheckKey": "aum_deploy_out_card_add_c924109b-ad65-4bb4-b841-56299dcf6d27",
		"id": "2066683502088159235",
		"sysid": "AUM",
		"creator": "c92cfebd-4be8-4863-a572-d8b715a0ec26",
		"creator__name": "刘龙",
		"creationtime": "2024-08-16 15:33:45",
		"isWfControlled": true,
		"tenant": "0000LJPGZ3RX3YAKG10000",
		"ytenant": "0000LJPGZ3RX3YAKG10000",
		"bizFlow": "70d22ff0-df7b-4a93-a48c-c9ba67d67bef",
		"isFlowCoreBill": true,
		"bizFlow_name": "所有权调出推单所有权调入",
		"bizFlow_version": "V1.0",
		"pubts": "2024-08-16 15:33:45"
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

