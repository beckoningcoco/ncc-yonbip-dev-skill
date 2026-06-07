---
title: "应付结算清单批量保存"
apiId: "1858095005236199428"
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

# 应付结算清单批量保存

> `ContentType	application/json` 请求方式	POST | 分类: AP Invoices (CLMS)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/EFI/payable/batchsave

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	批量保存/更新

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 是 | 是 | 应付结算清单数据 |
| funder | string | 否 | 否 | 资金业务对象id(往来对象类型是3时必输：资金业务对象id和资金业务对象编码不能同时为空) 示例：000023 |
| auditor | string | 否 | 否 | 审核人id |
| srcBillId | string | 否 | 否 | 来源单据id 示例：1728256786694144000 |
| invoiceType | string | 否 | 否 | 发票类型 示例：1 |
| creator | string | 否 | 否 | 创建人id |
| extSystemCode | string | 否 | 否 | 外部系统编码（与外部系统单号联合做幂等性校验，有外部系统编码，需有外部系统单号，否则将返回提示） 示例：NC65_UPGRADE |
| extVouchCode | string | 否 | 否 | 外部系统单号（与外部系统编码联合做幂等性校验，有外部系统单号，没有外部系统编码时，将不进行校验） 示例：1861119641471942667 |
| funder_code | string | 否 | 否 | 资金业务对象编码(往来对象类型是3时必输：资金业务对象id和资金业务对象编码不能同时为空) 示例：ZJDX230511000023 |
| financeOrg | string | 否 | 否 | 收票组织 (收票组织id和收票组织编码不能同时为空，id和编码同时存在，以id为准) 示例：1525652227072458756 |
| financeOrgCode | string | 否 | 否 | 收票组织编码 (收票组织id和收票组织编码不能同时为空，id和编码同时存在，以id为准) 示例：pkm00 |
| code | string | 否 | 否 | 单据编号 (设置自动编码时按编码规则取值，接口不用传值；手工编码时需要传值；更新数据时需要传值) 示例：OAPap230317853486 |
| billDate | string | 否 | 是 | 单据日期 (格式为:yyyy-MM-dd HH:mm:ss) 示例：2022-10-24 00:00:00 |
| direction | string | 否 | 是 | 单据方向 (1:蓝字；-1:红字) 示例：1 |
| srcBillType | string | 否 | 否 | 来源单据类型(枚举值 1:销售订单; 2:销售合同; 3:项目收款计划; 4:应收事务; 5:销售退货; 6:应付事务; 7:采购订单; 8:项目付款预测; 9:采购合同; 10:付款申请单; 11:U订货; 12:费用单; 13:采购发票; 14:销售发票; 15:出库单; 16:收款单; 17:采购入库; 18:委外订单; 19:银行到账认领单) 示例：1 |
| bustype | string | 否 | 否 | 交易类型id (交易类型id和交易类型编码不能同时为空，id和编码同时存在，以id为准) 示例：1514492098255520719 |
| bustypeCode | string | 否 | 否 | 交易类型编码 (交易类型id和交易类型编码不能同时为空，id和编码同时存在，以id为准) 示例：ap_invoice |
| org | string | 否 | 否 | 业务组织id (业务组织id和业务组织编码不能同时为空，id和编码同时存在，以id为准) 示例：1525652227072458756 |
| orgCode | string | 否 | 否 | 业务组织编码 (业务组织id和业务组织编码不能同时为空，id和编码同时存在，以id为准) 示例：pkm00 |
| invoiceCode | string | 否 | 否 | 发票代码 示例：110014316011 |
| invoiceNo | string | 否 | 否 | 发票编码 示例：20240806 |
| objectType | string | 否 | 是 | 往来对象类型 (枚举值 0:供应商；2:员工；3:资金业务对象) 示例：0 |
| oriCurrency | string | 否 | 否 | 币种id (币种id和币种简称不能同时为空，id和简称同时存在，以id为准) 示例：1514492081064640537 |
| oriCurrencyCode | string | 否 | 否 | 币种简称 (币种id和币种简称不能同时为空，id和简称同时存在，以id为准) 示例：CNY |
| supplier | string | 否 | 否 | 供应商id (往来对象类型是0时必输：供应商id和供应商编码不能同时为空，id和编码同时存在，以id为准) 示例：1570200967882211330 |
| supplierCode | string | 否 | 否 | 供应商编码 (往来对象类型是0时必输：供应商id和供应商编码不能同时为空，id和编码同时存在，以id为准) 示例：0001000111 |
| employee | string | 否 | 否 | 员工id (往来对象类型是2时必输：员工id和员工编码不能同时为空，id和编码同时存在，以id为准) 示例：1468336011116358677 |
| employeeCode | string | 否 | 否 | 员工编码 (往来对象类型是2时必输：员工id和员工编码不能同时为空，id和编码同时存在，以id为准) 示例：0025 |
| exchangeRate | Decimal | 否 | 是 | 汇率 示例：1 |
| exchangeRateType | string | 否 | 否 | 汇率类型 示例：0000L6D9B8DDEQ7W2Z0000 |
| exchangeRateTypeCode | string | 否 | 否 | 汇率类型编码 示例：01 |
| exchangeRateDate | string | 否 | 否 | 汇率日期 (格式为:yyyy-MM-dd HH:mm:ss) 示例：2022-10-24 00:00:00 |
| dept | string | 否 | 否 | 部门id 示例：1551794533528764418 |
| deptCode | string | 否 | 否 | 部门编码 示例：SS2 |
| staff | string | 否 | 否 | 业务员id 示例：1577862450987401221 |
| staffCode | string | 否 | 否 | 业务员编码 示例：009 |
| projectCode | string | 否 | 否 | 项目编码 示例：667 |
| project | string | 否 | 否 | 项目id 示例：1541277369785909249 |
| orderNo | string | 否 | 否 | 订单编号 示例：dd002 |
| remarks | string | 否 | 否 | 备注 示例：这是发票 |
| agreement | string | 否 | 否 | 付款协议id 示例：1472183199958827012 |
| agreementCode | string | 否 | 否 | 付款协议编码 示例：00000001 |
| _status | string | 否 | 是 | 操作标识 (Insert:新增, 本接口只支持单据保存，不支持编辑更新。如果数据错误请调用删除接口删除数据后重新保存) 示例：Insert |
| retailer | string | 否 | 否 | 散户名称 示例：小散户 |
| bodyItem | object | 是 | 是 | 表体数据（必输） |

## 3. 请求示例

Url: /yonbip/EFI/payable/batchsave?access_token=访问令牌
Body: {
	"data": [
		{
			"funder": "000023",
			"auditor": "",
			"srcBillId": "1728256786694144000",
			"invoiceType": "1",
			"creator": "",
			"extSystemCode": "NC65_UPGRADE",
			"extVouchCode": "1861119641471942667",
			"funder_code": "ZJDX230511000023",
			"financeOrg": "1525652227072458756",
			"financeOrgCode": "pkm00",
			"code": "OAPap230317853486",
			"billDate": "2022-10-24 00:00:00",
			"direction": "1",
			"srcBillType": "1",
			"bustype": "1514492098255520719",
			"bustypeCode": "ap_invoice",
			"org": "1525652227072458756",
			"orgCode": "pkm00",
			"invoiceCode": "110014316011",
			"invoiceNo": "20240806",
			"objectType": "0",
			"oriCurrency": "1514492081064640537",
			"oriCurrencyCode": "CNY",
			"supplier": "1570200967882211330",
			"supplierCode": "0001000111",
			"employee": "1468336011116358677",
			"employeeCode": "0025",
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
			"_status": "Insert",
			"retailer": "小散户",
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
					"srcBillType": "1",
					"retailer": "小散户",
					"srcBillId": "1728256786694144000",
					"contractNo": "htbh002",
					"invoiceNo": "fpbh002",
					"costCenter": "1473547350383263744",
					"invoiceCode": "110014316011",
					"demanderProCenter": "1468336086076358677",
					"supplierProCenter": "1473547350383263744",
					"localTaxAmount": 0,
					"localTaxIncludedAmount": 10,
					"localTaxExcludedAmount": 10,
					"grandsonItem": [
						{
							"_status": "Insert",
							"issueNo": 1,
							"startDate": "2023-11-05 00:00:00",
							"expireDate": "9999-12-31 00:00:00",
							"ratio": "100",
							"oriTaxIncludedAmount": 10,
							"localTaxIncludedAmount": 10,
							"blnPrepare": 0,
							"blnDeposit": 0
						}
					],
					"invoiceType": "1",
					"srcBillRowId": "20562372655605350"
				}
			]
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用返回信息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| count | long | 否 | 数据总条数 示例：1 |
| sucessCount | long | 否 | 成功条数 示例：1 |
| failCount | long | 否 | 失败条数 示例：0 |
| messages | string | 是 | 业务状态信息 |
| infos | object | 是 | 业务数据 |

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
				"extSystemCode": "AB1234",
				"extVouchCode": "AB1234",
				"partner_code": "000023",
				"partner": "1664394763341660162",
				"partner_name": "业务伙伴-北京",
				"funder_code": "ZJDX230511000025",
				"funder": "1723023935968116743",
				"busiObj": "payable",
				"oriCurrency": "1468336086076358677",
				"srcBillType": "1",
				"invoiceType": "1",
				"invoiceNo": "20240806",
				"creator": "9dff758d-bfc2-4b90-",
				"financeOrg": "1474252334897823749",
				"objectType": "0",
				"exchangeRate": 1,
				"supplier": "1668901369457147910",
				"orgCurrency": "1468336086076358677",
				"id": "1685911905235894278",
				"invoiceCode": "110014316011",
				"localTaxIncludedAmount": 2,
				"srcBillId": "20562372655605350",
				"billDate": "2023-03-22 00:00:00",
				"srcApp": "94",
				"_status": 0,
				"verifyState": 0,
				"blnWriteOff": false,
				"srcSystem": "1",
				"status": "0",
				"code": "OAPap230322868263",
				"writeOffState": "0",
				"postStatus": "0",
				"cBillNo": "payable",
				"oriTaxExcludedAmount": 2,
				"effectState": "0",
				"pubts": "2023-03-22 14:19:37",
				"oriTaxIncludedAmount": 2,
				"direction": "1",
				"org": "1474252334897823749",
				"billType": "2614247099060992",
				"bustype": "1468336043126686581",
				"exchangeRateType": "0000L3WE7R4W25O1SI0000",
				"exchangeRateDate": "2023-03-22 00:00:00",
				"createTime": "2023-03-22 14:19:37",
				"localTaxExcludedAmount": 2,
				"businessType": "3",
				"verifystate": 0,
				"bustypeCode": "ap_invoice",
				"supplierCode": "0320000046",
				"orgCode": "1001012",
				"financeOrgCode": "1001012",
				"exchangeRateTypeCode": "01",
				"bodyItem": [
					{
						"partner_code": "000023",
						"partner": "1664394763341660162",
						"partner_name": "业务伙伴-北京",
						"funder_name": "ljmLLLL",
						"funder_code": "ZJDX230511000025",
						"funder": "1723023935968116743",
						"oriCurrency": "1468336086076358677",
						"headerId": "1685911905235894278",
						"objectType": "0",
						"exchangeRate": 1,
						"supplier": "1668901369457147910",
						"orgCurrency": "1468336086076358677",
						"id": "1685911905235894279",
						"localTaxIncludedAmount": 2,
						"taxSubject": "1468336086076358698",
						"blnDeductTax": true,
						"_status": 0,
						"localTaxAmount": 0,
						"taxRate": 0,
						"deductTaxType": "0",
						"startDate": "2023-03-22 00:00:00",
						"rowNo": 10,
						"oriTaxExcludedAmount": 2,
						"oriTaxAmount": 0,
						"pubts": "2023-03-22 14:19:37",
						"oriTaxIncludedAmount": 2,
						"org": "1474252334897823749",
						"exchangeRateType": "0000L3WE7R4W25O1SI0000",
						"exchangeRateDate": "2023-03-22 00:00:00",
						"createTime": "2023-03-22 14:19:37",
						"localTaxExcludedAmount": 2,
						"verifystate": 0,
						"supplierCode": "0320000046",
						"orgCode": "1001012",
						"verifyState": 0,
						"oriCurrencyCode": "CNY",
						"exchangeRateTypeCode": "01",
						"grandsonItem": [
							{
								"rowNo": 10,
								"blnDeposit": false,
								"issueNo": 1,
								"headerId": "1685911905235894278",
								"expireDate": "9999-12-31 00:00:00",
								"bodyId": "1685911905235894279",
								"id": "1685911896645959682",
								"pubts": "2023-03-22 14:19:37",
								"oriTaxIncludedAmount": 2,
								"localTaxIncludedAmount": 2,
								"accountDate": "2023-03-22 00:00:00",
								"_status": 0,
								"createTime": "2023-03-22 14:19:37",
								"startDate": "2023-03-22 00:00:00",
								"ratio": 100,
								"blnPrepare": false,
								"verifystate": 0
							}
						],
						"extRowNo": "AB1234",
						"srcBillType": "1",
						"srcBillId": "20562372655605350",
						"srcBillRowId": "20562372655605350",
						"invoiceCode": "110014316011",
						"invoiceNo": "20240806",
						"invoiceType": "1"
					}
				],
				"data": {
					"sourceUnique": "1858115999048400885",
					"targetUnique": "1858115999048400905"
				}
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	收票组织不允许为空!	请求参数中输入有效的收票组织id或编码


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

