---
title: "租入合同列表查询"
apiId: "1899729103976136711"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Lease-in Contract"
domain: "GAM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Lease-in Contract]
platform_version: "BIP"
source_type: community-api-docs
---

# 租入合同列表查询

>  请求方式	POST | Lease-in Contract (GAM)


## 1. 通过OpenAPI支持查询租入合同列表。


## 2. 支持按照租入合同ID查询租入合同（支持逐个查询及批量查询）；


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/am/rentinlist/query
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
condition	object	否	否	查询条件组
simpleVOs	object	是	否	扩展查询条件
page	object	否	是	分页
pageIndex	long	否	是	页号 示例：1
pageSize	long	否	是	页数 示例：2

## 3. 请求示例

Url: /yonbip/am/rentinlist/query?access_token=访问令牌
Body: {
	"condition": {
		"simpleVOs": [
			{
				"field": "id",
				"op": "in",
				"value1": [
					145700568741078
				]
			}
		]
	},
	"page": {
		"pageIndex": 1,
		"pageSize": 2
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
code	string	否	返回编码 示例：200
message	string	否	返回信息 示例：操作成功！
data	object	否	返回数据
pageIndex	long	否	页码 示例：1
pageSize	long	否	每页条数 示例：20
recordCount	long	否	记录数 示例：1
recordList	object	是	返回数据
beginPageIndex	long	否	起始页 示例：1
endPageIndex	long	否	结束页 示例：1
pageCount	long	否	总页数 示例：1

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功！",
	"data": {
		"pageIndex": 1,
		"pageSize": 20,
		"recordCount": 1,
		"recordList": [
			{
				"pk_org": "1576069637083758602",
				"pk_org__name": "HT-Org-0816",
				"customer": 1624372892263776300,
				"customer__name": "HT西西",
				"bill_code": "ZRHT202305100006",
				"contract_code": "20250510yll",
				"contract_name": "20250510yll",
				"bill_status": 0,
				"contract_code_v": 1,
				"contract_way": 0,
				"synergy": false,
				"signed_date": "2023-05-10",
				"pk_jobmngfil": "1564192317323083821",
				"pk_jobmngfil__name": "工单项目",
				"pk_fiorg": "1576069637083758602",
				"pk_fiorg__name": "HT-Org-0816",
				"pk_raorg": "1633838622225989635",
				"pk_costcenter_in": 1596153410953412600,
				"pk_raorg__name": "HT租赁利润中心",
				"pk_costcenter_in__name": "HT租赁成本中心",
				"pk_record_dept": "1593179137504182280",
				"pk_recorder__name": "HT-rent",
				"pk_recorder": "1601196174997979137",
				"pk_record_dept__name": "租赁部门",
				"pk_record_date": "2023-05-10",
				"pk_org_out": "1576069637083758602",
				"pk_org_out__name": "HT-Org-0816",
				"pk_raorg_out": "1354235345435435",
				"pk_raorg_out__name": "利润中心",
				"beginning_of_period": false,
				"plan_effective_date": "2023-05-10",
				"plan_end_date": "2023-05-26",
				"pk_currency": "1524173469914759191",
				"pk_currency__name": "人民币",
				"pk_currency__digit": 8,
				"origcurrtypeid": "1524173469914759191",
				"origcurrtypeid__digit": 8,
				"origcurrtypeid__name": "人民币",
				"currrate_type": "0000L6VWE12DH6JBPJ0000",
				"currrate_type__digit": 6,
				"currrate": 1,
				"currrate_type__name": "基准汇率",
				"currrate_date": "2023-05-10",
				"deposit_recovery_currency": 0,
				"deposit_recovery": 0,
				"deposit": 21,
				"deposit_currency": 21,
				"notaxcalculate_rent": 0,
				"settlement_amount_tax_currency": 0,
				"notaxsettlement_amount": 0,
				"calculate_rent_tax_currency": 0,
				"calculate_rent_tax": 0,
				"settlement_amount_currency": 0,
				"calculate_rent_currency": 0,
				"notaxcalculate_rent_currency": 0,
				"settlement_amount": 123,
				"settlement_amount_tax": 0,
				"customer_out": 1627926342053920800,
				"customer_out__name": "HT大供应商",
				"contract_v": true,
				"cycle": 17,
				"id": "1722265736807710723",
				"creator": "2f847281-6e57-4d90-85b7-0cc149d37667",
				"creator__name": "昵称-gonghtk-daily",
				"creationtime": "2023-05-10 13:55:20",
				"billmaker": "2f847281-6e57-4d90-85b7-0cc149d37667",
				"billmaker__name": "昵称-gonghtk-daily",
				"billmaketime": "2023-05-10 13:55:20",
				"bill_type": "4A3A",
				"sysid": "LIM",
				"isWfControlled": false,
				"verifystate": 0,
				"pk_transitype": "1524173469928391522",
				"transi_type": "4A3A-01",
				"confirmed": false,
				"pk_identify_user__name": "14324354354354353",
				"pk_identify_user": "1435345435435435",
				"identify_date": "2023-05-10",
				"confirmation_description": "确认说明",
				"memo": "备注",
				"pubts": "",
				"auditor": "2f847281-6e57-4d90-85b7-0cc149d37667",
				"auditor__name": "审核人",
				"audittime": "2023-05-10",
				"effective_date": "2023-05-10",
				"modifier": "2f847281-6e57-4d90-85b7-0cc149d37667",
				"modifier__name": "修改人",
				"returncount": 0,
				"src_bill_type": "4A3B",
				"src_pk_bill": ""
			}
		],
		"beginPageIndex": 1,
		"endPageIndex": 1,
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

