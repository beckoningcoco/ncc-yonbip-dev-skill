---
title: "业务核销"
apiId: "1742192993479688192"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Incoming Payment Record"
domain: "SD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Incoming Payment Record]
platform_version: "BIP"
source_type: community-api-docs
---

# 业务核销

>  请求方式	POST | Incoming Payment Record (SD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/api/upayment/verification
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
voucherId	long	否	否	单据id(单据类型为ORDER 时，会校验输入的id是否与订单信息上的一致) 示例：2023052998278774800
voucherNo	string	否	是	单据号 示例：TEST9920230601000014
settlementOrgId	string	否	否	财务组织id（财务组织id与财务组织code不能同时为空，财务组织id和财务组织code同时存在时，以输入的财务组织id为准） 示例：1525653687361339400
settlementOrgId_code	string	否	否	财务组织编码（财务组织id与财务组织code不能同时为空） 示例：qzn1
agentId	long	否	否	客户id（（客户id与客户code不能同时为空，客户id和客户code同时存在时，以输入的客户id为准） 示例：1731076570041286700
agentId_code	string	否	否	客户编码（客户id与客户code不能同时为空） 示例：001
origCurrencyId	string	否	否	币种id（币种id与币种code不能同时为空，币种id和币种code同时存在时，以输入的币种id为准） 示例：1623643074168094746
origCurrencyId_code	string	否	否	币种编码（币种id与币种code不能同时为空） 示例：CNY
voucherType	string	否	是	单据类型(EC 电商订单,ORDER 销售订单,OUTER 其它应收事项) 示例：ORDER
verificationAmount	BigDecimal	否	是	核销金额 示例：1
businessTime	DateTime	否	否	业务时间（单据类型为EC时使用，不输入则取当前时间） 示例：2023-06-01 11:35:16
usePaymentDetailList	object	是	否	来款记录行（单据类型为EC时不支持指定使用）
id	number
小数位数:0,最大长度:36	否	否	来款记录行id（必填） 示例：1623643074168094746
voucherUseMoney	number
小数位数:4,最大长度:10	否	否	本次使用金额（必填） 示例：1

## 3. 请求示例

Url: /yonbip/sd/api/upayment/verification?access_token=访问令牌
Body: [{
	"voucherId": 2023052998278774800,
	"voucherNo": "TEST9920230601000014",
	"settlementOrgId": "1525653687361339400",
	"settlementOrgId_code": "qzn1",
	"agentId": 1731076570041286700,
	"agentId_code": "001",
	"origCurrencyId": "1623643074168094746",
	"origCurrencyId_code": "CNY",
	"voucherType": "ORDER",
	"verificationAmount": 1,
	"businessTime": "2023-06-01 11:35:16",
	"usePaymentDetailList": [
		{
			"id": 1623643074168094746,
			"voucherUseMoney": 1
		}
	]
}]

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
code	string	否	响应状态码 示例："200"
message	string	否	响应信息 示例：操作成功
data	boolean	否	响应数据 示例：true

## 5. 正确返回示例

{
	"code": "\"200\"",
	"message": "操作成功",
	"data": true
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
999	错误信息	请根据提示信息修改

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-25	
新增
请求参数 usePaymentDetailList
新增
请求参数 id
新增
请求参数 voucherUseMoney

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

