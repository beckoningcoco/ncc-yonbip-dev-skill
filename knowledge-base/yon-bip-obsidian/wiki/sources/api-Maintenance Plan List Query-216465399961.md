---
title: "维修计划详情查询"
apiId: "2164653999619309577"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Repair Plan"
domain: "MRO"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Repair Plan]
platform_version: "BIP"
source_type: community-api-docs
---

# 维修计划详情查询

>  请求方式	POST | Repair Plan (MRO)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/am/apmrepairplancard/detail
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
id	string	否	否	主键 示例：2167445814272589827
code	string	否	否	计划号 示例：WXJH2412300001

## 3. 请求示例

Url: /yonbip/am/apmrepairplancard/detail?access_token=访问令牌
Body: {
	"id": "2167445814272589827",
	"code": "WXJH2412300001"
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
小数位数:0,最大长度:10	否	返回编码，成功是200 示例：200
message	string	否	返回信息 示例：操作成功！
data	object	否	详情数据
id	string	否	维修计划主键 示例：2167445814272589827
bill_code	string	否	计划号 示例：WXJH2412300001
plan_make_date	date
格式:yyyy-MM-dd	否	编制日期 示例：2024-12-30
pk_org	string	否	维修组织主键 示例：2099319085960527881
pk_org__name	string	否	维修组织 示例：全职能组织
pk_plan_dept	string	否	编制部门主键 示例：2099319352248500228
pk_plan_dept__name	string	否	编制部门 示例：营销部门
pk_planner	string	否	编制人主键 示例：2117175472615325696
pk_planner__name	string	否	编制人 示例：刘龙
pk_planner__mobile	string	否	编制人手机号 示例：+86-18810377717
bill_status	number
小数位数:0,最大长度:6	否	单据状态:{"0":"开立","3":"审核中","1":"已审核","2":"已关闭"} 示例：0
plan_totalcost_org	number
小数位数:8,最大长度:28	否	计划总费用 示例：1661
bill_name	string	否	计划名称 示例：计划名称
nversion	number
小数位数:0,最大长度:10	否	版本号 示例：1
plan_type	string	否	计划类型 示例：PRESET02_0000M0Z8652LF1ZI810000
plan_type__name	string	否	计划类型主键 示例：保养计划
pk_planlevel	string	否	计划级别主键 示例：PRESET03_0000M0Z8652LF1ZI810000
pk_planlevel__code	string	否	计划级别编码 示例：03
pk_planlevel__name	string	否	计划级别 示例：周计划
pk_planlevel__parent	string	否	计划级别父级主键 示例：PRESET02_0000M0Z8652LF1ZI810000
pk_planlevel__parent__code	string	否	计划级别父级编码 示例：02
pk_planlevel__parent__name	string	否	计划级别父级名称 示例：月度计划
year	number
小数位数:0,最大长度:10	否	年度 示例：2025
month	number
小数位数:0,最大长度:10	否	月份 示例：1
week	number
小数位数:0,最大长度:10	否	周次 示例：1
valid_start_date	date
格式:yyyy-MM-dd	否	有效开始日期 示例：2025-01-06
valid_end_date	date
格式:yyyy-MM-dd	否	有效截止日期 示例：2025-01-12
last_version	boolean	否	是否最新版本 示例：true
updator	string	否	变更人主键 示例：2117175472615325696
updator__name	string	否	变更人 示例：刘龙
update_time	date
格式:yyyy-MM-dd HH:mm:ss	否	变更时间 示例：2025-01-12 12:30:00
pk_closer	string	否	关闭人主键 示例：2117175472615325696
pk_closer__name	string	否	关闭人 示例：刘龙
close_date	date
格式:yyyy-MM-dd HH:mm:ss	否	关闭时间 示例：2025-01-12 13:30:00
modifier	string	否	最后修改人主键 示例：2117175472615325696
modifier__name	string	否	最后修改人 示例：刘龙
modifiedtime	date
格式:yyyy-MM-dd HH:mm:ss	否	最后修改时间 示例：2025-01-12 14:30:00
auditor	string	否	审核人主键 示例：2117175472615325696
auditor__name	string	否	审核人 示例：刘龙
audittime	date
格式:yyyy-MM-dd HH:mm:ss	否	审核时间 示例：2025-01-12 14:30:00
billmaker	string	否	制单人主键 示例：5dd8fa6d-285c-4302-ad63-3b754ef4e649
billmaker__name	string	否	制单人 示例：刘龙
billmaketime	date
格式:yyyy-MM-dd HH:mm:ss	否	制单时间 示例：2024-12-30 09:58:25
memo	string	否	备注 示例：备注信息
verifystate	number
小数位数:0,最大长度:6	否	审批状态:{"0":"开立","1":"审批中","2":"审批通过","3":"流程终止","4":"退回制单"} 示例：0
bodyvos	object	是	维修计划行数据
errorDetail	string	否	异常信息

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功！",
	"data": {
		"id": "2167445814272589827",
		"bill_code": "WXJH2412300001",
		"plan_make_date": "2024-12-30",
		"pk_org": "2099319085960527881",
		"pk_org__name": "全职能组织",
		"pk_plan_dept": "2099319352248500228",
		"pk_plan_dept__name": "营销部门",
		"pk_planner": "2117175472615325696",
		"pk_planner__name": "刘龙",
		"pk_planner__mobile": "+86-18810377717",
		"bill_status": 0,
		"plan_totalcost_org": 1661,
		"bill_name": "计划名称",
		"nversion": 1,
		"plan_type": "PRESET02_0000M0Z8652LF1ZI810000",
		"plan_type__name": "保养计划",
		"pk_planlevel": "PRESET03_0000M0Z8652LF1ZI810000",
		"pk_planlevel__code": "03",
		"pk_planlevel__name": "周计划",
		"pk_planlevel__parent": "PRESET02_0000M0Z8652LF1ZI810000",
		"pk_planlevel__parent__code": "02",
		"pk_planlevel__parent__name": "月度计划",
		"year": 2025,
		"month": 1,
		"week": 1,
		"valid_start_date": "2025-01-06",
		"valid_end_date": "2025-01-12",
		"last_version": true,
		"updator": "2117175472615325696",
		"updator__name": "刘龙",
		"update_time": "2025-01-12 12:30:00",
		"pk_closer": "2117175472615325696",
		"pk_closer__name": "刘龙",
		"close_date": "2025-01-12 13:30:00",
		"modifier": "2117175472615325696",
		"modifier__name": "刘龙",
		"modifiedtime": "2025-01-12 14:30:00",
		"auditor": "2117175472615325696",
		"auditor__name": "刘龙",
		"audittime": "2025-01-12 14:30:00",
		"billmaker": "5dd8fa6d-285c-4302-ad63-3b754ef4e649",
		"billmaker__name": "刘龙",
		"billmaketime": "2024-12-30 09:58:25",
		"memo": "备注信息",
		"verifystate": 0,
		"bodyvos": [
			{
				"pk_equip": "2160147926076620801",
				"pk_equip__equip_code": "20-202412200021",
				"pk_equip__equip_name": "资产测试2",
				"pk_location": "",
				"pk_location__location_code": "",
				"pk_location__location_name": "",
				"repair_obj_name": "资产测试2",
				"overhaul_part": "部位1",
				"repair_content": "维修内容",
				"pk_std_job": "2129811275001102342",
				"pk_std_job__name": "全职能组织",
				"workload": "主要工作量",
				"start_date": "2024-12-01",
				"finish_date": "2024-12-31",
				"remind_date": "2024-12-01",
				"plan_cost_mny_org": 1661,
				"actual_performance": "实际完成情况",
				"actual_mny_org": 1661,
				"actual_mny_org_calctime": "2024-12-01 00:00:00",
				"consign_flag": true,
				"consign_reason": "委外原因",
				"pk_provider": "2125950786606202887",
				"pk_provider__name": "青岛贝源上资产管理有限公司",
				"principal_dept": "2099319352248500228",
				"principal_dept__name": "营销部门",
				"pk_principal": "2117175472615325696",
				"pk_principal__name": "刘龙",
				"pk_project": "2139443074182938633",
				"pk_project__code": "xm1",
				"pk_project__name": "项目1",
				"pk_wbs_task__name": "WBS任务名称",
				"pk_wbs_task": "2144465067764613127",
				"pk_wbs_task__code": "WBS20241230001",
				"pk_activity": "2163881111651876872",
				"pk_activity__code": "RWXZ202412250001",
				"pk_activity__taskName": "HT001",
				"close_flag": false,
				"pk_closer": "2117175472615325696",
				"pk_closer__name": "刘龙",
				"close_date": "2024-12-02 00:00:00",
				"executable_flag": true,
				"project_approval": 1,
				"memo": "维修计划行备注",
				"wo_flag": false,
				"taskobj_list": [
					{
						"main_id": "2167445814272589828",
						"sequence_num": 10,
						"pk_equip": "2160147926076620801",
						"pk_equip__equip_code": "20-202412200021",
						"pk_equip__equip_name": "资产名称信息",
						"pk_location": "2160147926076620801",
						"pk_location__location_code": "20-202412200021",
						"pk_location__location_name": "位置名称信息",
						"memo": "作业对象备注"
					}
				],
				"task_list": [
					{
						"main_id": "2167445814272589828",
						"sequence_num": 10,
						"job_content": "作业内容",
						"std_need": "标准要求",
						"check_means": "检查方法",
						"normal_hours": 2,
						"plan_start_time": "2024-12-01 00:00:00",
						"plan_end_time": "2024-12-31 00:00:00",
						"memo": "作业方案备注",
						"pk_tool": "2087319196446228482",
						"pk_tool__code": "ZDH_PTTZZ_GJ",
						"pk_tool__name": "自动化_普通组织_工具"
					}
				],
				"material_list": [
					{
						"main_id": "2167445814272589828",
						"sequence_num": 10,
						"pk_material": "2113385851179237379",
						"pk_material__code": "WLFL000001",
						"pk_material__name": "办公用品",
						"materialFree": "",
						"pk_material__modelDescription": "规格20241022",
						"pk_material__model": "型号20241022",
						"castunitid": "2087318105523486764",
						"castunitid__code": "ZDH_JLDW_ZC",
						"castunitid__name": "自动化_计量单位",
						"castunitid__precision": 2,
						"nnum": 23,
						"vchangerate": 1,
						"vchangerate_digit": 0,
						"pk_measdoc": "2087318105523486764",
						"pk_measdoc__code": "ZDH_JLDW_ZC",
						"pk_measdoc__name": "自动化_计量单位",
						"pk_measdoc__precision": 2,
						"nassistnum": 23,
						"required_date": "2024-12-01",
						"outer_flag": false,
						"pk_stockorg": "2099319085960527881",
						"pk_stockorg__name": "全职能组织",
						"pk_stordoc": "2116369358796619777",
						"price_org": 23,
						"money_org": 529,
						"memo": "计划物料备注"
					}
				],
				"psn_list": [
					{
						"main_id": "2167445814272589828",
						"sequence_num": 10,
						"pk_job_type": "2121540860210315268",
						"pk_job_type__code": "01",
						"pk_job_type__name": "2121540860210315268",
						"pk_job_type_level": "PRESET01_0000M0Z8652LF1ZI810000",
						"pk_job_type_level__name": "初级",
						"person_num": 2,
						"pk_psndoc": "",
						"pk_psndoc__code": "",
						"man_hours": 2,
						"rate": 33,
						"money": 132,
						"memo": "计划人员备注"
					}
				],
				"tool_list": [
					{
						"main_id": "2167445814272589828",
						"sequence_num": 10,
						"pk_tool": "2087319196446228482",
						"pk_tool__code": "ZDH_PTTZZ_GJ",
						"pk_tool__name": "自动化_普通组织_工具",
						"tools_num": 2,
						"memo": "计划工具备注"
					}
				],
				"exes_list": [
					{
						"main_id": "2167445814272589828",
						"sequence_num": 10,
						"exestype": "费用类型",
						"pk_inoutbusiclass": "2086854463807553890",
						"pk_inoutbusiclass__name": "",
						"exesmoney": NaN,
						"memo": "计划其他费用备注"
					}
				],
				"precaution_list": [
					{
						"main_id": "2167445814272589828",
						"pk_precaution": "2129810484727119880",
						"pk_precaution__code": "01",
						"pk_precaution__name": "断电风险",
						"pk_precaution__risk_type": "",
						"risk_zone": "风险点",
						"precaution_content": "断电",
						"memo": "风险预控备注"
					}
				]
			}
		]
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
999	报错具体提示信息	报错具体提示信息

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-25	
更新
返回参数 pk_wbs_task__name
更新
返回参数 pk_stordoc
更新
返回参数 pk_psndoc__code

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

