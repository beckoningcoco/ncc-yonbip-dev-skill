---
title: "应收结算清单详情查询"
apiId: "1634710483430277123"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "AR Invoices"
domain: "CLMS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, AR Invoices]
platform_version: "BIP"
source_type: community-api-docs
---

# 应收结算清单详情查询

> `ContentType	application/json` 请求方式	GET | 分类: AR Invoices (CLMS)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/EFI/receivable/detail

请求方式	GET

ContentType	application/json

应用场景	开放API/集成API

API类别	详情查询

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | string | query | 是 | 单据id    示例: 1572409517496336389 |

## 3. 请求示例

Url: /yonbip/EFI/receivable/detail?access_token=访问令牌&id=1572409517496336389

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用返回信息 示例：操作成功 |
| data | object | 否 | 调用成功时的返回应收发票数据 |
| extVouchCode | string | 否 | 外部系统单号 示例：AB1234 |
| extSystemCode | string | 否 | 外部系统编码 示例：AB1234 |
| oriCurrency | string | 否 | 原币币种id 示例：1601993398256926720 |
| financeOrg | string | 否 | 开票组织id 示例：1514558842038386692 |
| orgCurrencyMoneyDigit | int | 否 | 本币金额精度 示例：7 |
| customerRetailInvestors | boolean | 否 | 是否散户(true:是; false:否) 示例：false |
| objectType | string | 否 | 往来对象类型(枚举值 1:客户; 2:员工 3：资金业务对象) 示例：1 |
| financeOrgName | string | 否 | 开票组织名称 示例：雨点儿组织 |
| orgCurrencyName | string | 否 | 本币币种 示例：人民币 |
| modifyTime | string | 否 | 修改时间 示例：2022-12-08 23:59:59 |
| exchangeRate | Decimal | 否 | 汇率 示例：1 |
| orgCurrency | string | 否 | 本币币种id 示例：1514492081064640537 |
| modifier | string | 否 | 修改人id 示例：9dff758d-bfc2-4b90-ac4c-e47fb0fc9bf3 |
| oriCurrencyName | string | 否 | 原币币种 示例：新币 |
| id | string | 否 | 表头主键 示例：1634713386822402050 |
| modifierUserName | string | 否 | 修改人编码 示例：LRQ |
| localTaxIncludedAmount | BigDecimal | 否 | 本币含税金额 示例：100 |
| bodyItem | object | 是 | 表体对象 |
| orgName | string | 否 | 业务组织 示例：雨点儿组织 |
| srcAppName | string | 否 | 来源应用名称 示例：应收管理 |
| oriCurrencyPriceDigit | int | 否 | 原币单价精度 示例：2 |
| billDate | string | 否 | 单据日期(格式为:yyyy-MM-dd HH:mm:ss) 示例：2023-01-12 00:00:00 |
| srcApp | string | 否 | 来源应用(枚举值 95:应收管理;94:应付管理;125:采购管理;123:项目采购;145:合同中心;143:销售合同;130:委外管理;102:现金管理;131:销售管理;127:库存管理;132:供应链费用) 示例：95 |
| verifyState | long | 否 | 审批流状态(枚举值 0:开立; 1:审批中; 2:已审批; 3:终止; 4:已驳回) 示例：0 |
| customerName | string | 否 | 客户名称 示例：账表客户AAA |
| partner_name | string | 否 | 业务伙伴名称 |
| funder_name | string | 否 | 资金业务对象名称 |
| blnWriteOff | long | 否 | 冲销状态(枚举值 0:未冲销; 1:已冲销；2：部分冲销) 示例：0 |
| billTypeName | string | 否 | 单据类型 示例：应收发票 |
| srcSystem | string | 否 | 来源系统(枚举值 0:应收管理; 1:应付管理; 2:模板导入; 3:外部系统导入; 4:销售管理; 5:采购管理; 6:项目管理; 7:库存管理) 示例：0 |
| billTypeCode | string | 否 | 单据类型编码 示例：receivable |
| code | string | 否 | 单据编号 示例：OAR230112004937 |
| creatorUserName | string | 否 | 创建人 示例：昵称-雷舒 |
| bustypeCode | string | 否 | 交易类型编码 示例：ar_invoice |
| writeOffState | string | 否 | 冲销状态(枚举值 0:未冲销; 1:已冲销；2：部分冲销) 示例：0 |
| orgCurrencyPriceDigit | int | 否 | 原币单价精度 示例：6 |
| exchangeRateTypeDigit | int | 否 | 汇率类型精度 示例：6 |
| postStatus | string | 否 | 过账状态(枚举值 0:未过账;1:过账中;2:过账成功;3:过账失败;4:不过账) 示例：0 |
| oriTaxExcludedAmount | BigDecimal | 否 | 原币无税金额 示例：100 |
| customerCode | string | 否 | 客户编码 示例：001363 |
| partner_code | string | 否 | 业务伙伴编码 示例：23sdaa2vbva |
| funder_code | string | 否 | 资金业务对象编码 示例：sfds213-23121 |
| exchangeRateTypeName | string | 否 | 汇率类型名称 示例：用户自定义汇率 |
| orgCode | string | 否 | 业务组织编码 示例：11 |
| oriCurrencyMoneyDigit | int | 否 | 原币金额精度 示例：0 |
| effectState | string | 否 | 生效状态(枚举值 0:未生效; 1:已生效) 示例：0 |
| pubts | string | 否 | 时间戳(格式为:yyyy-MM-dd HH:mm:ss) 示例：2023-01-12 14:41:26 |
| oriTaxIncludedAmount | BigDecimal | 否 | 原币含税金额 示例：100 |
| direction | string | 否 | 单据方向(枚举值 -1:红字;1:蓝字) 示例：1 |
| creator | string | 否 | 创建人id 示例：cc4f9a8e-aad9-46b8-9ecb-fd61d738754a |
| financeOrgCode | string | 否 | 开票组织编码 示例：11 |
| org | string | 否 | 业务组织id 示例：1514558842038386692 |
| billType | string | 否 | 单据类型id 示例：2614099822008320 |
| bustypeName | string | 否 | 交易类型名称 示例：应收发票 |
| bustype | string | 否 | 交易类型id 示例：1514492098255520712 |
| orgCurrencyCode | string | 否 | 本币简称 示例：CNY |
| exchangeRateType | string | 否 | 汇率类型id 示例：1514492081064642674 |
| exchangeRateDate | string | 否 | 汇率日期(格式为:yyyy-MM-dd HH:mm:ss) 示例：2023-01-12 00:00:00 |
| createTime | string | 否 | 创建时间(格式为:yyyy-MM-dd HH:mm:ss) 示例：2023-01-12 14:41:25 |
| oriCurrencyCode | string | 否 | 原币编码 示例：新币 |
| localTaxExcludedAmount | BigDecimal | 否 | 本币无税金额 示例：100 |
| businessType | string | 否 | 业务类型(枚举值 0:应收发票; 1:收款单; 2:收款退款; 3:应付发票; 4:付款单; 5:付款退款) 示例：0 |
| exchangeRateTypeCode | string | 否 | 汇率类型编码 示例：02 |
| partner | string | 否 | 业务伙伴id 示例：9246335664 |
| funder | string | 否 | 资金业务对象id 示例：66asfas3 |
| customer | string | 否 | 客户id 示例：1621989451710332935 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"extVouchCode": "AB1234",
		"extSystemCode": "AB1234",
		"oriCurrency": "1601993398256926720",
		"financeOrg": "1514558842038386692",
		"orgCurrencyMoneyDigit": 7,
		"customerRetailInvestors": false,
		"objectType": "1",
		"financeOrgName": "雨点儿组织",
		"orgCurrencyName": "人民币",
		"modifyTime": "2022-12-08 23:59:59",
		"exchangeRate": 1,
		"orgCurrency": "1514492081064640537",
		"modifier": "9dff758d-bfc2-4b90-ac4c-e47fb0fc9bf3",
		"oriCurrencyName": "新币",
		"id": "1634713386822402050",
		"modifierUserName": "LRQ",
		"localTaxIncludedAmount": 100,
		"bodyItem": [
			{
				"oriCurrency": "1601993398256926720",
				"supplierProCenterName": "对照D004委托因素为空",
				"orgCurrencyMoneyDigit": 7,
				"customerRetailInvestors": false,
				"headerId": "1634713386822402050",
				"objectType": "1",
				"orgCurrencyName": "人民币",
				"exchangeRate": 1,
				"orgCurrency": "1514492081064640537",
				"oriCurrencyName": "新币",
				"id": "1634713386822402052",
				"demanderProCenter": "1531402741714780162",
				"localTaxIncludedAmount": 100,
				"supplierProCenterCode": "D004",
				"orgName": "雨点儿组织",
				"taxSubject": "1514492081064642682",
				"oriCurrencyPriceDigit": 2,
				"extRowNo": "AB1234",
				"customerName": "账表客户AAA",
				"funder_name": "",
				"partner_name": "",
				"localTaxAmount": 0,
				"grandsonItem": [
					{
						"localTaxIncludedAmount": 100,
						"rowNo": 10,
						"accountDate": "2023-01-12 00:00:00",
						"blnDeposit": 0,
						"issueNo": 1,
						"headerId": "1634713386822402050",
						"convertWay": "0",
						"expireDate": "9999-12-31 00:00:00",
						"id": "1634713386822402049",
						"bodyId": "1634713386822402052",
						"pubts": "2023-01-12 14:41:26",
						"startDate": "2023-01-12 00:00:00",
						"oriTaxIncludedAmount": 100,
						"ratio": 100,
						"blnPrepare": 0
					}
				],
				"taxRate": 0,
				"demanderProCenterName": "雨点儿利润中心",
				"startDate": "2023-01-12 00:00:00",
				"rowNo": 10,
				"orgCurrencyPriceDigit": 6,
				"exchangeRateTypeDigit": 6,
				"oriTaxExcludedAmount": 100,
				"customerCode": "001363",
				"funder_code": "",
				"partner_code": "",
				"supplierProCenter": "1623549246393286665",
				"oriTaxAmount": 0,
				"exchangeRateTypeName": "用户自定义汇率",
				"orgCode": "2235",
				"taxSubjectCode": "VAT0",
				"oriCurrencyMoneyDigit": 0,
				"pubts": "2023-01-12 14:41:26",
				"oriTaxIncludedAmount": 100,
				"org": "1514558842038386692",
				"demanderProCenterCode": "0826",
				"orgCurrencyCode": "CNY",
				"taxSubjectName": "0%",
				"exchangeRateType": "1514492081064642674",
				"exchangeRateDate": "2023-01-12 00:00:00",
				"oriCurrencyCode": "新币",
				"localTaxExcludedAmount": 100,
				"funder": "",
				"partner": "",
				"exchangeRateTypeCode": "02",
				"customer": "1621989451710332935"
			}
		],
		"orgName": "雨点儿组织",
		"srcAppName": "应收管理",
		"oriCurrencyPriceDigit": 2,
		"billDate": "2023-01-12 00:00:00",
		"srcApp": "95",
		"verifyState": 0,
		"customerName": "账表客户AAA",
		"partner_name": "",
		"funder_name": "",
		"blnWriteOff": 0,
		"billTypeName": "应收发票",
		"srcSystem": "0",
		"billTypeCode": "receivable",
		"code": "OAR230112004937",
		"creatorUserName": "昵称-雷舒",
		"bustypeCode": "ar_invoice",
		"writeOffState": "0",
		"orgCurrencyPriceDigit": 6,
		"exchangeRateTypeDigit": 6,
		"postStatus": "0",
		"oriTaxExcludedAmount": 100,
		"customerCode": "001363",
		"partner_code": "23sdaa2vbva",
		"funder_code": "sfds213-23121",
		"exchangeRateTypeName": "用户自定义汇率",
		"orgCode": "11",
		"oriCurrencyMoneyDigit": 0,
		"effectState": "0",
		"pubts": "2023-01-12 14:41:26",
		"oriTaxIncludedAmount": 100,
		"direction": "1",
		"creator": "cc4f9a8e-aad9-46b8-9ecb-fd61d738754a",
		"financeOrgCode": "11",
		"org": "1514558842038386692",
		"billType": "2614099822008320",
		"bustypeName": "应收发票",
		"bustype": "1514492098255520712",
		"orgCurrencyCode": "CNY",
		"exchangeRateType": "1514492081064642674",
		"exchangeRateDate": "2023-01-12 00:00:00",
		"createTime": "2023-01-12 14:41:25",
		"oriCurrencyCode": "新币",
		"localTaxExcludedAmount": 100,
		"businessType": "0",
		"exchangeRateTypeCode": "02",
		"partner": "9246335664",
		"funder": "66asfas3",
		"customer": "1621989451710332935"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	当前单据被删除或没有权限	查看请求数据是否正确


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-02

更新

请求说明


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

