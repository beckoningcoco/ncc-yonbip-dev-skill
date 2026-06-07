---
title: "完工报告行打开"
apiId: "2339833586646515720"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Completion Report"
domain: "MF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Completion Report]
platform_version: "BIP"
source_type: community-api-docs
---

# 完工报告行打开

>  请求方式	POST | Completion Report (MF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/MFC/productionorder/finishedreport/lineopen
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
data	object	否	是	业务数据
id	number
小数位数:0,最大长度:19	否	否	完工报告Id 示例：2211732336611584
code	string	否	否	完工报告编码 示例：MOSQ201911020003
finishedReportDetail	object	否	是	完工报告明细

## 3. 请求示例

Url: /yonbip/MFC/productionorder/finishedreport/lineopen?access_token=访问令牌
Body: {
	"data": {
		"id": 2211732336611584,
		"code": "MOSQ201911020003",
		"finishedReportDetail": {
			"id": 2211732336611585
		}
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
code	number
小数位数:0,最大长度:10	否	code 示例：200
message	string	否	message 示例：操作成功
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
data	object	否	data
id	string	否	id 示例：2347088078558461957
finishedReportDetail	object	是	finishedReportDetail
verifystate	number
小数位数:0,最大长度:10	否	verifystate 示例：2
code	string	否	code 示例：WGBG20250829000012
isWfControlled	boolean	否	isWfControlled 示例：false
transTypeId	string	否	transTypeId 示例：1997611082204054637
pubts	string	否	pubts 示例：2025-09-02 15:43:19
orgId	string	否	orgId 示例：1997658713415483401
status	number
小数位数:0,最大长度:10	否	status 示例：1
tenant	number
小数位数:0,最大长度:16	否	tenant 示例：3810139460769744
ytenant	string	否	ytenant 示例：0000LW7EPOWEFP19MR0000
traceId	string	否	traceId 示例：55189bc8a9f2413a
uploadable	string	否	uploadable 示例：0

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"id": "2347088078558461957",
		"finishedReportDetail": [
			{
				"id": "2347088078558461958",
				"isClose": 0,
				"ytenant": "0000LW7EPOWEFP19MR0000"
			}
		],
		"verifystate": 2,
		"code": "WGBG20250829000012",
		"isWfControlled": false,
		"transTypeId": "1997611082204054637",
		"pubts": "2025-09-02 15:43:19",
		"orgId": "1997658713415483401",
		"status": 1,
		"tenant": 3810139460769744,
		"ytenant": "0000LW7EPOWEFP19MR0000"
	},
	"traceId": "55189bc8a9f2413a",
	"uploadable": "0"
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
999	取决于错误类型，不同错误信息不同	

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

