---
title: "维修合同结算列表查询"
apiId: "2095452885346156550"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Outsourced Maintenance Settlement"
domain: "MRO"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Outsourced Maintenance Settlement]
platform_version: "BIP"
source_type: community-api-docs
---

# 维修合同结算列表查询

>  请求方式	POST | Outsourced Maintenance Settlement (MRO)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/am/ommsettlelist/query
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
page	object	否	是	分页
pageIndex	number
小数位数:0,最大长度:10	否	是	页号 示例：1 默认值：1
pageSize	number
小数位数:0,最大长度:10	否	是	页数 示例：20 默认值：20
condition	object	否	否	查询条件
simpleVOs	object	是	否	扩展查询条件
commonVOs	object	是	否	查询区查询条件

## 3. 请求示例

Url: /yonbip/am/ommsettlelist/query?access_token=访问令牌
Body: {
	"page": {
		"pageIndex": 1,
		"pageSize": 20
	},
	"condition": {
		"simpleVOs": [
			{
				"field": "bill_code",
				"op": "like",
				"value1": "WXJS202312130001"
			}
		],
		"commonVOs": [
			{
				"itemName": "",
				"value1": ""
			}
		]
	}
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
小数位数:0,最大长度:10	否	状态码（200：成功，其他：失败） 示例：200
message	string	否	返回信息 示例：操作成功！
data	object	否	返回数据
pageIndex	number
小数位数:0,最大长度:10	否	页码 示例：1
pageSize	number
小数位数:0,最大长度:10	否	页数 示例：20
recordCount	number
小数位数:0,最大长度:10	否	记录数据 示例：1
recordList	object	是	返回记录
sumRecordList	string	否	合并记录
pageCount	number
小数位数:0,最大长度:10	否	分页数 示例：1
beginPageIndex	number
小数位数:0,最大长度:10	否	开始分页 示例：1
endPageIndex	number
小数位数:0,最大长度:10	否	结束分页 示例：1

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
				"pk_fiorg_armt": "1796566360214994954",
				"tax_settle_total_money": 1,
				"settle_type": "1",
				"currrate_type__digit": 7,
				"settle_date": "2023-12-13 00:00:00",
				"pk_org": "1796566360214994954",
				"pk_transitype": "1763914120481473315",
				"pk_fiorg_armt__name": "wml集团",
				"currrate_type": "0000LJPGZ3RX3YAKG10000",
				"received_bill_total_money": 2828.76,
				"handle_date": "2023-12-13 00:00:00",
				"bill_type": "4C08",
				"id": "1883368405193981957",
				"ori_settle_total_tax": 0.01,
				"pk_currency__name": "人民币",
				"pk_currency": "1763914111891537950",
				"isWfControlled": false,
				"pk_org__name": "wml集团",
				"pk_transitype__name": "维修合同结算",
				"ori_currency__name": "人民币",
				"pk_provider__name": "wml供应商",
				"pk_currency__moneyDigit": 2,
				"tax_free_settle_total_money": 0.99,
				"currrate": 1,
				"settle_total_tax": 0.01,
				"ori_currency__moneyDigit": 2,
				"bill_code": "WXJS202312130001",
				"ori_received_bill_total_money": 2828.76,
				"currrate_type__name": "基准汇率",
				"postAccountStatus": 0,
				"ori_currency": "1763914111891537950",
				"ori_tax_free_settle_total_money": 0.99,
				"bill_status": 0,
				"currrate_date": "2023-12-13 00:00:00",
				"ori_tax_settle_total_money": 1,
				"transi_type": "4C08-01",
				"ori_need_bill_total_money": 1,
				"pk_provider": "1796572716778651653",
				"need_bill_total_money": 1
			}
		],
		"sumRecordList": "",
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
999	报错具体提示信息	

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

