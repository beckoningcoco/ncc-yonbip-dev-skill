---
title: "电子签hub个人实名银行卡四要素验证"
apiId: "2275255145583345673"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "E-signature Configuration"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, E-signature Configuration]
platform_version: "BIP"
source_type: community-api-docs
---

# 电子签hub个人实名银行卡四要素验证

>  请求方式	POST | E-signature Configuration (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/id/identity/verify/v1/bank4Element
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
accountId	string	否	否	待认证电子签用户ID，与uniqueId有一非空，都有值以accountId为准 示例：56db221228ec205f6f98f7cf18b50116
uniqueId	string	否	否	待认证电子签用户业务系统方关联的唯一用户ID 示例：123123
idCardNumber	string	否	是	待认证电子签用户办理银行卡时预留身份证号 示例：220323***********0
userName	string	否	是	待认证电子签用户办理银行卡时预留姓名 示例：张三
bankCardNumber	string	否	是	待认证电子签用户银行卡号 示例：银行卡号
mobile	string	否	是	待认证电子签用户办理银行卡时预留手机号 示例：13311112222
verifyCode	string	否	是	短信验证码，使用接口【电子签发送短信验证码】发送的短信 示例：123123
cardType	string	否	否	办理银行卡时使用的证件类型，默认：1（身份证），2：护照，3：港澳证，4：台胞证，5：军官证，6：回乡证 示例：1

## 3. 请求示例

Url: /yonbip/id/identity/verify/v1/bank4Element?access_token=访问令牌
Body: {
	"accountId": "56db221228ec205f6f98f7cf18b50116",
	"uniqueId": "123123",
	"idCardNumber": "220323***********0",
	"userName": "张三",
	"bankCardNumber": "银行卡号",
	"mobile": "13311112222",
	"verifyCode": "123123",
	"cardType": "1"
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
code	string	否	响应码 示例：200
message	string	否	响应信息 示例：success
data	object	否	响应数据
flowId	string	否	验证流水号 示例：123123123

## 5. 正确返回示例

{
	"code": "200",
	"message": "success",
	"data": {
		"flowId": "123123123"
	}
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
暂时没有数据哦~

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-08-15	
更新
请求说明

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

