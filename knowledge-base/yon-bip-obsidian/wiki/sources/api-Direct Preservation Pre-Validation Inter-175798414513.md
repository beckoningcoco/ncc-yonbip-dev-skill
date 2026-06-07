---
title: "全票种直接保存预校验接口"
apiId: "1757984145135894531"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Input Tax Invoice Management"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Input Tax Invoice Management]
platform_version: "BIP"
source_type: community-api-docs
---

# 全票种直接保存预校验接口

>  请求方式	POST | Input Tax Invoice Management (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/tax/input-tax/api/bill-collections/pre-validate
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
orgcode	string	否	否	税务组织编码（validateRule为“Y"时，税务组织编码不能为空） 示例：1245
validateUniqe	string	否	否	是否检查唯一性（Y-是；N-否） 示例：Y 默认值：Y
validateRule	string	否	是	是否检查合规性（Y-是；N-否 示例：Y 默认值：Y
validateReimburseMoney	string	否	否	是否检查累计报账价税合计 （ Y-是； N-否） 示例：Y 默认值：Y
saveMode	string	否	否	保存模式 0:同时保存票据和台账;2:从票据中心保存到台账 示例：0 默认值：0
bills	object	是	是	票据列表
billType	string	否	是	票据类型 invoice:增值税发票/tolls:过路费/train:火车票/quota:定额发票/machine:机打发票/taxi:出租车发票/passenger:客运发票/air:航空电子行程单/other:其他发票/nontax:非税发票/custbook:海关缴款书 示例：invoice
data	object	否	否	各票种json(action=0时必填），详见fapiao.yonyoucloud.com/apidoc/appendix 示例：各票种json，详见fapiao.yonyoucloud.com/apidoc/appendix
reimburseMoney	BigDecimal	否	否	报账价税合计 示例：100.89
reimburseTax	BigDecimal	否	否	报账税额 示例：12.897
invoiceCode	string	否	否	发票代码 示例：123
invoiceNum	string	否	否	发票号码(action=1时必填） 示例：123
fkNumber	string	否	否	发票号码(费控专用,action=1且发票类型为数电火车票必传) 示例：113
receiptNumber	string	否	否	发票号码(费控专用,action=1且发票类型为数电航空票必传) 示例：123
airType	string	否	否	航空票类型(费控专用,action=1且发票类型为数电航空票必传 1:纸票 2:数电票) 示例：2
action	string	否	否	动作(1:删除判断，不做实际删除动作，可以删除则返回成功，不允许删除返回失败，并返回失败原因;0:保存判断，不做实际保存动作，可以保存则返回成功，不允许保存返回失败，并返回失败原因;默认值:0) 示例：0 默认值：0
toReimburse	string	否	否	是否进行完成报账(Y:是 N:否） 示例：Y 默认值：N
rollOutBills	object	是	否	转出列表
billType	string	否	否	发票类型 示例：invoice
fpDm	string	否	否	发票代码 示例：123456789
fpHm	string	否	否	发票号码 示例：12345
fkNumber	string	否	否	发票号码(费控专用） 示例：12345
operator	string	否	否	操作员 示例：zhansan
outDate	string	否	否	转出日期 示例：2025-01-01
outMoney	number
小数位数:2,最大长度:10	否	否	转出税额
reason	string	否	否	转出原因
vnote	string	否	否	备注
voucherId	string	否	否	凭证号
voucherAccId	string	否	否	凭证号ID
srcBillcode	string	否	否	来源单据号
airType	string	否	否	机票类型
receiptNumber	string	否	否	行程单号码
checkCode	string	否	否	验证码
trainType	string	否	否	火车票类型
reimburseUser	string	否	否	报账人 示例：zhangsan
reimburseDate	string	否	否	报账日期 示例：2025-01-01
vnote	string	否	否	报账备注 示例：备注
srcBillType	string	否	否	来源单据类型 示例：1234
srcBillCode	string	否	否	来源单据号码 示例：1234
srcBillid	string	否	否	来源单据id 示例：1234

## 3. 请求示例

Url: /yonbip/tax/input-tax/api/bill-collections/pre-validate?access_token=访问令牌
Body: {
	"orgcode": "1245",
	"validateUniqe": "Y",
	"validateRule": "Y",
	"validateReimburseMoney": "Y",
	"saveMode": "0",
	"bills": [
		{
			"billType": "invoice",
			"data": "各票种json，详见fapiao.yonyoucloud.com/apidoc/appendix",
			"reimburseMoney": 100.89,
			"reimburseTax": 12.897,
			"invoiceCode": "123",
			"invoiceNum": "123",
			"fkNumber": "113",
			"receiptNumber": "123",
			"airType": "2"
		}
	],
	"action": "0",
	"toReimburse": "Y",
	"rollOutBills": [
		{
			"billType": "invoice",
			"fpDm": "123456789",
			"fpHm": "12345",
			"fkNumber": "12345",
			"operator": "zhansan",
			"outDate": "2025-01-01",
			"outMoney": 0,
			"reason": "",
			"vnote": "",
			"voucherId": "",
			"voucherAccId": "",
			"srcBillcode": "",
			"airType": "",
			"receiptNumber": "",
			"checkCode": "",
			"trainType": ""
		}
	],
	"reimburseUser": "zhangsan",
	"reimburseDate": "2025-01-01",
	"vnote": "备注",
	"srcBillType": "1234",
	"srcBillCode": "1234",
	"srcBillid": "1234"
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
code	string	否	code 示例：200
message	string	否	信息 示例：操作成功
data	string	否	响应信息
message	string	否	message 示例：操作成功
data	object	是	data
ruleDtoList	object	是	规则的执行情况真正触发的结果集
ruleActList	object	是	执行过的规则
invoiceNum	string	否	发票号码 示例：24652000000023031494
invoiceCode	string	否	发票代码
businessObj	string	否	业务对象名称 示例：进项电子票据-增值税发票

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"ruleDtoList": [
				{
					"validateResult": true,
					"processMethod": "2",
					"defineHint": "aaaaaaaaaaa",
					"ruleName": "谊票",
					"ruleProgramName": "555888规则",
					"rejuctReason": "aaaaaaaaaaa",
					"checkStatus": true,
					"resultFieldAndValues": {
						"gmfMc": [
							"aa",
							"aa"
						]
					}
				}
			],
			"ruleActList": [
				{
					"validateResult": true,
					"processMethod": "2",
					"defineHint": "aaaaaaaaaaa",
					"ruleName": "谊票",
					"ruleProgramName": "555888规则",
					"rejuctReason": "aaaaaaaaaaa",
					"checkStatus": true,
					"resultFieldAndValues": {
						"gmfMc": [
							"aa",
							"aa"
						]
					},
					"ruleAffiliatedPOS": [
						""
					]
				}
			],
			"invoiceNum": "24652000000023031494",
			"invoiceCode": "",
			"businessObj": "进项电子票据-增值税发票"
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
9999	未知错误	按返回信息处理

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-09-29	
更新
请求说明
新增
请求参数 (30)
更新
请求参数 orgcode
更新
请求参数 data
	2	2025-07-03	
新增
返回参数 (24)
更新
返回参数 code
更新
返回参数 message
更新
返回参数 data

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

