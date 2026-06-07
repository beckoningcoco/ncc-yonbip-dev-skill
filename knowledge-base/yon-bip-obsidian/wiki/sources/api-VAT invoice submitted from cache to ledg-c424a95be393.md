---
title: "增值税发票从缓存提交到台账"
apiId: "c424a95be3934273bafb83fc384e6f5c"
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

# 增值税发票从缓存提交到台账

>  请求方式	POST | Input Tax Invoice Management (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/tax/invoiceclient-web/api/reimburseCollection/ncc/submit
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
nsrsbh	string	否	否	纳税人识别号（纳税人识别号和税务组织编码至少传入一项） 示例：1233321233
orgCode	string	否	否	税务组织编码（纳税人识别号和税务组织编码至少传入一项） 示例：org111
busiFlag	string	否	否	业务类型（0：报销台账，1：采购台账） 示例：0
submitter	string	否	是	提交人 示例：ll
invoices	object	是	否	发票信息
fpDm	string	否	是	发票代码 示例：122331111
fpHm	string	否	是	发票号码 示例：12345678
saveToken	string	否	是	发票保存token 示例：12332131xxx
srcBillCode	string	否	否	来源单据编号 示例：ll111
srcBillType	string	否	否	来源业务系统 示例：11
srcSystem	string	否	否	来源系统(默认接口传入为api，三方可以自定义传入) 示例：api
contractId	string	否	否	合同ID 示例：123
contractNo	string	否	否	合同编号 示例：123
contractName	string	否	否	合同名称 示例：123
billType	string	否	否	发票类型(支持票种invoice,train;空默认为invoice) 示例：train 默认值：invoice

## 3. 请求示例

Url: /yonbip/tax/invoiceclient-web/api/reimburseCollection/ncc/submit?access_token=访问令牌
Body: {
	"nsrsbh": "1233321233",
	"orgCode": "org111",
	"busiFlag": "0",
	"submitter": "ll",
	"invoices": [
		{
			"fpDm": "122331111",
			"fpHm": "12345678",
			"saveToken": "12332131xxx",
			"srcBillCode": "ll111",
			"srcBillType": "11",
			"srcSystem": "api",
			"contractId": "123",
			"contractNo": "123",
			"contractName": "123",
			"billType": "train"
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
code	string	否	操作码 示例：200
message	string	否	信息 示例：操作成功
data	string	否	响应信息
message	string	否	操作信息 示例：操作成功
data	object	是	数据
code	string	否	操作码 示例：0000
msg	string	否	操作信息 示例：操作成功
fpDm	string	否	发票代码 示例：330xxx
fpHm	string	否	发票号码 示例：104xxx
saveToken	string	否	发票保存token 示例：xxxx2

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"code": "0000",
			"msg": "操作成功",
			"fpDm": "330xxx",
			"fpHm": "104xxx",
			"saveToken": "xxxx2"
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
1001	格式错误	检查json格式是否正确
9999	未知错误	根据报错信息处理

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2026-04-10	
新增
请求参数 srcSystem
更新
请求参数 invoices
删除
请求参数 srcapp
修改参数来源系统
	2	2025-09-29	
更新
请求说明
更新
请求参数 nsrsbh
更新
请求参数 orgCode

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

