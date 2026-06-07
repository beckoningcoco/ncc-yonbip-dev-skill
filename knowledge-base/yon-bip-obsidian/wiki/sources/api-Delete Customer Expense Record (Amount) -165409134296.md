---
title: "客户费用单(金额)费用使用记录保存"
apiId: "1654091342962753540"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Customer Expense Document - Amount"
domain: "SD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Customer Expense Document - Amount]
platform_version: "BIP"
source_type: community-api-docs
---

# 客户费用单(金额)费用使用记录保存

>  请求方式	POST | Customer Expense Document - Amount (SD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/rebate/record/save
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
data	object	是	是	数据(数组)
rebateCode	string	否	是	目标客户费用单单号 示例：UO-4962202302060100
rebateRecords	object	是	是	客户费用使用记录(数组)

## 3. 请求示例

Url: /yonbip/sd/rebate/record/save?access_token=访问令牌
Body: {
	"data": [
		{
			"rebateCode": "UO-4962202302060100",
			"rebateRecords": [
				{
					"amount": 10,
					"outSysKey": "00000001",
					"outSource": "ORDER",
					"orderCode": "QbOJ#20230206#000001"
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
message	string	否	信息 示例：操作成功
data	string	否	响应信息
icaConfirmTime	DateTime	否	确认时间 示例：2022-09-26 00:00:00
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
code	string	否	响应状态码 示例：200
message	string	否	响应信息 示例：操作成功
data	object	是	响应数据
code	string	否	单据编号
code	string	否	单据编号
rebateNo	string	否	客户费用单号 示例：UO-4962202302060100
rebateId	long	否	客户费用单主表id 示例：1653133075516227587
agentId	long	否	客户id 示例：1549413455017017349
createDate	string	否	客户费用使用记录创建时间 示例：2023-02-07 16:01:22
orderRebateMoney	double	否	客户费用使用记录金额 示例：10
useWayCode	string	否	客户费用使用记录类型(TOPRODUCT-订单折扣) 示例：TOPRODUCT
outSysKey	string	否	外部唯一主键 示例：tqyTest1
voucherSourceType	string	否	单据来源(OUT-一般外部来源,ORDER-订单) 示例：OUT
submitUser	long	否	提交用户 示例：1525641755939569667
_status	string	否	数据库动作标记 示例：Insert
recordStatus	string	否	客户费用使用记录状态(CONFIRMING-待确认,TAKEEFFECT-已使用,CANCEL-已取消) 示例：TAKEEFFECT
id	long	否	客户费用使用记录id 示例：1654051021694959623

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"rebateNo": "UO-4962202302060100",
			"rebateId": 1653133075516227587,
			"agentId": 1549413455017017349,
			"createDate": "2023-02-07 16:01:22",
			"orderRebateMoney": 10,
			"useWayCode": "TOPRODUCT",
			"outSysKey": "tqyTest1",
			"voucherSourceType": "OUT",
			"submitUser": 1525641755939569667,
			"_status": "Insert",
			"recordStatus": "TAKEEFFECT",
			"id": 1654051021694959623
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
999	错误提示，例如:单据号为xxx的客户费用-金额已上传过对应记录,请勿重复上传,如需修改,请先删除记录!	根据错误信息提示进行操作

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-25	
更新
请求参数 amount

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

