---
title: "缴交历史数据导入"
apiId: "1976853488082092040"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Historical Data Migration Inquiry"
domain: "CPSM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Historical Data Migration Inquiry]
platform_version: "BIP"
source_type: community-api-docs
---

# 缴交历史数据导入

>  请求方式	POST | Historical Data Migration Inquiry (CPSM)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/hrcloud/historyData/save
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
data	object	是	否	请求数据
id	string	否	否	主表id 示例：1947947035160215559
staffCode	string	否	否	员工编码 示例：00000153
staffName	string	否	否	员工名称 示例：王亚东
staffId	string	否	是	员工id 示例：1534512529843159043
certType	string	否	否	证件类型 示例：护照
certNo	string	否	否	证件号码 示例：87873232
orgId	string	否	是	任职组织id 示例：1525652227072458756
orgName	string	否	否	任职组织名称 示例：收入中台演示销售组织1
deptId	string	否	否	部门id
deptName	string	否	否	部门名称
payablePeriod	string	否	是	应缴年月 示例：2024-01
actualPayablePeriod	string	否	是	实缴年月 示例：2024-01
payPersonalPayTotal	number
小数位数:2,最大长度:10	否	否	个人缴纳总额 示例：1
payCompanyPayTotal	number
小数位数:2,最大长度:10	否	否	单位缴纳总额 示例：1
payTotal	number
小数位数:2,最大长度:10	否	否	缴纳总额 示例：1
ssInsuranceHistoryDataCharacteristics	object	否	否	主表特征（值是map格式）
details	object	是	否	子表险种数据集合
extField1	string	否	否	主表预留字段1 示例：主表拓展字段测试1
extField2	string	否	否	主表预留字段2
extField3	string	否	否	主表预留字段3

## 3. 请求示例

Url: /yonbip/hrcloud/historyData/save?access_token=访问令牌
Body: {
	"data": [
		{
			"id": "1947947035160215559",
			"staffCode": "00000153",
			"staffName": "王亚东",
			"staffId": "1534512529843159043",
			"certType": "护照",
			"certNo": "87873232",
			"orgId": "1525652227072458756",
			"orgName": "收入中台演示销售组织1",
			"deptId": "",
			"deptName": "",
			"payablePeriod": "2024-01",
			"actualPayablePeriod": "2024-01",
			"payPersonalPayTotal": 1,
			"payCompanyPayTotal": 1,
			"payTotal": 1,
			"ssInsuranceHistoryDataCharacteristics": {},
			"details": [
				{
					"id": "1976001959188496426",
					"mainId": "1976001959188496424",
					"payInsuranceTypeId": "1525644195464216583",
					"payInsuranceTypeName": "工伤1",
					"adminOrgId": "1525652227072458756",
					"adminOrgName": "",
					"insuredCityId": "",
					"insuredCityName": "",
					"piId": "1944828253339910151",
					"piName": "",
					"planId": "",
					"planIdName": "",
					"insuranceYearMonth": "2024-04",
					"repayYearMonth": "",
					"repayReason": "",
					"repayDivision": "",
					"payPersonalBase": 1,
					"payPersonalPayRate": 1,
					"payPersonalFixedAmount": 1,
					"payPersonalAdjustmentAmount": 1,
					"payPersonalPayAmount": 1,
					"payCompanyBase": 1,
					"payCompanyPayRate": 1,
					"payCompanyFixedAmount": 1,
					"payCompanyAdjustmentAmount": 1,
					"payCompanyPayAmount": 1,
					"payPersonalRepayAmount": 1,
					"payCompanyRepayAmount": 1,
					"payLateFee": 1,
					"extField1": "子表拓展字段测试1",
					"extField2": "",
					"extField3": "",
					"ssInsuranceHistoryDataDetailCharacteristics": {}
				}
			],
			"extField1": "主表拓展字段测试1",
			"extField2": "",
			"extField3": ""
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
code	number
小数位数:0,最大长度:10	否	返回状态码（200：成功，其他失败） 示例：200
message	string	否	返回描述信息 示例：suc
data	object	否	返回值对象
count	number
小数位数:0,最大长度:10	否	总数 示例：3
successCount	number
小数位数:0,最大长度:10	否	成功条数 示例：2
failCount	number
小数位数:0,最大长度:10	否	失败条数 示例：1
messages	object	是	失败信息集合
infos	object	是	成功信息集合

## 5. 正确返回示例

{
	"code": 200,
	"message": "suc",
	"data": {
		"count": 3,
		"successCount": 2,
		"failCount": 1,
		"messages": [
			{
				"sourceUnique": "1534512529843159043",
				"message": "险种id：1525644195464216581 不存在"
			}
		],
		"infos": [
			{
				"data": {
					"sourceUnique": "1947947035160215559",
					"targetUnique": "1976001959188496425"
				}
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
	1	2025-06-13	
新增
请求参数 ssInsuranceHistoryDataCharacteristics
新增
请求参数 ssInsuranceHistoryDataDetailCharacteristics
入参中添加特征参数

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

