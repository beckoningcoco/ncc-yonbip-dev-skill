---
title: "事后汇报提交"
apiId: "2320546597917687819"
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

# 事后汇报提交

>  请求方式	POST | Work Order Management (MRO)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/ACC/workorderaflist/commit
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
data	object	是	是	事后汇报参数项
id	string	否	是	事后汇报主键 示例：2331042870907109380

## 3. 请求示例

Url: /yonbip/ACC/workorderaflist/commit?access_token=访问令牌
Body: {
	"data": [
		{
			"id": "2331042870907109380"
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
code	string	否	返回码，200成功，其它失败 示例：200
message	string	否	返回消息 示例：操作成功！
data	object	否	返回数据
count	number
小数位数:0,最大长度:10	否	数量 示例：1
sucessCount	number
小数位数:0,最大长度:10	否	成功数量 示例：1
failCount	number
小数位数:0,最大长度:10	否	失败数量 示例：0
messages	string	是	信息
infos	object	是	事后汇报数据
failInfos	string	是	失败信息

## 5. 正确返回示例

{
	"code": "200",
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
				"id": "2331042870907109380",
				"maintenance": [
					""
				],
				"wo_actual_inv": [
					""
				],
				"wo_actual_psn": [
					""
				],
				"wo_actualotherexes": [
					""
				],
				"wo_assignment": [
					""
				],
				"wo_his": [
					{
						"dr": 0,
						"id": "2331042870907109384",
						"main_id": "2331042870907109380",
						"pk_changer": "5dd8fa6d-285c-4302-ad63-3b754ef4e649",
						"pk_wostatus": "PRESET03_0000M0Z8652LF1ZI810000",
						"systime": "2025-08-07 20:17:48",
						"ytenant": "0000M0Z8652LF1ZI810000"
					}
				],
				"wo_log": [
					""
				],
				"wo_part": [
					""
				],
				"wo_permit": [
					""
				],
				"wo_plan_inv": [
					""
				],
				"wo_plan_psn": [
					""
				],
				"wo_plan_tool": [
					""
				],
				"wo_planotherexes": [
					""
				],
				"wo_precaution": [
					""
				],
				"wo_precaution_read": [
					""
				],
				"wo_psn_execprogress": [
					""
				],
				"wo_scramble_his": [
					""
				],
				"wo_source": [
					""
				],
				"wo_structure": [
					""
				],
				"wo_task": [
					""
				],
				"wo_taskobj": [
					{
						"userDefines": {
							"ytenant": "0000M0Z8652LF1ZI810000",
							"id": "2331042870907109382",
							"dr": 0
						},
						"main_id": "2331042870907109380",
						"sequence_num": 10,
						"pk_equip": "2330205274979172359",
						"id": "2331042870907109381",
						"source_flag": false,
						"amortization_flag": 0
					}
				],
				"wo_upgrade_content": [
					""
				],
				"bill_code": "WO250807020003",
				"wo_content": "807-2017",
				"status_time": "2025-08-08 17:46:12",
				"report_time": "2025-08-07 20:17:51",
				"actu_start_time": "2025-08-07 00:00:00",
				"isWfControlled": true,
				"verifystate": 0,
				"returncount": 0,
				"pk_org": "2099319085960527881",
				"pk_wo_status_init": "PRESET03_0000M0Z8652LF1ZI810000",
				"pk_wo_status": "PRESET03_0000M0Z8652LF1ZI810000",
				"wo_statustype": 2,
				"pk_worktype": "PRESET02_0000M0Z8652LF1ZI810000",
				"pk_equip": "2330205274979172359",
				"send_flag": 0,
				"pk_ownerorg": "2167440840675819522",
				"pk_mandept": "2167581586754109441",
				"pk_usedorg": "2099319085960527881",
				"warrant_flag": false,
				"status_follow": false,
				"haschild_flag": false,
				"pk_currtype": "2086855305617997892",
				"receivable_flag": false,
				"payable_flag": false,
				"payout_flag": false,
				"check_plan_cost": false,
				"requirepermit": false,
				"consign_flag": false,
				"pl_mtr_mny_org": 0,
				"pl_mtr_mny_group": 0,
				"pl_mtr_mny_global": 0,
				"ac_mtr_mny_org": 0,
				"ac_mtr_mny_group": 0,
				"ac_mtr_mny_global": 0,
				"pl_lbr_mny_org": 0,
				"pl_lbr_mny_group": 0,
				"pl_lbr_mny_global": 0,
				"ac_lbr_mny_org": 0,
				"ac_lbr_mny_group": 0,
				"ac_lbr_mny_global": 0,
				"pl_oth_mny_org": 0,
				"pl_oth_mny_group": 0,
				"pl_oth_mny_global": 0,
				"ac_oth_mny_org": 0,
				"ac_oth_mny_group": 0,
				"ac_oth_mny_global": 0,
				"pl_ttl_mny_org": 0,
				"pl_ttl_mny_group": 0,
				"pl_ttl_mny_global": 0,
				"ac_ttl_mny_org": 0,
				"ac_ttl_mny_group": 0,
				"ac_ttl_mny_global": 0,
				"haslatter_flag": false,
				"gen_failure_flag": false,
				"failure_flag": false,
				"creator": "5dd8fa6d-285c-4302-ad63-3b754ef4e649",
				"creationtime": "2025-08-07 20:18:27",
				"bill_status": 0,
				"bill_type": "4B36",
				"pk_transitype": "2086855417276137579",
				"transi_type": "4B36-AF",
				"billmaker": "5dd8fa6d-285c-4302-ad63-3b754ef4e649",
				"billmaketime": "2025-08-07 20:18:27",
				"pubts": "2025-08-08 17:46:12",
				"sysid": "RMM",
				"need_check": false,
				"settle_flag": false,
				"use_sla_flag": 0,
				"settled_list_flag": false,
				"userDefines": {
					"ytenant": "0000M0Z8652LF1ZI810000",
					"id": "2331042870907109383",
					"dr": 0
				},
				"push_status": 0,
				"file_before_repair": "27cf0508-705e-0f1f-b752-84697e0eb197",
				"work_order_type": 1,
				"file_after_repair": "33af42cb-61ba-e3bd-de84-06c0dce739a5",
				"pk_ownerunit": "2167440840675819522",
				"dispatched": 0,
				"need_confirm": 0,
				"pk_wo_status__name": "进行中"
			}
		],
		"failInfos": [
			""
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

