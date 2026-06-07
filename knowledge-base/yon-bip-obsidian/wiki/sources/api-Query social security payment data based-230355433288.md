---
title: "社保缴交按条件查询缴交数据"
apiId: "2303554332881584134"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Social Security Contribution - Current Month Contribution"
domain: "CPSM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Social Security Contribution - Current Month Contribution]
platform_version: "BIP"
source_type: community-api-docs
---

# 社保缴交按条件查询缴交数据

>  请求方式	POST | Social Security Contribution - Current Month Contribution (CPSM)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/HCC/insurancePay/getInsurancePay
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	详情批量查询
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
insuranceYearMonth	string	否	是	社保年月
adminOrgId	string	否	否	管理组织
dataStatus	string	否	否	数据状态 0：已审核 1：已审批 2：全部
staffIds	string	是	否	查询的人员id
payIds	string	是	否	当月缴交主表id
repayIds	string	是	否	补缴主表id
orgId	string	否	否	任职组织
isRepay	string	否	否	是否补缴：0：当月缴交 1：补缴 默认值：0

## 3. 请求示例

Url: /yonbip/HCC/insurancePay/getInsurancePay?access_token=访问令牌
Body: {
	"insuranceYearMonth": "",
	"adminOrgId": "",
	"dataStatus": "",
	"staffIds": [
		""
	],
	"payIds": [
		""
	],
	"repayIds": [
		""
	],
	"orgId": "",
	"isRepay": ""
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
code	string	否	code 示例：200
message	string	否	message
data	object	是	data
staffId	string	否	staffId 示例：123
orgId	string	否	orgId 示例：123
insuranceYearMonth	string	否	insuranceYearMonth 示例：123
ssInsurancePayThisMonthCharacteristics	string	否	ssInsurancePayThisMonthCharacteristics 示例：123
verifystate	string	否	verifystate 示例：123
approveState	string	否	approveState 示例：123
adminOrgId	string	否	adminOrgId 示例：123
isRepay	string	否	isRepay 示例：0
detailVerifyState	string	否	detailVerifyState 示例：123
detailApproveState	string	否	detailApproveState 示例：123
piId	string	否	piId 示例：123
piName	string	否	piName 示例：123
insuredCityId	string	否	insuredCityId 示例：123
cityName	string	否	cityName 示例：123
planId	string	否	planId 示例：234
planName	string	否	planName 示例：123
payMode	string	否	payMode 示例：123
payInsuranceTypeId	string	否	payInsuranceTypeId 示例：123
typeName	string	否	typeName 示例：123
insuranceNo	string	否	insuranceNo 示例：123
payPersonalBase	string	否	payPersonalBase 示例：123
payPersonalPayRate	string	否	payPersonalPayRate 示例：123
payPersonalFixedAmount	string	否	payPersonalFixedAmount 示例：123
payPersonalPayAmount	string	否	payPersonalPayAmount 示例：123
payPersonalAdjustmentAmount	string	否	payPersonalAdjustmentAmount 示例：123
payCompanyBase	string	否	payCompanyBase 示例：123
payCompanyPayRate	string	否	payCompanyPayRate 示例：123
payCompanyFixedAmount	string	否	payCompanyFixedAmount 示例：123
payCompanyPayAmount	string	否	payCompanyPayAmount 示例：123
payCompanyAdjustmentAmount	string	否	payCompanyAdjustmentAmount 示例：123
payPersonalRepayAmount	string	否	payPersonalRepayAmount 示例：123
payCompanyRepayAmount	string	否	payCompanyRepayAmount 示例：123
ssInsurancePayThisMonthDetailCharacteristics	string	否	ssInsurancePayThisMonthDetailCharacteristics 示例：123

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": [
		{
			"staffId": "123",
			"orgId": "123",
			"insuranceYearMonth": "123",
			"ssInsurancePayThisMonthCharacteristics": "123",
			"verifystate": "123",
			"approveState": "123",
			"adminOrgId": "123",
			"isRepay": "0",
			"detailVerifyState": "123",
			"detailApproveState": "123",
			"piId": "123",
			"piName": "123",
			"insuredCityId": "123",
			"cityName": "123",
			"planId": "234",
			"planName": "123",
			"payMode": "123",
			"payInsuranceTypeId": "123",
			"typeName": "123",
			"insuranceNo": "123",
			"payPersonalBase": "123",
			"payPersonalPayRate": "123",
			"payPersonalFixedAmount": "123",
			"payPersonalPayAmount": "123",
			"payPersonalAdjustmentAmount": "123",
			"payCompanyBase": "123",
			"payCompanyPayRate": "123",
			"payCompanyFixedAmount": "123",
			"payCompanyPayAmount": "123",
			"payCompanyAdjustmentAmount": "123",
			"payPersonalRepayAmount": "123",
			"payCompanyRepayAmount": "123",
			"ssInsurancePayThisMonthDetailCharacteristics": "123"
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

