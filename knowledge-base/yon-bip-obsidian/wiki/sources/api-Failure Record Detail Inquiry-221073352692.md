---
title: "故障记录详情查询"
apiId: "2210733526926491657"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Failure Record"
domain: "MRO"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Failure Record]
platform_version: "BIP"
source_type: community-api-docs
---

# 故障记录详情查询

>  请求方式	POST | Failure Record (MRO)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/am/aomfailurecard/detail
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
id	string	否	否	主键 示例：2083937296238772228
code	string	否	否	单据编码 示例：GZJL20240908002

## 3. 请求示例

Url: /yonbip/am/aomfailurecard/detail?access_token=访问令牌
Body: {
	"id": "2083937296238772228",
	"code": "GZJL20240908002"
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
小数位数:0,最大长度:10	否	返回码 示例：200
message	string	否	返回信息 示例：操作成功！
data	object	否	返回数据
id	string	否	主键 示例：2083937296238772228
bill_code	string	否	单据编码 示例：GZJL20240908002
record_date	string	否	记录日期 示例：2024-09-08
pk_org	string	否	资产组织主键 示例：1998986811678916609
pk_org__name	string	否	资产组织 示例：hxx-资产组织
pk_recorder	string	否	记录人主键 示例：672e9f78-e1c1-44f1-8c77-e076eb447098
bill_status	number
小数位数:0,最大长度:10	否	单据状态（0 - 开立 1 - 已审核 2 - 已关闭 3 - 审核中） 示例：0
pk_recorder__name	string	否	记录人 示例：刘龙
fault_source	string	否	故障来源（0- pc端 1- 移动端） 示例：0
billmaker	string	否	制单人主键 示例：672e9f78-e1c1-44f1-8c77-e076eb447098
billmaker__name	string	否	制单人 示例：昵称-haoxxia
billmaketime	string	否	制单时间 示例：2024-09-08 21:30:31
modifier	string	否	最后修改人主键 示例：c92cfebd-4be8-4863-a572-d8b715a0ec26
modifier__name	string	否	最后修改人 示例：刘龙
modifiedtime	string	否	最后修改时间 示例：2025-02-06 17:48:37
auditor	string	否	审核人主键 示例：c92cfebd-4be8-4863-a572-d8b715a0ec26
auditor__name	string	否	审核人主键 示例：刘龙
verifystate	number
小数位数:0,最大长度:10	否	审核状态（0 - 开立 1 - 审批中 2 - 审批通过 3 - 流程中止 4 - 退回制单） 示例：0
audittime	string	否	审核时间 示例：2025-02-27 10:31:04
pk_transitype	string	否	交易类型主键 示例：1763914120481473738
bill_type	string	否	单据类型 示例：4B08
pubts	string	否	时间戳 示例：2025-02-06 17:48:38
pk_transitype__name	string	否	交易类型 示例：故障记录
summary_status	number
小数位数:0,最大长度:10	否	总结状态(1:未总结，2:已总结) 示例：1
transi_type	string	否	交易类型 示例：4B08-01
pk_transitype__billtype_id	string	否	单据类型主键 示例：2176628680823040
need_summary_flag	boolean	否	需要总结（false无需总结，true需要总结；只有为true的需要总结的故障记录才能在故障记录总结节点中查询到） 示例：false
bodyvos	object	是	表体数据

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功！",
	"data": {
		"id": "2083937296238772228",
		"bill_code": "GZJL20240908002",
		"record_date": "2024-09-08",
		"pk_org": "1998986811678916609",
		"pk_org__name": "hxx-资产组织",
		"pk_recorder": "672e9f78-e1c1-44f1-8c77-e076eb447098",
		"bill_status": 0,
		"pk_recorder__name": "刘龙",
		"fault_source": "0",
		"billmaker": "672e9f78-e1c1-44f1-8c77-e076eb447098",
		"billmaker__name": "昵称-haoxxia",
		"billmaketime": "2024-09-08 21:30:31",
		"modifier": "c92cfebd-4be8-4863-a572-d8b715a0ec26",
		"modifier__name": "刘龙",
		"modifiedtime": "2025-02-06 17:48:37",
		"auditor": "c92cfebd-4be8-4863-a572-d8b715a0ec26",
		"auditor__name": "刘龙",
		"verifystate": 0,
		"audittime": "2025-02-27 10:31:04",
		"pk_transitype": "1763914120481473738",
		"bill_type": "4B08",
		"pubts": "2025-02-06 17:48:38",
		"pk_transitype__name": "故障记录",
		"summary_status": 1,
		"transi_type": "4B08-01",
		"pk_transitype__billtype_id": "2176628680823040",
		"need_summary_flag": false,
		"bodyvos": [
			{
				"pk_usedorg": "1998986811678916609",
				"pk_mandept__name": "部门A",
				"pk_ownerunit__name": "hxx-资产组织",
				"failure_time": "2024-09-08 21:29:40",
				"pk_failure_symptom__code": "P30111",
				"close_flag": false,
				"pk_mandept": "2001382518667870208",
				"pk_failure_symptom": "1769683464135114766",
				"pk_equip__pk_category": "1997080627896647685",
				"pk_org": "1998986811678916609",
				"pk_ownerorg": "1998986811678916609",
				"pk_equip__equip_code": "EAM-TEST-2024081900000002",
				"pk_maintainorg__name": "hxx-资产组织",
				"id": "2083937296238772229",
				"pubts": "2025-02-06 17:47:18",
				"pk_ownerunit": "1998986811678916609",
				"processed_flag": "1",
				"pk_usedorg__name": "hxx-资产组织",
				"pk_failure_type__name": "anbd",
				"pk_maintainorg": "1998986811678916609",
				"pk_failure_symptom__name": "转子窜量大",
				"main_id": "2083937296238772228",
				"wo_flag": false,
				"pk_failure_type": "1960559146574020614",
				"pk_ownerorg__name": "hxx-资产组织",
				"failure_expound": "h",
				"pk_equip": "2068922081906524165",
				"pk_failure_type__code": "abc",
				"pk_equip__equip_name": "测试润滑",
				"pk_failure_reason": [
					"1769683696063348743"
				],
				"pk_failure_reason__name": "压力表坏",
				"treat_type": "0"
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
999	服务端逻辑异常	结合报错提示信息查找原因

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

