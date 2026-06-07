---
title: "保存进项企业票夹的票据到台账"
apiId: "1758555538990825480"
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

# 保存进项企业票夹的票据到台账

>  请求方式	POST | Input Tax Invoice Management (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/tax/input-tax/api/bill-collections/save-onlybusicollection
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
nsrsbh	string	否	否	纳税人识别号（纳税人识别号和税务组织编码至少传入一项） 示例：12345
orgcode	string	否	否	税务组织编码（纳税人识别号和会计主体编码至少传入一项） 示例：456
occupationSystemCode	string	否	否	占用系统编码 示例：tax
dzbs	string	否	否	独占标识 0-非独占 1-系统独占 示例：0
submitter	string	否	是	提交人 示例：lyhao
srcBillType	string	否	否	来源单据类型（来源于上游系统，非枚举） 示例：类型1
srcBillCode	string	否	否	来源单据号 示例：124
srcBillid	string	否	否	来源单据id 示例：124
billDate	string	否	否	业务单据制单日期(yyyy-MM-dd) 示例：2023-05-05
busiFlag	long	否	否	业务标识 0：报销；1：采购 示例：0
bills	object	是	是	生成台账的票据信息
billType	string	否	是	票据类型 invoice:增值税发票/tolls:过路费/train:火车票/quota:定额发票/machine:机打发票/taxi:出租车发票/passenger:客运发票/air:航空电子行程单/other:其他发票/nontax:非税发票/custbook:海关缴款书 示例：invoice
reimburseMoney	BigDecimal	否	是	报账金额 示例：123.00
reimburseTax	BigDecimal	否	是	报账税额 示例：1.00
fpDm	string	否	否	发票代码（若有发票代码，则必传；全电发票必须传空字符串） 示例：124
fpHm	string	否	是	发票号码 示例：34789
contractId	string	否	否	合同ID 示例：123
contractNo	string	否	否	合同编号 示例：123
contractName	string	否	否	合同名称 示例：123
free	object	否	否	特征参数

## 3. 请求示例

Url: /yonbip/tax/input-tax/api/bill-collections/save-onlybusicollection?access_token=访问令牌
Body: {
	"nsrsbh": "12345",
	"orgcode": "456",
	"occupationSystemCode": "tax",
	"dzbs": "0",
	"submitter": "lyhao",
	"srcBillType": "类型1",
	"srcBillCode": "124",
	"srcBillid": "124",
	"billDate": "2023-05-05",
	"busiFlag": 0,
	"bills": [
		{
			"billType": "invoice",
			"reimburseMoney": 123,
			"reimburseTax": 1,
			"fpDm": "124",
			"fpHm": "34789"
		}
	],
	"contractId": "123",
	"contractNo": "123",
	"contractName": "123",
	"free": {}
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
code	string	否	状态码 示例：200
message	string	否	信息 示例：操作成功
data	string	否	响应信息
message	string	否	提示信息 示例：操作成功
data	object	是	返回信息
fpDm	string	否	发票代码（发票没有发票代码，则不返回） 示例：12456
fpHm	string	否	发票号码 示例：12456
code	string	否	状态码 示例：0000
msg	string	否	提示信息 示例：操作成功
suspectRule	string	否	疑票规则（当发票不触发疑票规则的时候，响应里无suspectRule参数） 示例：规则1
id	string	否	台账id 示例：12567

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"fpDm": "12456",
			"fpHm": "12456",
			"code": "0000",
			"msg": "操作成功",
			"suspectRule": "规则1",
			"id": "12567"
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
	1	2026-04-11	
更新
请求参数 free
返回体插件配置
	2	2025-09-29	
更新
请求参数 nsrsbh
更新
请求参数 orgcode

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

