---
title: "获取企业信息"
apiId: "eb91c32910e947a9b84022ffe9d97151"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Supplier Common Settings"
domain: "SS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Supplier Common Settings]
platform_version: "BIP"
source_type: community-api-docs
---

# 获取企业信息

>  请求方式	POST | Supplier Common Settings (SS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/cpu/tenant/query
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token

## 3. 请求示例

Url: /yonbip/cpu/tenant/query?access_token=访问令牌

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
message	string	否	提示信息 示例：获取成功
data	object	是	后端服务返回的数据
icaConfirmTime	DateTime	否	确认时间 示例：2022-09-26 00:00:00
enterpriseName	string	否	企业名称
tradeName	string	是	行业大类
provinceName	string	否	企业所在省
cityName	string	否	企业所在市
address	string	否	企业地址
bsCode	string	否	工商代码
bsName	string	否	工商名称
bsRegisterTime	string	否	工商注册时间
legalRepName	string	否	法人代表姓名
legalRepMobile	string	否	法人代表手机
supplierLevel	string	是	供应商等级
platRegisterTime	string	否	平台入驻时间
tenantId	string	否	租户ID

## 5. 正确返回示例

{
	"code": "200",
	"message": "获取成功",
	"data": [
		{
			"enterpriseName": "",
			"tradeName": [
				""
			],
			"provinceName": "",
			"cityName": "",
			"address": "",
			"bsCode": "",
			"bsName": "",
			"bsRegisterTime": "",
			"legalRepName": "",
			"legalRepMobile": "",
			"supplierLevel": [
				""
			],
			"platRegisterTime": "",
			"tenantId": ""
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
201	逻辑正确，但是没走通	
203	系统错误	找开发确认问题
204	权限问题	执行脚本，或者添加权限

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

