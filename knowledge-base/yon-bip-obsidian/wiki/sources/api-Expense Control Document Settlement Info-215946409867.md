---
title: "费控单据结算信息回写V2"
apiId: "2159464098678439937"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Reimbursement"
domain: "ZNBZ"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Reimbursement]
platform_version: "BIP"
source_type: community-api-docs
---

# 费控单据结算信息回写V2

>  请求方式	POST | Reimbursement (ZNBZ)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/znbz/rbsm/api/bill/back/settleddetail
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	其他
事务和幂等性	MDD幂等
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
billID	long	否	是	单据ID 示例：2431516334969088
settledDetailID	long	否	是	结算明细ID 示例：2431516334969091
iSettleStatus	short	否	是	结算状态。待结算:0; 结算中:1; 结算成功:2; 结算止付:3; 结算部分成功:4; 无需结算:5; 示例：1
settleAmount	BigDecimal	否	否	实际结算金额 示例：20
settleTime	string	否	否	实际结算时间 示例：2023-02-17 10:47:20
settleDate	string	否	否	实际结算日期 示例：2023-02-17
billType	string	否	是	单据类型编码 示例：如：通用报销单znbzbx_expensebill,差旅报销znbzbx_travelexpbill,个人借款znbzbx_loanbill,还款znbzbx_returnbill,退款znbzbx_refundbill,对公预付znbzbx_pubprepay
stoppedamount	string	否	否	止付金额 示例：10
stopTime	string	否	否	止付时间 示例：2023-02-17 10:47:20
stopeDate	string	否	否	止付日期 示例：2023-02-17

## 3. 请求示例

Url: /yonbip/znbz/rbsm/api/bill/back/settleddetail?access_token=访问令牌
Body: {
	"billID": 2431516334969088,
	"settledDetailID": 2431516334969091,
	"iSettleStatus": 1,
	"settleAmount": 20,
	"settleTime": "2023-02-17 10:47:20",
	"settleDate": "2023-02-17",
	"billType": "如：通用报销单znbzbx_expensebill,差旅报销znbzbx_travelexpbill,个人借款znbzbx_loanbill,还款znbzbx_returnbill,退款znbzbx_refundbill,对公预付znbzbx_pubprepay",
	"stoppedamount": "10",
	"stopTime": "2023-02-17 10:47:20",
	"stopeDate": "2023-02-17"
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
code	string	否	返回编码 示例：200
message	string	否	返回信息 示例：操作成功
displayCode	string	否	异常码

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"displayCode": ""
}

## 6. 业务异常码

异常码	异常码信息	描述
035-503-001019
	根据单据类型未找到对应处理！	

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1021000999999	服务器异常	请联系系统管理员

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-07-11	
更新
请求说明
新增
请求参数 stoppedamount
新增
请求参数 stopTime
新增
请求参数 stopeDate
更新
请求参数 billType
删除
请求参数 (4)
新增
返回参数 displayCode

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

