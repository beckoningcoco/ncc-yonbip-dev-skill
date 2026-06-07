---
title: "开函登记更新接口"
apiId: "2115522846615142408"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "L/G Issuing Registration"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, L/G Issuing Registration]
platform_version: "BIP"
source_type: community-api-docs
---

# 开函登记更新接口

>  请求方式	POST | L/G Issuing Registration (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/ctm/guaranteeRegister/updateGuaranteeRegisterYql
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
request_body	object	否	否	请求体
guaranteeRegisterDTOList	object	是	否	保函开函登记更新数组

## 3. 请求示例

Url: /yonbip/ctm/guaranteeRegister/updateGuaranteeRegisterYql?access_token=访问令牌
Body: {
	"request_body": {
		"guaranteeRegisterDTOList": [
			{
				"serialNumber": "",
				"applyCode": "",
				"id": "",
				"guaranteeNumber": "",
				"guaranteeOpenDate": "2024-01-01",
				"guaranteeType": "",
				"agency": "",
				"openInstitution": "",
				"issuingMethod": "信开:mail,电开:phone",
				"isOpen": true,
				"currency": "id/code/名称（人民币）",
				"guaranteeAmount": 0,
				"guaranteeBeginDate": "2024-01-01",
				"guaranteeEndDate": "2024-02-01",
				"margin": true,
				"isForeign": true,
				"institution": "转开/转递机构code",
				"forwardingInstitution": "",
				"marginCurrency": "id/code/名称（人民币）",
				"currentAccount": "活期账号：是否保证金为否时清空 示例: 账户account：25010801",
				"marginaccid": "保证金账号：是否保证金为否时清空 示例: 账户account：25010801",
				"marginRatio": NaN,
				"marginAmount": 0,
				"ifSettlement": true,
				"settleMode": "",
				"paySettleMode": NaN,
				"settleState": NaN,
				"handlingFee": true,
				"feeCurrency": "id/code/名称（人民币）",
				"handlingFeeAmount": 0,
				"handlingFeeaccid": "手续费账号：是否手续费为否时清空    示例: 账户account：25010801"
			}
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
msg	string	否	返回汇总信息 示例：共：%s张单据；%s张更新成功；%s张更新失败！
message	string	否	失败原因 示例：开函登记数据同步失败，失败原因：

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"msg": "共：%s张单据；%s张更新成功；%s张更新失败！",
		"message": "开函登记数据同步失败，失败原因："
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
暂时没有数据哦~

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2026-01-12	
更新
请求说明
新增
请求参数 (19)
更新
请求参数 applyCode

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

