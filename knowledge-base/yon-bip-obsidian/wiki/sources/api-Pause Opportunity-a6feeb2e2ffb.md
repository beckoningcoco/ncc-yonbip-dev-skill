---
title: "暂停商机"
apiId: "a6feeb2e2ffb4ce0b5fcba9fe7863492"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Opportunity"
domain: "CRM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Opportunity]
platform_version: "BIP"
source_type: community-api-docs
---

# 暂停商机

>  请求方式	POST | Opportunity (CRM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/crm/bill/exec/suspend
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
billnum	string	否	是	商机的billnum，值为"sfa_opptcard" 示例：sfa_opptcard 默认值：sfa_opptcard
data	object	是	是	data
id	string	否	是	商机主键
suspendReason	string	否	是	暂停原因的主键
suspendRemark	string	否	否	暂停备注

## 3. 请求示例

Url: /yonbip/crm/bill/exec/suspend?access_token=访问令牌
Body: {
	"billnum": "sfa_opptcard",
	"data": [
		{
			"id": "",
			"suspendReason": "",
			"suspendRemark": ""
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
message	string	否	信息 示例：操作成功
data	string	否	响应信息
icaConfirmTime	DateTime	否	确认时间 示例：2022-09-26 00:00:00
code	long	否	code 示例：200：成功，999：失败
message	string	否	message 示例：商机状态是进行中的，才支持暂停操作
data	string	否	返回的数据值：无值为空 示例：null

## 5. 正确返回示例

{
	"code": NaN,
	"message": "商机状态是进行中的，才支持暂停操作",
	"data": "null"
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
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

