---
title: "企业资金账户详情分页查询-新集成V3"
apiId: "2201821066040442887"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Enterprise Fund Account"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Enterprise Fund Account]
platform_version: "BIP"
source_type: community-api-docs
---

# 企业资金账户详情分页查询-新集成V3

>  请求方式	POST | Enterprise Fund Account (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/digitalModel/basedoc/enterprisebank/batchQueryDetail
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	列表查询
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
pageIndex	number
小数位数:0,最大长度:10	否	是	页码 示例：1 默认值：1
pageSize	number
小数位数:0,最大长度:10	否	是	页大小 示例：50 默认值：50
startTs	date
格式:yyyy-MM-dd HH:mm:ss	否	否	pubts开始时间 示例：2025-02-28 11:16:47
endTs	date
格式:yyyy-MM-dd HH:mm:ss	否	否	pubts结束时间 示例：2025-05-28 11:16:47
ids	string	是	否	主键id集合 示例：["2211575684096589833","2211575684096589834"]
code	string	否	否	编码 示例：lc001
name	string	否	否	名称 示例：sf银行账户

## 3. 请求示例

Url: /yonbip/digitalModel/basedoc/enterprisebank/batchQueryDetail?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 50,
	"startTs": "2025-02-28 11:16:47",
	"endTs": "2025-05-28 11:16:47",
	"ids": [
		"2211575684096589833",
		"2211575684096589834"
	],
	"code": "lc001",
	"name": "sf银行账户"
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
code	string	否	返回码，调用成功是返回200 示例：200
data	object	否	调用成功时的返回数据
pageIndex	number
小数位数:0,最大长度:10	否	页码 示例：1
pageSize	number
小数位数:0,最大长度:10	否	页大小 示例：50
recordCount	number
小数位数:0,最大长度:10	否	总数量 示例：150
recordList	object	是	数据记录

## 5. 正确返回示例

{
	"code": "200",
	"data": {
		"pageIndex": 1,
		"pageSize": 50,
		"recordCount": 150,
		"recordList": [
			{
				"id": "2201731713568604166",
				"code": "lc01",
				"name": {
					"zh_CN": "银行账户01",
					"en_US": "Bank Account 01",
					"zh_TW": "銀行帳戶01"
				},
				"description": {
					"zh_CN": "银行账户描述01",
					"en_US": "Bank Account Description01",
					"zh_TW": "銀行帳戶描述01"
				},
				"orgid": "1624225669279907850",
				"orgid___code": "test01",
				"orgid___name": {
					"zh_CN": "存货核算业务单元",
					"en_US": "Inventory accounting business unit",
					"zh_TW": "存貨核算業務單元"
				},
				"acctStatementDirection": 0,
				"account_apply_range": [
					{
						"rangeOrgId___code": "org01"
					}
				],
				"enable": 1,
				"accountNature": 0,
				"accountOrgId": "1624225669279907850",
				"accountOrgId___code": "org01",
				"accountOrgId___name": {
					"zh_CN": "org01",
					"zh_TW": "org01",
					"en_US": "org01"
				},
				"bankNumber": "2183173202809192448",
				"bankNumber___code": "313",
				"bankNumber___name": {
					"zh_CN": "中国银行",
					"zh_TW": "中國銀行",
					"en_US": "ChinaBank"
				},
				"currencyList": [
					{
						"id": "2201731713568604167",
						"currency": "2200857893855035397",
						"currency___code": "NewC",
						"currency___name": {
							"zh_CN": "新币API",
							"en_US": "NewAPI",
							"zh_TW": "新币API"
						},
						"bankacct": "2201731713568604166",
						"bankacct___code": "api001",
						"isdefault": false,
						"enable": 1,
						"pubts": "2025-02-14 14:41:47"
					}
				],
				"taxRegistration": false,
				"bank": "1694942907099250689",
				"bank___code": "qwe1234re",
				"bank___name": {
					"zh_CN": "中国工商银行",
					"en_US": "ICBC",
					"zh_TW": "中国工商银行"
				},
				"acctName": {
					"zh_CN": "开户名01",
					"en_US": "Account name",
					"zh_TW": "开户名01"
				},
				"agentBank": "2183173202809192448",
				"agentBank___code": "openapi_test",
				"acctopentype": 0,
				"accountPurpose": "2200876396574146567",
				"accountPurpose___code": "use_api001",
				"acctType": 0,
				"acctstatus": 0,
				"lineNumber": "lineNumber001",
				"account": "account001",
				"parent": "2013259365970083864",
				"parent___code": "api001",
				"settleorgid": "1632565696906395656",
				"settleorgid___code": "01",
				"settleorgid___name": {
					"zh_CN": "全职能组织",
					"en_US": "FullOrg",
					"zh_TW": "全职能组织"
				},
				"accountOpenDate": "2025-04-03 00:00:00",
				"pubts": "2025-02-14 14:41:47"
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
暂时没有数据哦~

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-30	
更新
请求说明

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

