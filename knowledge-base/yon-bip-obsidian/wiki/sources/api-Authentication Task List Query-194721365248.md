---
title: "认证任务列表查询"
apiId: "1947213652483375108"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Certification Task"
domain: "PROSM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Certification Task]
platform_version: "BIP"
source_type: community-api-docs
---

# 认证任务列表查询

>  请求方式	POST | Certification Task (PROSM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/cpu/api/certification/queryCertificationApplyData
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
pageIndex	number
小数位数:0,最大长度:10	否	是	页码 默认值：1
pageSize	number
小数位数:0,最大长度:10	否	是	每页显示数量 默认值：10
certificateOrg	string	否	否	认证组织id
applyStatus	string	否	否	任务状态

## 3. 请求示例

Url: /yonbip/cpu/api/certification/queryCertificationApplyData?access_token=访问令牌
Body: {
	"pageIndex": 0,
	"pageSize": 0,
	"certificateOrg": "",
	"applyStatus": ""
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
code	string	否	状态码 示例：200
message	string	否	查询状况描述 示例：查询成功
data	object	否	返回的数据
pageIndex	long	否	页码 示例：0
pageSize	long	否	pageSize 示例：1
recordCount	long	否	recordCount 示例：1
recordList	object	是	查询出的数据集合

## 5. 正确返回示例

{
	"code": "200",
	"message": "查询成功",
	"data": {
		"pageIndex": 0,
		"pageSize": 1,
		"recordCount": 1,
		"recordList": [
			{
				"buyerTenant": "",
				"buyerName": "",
				"id": "",
				"applyStatus": "",
				"transType_name": "",
				"code": "",
				"name": "",
				"transType": "",
				"isOrgFirst": "",
				"certificateOrg_name": "",
				"certificateOrg": "",
				"certificateOrgName": "",
				"certificater_name": "",
				"certificater": "",
				"certificaterName": "",
				"createTime": "",
				"supplierId_name": "",
				"supplierId": "",
				"authMode": "",
				"certificationObject": "",
				"categoryId_name": "",
				"categoryId": "",
				"materialId_name": "",
				"materialId": "",
				"planEndDate": "2026-06-07",
				"validityDate": "",
				"memo": "",
				"file": "",
				"verifystate": "",
				"returncount": "",
				"isWfControlled": "",
				"auditor": "",
				"auditTime": "2026-06-07 13:06:09",
				"templateRef": "",
				"quoteApplyRef": "",
				"userDefineCharacter": "",
				"isBizLeaderForMe": "",
				"isAutomaticSyn": "",
				"contentList": {
					"id": "",
					"uuid": "",
					"applyId": "",
					"schemeDetailId": "",
					"stepId_code": "",
					"stepId_name": "",
					"stepId": "",
					"templateId_name": "",
					"templateId": "",
					"templateSource": "",
					"director_name": "",
					"director": "",
					"startDate": "2026-06-07",
					"endDate": "2026-06-07",
					"preStep": "",
					"authRecord": "",
					"quoteApplyId_code": "",
					"quoteApplyId": "",
					"quoteContentId": "",
					"authResult": "",
					"canStop": "",
					"canReissue": "",
					"contentStatus": ""
				},
				"orgList": {
					"id": "",
					"applyId": "",
					"orgId_code": "",
					"orgId_name": "",
					"orgId": ""
				},
				"productList": {
					"id": "",
					"applyId": "",
					"materialClassId_code": "",
					"materialClassId_name": "",
					"materialClassId": "",
					"applyProductId_code": "",
					"applyProductId_name": "",
					"applyProductId": ""
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
暂时没有数据哦~

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

