---
title: "社保：查询社保档案接口"
apiId: "2154997839488876547"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Social Security File"
domain: "CPSM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Social Security File]
platform_version: "BIP"
source_type: community-api-docs
---

# 社保：查询社保档案接口

>  请求方式	POST | Social Security File (CPSM)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/hrcloud/insuranceArchive/queryArchiveData
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
ids	string	是	否	社保档案主表id
detailIds	string	是	否	社保档案详情子表id
insureTypeIds	string	是	否	社保档案详情子表险种id，与主表id配置使用，查询指定险种数据

## 3. 请求示例

Url: /yonbip/hrcloud/insuranceArchive/queryArchiveData?access_token=访问令牌
Body: {
	"ids": [
		""
	],
	"detailIds": [
		""
	],
	"insureTypeIds": [
		""
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
小数位数:0,最大长度:10	否	code 示例：200
message	string	否	message 示例：操作成功
data	object	是	data
insuranceArchiveInsuranceDetails	object	是	社保档案详情子表集合
deptId	string	否	部门id 示例：2022081800003
insuredType	string	否	参保类型
staffId	string	否	人员id 示例：1530682312368324613
orgId	string	否	任职组织id 示例：1525652227072458756
id	string	否	主表id 示例：1563492435138969612
traceId	string	否	traceId 示例：03799686d600c820
uploadable	string	否	uploadable 示例：0

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": [
		{
			"insuranceArchiveInsuranceDetails": [
				{
					"id": "1563492692837007373",
					"mainId": "1563492435138969612",
					"insuranceTypeId": "1525644195464216581",
					"insurBeginDate": "2022-02",
					"insurEndDate": "2023-03",
					"manageOrgId": "1525652227072458756",
					"insuredCityId": "bfacf6bf-5cf3-11e9-817e-7cd30abea0c0",
					"planId": "1551548053779906569",
					"payMode": "0",
					"piId": "",
					"insuranceNo": "",
					"stopFlag": "2",
					"insuranceId": "1563492435138969613",
					"dataSource": "1"
				}
			],
			"deptId": "2022081800003",
			"insuredType": "",
			"staffId": "1530682312368324613",
			"orgId": "1525652227072458756",
			"id": "1563492435138969612"
		}
	],
	"traceId": "03799686d600c820",
	"uploadable": "0"
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

