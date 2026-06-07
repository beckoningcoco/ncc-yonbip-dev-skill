---
title: "付款单详情查询"
apiId: "1573891367098122244"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Payment Document"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Payment Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 付款单详情查询

> `ContentType	application/json` 请求方式	GET | 分类: Payment Document (EFI)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/EFI/payment/detail

请求方式	GET

ContentType	application/json

应用场景	开放API/集成API

API类别	详情查询

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | string | query | 是 | 付款单id    示例: 1572409517496336389 |

## 3. 请求示例

Url: /yonbip/EFI/payment/detail?access_token=访问令牌&id=1572409517496336389

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用返回信息 示例：操作成功 |
| data | object | 否 | 返回付款单数据 |
| partner | string | 否 | 业务伙伴id 示例：1664394763341660162 |
| partner_name | string | 否 | 业务伙伴名称 示例：业务伙伴-北京 |
| funderBankAccount_no | string | 否 | 资金业务对象银行账号 示例：44444567 |
| extSystemCode | string | 否 | 外部系统编码 示例：AB1234 |
| extVouchCode | string | 否 | 外部系统单号 示例：AB1234 |
| funderBankAccount_name | string | 否 | 资金业务对象银行账户名称 示例：2222 |
| funderBankAccount | string | 否 | 资金业务对象银行账户id 示例：1723022054772441095 |
| funder | string | 否 | 资金业务对象id 示例：1723023935968116743 |
| funder_name | string | 否 | 资金业务对象名称 示例：ljmLLLL |
| modifier | string | 否 | 修改人id 示例：9dff758d-bfc2-4b90-ac4c-e47fb0fc9bf3 |
| funder_code | string | 否 | 资金业务对象编码 示例：ZJDX230511000025 |
| oriCurrency | string | 否 | 原币币种id 示例：1514492081064640537 |
| modifyTime | string | 否 | 修改时间 示例：2022-12-08 23:59:59 |
| financeOrg | string | 否 | 付款组织id 示例：1544896420846764040 |
| settleState | string | 否 | 结算状态(枚举值 0:不结算; 1:待结算; 3:全部成功; 4:部分成功; 5:全部止付) 示例：0 |
| oriOccupyAmount | BigDecimal | 否 | 原币预占用金额 示例：0 |
| orgCurrencyMoneyDigit | long | 否 | 本币金额精度 示例：4 |
| objectType | string | 否 | 往来对象类型 (枚举值 0:供应商；2:员工；3:资金业务对象) 示例：0 |
| financeOrgName | string | 否 | 付款组织名称 示例：雨点儿0913 |
| orgCurrencyName | string | 否 | 本币名称 示例：人民币 |
| exchangeRate | Decimal | 否 | 汇率 示例：1 |
| supplier | string | 否 | 供应商id 示例：1570200967882211330 |
| orgCurrency | string | 否 | 组织本币id 示例：1514492081064640537 |
| oriCurrencyName | string | 否 | 原币名称 示例：人民币 |
| id | string | 否 | 单据id 示例：1573894236121595905 |
| localTaxIncludedAmount | BigDecimal | 否 | 本币含税金额 示例：30 |
| bodyItem | object | 是 | 表体数据 |
| orgName | string | 否 | 表体业务组织名称 示例：雨点儿0913 |
| srcAppName | string | 否 | 来源应用名称 示例：应付管理 |
| srcBillId | string | 否 | 来源单据id 示例：1728256786694144000 |
| billDate | string | 否 | 单据日期(格式为:yyyy-MM-dd HH:mm:ss) 示例：2022-10-22 00:00:00 |
| srcApp | string | 否 | 来源应用(94:应付管理) 示例：94 |
| srcBillType | string | 否 | 来源单据类型(枚举值 1:销售订单; 2:销售合同; 3:项目收款计划; 4:应收事务; 5:销售退货; 6:应付事务; 7:采购订单; 8:项目付款预测; 9:采购合同; 10:付款申请单; 11:U订货; 12:费用单; 13:采购发票; 14:销售发票; 15:出库单; 16:收款单; 17:采购入库; 18:委外订单; 19:银行到账认领单) |
| verifyState | long | 否 | 审批流状态(枚举值 0:开立; 1:审批中; 2:已审批; 3:终止; 4:已驳回) 示例：0 |
| blnWriteOff | long | 否 | 是否冲销单(0:否; 1:是) 示例：0 |
| settleSubmitType | string | 否 | 提交结算标识(枚举值 0:不提交; 1:待提交; 2:已提交) 示例：1 |
| billTypeName | string | 否 | 单据类型名称 示例：付款单 |
| srcSystem | string | 否 | 来源系统(枚举值 0:应收管理; 1:应付管理; 2:模板导入; 3:外部系统导入; 4:销售管理; 5:采购管理; 6:项目管理; 7:库存管理) 示例：1 |
| billTypeCode | string | 否 | 单据类型编码 示例：payment |
| code | string | 否 | 单据编号 示例：PAYap221022000608 |
| bustypeCode | string | 否 | 交易类型编码 示例：ap_paypurc |
| creatorUserName | string | 否 | 创建人 示例：雷舒 |
| writeOffState | string | 否 | 冲销状态(枚举值 0:未冲销; 1:已冲销) 示例：0 |
| exchangeRateTypeDigit | long | 否 | 汇率类型精度 示例：6 |
| postStatus | string | 否 | 过账状态(枚举值 0:未过账; 1:过账中; 2:过账成功; 3:过账失败) 示例：0 |
| oriTaxExcludedAmount | BigDecimal | 否 | 原币无税金额 示例：30 |
| supplierCode | string | 否 | 供应商编码 示例：0001000111 |
| exchangeRateTypeName | string | 否 | 汇率类型名称 示例：基准汇率 |
| orgCode | string | 否 | 业务组织编码 示例：44 |
| oriCurrencyMoneyDigit | long | 否 | 币种金额精度 示例：4 |
| effectState | string | 否 | 生效状态(枚举值 0:未生效; 1:已生效) 示例：0 |
| pubts | string | 否 | 时间戳(格式为:yyyy-MM-dd HH:mm:ss) 示例：2022-10-22 15:56:44 |
| oriTaxIncludedAmount | BigDecimal | 否 | 付款金额 示例：30 |
| supplierName | string | 否 | 供应商名称 示例：供应商-保定 |
| creator | string | 否 | 创建人id 示例：cc4f9a8e-aad9-46b8-9ecb-fd61d738754a |
| financeOrgCode | string | 否 | 付款组织编码 示例：44 |
| org | string | 否 | 业务组织id 示例：1544896420846764040 |
| billType | string | 否 | 单据类型id 示例：2614249315406336 |
| bustypeName | string | 否 | 交易类型名称 示例：采购付款 |
| bustype | string | 否 | 交易类型id 示例：1514492098255520719 |
| orgCurrencyCode | string | 否 | 本币简称 示例：CNY |
| exchangeRateType | string | 否 | 汇率类型 示例：0000L6D9B8DDEQ7W2Z0000 |
| exchangeRateDate | string | 否 | 汇率日期(格式为:yyyy-MM-dd HH:mm:ss) 示例：2022-10-22 00:00:00 |
| supplierRetailInvestors | boolean | 否 | 是否散户(true:是; false:否) 示例：false |
| createTime | string | 否 | 创建时间(格式为:yyyy-MM-dd HH:mm:ss) 示例：2022-10-22 15:56:44 |
| oriCurrencyCode | string | 否 | 币种简称 示例：CNY |
| localTaxExcludedAmount | BigDecimal | 否 | 本币无税金额 示例：30 |
| businessType | string | 否 | 业务类型(枚举值 0:应收发票; 1:收款单; 2:收款退款; 3:应付发票; 4:付款单; 5:付款退款) 示例：4 |
| exchangeRateTypeCode | string | 否 | 汇率类型编码 示例：01 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"partner": "1664394763341660162",
		"partner_name": "业务伙伴-北京",
		"funderBankAccount_no": "44444567",
		"extSystemCode": "AB1234",
		"extVouchCode": "AB1234",
		"funderBankAccount_name": "2222",
		"funderBankAccount": "1723022054772441095",
		"funder": "1723023935968116743",
		"funder_name": "ljmLLLL",
		"modifier": "9dff758d-bfc2-4b90-ac4c-e47fb0fc9bf3",
		"funder_code": "ZJDX230511000025",
		"oriCurrency": "1514492081064640537",
		"modifyTime": "2022-12-08 23:59:59",
		"financeOrg": "1544896420846764040",
		"settleState": "0",
		"oriOccupyAmount": 0,
		"orgCurrencyMoneyDigit": 4,
		"objectType": "0",
		"financeOrgName": "雨点儿0913",
		"orgCurrencyName": "人民币",
		"exchangeRate": 1,
		"supplier": "1570200967882211330",
		"orgCurrency": "1514492081064640537",
		"oriCurrencyName": "人民币",
		"id": "1573894236121595905",
		"localTaxIncludedAmount": 30,
		"bodyItem": [
			{
				"partner_name": "业务伙伴-北京",
				"partner": "1664394763341660162",
				"funderBankAccount_name": "2222",
				"funderBankAccount_no": "44444567",
				"funderBankAccount": "1723022054772441095",
				"funder_name": "ljmLLLL",
				"funder_code": "ZJDX230511000025",
				"funder": "1723023935968116743",
				"rowNo": 10,
				"oriCurrency": "1514492081064640537",
				"quickTypeCode": "6",
				"settleState": "0",
				"blnSettlePatch": 0,
				"oriOccupyAmount": 0,
				"exchangeRateTypeDigit": 6,
				"oriTaxExcludedAmount": 30,
				"orgCurrencyMoneyDigit": 4,
				"supplierCode": "0001000111",
				"issueNo": 1,
				"headerId": "1573894236121595905",
				"quickType": "1514492089653002546",
				"objectType": "0",
				"oriTaxAmount": 0,
				"orgCurrencyName": "人民币",
				"exchangeRateTypeName": "基准汇率",
				"exchangeRate": 1,
				"orgCode": "44",
				"taxSubjectCode": "VAT0",
				"extRowNo": "AB1234",
				"supplier": "1570200967882211330",
				"orgCurrency": "1514492081064640537",
				"oriCurrencyMoneyDigit": 4,
				"expireDate": "2022-10-22 00:00:00",
				"oriCurrencyName": "人民币",
				"srcBillId": "1728256786694144000",
				"id": "1573894236121595906",
				"pubts": "2022-10-22 15:56:44",
				"oriTaxIncludedAmount": 30,
				"localTaxIncludedAmount": 30,
				"supplierName": "供应商-保定",
				"orgName": "雨点儿0913",
				"taxSubject": "1514492081064642682",
				"org": "1544896420846764040",
				"quickTypeName": "应付款",
				"orgCurrencyCode": "CNY",
				"localTaxAmount": 0,
				"taxSubjectName": "0%",
				"exchangeRateType": "0000L6D9B8DDEQ7W2Z0000",
				"taxRate": 0,
				"exchangeRateDate": "2022-10-22 00:00:00",
				"supplierRetailInvestors": false,
				"oriCurrencyCode": "CNY",
				"localTaxExcludedAmount": 30,
				"exchangeRateTypeCode": "01",
				"srcBillType": "1",
				"srcBillRowId": "20562372655605350"
			}
		],
		"orgName": "雨点儿0913",
		"srcAppName": "应付管理",
		"srcBillId": "1728256786694144000",
		"billDate": "2022-10-22 00:00:00",
		"srcApp": "94",
		"srcBillType": "",
		"verifyState": 0,
		"blnWriteOff": 0,
		"settleSubmitType": "1",
		"billTypeName": "付款单",
		"srcSystem": "1",
		"billTypeCode": "payment",
		"code": "PAYap221022000608",
		"bustypeCode": "ap_paypurc",
		"creatorUserName": "雷舒",
		"writeOffState": "0",
		"exchangeRateTypeDigit": 6,
		"postStatus": "0",
		"oriTaxExcludedAmount": 30,
		"supplierCode": "0001000111",
		"exchangeRateTypeName": "基准汇率",
		"orgCode": "44",
		"oriCurrencyMoneyDigit": 4,
		"effectState": "0",
		"pubts": "2022-10-22 15:56:44",
		"oriTaxIncludedAmount": 30,
		"supplierName": "供应商-保定",
		"creator": "cc4f9a8e-aad9-46b8-9ecb-fd61d738754a",
		"financeOrgCode": "44",
		"org": "1544896420846764040",
		"billType": "2614249315406336",
		"bustypeName": "采购付款",
		"bustype": "1514492098255520719",
		"orgCurrencyCode": "CNY",
		"exchangeRateType": "0000L6D9B8DDEQ7W2Z0000",
		"exchangeRateDate": "2022-10-22 00:00:00",
		"supplierRetailInvestors": false,
		"createTime": "2022-10-22 15:56:44",
		"oriCurrencyCode": "CNY",
		"localTaxExcludedAmount": 30,
		"businessType": "4",
		"exchangeRateTypeCode": "01"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	当前单据被删除或没有权限	查看请求数据是否正确


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

