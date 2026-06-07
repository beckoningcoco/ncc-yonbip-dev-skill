---
title: "使用权调入集成_弃审删除固定资产变动"
apiId: "1815040096995377153"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Asset Collection Application"
domain: "GAM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Asset Collection Application]
platform_version: "BIP"
source_type: community-api-docs
---

# 使用权调入集成_弃审删除固定资产变动

>  请求方式	POST | Asset Collection Application (GAM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/am/deployUsedinIntegrate/unapprove
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
pk_alter	string	否	否	变动单主键
pk_group	string	否	否	集团
pk_org	string	否	否	资产组织最新版本
pk_org_v	string	否	否	资产组织
busi_type	string	否	否	业务类型
bill_code	string	否	否	变动单号
bill_type	string	否	否	单据类型
pk_transitype	string	否	否	交易类型
transi_type	string	否	否	交易类型编码
bill_status	number
小数位数:0,最大长度:38	否	否	单据状态
bill_date	date
格式:yyyy-MM-dd HH:mm:ss	否	否	变动日期
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
memo	string	否	否	备注
billmaker	string	否	否	制单人
billmaketime	date
格式:yyyy-MM-dd HH:mm:ss	否	否	制单时间
saga_gtxid	string	否	否	全局事务
saga_btxid	string	否	否	子事务
saga_frozen	number
小数位数:0,最大长度:38	否	否	冻结状态
saga_status	number
小数位数:0,最大长度:38	否	否	事务状态
alterinfo	string	否	否	变动信息
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
body	object	是	否	变动单明细
pk_alter_b	string	否	否	子表主键
pk_group	string	否	否	集团
rowno	string	否	否	行号
pk_org	string	否	否	资产组织最新版本
pk_org_v	string	否	否	资产组织
pk_equip	string	否	否	设备
pk_reason	string	否	否	变动原因
deal_result	string	否	否	处理结果
memo	string	否	否	备注
pk_jobmngfil	string	否	否	项目
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
pk_mandept_before	string	否	否	变动前管理部门
pk_mandept_after	string	否	否	变动后管理部门
pk_usedept_before	string	否	否	变动前使用部门
pk_usedept_after	string	否	否	变动后使用部门
pk_user_before	string	否	否	变动前责任人
pk_user_after	string	否	否	变动后责任人
pk_location_before	string	否	否	变动前位置
pk_location_after	string	否	否	变动后位置
pk_jobmngfil_before	string	否	否	变动前项目
pk_jobmngfil_after	string	否	否	变动后项目

## 3. 请求示例

Url: /yonbip/am/deployUsedinIntegrate/unapprove?access_token=访问令牌
Body: {
	"pk_alter": "",
	"pk_group": "",
	"pk_org": "",
	"pk_org_v": "",
	"busi_type": "",
	"bill_code": "",
	"bill_type": "",
	"pk_transitype": "",
	"transi_type": "",
	"bill_status": 0,
	"bill_date": "2026-06-07 13:21:58",
	"pk_recorder": "",
	"creator": "",
	"creationtime": "2026-06-07 13:21:58",
	"auditor": "",
	"audittime": "2026-06-07 13:21:58",
	"check_opinion": "",
	"modifier": "",
	"modifiedtime": "2026-06-07 13:21:58",
	"memo": "",
	"billmaker": "",
	"billmaketime": "2026-06-07 13:21:58",
	"saga_gtxid": "",
	"saga_btxid": "",
	"saga_frozen": 0,
	"saga_status": 0,
	"alterinfo": "",
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
			"pk_alter_b": "",
			"pk_group": "",
			"rowno": "",
			"pk_org": "",
			"pk_org_v": "",
			"pk_equip": "",
			"pk_reason": "",
			"deal_result": "",
			"memo": "",
			"pk_jobmngfil": "",
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
			"pk_mandept_before": "",
			"pk_mandept_after": "",
			"pk_usedept_before": "",
			"pk_usedept_after": "",
			"pk_user_before": "",
			"pk_user_after": "",
			"pk_location_before": "",
			"pk_location_after": "",
			"pk_jobmngfil_before": "",
			"pk_jobmngfil_after": ""
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
pk_recorder	string	否	pk_recorder 示例：1982040657426907136
returncount	number
小数位数:0,最大长度:10	否	returncount 示例：0
verifystate	number
小数位数:0,最大长度:10	否	verifystate 示例：0
bill_date	string	否	bill_date 示例：2024-06-19
bill_code	string	否	bill_code 示例：SYDR202406190001
pk_usedorg_in	string	否	pk_usedorg_in 示例：1980535426005860360
modifier	string	否	modifier 示例：018532e9-5aff-43e3-8157-c583afb6db67
memo	string	否	memo 示例：1221212
pk_org	string	否	pk_org 示例：1980535426005860360
pk_transitype	string	否	pk_transitype 示例：null
modifiedtime	string	否	modifiedtime 示例：2024-09-05 14:44:50
pk_usedorg_in__name	string	否	pk_usedorg_in__name 示例：WUHF集团资产组织
bill_type	string	否	bill_type 示例：4A48
pk_usedorg_out__name	string	否	pk_usedorg_out__name 示例：WUHF资产组织
id	string	否	id 示例：2023608922899742728
pubts	string	否	pubts 示例：2024-09-05 14:44:51
creator__name	string	否	creator__name 示例：昵称-15727377404
tenant	string	否	tenant 示例：0000LV53NH2Z4URDOP0000
creator	string	否	creator 示例：018532e9-5aff-43e3-8157-c583afb6db67
billmaketime	string	否	billmaketime 示例：2024-06-19 14:38:04
sysid	string	否	sysid 示例：AUM
isWfControlled	boolean	否	isWfControlled 示例：false
pk_org__name	string	否	pk_org__name 示例：WUHF集团资产组织
billmaker__name	string	否	billmaker__name 示例：昵称-15727377404
bill_status	number
小数位数:0,最大长度:10	否	bill_status 示例：0
modifier__name	string	否	modifier__name 示例：昵称-15727377404
pk_recorder__name	string	否	pk_recorder__name 示例：武慧峰
billmaker	string	否	billmaker 示例：018532e9-5aff-43e3-8157-c583afb6db67
pk_usedorg_out	string	否	pk_usedorg_out 示例：1980536027314389001
transi_type	string	否	transi_type 示例：4A48-01
creationtime	string	否	creationtime 示例：2024-06-19 14:38:04
bodyvos	object	是	bodyvos
pk_jobmngfil_after	string	否	pk_jobmngfil_after 示例：2013084466317623301
src_pk_bill	string	否	src_pk_bill 示例：2023608751101050886
pk_usedept_after	string	否	pk_usedept_after 示例：1978272493666304000
src_bill_type	string	否	src_bill_type 示例：4A47
memo	string	否	memo 示例：sss
src_pk_bill_b	string	否	src_pk_bill_b 示例：2023608751101050887
pk_usedept_after__name	string	否	pk_usedept_after__name 示例：销售部
pk_equip__pk_category	string	否	pk_equip__pk_category 示例：1986521605413011465
pk_org	string	否	pk_org 示例：1980535426005860360
pk_equip__equip_code	string	否	pk_equip__equip_code 示例：202405210001
pk_location_after__name	string	否	pk_location_after__name 示例：使用位置-新
id	string	否	id 示例：2023608922899742729
pubts	string	否	pubts 示例：2024-09-05 14:44:29
pk_profitcenter_used_in	string	否	pk_profitcenter_used_in 示例：1980542272197885954
tenant	string	否	tenant 示例：0000LV53NH2Z4URDOP0000
pk_equip__pk_ownerorg	string	否	pk_equip__pk_ownerorg 示例：1980536027314389001
pk_jobmngfil_after__name	string	否	pk_jobmngfil_after__name 示例：33
pk_profitcenter_used_in__name	string	否	pk_profitcenter_used_in__name 示例：WUHF集团利润中心
bill_code_src	string	否	bill_code_src 示例：SYDC202406190002
pk_usedept_before	string	否	pk_usedept_before 示例：1980537255661928456
pk_costcenter_used_out	string	否	pk_costcenter_used_out 示例：2001976521241133059
main_id	string	否	main_id 示例：2023608922899742728
pk_location_after	string	否	pk_location_after 示例：1988813700609867776
pk_user_after	string	否	pk_user_after 示例：1978274091385749505
src_transitype	string	否	src_transitype 示例：4A47-01
pk_equip	string	否	pk_equip 示例：2001987250055282690
pk_user_after__name	string	否	pk_user_after__name 示例：朱一龙
pk_costcenter_used_out__name	string	否	pk_costcenter_used_out__name 示例：有效类别
pk_equip__pk_category__category_name	string	否	pk_equip__pk_category__category_name 示例：技术参数类别
pk_equip__equip_name	string	否	pk_equip__equip_name 示例：001
stock_in_flag	boolean	否	stock_in_flag 示例：false
pk_usedept_before__name	string	否	pk_usedept_before__name 示例：WUHF资产部门
_viewmodel	string	否	_viewmodel
masterOrgKeyField	string	否	masterOrgKeyField 示例：pk_org
transTypeKeyField	string	否	transTypeKeyField 示例：pk_transitype
_mddFormulaExecuteFlag	string	否	_mddFormulaExecuteFlag 示例：true
step	number
小数位数:0,最大长度:10	否	step 示例：3

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"pk_recorder": "1982040657426907136",
		"returncount": 0,
		"verifystate": 0,
		"bill_date": "2024-06-19",
		"bill_code": "SYDR202406190001",
		"pk_usedorg_in": "1980535426005860360",
		"modifier": "018532e9-5aff-43e3-8157-c583afb6db67",
		"memo": "1221212",
		"pk_org": "1980535426005860360",
		"pk_transitype": "null",
		"modifiedtime": "2024-09-05 14:44:50",
		"pk_usedorg_in__name": "WUHF集团资产组织",
		"bill_type": "4A48",
		"pk_usedorg_out__name": "WUHF资产组织",
		"id": "2023608922899742728",
		"pubts": "2024-09-05 14:44:51",
		"creator__name": "昵称-15727377404",
		"tenant": "0000LV53NH2Z4URDOP0000",
		"creator": "018532e9-5aff-43e3-8157-c583afb6db67",
		"billmaketime": "2024-06-19 14:38:04",
		"sysid": "AUM",
		"isWfControlled": false,
		"pk_org__name": "WUHF集团资产组织",
		"billmaker__name": "昵称-15727377404",
		"bill_status": 0,
		"modifier__name": "昵称-15727377404",
		"pk_recorder__name": "武慧峰",
		"billmaker": "018532e9-5aff-43e3-8157-c583afb6db67",
		"pk_usedorg_out": "1980536027314389001",
		"transi_type": "4A48-01",
		"creationtime": "2024-06-19 14:38:04",
		"bodyvos": [
			{
				"pk_jobmngfil_after": "2013084466317623301",
				"src_pk_bill": "2023608751101050886",
				"pk_usedept_after": "1978272493666304000",
				"src_bill_type": "4A47",
				"memo": "sss",
				"src_pk_bill_b": "2023608751101050887",
				"pk_usedept_after__name": "销售部",
				"pk_equip__pk_category": "1986521605413011465",
				"pk_org": "1980535426005860360",
				"pk_equip__equip_code": "202405210001",
				"pk_location_after__name": "使用位置-新",
				"id": "2023608922899742729",
				"pubts": "2024-09-05 14:44:29",
				"pk_profitcenter_used_in": "1980542272197885954",
				"tenant": "0000LV53NH2Z4URDOP0000",
				"pk_equip__pk_ownerorg": "1980536027314389001",
				"pk_jobmngfil_after__name": "33",
				"pk_profitcenter_used_in__name": "WUHF集团利润中心",
				"bill_code_src": "SYDC202406190002",
				"pk_usedept_before": "1980537255661928456",
				"pk_costcenter_used_out": "2001976521241133059",
				"main_id": "2023608922899742728",
				"pk_location_after": "1988813700609867776",
				"pk_user_after": "1978274091385749505",
				"src_transitype": "4A47-01",
				"pk_equip": "2001987250055282690",
				"pk_user_after__name": "朱一龙",
				"pk_costcenter_used_out__name": "有效类别",
				"pk_equip__pk_category__category_name": "技术参数类别",
				"pk_equip__equip_name": "001",
				"stock_in_flag": false,
				"pk_usedept_before__name": "WUHF资产部门"
			}
		],
		"_viewmodel": "",
		"masterOrgKeyField": "pk_org",
		"transTypeKeyField": "pk_transitype",
		"_mddFormulaExecuteFlag": "true",
		"step": 3
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

