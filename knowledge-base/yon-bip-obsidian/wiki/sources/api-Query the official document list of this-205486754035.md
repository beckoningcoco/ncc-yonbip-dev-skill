---
title: "查询本部门的公文列表"
apiId: "2054867540352958465"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Official Documents"
domain: "OA"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Official Documents]
platform_version: "BIP"
source_type: community-api-docs
---

# 查询本部门的公文列表

>  请求方式	GET | Official Documents (OA)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/uspace/openapi/official/getPaging/dept
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
tenantId	string	query	是	租户ID
officialUserId	string	query	是	查询的用户ID
pageIndex	number
小数位数:0,最大长度:10	query	是	当前页码
pageSize	number
小数位数:0,最大长度:10	query	是	每页大小

## 3. 请求示例

Url: /yonbip/uspace/openapi/official/getPaging/dept?access_token=访问令牌&tenantId=&officialUserId=&pageIndex=&pageSize=

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
flag	string	否	返回状态，0正常，1失败
desc	string	否	返回描述
data	object	否	返回数据
total	number
小数位数:0,最大长度:10	否	列表数据总条数
pageData	object	是	列表数据集合

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"flag": "",
		"desc": "",
		"data": {
			"total": 0,
			"pageData": [
				{
					"id": "",
					"tenantId": "",
					"userId": "",
					"orgId": "",
					"formTemplateId": "",
					"formInstanceId": "",
					"processInstanceId": "",
					"processDefinitionId": "",
					"title": "",
					"type": "",
					"fileId": "",
					"filePath": "",
					"pdfPath": "",
					"signPdfPath": "",
					"ofdPath": "",
					"documentTypeId": "",
					"documentTypeName": "",
					"initiatorId": "",
					"initiatorDeptId": "",
					"sendDocumentNo": "",
					"sourceDocumentNo": "",
					"receiveDocumentNo": "",
					"approveStatus": "",
					"formUrl": ""
				}
			]
		}
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

