---
title: "资产领用详情查询"
apiId: "2253133186380857353"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Collection Document Maintenance"
domain: "GAM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Collection Document Maintenance]
platform_version: "BIP"
source_type: community-api-docs
---

# 资产领用详情查询

>  请求方式	POST | Collection Document Maintenance (GAM)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/am/assignCard/detail
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	详情查询
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
id	string	否	是	资产领用主表主键id 示例：2056117736680456197

## 3. 请求示例

Url: /yonbip/am/assignCard/detail?access_token=访问令牌
Body: {
	"id": "2056117736680456197"
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
returncount	number
小数位数:0,最大长度:10	否	退回次数 示例：0
verifystate	number
小数位数:0,最大长度:10	否	审批状态 示例：2
be_renew_apply	boolean	否	be_renew_apply 示例：false
pk_usedorg	string	否	使用单位主键 示例：2207648778418126852
bill_code	string	否	单据编码 示例：ZCJY202502250001
pk_org	string	否	资产组织主键 示例：2207648778418126852
pk_transitype	string	否	交易类型主键 示例：2107554909184852076
bill_type	string	否	单据类型 示例：4A15
id	string	否	主键 示例：2209911332834115590
pubts	string	否	时间戳 示例：2025-02-25 15:12:22
creator__name	string	否	创建人 示例：刘龙
pk_taker__name	string	否	领用人 示例：薇薇安
tenant	string	否	租户 示例：0000M232Z6A20YFPC30000
creator	string	否	创建人主键 示例：4c4c966a-b9c1-4fc1-bada-1e2aa7fa98e2
pk_usedorg__name	string	否	使用单位 示例：资产组织
push_status	number
小数位数:0,最大长度:10	否	固资对接生单状态 示例：0
billmaketime	string	否	制单时间 示例：2025-02-25 15:12:19
audittime	string	否	审核时间 示例：2025-02-25 15:12:22
sysid	string	否	系统标识 示例：AUM
isWfControlled	boolean	否	是否审批流控制 示例：false
pk_org__name	string	否	资产组织 示例：资产组织
pk_transitype__name	string	否	交易类型 示例：资产借用
auditor	string	否	审核人主键 示例：4c4c966a-b9c1-4fc1-bada-1e2aa7fa98e2
auditor__name	string	否	审核人 示例：刘龙
pk_taker	string	否	领用人主键 示例：2207663115044126728
billmaker__name	string	否	制单人 示例：刘龙
bill_status	number
小数位数:0,最大长度:10	否	单据状态 示例：1
pk_dept	string	否	领用部门主键 示例：2207649465614991368
take_date	string	否	领用日期 示例：2025-02-25
billmaker	string	否	制单人主键 示例：4c4c966a-b9c1-4fc1-bada-1e2aa7fa98e2
pk_dept__name	string	否	领用部门 示例：策划部门
transi_type	string	否	交易类型编码 示例：4A15-01
creationtime	string	否	创建时间 示例：2025-02-25 15:12:19
bodyvos	object	是	bodyvos
src_pk_bill	string	否	来源单据表头主键 示例：2209910946288631815
pk_equip__spec	string	否	规格 示例：ss
src_bill_type	string	否	来源单据类型 示例：4A38
pk_usedept_after	string	否	使用部门主键 示例：2207649465614991368
pk_usedorg	string	否	使用单位主键 示例：2207648778418126852
pk_status_before__status_name	string	否	领用前资产状态 示例：在用
pk_status_after__status_name	string	否	领用后资产状态 示例：在用
spec	string	否	资产详细描述 示例：aaa
status_date_after	string	否	领用后状态日期 示例：2025-02-25
stock_out_flag	boolean	否	出库标志 示例：false
src_pk_bill_b	string	否	来源单据表体主键 示例：2209910946288631816
pk_usedept_after__name	string	否	使用部门 示例：策划部门
pk_org	string	否	资产组织主键 示例：2207648778418126852
pk_equip__equip_code	string	否	资产编码 示例：EAM-2025022500000004
pk_equip__pk_location__location_name	string	否	位置 示例：2
expect_end_date	string	否	预计归还日期 示例：2025-02-28
id	string	否	领用申请单子表主键 示例：2209911332834115591
pubts	string	否	时间戳 示例：2025-02-25 15:12:32
pk_status_after	string	否	领用后资产状态主键 示例：PRESET01_0000M232Z6A20YFPC30000
pk_equip__model	string	否	型号 示例：ss
tenant	string	否	租户 示例：0000M232Z6A20YFPC30000
pk_status_before	string	否	领用前资产状态主键 示例：PRESET01_0000M232Z6A20YFPC30000
bill_code_src	string	否	来源单据编码 示例：JYSQ202502250002
pk_category__category_name	string	否	资产类别 示例：借用资产类别
pk_equip__materialFree	object	否	pk_equip__materialFree
pk_usedorg__name	string	否	使用单位 示例：资产组织
pk_equip__equip_num	number
小数位数:0,最大长度:10	否	资产数量 示例：1
pk_org__name	string	否	资产组织 示例：资产组织
status_date_before	string	否	领用前状态日期 示例：2025-02-25
pk_equip__pk_location	string	否	位置主键 示例：2209721795934683137
main_id	string	否	主表主键 示例：2209911332834115590
pk_equip__is_pre	boolean	否	期初 示例：false
pk_category	string	否	资产类别主键 示例：2209909881146703881
pk_user_after	string	否	使用人主键 示例：2207663115044126728
pk_unit_used_before	string	否	领用前使用权主键 示例：2207648778418126852
pk_equip	string	否	资产 示例：2209910319222358024
pk_user_after__name	string	否	使用人 示例：薇薇安
alter_flag	boolean	否	变动标志 示例：false
return_flag	boolean	否	归还标记 示例：false
pk_unit_used_before__name	string	否	领用前使用权 示例：资产组织
pk_equip__equip_name	string	否	资产名称 示例：aaa
return_bill_code	string	否	归还单号 示例：2209911435914903560
appoint_flag	number
小数位数:0,最大长度:10	否	指定资产标记 示例：1
busi_status	number
小数位数:0,最大长度:10	否	业务状态 示例：2
stock_in_flag	boolean	否	入库标志 示例：false
return_date	string	否	实际归还日期 示例：2025-02-25
pk_category__innercode	string	否	资产类别内部编码 示例：9MD0

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"returncount": 0,
		"verifystate": 2,
		"be_renew_apply": false,
		"pk_usedorg": "2207648778418126852",
		"bill_code": "ZCJY202502250001",
		"pk_org": "2207648778418126852",
		"pk_transitype": "2107554909184852076",
		"bill_type": "4A15",
		"id": "2209911332834115590",
		"pubts": "2025-02-25 15:12:22",
		"creator__name": "刘龙",
		"pk_taker__name": "薇薇安",
		"tenant": "0000M232Z6A20YFPC30000",
		"creator": "4c4c966a-b9c1-4fc1-bada-1e2aa7fa98e2",
		"pk_usedorg__name": "资产组织",
		"push_status": 0,
		"billmaketime": "2025-02-25 15:12:19",
		"audittime": "2025-02-25 15:12:22",
		"sysid": "AUM",
		"isWfControlled": false,
		"pk_org__name": "资产组织",
		"pk_transitype__name": "资产借用",
		"auditor": "4c4c966a-b9c1-4fc1-bada-1e2aa7fa98e2",
		"auditor__name": "刘龙",
		"pk_taker": "2207663115044126728",
		"billmaker__name": "刘龙",
		"bill_status": 1,
		"pk_dept": "2207649465614991368",
		"take_date": "2025-02-25",
		"billmaker": "4c4c966a-b9c1-4fc1-bada-1e2aa7fa98e2",
		"pk_dept__name": "策划部门",
		"transi_type": "4A15-01",
		"creationtime": "2025-02-25 15:12:19",
		"bodyvos": [
			{
				"src_pk_bill": "2209910946288631815",
				"pk_equip__spec": "ss",
				"src_bill_type": "4A38",
				"pk_usedept_after": "2207649465614991368",
				"pk_usedorg": "2207648778418126852",
				"pk_status_before__status_name": "在用",
				"pk_status_after__status_name": "在用",
				"spec": "aaa",
				"status_date_after": "2025-02-25",
				"stock_out_flag": false,
				"src_pk_bill_b": "2209910946288631816",
				"pk_usedept_after__name": "策划部门",
				"pk_org": "2207648778418126852",
				"pk_equip__equip_code": "EAM-2025022500000004",
				"pk_equip__pk_location__location_name": "2",
				"expect_end_date": "2025-02-28",
				"id": "2209911332834115591",
				"pubts": "2025-02-25 15:12:32",
				"pk_status_after": "PRESET01_0000M232Z6A20YFPC30000",
				"pk_equip__model": "ss",
				"tenant": "0000M232Z6A20YFPC30000",
				"pk_status_before": "PRESET01_0000M232Z6A20YFPC30000",
				"bill_code_src": "JYSQ202502250002",
				"pk_category__category_name": "借用资产类别",
				"pk_equip__materialFree": {
					"ytenant": "0000M232Z6A20YFPC30000",
					"id": "2209910319222358026",
					"dr": 0
				},
				"pk_usedorg__name": "资产组织",
				"pk_equip__equip_num": 1,
				"pk_org__name": "资产组织",
				"status_date_before": "2025-02-25",
				"pk_equip__pk_location": "2209721795934683137",
				"main_id": "2209911332834115590",
				"pk_equip__is_pre": false,
				"pk_category": "2209909881146703881",
				"pk_user_after": "2207663115044126728",
				"pk_unit_used_before": "2207648778418126852",
				"pk_equip": "2209910319222358024",
				"pk_user_after__name": "薇薇安",
				"alter_flag": false,
				"return_flag": false,
				"pk_unit_used_before__name": "资产组织",
				"pk_equip__equip_name": "aaa",
				"return_bill_code": "2209911435914903560",
				"appoint_flag": 1,
				"busi_status": 2,
				"stock_in_flag": false,
				"return_date": "2025-02-25",
				"pk_category__innercode": "9MD0"
			}
		]
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
999	服务端逻辑异常	

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

