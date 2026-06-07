---
title: "挂账付款申请单撤回"
apiId: "1846113652813856776"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Payables Payment Request"
domain: "ZNBZ"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Payables Payment Request]
platform_version: "BIP"
source_type: community-api-docs
---

# 挂账付款申请单撤回

>  请求方式	POST | Payables Payment Request (ZNBZ)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/znbz/rbsm/api/bill/paymentapply/unsubmit
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	MDD幂等
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	否	是	请求数据
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
id	long	否	是	单据ID 示例：1513587578118340610

## 3. 请求示例

Url: /yonbip/znbz/rbsm/api/bill/paymentapply/unsubmit?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"id": 1513587578118340610
	}
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
code	long	否	返回状态码 示例：200
displayCode	string	否	异常码
message	string	否	返回信息 示例：操作成功
data	object	否	返回数据
bustype	string	否	交易类型 示例：1658463224516313092
bustype_name	string	否	交易类型名称 示例：挂账付款申请单
pk_handlepsn	string	否	申请人 示例：1549357070803795972
vhandledeptid	string	否	申请人部门id 示例：1524154726676430853
chandleorg	string	否	申请人组织id 示例：1524154503347568646
cfinaceorg	string	否	费用承担组织id 示例：1524154503347568646
vattachmentass	string	否	单据附件id 示例：c422bf86910945aaa09a2553030c57fe
id	string	否	单据id 示例：1846109813099986946
verifystate	long	否	审批状态(0:初始开立;1:审批中;2:审批完成;3:不通过流程终止;4:驳回到制单) 示例：0
status	long	否	单据状态(0:待提交;1:审批完成;2:已关闭;3:审批中) 示例：0
pubts	string	否	更新时间 示例：2023-10-24 10:44:55

## 5. 正确返回示例

{
	"code": 200,
	"displayCode": "",
	"message": "操作成功",
	"data": {
		"bustype": "1658463224516313092",
		"bustype_name": "挂账付款申请单",
		"pk_handlepsn": "1549357070803795972",
		"vhandledeptid": "1524154726676430853",
		"chandleorg": "1524154503347568646",
		"cfinaceorg": "1524154503347568646",
		"vattachmentass": "c422bf86910945aaa09a2553030c57fe",
		"id": "1846109813099986946",
		"verifystate": 0,
		"status": 0,
		"pubts": "2023-10-24 10:44:55"
	}
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1021000999999	服务器异常	请联系系统管理员

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2026-01-08	
更新
请求说明
添加幂等
	2	2025-07-11	
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

