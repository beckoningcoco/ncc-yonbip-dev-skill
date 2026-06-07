---
title: "客户费用单(商品)详情"
apiId: "c0bd647d26ed48bda1208b5fb6eace7d"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Customer Expense Document - Product"
domain: "SD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Customer Expense Document - Product]
platform_version: "BIP"
source_type: community-api-docs
---

# 客户费用单(商品)详情

>  请求方式	POST | Customer Expense Document - Product (SD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/sd/rebate/product/detail
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	详情查询
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
id	long	query	是	返利单id

## 3. 请求示例

Url: /yonbip/sd/rebate/product/detail?access_token=访问令牌&id=

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
icaConfirmTime	DateTime	否	确认时间 示例：2022-09-26 00:00:00
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
code	string	否	返回码，调用成功时返回200
message	string	否	调用失败时的错误信息
data	object	否	调用成功时的返回数据
salesOrgId	string	否	销售组织
salesOrgId_name	string	否	销售组织名称
code	string	否	单据编号
rebateCode	string	否	客户费用单类型
id	string	否	单据主表id
vouchdate	string	否	单据日期
agentId	string	否	客户id
agentId_code	string	否	客户编码
agentId_name	string	否	客户名称名称
settlementOrgId	string	否	开票组织id
settlementOrgId_name	string	否	开票组织名称
useWayCode	string	否	应用方式
rebateSourceId	string	否	客户费用单来源id
rebateSourceId_name	string	否	客户费用单来源名称
validStartDate	string	否	有效期开始时间
validEndDate	string	否	有效期结束时间
rebateMoney	int	否	客户费用单金额
originalPk	string	否	客户费用单币种pk
originalPk_priceDigit	string	否	客户费用单单价精度
originalPk_moneyDigit	string	否	客户费用单金额精度
originalPk_code	string	否	客户费用单币种简称
originalPk_name	string	否	客户费用单币种名称
status	string	否	客户费用单状态
isWfControlled	string	否	是否审批流控制
verifystate	string	否	审批状态
isWiteList	string	否	使用商品设置
code	string	否	客户费用单号
memo	textarea	否	备注
creator	string	否	制单人
createTime	string	否	创建时间
createDate	string	否	创建日期
creatorId	string	否	创建人
auditorId	string	否	审核人ID
auditor	string	否	审批人
auditTime	string	否	审批时间
auditDate	string	否	审批日期
modifierId	string	否	修改人id
modifyDate	string	否	修改日期
modifier	string	否	修改人
define1	string	否	自由自定义项 示例：自定义项字段headItem!*，headItem!为固定值，*为自定义项字段，例如headItem!define1，此字段可以通过客户费用单-商品卡片页面查询源码获取
modifyTime	string	否	修改时间
voucher_rebateReturnProduct	object	是	客户费用单商品表[voucher.rebate.RebateReturnProduct]

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"salesOrgId": "",
		"salesOrgId_name": "",
		"code": "",
		"rebateCode": "",
		"id": "",
		"vouchdate": "",
		"agentId": "",
		"agentId_code": "",
		"agentId_name": "",
		"settlementOrgId": "",
		"settlementOrgId_name": "",
		"useWayCode": "",
		"rebateSourceId": "",
		"rebateSourceId_name": "",
		"validStartDate": "",
		"validEndDate": "",
		"rebateMoney": 0,
		"originalPk": "",
		"originalPk_priceDigit": "",
		"originalPk_moneyDigit": "",
		"originalPk_code": "",
		"originalPk_name": "",
		"status": "",
		"isWfControlled": "",
		"verifystate": "",
		"isWiteList": "",
		"memo": "",
		"creator": "",
		"createTime": "",
		"createDate": "",
		"creatorId": "",
		"auditorId": "",
		"auditor": "",
		"auditTime": "",
		"auditDate": "",
		"modifierId": "",
		"modifyDate": "",
		"modifier": "",
		"define1": "自定义项字段headItem!*，headItem!为固定值，*为自定义项字段，例如headItem!define1，此字段可以通过客户费用单-商品卡片页面查询源码获取",
		"modifyTime": "",
		"voucher_rebateReturnProduct": [
			{
				"id": "",
				"productId": "",
				"productId_code": "",
				"productId_name": "",
				"skuId": "",
				"skuId_code": "",
				"specDescription": "",
				"quantity": 0,
				"unitName": "",
				"unit_Precision": "",
				"unitType": "",
				"bizProductId": ""
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
	1	2025-06-25	
更新
请求说明
更新
返回参数 (57)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

