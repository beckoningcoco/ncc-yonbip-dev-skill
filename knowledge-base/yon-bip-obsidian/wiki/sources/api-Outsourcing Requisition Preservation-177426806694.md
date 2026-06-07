---
title: "委外申请列表查询"
apiId: "1774268066943205382"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Outsourcing maintenance application"
domain: "MRO"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Outsourcing maintenance application]
platform_version: "BIP"
source_type: community-api-docs
---

# 委外申请列表查询

>  请求方式	POST | Outsourcing maintenance application (MRO)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/am/ommexworkapplylist/query
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
pageIndex	long	否	是	当前页码，数据范围：正整数 示例：1 默认值：1
pageSize	long	否	是	每页大小，不允许超过最大阈值（默认500），数据范围：1-500 示例：20 默认值：20
queryOrders	object	是	否	排序参数
field	string	否	否	排序字段
order	string	否	否	排序顺序：正序ASC，倒序：DESC

## 3. 请求示例

Url: /yonbip/am/ommexworkapplylist/query?access_token=访问令牌
Body: {
	"condition": {
		"simpleVOs": [
			{
				"field": "id",
				"op": "in",
				"value1": {}
			}
		]
	},
	"page": {
		"pageIndex": 1,
		"pageSize": 20
	},
	"queryOrders": [
		{
			"field": "",
			"order": ""
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
code	long	否	返回编码 示例：200
message	string	否	返回信息 示例：操作成功！
data	object	否	返回数据
pageIndex	long	否	页码 示例：1
pageSize	long	否	每页条数 示例：20
recordCount	long	否	记录数 示例：1
recordList	object	是	返回数据
pageCount	long	否	总页数 示例：1
beginPageIndex	long	否	起始页 示例：1
endPageIndex	long	否	结束页 示例：1

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
				"bodyvos_consign_ensure_person": "d4a2a1e7-2749-43d7-8d67-e5bfa7a51f44",
				"pk_apply_dept": "1795743238428033032",
				"bodyvos_close_flag": false,
				"bodyvos_consign_ensure_person__name": "昵称-白璇",
				"bodyvos_urgent": 0,
				"pk_org": "1795743032269602824",
				"plantotalcost": 1,
				"apply_date": "2023-09-21",
				"pk_transitype": "1785361014001238585",
				"bodyvos_repairnum": 1,
				"id": "1821612178644926464",
				"bodyvos_iscontract": 0,
				"nversion": 1,
				"pk_apply_dept__name": "移动部门",
				"isWfControlled": 0,
				"pk_org__name": "bx-维修组织",
				"pk_transitype__name": "委外申请",
				"bodyvos_num": 1,
				"bodyvos_repair_obj_name": "1",
				"bodyvos_plancost": 1,
				"bodyvos_consign_ensure_time": "2023-09-21 10:32:32",
				"bodyvos_repair_content": "1",
				"returncount": 0,
				"verifystate": 0,
				"bill_code": "WWSQ202309210001",
				"pk_currtype": "1785361014007531991",
				"pk_currtype__name": "人民币",
				"pk_applyer": "1795744148972634112",
				"pubts": "2023-09-21 10:32:48",
				"bodyvos_consign_ensure": true,
				"consign_content": "1",
				"bill_status": 0,
				"bodyvos_price_org": 1,
				"pk_currtype__priceDigit": 3,
				"pk_currtype__moneyDigit": 2,
				"transi_type": "4C05-01",
				"omm_sign_formal": "0",
				"bodyvos_id": "1821612178644926465",
				"pk_applyer__name": "白璇"
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
999	报错具体提示信息	结合报错提示信息查找原因

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-25	
更新
请求说明
新增
请求参数 queryOrders
新增
请求参数 field
新增
请求参数 order
更新
请求参数 (5)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

