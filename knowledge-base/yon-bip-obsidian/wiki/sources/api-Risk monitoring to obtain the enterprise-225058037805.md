---
title: "风险监控获取企业监控列表"
apiId: "2250580378051411971"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Enterprise Portrait"
domain: "YYZDX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Enterprise Portrait]
platform_version: "BIP"
source_type: community-api-docs
---

# 风险监控获取企业监控列表

>  请求方式	POST | Enterprise Portrait (YYZDX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/aipaas/intellid/api/risk/company/monitorList
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
startChangeDate	string	否	否	开始日期yyyy-MM-dd 示例：2021-11-01
endChangeDate	string	否	否	结束日期yyyy-MM-dd 示例：2023-11-01
companyName	string	否	否	过滤关键字(企业名称） 示例：有限公司
riskLevel	number
小数位数:1,最大长度:10	否	否	风险级别 不选1:提示 2:警示 3:高风险默认全部， 示例：1
pageNum	number
小数位数:1,最大长度:10	否	否	页码数 示例：1 默认值：1
pageSize	number
小数位数:1,最大长度:10	否	否	分页大小，默认20，最大1000 示例：20 默认值：20

## 3. 请求示例

Url: /yonbip/aipaas/intellid/api/risk/company/monitorList?access_token=访问令牌
Body: {
	"startChangeDate": "2021-11-01",
	"endChangeDate": "2023-11-01",
	"companyName": "有限公司",
	"riskLevel": 1,
	"pageNum": 1,
	"pageSize": 20
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
小数位数:1,最大长度:10	否	接口状态 示例：200
total	number
小数位数:1,最大长度:10	否	总数 示例：10
data	object	是	数据
id	number
小数位数:1,最大长度:36	否	主键（数据库） 示例：2040949501217210373
pkRiskSub	string	否	关联主键 示例：8022c851-68c4-4cc7-8388-6fb1a12f92c3
userId	string	否	用户id 示例：95fe0257-6ba2-46b1-807a-cfcb1cadbec1
tenantId	string	否	租户id 示例：qyic111
companyId	string	否	企业id 示例：dd872327d13418fcc8cff2a726e613fc
companyName	string	否	企业名称 示例：北京百度网讯科技有限公司
riskCount	number
小数位数:1,最大长度:10	否	总数 示例：10
alertCount	number
小数位数:1,最大长度:10	否	提示数量（统计订阅日期之后的数量） 示例：2
warningCount	number
小数位数:1,最大长度:10	否	警示数量（统计订阅日期之后的数量） 示例：5
highRiskCount	number
小数位数:1,最大长度:10	否	高风险数量（统计订阅日期之后的数量） 示例：3
subDate	string	否	订阅日期 示例：2023-07-18
changeDate	string	否	最新变动日期 示例：2025-04-16

## 5. 正确返回示例

{
	"code": 200,
	"total": 10,
	"data": [
		{
			"id": 2040949501217210373,
			"pkRiskSub": "8022c851-68c4-4cc7-8388-6fb1a12f92c3",
			"userId": "95fe0257-6ba2-46b1-807a-cfcb1cadbec1",
			"tenantId": "qyic111",
			"companyId": "dd872327d13418fcc8cff2a726e613fc",
			"companyName": "北京百度网讯科技有限公司",
			"riskCount": 10,
			"alertCount": 2,
			"warningCount": 5,
			"highRiskCount": 3,
			"subDate": "2023-07-18",
			"changeDate": "2025-04-16"
		}
	]
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

