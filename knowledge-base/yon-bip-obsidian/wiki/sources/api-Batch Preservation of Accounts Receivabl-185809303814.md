---
title: "应收结算清单批量保存"
apiId: "1858093038141177856"
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

# 应收结算清单批量保存

>  请求方式	POST | AR Invoices (CLMS)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/EFI/receivable/batchsave
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	批量保存/更新
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	是	是	应收结算清单数据
extSystemCode	string	否	否	外部系统编码（与外部系统单号联合做幂等性校验，有外部系统编码，需有外部系统单号，否则将返回提示） 示例：AB1234
creator	string	否	否	创建人id 示例：9dff758d-bfc2-4b90-ac4c-e47fb0fc9bf3
auditor	string	否	否	审核人id 示例：9dff758d-bfc2-4b90-ac4c-e47fb0fc9bf3
code	string	否	否	单据编号 (设置自动编码时按编码规则取值，接口不用传值；手工编码时需要传值；更新数据时需要传值) 示例：D22023111300000058
blnPostAfterInvoice	boolean	否	否	是否开税票后立账 示例：false
extVouchCode	string	否	否	外部系统单号（与外部系统编码联合做幂等性校验，有外部系统单号，没有外部系统编码时，将不进行校验） 示例：AB1234
financeOrg	string	否	否	开票组织id，开票组织id和开票组织编码不能同时为空，id和编码同时存在，以id为准 示例：1514558842038386692
financeOrgCode	string	否	否	开票组织编码，开票组织id和开票组织编码不能同时为空，id和编码同时存在，以id为准 示例：11
direction	string	否	是	单据方向 1:蓝字 -1:红字 示例：1 默认值：1
billDate	string	否	是	单据日期(格式为:yyyy-MM-dd HH:mm:ss) 示例：2022-10-24 00:00:00
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
exchangeRateType	string	否	否	汇率类型id，汇率类型id和汇率类型编码不能同时为空，id和编码同时存在，以id为准,均不填会取默认值 示例：0000L6D9B8DDEQ7W2Z0000
exchangeRateTypeCode	string	否	否	汇率类型编码，汇率类型id和汇率类型编码不能同时为空，id和编码同时存在，以id为准，均不填会取默认值 示例：01
exchangeRate	Decimal	否	是	汇率 示例：1
exchangeRateDate	string	否	是	汇率日期(格式为:yyyy-MM-dd HH:mm:ss) 示例：2022-10-24 00:00:00
agreement	string	否	否	收款协议id 示例：1536752888049568089
agreementCode	string	否	否	收款协议编码 示例：system_0001
dept	string	否	否	部门id 示例：1551794533528764418
deptCode	string	否	否	部门编码 示例：SS2
staff	string	否	否	业务员id 示例：1577862450987401221
invoiceCode	string	否	否	发票代码 示例：110014316011
invoiceNo	string	否	否	发票号码 示例：20240806
invoiceType	string	否	否	发票类型 示例：1
staffCode	string	否	否	业务员编码 示例：009
projectCode	string	否	否	项目编码 示例：667
project	string	否	否	项目id 示例：1541277369785909249
srcBillType	string	否	否	来源单据类型(枚举值 1:销售订单; 2:销售合同; 3:项目收款计划; 4:应收事务; 5:销售退货; 6:应付事务; 7:采购订单; 8:项目付款预测; 9:采购合同; 10:付款申请单; 11:U订货; 12:费用单; 13:采购发票; 14:销售发票; 15:出库单; 16:收款单; 17:采购入库; 18:委外订单; 19:银行到账认领单) 示例：1
srcBillId	string	否	否	来源单据id 示例：2056237265560535041
_status	string	否	是	操作标识 (Insert:新增, 本接口只支持单据保存，不支持编辑更新。如果数据错误请调用删除接口删除数据后重新保存) 示例：Insert
retailer	string	否	否	散户名称 示例：哈哈
remarks	string	否	否	备注 示例：表头备注
bodyItem	object	是	是	表体数据（必输）

## 3. 请求示例

Url: /yonbip/EFI/receivable/batchsave?access_token=访问令牌
Body: {
	"data": [
		{
			"extSystemCode": "AB1234",
			"creator": "9dff758d-bfc2-4b90-ac4c-e47fb0fc9bf3",
			"auditor": "9dff758d-bfc2-4b90-ac4c-e47fb0fc9bf3",
			"code": "D22023111300000058",
			"blnPostAfterInvoice": false,
			"extVouchCode": "AB1234",
			"financeOrg": "1514558842038386692",
			"financeOrgCode": "11",
			"direction": "1",
			"billDate": "2022-10-24 00:00:00",
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
			"exchangeRateType": "0000L6D9B8DDEQ7W2Z0000",
			"exchangeRateTypeCode": "01",
			"exchangeRate": 1,
			"exchangeRateDate": "2022-10-24 00:00:00",
			"agreement": "1536752888049568089",
			"agreementCode": "system_0001",
			"dept": "1551794533528764418",
			"deptCode": "SS2",
			"staff": "1577862450987401221",
			"invoiceCode": "110014316011",
			"invoiceNo": "20240806",
			"invoiceType": "1",
			"staffCode": "009",
			"projectCode": "667",
			"project": "1541277369785909249",
			"srcBillType": "1",
			"srcBillId": "2056237265560535041",
			"_status": "Insert",
			"retailer": "哈哈",
			"remarks": "表头备注",
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
					"employee": "1860988069457952782",
					"employeeCode": "aass",
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
					"material": "1551616919384096777",
					"materialCode": "000156",
					"_status": "Insert",
					"srcBillType": "1",
					"retailer": "哈哈",
					"remarks": "表体备注",
					"orderNo": "ddbh002",
					"contractNo": "htbh002",
					"invoiceNo": "20240806",
					"costCenter": "1514492081060257",
					"demanderProCenter": "1473541844244103169",
					"supplierProCenter": "1468336086076358690",
					"grandsonItem": [
						{
							"_status": "Insert",
							"issueNo": 1,
							"startDate": "2023-11-05 00:00:00",
							"expireDate": "9999-12-31 00:00:00",
							"ratio": 100,
							"oriTaxIncludedAmount": 123,
							"localTaxIncludedAmount": 123,
							"blnPrepare": 0,
							"blnDeposit": 0
						}
					],
					"srcBillRowId": "2056237265560535043",
					"invoiceCode": "110014316011",
					"invoiceType": "1",
					"srcBillId": "1728256786694144000"
				}
			]
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
code	string	否	返回码，调用成功时返回200 示例：200
message	string	否	调用返回信息 示例：操作成功
data	object	否	返回数据
count	long	否	数据总条数 示例：1
sucessCount	long	否	成功条数 示例：1
failCount	long	否	失败条数 示例：0
messages	string	是	业务状态信息
infos	object	是	业务数据

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			""
		],
		"infos": [
			{
				"busiObj": "receivable",
				"oriCurrency": "1514492081064640537",
				"financeOrg": "1544896420846764040",
				"extSystemCode": "AB1234",
				"objectType": "0",
				"exchangeRate": 1,
				"customer": "1570200967882211330",
				"extVouchCode": "AB1234",
				"funder": "1732613498433699840",
				"funder_code": "GDFDS234",
				"partner": "1514492081064640537",
				"invoiceCode": "110014316011",
				"orgCurrency": "1514492081064640537",
				"agreement": "1536752888049568089",
				"dept": "1551794533528764418",
				"staff": "1577862450987401221",
				"project": "1541277369785909249",
				"id": "1575441987716775942",
				"localTaxIncludedAmount": 307,
				"invoiceNo": "20240806",
				"bodyItem": [
					{
						"project": "1541277369785909249",
						"staff": "1577862450987401221",
						"dept": "1551794533528764418",
						"oriCurrency": "1514492081064640537",
						"agreement": "1536752888049568089",
						"headerId": "1575441987716775942",
						"objectType": "0",
						"exchangeRate": 1,
						"customer": "1570200967882211330",
						"funder": "1732613498433699840",
						"funder_code": "GDFDS234",
						"partner": "1514492081064640537",
						"material": "1544997490009833473",
						"expenseItem": "1550998530002780169",
						"orgCurrency": "1514492081064640537",
						"id": "1575441987716775943",
						"localTaxIncludedAmount": 30,
						"extendData": {},
						"localTaxAmount": 0,
						"oriTaxExcludedAmount": 30,
						"oriTaxAmount": 0,
						"pubts": "2022-10-24 17:59:46",
						"extRowNo": "AB1234",
						"oriTaxIncludedAmount": 30,
						"org": "1544896420846764040",
						"exchangeRateType": "1514492081064642674",
						"exchangeRateDate": "2022-10-24 00:00:00",
						"createTime": "2022-10-24 17:59:46",
						"localTaxExcludedAmount": 30,
						"verifyState": 0,
						"invoiceType": "1",
						"invoiceNo": "20240806",
						"invoiceCode": "110014316011"
					}
				],
				"extendData": {},
				"billDate": "2022-10-24 00:00:00",
				"srcApp": "94",
				"verifyState": 0,
				"blnWriteOff": false,
				"srcSystem": "2",
				"invoiceType": "1",
				"status": "0",
				"code": "PAYap221024000632",
				"writeOffState": "0",
				"postStatus": "0",
				"cBillNo": "receivable",
				"oriTaxExcludedAmount": 30,
				"effectState": "0",
				"pubts": "2022-10-24 17:59:46",
				"oriTaxIncludedAmount": 30,
				"org": "1544896420846764040",
				"billType": "2614249315406336",
				"bustype": "1514492098255520719",
				"exchangeRateType": "1514492081064642674",
				"exchangeRateDate": "2022-10-24 00:00:00",
				"createTime": "2022-10-24 17:59:46",
				"localTaxExcludedAmount": 30,
				"businessType": "0",
				"data": {
					"sourceUnique": "1858115999048400885",
					"targetUnique": "1858115999048400905"
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
999	开票组织不允许为空!	请求参数中输入开票组织id

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-07-02	
更新
请求说明
更新
请求参数 data

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

