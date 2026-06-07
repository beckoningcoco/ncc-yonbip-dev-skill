---
title: "采购发票单个保存V2"
apiId: "c58af804f2974ed7bf7f1cabca0d311b"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Purchase Invoice"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Purchase Invoice]
platform_version: "BIP"
source_type: community-api-docs
---

# 采购发票单个保存V2

> `ContentType	application/json` 请求方式	POST | 分类: Purchase Invoice (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/purinvoice/singleSave_v1

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	MDD幂等

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 否 | 是 | 请求体 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| id | string | 否 | 否 | 采购发票id：新增时无需填写，修改时必填 示例：1996971836478849025 |
| inInvoiceOrg | string | 否 | 是 | 收票组织id，或收票组织code 示例：2204894649602304 |
| org | string | 否 | 是 | 采购组织id，或采购组织code 示例：2204894649602304 |
| code | string | 否 | 否 | 采购发票code，以系统编码规则配置为准：系统设置为手工编号时必输，系统设置为自动编号时非必输 示例：FP210605000005 |
| vouchdate | string | 否 | 是 | 单据日期，格式为:yyyy-MM-dd HH:mm:ss 示例：2021-06-05 00:00:00 |
| memo | string | 否 | 否 | 备注 示例：增值发票 |
| bustype | string | 否 | 是 | 交易类型id，或交易类型code 示例：2157958782980358 |
| invoiceType | number |
| 小数位数:0,最大长度:6 | 否 | 否 | 发票类型：0:增值税专用发票,1:增值税普通发票,2:增值税电子普通发票,3:机动车销售统一发票,4:通行费增值税电子普通发票,5:收据,6:增值税电子专用发票 示例：0 |
| bdInvoiceTypeCode | string | 否 | 否 | 发票类型档案：0:收据,1:增值税电子普通发票,2增值税电子专用发票,3:增值税普通发票,4:增值税专用发票,5:机动车销售统一发票,14:通行费增值税电子普通发票;可参考发票类型档案 示例：1 |
| vendor | string | 否 | 是 | 供货供应商id，或供货供应商code 示例：2216094409445632 |
| retailInvestors | boolean | 否 | 否 | 是否散户：true or false 示例：false |
| contact | string | 否 | 否 | 供方联系人 示例：张丽 |
| contactTel | string | 否 | 否 | 供方联系人手机 示例：15678901234 |
| invoiceVendor | string | 否 | 是 | 开票供应商id，或开票供应商code 示例：2212150383677696 |
| currency | string | 否 | 是 | 币种id，或币种code 示例：2157958787700224 |
| currency_code | string | 否 | 否 | 币种简称 示例：CNY |
| exchRateType | string | 否 | 是 | 汇率类型id，或汇率类型code 示例：wbwzmj5r |
| exchRate | number |
| 小数位数:8,最大长度:19 | 否 | 是 | 汇率，最多19位数，最大精度为8位 示例：1 |
| natCurrency | string | 否 | 是 | 本币id，或本币code 示例：2157958787700224 |
| natCurrency_code | string | 否 | 否 | 本币简称 示例：CNY |
| taxRate | number |
| 小数位数:8,最大长度:19 | 否 | 否 | 税率，最多19位数，最大精度为8位 示例：13 |
| accountDate | string | 否 | 否 | 立账日 示例：2021-06-05 00:00:00 |
| maturityDate | string | 否 | 否 | 到期日 示例：2021-06-05 00:00:00 |
| isInvBack | boolean | 否 | 否 | 红字发票：true or false 示例：false |
| isBeginning | boolean | 否 | 是 | 期初发票：true or false 示例：false |
| invVendorAccount | string | 否 | 否 | 开票供应商银行账号 示例：2345432345432 |
| invVendorBank | string | 否 | 否 | 开票供应商银行名称 示例：北京银行 |
| totalQuantity | number |
| 小数位数:8,最大长度:28 | 否 | 否 | 整单数量，最多28位数，最大精度为8位 示例：30 |
| oriSum | number |
| 小数位数:8,最大长度:28 | 否 | 否 | 含税金额；小数位数取自单据表头[币种]对应的币种档案上设置的“金额精度”。最多28位数，最大精度为8位 示例：30000 |
| oriMoney | number |
| 小数位数:8,最大长度:28 | 否 | 否 | 无税金额；小数位数取自单据表头[币种]对应的币种档案上设置的“金额精度”。最多28位数，最大精度为8位 示例：26548.672566 |
| oriTax | number |
| 小数位数:8,最大长度:28 | 否 | 否 | 税额；小数位数取自单据表头[币种]对应的币种档案上设置的“金额精度”。最多28位数，最大精度为8位 示例：3451.327434 |
| natSum | number |
| 小数位数:8,最大长度:28 | 否 | 否 | 本币含税金额；小数位数取自单据上[本币]对应的币种档案上设置的“金额精度”。最多28位数，最大精度为8位 示例：30000 |
| natMoney | number |
| 小数位数:8,最大长度:28 | 否 | 否 | 本币无税金额；小数位数取自单据上[本币]对应的币种档案上设置的“金额精度”。最多28位数，最大精度为8位 示例：26548.672566 |
| natTax | number |
| 小数位数:8,最大长度:28 | 否 | 否 | 本币税额；小数位数取自单据上[本币]对应的币种档案上设置的“金额精度”。最多28位数，最大精度为8位 示例：3451.327434 |
| creator | string | 否 | 否 | 创建人 示例：张三 |
| createTime | string | 否 | 否 | 创建时间 示例：2021-06-05 14:55:14 |
| createDate | string | 否 | 否 | 创建日期，格式为:yyyy-MM-dd HH:mm:ss 示例：2021-06-05 00:00:00 |
| creatorId | long | 否 | 否 | 创建者id 示例：2157957602857216 |
| srcBill | long | 否 | 否 | 来源单据ID：推拉单必传 示例：2288453282518528 |
| srcBillNO | string | 否 | 否 | 来源单据号：推拉单必传 示例：CGRK20210605000003 |
| source | string | 否 | 否 | 来源单据类型(推拉单必传):pu_applyorder 请购单；st_purchaseorder 采购订单；pu_arrivalorder 到货单；st_purinvoice 采购发票；pu_pursettle 采购结算单；pu_adjustprice 调价单；ustock.st_purinrecord 采购入库单；scmmp.sce_expense 供应链费用单 示例：ustock.st_purinrecord |
| smallTaxpayer | long | 否 | 否 | 小规模纳税人 示例：0 |
| isWfControlled | boolean | 否 | 否 | 是否审批流控制：true or false 示例：false |
| pubts | string | 否 | 否 | 时间戳，格式为:yyyy-MM-dd HH:mm:ss 示例：2021-05-13 17:50:03 |
| headItem | object | 否 | 否 | 表头自定义项 |
| headFreeItem | object | 否 | 否 | 表头自由自定义项 |
| bizFlow_name | string | 否 | 否 | 流程名称 示例：普通订货（无到货） |
| bizFlow_version | string | 否 | 否 | 版本信息 示例：V3.0 |
| returncount | long | 否 | 否 | 退回次数 示例：0 |
| purInvoices | object | 是 | 是 | 发票子表 |
| paymentSchedules | object | 是 | 否 | 付款计划子表 |
| _status | string | 否 | 是 | Insert 保存；Update 修改 示例：Insert |
| vendorTaxReceipt | object | 是 | 否 | 供应商税票子表 |

## 3. 请求示例

Url: /yonbip/scm/purinvoice/singleSave_v1?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"id": "1996971836478849025",
		"inInvoiceOrg": "2204894649602304",
		"org": "2204894649602304",
		"code": "FP210605000005",
		"vouchdate": "2021-06-05 00:00:00",
		"memo": "增值发票",
		"bustype": "2157958782980358",
		"invoiceType": 0,
		"bdInvoiceTypeCode": "1",
		"vendor": "2216094409445632",
		"retailInvestors": false,
		"contact": "张丽",
		"contactTel": "15678901234",
		"invoiceVendor": "2212150383677696",
		"currency": "2157958787700224",
		"currency_code": "CNY",
		"exchRateType": "wbwzmj5r",
		"exchRate": 1,
		"natCurrency": "2157958787700224",
		"natCurrency_code": "CNY",
		"taxRate": 13,
		"accountDate": "2021-06-05 00:00:00",
		"maturityDate": "2021-06-05 00:00:00",
		"isInvBack": false,
		"isBeginning": false,
		"invVendorAccount": "2345432345432",
		"invVendorBank": "北京银行",
		"totalQuantity": 30,
		"oriSum": 30000,
		"oriMoney": 26548.672566,
		"oriTax": 3451.327434,
		"natSum": 30000,
		"natMoney": 26548.672566,
		"natTax": 3451.327434,
		"creator": "张三",
		"createTime": "2021-06-05 14:55:14",
		"createDate": "2021-06-05 00:00:00",
		"creatorId": 2157957602857216,
		"srcBill": 2288453282518528,
		"srcBillNO": "CGRK20210605000003",
		"source": "ustock.st_purinrecord",
		"smallTaxpayer": 0,
		"isWfControlled": false,
		"pubts": "2021-05-13 17:50:03",
		"headItem": {
			"id": "234543234543234",
			"define1": "2256066987413760",
			"define2": "2345434543454340"
		},
		"headFreeItem": {
			"id": "2345434543454342",
			"define1": "2345434543454342",
			"define2": "2345434543454343"
		},
		"bizFlow_name": "普通订货（无到货）",
		"bizFlow_version": "V3.0",
		"returncount": 0,
		"purInvoices": [
			{
				"id": "1996987710677975047",
				"_status": "Insert",
				"source": "ustock.st_purinrecord",
				"makeRuleCode": "st_purinrecord",
				"upcode": "CGRK20210605000003",
				"sourceautoid": 2288453282518529,
				"sourceid": 2288453282518528,
				"expenseSource": "upu.st_purchaseorder",
				"expenseSrcBillNO": "CGDD000902",
				"expenseSourceid": 2288453282518528,
				"expenseUpLineno": "CGDD000902",
				"expenseUpLineid": 2205038523519232,
				"isUpdateCost": false,
				"product": "2205038523519232",
				"product_cCode": "001000001",
				"project_code": "76534",
				"productsku": "2205038523519236",
				"productsku_cCode": "000002",
				"rowno": 10,
				"unit": "2204938388378112",
				"oriUnitPrice": 8.849558,
				"oriTaxUnitPrice": 10,
				"oriMoney": 26548.672566,
				"oriSum": 30000,
				"memo": "增值发票",
				"oriTax": 3451.327434,
				"taxitems_code": "VAT13",
				"natUnitPrice": 8.849558,
				"natTaxUnitPrice": 10,
				"natMoney": 26548.672566,
				"natSum": 30000,
				"natTax": 3451.327434,
				"bodyItem": {
					"id": "23454323432343",
					"define1": "23454323432343",
					"define2": "23455432345434"
				},
				"bodyFreeItem": {
					"id": "23455432345435",
					"define1": "23455432345435",
					"define2": "23455432345436"
				},
				"qty": 30,
				"subQty": 3000,
				"invExchRate": 0.01,
				"purUOM": "2204938582562560",
				"purUOM_Code": "002",
				"priceQty": 3000,
				"invPriceExchRate": 0.01,
				"priceUOM": "2204938582562560",
				"priceUOM_Code": "002",
				"receiptDocEntryAndMgmt": "invoicing_confirm_AP",
				"unit_Code": "001",
				"srcPOID": 2288451311391232,
				"srcPOLineID": 2288451311391233,
				"srcPOCode": "123456",
				"inOrg": "2204894649602304",
				"accountOrg": "2204894649602304",
				"unitExchangeType": 0.1,
				"unitExchangeTypePrice": 0.1,
				"isGiftProduct": false,
				"firstsourceid": 2288451311391232,
				"firstsourceautoid": 2288451311391233,
				"firstsource": "st_purchaseorder",
				"firstupcode": "123456",
				"realProductAttribute": "1",
				"realProductAttributeType": "1",
				"discountTaxType": "0",
				"costedMoney": 26548.672566,
				"demandOrg": "2204894649602304",
				"expenseItemId": "1996993809531535361",
				"pubts": "2021-05-13 17:50:03",
				"isBatchManage": false,
				"priceHaveTax": 0,
				"unDeductTax": 0,
				"proDescFlag": "虚拟物料",
				"creditStatus": 0,
				"unDeductTaxRate": 12,
				"expenseItemId_code": "CS00023",
				"sourceOrderType": "0"
			}
		],
		"paymentSchedules": [
			{
				"fixAccoutDateTime": "2021-10-04 00:00:00",
				"amount": 3.842,
				"accountType": "0",
				"payRatio": 20,
				"isAdvancePay": "true",
				"delayMonth": "1",
				"fixAccoutDayOne": "4",
				"number": "2",
				"payNatMoney": 3.842,
				"accountUnit": "0",
				"accountDay": "30",
				"startDate_name": "发票单据日期",
				"startDateTime": "2021-08-10 00:00:00",
				"sourceType": "true",
				"expiringDateTime": "2021-11-07 00:00:00",
				"fixExpireDayOne": "7",
				"name": "预付款",
				"id": "2381693240660482",
				"delayDay": "2",
				"mainid": "2381693240660480",
				"pubts": "2021-08-10 11:43:39",
				"startDate": "2154746767218243"
			}
		],
		"_status": "Insert",
		"vendorTaxReceipt": [
			{
				"taxInvoiceCode": "117218243",
				"taxInvoiceDate": "2021-08-10 11:43:39",
				"invoiceCode": "1313",
				"invoiceAmount": 33.5,
				"invoiceTitle": "采购组织",
				"invoiceCheckCode": "123156421",
				"sellName": "北京销售",
				"priceTaxTotal": 355.7
			}
		]
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| code | long | 否 | 返回编码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| currency_priceDigit | string | 否 | 币种单价精度 示例：6 |
| oriTax | number |
| 小数位数:8,最大长度:28 | 否 | 含税单价 示例：3451.327434 |
| isBeginning | boolean | 否 | 期初发票 示例：false |
| bustype_name | string | 否 | 交易类型名称 示例：通用采购发票 |
| invoiceVendor | string | 否 | 开票供应商id 示例：2212150383677696 |
| natTax | number |
| 小数位数:8,最大长度:28 | 否 | 本币税额 示例：3451.327434 |
| source | string | 否 | 来源单据类型 示例：ustock.st_purinrecord |
| srcBill | long | 否 | 来源单据ID 示例：2288453282518528 |
| contactTel | string | 否 | 供方联系人手机 示例：15678901234 |
| smallTaxpayer | string | 否 | 小规模纳税人 示例：0 |
| natCurrency | string | 否 | 本币id 示例：2157958787700224 |
| totalQuantity | number |
| 小数位数:8,最大长度:28 | 否 | 整单数量 示例：30 |
| inInvoiceOrg | string | 否 | 收票组织id 示例：2204894649602304 |
| maturityDate | string | 否 | 到期日 示例：2021-06-05 00:00:00 |
| contact | string | 否 | 联系人 示例：张丽 |
| invoiceType | number |
| 小数位数:0,最大长度:6 | 否 | 发票类型 示例：0 |
| bdInvoiceTypeId | string | 否 | 发票类型id 示例：2288453677798144 |
| bdInvoiceTypeCode | string | 否 | 发票类型编码 示例：1 |
| bdInvoiceTypeName | string | 否 | 发票类型名称 示例：收据 |
| id | long | 否 | 发票id 示例：2288453677798144 |
| tenant | long | 否 | 租户id 示例：2157957602398464 |
| isWfControlled | boolean | 否 | 是否审批流控制：true or false 示例：false |
| vendor_name | string | 否 | 供货供应商 示例：B供应商03145修改新档案 |
| srcBillNO | string | 否 | 来源单据号 示例：CGRK20210605000003 |
| natSum | number |
| 小数位数:8,最大长度:28 | 否 | 本币含税金额 示例：30000 |
| taxRate | number |
| 小数位数:8,最大长度:19 | 否 | 税率 示例：13 |
| natCurrency_moneyDigit | string | 否 | 本币金额精度 示例：6 |
| natCurrency_priceDigit | string | 否 | 本币单价精度 示例：6 |
| exchRateType | string | 否 | 汇率类型id 示例：wbwzmj5r |
| oriMoney | number |
| 小数位数:8,最大长度:28 | 否 | 无税金额 示例：26548.672566 |
| natCurrency_code | string | 否 | 本币编码 示例：CNY |
| status | long | 否 | 单据状态：0开立；1已审核；2已关闭；3审核中 示例：0 |
| returncount | long | 否 | 退回次数 示例：0 |
| currency_moneyDigit | string | 否 | 本币金额精度 示例：6 |
| code | string | 否 | 发票编码 示例：FP210605000005 |
| creatorId | long | 否 | 创建人id 示例：2157957602857216 |
| exchRate | number |
| 小数位数:8,最大长度:19 | 否 | 汇率 示例：1 |
| currency_code | string | 否 | 币种编码 示例：CNY |
| vendor_define1 | string | 否 | 供应商自定义项1 示例：56 |
| vouchdate | string | 否 | 单据日期 示例：2021-06-05 00:00:00 |
| natCurrency_name | string | 否 | 本币 示例：人民币 |
| invoiceVendor_name | string | 否 | 开票供应商 示例：北京同仁供应商 |
| vendor | long | 否 | 供货供应商id 示例：2216094409445632 |
| vendor_define13 | string | 否 | 供应商自定义项13 示例：供应商属性名称03 |
| vendor_define14 | string | 否 | 供应商自定义项14 示例：供应商属性名称01 |
| currency | string | 否 | 币种id 示例：2157958787700224 |
| vendor_define16 | string | 否 | 供应商自定义项16 示例：供应商属性01 |
| org_name | string | 否 | 采购组织 示例：zsr全组织 |
| department | string | 否 | 采购部门id 示例：2212175978074368 |
| isInvBack | boolean | 否 | 红字发票 示例：false |
| pubts | string | 否 | 时间戳 示例：2021-06-05 14:55:28 |
| createDate | string | 否 | 创建日期 示例：2021-06-05 14:55:27 |
| vendor_define12 | string | 否 | 供应商自定义项12 示例：供应商属性名称05 |
| accountDate | string | 否 | 立账日 示例：2021-06-05 00:00:00 |
| creator | string | 否 | 创建人 示例：张三 |
| currency_name | string | 否 | 币种名称 示例：人民币 |
| oriSum | number |
| 小数位数:8,最大长度:28 | 否 | 含税金额 示例：30000 |
| inInvoiceOrg_name | string | 否 | 收票组织 示例：zsr全组织 |
| org | string | 否 | 采购组织id 示例：2204894649602304 |
| department_name | string | 否 | 采购部门 示例：生产部门 |
| exchRateType_name | string | 否 | 汇率类型 示例：基准汇率 |
| bustype | string | 否 | 交易类型id 示例：2157958782980358 |
| retailInvestors | boolean | 否 | 是否散户 示例：false |
| vendor_define2 | string | 否 | 供应商自定义项2 示例：北京 |
| createTime | string | 否 | 创建时间 示例：2021-06-05 14:55:27 |
| purInvoices | object | 是 | 发票子表 |
| natMoney | number |
| 小数位数:8,最大长度:28 | 否 | 本币无税金额 示例：26548.672566 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"currency_priceDigit": "6",
		"oriTax": 3451.327434,
		"isBeginning": false,
		"bustype_name": "通用采购发票",
		"invoiceVendor": "2212150383677696",
		"natTax": 3451.327434,
		"source": "ustock.st_purinrecord",
		"srcBill": 2288453282518528,
		"contactTel": "15678901234",
		"smallTaxpayer": "0",
		"natCurrency": "2157958787700224",
		"totalQuantity": 30,
		"inInvoiceOrg": "2204894649602304",
		"maturityDate": "2021-06-05 00:00:00",
		"contact": "张丽",
		"invoiceType": 0,
		"bdInvoiceTypeId": "2288453677798144",
		"bdInvoiceTypeCode": "1",
		"bdInvoiceTypeName": "收据",
		"id": 2288453677798144,
		"tenant": 2157957602398464,
		"isWfControlled": false,
		"vendor_name": "B供应商03145修改新档案",
		"srcBillNO": "CGRK20210605000003",
		"natSum": 30000,
		"taxRate": 13,
		"natCurrency_moneyDigit": "6",
		"natCurrency_priceDigit": "6",
		"exchRateType": "wbwzmj5r",
		"oriMoney": 26548.672566,
		"natCurrency_code": "CNY",
		"status": 0,
		"returncount": 0,
		"currency_moneyDigit": "6",
		"code": "FP210605000005",
		"creatorId": 2157957602857216,
		"exchRate": 1,
		"currency_code": "CNY",
		"vendor_define1": "56",
		"vouchdate": "2021-06-05 00:00:00",
		"natCurrency_name": "人民币",
		"invoiceVendor_name": "北京同仁供应商",
		"vendor": 2216094409445632,
		"vendor_define13": "供应商属性名称03",
		"vendor_define14": "供应商属性名称01",
		"currency": "2157958787700224",
		"vendor_define16": "供应商属性01",
		"org_name": "zsr全组织",
		"department": "2212175978074368",
		"isInvBack": false,
		"pubts": "2021-06-05 14:55:28",
		"createDate": "2021-06-05 14:55:27",
		"vendor_define12": "供应商属性名称05",
		"accountDate": "2021-06-05 00:00:00",
		"creator": "张三",
		"currency_name": "人民币",
		"oriSum": 30000,
		"inInvoiceOrg_name": "zsr全组织",
		"org": "2204894649602304",
		"department_name": "生产部门",
		"exchRateType_name": "基准汇率",
		"bustype": "2157958782980358",
		"retailInvestors": false,
		"vendor_define2": "北京",
		"createTime": "2021-06-05 14:55:27",
		"purInvoices": [
			{
				"skudefine1": "浅",
				"purUOM_Precision": "2",
				"purUOM": 2204938582562560,
				"skudefine2": "小",
				"oriTax": 3451.327434,
				"product_cCode": "001000001",
				"inOrg": "2204894649602304",
				"priceUOM_Precision": "2",
				"project": "2282897828076288",
				"firstsource": "st_purchaseorder",
				"firstupcode": "123456",
				"source": "ustock.st_purinrecord",
				"natTax": 3451.327434,
				"project_name": "暖暖项目1",
				"expenseSource": "ustock.st_purinrecord",
				"expenseSourceid": 2282897828076288,
				"expenseSrcBillNO": "XSCK20221031000007",
				"expenseUpLineno": "XSCK20221031000007",
				"expenseUpLineid": 2282897828076288,
				"subQty": 3000,
				"costedMoney": 26548.672566,
				"proDescFlag": "0",
				"priceUOM_Code": "002",
				"product_cName": "zsr固定存货属性全",
				"taxitems_name": "13%",
				"id": 2288453677814528,
				"receiptDocEntryAndMgmt": "invoicing_confirm_AP",
				"mainid": 2288453677798144,
				"product_model": "wert",
				"purUOM_Name": "厘米",
				"oriUnitPrice": 8.849558,
				"project_code": "xm0001",
				"natSum": 30000,
				"unit_Code": "001",
				"realProductAttribute": "1",
				"srcPOLineID": 2288451311391233,
				"taxRate": 13,
				"unit": 2204938388378112,
				"productsku": 2205038523519236,
				"productsku_cCode": "000002",
				"srcPOID": 2288451311391232,
				"accountOrg_name": "zsr全组织",
				"qty": 30,
				"unit_Precision": "2",
				"oriTaxUnitPrice": 10,
				"oriMoney": 26548.672566,
				"invExchRate": 0.01,
				"unitExchangeTypePrice": 0,
				"discountTaxType": "0",
				"natUnitPrice": 8.849558,
				"isGiftProduct": false,
				"product_modelDescription": "retuy",
				"firstsourceautoid": 2288451311391233,
				"demandOrg": "2204894649602304",
				"makeRuleCode": "st_purinrecord",
				"productsku_cName": "zsr固定存货属性全002",
				"realProductAttributeType": "1",
				"unit_Name": "米",
				"purUOM_Code": "002",
				"priceUOM": 2204938582562560,
				"invPriceExchRate": 0.01,
				"firstsourceid": 2288451311391232,
				"pubts": "2021-06-05 14:55:27",
				"prodefine1": "棉",
				"prodefine2": "韩版",
				"sourceid": 2288453282518528,
				"rowno": 1,
				"product": 2205038523519232,
				"makeRule": "77726783",
				"sourceMainPubts": "2021-06-05 14:55:04",
				"oriSum": 30000,
				"accountOrg": "2204894649602304",
				"unitExchangeType": 0,
				"propertiesValue": "颜色:绿色;尺码:160;",
				"demandOrg_name": "zsr全组织",
				"inOrg_name": "zsr全组织",
				"sourceautoid": 2288453282518529,
				"priceQty": 3000,
				"upcode": "CGRK20210605000003",
				"priceUOM_Name": "厘米",
				"srcPOCode": "123456",
				"natTaxUnitPrice": 10,
				"taxitems": "2157958788027907",
				"natMoney": 26548.672566,
				"taxitems_code": "VAT13",
				"sourceOrderType": "1"
			}
		],
		"natMoney": 26548.672566
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-05-22

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

