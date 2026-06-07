---
title: "资产报废集成_生成固定资产减少"
apiId: "2066707992091820032"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Asset Scrap"
domain: "GAM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Asset Scrap]
platform_version: "BIP"
source_type: community-api-docs
---

# 资产报废集成_生成固定资产减少

>  请求方式	POST | Asset Scrap (GAM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/am/scrapIntegrate/save
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
pk_reduce	string	否	否	报废单ID
pk_group	string	否	否	集团
pk_org	string	否	否	资产组织最新版本
pk_org_v	string	否	否	资产组织
pk_currency	string	否	否	组织币种
bill_type	string	否	否	单据类型
pk_transitype	string	否	否	交易类型
transi_type	string	否	否	交易类型编码
bill_code	string	否	否	报废单号
busi_type	string	否	否	业务类型
bill_status	number
小数位数:0,最大长度:38	否	否	单据状态
pk_recorder	string	否	否	经办人
bill_date	date
格式:yyyy-MM-dd HH:mm:ss	否	否	报废日期
memo	string	否	否	备注
creator	string	否	否	创建人
creationtime	date
格式:yyyy-MM-dd HH:mm:ss	否	否	创建时间
modifier	string	否	否	最后修改人
modifiedtime	date
格式:yyyy-MM-dd HH:mm:ss	否	否	最后修改时间
auditor	string	否	否	审批人
audittime	date
格式:yyyy-MM-dd HH:mm:ss	否	否	审批时间
check_opinion	string	否	否	审批意见
billmaker	string	否	否	制单人
billmaketime	date
格式:yyyy-MM-dd HH:mm:ss	否	否	制单时间
pk_bill_src	string	否	否	来源单据主键
bill_type_src	string	否	否	来源单据类型
transi_type_src	string	否	否	来源交易类型
bill_code_src	string	否	否	来源单据编码
saga_gtxid	string	否	否	全局事务
saga_btxid	string	否	否	子事务
saga_status	number
小数位数:0,最大长度:38	否	否	事务状态
saga_frozen	number
小数位数:0,最大长度:38	否	否	冻结状态
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
body	object	是	否	报废单明细
pk_reduce_b	string	否	否	报废单明细ID
pk_org	string	否	否	资产组织最新版本
pk_org_v	string	否	否	资产组织
pk_group	string	否	否	集团
rowno	string	否	否	行号
pk_equip	string	否	否	设备
pk_currency_fi	string	否	否	财务币种
origin_value	number
小数位数:2,最大长度:28	否	否	原值
accu_dep	number
小数位数:8,最大长度:28	否	否	累计折旧
new_value	number
小数位数:8,最大长度:28	否	否	净值
salvage_rate	number
小数位数:8,最大长度:28	否	否	净残值率%
salvage	number
小数位数:8,最大长度:28	否	否	净残值
net_money	number
小数位数:8,最大长度:28	否	否	净额
pre_devaluate	number
小数位数:8,最大长度:28	否	否	减值准备
begin_date	date
格式:yyyy-MM-dd HH:mm:ss	否	否	开始使用日期
used_month	number
小数位数:0,最大长度:38	否	否	已计提期数
service_month	number
小数位数:0,最大长度:38	否	否	使用月限
pk_addreducestyle	string	否	否	报废方式
pk_reason	string	否	否	报废原因
confirm_flag	string	否	否	确认标记
pk_confirmer	string	否	否	确认人
pk_icorg	string	否	否	库存组织
pk_icorg_v	string	否	否	库存组织版本信息
pk_warehouse_in	string	否	否	报废入库
pk_warehouse_out	string	否	否	出库仓库
pk_jobmngfil	string	否	否	项目
memo	string	否	否	备注
pk_status_before	string	否	否	变动前设备状态
pk_status_after	string	否	否	变动后设备状态
status_date_before	date
格式:yyyy-MM-dd HH:mm:ss	否	否	变动前状态日期
status_date_after	date
格式:yyyy-MM-dd HH:mm:ss	否	否	变动后状态日期
stock_out_flag	string	否	否	出库标记
stock_in_flag	string	否	否	入库标记
bill_type_src	string	否	否	来源单据类型
pk_transitype_src	string	否	否	来源交易类型主键
transi_type_src	string	否	否	来源交易类型
bill_code_src	string	否	否	来源单据号
pk_bill_src	string	否	否	来源单据主键
pk_bill_b_src	string	否	否	来源单据表体主键
close_flag	string	否	否	关闭
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

## 3. 请求示例

Url: /yonbip/am/scrapIntegrate/save?access_token=访问令牌
Body: {
	"pk_reduce": "",
	"pk_group": "",
	"pk_org": "",
	"pk_org_v": "",
	"pk_currency": "",
	"bill_type": "",
	"pk_transitype": "",
	"transi_type": "",
	"bill_code": "",
	"busi_type": "",
	"bill_status": 0,
	"pk_recorder": "",
	"bill_date": "2026-06-07 13:22:41",
	"memo": "",
	"creator": "",
	"creationtime": "2026-06-07 13:22:41",
	"modifier": "",
	"modifiedtime": "2026-06-07 13:22:41",
	"auditor": "",
	"audittime": "2026-06-07 13:22:41",
	"check_opinion": "",
	"billmaker": "",
	"billmaketime": "2026-06-07 13:22:41",
	"pk_bill_src": "",
	"bill_type_src": "",
	"transi_type_src": "",
	"bill_code_src": "",
	"saga_gtxid": "",
	"saga_btxid": "",
	"saga_status": 0,
	"saga_frozen": 0,
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
			"pk_reduce_b": "",
			"pk_org": "",
			"pk_org_v": "",
			"pk_group": "",
			"rowno": "",
			"pk_equip": "",
			"pk_currency_fi": "",
			"origin_value": 0,
			"accu_dep": 0,
			"new_value": 0,
			"salvage_rate": 0,
			"salvage": 0,
			"net_money": 0,
			"pre_devaluate": 0,
			"begin_date": "2026-06-07 13:22:41",
			"used_month": 0,
			"service_month": 0,
			"pk_addreducestyle": "",
			"pk_reason": "",
			"confirm_flag": "",
			"pk_confirmer": "",
			"pk_icorg": "",
			"pk_icorg_v": "",
			"pk_warehouse_in": "",
			"pk_warehouse_out": "",
			"pk_jobmngfil": "",
			"memo": "",
			"pk_status_before": "",
			"pk_status_after": "",
			"status_date_before": "2026-06-07 13:22:41",
			"status_date_after": "2026-06-07 13:22:41",
			"stock_out_flag": "",
			"stock_in_flag": "",
			"bill_type_src": "",
			"pk_transitype_src": "",
			"transi_type_src": "",
			"bill_code_src": "",
			"pk_bill_src": "",
			"pk_bill_b_src": "",
			"close_flag": "",
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
pk_org	string	否	pk_org 示例：1764630529618477058
pk_org__name	string	否	pk_org__name 示例：全职能组织1
bill_type	string	否	bill_type 示例：4A19
pk_transitype	string	否	pk_transitype 示例：1763914120481474154
transi_type	string	否	transi_type 示例：4A19-01
pk_transitype__name	string	否	pk_transitype__name 示例：资产报废
bill_code	string	否	bill_code 示例：ZCBF202408160001
bill_date	string	否	bill_date 示例：2024-08-16 00:00:00
pk_recorder	string	否	pk_recorder 示例：1764632960553713664
pk_recorder__name	string	否	pk_recorder__name 示例：刘龙
bill_status	number
小数位数:0,最大长度:10	否	bill_status 示例：0
verifystate	number
小数位数:0,最大长度:10	否	verifystate 示例：0
billmaker	string	否	billmaker 示例：c92cfebd-4be8-4863-a572-d8b715a0ec26
billmaker__name	string	否	billmaker__name 示例：刘龙
billmaketime	string	否	billmaketime 示例：2024-08-16 16:10:44
push_status	number
小数位数:0,最大长度:10	否	push_status 示例：0
bodyvos	object	是	bodyvos
resubmitCheckKey	string	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
id	string	否	id 示例：2066702563154591750
sysid	string	否	sysid 示例：AUM
creator	string	否	creator 示例：c92cfebd-4be8-4863-a572-d8b715a0ec26
creator__name	string	否	creator__name 示例：刘龙
creationtime	string	否	creationtime 示例：2024-08-16 16:10:44
isWfControlled	boolean	否	isWfControlled 示例：true
tenant	string	否	tenant 示例：0000LJPGZ3RX3YAKG10000
ytenant	string	否	ytenant 示例：0000LJPGZ3RX3YAKG10000
pubts	string	否	pubts 示例：2024-08-16 16:10:45

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功！",
	"data": {
		"pk_org": "1764630529618477058",
		"pk_org__name": "全职能组织1",
		"bill_type": "4A19",
		"pk_transitype": "1763914120481474154",
		"transi_type": "4A19-01",
		"pk_transitype__name": "资产报废",
		"bill_code": "ZCBF202408160001",
		"bill_date": "2024-08-16 00:00:00",
		"pk_recorder": "1764632960553713664",
		"pk_recorder__name": "刘龙",
		"bill_status": 0,
		"verifystate": 0,
		"billmaker": "c92cfebd-4be8-4863-a572-d8b715a0ec26",
		"billmaker__name": "刘龙",
		"billmaketime": "2024-08-16 16:10:44",
		"push_status": 0,
		"bodyvos": [
			{
				"close_flag": false,
				"stock_out_flag": false,
				"stock_in_flag": false,
				"hasDefaultInit": true,
				"attachmentId": "0f8ed9f7-6fc9-4165-8b7e-725db305c9d9",
				"pk_equip__materialFree": {
					"ytenant": "0000LJPGZ3RX3YAKG10000",
					"dr": "0"
				},
				"pk_equip__equip_code": "EAM-TEST-2024042200000001",
				"pk_equip__spec": "222",
				"pk_status_before__status_name": "在用",
				"pk_ownerorg_equip": "1790633799219413000",
				"pk_location_before": "1790616181248884737",
				"pk_ownerorg_equip__name": "bx-维修组织",
				"pk_ownerunit_equip__name": "bx-维修组织",
				"pk_mandept_equip__name": "点检部门",
				"pk_ownerunit_equip": "1790633799219413000",
				"pk_mandept_equip": "1790634323214336009",
				"pk_manager_equip": "1793444631970054147",
				"pk_usedorg_equip": "1764630529618477058",
				"pk_usedept_equip": "1764632213245657095",
				"pk_equip__model": "222",
				"pk_status_before": "PRESET01_0000LJPGZ3RX3YAKG10000",
				"pk_usedorg_equip__name": "全职能组织1",
				"pk_equip__pk_location": "1790616181248884737",
				"pk_manager_equip__name": "张宾",
				"pk_usedept_equip__name": "营销部",
				"pk_user_equip__name": "刘龙",
				"pk_equip": "1980544127638437891",
				"pk_equip__equip_name": "全参",
				"pk_user_equip": "1764632960553713664",
				"pk_icorg_out__name": "hxx-组织1",
				"pk_icorg_out": "1765397000894808069",
				"confirm_flag": true,
				"pk_addreducestyle__name": "出售",
				"pk_addreducestyle": "1763914120473083940",
				"ttt_id": "rowId_721",
				"id": "2066702563154591751",
				"main_id": "2066702563154591750",
				"pk_org": "1764630529618477058",
				"tenant": "0000LJPGZ3RX3YAKG10000",
				"ytenant": "0000LJPGZ3RX3YAKG10000"
			}
		],
		"resubmitCheckKey": "aum_scrap_card_add_625b294d-d901-4758-a6c7-7048bc1f3cab",
		"id": "2066702563154591750",
		"sysid": "AUM",
		"creator": "c92cfebd-4be8-4863-a572-d8b715a0ec26",
		"creator__name": "刘龙",
		"creationtime": "2024-08-16 16:10:44",
		"isWfControlled": true,
		"tenant": "0000LJPGZ3RX3YAKG10000",
		"ytenant": "0000LJPGZ3RX3YAKG10000",
		"pubts": "2024-08-16 16:10:45"
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

