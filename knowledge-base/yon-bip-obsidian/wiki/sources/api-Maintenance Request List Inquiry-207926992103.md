---
title: "维修申请详情查询"
apiId: "2079269921031192584"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Repair Application"
domain: "MRO"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Repair Application]
platform_version: "BIP"
source_type: community-api-docs
---

# 维修申请详情查询

>  请求方式	POST | Repair Application (MRO)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/am/workapplycard/detail
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
id	string	否	否	主键 示例：1993903529019310088
code	string	否	否	申请单号 示例：GZSQ2308240001

## 3. 请求示例

Url: /yonbip/am/workapplycard/detail?access_token=访问令牌
Body: {
	"id": "1993903529019310088",
	"code": "GZSQ2308240001"
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
returncount	number
小数位数:0,最大长度:10	否	returncount 示例：0
verifystate	number
小数位数:0,最大长度:10	否	verifystate 示例：2
pk_apply_dept	string	否	pk_apply_dept 示例：1795743238428033032
bill_code	string	否	bill_code 示例：GZSQ2405100001
memo	string	否	memo 示例：备注001
pk_org	string	否	pk_org 示例：1795743032269602824
apply_date	string	否	apply_date 示例：2024-05-09 00:00:00
pk_transitype	string	否	pk_transitype 示例：1785361014001239142
pk_applyer	string	否	pk_applyer 示例：1795744148972634112
userDefines	object	否	userDefines
bill_type	string	否	bill_type 示例：4B34
id	string	否	id 示例：1993903529019310088
pubts	string	否	pubts 示例：2024-05-10 14:02:37
creator__name	string	否	creator__name 示例：昵称-刘龙
tenant	string	否	tenant 示例：0000LKUKLMA0B7RHFL0000
userDefines__id	string	否	userDefines__id 示例：1993903529019310091
creator	string	否	creator 示例：4c4c966a-b9c1-4fc1-bada-1e2aa7fa98e2
billmaketime	string	否	billmaketime 示例：2024-05-10 14:02:02
pk_apply_dept__name	string	否	pk_apply_dept__name 示例：移动部门
audittime	string	否	audittime 示例：2024-05-10 14:02:18
isWfControlled	boolean	否	isWfControlled 示例：false
sysid	string	否	sysid 示例：RMM
pk_org__name	string	否	pk_org__name 示例：bx-维修组织
pk_transitype__name	string	否	pk_transitype__name 示例：维修申请
auditor	string	否	auditor 示例：4c4c966a-b9c1-4fc1-bada-1e2aa7fa98e2
auditor__name	string	否	auditor__name 示例：昵称-刘龙
apply_clause	string	否	apply_clause 示例：申请原因001
billmaker__name	string	否	billmaker__name 示例：昵称-刘龙
apply_name	string	否	apply_name 示例：8888
bill_status	number
小数位数:0,最大长度:10	否	bill_status 示例：2
billmaker	string	否	billmaker 示例：4c4c966a-b9c1-4fc1-bada-1e2aa7fa98e2
transi_type	string	否	transi_type 示例：4B34-01
pk_transitype__billtype_id	string	否	pk_transitype__billtype_id 示例：2146960889204992
creationtime	string	否	creationtime 示例：2024-05-10 14:02:02
pk_applyer__name	string	否	pk_applyer__name 示例：白璇
bodyvos	object	是	bodyvos
_viewmodel	string	否	_viewmodel
masterOrgKeyField	string	否	masterOrgKeyField 示例：pk_org
transTypeKeyField	string	否	transTypeKeyField 示例：pk_transitype
_mddFormulaExecuteFlag	string	否	_mddFormulaExecuteFlag 示例：true
errorDetail	string	否	errorDetail

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功！",
	"data": {
		"returncount": 0,
		"verifystate": 2,
		"pk_apply_dept": "1795743238428033032",
		"bill_code": "GZSQ2405100001",
		"memo": "备注001",
		"pk_org": "1795743032269602824",
		"apply_date": "2024-05-09 00:00:00",
		"pk_transitype": "1785361014001239142",
		"pk_applyer": "1795744148972634112",
		"userDefines": {
			"ytenant": "0000LKUKLMA0B7RHFL0000",
			"id": "1993903529019310091",
			"dr": 0
		},
		"bill_type": "4B34",
		"id": "1993903529019310088",
		"pubts": "2024-05-10 14:02:37",
		"creator__name": "昵称-刘龙",
		"tenant": "0000LKUKLMA0B7RHFL0000",
		"userDefines__id": "1993903529019310091",
		"creator": "4c4c966a-b9c1-4fc1-bada-1e2aa7fa98e2",
		"billmaketime": "2024-05-10 14:02:02",
		"pk_apply_dept__name": "移动部门",
		"audittime": "2024-05-10 14:02:18",
		"isWfControlled": false,
		"sysid": "RMM",
		"pk_org__name": "bx-维修组织",
		"pk_transitype__name": "维修申请",
		"auditor": "4c4c966a-b9c1-4fc1-bada-1e2aa7fa98e2",
		"auditor__name": "昵称-刘龙",
		"apply_clause": "申请原因001",
		"billmaker__name": "昵称-刘龙",
		"apply_name": "8888",
		"bill_status": 2,
		"billmaker": "4c4c966a-b9c1-4fc1-bada-1e2aa7fa98e2",
		"transi_type": "4B34-01",
		"pk_transitype__billtype_id": "2146960889204992",
		"creationtime": "2024-05-10 14:02:02",
		"pk_applyer__name": "白璇",
		"bodyvos": [
			{
				"close_date": "2024-05-10 14:02:37",
				"pk_usedorg": "1795743032269602824",
				"make_wo_flag": true,
				"pk_mandept__name": "营销部门",
				"pk_usedept": "1795733798091489285",
				"treat_type": 1,
				"close_flag": true,
				"pk_location__location_code": "LOC23080006",
				"pk_location": "1795818254347796485",
				"pk_user": "1795744148972634112",
				"pk_mandept": "1795733798091489285",
				"pk_failure_symptom": "1909906587326087169",
				"pk_equip__pk_category": "1786010387296026625",
				"pk_org": "1795743032269602824",
				"pk_ownerorg": "1795743032269602824",
				"pk_equip__equip_code": "EAM-DAILY-202310250362",
				"userDefines": {
					"ytenant": "0000LKUKLMA0B7RHFL0000",
					"id": "1993903529019310090",
					"dr": 0
				},
				"pk_maintainorg__name": "bx-维修组织",
				"pk_closer__name": "昵称-刘龙",
				"id": "1993903529019310089",
				"pk_equip__pk_user__name": "白璇",
				"pubts": "2024-05-10 14:02:37",
				"pk_user__name": "白璇",
				"tenant": "0000LKUKLMA0B7RHFL0000",
				"pk_identify_user": "4c4c966a-b9c1-4fc1-bada-1e2aa7fa98e2",
				"userDefines__id": "1993903529019310090",
				"apply_business": "888",
				"pk_usedorg__name": "bx-维修组织",
				"pk_failure_type__name": "故障类别2",
				"pk_org__name": "bx-维修组织",
				"pk_maintainorg": "1795743032269602824",
				"pk_location__location_name": "昌平区乐多港万达",
				"pk_failure_symptom__name": "xianxiang3",
				"main_id": "1993903529019310088",
				"consign_flag": false,
				"identify_date": "2024-05-10 14:01:54",
				"pk_failure_type": "1907719469700481030",
				"pk_closer": "4c4c966a-b9c1-4fc1-bada-1e2aa7fa98e2",
				"pk_ownerorg__name": "bx-维修组织",
				"pk_bill": "WO2405100001",
				"pk_equip": "1846815948700909570",
				"pk_identify_user__name": "昵称-刘龙",
				"pk_equip__equip_name": "WORD资产",
				"pk_failure_reason": [
					"1905767879532871690",
					"1909906630254264326"
				],
				"pk_usedept__name": "营销部门",
				"pk_equip__pk_usedept__name": "营销部门",
				"attachment": "1993903529019310089",
				"pk_failure_reason__name": "yuanyin1,yuanyin3",
				"generate_bill_info": "工单批准了批准了",
				"generate_bill_code": "WO2405100001"
			}
		],
		"_viewmodel": "",
		"masterOrgKeyField": "pk_org",
		"transTypeKeyField": "pk_transitype",
		"_mddFormulaExecuteFlag": "true"
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
	1	2026-05-20	
更新
请求说明
维修申请支持用户级

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

