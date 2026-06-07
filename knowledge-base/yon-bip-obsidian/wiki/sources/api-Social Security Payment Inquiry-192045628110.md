---
title: "社保缴交查询"
apiId: "1920456281108774915"
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

# 社保缴交查询

>  请求方式	POST | Social Security Contribution - Current Month Contribution (CPSM)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/hrcloud/insurancePay/getInsurancePayInfo
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	详情批量查询
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
pageIndex	string	否	否	页号 默认值：1
pageSize	string	否	否	分页大小 默认值：100000
pubts	string	否	否	查询晚于当前此时间的数据
insuranceYearMonth	string	否	是	社保年月
adminOrgId	string	否	是	管理组织
dataStatus	string	否	是	数据状态：0：已审核，1：已审批
orgId	string	否	否	任职组织
isRepay	string	否	否	是否补缴：0：不补缴 1：补缴 默认值：0

## 3. 请求示例

Url: /yonbip/hrcloud/insurancePay/getInsurancePayInfo?access_token=访问令牌
Body: {
	"pageIndex": "",
	"pageSize": "",
	"pubts": "",
	"insuranceYearMonth": "",
	"adminOrgId": "",
	"dataStatus": "",
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
pageSize	string	否	分页大小
pageIndex	string	否	页号
pageCount	string	否	总页数
recordCount	string	否	总数
hashnextPage	boolean	否	是否有下一页
recordList	object	是	结果集
insuranceYearMonth	string	否	缴交年月 示例：2024-01
repayYearMonth	string	否	补缴年月 示例：2023-12
staffId	string	否	人员id 示例：1800881634249015304
orgId	string	否	组织id 示例：1685934479583477762
adminOrgId	string	否	管理组织id 示例：1685934479583477762
insuredCityId	string	否	参保城市id 示例：bfacf6bf-5cf3-11e9-817e-7cd30abea0c0
piId	string	否	缴交机构id
piName	string	否	缴交机构名称
payInsuranceTypeId	string	否	缴纳险种id 示例：1685915083510120875
typeName	string	否	险种名称 示例：大病
planId	string	否	社保方案id 示例：1806909973007958022
planName	string	否	社保方案名称 示例：测试险种关联2
insuranceNo	string	否	社保账号 示例：634689343443
payMode	string	否	缴纳方式 示例：0
payPersonalPayRate	string	否	个人缴纳比例 示例：0
payPersonalPayAmount	string	否	个人缴纳额 示例：3
payPersonalFixedAmount	string	否	个人固定额 示例：3
payPersonalBase	string	否	个人缴纳基数 示例：32422
payPersonalAdjustmentAmount	string	否	个人调整额
payPersonalRepayAmount	string	否	个人补缴额
payCompanyFixedAmount	string	否	单位缴纳固定额 示例：0
payCompanyBase	string	否	单位缴纳基数 示例：32422
payCompanyPayAmount	string	否	单位缴纳额 示例：0
payCompanyPayRate	string	否	单位缴纳比例 示例：0
payCompanyAdjustmentAmount	string	否	单位调整额
payCompanyRepayAmount	string	否	单位补缴额
ssInsurancePayThisMonthCharacteristics	string	否	缴交主表特征项
ssInsurancePayThisMonthDetailCharacteristics	string	否	缴交子表特征项
ssInsurancePayRepayCharacteristics	object	否	补缴主表特征项 示例：{ "sbgl080311": "2023-08-29 00:00:00", "sbgl1234": "1685915083510120861", "ytenant": "0000LFJAP5AH6GUDJ50000", "hr_chac_test001_name": "北京市", "sbgl0803111"
ssInsurancePayRepayTypeDetailCharacteristics	object	否	补缴子表特征项
interest	string	否	利息
payLateFee	string	否	滞纳金

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"pageSize": "",
		"pageIndex": "",
		"pageCount": "",
		"recordCount": "",
		"hashnextPage": true,
		"recordList": [
			{
				"insuranceYearMonth": "2024-01",
				"repayYearMonth": "2023-12",
				"staffId": "1800881634249015304",
				"orgId": "1685934479583477762",
				"adminOrgId": "1685934479583477762",
				"insuredCityId": "bfacf6bf-5cf3-11e9-817e-7cd30abea0c0",
				"piId": "",
				"piName": "",
				"payInsuranceTypeId": "1685915083510120875",
				"typeName": "大病",
				"planId": "1806909973007958022",
				"planName": "测试险种关联2",
				"insuranceNo": "634689343443",
				"payMode": "0",
				"payPersonalPayRate": "0",
				"payPersonalPayAmount": "3",
				"payPersonalFixedAmount": "3",
				"payPersonalBase": "32422",
				"payPersonalAdjustmentAmount": "",
				"payPersonalRepayAmount": "",
				"payCompanyFixedAmount": "0",
				"payCompanyBase": "32422",
				"payCompanyPayAmount": "0",
				"payCompanyPayRate": "0",
				"payCompanyAdjustmentAmount": "",
				"payCompanyRepayAmount": "",
				"ssInsurancePayThisMonthCharacteristics": "",
				"ssInsurancePayThisMonthDetailCharacteristics": "",
				"ssInsurancePayRepayCharacteristics": "{                     \"sbgl080311\": \"2023-08-29 00:00:00\",                     \"sbgl1234\": \"1685915083510120861\",                     \"ytenant\": \"0000LFJAP5AH6GUDJ50000\",                     \"hr_chac_test001_name\": \"北京市\",                     \"sbgl0803111\"",
				"ssInsurancePayRepayTypeDetailCharacteristics": {},
				"interest": "",
				"payLateFee": ""
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

