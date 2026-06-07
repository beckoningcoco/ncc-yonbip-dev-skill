---
title: "工单列表查询"
apiId: "1960511335118143495"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Work Order Management"
domain: "MRO"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Work Order Management]
platform_version: "BIP"
source_type: community-api-docs
---

# 工单列表查询

>  请求方式	POST | Work Order Management (MRO)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/am/rmmworkorderlist/query
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
condition	object	否	否	查询条件组
simpleVOs	object	是	否	扩展查询条件
page	object	否	是	分页
pageIndex	number
小数位数:0,最大长度:11	否	是	当前页码，数据范围：正整数 示例：1 默认值：1
pageSize	number
小数位数:0,最大长度:3	否	是	每页大小，不允许超过最大阈值（默认500），数据范围：1-500 示例：20 默认值：20
queryOrders	object	是	否	排序参数
field	string	否	否	排序字段
order	string	否	否	排序顺序：正序ASC，倒序：DESC

## 3. 请求示例

Url: /yonbip/am/rmmworkorderlist/query?access_token=访问令牌
Body: {
	"condition": {
		"simpleVOs": [
			{
				"field": "id",
				"op": "in",
				"value1": ""
			}
		]
	},
	"page": {
		"pageIndex": 1,
		"pageSize": 20
	},
	"queryOrders": [
		{
			"field": "",
			"order": ""
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
小数位数:0,最大长度:10	否	返回编码 示例：200
message	string	否	返回信息 示例：操作成功！
errorDetail	string	否	错误信息
data	object	否	返回数据
pageIndex	number
小数位数:0,最大长度:10	否	页码 示例：1
pageSize	number
小数位数:0,最大长度:10	否	每页条数 示例：20
recordCount	number
小数位数:0,最大长度:10	否	记录数 示例：1
recordList	object	是	返回数据
pk_failure_symptom__name	string	否	故障现象 示例：故障现象
failure_detail	string	否	故障详细说明 示例：故障原因说明
failure_time	date
格式:yyyy-MM-dd HH:mm:ss	否	故障异常时间 示例：2024-03-27 14:44:18
pk_executor__name	string	否	工单执行人 示例：刘龙
pk_director__name	string	否	工单主管人 示例：刘龙
pk_psn_group__name	string	否	工作班组 示例：A组
pk_specialty__special_name	string	否	负责专业 示例：专业
workload	string	否	主要工作量 示例：656
pk_priority__name	string	否	优先级 示例：一月内解决
pri_clause	string	否	优先级理由 示例：关键
pk_std_job__name	string	否	标准工作包 示例：全职能组织
pk_provider__name	string	否	供应商 示例：A供应商
targ_start_time	date
格式:yyyy-MM-dd HH:mm:ss	否	目标开始时间 示例：2024-03-27 14:44:18
targ_end_time	date
格式:yyyy-MM-dd HH:mm:ss	否	目标结束时间 示例：2024-03-27 14:44:18
plan_start_time	date
格式:yyyy-MM-dd HH:mm:ss	否	计划开始时间 示例：2024-03-27 14:44:18
plan_end_time	date
格式:yyyy-MM-dd HH:mm:ss	否	计划结束时间 示例：2024-03-27 14:44:18
actu_start_time	date
格式:yyyy-MM-dd HH:mm:ss	否	实际开始时间 示例：2024-03-27 14:44:18
actu_end_time	date
格式:yyyy-MM-dd HH:mm:ss	否	实际结束时间 示例：2024-03-27 14:44:18
plan_sthalt_time	date
格式:yyyy-MM-dd HH:mm:ss	否	计划开始停机时间 示例：2024-03-27 14:44:18
plan_endhalt_time	date
格式:yyyy-MM-dd HH:mm:ss	否	计划结束停机时间 示例：2024-03-27 14:44:18
actu_sthalt_time	date
格式:yyyy-MM-dd HH:mm:ss	否	实际开始停机时间 示例：2024-03-27 14:44:18
actu_endhalt_time	date
格式:yyyy-MM-dd HH:mm:ss	否	实际结束停机时间 示例：2024-03-27 14:44:18
failure_influence	string	否	故障影响 示例：故障影响
pk_failure_reason__name	string	否	故障原因 示例：故障原因
pk_service_step__name	string	否	维修措施 示例：维修措施
failure_reason_desc	string	否	故障原因说明 示例：故障原因说明
task_progress	string	否	工作情况 示例：工作
task_summary	string	否	工作总结 示例：总结

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功！",
	"errorDetail": "",
	"data": {
		"pageIndex": 1,
		"pageSize": 20,
		"recordCount": 1,
		"recordList": [
			{
				"pk_group": "666666",
				"pl_oth_mny_group": 0,
				"pl_mtr_mny_global": 0,
				"wo_content": "一眼",
				"ac_mtr_mny_group": 0,
				"ac_mtr_mny_org": 0,
				"receivable_flag": false,
				"need_check": false,
				"source": "apm_repairplan_card",
				"pk_location__location_code": "LOC2023113000007",
				"pk_location": "1873567573291827215",
				"dr": 0,
				"pk_org": "1796566360214994954",
				"pk_transitype": "1763914120481473711",
				"payable_flag": false,
				"pk_equip": "176391412441473711",
				"payout_flag": false,
				"settled_list_flag": false,
				"bill_type": "4B36",
				"status_follow": false,
				"ac_oth_mny_global": 0,
				"pk_equip__equip_code": "202411210004",
				"status_time": "2024-03-27 14:44:13",
				"id": "1961269826213642240",
				"tenant": "0000LJPGZ3RX3YAKG10000",
				"pl_ttl_mny_group": 0,
				"haslatter_flag": false,
				"failure_flag": false,
				"pl_ttl_mny_org": 0,
				"pk_worktype": "196126982621364256",
				"pl_oth_mny_org": 0,
				"pl_mtr_mny_group": 0,
				"isWfControlled": true,
				"sysid": "RMM",
				"pk_equip__equip_name": "轮机",
				"pk_transitype__name": "工单管理",
				"pk_org__name": "wml集团",
				"pk_worktype__name": "日修",
				"ac_ttl_mny_org": 0,
				"ac_lbr_mny_org": 0,
				"consign_flag": false,
				"ac_ttl_mny_group": 0,
				"ac_lbr_mny_global": 0,
				"billmaker": "c92cfebd-4be8-4863-a572-d8b715a0ec26",
				"pl_mtr_mny_org": 0,
				"pl_lbr_mny_org": 0,
				"creationtime": "2024-03-27 14:44:18",
				"pl_lbr_mny_global": 0,
				"returncount": 0,
				"verifystate": 0,
				"pk_wo_status__name": "待审",
				"billmaker_name": "刘龙",
				"requirepermit": false,
				"settle_flag": false,
				"bill_code": "WO2403270003",
				"makeRuleCode": "repairPlan2WorkOrder",
				"pl_oth_mny_global": 0,
				"pk_currtype": "1763914111891537950",
				"pl_ttl_mny_global": 0,
				"pk_wo_status": "PRESET01_0000LJPGZ3RX3YAKG10000",
				"warrant_flag": false,
				"haschild_flag": false,
				"pk_repair_plan_b": "1961269551335735304",
				"userDefines": {},
				"check_plan_cost": false,
				"ysFlag": false,
				"wo_statustype": 0,
				"ac_lbr_mny_group": 0,
				"pubts": "2024-03-27 14:44:18",
				"isFlowCoreBill": false,
				"gen_failure_flag": false,
				"sourceid": "1961269551335735303",
				"creator": "c92cfebd-4be8-4863-a572-d8b715a0ec26",
				"billmaketime": "2024-03-27 14:44:18",
				"ac_oth_mny_org": 0,
				"pk_repair_plan": "1961269551335735303",
				"ac_oth_mny_group": 0,
				"pk_location__location_name": "产业园检测位置L2023006",
				"bill_status": 0,
				"ac_ttl_mny_global": 0,
				"sourceautoid": "1961269551335735304",
				"pk_currtype__moneyDigit": 2,
				"ac_mtr_mny_global": 0,
				"pl_lbr_mny_group": 0,
				"transi_type": "4B36-01",
				"creator_name": "刘龙",
				"pk_usedeptr__name": "A部门",
				"pk_usedeptr": "19612634535735304",
				"pk_user__name": "刘龙",
				"pk_user": "39612634535735304",
				"pk_parent_wo__bill_code": "WO2412040003",
				"pk_failure_type": "3961333535735304",
				"pk_failure_type__name": "故障",
				"pk_failure_detect": "3961333535235304",
				"pk_failure_detect__name": "巡检发现"
			}
		]
	},
	"pk_failure_symptom__name": "故障现象",
	"failure_detail": "故障原因说明",
	"failure_time": "2024-03-27 14:44:18",
	"pk_executor__name": "刘龙",
	"pk_director__name": "刘龙",
	"pk_psn_group__name": "A组",
	"pk_specialty__special_name": "专业",
	"workload": "656",
	"pk_priority__name": "一月内解决",
	"pri_clause": "关键",
	"pk_std_job__name": "全职能组织",
	"pk_provider__name": "A供应商",
	"targ_start_time": "2024-03-27 14:44:18",
	"targ_end_time": "2024-03-27 14:44:18",
	"plan_start_time": "2024-03-27 14:44:18",
	"plan_end_time": "2024-03-27 14:44:18",
	"actu_start_time": "2024-03-27 14:44:18",
	"actu_end_time": "2024-03-27 14:44:18",
	"plan_sthalt_time": "2024-03-27 14:44:18",
	"plan_endhalt_time": "2024-03-27 14:44:18",
	"actu_sthalt_time": "2024-03-27 14:44:18",
	"actu_endhalt_time": "2024-03-27 14:44:18",
	"failure_influence": "故障影响",
	"pk_failure_reason__name": "故障原因",
	"pk_service_step__name": "维修措施",
	"failure_reason_desc": "故障原因说明",
	"task_progress": "工作",
	"task_summary": "总结"
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
999	报错具体提示信息	结合报错提示信息查找原因

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

