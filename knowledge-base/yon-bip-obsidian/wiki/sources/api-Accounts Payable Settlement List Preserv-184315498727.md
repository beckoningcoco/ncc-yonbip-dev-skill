---
title: "应付结算清单保存并提交"
apiId: "1843154987278925833"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "AP Invoices"
domain: "CLMS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, AP Invoices]
platform_version: "BIP"
source_type: community-api-docs
---

# 应付结算清单保存并提交

>  请求方式	POST | AP Invoices (CLMS)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/EFI/payable/saveandsubmit
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	单条保存/更新
事务和幂等性	MDD幂等
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	否	是	应付结算清单数据
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
funder	string	否	否	资金业务对象id(往来对象类型是3时必输：资金业务对象id和资金业务对象编码不能同时为空) 示例：000023
extSystemCode	string	否	否	外部系统编码（与外部系统单号联合做幂等性校验，有外部系统编码，需有外部系统单号，否则将返回提示）
extVouchCode	string	否	否	外部系统单号（与外部系统编码联合做幂等性校验，有外部系统单号，没有外部系统编码时，将不进行校验）
creator	string	否	否	创建人id 示例：9dff758d-bfc2-4b90-
srcBillType	string	否	否	来源单据类型(枚举值 1:销售订单; 2:销售合同; 3:项目收款计划; 4:应收事务; 5:销售退货; 6:应付事务; 7:采购订单; 8:项目付款预测; 9:采购合同; 10:付款申请单; 11:U订货; 12:费用单; 13:采购发票; 14:销售发票; 15:出库单; 16:收款单; 17:采购入库; 18:委外订单; 19:银行到账认领单) 示例：1
srcBillId	string	否	否	来源单据id 示例：20562372655605350
funder_code	string	否	否	资金业务对象编码(往来对象类型是3时必输：资金业务对象id和资金业务对象编码不能同时为空) 示例：ZJDX230511000023
financeOrg	string	否	否	收票组织 (收票组织id和收票组织编码不能同时为空，id和编码同时存在，以id为准) 示例：1525652227072458756
financeOrgCode	string	否	否	收票组织编码 (收票组织id和收票组织编码不能同时为空，id和编码同时存在，以id为准) 示例：pkm00
code	string	否	否	单据编号 (设置自动编码时按编码规则取值，接口不用传值；手工编码时需要传值) 示例：OAPap230317853486
billDate	string	否	是	单据日期 (格式为:yyyy-MM-dd HH:mm:ss) 示例：2022-10-24 00:00:00
direction	string	否	是	单据方向 (1:蓝字；-1:红字) 示例：1
bustype	string	否	否	交易类型id (交易类型id和交易类型编码不能同时为空，id和编码同时存在，以id为准) 示例：1514492098255520719
bustypeCode	string	否	否	交易类型编码 (交易类型id和交易类型编码不能同时为空，id和编码同时存在，以id为准) 示例：ap_invoice
org	string	否	否	业务组织id (业务组织id和业务组织编码不能同时为空，id和编码同时存在，以id为准) 示例：1525652227072458756
orgCode	string	否	否	业务组织编码 (业务组织id和业务组织编码不能同时为空，id和编码同时存在，以id为准) 示例：pkm00
objectType	string	否	是	往来对象类型 (枚举值 0:供应商；2:员工；3:资金业务对象) 示例：0
oriCurrency	string	否	否	币种id (币种id和币种简称不能同时为空，id和简称同时存在，以id为准) 示例：1514492081064640537
oriCurrencyCode	string	否	否	币种简称 (币种id和币种简称不能同时为空，id和简称同时存在，以id为准) 示例：CNY
supplier	string	否	否	供应商id (往来对象类型是0时必输：供应商id和供应商编码不能同时为空，id和编码同时存在，以id为准) 示例：1570200967882211330
supplierCode	string	否	否	供应商编码 (往来对象类型是0时必输：供应商id和供应商编码不能同时为空，id和编码同时存在，以id为准) 示例：0001000111
employee	string	否	否	员工id (往来对象类型是2时必输：员工id和员工编码不能同时为空，id和编码同时存在，以id为准) 示例：1468336011116358677
employeeCode	string	否	否	员工编码 (往来对象类型是2时必输：员工id和员工编码不能同时为空，id和编码同时存在，以id为准) 示例：0025
invoiceNo	string	否	否	发票编码 示例：20240806
invoiceCode	string	否	否	发票代码 示例：110014316011
invoiceType	string	否	否	发票类型 示例：1
exchangeRate	Decimal	否	是	汇率 示例：1
exchangeRateType	string	否	否	汇率类型 示例：0000L6D9B8DDEQ7W2Z0000
exchangeRateTypeCode	string	否	否	汇率类型编码 示例：01
exchangeRateDate	string	否	否	汇率日期 (格式为:yyyy-MM-dd HH:mm:ss) 示例：2022-10-24 00:00:00
dept	string	否	否	部门id 示例：1551794533528764418
deptCode	string	否	否	部门编码 示例：SS2
staff	string	否	否	业务员id 示例：1577862450987401221
staffCode	string	否	否	业务员编码 示例：009
projectCode	string	否	否	项目编码 示例：667
project	string	否	否	项目id 示例：1541277369785909249
orderNo	string	否	否	订单编号 示例：dd002
remarks	string	否	否	备注 示例：这是发票
agreement	string	否	否	付款协议id 示例：1472183199958827012
agreementCode	string	否	否	付款协议编码 示例：00000001
bodyItem	object	是	是	表体数据（必输）
_status	string	否	是	操作标识 (Insert:新增, 本接口只支持单据保存，不支持编辑更新。如果数据错误请调用删除接口删除数据后重新保存) 示例：Insert

## 3. 请求示例

Url: /yonbip/EFI/payable/saveandsubmit?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"funder": "000023",
		"extSystemCode": "",
		"extVouchCode": "",
		"creator": "9dff758d-bfc2-4b90-",
		"srcBillType": "1",
		"srcBillId": "20562372655605350",
		"funder_code": "ZJDX230511000023",
		"financeOrg": "1525652227072458756",
		"financeOrgCode": "pkm00",
		"code": "OAPap230317853486",
		"billDate": "2022-10-24 00:00:00",
		"direction": "1",
		"bustype": "1514492098255520719",
		"bustypeCode": "ap_invoice",
		"org": "1525652227072458756",
		"orgCode": "pkm00",
		"objectType": "0",
		"oriCurrency": "1514492081064640537",
		"oriCurrencyCode": "CNY",
		"supplier": "1570200967882211330",
		"supplierCode": "0001000111",
		"employee": "1468336011116358677",
		"employeeCode": "0025",
		"invoiceNo": "20240806",
		"invoiceCode": "110014316011",
		"invoiceType": "1",
		"exchangeRate": 1,
		"exchangeRateType": "0000L6D9B8DDEQ7W2Z0000",
		"exchangeRateTypeCode": "01",
		"exchangeRateDate": "2022-10-24 00:00:00",
		"dept": "1551794533528764418",
		"deptCode": "SS2",
		"staff": "1577862450987401221",
		"staffCode": "009",
		"projectCode": "667",
		"project": "1541277369785909249",
		"orderNo": "dd002",
		"remarks": "这是发票",
		"agreement": "1472183199958827012",
		"agreementCode": "00000001",
		"bodyItem": [
			{
				"funder_code": "ZJDX230511000023",
				"funder": "00023",
				"deductTaxType": "0",
				"blnDeductTax": true,
				"taxRate": 0,
				"oriTaxIncludedAmount": 10,
				"oriTaxAmount": 0,
				"objectType": "0",
				"oriCurrency": "1514492081064640537",
				"oriCurrencyCode": "CNY",
				"supplier": "1570200967882211330",
				"supplierCode": "0001000111",
				"employee": "1472183176558827012",
				"employeeCode": "em005",
				"dept": "1551794533528764418",
				"deptCode": "SS2",
				"staff": "1577862450987401221",
				"staffCode": "6878",
				"project": "1541277369785909249",
				"projectCode": "002",
				"rowNo": 10,
				"orderNo": "dd002",
				"exchangeRate": 1,
				"org": "1544896420846764040",
				"orgCode": "1001012",
				"exchangeRateType": "0000L6D9B8DDEQ7W2Z0000",
				"exchangeRateTypeCode": "01",
				"exchangeRateDate": "2022-10-24 00:00:00",
				"startDate": "2023-03-17 00:00:00",
				"material": "1471410234665730052",
				"materialCode": "000001",
				"quantity": 10,
				"extRowNo": "AB1234",
				"agreement": "1472183199958827012",
				"agreementCode": "00000001",
				"remarks": "备注",
				"expenseItem": "1597535213588054023",
				"expenseItemCode": "daoruces9993",
				"_status": "Insert",
				"srcBillId": "20562372655605350",
				"srcBillRowId": "20562372655605350",
				"srcBillType": "1",
				"invoiceCode": "110014316011",
				"invoiceType": "1",
				"invoiceNo": "20240806"
			}
		],
		"_status": "Insert"
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
code	string	否	返回码，调用成功时返回200 示例：200
message	string	否	调用返回信息 示例：操作成功
data	object	否	返回数据
id	string	否	应付结算清单主键 示例：1468336086076358677

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"id": "1468336086076358677"
	}
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
999	收票组织不允许为空!	请求参数中输入有效的收票组织id或编码

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-07-02	
更新
请求说明
更新
请求参数 data
更新
返回参数 id

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

