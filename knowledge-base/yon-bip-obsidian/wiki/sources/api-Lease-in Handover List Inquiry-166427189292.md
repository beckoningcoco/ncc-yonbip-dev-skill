---
title: "租入交接详情查询"
apiId: "1664271892926693377"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Lease-in Handover"
domain: "GAM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Lease-in Handover]
platform_version: "BIP"
source_type: community-api-docs
---

# 租入交接详情查询

>  请求方式	POST | Lease-in Handover (GAM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/am/rentindivertcard/detail
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
id	string	否	是	租入交接主表主键 示例：123456789

## 3. 请求示例

Url: /yonbip/am/rentindivertcard/detail?access_token=访问令牌
Body: {
	"id": "123456789"
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
code	string	否	返回编码 示例：200
message	string	否	返回信息
data	object	否	返回数据
pk_recorder	string	否	经办人 示例：1550101208145854470
synergy	boolean	否	是否协同 示例：false
masterOrgKeyField	string	否	主组织 示例：pk_org
pk_org	string	否	承租组织 示例：1549232937556246532
pk_transitype	string	否	交易类型 示例：1547236147129223653
currrate_type	string	否	汇率类型 示例：0000L84AQ6V4GXJ0260000
bill_type	string	否	单据类型 示例：4A3Z
id	string	否	租入交接主表id 示例：1663619684850204675
pk_currency	string	否	本币币种 示例：1554417083326922764
audittime	string	否	审核时间 示例：2023-02-20 13:27:04
sysid	string	否	系统标识 示例：LIM
isWfControlled	boolean	否	是否审批流控制 示例：false
origcurrtypeid	string	否	币种 示例：1554417083326922764
contract_way	long	否	租赁方式 示例：0
pk_record_date	string	否	经办日期 示例：2023-02-20
pk_dept	string	否	经办部门 示例：1550100744281522179
billmaker	string	否	制单人 示例：ffde1766-84ad-4059-abd4-7f1a7c451354
creationtime	string	否	创建时间 示例：2023-02-20 13:27:01
bodyvos	object	是	子表数据
verifystate	long	否	审批状态 示例：2
currrate	long	否	汇率 示例：1
bill_code	string	否	租入交接单号 示例：ZRJJ202302200001
confirmed	boolean	否	协同确认 示例：false
pk_fiorg	string	否	承租会计主体 示例：1549232937556246532
pubts	string	否	时间戳 示例：2023-02-20 13:27:04
creator	string	否	创建人 示例：ffde1766-84ad-4059-abd4-7f1a7c451354
billmaketime	string	否	制单时间 示例：2023-02-20 13:27:01
auditor	string	否	审核人 示例：ffde1766-84ad-4059-abd4-7f1a7c451354
bill_status	long	否	单据状态 示例：1
currrate_date	string	否	汇率日期 示例：2023-02-20
transi_type	string	否	交易类型 示例：4A3Z-01
be_synergy	boolean	否	由协同生成 示例：false
customer	string	否	出租方 示例：1585881335139401737

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"pk_recorder": "1550101208145854470",
		"synergy": false,
		"masterOrgKeyField": "pk_org",
		"pk_org": "1549232937556246532",
		"pk_transitype": "1547236147129223653",
		"currrate_type": "0000L84AQ6V4GXJ0260000",
		"bill_type": "4A3Z",
		"id": "1663619684850204675",
		"pk_currency": "1554417083326922764",
		"audittime": "2023-02-20 13:27:04",
		"sysid": "LIM",
		"isWfControlled": false,
		"origcurrtypeid": "1554417083326922764",
		"contract_way": 0,
		"pk_record_date": "2023-02-20",
		"pk_dept": "1550100744281522179",
		"billmaker": "ffde1766-84ad-4059-abd4-7f1a7c451354",
		"creationtime": "2023-02-20 13:27:01",
		"bodyvos": [
			{
				"src_pk_bill": "1663619289713213448",
				"src_bill_type": "4A3A",
				"pk_usedorg": "1549232937556246532",
				"rental_unit": "2",
				"rental_period": 1,
				"planned_return_date": "2023-03-12",
				"cycle_rent": 555,
				"src_pk_bill_b": "1663619289713213449",
				"less_cycle_rent": 555,
				"equip_code": "LIM20230220000001",
				"rent_count_style": "0",
				"contract_code": "00425",
				"payment_period": 1,
				"rent_holiday": 2,
				"id": "1663619684850204676",
				"pubts": "2023-02-20 13:27:02",
				"start_date": "2023-02-22",
				"gather_money": 555,
				"renewed_duration_unit": "0",
				"main_id": "1663619684850204675",
				"equip_name": "11",
				"contract_name": "00425",
				"renewed_duration": 0,
				"rent_cycle_scheme": "0",
				"contract_bill_code": "ZRHT202302200001",
				"return_flag": false,
				"lease_in_date": "2023-02-20"
			}
		],
		"verifystate": 2,
		"currrate": 1,
		"bill_code": "ZRJJ202302200001",
		"confirmed": false,
		"pk_fiorg": "1549232937556246532",
		"pubts": "2023-02-20 13:27:04",
		"creator": "ffde1766-84ad-4059-abd4-7f1a7c451354",
		"billmaketime": "2023-02-20 13:27:01",
		"auditor": "ffde1766-84ad-4059-abd4-7f1a7c451354",
		"bill_status": 1,
		"currrate_date": "2023-02-20",
		"transi_type": "4A3Z-01",
		"be_synergy": false,
		"customer": "1585881335139401737"
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

