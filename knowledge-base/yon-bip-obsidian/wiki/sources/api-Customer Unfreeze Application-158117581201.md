---
title: "客户解冻申请"
apiId: "1581175812014997504"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Customer Freeze Application"
domain: "CRM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Customer Freeze Application]
platform_version: "BIP"
source_type: community-api-docs
---

# 客户解冻申请

>  请求方式	POST | Customer Freeze Application (CRM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/crm/cust/jiedongcust
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
data	object	否	是	请求参数数据
code	string	否	否	申请编码 示例：2022102600013
applyDate	string	否	是	申请时间 示例：2022-10-26
ower	string	否	是	申请人，支持id或者code传入 示例：1539575789486342160
org	string	否	是	申请组织，支持id或者code传入 示例：1539574105860210697
dept	string	否	否	申请部门，支持id或者code传入 示例：1539574853184520196
saleArea	string	否	否	申请销售区域,支持id或者code传入 示例：1563492907575934979
effectType	long	否	是	生效类型；0-立即生效，1-未来生效 示例：0
effectStatus	long	否	是	生效状态；0-未处理，1-处理中，2-成功，3-失败 示例：0
effectDate	string	否	是	生效时间，在生效类型是未来生效输入未来一个时间点，在立即生效时输入当前时间。 示例：2022-10-26 18:26:07
applyDesc	string	否	否	备注 示例：备注信息
applyType	long	否	是	申请类型；解冻为0，0-解冻 示例：0
_status	string	否	是	主单据状态 示例：Insert
saveAndAudit	boolean	否	是	是否保存并审核通过；true为默认值；true-保存并直接审核通过；false-只保存数据为开立态，不会进行审核。 示例：true
customerthawItemList	object	是	否	解冻申请明细

## 3. 请求示例

Url: /yonbip/crm/cust/jiedongcust?access_token=访问令牌
Body: {
	"data": {
		"code": "2022102600013",
		"applyDate": "2022-10-26",
		"ower": "1539575789486342160",
		"org": "1539574105860210697",
		"dept": "1539574853184520196",
		"saleArea": "1563492907575934979",
		"effectType": 0,
		"effectStatus": 0,
		"effectDate": "2022-10-26 18:26:07",
		"applyDesc": "备注信息",
		"applyType": 0,
		"_status": "Insert",
		"saveAndAudit": true,
		"customerthawItemList": [
			{
				"thawOrg": "1873789966810611716",
				"thawCustomer": "1546525948524363779",
				"thawLink": "1529466853806047257",
				"effectRange": 0,
				"thawItemReason": "解冻了",
				"_status": "Insert"
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
code	string	否	返回代码 示例：200
message	string	否	返回消息 示例：操作成功
data	object	否	返回数据
code	string	否	申请编码 示例：20221024-560024
applyType	long	否	申请类型，具体含义参考入参 示例：1
applyDate	string	否	申请时间 示例：2022-10-24 00:00:00
ower	string	否	申请人 示例：2603881034092800
org	string	否	申请组织ID 示例：2603872696799488
dept	string	否	申请部门ID 示例：2603874896122112
saleArea	long	否	申请区域ID 示例：2603899182158592
effectType	long	否	生效类型；0-立即生效，1-未来生效 示例：0
effectStatus	long	否	生效状态；0-未处理，1-处理中，2-成功，3-失败 示例：0
verifystate	long	否	审核状态；0-开立，1-审批中，2-审核成功，3-审核失败 示例：0
isWfControlled	boolean	否	是否接受审批流控制，true-受控制，false-不受控制 示例：true
id	long	否	解冻申请ID 示例：1575395241312649217
pubts	string	否	时间戳 示例：2022-10-24 16:29:05
tenant	long	否	租户ID 示例：2601058755186944
yTenantId	string	否	租户ID 示例：0000KYAY7F959CQUBP0000
customerthawItemList	object	是	解冻申请明细

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"code": "20221024-560024",
		"applyType": 1,
		"applyDate": "2022-10-24 00:00:00",
		"ower": "2603881034092800",
		"org": "2603872696799488",
		"dept": "2603874896122112",
		"saleArea": 2603899182158592,
		"effectType": 0,
		"effectStatus": 0,
		"verifystate": 0,
		"isWfControlled": true,
		"id": 1575395241312649217,
		"pubts": "2022-10-24 16:29:05",
		"tenant": 2601058755186944,
		"yTenantId": "0000KYAY7F959CQUBP0000",
		"customerthawItemList": [
			{
				"thawCustomer": 2611257008673024,
				"thawLink": 1570757406756175891,
				"effectRange": 0,
				"thawItemReason": "解冻原因",
				"id": 1575395241312649218,
				"customerThawApplyId": 1575395241312649217,
				"pubts": "2022-10-24 16:29:04",
				"tenant": 2601058755186944,
				"yTenantId": "0000KYAY7F959CQUBP0000"
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
999	存在已申请但未生效的冻结环节,不可重复申请	选择相同客户不同解冻环节或者选择不同客户重新申请

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

