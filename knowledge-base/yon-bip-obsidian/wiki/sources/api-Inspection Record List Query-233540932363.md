---
title: "检定记录列表查询"
apiId: "2335409323636162568"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Inspection Record"
domain: "GAM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Inspection Record]
platform_version: "BIP"
source_type: community-api-docs
---

# 检定记录列表查询

>  请求方式	POST | Inspection Record (GAM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/ACC/verificationrecord/query
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
小数位数:0,最大长度:10	否	是	页号 示例：1 默认值：1
pageSize	number
小数位数:0,最大长度:10	否	是	每页条数 示例：10 默认值：10
isSum	boolean	否	否	表头:true，表头+明细:false 示例：false 默认值：false

## 3. 请求示例

Url: /yonbip/ACC/verificationrecord/query?access_token=访问令牌
Body: {
	"condition": {
		"simpleVOs": [
			{
				"field": "id",
				"op": "in",
				"value1": "2142414272408846338或者[\"2142414272408846338\"]",
				"value2": "2142414272408846338"
			}
		]
	},
	"page": {
		"pageIndex": 1,
		"pageSize": 10
	},
	"isSum": false
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
data	object	否	返回数据
pageIndex	number
小数位数:0,最大长度:10	否	页码 示例：1
pageSize	number
小数位数:0,最大长度:10	否	每页条数 示例：20
recordCount	number
小数位数:0,最大长度:10	否	记录数 示例：1
recordList	object	是	返回数据
pageCount	number
小数位数:0,最大长度:10	否	总页数 示例：1
beginPageIndex	number
小数位数:0,最大长度:10	否	起始页 示例：1
endPageIndex	number
小数位数:0,最大长度:10	否	结束页 示例：1

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功！",
	"data": {
		"pageIndex": 1,
		"pageSize": 20,
		"recordCount": 1,
		"recordList": [
			{
				"pk_recorder": "2111265717973680137",
				"pk_mandept__name": "likun-DP.Name-01",
				"bill_code": "JDJL202504250001",
				"pk_recorder_date": "2025-04-25",
				"total_expenses": 0,
				"verification_org_after__name": "LIKUNTEST-天猫超市",
				"pk_mandept": "2111228497794433025",
				"pk_org": "2111225611567497225",
				"pk_transitype": "2107554909184851990",
				"finorgid__name": "likun-OrgName-All",
				"verification_org_after": "2111295808539721736",
				"bill_type": "4A74",
				"pk_org__pk_fiorg__currency": "2107554866232033332",
				"id": "2253447767040458759",
				"pubts": "2025-04-25 07:04:12",
				"creator__name": "LIKUN",
				"isFlowCoreBill": false,
				"tenant": "0000M232Z6A20YFPC30000",
				"creator": "707f7ad7-bdb5-4b4d-88a6-77663ac387aa",
				"billmaketime": "2025-04-25 07:04:08",
				"audittime": "2025-04-25 07:04:12",
				"sysid": "MIM",
				"isWfControlled": false,
				"pk_org__name": "likun-OrgName-All",
				"pk_transitype__name": "检定记录",
				"auditor": "707f7ad7-bdb5-4b4d-88a6-77663ac387aa",
				"auditor__name": "LIKUN",
				"pk_org__pk_fiorg__currency__moneyDigit": "2",
				"billmaker__name": "LIKUN",
				"bill_status": 1,
				"pk_recorder__name": "李坤-员工-01[Myself]",
				"billmaker": "707f7ad7-bdb5-4b4d-88a6-77663ac387aa",
				"transi_type": "4A74-01",
				"finorgid": "2111225611567497225",
				"creationtime": "2025-04-25 07:04:08",
				"pk_group": "",
				"memo": "",
				"modifier": "",
				"modifier__name": "",
				"modifiedtime": "",
				"busi_type": "",
				"check_opinion": "",
				"bizFlow": "",
				"verifystate": "",
				"bodyvosid": "",
				"report_code": "",
				"pk_equip__pk_ownerorg": "",
				"pk_measure_instrument_category__catalog": "",
				"pk_equip__pk_usedorg": "",
				"pk_equip__equip_code": "",
				"pk_measure_instrument_category": "",
				"pk_equip__equip_name": "",
				"pk_equip__pk_category": "",
				"pk_equip__spec": "",
				"pk_equip": "",
				"pk_equip__model": "",
				"pk_equip__precoding": "",
				"pk_equip__facturer_name": "",
				"equip_extend__verification_method": "",
				"verification_report_code_after": "",
				"verification_result_after": "",
				"verification_date_after": "",
				"verification_org_before": "",
				"verification_report_code_before": "",
				"verification_expiry_date_after": "",
				"verification_result_before": "",
				"verification_expenses": "",
				"verification_date_before": "",
				"pk_costcenter_use__name": "",
				"verification_expiry_date_before": "",
				"accuracy_level": "",
				"uncertainty_after": "",
				"pk_costcenter_use": "",
				"verification_basis": "",
				"verification_certifier": "",
				"uncertainty_before": "",
				"verification_verifier": "",
				"verifier": "",
				"equip_extend__verification_cycle": "",
				"equip_extend__verification_cycle_unit": "",
				"pk_equip__pk_category__category_name": "",
				"pk_equip__pk_ownerorg__name": "",
				"pk_equip__pk_usedorg__name": ""
			}
		],
		"pageCount": 1,
		"beginPageIndex": 1,
		"endPageIndex": 1
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
999	报错具体提示信息，例如：服务端逻辑异常	查看日志找对应异常服务定位产生原因

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

