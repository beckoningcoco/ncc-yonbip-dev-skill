---
title: "工单提交"
apiId: "2232980770308227081"
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

# 工单提交

>  请求方式	POST | Work Order Management (MRO)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/am/workordercard/commit
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	是	否	工单管理参数项
id	string	否	否	工单管理主键 示例：2230709471361892359

## 3. 请求示例

Url: /yonbip/am/workordercard/commit?access_token=访问令牌
Body: {
	"data": [
		{
			"id": "2230709471361892359"
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
count	number
小数位数:0,最大长度:10	否	count 示例：1
sucessCount	number
小数位数:0,最大长度:10	否	sucessCount 示例：1
failCount	number
小数位数:0,最大长度:10	否	failCount 示例：0
messages	string	是	messages
infos	object	是	infos
failInfos	string	是	failInfos
errorDetail	string	否	errorDetail

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功！",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			""
		],
		"infos": [
			{
				"_realtype": "",
				"_entityName": "",
				"_keyName": "",
				"pk_group": "666666",
				"pl_oth_mny_group": 0,
				"pl_mtr_mny_global": 0,
				"wo_content": "工单管理测试",
				"ac_mtr_mny_group": 0,
				"ac_mtr_mny_org": 0,
				"receivable_flag": false,
				"need_check": false,
				"pk_location__location_code": "LOC24110007",
				"pk_location": "2131970166085910537",
				"pk_org": "2099319085960527881",
				"need_confirm": false,
				"pk_transitype": "2086855417276137578",
				"payable_flag": false,
				"payout_flag": false,
				"settled_list_flag": false,
				"bill_type": "4B36",
				"status_follow": false,
				"ac_oth_mny_global": 0,
				"status_time": "2025-03-25 15:59:26",
				"id": "2230709471361892359",
				"tenant": "0000M0Z8652LF1ZI810000",
				"pl_ttl_mny_group": 0,
				"userDefines__id": "2230709471361892361",
				"haslatter_flag": false,
				"failure_flag": false,
				"dispatched": false,
				"pl_ttl_mny_org": 0,
				"push_status": 0,
				"pk_org__name": "全职能组织",
				"pl_oth_mny_org": 0,
				"pl_mtr_mny_group": 0,
				"isWfControlled": true,
				"pk_transitype__name": "工单管理",
				"sysid": "RMM",
				"ac_ttl_mny_org": 0,
				"ac_lbr_mny_org": 0,
				"consign_flag": false,
				"ac_ttl_mny_group": 0,
				"ac_lbr_mny_global": 0,
				"report_time": "2025-03-25 15:45:06",
				"pl_mtr_mny_org": 0,
				"pl_lbr_mny_org": 0,
				"pl_lbr_mny_global": 0,
				"returncount": 0,
				"pk_wo_status__name": "待审",
				"verifystate": 1,
				"modifier_name": "白兆辉",
				"billmaker_name": "白兆辉",
				"requirepermit": false,
				"settle_flag": false,
				"pk_worktype": "PRESET02_0000M0Z8652LF1ZI810000",
				"pl_oth_mny_global": 0,
				"pk_currtype": "2086855305617997892",
				"pl_ttl_mny_global": 0,
				"pk_wo_status": "PRESET01_0000M0Z8652LF1ZI810000",
				"warrant_flag": false,
				"haschild_flag": false,
				"modifiedtime": "2025-03-25 15:52:14",
				"userDefines": {
					"_entityName": "",
					"_keyName": "",
					"A01": false,
					"ytenant": "0000M0Z8652LF1ZI810000",
					"id": "2230709471361892361",
					"dr": 0,
					"_status": ""
				},
				"pk_wo_status__cbg_color": "#0284c7",
				"pk_wo_status__cfg_color": "#fff",
				"check_plan_cost": false,
				"wo_statustype": 0,
				"ac_lbr_mny_group": 0,
				"pubts": "2025-03-25 16:11:58",
				"use_sla_flag": false,
				"gen_failure_flag": false,
				"billmaketime": "2025-03-25 15:46:02",
				"ac_oth_mny_org": 0,
				"pk_location__location_name": "河北省廊坊市",
				"ac_oth_mny_group": 0,
				"pk_worktype__name": "日常维护",
				"bill_status": 3,
				"ac_ttl_mny_global": 0,
				"pk_currtype__moneyDigit": "2",
				"ac_mtr_mny_global": 0,
				"pl_lbr_mny_group": 0,
				"transi_type": "4B36-01",
				"userDefines__A01": false,
				"_status": "",
				"wo_psn_execprogress": [
					""
				],
				"_convert_wo_psn_execprogress": "",
				"wo_part": [
					""
				],
				"_convert_wo_part": "",
				"wo_log": [
					""
				],
				"_convert_wo_log": "",
				"wo_planotherexes": [
					""
				],
				"_convert_wo_planotherexes": "",
				"wo_permit": [
					""
				],
				"_convert_wo_permit": "",
				"wo_precaution_read": [
					""
				],
				"_convert_wo_precaution_read": "",
				"wo_task": [
					""
				],
				"_convert_wo_task": "",
				"wo_assignment": [
					""
				],
				"_convert_wo_assignment": "",
				"wo_plan_psn": [
					""
				],
				"_convert_wo_plan_psn": "",
				"wo_source": [
					""
				],
				"_convert_wo_source": "",
				"wo_his": [
					{
						"_realtype": "",
						"_entityName": "",
						"_keyName": "",
						"dr": 0,
						"id": "2230709479951826953",
						"main_id": "2230709471361892359",
						"pk_changer": "5dd8fa6d-285c-4302-ad63-3b754ef4e649",
						"pk_wostatus": "PRESET01_0000M0Z8652LF1ZI810000",
						"systime": "2025-03-25 15:45:04",
						"tenant": "0000M0Z8652LF1ZI810000",
						"ytenant": "0000M0Z8652LF1ZI810000",
						"_status": ""
					}
				],
				"_convert_wo_his": "",
				"wo_plan_inv": [
					""
				],
				"_convert_wo_plan_inv": "",
				"wo_taskobj": [
					{
						"_realtype": "",
						"_entityName": "",
						"_keyName": "",
						"ytenant": "0000M0Z8652LF1ZI810000",
						"main_id": "2230709471361892359",
						"sequence_num": 10,
						"pk_location": "2131970166085910537",
						"dr": 0,
						"tenant": "0000M0Z8652LF1ZI810000",
						"id": "2230709471361892360",
						"source_flag": false,
						"_status": ""
					}
				],
				"_convert_wo_taskobj": "",
				"wo_scramble_his": [
					""
				],
				"_convert_wo_scramble_his": "",
				"wo_upgrade_content": [
					""
				],
				"_convert_wo_upgrade_content": "",
				"wo_plan_tool": [
					""
				],
				"_convert_wo_plan_tool": "",
				"wo_structure": [
					""
				],
				"_convert_wo_structure": "",
				"wo_actual_inv": [
					""
				],
				"_convert_wo_actual_inv": "",
				"wo_precaution": [
					""
				],
				"_convert_wo_precaution": "",
				"wo_actualotherexes": [
					""
				],
				"_convert_wo_actualotherexes": "",
				"maintenance": [
					""
				],
				"_convert_maintenance": "",
				"wo_actual_psn": [
					""
				],
				"_convert_wo_actual_psn": "",
				"ytenant": "0000M0Z8652LF1ZI810000",
				"dr": 0,
				"file_before_repair": "9f5136d7-598d-7bd3-60ac-84b47cd4f5bb",
				"file_after_repair": "eef9d7c6-8e44-b90e-6493-cb97253110a5",
				"pk_wo_status_init": "PRESET01_0000M0Z8652LF1ZI810000",
				"creator": "5dd8fa6d-285c-4302-ad63-3b754ef4e649",
				"creationtime": "2025-03-25 15:46:02",
				"modifier": "5dd8fa6d-285c-4302-ad63-3b754ef4e649",
				"billmaker": "5dd8fa6d-285c-4302-ad63-3b754ef4e649",
				"pk_org_": "2099319085960527881",
				"submitFilledFromDetail": true,
				"bill_code": "WO250325020494",
				"need_check_name": "否",
				"status_follow_name": "否",
				"status_time_name": "2025-03-25 15:59:26",
				"haslatter_flag_name": "否",
				"isWfControlled_name": "是",
				"settle_flag_name": "否",
				"pubts_name": "2025-03-25 15:59:26",
				"use_sla_flag_name": "否",
				"gen_failure_flag_name": "否",
				"userDefines__A01_name": "否",
				"settled_list_flag_name": "否",
				"push_status_name": "未推单",
				"billmaketime_name": "2025-03-25 15:46:02",
				"bill_status_name": "审核中",
				"receivable_flag_name": "否",
				"payout_flag_name": "否",
				"dispatched_name": "否",
				"consign_flag_name": "否",
				"verifystate_name": "审批中",
				"warrant_flag_name": "否",
				"wo_statustype_name": "待批准",
				"payable_flag_name": "否",
				"failure_flag_name": "否",
				"report_time_name": "2025-03-25 15:45:06",
				"requirepermit_name": "否",
				"haschild_flag_name": "否",
				"modifiedtime_name": "2025-03-25 15:52:14",
				"check_plan_cost_name": "否"
			}
		],
		"failInfos": [
			""
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

