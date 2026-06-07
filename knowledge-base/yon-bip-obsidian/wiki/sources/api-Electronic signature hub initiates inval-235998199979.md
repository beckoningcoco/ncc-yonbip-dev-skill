---
title: "电子签hub发起作废流程"
apiId: "2359981999791276035"
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

# 电子签hub发起作废流程

>  请求方式	POST | E-signature Configuration (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/TRST/signFlow/v1/cancel
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
signFlowId	string	否	是	签署流程ID 示例：c727375a2d384cd62a5e
reason	string	否	是	作废原因，最大值100 示例：内容有误

## 3. 请求示例

Url: /yonbip/TRST/signFlow/v1/cancel?access_token=访问令牌
Body: {
	"signFlowId": "c727375a2d384cd62a5e",
	"reason": "内容有误"
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
message	string	否	响应信息 示例：message
data	object	否	响应值
signFlowId	string	否	签署流程ID 示例：c727375695e
bizId	object	否	业务系统方绑定的签署流程ID 示例：123123
signStatus	string	否	原签署流程状态：1：待发起，2: 签署中，3： 已过期，4：已完成，5：作废中，6：已作废 示例：4
cancelSignFlow	object	否	作废流程信息

## 5. 正确返回示例

{
	"code": "200",
	"message": "message",
	"data": {
		"signFlowId": "c727375695e",
		"bizId": "123123",
		"signStatus": "4",
		"cancelSignFlow": {
			"cancelSignFlowId": "123123",
			"cancelSigners": {
				"accountId": "123123213",
				"uniqueId": "123123",
				"accountName": "张三",
				"signUrl": "https://signksal.com/id=123123"
			},
			"signDocs": {
				"docId": "",
				"fileKey": ""
			}
		}
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
暂时没有数据哦~

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

