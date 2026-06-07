---
title: "外汇付款单提交和批量提交"
apiId: "2130497533556817922"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "FX Payment"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, FX Payment]
platform_version: "BIP"
source_type: community-api-docs
---

# 外汇付款单提交和批量提交

>  请求方式	POST | FX Payment (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/ctm/foreignpayment/submit
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
fullname	string	否	否	元数据fullname 默认值：cmp.foreignpayment.ForeignPayment
billnum	string	否	否	外汇付款单billnum 默认值：cmp_foreignpayment
data	object	否	是	外汇付款单数据
ids	string	是	是	id

## 3. 请求示例

Url: /yonbip/ctm/foreignpayment/submit?access_token=访问令牌
Body: {
	"fullname": "",
	"billnum": "",
	"data": {
		"ids": [
			""
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
code	string	否	返回码，调用成功时返回200 示例：200
message	string	否	调用失败时的错误信息 示例：操作成功
data	object	否	返回数据
failCount	number
小数位数:0,最大长度:10	否	失败数量 示例：0
count	number
小数位数:0,最大长度:10	否	总数 示例：1
successCount	number
小数位数:2,最大长度:10	否	成功数量 示例：1
messages	string	是	错误信息
infos	object	是	出参信息

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"failCount": 0,
		"count": 1,
		"successCount": 1,
		"messages": [
			""
		],
		"infos": [
			{
				"id": 2781248724882176
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
200	批量操作通常不存在错误码	参照返回messages的提示处理

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

