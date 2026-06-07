---
title: "点检计划详情查询"
apiId: "2174996753306615811"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Spot Inspection Plan"
domain: "MRO"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Spot Inspection Plan]
platform_version: "BIP"
source_type: community-api-docs
---

# 点检计划详情查询

>  请求方式	POST | Spot Inspection Plan (MRO)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/am/simpcplancard/detail
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
code	string	否	否	点检计划编码 示例：DJJH202412050001
id	string	否	否	主键 示例：2148906811183333378

## 3. 请求示例

Url: /yonbip/am/simpcplancard/detail?access_token=访问令牌
Body: {
	"code": "DJJH202412050001",
	"id": "2148906811183333378"
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
小数位数:0,最大长度:10	否	返回http状态码（200：正常，其他：异常） 示例：200
message	string	否	返回信息 示例：操作成功！
data	object	否	返回数据
bill_code	string	否	点检计划编码 示例：DJJH202412050001
pk_org	string	否	资产组织主键 示例：1764630529618477058
pk_org__name	string	否	资产组织 示例：全职能组织1
plan_name	string	否	点检计划名称
pk_edit_dept	string	否	编制部门主键 示例：1764632213245657095
pk_edit_dept__name	string	否	编制部门 示例：营销部
pk_editor	string	否	编制人主键 示例：1764632960553713664
pk_editor__name	string	否	编制人 示例：刘龙
edit_time	string	否	编制日期 示例：2024-12-05
bill_status	number
小数位数:0,最大长度:10	否	单据状态（0 - 开立 1 - 已审核 2 - 已关闭 3 - 审核中） 示例：1
memo	string	否	备注
delaywarn	number
小数位数:0,最大长度:10	否	延期预警天数 示例：0
allow_day	number
小数位数:0,最大长度:10	否	执行宽限期（天） 示例：0
pk_closer	string	否	关闭人主键
pk_closer__name	string	否	关闭人
close_time	date
格式:yyyy-MM-dd HH:mm:ss	否	关闭时间
modifier	string	否	最后修改人主键
modifier__name	string	否	最后修改人
modifiedtime	string	否	最后修改时间
billmaker	string	否	制单人主键 示例：c92cfebd-4be8-4863-a572-d8b715a0ec26
billmaker__name	string	否	制单人 示例：刘龙
billmaketime	string	否	制单时间 示例：2024-12-0510:27:58
auditor	string	否	审核人主键 示例：c92cfebd-4be8-4863-a572-d8b715a0ec26
auditor__name	string	否	审核人 示例：刘龙
audittime	string	否	审核时间 示例：2024-12-0510:31:51
verifystate	number
小数位数:0,最大长度:10	否	审核状态（0 - 开立 1 - 审批中 2 - 审批通过 3 - 流程中止 4 - 退回制单） 示例：2
childbodyvos	object	是	表体计划概览
bodyvos	object	是	表体点检项目详情

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功！",
	"data": {
		"bill_code": "DJJH202412050001",
		"pk_org": "1764630529618477058",
		"pk_org__name": "全职能组织1",
		"plan_name": "",
		"pk_edit_dept": "1764632213245657095",
		"pk_edit_dept__name": "营销部",
		"pk_editor": "1764632960553713664",
		"pk_editor__name": "刘龙",
		"edit_time": "2024-12-05",
		"bill_status": 1,
		"memo": "",
		"delaywarn": 0,
		"allow_day": 0,
		"pk_closer": "",
		"pk_closer__name": "",
		"close_time": "2026-06-07 13:23:40",
		"modifier": "",
		"modifier__name": "",
		"modifiedtime": "",
		"billmaker": "c92cfebd-4be8-4863-a572-d8b715a0ec26",
		"billmaker__name": "刘龙",
		"billmaketime": "2024-12-0510:27:58",
		"auditor": "c92cfebd-4be8-4863-a572-d8b715a0ec26",
		"auditor__name": "刘龙",
		"audittime": "2024-12-0510:31:51",
		"verifystate": 2,
		"childbodyvos": [
			{
				"rowno": "10",
				"pk_pcstd": "",
				"pk_pcstd_b": "",
				"pk_pcstd__code": "",
				"pk_equip": "2118641087277957130",
				"pk_equip__equip_code": "EAM-TEST-2024102500000004",
				"pk_equip__equip_name": "hhh",
				"pk_location": "",
				"pk_location__location_code": "",
				"pk_location__location_name": "",
				"cycle_flag": true,
				"pc_oncalendar": false,
				"pc_calendar": "",
				"calendarrule": 0,
				"adjust_day": 0,
				"next_pcdate": "2024-12-0500:00:00",
				"pk_plan_pcer": "1764632960553713664",
				"pk_plan_pcer__name": "刘龙",
				"pk_plan_team": "",
				"pk_plan_team__name": "",
				"pk_plan_dept": "",
				"pk_plan_dept__name": "",
				"memo": "",
				"close_flag": false,
				"pk_closer": "",
				"pk_closer__name": "",
				"close_time": "2026-06-07 13:23:40"
			}
		],
		"bodyvos": [
			{
				"rowno": "10",
				"pk_equip": "2118641087277957130",
				"pk_equip__equip_code": "EAM-TEST-2024102500000004",
				"pk_equip__equip_name": "hhh",
				"pk_location": "",
				"pk_location__location_code": "",
				"pk_location__location_name": "",
				"pk_pcstd__nversion": 1,
				"pk_pcstd": "2126929180145745922",
				"pk_pcstd_b": "2126929180145745923",
				"pk_pcstd__code": "DJBZ202411050001",
				"pc_position": "",
				"pc_item": "",
				"pc_measureitems": "",
				"pc_measureitems__name": "",
				"item_describe": "",
				"pc_identifier": "",
				"pc_method": "",
				"std_need": "",
				"pc_state": 0,
				"cycle_flag": true,
				"need_upload_pic_flag": 0,
				"pc_oncalendar": false,
				"pc_calendar": "",
				"calendarrule": 0,
				"adjust_day": 0,
				"last_pctime": "2026-06-07 13:23:40",
				"next_pcdate": "2026-06-07 13:23:40",
				"pk_plan_pcer": "1764632960553713664",
				"pk_plan_pcer__name": "刘龙",
				"pk_plan_team": "",
				"pk_plan_team__name": "",
				"pk_plan_dept": "",
				"pk_plan_dept__name": "",
				"upperlimit": 0,
				"lowerlimit": 0,
				"continuity": 0,
				"pc_cyc": 0,
				"pc_unit": 0,
				"memo": "",
				"close_flag": false,
				"pk_closer": "",
				"pk_closer__name": "",
				"close_time": "2026-06-07 13:23:40"
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
999	报错具体提示信息	报错具体提示信息

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

