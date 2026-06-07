---
title: "付款申请工作台单据审核"
apiId: "24720f01716e46cd9d4f7d985d274e96"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Payment Application Workbench"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Payment Application Workbench]
platform_version: "BIP"
source_type: community-api-docs
---

# 付款申请工作台单据审核

>  请求方式	POST | Payment Application Workbench (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/fi/payapplybill/batchaudit
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
data	object	是	否	业务数据
id	long	否	是	单据id 示例：1930625070685696

## 3. 请求示例

Url: /yonbip/fi/payapplybill/batchaudit?access_token=访问令牌
Body: {
	"data": [
		{
			"id": 1930625070685696
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
code	string	否	返回码，调用成功时返回200 示例：200
message	string	否	调用失败时的错误信息 示例：操作成功
data	object	否	调用成功时的返回数据
sucessCountAI	int	否	成功数量AI 示例：1
failCountAI	int	否	失败数量AI 示例：0
count	int	否	数量
sucessCount	string	否	成功数量 示例：1
failCount	string	否	失败数量 示例：0
messages	object	是	返回信息集合
infos	object	是	记录集合

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"sucessCountAI": 1,
		"failCountAI": 0,
		"count": 0,
		"sucessCount": "1",
		"failCount": "0",
		"messages": [
			{}
		],
		"infos": [
			{
				"id": "2355149882003712",
				"payBillStatus": "3",
				"approvalStatus": "1",
				"auditorId": "2155538209116416",
				"auditor": "YonSuite默认用户",
				"auditDate": "2021-07-22 00:00:00",
				"auditTime": "2021-07-22 17:44:18",
				"verifystate": "3",
				"status": "2",
				"tenant": "2155538208313600",
				"pubts": "2021-07-22 17:44:18"
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
999	单据不存在	填入有意义的id号

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

