---
title: "消息平台托管微信账号token"
apiId: "1679377713810374661"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Message Platform"
domain: "BMM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Message Platform]
platform_version: "BIP"
source_type: community-api-docs
---

# 消息平台托管微信账号token

>  请求方式	GET | Message Platform (BMM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/digitalModel/msgplatform/wechat/publictoken
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
shareCode	string	query	是	授权码    示例: MP
accountId	string	query	是	微信账号id    示例: gh_db*****

## 3. 请求示例

Url: /yonbip/digitalModel/msgplatform/wechat/publictoken?access_token=访问令牌&shareCode=MP&accountId=gh_db*****

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
code	string	否	接口状态码 示例：200
message	string	否	错误信息
data	object	否	数据
accessToken	string	否	微信token 示例：****
expires	long	否	过期时间

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"accessToken": "****",
		"expires": 0
	}
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
0	获取微信token失败，请检查授权码及微信账号是否正确	获取微信token失败，请检查授权码及微信账号是否正确

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-10-15	
更新
请求说明
消息平台托管微信账号Token这个接口，在20251015上线后迁移到友户通

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

