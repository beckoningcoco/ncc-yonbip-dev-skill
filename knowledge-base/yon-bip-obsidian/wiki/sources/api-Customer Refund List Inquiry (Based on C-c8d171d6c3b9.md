---
title: "客户退款列表查询（即将废弃）"
apiId: "c8d171d6c3b94be8be10fb7a0afbaa0f"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Accounts Receivable"
domain: "FI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Accounts Receivable]
platform_version: "BIP"
source_type: community-api-docs
---

# 客户退款列表查询（即将废弃）

>  请求方式	POST | Accounts Receivable (FI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/fi/paybill/list
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
code	string	否	否	单据号
orderno	string	否	否	订单编号
period	string	否	否	会计期间
cashaccount	string	否	否	付款现金账户
enterprisebankaccount	string	否	否	付款银行账号
customerbankaccount	string	否	否	客户银行账户
currency	string	否	否	币种
accentity	string	否	否	会计主体
writeoffstatus	string	否	否	核销状态, 1:已核销、2:未核销、3:部分核销
tradetype	string	否	否	交易类型
project	string	否	否	项目
operator	string	否	否	业务员
settlemode	string	否	否	结算方式
org	string	否	否	组织
dept	string	否	否	部门
auditstatus	string	否	否	审批状态, 1:已审批、2:未审批
voucherstatus	string	否	否	凭证状态, 1:已生成、2:未生成、3:已接收未生成、4:不生成
isSum	boolean	否	否	是否显示明细，0:false、1:true 默认值：false
pageIndex	string	否	是	页数
pageSize	string	否	是	显示条数
simple	object	否	否	查询条件
open_vouchdate_begin	string	否	否	单据日期开始时间, 格式为:yyyy-MM-dd HH:mm:ss
open_vouchdate_end	string	否	否	单据日期结束时间, 格式为:yyyy-MM-dd HH:mm:ss
initflag	string	否	否	期初标志,1:0(false)、2:1(true)
srcitem	string	是	否	事项来源, 1:销售管理、2:B2C订单中心、3:在线商城、4:零售、5:库存、6:应收应付、7:采购管理、8:现金管理、9:导入、10:费用管理、11:总账、12:内部交易、20:第三方
synergystatus	string	是	否	单据协同确认状态, 0:未确认、1:已确认、2:其他
customer	string	是	否	客户id

## 3. 请求示例

Url: /yonbip/fi/paybill/list?access_token=访问令牌
Body: {
	"code": "",
	"orderno": "",
	"period": "",
	"cashaccount": "",
	"enterprisebankaccount": "",
	"customerbankaccount": "",
	"currency": "",
	"accentity": "",
	"writeoffstatus": "",
	"tradetype": "",
	"project": "",
	"operator": "",
	"settlemode": "",
	"org": "",
	"dept": "",
	"auditstatus": "",
	"voucherstatus": "",
	"isSum": true,
	"pageIndex": "",
	"pageSize": "",
	"simple": {
		"open_vouchdate_begin": "",
		"open_vouchdate_end": "",
		"initflag": "",
		"srcitem": [
			""
		],
		"synergystatus": [
			""
		],
		"customer": [
			""
		]
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
code	string	否	返回码，调用成功时返回200
message	string	否	调用失败时的错误信息
data	object	否	调用成功时的返回数据
pageIndex	int	否	页号
pageSize	int	否	每页行数
recordCount	int	否	记录数
pageCount	int	否	每页总数
beginPageIndex	int	否	起始页
endPageIndex	int	否	尾页
pubts	string	否	操作时间, 格式为:yyyy-MM-dd HH:mm:ss
sumRecordList	object	否	合计
recordList	object	是	返回数据

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"pageIndex": 0,
		"pageSize": 0,
		"recordCount": 0,
		"pageCount": 0,
		"beginPageIndex": 0,
		"endPageIndex": 0,
		"pubts": "",
		"sumRecordList": {
			"currency_moneyDigit": "",
			"currency_priceDigit": "",
			"currency": "",
			"natSum": 0,
			"localbalance": 0
		},
		"recordList": [
			{
				"vouchdate": "",
				"code": "",
				"accentity": "",
				"accentity_name": "",
				"period": "",
				"period_code": "",
				"currency_priceDigit": "",
				"currency_moneyDigit": "",
				"customer": "",
				"customer_name": "",
				"currency": "",
				"currency_name": "",
				"natCurrency": "",
				"natCurrency_name": "",
				"natCurrency_priceDigit": "",
				"exchangeRateType_digit": "",
				"exchangeRateType_name": "",
				"exchangeRateType": "",
				"natCurrency_moneyDigit": "",
				"exchRate": 0,
				"oriSum": 0,
				"natSum": 0,
				"balance": 0,
				"localbalance": 0,
				"enterprisebankaccount": "",
				"enterprisebankaccount_name": "",
				"customerbankname": "",
				"customerbankaccount": "",
				"customerbankaccount_bankAccountName": "",
				"dept": "",
				"dept_name": "",
				"operator": "",
				"operator_name": "",
				"project": "",
				"project_name": "",
				"employee": "",
				"employee_name": "",
				"srcitem": "",
				"tradetype": "",
				"tradetype_name": "",
				"org": "",
				"org_name": "",
				"writeoffstatus": "",
				"voucherstatus": "",
				"status": "",
				"isWfControlled": "",
				"verifystate": 0,
				"auditstatus": "",
				"description": "",
				"id": "",
				"tplid": "",
				"pubts": "",
				"headItem": {
					"id": "",
					"define1": "",
					"define2": "",
					"define3": "",
					"define4": ""
				}
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
	1	2025-06-25	
更新
请求说明
新增
返回参数 headCharacter

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

