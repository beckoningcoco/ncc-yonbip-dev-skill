---
title: "社保补缴批量更新"
apiId: "2315323058683379713"
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

# 社保补缴批量更新

>  请求方式	POST | Social Security Contribution - Current Month Contribution (CPSM)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/HCC/insurancePay/updateInsuranceRePay
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	批量保存/更新
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
id	string	否	否	id 示例：123
staffId	string	否	否	staffId 示例：S1001
orgId	string	否	否	orgId 示例：ORG100
deptId	string	否	否	deptId 示例：DEPT50
repayYearMonth	string	否	否	repayYearMonth 示例：2023-09
memo	string	否	否	memo 示例：补缴社保
repayYearMonthFrom	string	否	否	repayYearMonthFrom 示例：2023-08
repayYearMonthTo	string	否	否	repayYearMonthTo 示例：2023-09
insuranceYearMonth	string	否	否	insuranceYearMonth 示例：2023-10
payBasePeriod	string	否	否	payBasePeriod 示例：2023-10
lockState	string	否	否	lockState 示例：0
approveState	string	否	否	approveState 示例：1
repayReason	string	否	否	repayReason 示例：漏缴
payDataSourceModel	string	否	否	payDataSourceModel 示例：MANUAL
repayPersonalPayTotal	string	否	否	repayPersonalPayTotal 示例：1500
repayCompanyPayTotal	string	否	否	repayCompanyPayTotal 示例：3000
verifystate	string	否	否	verifystate 示例：1
adminOrgId	string	否	否	adminOrgId 示例：ADMIN_ORG1
entrustedStatus	string	否	否	entrustedStatus 示例：1
insurancePayRepayTypeDetails	object	是	否	insurancePayRepayTypeDetails
id	string	否	否	id 示例：123
mainId	string	否	否	mainId 示例：MAIN1001
thisMonthMainId	string	否	否	thisMonthMainId 示例：MONTHLY1001
adminOrgId	string	否	否	adminOrgId 示例：ADMIN_ORG1
payArchiveId	string	否	否	payArchiveId 示例：ARCHIVE1001
payInsuranceTypeId	string	否	否	payInsuranceTypeId 示例：INSURANCE_TYPE1
payPersonalBase	string	否	否	payPersonalBase 示例：5000
payPersonalPayRate	string	否	否	payPersonalPayRate 示例：10
payPersonalFixedAmount	string	否	否	payPersonalFixedAmount 示例：0
payPersonalPayAmount	string	否	否	payPersonalPayAmount 示例：500
payPersonalRepayAmount	string	否	否	payPersonalRepayAmount 示例：1000
payCompanyBase	string	否	否	payCompanyBase 示例：5000
payCompanyPayRate	string	否	否	payCompanyPayRate 示例：20
payCompanyFixedAmount	string	否	否	payCompanyFixedAmount 示例：0
payCompanyPayAmount	string	否	否	payCompanyPayAmount 示例：1000
payCompanyRepayAmount	string	否	否	payCompanyRepayAmount 示例：2000
repayReason	string	否	否	repayReason 示例：漏缴
lockState	string	否	否	lockState 示例：0
approveState	string	否	否	approveState 示例：1
payLateFee	string	否	否	payLateFee 示例：50
interest	string	否	否	interest 示例：10
payDataSourceModel	string	否	否	payDataSourceModel 示例：MANUAL
repayYearMonth	string	否	否	repayYearMonth 示例：2023-09
insuranceYearMonth	string	否	否	insuranceYearMonth 示例：2023-10
verifystate	string	否	否	verifystate 示例：1
piId	string	否	否	piId 示例：PI1001
insuranceNo	string	否	否	insuranceNo 示例：INSURANCE123456
payCompanyFixedAmountPoint	string	否	否	payCompanyFixedAmountPoint 示例：2
payPersonalFixedAmountPoint	string	否	否	payPersonalFixedAmountPoint 示例：2
payPayTotalFixedAmountPoint	string	否	否	payPayTotalFixedAmountPoint 示例：2
insuredCityId	string	否	否	insuredCityId 示例：CITY100
radix	string	否	否	radix 示例：5000
planId	string	否	否	planId 示例：PLAN1001
payMode	string	否	否	payMode 示例：ONLINE

## 3. 请求示例

Url: /yonbip/HCC/insurancePay/updateInsuranceRePay?access_token=访问令牌
Body: [{
	"id": "123",
	"staffId": "S1001",
	"orgId": "ORG100",
	"deptId": "DEPT50",
	"repayYearMonth": "2023-09",
	"memo": "补缴社保",
	"repayYearMonthFrom": "2023-08",
	"repayYearMonthTo": "2023-09",
	"insuranceYearMonth": "2023-10",
	"payBasePeriod": "2023-10",
	"lockState": "0",
	"approveState": "1",
	"repayReason": "漏缴",
	"payDataSourceModel": "MANUAL",
	"repayPersonalPayTotal": "1500",
	"repayCompanyPayTotal": "3000",
	"verifystate": "1",
	"adminOrgId": "ADMIN_ORG1",
	"entrustedStatus": "1",
	"insurancePayRepayTypeDetails": [
		{
			"id": "123",
			"mainId": "MAIN1001",
			"thisMonthMainId": "MONTHLY1001",
			"adminOrgId": "ADMIN_ORG1",
			"payArchiveId": "ARCHIVE1001",
			"payInsuranceTypeId": "INSURANCE_TYPE1",
			"payPersonalBase": "5000",
			"payPersonalPayRate": "10",
			"payPersonalFixedAmount": "0",
			"payPersonalPayAmount": "500",
			"payPersonalRepayAmount": "1000",
			"payCompanyBase": "5000",
			"payCompanyPayRate": "20",
			"payCompanyFixedAmount": "0",
			"payCompanyPayAmount": "1000",
			"payCompanyRepayAmount": "2000",
			"repayReason": "漏缴",
			"lockState": "0",
			"approveState": "1",
			"payLateFee": "50",
			"interest": "10",
			"payDataSourceModel": "MANUAL",
			"repayYearMonth": "2023-09",
			"insuranceYearMonth": "2023-10",
			"verifystate": "1",
			"piId": "PI1001",
			"insuranceNo": "INSURANCE123456",
			"payCompanyFixedAmountPoint": "2",
			"payPersonalFixedAmountPoint": "2",
			"payPayTotalFixedAmountPoint": "2",
			"insuredCityId": "CITY100",
			"radix": "5000",
			"planId": "PLAN1001",
			"payMode": "ONLINE"
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

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {}
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

