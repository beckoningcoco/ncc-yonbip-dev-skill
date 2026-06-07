---
title: "集团司库数据上报银行账户整单新增"
apiId: "2184091406688059397"
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

# 集团司库数据上报银行账户整单新增

>  请求方式	POST | Regulatory Reporting (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/ctm/submit/api/group/bankaccount/bill/insert
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
dataDate	string	否	是	数据日期
submitType	string	否	是	报送业务名称 BANK_ACCOUNT 示例：BANK_ACCOUNT
detailList	object	是	是	明细数据
submitGroupCreditCode	string	否	是	所属集团编码
submitGroupName	string	否	是	所属集团名称
dataSource	string	否	是	数据来源 MANUAL_INPUT手工录入 BANK_ACCOUNT 银行账户 BANK_ACCOUNT_REVISION 银行账户修订
sourceId	string	否	是	外部数据来源id
accountOpenUnitCode	string	否	是	开户单位编码
accountOpenUnitName	string	否	是	开户单位名称
accountOpenEnterLevel	string	否	是	开户单位企业级次 L00：本级 L01：一级 L02：二级 L03：三级 以此类推，例如四级为L04,五级为L05
accountUnitName	string	否	是	单位户名
orgAccount	string	否	是	单位账号
openBankName	string	否	是	开户银行名称
accountOpenInstitutionBankNum	string	否	否	开户机构联行号
bankOpenRegion	string	否	是	开户银行所在国所在地区
openCenterBank	string	否	否	开户银行总行
pk_currency	string	否	是	币种
accountBalance	number
小数位数:2,最大长度:32	否	是	账户余额
accountBalanceTime	string	否	是	账户余额时间
standardCurrencyBalance	number
小数位数:2,最大长度:32	否	是	账户余额(本币)
accountPurpose	string	否	否	账户用途 D01：基本存款户 D02：一般存款户 D03：专用存款户 D04：临时存款户 D05：其他存款户
openBankEnterLogo	string	否	是	开通银企直联标识
openBankEnterTime	string	否	否	开通银企直联时间
centralizeFundAccountIdenty	string	否	是	集中资金账户标识
accountStatus	string	否	是	账户状态 T00:存续；T01：注销
accountOpenTime	string	否	是	开户时间
accountCancelTime	string	否	是	销户时间
inoutUnitAccount	string	否	是	是否为内部单位账户 T00：非内部单位账户； T01：内部单位账户；

## 3. 请求示例

Url: /yonbip/ctm/submit/api/group/bankaccount/bill/insert?access_token=访问令牌
Body: {
	"dataDate": "",
	"submitType": "BANK_ACCOUNT",
	"detailList": [
		{
			"submitGroupCreditCode": "",
			"submitGroupName": "",
			"dataSource": "",
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
			"accountBalanceTime": "",
			"standardCurrencyBalance": 0,
			"accountPurpose": "",
			"openBankEnterLogo": "",
			"openBankEnterTime": "",
			"centralizeFundAccountIdenty": "",
			"accountStatus": "",
			"accountOpenTime": "",
			"accountCancelTime": "",
			"inoutUnitAccount": ""
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
code	number
小数位数:0,最大长度:10	否	接口返回状态码
message	string	否	接口结果返回描述
sourceIds	object	是	外部数据来源id

## 5. 正确返回示例

{
	"code": 0,
	"message": "",
	"sourceIds": [
		{}
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

