---
title: "房地产涉税项目信息新增分期"
apiId: "1758528807114375169"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Tax Related Data Management"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Tax Related Data Management]
platform_version: "BIP"
source_type: community-api-docs
---

# 房地产涉税项目信息新增分期

>  请求方式	POST | Tax Related Data Management (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/tax/yonbip-fi-taxbd/bd/api/land/vat/installment/payment/add
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
tList	object	是	否	分期信息
installmentName	string	否	是	分期名称 示例：1122
installmentCode	string	否	是	分期编码 示例：1122
orgCode	string	否	否	税务组织编码 示例：er
installmentArea	BigDecimal	否	否	用地面积 示例：1122
installmentStatus	string	否	否	分期状态（1项目筹备阶段、2概念规划阶段、3开发报建阶段、4预售阶段、5竣工备案阶段） 示例：1
srcId	string	否	否	来源id 示例：12345
projectCode	string	否	是	项目编码 示例：llce
liquidationTime	string	否	否	清算时间，时间格式：yyyy-MM-dd 示例：2023-05-23
cancelMark	string	否	否	作废标识（Y:是，N否） 示例：N
sectionDetailSynRequestList	object	是	否	分期关联标段
landList	object	是	否	关联土地

## 3. 请求示例

Url: /yonbip/tax/yonbip-fi-taxbd/bd/api/land/vat/installment/payment/add?access_token=访问令牌
Body: {
	"tList": [
		{
			"installmentName": "1122",
			"installmentCode": "1122",
			"orgCode": "er",
			"installmentArea": 1122,
			"installmentStatus": "1",
			"srcId": "12345",
			"projectCode": "llce",
			"liquidationTime": "2023-05-23",
			"cancelMark": "N",
			"sectionDetailSynRequestList": [
				{
					"sectionCode": "1111",
					"sectionName": "2333"
				}
			],
			"landList": [
				{
					"landCode": "111",
					"landName": "2333",
					"landAddress": "567667",
					"cancelMark": "N"
				}
			]
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
message	string	否	响应编码 示例：操作成功
code	string	否	响应编码 示例：200

## 5. 正确返回示例

{
	"message": "操作成功",
	"code": "200"
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
9999	系统异常	根据message信息修改
1001	请设置Redis客户端编码	系统错误，redis配置错误

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-07-03	
更新
请求参数 orgCode

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

