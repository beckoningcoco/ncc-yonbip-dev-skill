---
title: "集团司库数据上报银行账户查询"
apiId: "2183779609253249030"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Regulatory Reporting"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Regulatory Reporting]
platform_version: "BIP"
source_type: community-api-docs
---

# 集团司库数据上报银行账户查询

>  请求方式	POST | Regulatory Reporting (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/ctm/submit/api/group/bankaccount/query
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
dataDate	date
格式:yyyy-MM-dd	否	是	数据日期
submitType	string	否	是	报送业务名称 填BANK_ACCOUNT 示例：BANK_ACCOUNT
billStatus	string	否	否	单据状态 报送状态 0 初始态1 审批中 2 已审核 3 终止态4驳回
submitStatus	string	否	否	报送状态 FILLING 填报中 WAIT_REPORT_GROUP 待上报 HAVING_REPORT_GROUP 已上报
accentityCode	string	否	否	单位编码
accentityName	string	否	否	开户单位
page	number
小数位数:0,最大长度:10	否	是	查询页数 0开始 示例：0
size	number
小数位数:0,最大长度:10	否	是	每次查询条数 示例：100

## 3. 请求示例

Url: /yonbip/ctm/submit/api/group/bankaccount/query?access_token=访问令牌
Body: {
	"dataDate": "2026-06-07",
	"submitType": "BANK_ACCOUNT",
	"billStatus": "",
	"submitStatus": "",
	"accentityCode": "",
	"accentityName": "",
	"page": 0,
	"size": 100
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
code	number
小数位数:0,最大长度:10	否	接口返回状态码 示例：200
message	string	否	接口返回结果描述 示例：操作成功
data	object	是	查询结果
dataDate	string	否	数据日期
submitType	string	否	报送业务名称
billStatus	string	否	单据状态
submitStatus	string	否	报送状态
detailList	object	是	明细信息
page	object	否	分页信息

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": [
		{
			"dataDate": "",
			"submitType": "",
			"billStatus": "",
			"submitStatus": "",
			"detailList": [
				{
					"submitGroupCreditCode": "",
					"submitGroupName": "",
					"dataSource": "",
					"id": "",
					"sourceId": "",
					"accountOpenUnitCode": "",
					"accountOpenUnitName": "",
					"accountOpenEnterLevel": "",
					"accountUnitName": "",
					"orgAccount": "",
					"openBankName": "",
					"accountOpenInstitutionBankNum": "",
					"bankOpenRegion": "",
					"openCenterBank": "",
					"pk_currency": "",
					"accountBalance": 0,
					"standardCurrencyBalance": "",
					"accountBalanceTime": "",
					"accountPurpose": "",
					"openBankEnterLogo": "",
					"openBankEnterTime": "",
					"centralizeFundAccountIdenty": "",
					"accountStatus": "",
					"accountOpenTime": "",
					"accountCancelTime": ""
				}
			],
			"page": {
				"pageIndex": 0,
				"pageSize": 0,
				"totalPage": 0,
				"totalCount": 0
			}
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
暂时没有数据哦~

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

