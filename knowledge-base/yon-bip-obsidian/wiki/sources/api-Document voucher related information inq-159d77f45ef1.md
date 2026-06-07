---
title: "单据凭证相关信息查询"
apiId: "159d77f45ef14b45add47b5315c1c8fe"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Auto Accounting Instructions"
domain: "FI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Auto Accounting Instructions]
platform_version: "BIP"
source_type: community-api-docs
---

# 单据凭证相关信息查询

>  请求方式	POST | Auto Accounting Instructions (FI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/fi/otp/exmessage/queryMessage
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
accbookid	string	否	否	账簿id 示例：88383DEE-2889-46FE-A35F-7ABBCE93E4D9
period	string	否	否	会计期间 示例：2020-12
billid	string	是	否	业务单据id集合 示例：["2165308631356418","2163949179311105"]
desbillid	string	是	否	凭证id集合 示例：["093E8F0E-5F5A-4E8A-B176-EA76A9CC5C57","9F3BDE27-5909-4E12-AC9A-2BD85183DAD7"]

## 3. 请求示例

Url: /yonbip/fi/otp/exmessage/queryMessage?access_token=访问令牌
Body: {
	"accbookid": "88383DEE-2889-46FE-A35F-7ABBCE93E4D9",
	"period": "2020-12",
	"billid": [
		"2165308631356418",
		"2163949179311105"
	],
	"desbillid": [
		"093E8F0E-5F5A-4E8A-B176-EA76A9CC5C57",
		"9F3BDE27-5909-4E12-AC9A-2BD85183DAD7"
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
code	string	否	响应码 200成功 非200失败 示例：200
message	string	否	错误信息
data	object	是	data
billid	string	否	业务单据id 示例：2087711807444224
billno	string	否	业务单据编码 示例：CLCK20210114001355
desbillid	string	否	凭证id 示例：9F3BDE27-5909-4E12-AC9A-2BD85183DAD7
voucherno	string	否	凭证号 示例：24
voucherstate	string	否	凭证状态 ：normal 正式凭证 temp 临时凭证 nogen 不生成 示例：normal

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": [
		{
			"billid": "2087711807444224",
			"billno": "CLCK20210114001355",
			"desbillid": "9F3BDE27-5909-4E12-AC9A-2BD85183DAD7",
			"voucherno": "24",
			"voucherstate": "normal"
		}
	]
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
暂时没有数据哦~

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

