---
title: "租入发票列表查询"
apiId: "1663509725197107205"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Lease-in Invoice"
domain: "GAM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Lease-in Invoice]
platform_version: "BIP"
source_type: community-api-docs
---

# 租入发票列表查询

>  请求方式	POST | Lease-in Invoice (GAM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/am/rentinbilllist/query
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
pageIndex	int	否	是	页号 示例：1 默认值：1
pageSize	int	否	是	页数 示例：2 默认值：2
isSum	boolean	否	否	查询表头 示例：false 默认值：false

## 3. 请求示例

Url: /yonbip/am/rentinbilllist/query?access_token=访问令牌
Body: {
	"condition": {
		"simpleVOs": [
			{
				"field": "pk_org",
				"op": "eq",
				"value1": "1503953777564581889"
			}
		]
	},
	"page": {
		"pageIndex": 1,
		"pageSize": 2
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
code	string	否	返回编码 示例：200
message	string	否	返回信息 示例：操作成功！
data	object	否	返回数据
pageIndex	long	否	页码 示例：1
pageSize	long	否	每条页数 示例：2
recordCount	long	否	记录数 示例：5
recordList	object	是	返回数据
beginPageIndex	long	否	起始页 示例：1
endPageIndex	long	否	结束页 示例：2
pubts	string	否	时间戳
pageCount	long	否	页数 示例：1

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功！",
	"data": {
		"pageIndex": 1,
		"pageSize": 2,
		"recordCount": 5,
		"recordList": [
			{
				"pk_recorder": "1523988279527473153",
				"bodyvos__rent_tax": 0.50246305,
				"total_cost": 34,
				"bodyvos__bill_date": "2023-02-22",
				"contract_id": "1653130919553269770",
				"modifier": "2f847281-6e57-4d90-85b7-0cc149d37667",
				"pk_recorder_date": "2023-02-20",
				"billdetailed__bill_num": "111111",
				"bill_code_rent_in": "ZRFP202302200002",
				"customer_out__name": "北大荒",
				"pk_org": "1520504537049202694",
				"bodyvos__bill_num": "111111",
				"billdetailed__tax_id": "1515209314829074476",
				"taxpayer_code_in": "NS.No1",
				"pk_transitype": "1515209332007895434",
				"bill_type": "4ALM",
				"id": "1663693816073289730",
				"sysid": "LIM",
				"pk_org__name": "HT-Org-0804",
				"origcurrtypeid": "1515209314829074453",
				"isWfControlled": false,
				"origcurrtypeid__priceDigit": 8,
				"total_tax": 0.50246305,
				"billmaker__name": "昵称-gonghtk-daily",
				"modifier__name": "昵称-gonghtk-daily",
				"pk_recorder__name": "Ght-rent",
				"contract_id__contract_name": "外部快捷-gmq-1",
				"billdetailed__rental_unit": 34,
				"billmaker": "2f847281-6e57-4d90-85b7-0cc149d37667",
				"origcurrtypeid__moneyDigit": 8,
				"pk_fiorg__name": "HT-Org-0804",
				"contract_id__bill_code": "ZRHT202302060001",
				"src_pk_bill": "1653130919553269770",
				"billdetailed__rent_cost": 34,
				"verifystate": 0,
				"customer_out": 1520598261748465700,
				"pk_mandept__name": "HT集团资产租赁部",
				"billdetailedid": "1663693816073289732",
				"pk_mandept": "1523987643874410497",
				"rent_phone_in": "15901107561",
				"bodyvos__check_code": "222",
				"modifiedtime": "2023-02-20 15:52:44",
				"pk_fiorg": "1520504537049202694",
				"rent_address_in": "beiqing",
				"merge_tax": 34.50246305,
				"pubts": "2023-02-20 15:52:45",
				"bodyvosid": "1663693816073289731",
				"billmaketime": "2023-02-20 15:50:51",
				"billdetailed__num": "1",
				"origcurrtypeid__name": "人民币",
				"bodyvos__merge_tax": 34.50246305,
				"contract_id__contract_code": "外部快捷-gmq-1",
				"bill_status": 0,
				"transi_type": "4ALM-01",
				"bodyvos__rent_cost": 34,
				"billdetailed__rent_tax": 0.50246305
			}
		],
		"beginPageIndex": 1,
		"endPageIndex": 2,
		"pubts": "",
		"pageCount": 1
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
999	报错具体提示信息，例如：条件项错误，请输入条件项；条件值错误，条件值类型为数组；条件项错误，条件项允许值：id(员工主键)、code(员工编码)、email(员工邮箱)、mobile(员工手机号)；条件项错误，无合法的条件，请核对；	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-25	
更新
请求说明

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

