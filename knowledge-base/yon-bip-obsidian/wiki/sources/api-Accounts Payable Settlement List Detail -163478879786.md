---
title: "应付结算清单详情查询"
apiId: "1634788797863952389"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "AP Invoices"
domain: "CLMS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, AP Invoices]
platform_version: "BIP"
source_type: community-api-docs
---

# 应付结算清单详情查询

>  请求方式	GET | AP Invoices (CLMS)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/EFI/payable/detail
请求方式	GET
ContentType	application/json
应用场景	开放API/集成API
API类别	详情查询
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
id	string	query	是	单据id    示例: 1572409517496336389

## 3. 请求示例

Url: /yonbip/EFI/payable/detail?access_token=访问令牌&id=1572409517496336389

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
data	object	否	返回应付结算清单数据
extSystemCode	string	否	外部系统编码 示例：AB1234
extVouchCode	string	否	外部系统单号 示例：AB1234
partner	string	否	业务伙伴id 示例：1664394763341660162
partner_name	string	否	业务伙伴名称 示例：业务伙伴-北京
funder_name	string	否	资金业务对象名称 示例：ljmLLLL
funder_code	string	否	资金业务对象编码 示例：ZJDX230511000025
funder	string	否	资金业务对象id 示例：1723023935968116743
modifyTime	string	否	修改日期 示例：2023-08-09 14:34:43
oriCurrency	string	否	原币币种id 示例：1514492081064640537
financeOrg	string	否	收票组织id 示例：1514558842038386692
orgCurrencyMoneyDigit	int	否	本币金额精度 示例：7
objectType	string	否	往来对象类型(枚举值 0:供应商；2:员工；3:资金业务对象) 示例：0
modifier	string	否	修改人id 示例：9dff758d-bfc2-4b90-ac4c-e47fb0fc9bf3
financeOrgName	string	否	收票组织名称 示例：雨点儿组织
orgCurrencyName	string	否	本币 示例：人民币
exchangeRate	Decimal	否	汇率 示例：1
supplier	string	否	供应商id 示例：1614667820855984133
orgCurrency	string	否	本币id 示例：1514492081064640537
oriCurrencyName	string	否	原币 示例：人民币
id	string	否	单据id 示例：1632530821880479754
localTaxIncludedAmount	BigDecimal	否	本币含税金额 示例：1000
bodyItem	object	是	表体数据
orgName	string	否	业务组织 示例：雨点儿组织
srcAppName	string	否	来源应用 示例：应付管理
oriCurrencyPriceDigit	int	否	原币单价精度 示例：6
billDate	string	否	单据日期(格式为:yyyy-MM-dd HH:mm:ss) 示例：2023-01-09 00:00:00
srcApp	string	否	来源应用(枚举值 95:应收管理;94:应付管理;125:采购管理;123:项目采购;145:合同中心;143:销售合同;130:委外管理;102:现金管理;131:销售管理;127:库存管理;132:供应链费用) 示例：94
verifyState	int	否	单据状态(枚举值 0:开立; 1:审批中; 2:已审批; 3:终止; 4:已驳回) 示例：0
blnWriteOff	int	否	冲销状态(枚举值 0:未冲销; 1:已冲销；2：部分冲销) 示例：0
billTypeName	string	否	单据类型 示例：应付发票
srcSystem	string	否	来源系统(枚举值 0:应收管理; 1:应付管理; 2:模板导入; 3:外部系统导入; 4:销售管理; 5:采购管理; 6:项目管理; 7:库存管理) 示例：1
billTypeCode	string	否	单据类型编码 示例：payable
code	string	否	单据编号 示例：OAPap230109012075
creatorUserName	string	否	创建人 示例：昵称-程相真
bustypeCode	string	否	交易类型编码 示例：ap_invoice
writeOffState	string	否	冲销状态(枚举值 0:未冲销; 1:已冲销；2：部分冲销) 示例：0
orgCurrencyPriceDigit	int	否	本币单价精度 示例：6
exchangeRateTypeDigit	int	否	汇率类型精度 示例：7
postStatus	string	否	过账状态(枚举值 0:未过账;1:过账中;2:过账成功;3:过账失败;4:不过账) 示例：0
oriTaxExcludedAmount	BigDecimal	否	原币无税金额 示例：943.3962264
supplierCode	string	否	供应商编码 示例：LSDSJ002
exchangeRateTypeName	string	否	汇率类型 示例：基准汇率
orgCode	string	否	业务组织编码 示例：11
oriCurrencyMoneyDigit	int	否	原币金额精度 示例：7
effectState	string	否	生效状态(枚举值 0:未生效; 1:已生效) 示例：0
pubts	string	否	时间戳(格式为:yyyy-MM-dd HH:mm:ss) 示例：2023-01-09 16:06:41
oriTaxIncludedAmount	BigDecimal	否	原币含税金额 示例：1000
direction	string	否	单据方向(枚举值 -1:红字;1:蓝字) 示例：1
supplierName	string	否	供应商名称 示例：LS供应商02
creator	string	否	创建人id 示例：3fedff26-29d5-405e-ae01-eadd2b8d1778
financeOrgCode	string	否	收票组织编码 示例：11
org	string	否	业务组织id 示例：1514558842038386692
billType	string	否	单据类型 示例：2614247099060992
bustypeName	string	否	交易类型名称 示例：应付发票
bustype	string	否	交易类型id 示例：1514492098255520718
orgCurrencyCode	string	否	本币简称 示例：CNY
exchangeRateType	string	否	汇率类型 示例：0000L6D9B8DDEQ7W2Z0000
exchangeRateDate	string	否	汇率日期(格式为:yyyy-MM-dd HH:mm:ss) 示例：2023-01-09 00:00:00
createTime	string	否	创建时间(格式为:yyyy-MM-dd HH:mm:ss) 示例：2023-01-09 16:06:41
oriCurrencyCode	string	否	原币简称 示例：CNY
localTaxExcludedAmount	BigDecimal	否	本币无税金额 示例：943.3962264
businessType	string	否	业务类型(枚举值 0:应收发票; 1:收款单; 2:收款退款; 3:应付发票; 4:付款单; 5:付款退款) 示例：3
exchangeRateTypeCode	string	否	汇率类型编码 示例：01
invoiceNo	string	否	发票编号 示例：1234
invoiceType	string	否	发票类型 示例：0

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"extSystemCode": "AB1234",
		"extVouchCode": "AB1234",
		"partner": "1664394763341660162",
		"partner_name": "业务伙伴-北京",
		"funder_name": "ljmLLLL",
		"funder_code": "ZJDX230511000025",
		"funder": "1723023935968116743",
		"modifyTime": "2023-08-09 14:34:43",
		"oriCurrency": "1514492081064640537",
		"financeOrg": "1514558842038386692",
		"orgCurrencyMoneyDigit": 7,
		"objectType": "0",
		"modifier": "9dff758d-bfc2-4b90-ac4c-e47fb0fc9bf3",
		"financeOrgName": "雨点儿组织",
		"orgCurrencyName": "人民币",
		"exchangeRate": 1,
		"supplier": "1614667820855984133",
		"orgCurrency": "1514492081064640537",
		"oriCurrencyName": "人民币",
		"id": "1632530821880479754",
		"localTaxIncludedAmount": 1000,
		"bodyItem": [
			{
				"partner": "1664394763341660162",
				"partner_name": "业务伙伴-北京",
				"funder_name": "ljmLLLL",
				"funder_code": "ZJDX230511000025",
				"funder": "1723023935968116743",
				"oriCurrency": "1514492081064640537",
				"localNonDeductTax": 0,
				"orgCurrencyMoneyDigit": 7,
				"headerId": "1632530821880479754",
				"objectType": "0",
				"orgCurrencyName": "人民币",
				"exchangeRate": 1,
				"supplier": "1614667820855984133",
				"orgCurrency": "1514492081064640537",
				"oriCurrencyName": "人民币",
				"id": "1632530821880479756",
				"localTaxIncludedAmount": 1000,
				"nonDeductTaxRate": 0,
				"orgName": "雨点儿组织",
				"taxSubject": "1514492081064642680",
				"unitName": "小时",
				"oriCurrencyPriceDigit": 6,
				"blnDeductTax": 1,
				"extRowNo": "AB1234",
				"localTaxAmount": 56.6037736,
				"grandsonItem": [
					{
						"localTaxIncludedAmount": 1000,
						"rowNo": 20,
						"accountDate": "2023-01-09 00:00:00",
						"blnDeposit": 0,
						"issueNo": 1,
						"headerId": "1632530821880479754",
						"convertWay": "0",
						"expireDate": "9999-12-31 00:00:00",
						"id": "1632530821880479753",
						"bodyId": "1632530821880479756",
						"pubts": "2023-01-09 16:06:41",
						"startDate": "2023-01-09 00:00:00",
						"oriTaxIncludedAmount": 1000,
						"ratio": 100,
						"blnPrepare": 0
					}
				],
				"taxRate": 6,
				"materialName": "白茶",
				"unit": "1514492081052057606",
				"deductTaxType": "0",
				"startDate": "2023-01-09 00:00:00",
				"rowNo": 20,
				"orgCurrencyPriceDigit": 6,
				"exchangeRateTypeDigit": 7,
				"oriTaxExcludedAmount": 943.3962264,
				"supplierCode": "LSDSJ002",
				"oriTaxAmount": 56.6037736,
				"exchangeRateTypeName": "基准汇率",
				"taxSubjectCode": "VAT6",
				"orgCode": "11",
				"oriCurrencyMoneyDigit": 7,
				"pubts": "2023-01-09 16:06:41",
				"oriTaxIncludedAmount": 1000,
				"supplierName": "LS供应商02",
				"oriNonDeductTax": 0,
				"quantity": 200,
				"oriTaxIncludedPrice": 5,
				"org": "1514558842038386692",
				"materialCode": "000023",
				"localTaxExcludedPrice": 4.716981,
				"unitPrecision": 7,
				"orgCurrencyCode": "CNY",
				"taxSubjectName": "6%",
				"exchangeRateType": "0000L6D9B8DDEQ7W2Z0000",
				"material": "1528442847798231042",
				"exchangeRateDate": "2023-01-09 00:00:00",
				"oriTaxExcludedPrice": 4.716981,
				"oriCurrencyCode": "CNY",
				"localTaxExcludedAmount": 943.3962264,
				"localTaxIncludedPrice": 5,
				"exchangeRateTypeCode": "01"
			}
		],
		"orgName": "雨点儿组织",
		"srcAppName": "应付管理",
		"oriCurrencyPriceDigit": 6,
		"billDate": "2023-01-09 00:00:00",
		"srcApp": "94",
		"verifyState": 0,
		"blnWriteOff": 0,
		"billTypeName": "应付发票",
		"srcSystem": "1",
		"billTypeCode": "payable",
		"code": "OAPap230109012075",
		"creatorUserName": "昵称-程相真",
		"bustypeCode": "ap_invoice",
		"writeOffState": "0",
		"orgCurrencyPriceDigit": 6,
		"exchangeRateTypeDigit": 7,
		"postStatus": "0",
		"oriTaxExcludedAmount": 943.3962264,
		"supplierCode": "LSDSJ002",
		"exchangeRateTypeName": "基准汇率",
		"orgCode": "11",
		"oriCurrencyMoneyDigit": 7,
		"effectState": "0",
		"pubts": "2023-01-09 16:06:41",
		"oriTaxIncludedAmount": 1000,
		"direction": "1",
		"supplierName": "LS供应商02",
		"creator": "3fedff26-29d5-405e-ae01-eadd2b8d1778",
		"financeOrgCode": "11",
		"org": "1514558842038386692",
		"billType": "2614247099060992",
		"bustypeName": "应付发票",
		"bustype": "1514492098255520718",
		"orgCurrencyCode": "CNY",
		"exchangeRateType": "0000L6D9B8DDEQ7W2Z0000",
		"exchangeRateDate": "2023-01-09 00:00:00",
		"createTime": "2023-01-09 16:06:41",
		"oriCurrencyCode": "CNY",
		"localTaxExcludedAmount": 943.3962264,
		"businessType": "3",
		"exchangeRateTypeCode": "01",
		"invoiceNo": "1234",
		"invoiceType": "0"
	}
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
999	当前单据被删除或没有权限	查看请求数据是否正确

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-07-02	
更新
请求说明
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

