---
title: "获取共享组织和共享下级组织"
apiId: "125b04baca4744c9bb125370864c96b2"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Master Data Graded Management"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Master Data Graded Management]
platform_version: "BIP"
source_type: community-api-docs
---

# 获取共享组织和共享下级组织

>  请求方式	POST | Master Data Graded Management (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/digitalModel/basedoc-mc/openApi/mc/orgRangeShareAll
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
orglist	string	是	是	组织id 示例：["222","111"]
docid	string	否	否	档案id，docid 和 doctype 至少有一个不为空 示例：11111
doctype	string	否	否	档案code，docid 和 doctype 至少有一个不为空 示例：aa.merchant.Merchant

## 3. 请求示例

Url: /yonbip/digitalModel/basedoc-mc/openApi/mc/orgRangeShareAll?access_token=访问令牌
Body: {
	"orglist": [
		"222",
		"111"
	],
	"docid": "11111",
	"doctype": "aa.merchant.Merchant"
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
code	string	否	标识 示例：200
message	string	否	消息 示例：获取数据成功。
data	string	是	数据体(组织id) 示例：["223e333","dddds"]

## 5. 正确返回示例

{
	"code": "200",
	"message": "获取数据成功。",
	"data": [
		"223e333",
		"dddds"
	]
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
暂时没有数据哦~

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-30	
更新
请求参数 docid
更新
返回参数 code
更新
返回参数 message
更新
返回参数 data

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

