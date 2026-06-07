---
title: "应收结算清单保存并提交"
apiId: "1843235371886837766"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "AR Invoices"
domain: "CLMS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, AR Invoices]
platform_version: "BIP"
source_type: community-api-docs
---

# 应收结算清单保存并提交

>  请求方式	POST | AR Invoices (CLMS)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/EFI/receivable/saveandsubmit
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
data	object	否	是	应收结算清单数据
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
extSystemCode	string	否	否	外部系统编码（与外部系统单号联合做幂等性校验，有外部系统编码，需有外部系统单号，否则将返回提示） 示例：AB1234
code	string	否	否	单据编号 (设置自动编码时按编码规则取值，接口不用传值；手工编码时需要传值) 示例：ar000011
blnPostAfterInvoice	boolean	否	否	是否开税票后立账 示例：false
creator	string	否	否	创建人id 示例：9dff758d-bfc2-4b90-ac4c-e47fb0fc9bf3
extVouchCode	string	否	否	外部系统单号（与外部系统编码联合做幂等性校验，有外部系统单号，没有外部系统编码时，将不进行校验） 示例：AB1234
financeOrg	string	否	否	开票组织id，开票组织id和开票组织编码不能同时为空，id和编码同时存在，以id为准 示例：1514558842038386692
financeOrgCode	string	否	否	开票组织编码，开票组织id和开票组织编码不能同时为空，id和编码同时存在，以id为准 示例：11
direction	string	否	是	单据方向 1:蓝字 -1:红字 示例：1 默认值：1
billDate	string	否	是	单据日期(格式为:yyyy-MM-dd HH:mm:ss) 示例：2022-10-24 00:00:00
invoiceCode	string	否	否	发票代码 示例：110014316011
invoiceNo	string	否	否	发票号码 示例：20240801
bustype	string	否	否	交易类型id，交易类型id和交易类型编码不能同时为空，id和编码同时存在，以id为准 示例：1514492098255520713
bustypeCode	string	否	否	交易类型编码，交易类型id和交易类型编码不能同时为空，id和编码同时存在，以id为准 示例：ar_colsale
org	string	否	否	业务组织id，业务组织id和业务组织编码不能同时为空，id和编码同时存在，以id为准 示例：1514558842038386692
orgCode	string	否	否	业务组织编码，业务组织id和业务组织编码不能同时为空，id和编码同时存在，以id为准 示例：11
oriCurrency	string	否	否	币种id，币种id和币种编码不能同时为空，id和编码同时存在，以id为准 示例：1514492081064640537
oriCurrencyCode	string	否	否	币种编码，币种id和币种编码不能同时为空，id和编码同时存在，以id为准 示例：CNY
objectType	string	否	是	往来对象类型(枚举值 1:客户; 2:员工;3:资金业务对象) 示例：1
customer	string	否	否	客户id (往来对象类型是1时客户id，编码二选一必输，id和编码同时存在，以id为准, 客户、员工和资金业务对象三者的id和编码信息只可填写其一) 示例：1515940421356224512
customerCode	string	否	否	客户编码 (往来对象类型是1时客户id，编码二选一必输，id和编码同时存在，以id为准, 客户、员工和资金业务对象三者的id和编码信息只可填写其一) 示例：0805
employee	string	否	否	员工id (往来对象类型是2时员工id，编码二选一必输，id和编码同时存在，以id为准, 客户、员工和资金业务对象三者的id和编码信息只可填写其一) 示例：233222211
employeeCode	string	否	否	员工编码 (往来对象类型是2时员工id，编码二选一必输，id和编码同时存在，以id为准, 客户、员工和资金业务对象三者的id和编码信息只可填写其一) 示例：223
funder	string	否	否	资金业务对象id(往来对象类型是3时资金业务对象id，编码二选一必输，id和编码同时存在，以id为准, 客户、员工和资金业务对象三者的id和编码信息只可填写其一) 示例：1732613498433699840
funder_code	string	否	否	资金业务对象编码(往来对象类型是3时资金业务对象id，编码二选一必输，id和编码同时存在，以id为准, 客户、员工和资金业务对象三者的id和编码信息只可填写其一) 示例：ZJDX230524000051
invoiceType	string	否	否	发票类型 示例：1
exchangeRateType	string	否	否	汇率类型id，汇率类型id和汇率类型编码不能同时为空，id和编码同时存在，以id为准,均不填会取默认值 示例：0000L6D9B8DDEQ7W2Z0000
exchangeRateTypeCode	string	否	否	汇率类型编码，汇率类型id和汇率类型编码不能同时为空，id和编码同时存在，以id为准，均不填会取默认值 示例：01
exchangeRate	Decimal	否	是	汇率 示例：1
exchangeRateDate	string	否	是	汇率日期(格式为:yyyy-MM-dd HH:mm:ss) 示例：2022-10-24 00:00:00
agreement	string	否	否	收款协议id 示例：1536752888049568089
agreementCode	string	否	否	收款协议编码 示例：system_0001
dept	string	否	否	部门id 示例：1551794533528764418
deptCode	string	否	否	部门编码 示例：SS2
staff	string	否	否	业务员id 示例：1577862450987401221
staffCode	string	否	否	业务员编码 示例：009
projectCode	string	否	否	项目编码 示例：667
project	string	否	否	项目id 示例：1541277369785909249
srcBillId	string	否	否	来源单据id 示例：20562372655605350
bodyItem	object	是	是	表体数据（必输）
_status	string	否	是	操作标识 (Insert:新增, 本接口只支持单据保存，不支持编辑更新。如果数据错误请调用删除接口删除数据后重新保存) 示例：Insert

## 3. 请求示例

Url: /yonbip/EFI/receivable/saveandsubmit?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"extSystemCode": "AB1234",
		"code": "ar000011",
		"blnPostAfterInvoice": false,
		"creator": "9dff758d-bfc2-4b90-ac4c-e47fb0fc9bf3",
		"extVouchCode": "AB1234",
		"financeOrg": "1514558842038386692",
		"financeOrgCode": "11",
		"direction": "1",
		"billDate": "2022-10-24 00:00:00",
		"invoiceCode": "110014316011",
		"invoiceNo": "20240801",
		"bustype": "1514492098255520713",
		"bustypeCode": "ar_colsale",
		"org": "1514558842038386692",
		"orgCode": "11",
		"oriCurrency": "1514492081064640537",
		"oriCurrencyCode": "CNY",
		"objectType": "1",
		"customer": "1515940421356224512",
		"customerCode": "0805",
		"employee": "233222211",
		"employeeCode": "223",
		"funder": "1732613498433699840",
		"funder_code": "ZJDX230524000051",
		"invoiceType": "1",
		"exchangeRateType": "0000L6D9B8DDEQ7W2Z0000",
		"exchangeRateTypeCode": "01",
		"exchangeRate": 1,
		"exchangeRateDate": "2022-10-24 00:00:00",
		"agreement": "1536752888049568089",
		"agreementCode": "system_0001",
		"dept": "1551794533528764418",
		"deptCode": "SS2",
		"staff": "1577862450987401221",
		"staffCode": "009",
		"projectCode": "667",
		"project": "1541277369785909249",
		"srcBillId": "20562372655605350",
		"bodyItem": [
			{
				"oriCurrency": "1514492081064640537",
				"oriCurrencyCode": "CHY",
				"exchangeRateType": "234324532",
				"exchangeRateDate": "2022-10-24 00:00:00",
				"exchangeRate": 1,
				"exchangeRateTypeCode": "333",
				"taxRate": 1.5,
				"oriTaxExcludedAmount": 30,
				"objectType": "1",
				"customer": "1515940421356224512",
				"customerCode": "0805",
				"employee": "gfs2123ds-5d6asd",
				"employeeCode": "sadr23-vsdfds",
				"funder": "1732613498433699840",
				"funder_code": "ZJDX230524000051",
				"localTaxExcludedAmount": 123,
				"localTaxIncludedAmount": 5566,
				"dept": "1551794533528764418",
				"deptCode": "SS2",
				"agreement": "1536752888049568089",
				"agreementCode": "567",
				"localTaxAmount": 1547303019945656322,
				"quantity": 456,
				"staff": "1577862450987401221",
				"staffCode": "6878",
				"oriTaxExcludedPrice": 123,
				"oriTaxIncludedPrice": 678,
				"localTaxExcludedPrice": 12.4,
				"localTaxIncludedPrice": 788,
				"project": "1541277369785909249",
				"projectCode": "002",
				"oriTaxAmount": 2,
				"org": "1544896420846764040",
				"orgCode": "44",
				"oriTaxIncludedAmount": 30,
				"extRowNo": "AB1234",
				"expenseItem": "1570324310872555520",
				"expenseItemCode": "TEST0987",
				"srcBillType": "1",
				"material": "1551616919384096777",
				"materialCode": "000156",
				"_status": "Insert",
				"srcBillRowId": "20562372655605350",
				"invoiceCode": "110014316011",
				"invoiceNo": "20240801",
				"invoiceType": "1",
				"srcBillId": "205623726556962"
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
id	string	否	应收结算清单单据主键 示例：1580569448542633997

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"id": "1580569448542633997"
	}
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
999	开票组织不允许为空!	请求参数中输入开票组织id

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

