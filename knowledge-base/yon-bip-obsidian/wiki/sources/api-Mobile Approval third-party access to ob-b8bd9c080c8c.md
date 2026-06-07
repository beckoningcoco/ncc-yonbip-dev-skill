---
title: "移动审批第三方接入获取单点authcode"
apiId: "b8bd9c080c8c4c8ab8abea7cf386f896"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Approval"
domain: "OA"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Approval]
platform_version: "BIP"
source_type: community-api-docs
---

# 移动审批第三方接入获取单点authcode

>  请求方式	POST | Approval (OA)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/uspace/ncapprove/getThirdAuthcode
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
tag	string	否	是	多nctag
mobile	string	否	是	手机号
groupId	string	否	是	nc组信息
thirdPartParam	object	否	是	thirdPartParam
thirdUserId	string	否	是	第三方用户主键
type	string	否	是	接入方式 示例：weChat、ThirdPartApp
domain	string	否	是	租户编码
userId	string	否	是	nc 用户主键
userCode	string	否	是	nc 用户编码
ncVersion	string	否	是	nc版本 示例：NCC、NC65

## 3. 请求示例

Url: /yonbip/uspace/ncapprove/getThirdAuthcode?access_token=访问令牌
Body: {
	"tag": "",
	"mobile": "",
	"groupId": "",
	"thirdPartParam": {
		"thirdUserId": "",
		"type": "weChat、ThirdPartApp"
	},
	"domain": "",
	"userId": "",
	"userCode": "",
	"ncVersion": "NCC、NC65"
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
authcode	string	否	鉴权编码 示例：xxxxx

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"authcode": "xxxxx"
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
	1	2025-07-09	
更新
请求参数 (10)
更新
返回参数 authcode

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

