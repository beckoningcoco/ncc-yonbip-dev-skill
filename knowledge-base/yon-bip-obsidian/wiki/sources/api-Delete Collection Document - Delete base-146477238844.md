---
title: "收款列表查询（即将废弃）"
apiId: "1464772388447584256"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Collection Document"
domain: "FI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Collection Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 收款列表查询（即将废弃）

>  请求方式	POST | Collection Document (FI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/fi/receivebill/list
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
code	string	否	否	单据编号
orderno	string	否	否	订单编号
period	string	否	否	会计期间
cashaccount	string	否	否	收款现金账户
enterprisebankaccount	string	否	否	收款银行账户
customerbankaccount	string	否	否	付款银行账户
currency	string	否	否	币种
accentity	string	否	否	会计主体
writeoffstatus	string	否	否	核销状态, 1:已核销、2:未核销、3:部分核销、
tradetype	string	否	否	交易类型
project	string	否	否	项目
operator	string	否	否	业务员
settlemode	string	否	否	结算方式
org	string	否	否	销售组织
dept	string	否	否	部门
auditstatus	string	否	否	审批状态, 1:已审批、2:未审批、
voucherstatus	string	否	否	凭证状态, 3:已接收未生成、4:不生成、1:已生成、2:未生成、
isSum	boolean	否	否	是否仅查询表头，若是true时只查询表头，若是false或者不传则查询表头+表体 默认值：false
pageIndex	string	否	是	页数
pageSize	string	否	是	显示条数
simple	object	否	否	查询条件：新用户推荐使用此字段封装查询条件
open_vouchdate_begin	string	否	否	单据日期开始时间, 格式为:yyyy-MM-dd HH:mm:ss
open_vouchdate_end	string	否	否	单据日期结束时间, 格式为:yyyy-MM-dd HH:mm:ss
initflag	string	否	否	期初标志,0(false)、1(true)
billtype	string	否	否	单据类型, 2:应收事项、7:收款单、8:应付事项、10:付款单、20:转移记录
srcitem	string	是	否	事项来源, 1:销售管理、2:B2C订单中心、3:在线商城、4:零售、5:库存、6:应收应付、7:采购管理、8:现金管理、9:导入、10:费用管理、11:总账、12:内部交易、20:第三方
synergystatus	string	是	否	单据协同确认状态, 0:未确认、1:已确认、2:其他
customer	string	是	否	客户id

## 3. 请求示例

Url: /yonbip/fi/receivebill/list?access_token=访问令牌
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
		"billtype": "",
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
code	long	否	返回码，调用成功时返回200 示例：200
message	string	否	调用失败时的错误信息 示例：操作成功
data	object	否	业务数据
pageIndex	long	否	页号 示例：1
pageSize	long	否	每页行数 示例：10
recordCount	string	否	查询总数
recordList	object	是	返回数据
sumRecordList	object	否	记录列表
pageCount	string	否	查询总页数
pubts	string	否	时间戳, 格式为:yyyy-MM-dd HH:mm:ss 示例：2020-10-20 16:24:03

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 10,
		"recordCount": "",
		"recordList": [
			{
				"currency_moneyDigit": 2,
				"currency_priceDigit": 2,
				"code": "RECar201009000001",
				"orderno": "UO-1392202009250001",
				"srcbillid": "1930678781104384",
				"exchRate": 1,
				"caobject": 1,
				"accentity_name": "收付组织",
				"accentity": "1746236822491392",
				"vouchdate": "2020-10-09 00:00:00",
				"verifystate": "",
				"settlestatus": "",
				"natCurrency_name": "人民币",
				"natCurrency": "G001ZM0000DEFAULTCURRENCT00000000001",
				"basebilltype_name": "收款单",
				"auditTime": "",
				"auditDate": "",
				"billtype": 7,
				"bookAmount": "",
				"balance": 4,
				"paytype": "",
				"srctypeflag": "saleordertype",
				"period_code": "2020-10",
				"currency": "1749094050877716",
				"id": 1950199586744064,
				"pubts": "2020-10-09 16:05:38",
				"org_name": "收付组织",
				"createDate": "2020-10-09 00:00:00",
				"exchangeRateType_digit": 6,
				"period": 1745476516057397,
				"auditstatus": 2,
				"creator": "魏森",
				"currency_name": "比索",
				"oriSum": 4,
				"org": "1746236822491392",
				"tradetype_name": "其他收款",
				"localbalance": 4,
				"basebilltype": "FICA1",
				"natSum": 4,
				"redflag": false,
				"srcitem": 6,
				"voucherstatus": 2,
				"exchangeRateType": "41a219073e1e4b78ba9f63adabc1b224",
				"tradetype": "1153091135960123",
				"writeoffstatus": 2,
				"initflag": false,
				"natCurrency_moneyDigit": 3,
				"createTime": "2020-10-09 16:05:37",
				"natCurrency_priceDigit": 6,
				"exchangeRateType_name": "用户自定义汇率",
				"customer_name": "收付客户",
				"customer": 1746249094893824,
				"status": 0
			}
		],
		"sumRecordList": {
			"currency_moneyDigit": "",
			"currency_priceDigit": "",
			"bookAmount": "",
			"localbalance": "",
			"currency": "",
			"natSum": ""
		},
		"pageCount": "",
		"pubts": "2020-10-20 16:24:03"
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
更新
请求参数 cashaccount
更新
请求参数 enterprisebankaccount
更新
请求参数 customerbankaccount

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

