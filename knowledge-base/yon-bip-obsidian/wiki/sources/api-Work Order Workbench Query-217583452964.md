---
title: "工单工作台查询"
apiId: "2175834529640480772"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Failure/Work Order Workbench"
domain: "MRO"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Failure/Work Order Workbench]
platform_version: "BIP"
source_type: community-api-docs
---

# 工单工作台查询

>  请求方式	POST | Failure/Work Order Workbench (MRO)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/am/aomworkordertablelist/query
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
小数位数:0,最大长度:10	否	是	页数 示例：2 默认值：20
condition	object	否	是	查询条件
simpleVOs	object	是	是	扩展查询条件

## 3. 请求示例

Url: /yonbip/am/aomworkordertablelist/query?access_token=访问令牌
Body: {
	"page": {
		"pageIndex": 1,
		"pageSize": 2
	},
	"condition": {
		"simpleVOs": [
			{
				"field": "id",
				"op": "eq",
				"value1": "2174405697012236289"
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
小数位数:0,最大长度:10	否	返回编码 示例：200
message	string	否	返回信息 示例：操作成功！
data	object	否	返回数据
pageIndex	number
小数位数:0,最大长度:10	否	页码 示例：1
pageSize	number
小数位数:0,最大长度:10	否	每页码数 示例：3000
recordCount	number
小数位数:0,最大长度:10	否	记录数 示例：1
recordList	object	是	返回数据
sumRecordList	string	否	sumRecordList
pageCount	number
小数位数:0,最大长度:10	否	pageCount 示例：1
beginPageIndex	number
小数位数:0,最大长度:10	否	beginPageIndex 示例：1
endPageIndex	number
小数位数:0,最大长度:10	否	endPageIndex 示例：1
pubts	string	否	pubts
errorDetail	string	否	errorDetail

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功！",
	"data": {
		"pageIndex": 1,
		"pageSize": 3000,
		"recordCount": 1,
		"recordList": [
			{
				"src_pk_bill": "2174264521524772873",
				"src_bill_type": "5B03",
				"pk_mandept__name": "营销部门",
				"bill_code": "SJSQ202501080001",
				"pk_usedept": "2099319352248500228",
				"pk_user": "2117175472615325696",
				"pk_mandept": "2099319352248500228",
				"pk_org": "2099319085960527881",
				"repair_obj": "技术参数资产0108-1418",
				"fault_content": "升级原因",
				"pk_equip__equip_code": "ZC-202501080001",
				"fault_time": "2025-01-08 00:00:00",
				"pk_maintainorg__name": "全职能组织",
				"src_pk_transitype__name": "升级申请",
				"id": "2174405697012236289",
				"pubts": "2025-01-08 19:02:19",
				"pk_user__name": "刘龙",
				"fault_discoverer": "2117175472615325696",
				"failure_flag": false,
				"pk_category__category_name": "自动化_资产类别2222_技术参数",
				"sysid": "AOM",
				"pk_org__name": "全职能组织",
				"pk_maintainorg": "2099319085960527881",
				"wo_flag": false,
				"pk_category": "2087318844261007369",
				"src_transitype": "5B03-01",
				"pk_equip": "2174260209374461953",
				"fault_discoverer__name": "刘龙",
				"pk_equip__equip_name": "技术参数资产0108-1418",
				"src_pk_transitype": "2086855417276137504",
				"pk_usedept__name": "营销部门"
			}
		],
		"sumRecordList": "",
		"pageCount": 1,
		"beginPageIndex": 1,
		"endPageIndex": 1,
		"pubts": ""
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
暂时没有数据哦~

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

