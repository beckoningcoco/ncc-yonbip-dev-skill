---
title: "付款退款单详情查询"
apiId: "1574672930886909954"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Payment Refund Note"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Payment Refund Note]
platform_version: "BIP"
source_type: community-api-docs
---

# 付款退款单详情查询

> `ContentType	application/json` 请求方式	GET | 分类: Payment Refund Note (EFI)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/EFI/apRefund/detail

请求方式	GET

ContentType	application/json

应用场景	开放API/集成API

API类别	详情查询

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | string | query | 是 | 付款退款单id    示例: 1572409517496336389 |

## 3. 请求示例

Url: /yonbip/EFI/apRefund/detail?access_token=访问令牌&id=1572409517496336389

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用返回信息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| partner_name | string | 否 | 业务伙伴名称 示例：业务伙伴-北京 |
| funderBankAccount_no | string | 否 | 资金业务对象银行账号 示例：44444567 |
| funderBankAccount_name | string | 否 | 资金业务对象银行账户名称 示例：2222 |
| extSystemCode | string | 否 | 外部系统编码 示例：AB1234 |
| extVouchCode | string | 否 | 外部系统单号 示例：AB1234 |
| funderBankAccount | string | 否 | 资金业务对象银行账户id 示例：1723022054772441095 |
| funder | string | 否 | 资金业务对象id 示例：1723023935968116743 |
| funder_name | string | 否 | 资金业务对象名称 示例：ljmLLLL |
| funder_code | string | 否 | 资金业务对象编码 示例：ZJDX230511000025 |
| oriCurrency | string | 否 | 原币币种id 示例：1514492081064640537 |
| financeOrg | string | 否 | 付款组织id 示例：1514558842038386692 |
| settleState | string | 否 | 结算状态(枚举值 0:不结算; 1:待结算; 2:结算中; 3:全部成功; 4:部分成功; 5:全部止付) 示例：3 |
| oriOccupyAmount | BigDecimal | 否 | 原币预占用金额 示例：0 |
| modifier | string | 否 | 修改人id 示例：sda132-131fasd |
| orgCurrencyMoneyDigit | long | 否 | 原币金额精度 示例：4 |
| objectType | string | 否 | 往来对象类型(枚举值 0:供应商；2:员工；3:资金业务对象) 示例：0 |
| modifyTime | string | 否 | 修改时间 示例：2022-11-09 00:00:00 |
| financeOrgName | string | 否 | 付款组织名称 示例：雨点儿组织 |
| orgCurrencyName | string | 否 | 本币名称 示例：人民币 |
| exchangeRate | Decimal | 否 | 汇率 示例：1 |
| supplier | string | 否 | 供应商id 示例：1550138497049296898 |
| orgCurrency | string | 否 | 本币id 示例：1514492081064640537 |
| oriCurrencyName | string | 否 | 原币名称 示例：人民币 |
| id | string | 否 | 表头id 示例：1573926886462980105 |
| localTaxIncludedAmount | BigDecimal | 否 | 本币含税金额 示例：100 |
| bodyItem | object | 是 | 表体数据 |
| orgName | string | 否 | 业务组织名称 示例：雨点儿组织 |
| srcAppName | string | 否 | 来源应用 示例：应付管理 |
| billDate | string | 否 | 单据日期(格式为:yyyy-MM-dd HH:mm:ss) 示例：2022-10-22 00:00:00 |
| settleModeServiceAttr | long | 否 | 结算方式业务属性(枚举值 0:银行转账; 1:支票业务; 2:票据业务; 3:返利抵现) 示例：2 |
| srcApp | string | 否 | 来源应用(94:应付管理) 示例：94 |
| verifyState | long | 否 | 审批流状态(枚举值 0:开立; 1:审批中; 2:已审批; 3:终止; 4:已驳回) 示例：1 |
| blnWriteOff | long | 否 | 是否冲销单(0:否; 1:是) 示例：0 |
| settleSubmitType | string | 否 | 提交结算标识(枚举值 0:不提交; 1:待提交; 2:已提交) 示例：1 |
| billTypeName | string | 否 | 单据类型名称 示例：付款退款单 |
| srcSystem | string | 否 | 来源系统(枚举值 0:应收管理; 1:应付管理; 2:模板导入; 3:外部系统导入; 4:销售管理; 5:采购管理; 6:项目管理; 7:库存管理) 示例：1 |
| billTypeCode | string | 否 | 单据类型编码 示例：apRefund |
| code | string | 否 | 单据编号 示例：SREFap221022000563 |
| bustypeCode | string | 否 | 交易类型编码 示例：ap_refpurc |
| creatorUserName | string | 否 | 创建人 示例：雷舒 |
| writeOffState | string | 否 | 冲销状态(枚举值 0:未冲销; 1:已冲销) 示例：0 |
| exchangeRateTypeDigit | long | 否 | 汇率类型精度 示例：6 |
| postStatus | string | 否 | 过账状态(枚举值 0:未过账; 1:过账中; 2:过账成功; 3:过账失败) 示例：0 |
| oriTaxExcludedAmount | BigDecimal | 否 | 原币无税金额 示例：100 |
| supplierCode | string | 否 | 供应商编码 示例：0011000023 |
| settleModeCode | string | 否 | 结算方式编码 示例：system_0004 |
| exchangeRateTypeName | string | 否 | 汇率类型名称 示例：基准汇率 |
| settleMode | string | 否 | 结算方式id 示例：1514492098231927566 |
| orgCode | string | 否 | 业务组织编码 示例：11 |
| oriCurrencyMoneyDigit | long | 否 | 原币金额精度 示例：4 |
| effectState | string | 否 | 生效状态(枚举值 0:未生效; 1:已生效) 0 示例：0 |
| pubts | string | 否 | 时间戳(格式为:yyyy-MM-dd HH:mm:ss) 示例：2022-10-22 17:20:58 |
| oriTaxIncludedAmount | BigDecimal | 否 | 退款金额 示例：100 |
| supplierName | string | 否 | 供应商名称 示例：散户供应商 |
| creator | string | 否 | 创建人id 示例：cc4f9a8e-aad9-46b8-9ecb-fd61d738754a |
| financeOrgCode | string | 否 | 付款组织编码 示例：11 |
| org | string | 否 | 业务组织id 示例：1514558842038386692 |
| billType | string | 否 | 单据类型 示例：2614250133869056 |
| supplierBankAccount | string | 否 | 供应商银行账户id 示例：1550139003855437829 |
| settleModeName | string | 否 | 结算方式名称 示例：票据结算 |
| bustypeName | string | 否 | 交易类型名称 示例：采购退款 |
| bustype | string | 否 | 交易类型id 示例：1514492098255520722 |
| supplierBankAccountName | string | 否 | 供应商银行账户 示例：44444 |
| orgCurrencyCode | string | 否 | 本币简称 示例：CNY |
| exchangeRateType | string | 否 | 汇率类型 示例：0000L6D9B8DDEQ7W2Z0000 |
| supplierBankAccountNo | string | 否 | 供应商银行账号 示例：3333333 |
| exchangeRateDate | string | 否 | 汇率日期(格式为:yyyy-MM-dd HH:mm:ss) 示例：2022-10-22 00:00:00 |
| supplierRetailInvestors | boolean | 否 | 是否散户(true:是; false:否) 示例：true |
| createTime | string | 否 | 创建时间(格式为:yyyy-MM-dd HH:mm:ss) 示例：2022-10-22 17:00:05 |
| oriCurrencyCode | string | 否 | 币种简称 示例：CNY |
| canWithDraw | long | 否 | 是否可撤销(1:是; 0:否) 示例：1 |
| localTaxExcludedAmount | BigDecimal | 否 | 本币无税金额 示例：100 |
| businessType | string | 否 | 业务类型(枚举值 0:应收发票; 1:收款单; 2:收款退款; 3:应付发票; 4:付款单; 5:付款退款) 示例：5 |
| exchangeRateTypeCode | string | 否 | 汇率类型编码 示例：01 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"partner_name": "业务伙伴-北京",
		"funderBankAccount_no": "44444567",
		"funderBankAccount_name": "2222",
		"extSystemCode": "AB1234",
		"extVouchCode": "AB1234",
		"funderBankAccount": "1723022054772441095",
		"funder": "1723023935968116743",
		"funder_name": "ljmLLLL",
		"funder_code": "ZJDX230511000025",
		"oriCurrency": "1514492081064640537",
		"financeOrg": "1514558842038386692",
		"settleState": "3",
		"oriOccupyAmount": 0,
		"modifier": "sda132-131fasd",
		"orgCurrencyMoneyDigit": 4,
		"objectType": "0",
		"modifyTime": "2022-11-09 00:00:00",
		"financeOrgName": "雨点儿组织",
		"orgCurrencyName": "人民币",
		"exchangeRate": 1,
		"supplier": "1550138497049296898",
		"orgCurrency": "1514492081064640537",
		"oriCurrencyName": "人民币",
		"id": "1573926886462980105",
		"localTaxIncludedAmount": 100,
		"bodyItem": [
			{
				"partner": "1664394763341660162",
				"partner_name": "业务伙伴-北京",
				"funderBankAccount_no": "44444567",
				"funderBankAccount_name": "2222",
				"funderBankAccount": "1723022054772441095",
				"funder": "1723023935968116743",
				"funder_name": "ljmLLLL",
				"funder_code": "ZJDX230511000025",
				"oriCurrency": "1514492081064640537",
				"quickTypeCode": "3",
				"settleState": "3",
				"blnSettlePatch": 1,
				"oriOccupyAmount": 0,
				"orgCurrencyMoneyDigit": 4,
				"headerId": "1573926886462980105",
				"objectType": "0",
				"orgCurrencyName": "人民币",
				"exchangeRate": 1,
				"supplier": "1550138497049296898",
				"orgCurrency": "1514492081064640537",
				"oriCurrencyName": "人民币",
				"id": "1573926886462980106",
				"localTaxIncludedAmount": 100,
				"orgName": "雨点儿组织",
				"settleModeServiceAttr": 2,
				"quickTypeName": "费用",
				"extRowNo": "AB1234",
				"localTaxAmount": 0,
				"taxRate": 0,
				"exchangeRateTypeDigit": 6,
				"oriTaxExcludedAmount": 100,
				"settleModeCode": "system_0004",
				"supplierCode": "0011000023",
				"quickType": "1514492089653002551",
				"oriTaxAmount": 0,
				"exchangeRateTypeName": "基准汇率",
				"settleMode": "1514492098231927566",
				"orgCode": "11",
				"oriCurrencyMoneyDigit": 4,
				"expireDate": "2022-10-22 00:00:00",
				"pubts": "2022-10-22 17:00:08",
				"oriTaxIncludedAmount": 100,
				"supplierName": "散户供应商",
				"org": "1514558842038386692",
				"supplierBankAccount": "1550139003855437829",
				"settleModeName": "票据结算",
				"supplierBankAccountName": "44444",
				"orgCurrencyCode": "CNY",
				"exchangeRateType": "0000L6D9B8DDEQ7W2Z0000",
				"supplierBankAccountNo": "3333333",
				"exchangeRateDate": "2022-10-22 00:00:00",
				"supplierRetailInvestors": true,
				"oriCurrencyCode": "CNY",
				"localTaxExcludedAmount": 100,
				"exchangeRateTypeCode": "01"
			}
		],
		"orgName": "雨点儿组织",
		"srcAppName": "应付管理",
		"billDate": "2022-10-22 00:00:00",
		"settleModeServiceAttr": 2,
		"srcApp": "94",
		"verifyState": 1,
		"blnWriteOff": 0,
		"settleSubmitType": "1",
		"billTypeName": "付款退款单",
		"srcSystem": "1",
		"billTypeCode": "apRefund",
		"code": "SREFap221022000563",
		"bustypeCode": "ap_refpurc",
		"creatorUserName": "雷舒",
		"writeOffState": "0",
		"exchangeRateTypeDigit": 6,
		"postStatus": "0",
		"oriTaxExcludedAmount": 100,
		"supplierCode": "0011000023",
		"settleModeCode": "system_0004",
		"exchangeRateTypeName": "基准汇率",
		"settleMode": "1514492098231927566",
		"orgCode": "11",
		"oriCurrencyMoneyDigit": 4,
		"effectState": "0",
		"pubts": "2022-10-22 17:20:58",
		"oriTaxIncludedAmount": 100,
		"supplierName": "散户供应商",
		"creator": "cc4f9a8e-aad9-46b8-9ecb-fd61d738754a",
		"financeOrgCode": "11",
		"org": "1514558842038386692",
		"billType": "2614250133869056",
		"supplierBankAccount": "1550139003855437829",
		"settleModeName": "票据结算",
		"bustypeName": "采购退款",
		"bustype": "1514492098255520722",
		"supplierBankAccountName": "44444",
		"orgCurrencyCode": "CNY",
		"exchangeRateType": "0000L6D9B8DDEQ7W2Z0000",
		"supplierBankAccountNo": "3333333",
		"exchangeRateDate": "2022-10-22 00:00:00",
		"supplierRetailInvestors": true,
		"createTime": "2022-10-22 17:00:05",
		"oriCurrencyCode": "CNY",
		"canWithDraw": 1,
		"localTaxExcludedAmount": 100,
		"businessType": "5",
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

