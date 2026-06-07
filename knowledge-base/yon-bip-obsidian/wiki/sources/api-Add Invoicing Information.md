---
title: "开票信息新增"
apiId: "1601349316372856836"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Invoicing Information"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Invoicing Information]
platform_version: "BIP"
source_type: community-api-docs
---

# 开票信息新增

> `ContentType	application/json` 请求方式	POST | 分类: Invoicing Information (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/AMP/fiercl/rclinvoiceinfo/add

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| billnum | string | 否 | 是 | 开票信息编码 示例：rclInvoiceInfo 默认值：rclInvoiceInfo |
| data | object | 否 | 是 | 数据 |
| invoiceOrgCode | string | 否 | 是 | 开票组织编码 |
| invoiceOrg | string | 否 | 否 | 开票组织id 示例：1589425525064466436 |
| invoiceDate | string | 否 | 是 | 开票日期 示例：2022-11-19 |
| direction | string | 否 | 是 | 单据方向（0-蓝字，1-红字） 示例：0 |
| bustype | string | 否 | 否 | 交易类型(支持id或者code) 示例：1570290767175352322 |
| org | string | 否 | 否 | 业务组织(支持id或者code) 示例：1589425525064466436 |
| customer | string | 否 | 否 | 客户id(id和编码不能全部为空) 示例：1590794786419769346 |
| customerCode | string | 否 | 否 | 客户编码(id和编码不能全部为空) 示例：yl-kh |
| invoiceCustomer | string | 否 | 否 | 开票客户id 示例：1590794786419769346 |
| invoiceCustomerCode | string | 否 | 否 | 开票客户编码 示例：yl-kh |
| invoiceType | string | 否 | 是 | 发票类型(支持id或者code) 示例：0 |
| invoiceNum | string | 否 | 否 | 发票号码 示例：OAPap230208000002 |
| invoiceCode | string | 否 | 否 | 发票代码 示例：YD202302091642 |
| buleInvoiceNum | string | 否 | 否 | 蓝字发票号码 示例：OAPap230208000002 |
| buleInvoiceCode | string | 否 | 否 | 蓝字发票代码 示例：YD202302091642 |
| oriCurrtype | string | 否 | 否 | 币种id或者编码 示例：1468336086076358677 |
| exchangeRateType | string | 否 | 否 | 汇率类型(支持id或者code) 示例：0000L3WE7R4W25O1SI0000 |
| exchangeRateDate | string | 否 | 否 | 汇率日期 示例：2022-11-10 |
| exchRateOps | number |
| 小数位数:0,最大长度:1 | 否 | 否 | 汇率折算方式 示例：1:×,2:÷ |
| exchangeRate | BigDecimal | 否 | 是 | 汇率 示例：1 |
| extSrcSystems | string | 否 | 是 | 来源系统(外) |
| extSrcBillcode | string | 否 | 是 | 来源单据号(外) 示例：RECON000293 |
| extSrcBillId | string | 否 | 是 | 来源单据id(外) 示例：1594886060583682050 |
| extSrcBilltypeCode | string | 否 | 否 | 来源单据类型编码(外) 示例：1570194285024247810 |
| extSrcTranstypeCode | string | 否 | 否 | 来源交易类型编码(外) 示例：1570194285024247810 |
| billtype | string | 否 | 否 | 单据类型(支持id或者code) 示例：1570187739494088706 |
| dataVersion | long | 否 | 是 | 数据版本 示例：1 |
| remarks | string | 否 | 否 | 备注 示例：备注 |
| _status | string | 否 | 是 | 单据数据状态 示例：Insert 默认值：Insert |
| createType | string | 否 | 否 | 生成方式（0-Api传入，1-手工新增） 示例：0 默认值：0 |
| rclInvoiceInfoBodyList | object | 是 | 否 | 开票信息子表 |
| externalData | object | 否 | 否 | 扩展参数 |
| isAsync | boolean | 否 | 否 | 是否异步 示例：false 默认值：false |

## 3. 请求示例

Url: /yonbip/AMP/fiercl/rclinvoiceinfo/add?access_token=访问令牌
Body: {
	"billnum": "rclInvoiceInfo",
	"data": {
		"invoiceOrgCode": "",
		"invoiceOrg": "1589425525064466436",
		"invoiceDate": "2022-11-19",
		"direction": "0",
		"bustype": "1570290767175352322",
		"org": "1589425525064466436",
		"customer": "1590794786419769346",
		"customerCode": "yl-kh",
		"invoiceCustomer": "1590794786419769346",
		"invoiceCustomerCode": "yl-kh",
		"invoiceType": "0",
		"invoiceNum": "OAPap230208000002",
		"invoiceCode": "YD202302091642",
		"buleInvoiceNum": "OAPap230208000002",
		"buleInvoiceCode": "YD202302091642",
		"oriCurrtype": "1468336086076358677",
		"exchangeRateType": "0000L3WE7R4W25O1SI0000",
		"exchangeRateDate": "2022-11-10",
		"exchRateOps": NaN,
		"exchangeRate": 1,
		"extSrcSystems": "",
		"extSrcBillcode": "RECON000293",
		"extSrcBillId": "1594886060583682050",
		"extSrcBilltypeCode": "1570194285024247810",
		"extSrcTranstypeCode": "1570194285024247810",
		"billtype": "1570187739494088706",
		"dataVersion": 1,
		"remarks": "备注",
		"_status": "Insert",
		"createType": "0",
		"rclInvoiceInfoBodyList": [
			{
				"expenseItem": "1471440660223492100",
				"expenseItemCode": "2023",
				"quantity": 10,
				"taxRateId": "VAT0",
				"price": 10,
				"noTaxPrice": 10,
				"money": 100,
				"tax": 0.6,
				"noTaxMoney": 100,
				"noTaxLocalPrice": 10,
				"localPrice": 10,
				"localMoney": 100,
				"localTax": 0.6,
				"noTaxLocalMoney": 100,
				"dept": "1471491813291851784",
				"staff": "1472170529783808009",
				"project": "1591561575534690309",
				"contractNum": "RECON000293",
				"contractId": "1594886060583682050",
				"contractDetailId": "1594886060583682051",
				"supplierProCenter": "1474252334897823749",
				"demanderProCenter": "1474252334897823749",
				"costCenter": "1474252334897823749",
				"costCenterCode": "2023",
				"exchRateOps": NaN,
				"exchangeRate": 1,
				"conExchRateOps": NaN,
				"con_exchange_rate": 1,
				"remarks": "开票信息-收入确认",
				"oriBillType": "1570189715179044871",
				"oriBusiType": "1607403021234340397",
				"oriCode": "RECON20230103006719",
				"oriBillId": "1628027454190256133",
				"oriBillDetailId": "fIgyK520230103142738",
				"extSrcSystems": "",
				"extSrcBillcode": "RECON000293",
				"extSrcBilltypeCode": "1468336043126685948",
				"extSrcTranstypeCode": "1468336043126685948",
				"extSrcBillId": "1594886060583682050",
				"extSrcBodyId": "1594886060583682051",
				"oriCurrtype": "",
				"unit": 0,
				"unitCode": "",
				"_status": "Insert"
			}
		]
	},
	"externalData": {
		"isAsync": false
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 消息 示例：操作成功 |
| data | object | 否 | 数据 |
| busiObj | string | 否 | 业务对象 示例：rclInvoiceInfo |
| invoiceOrg | string | 否 | 开票组织id 示例：1607417838875705352 |
| dr | short | 否 | 逻辑删除(0--正常；1--已删除) 示例：0 |
| objectType | string | 否 | 往来对象类型 示例：1 |
| exchangeRate | BigDecimal | 否 | 汇率 示例：1 |
| invoiceType | string | 否 | 发票类型 示例：2 |
| id | string | 否 | 开票信息主表id 示例：1628035640397922307 |
| srcBusiType | string | 否 | 来源交易类型id 示例：1468336043126685948 |
| metaFullName | string | 否 | 元数据全名称 示例：RCL.RCL.RclInvoiceInfoHeader |
| localMoney | BigDecimal | 否 | 本币含税金额 示例：100 |
| srcBillId | string | 否 | 来源单据ID 示例：1628027454190256131 |
| billstatus | string | 否 | 单据状态(0--已审核) 示例：0 |
| ytenantId | string | 否 | 租户id 示例：0000LBC4W3H13EZ4LE0000 |
| _status | long | 否 | 接口状态(0--新增) 示例：0 |
| invoiceCode | string | 否 | 发票代码 示例：FT19032454 |
| buleInvoiceCode | string | 否 | 蓝字发票代码 示例：FT1234234 |
| srcSystem | string | 否 | 来源系统 示例：postman传入 |
| code | string | 否 | 编码 示例：VAT20230103000567 |
| cBillNo | string | 否 | 单据编码 示例：rclInvoiceInfo |
| rclInvoiceInfoBodyList | object | 是 | 子表信息 |
| invoiceCustomer | string | 否 | 开票客户id 示例：1607427184715628553 |
| billtype | string | 否 | 单据类型id 示例：1570187739494088706 |
| pubts | Date | 否 | 时间戳 示例：2023-01-03 14:44:53 |
| direction | string | 否 | 单据方向 示例：0 |
| creator | string | 否 | 创建人 示例：8431e506-6919-4ef9-a9b0-144fb1ee851b |
| orgCurrtype | string | 否 | 本币币种id 示例：1607403072771850274 |
| org | string | 否 | 业务组织id 示例：1607417838875705352 |
| dataVersion | long | 否 | 数据版本 示例：1 |
| postState | string | 否 | 过账状态(1--未过账；2--不过账；3--过账中；4--过账成功；5--过账失败) 示例：3 |
| fullName | string | 否 | 全名称 示例：RCL.RCL.RclInvoiceInfoHeader |
| invoiceDate | string | 否 | 开票日期 示例：2023-01-03 |
| invoiceNum | string | 否 | 发票号码 示例：1345567567 |
| oriCurrtype | string | 否 | 币种id 示例：1607403072771850274 |
| bustype | string | 否 | 交易类型id 示例：1607403021234340399 |
| exchangeRateType | string | 否 | 汇率类型id 示例：0000LBC4W3H13EZ4LE0000 |
| exchangeRateDate | string | 否 | 汇率日期 示例：2023-01-03 |
| money | BigDecimal | 否 | 含税金额 示例：100 |
| createTime | Date | 否 | 创建时间 示例：2023-01-03 14:44:53 |
| srcCode | string | 否 | 来源单据号 示例：RECON20221227006556 |
| buleInvoiceNum | string | 否 | 蓝字发票号码 示例：1345567567 |
| customer | string | 否 | 客户id 示例：1607427184715628553 |
| creator_userName | string | 否 | 创建者名称 示例：昵称-李菲菲 |
| contractConversionParams | string | 否 | 折算参数 示例：1 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"busiObj": "rclInvoiceInfo",
		"invoiceOrg": "1607417838875705352",
		"dr": 0,
		"objectType": "1",
		"exchangeRate": 1,
		"invoiceType": "2",
		"id": "1628035640397922307",
		"srcBusiType": "1468336043126685948",
		"metaFullName": "RCL.RCL.RclInvoiceInfoHeader",
		"localMoney": 100,
		"srcBillId": "1628027454190256131",
		"billstatus": "0",
		"ytenantId": "0000LBC4W3H13EZ4LE0000",
		"_status": 0,
		"invoiceCode": "FT19032454",
		"buleInvoiceCode": "FT1234234",
		"srcSystem": "postman传入",
		"code": "VAT20230103000567",
		"cBillNo": "rclInvoiceInfo",
		"rclInvoiceInfoBodyList": [
			{
				"noTaxPrice": 8.7,
				"project": "1612350900865073158",
				"localTax": 13,
				"dr": 0,
				"price": 10,
				"id": "1628035640397922308",
				"srcBusiType": "1468336043126685948",
				"taxRateId": "1607403072771850289",
				"metaFullName": "RCL.RCL.RclInvoiceInfoBody",
				"localMoney": 100,
				"srcBillId": "1628027454190256133",
				"taxSubject": "1607403072771850289",
				"noTaxLocalMoney": 87,
				"noTaxMoney": 87,
				"tax": 13,
				"ytenantId": "0000LBC4W3H13EZ4LE0000",
				"materialId": "1607839252471611399",
				"_status": 0,
				"taxRate": 13,
				"unit": "1607434176922386433",
				"expenseItem": "1607403081345532244",
				"noTaxLocalPrice": 8.7,
				"pubts": "2023-01-03 14:44:53",
				"creator": "8431e506-6919-4ef9-a9b0-144fb1ee851b",
				"quantity": 10,
				"srcBillDetailId": "fIgyK520230103142738",
				"rclInvoiceInfoHeader_id": "1628035640397922307",
				"money": 100,
				"createTime": "2023-01-03 14:44:53",
				"contractId": "1628027454190256133",
				"srcCode": "RECON20221227006556",
				"contractNum": "RECON20230103006719",
				"contractDetailId": "fIgyK520230103142738",
				"localPrice": 10,
				"remarks": "开票信息",
				"con_currency_id": "1783169601426161705",
				"con_exchange_rate_type": "1783169601426164193",
				"con_exchange_rate": 1,
				"con_tax_included_amount": 1000,
				"con_tax_excluded_amount": 900,
				"con_tax_amount": 100
			}
		],
		"invoiceCustomer": "1607427184715628553",
		"billtype": "1570187739494088706",
		"pubts": "2023-01-03 14:44:53",
		"direction": "0",
		"creator": "8431e506-6919-4ef9-a9b0-144fb1ee851b",
		"orgCurrtype": "1607403072771850274",
		"org": "1607417838875705352",
		"dataVersion": 1,
		"postState": "3",
		"fullName": "RCL.RCL.RclInvoiceInfoHeader",
		"invoiceDate": "2023-01-03",
		"invoiceNum": "1345567567",
		"oriCurrtype": "1607403072771850274",
		"bustype": "1607403021234340399",
		"exchangeRateType": "0000LBC4W3H13EZ4LE0000",
		"exchangeRateDate": "2023-01-03",
		"money": 100,
		"createTime": "2023-01-03 14:44:53",
		"srcCode": "RECON20221227006556",
		"buleInvoiceNum": "1345567567",
		"customer": "1607427184715628553",
		"creator_userName": "昵称-李菲菲",
		"contractConversionParams": "1"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	获取财务组织异常	切换租户


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-09-10

新增

请求参数 exchRateOps

新增

请求参数 exchRateOps

新增

请求参数 conExchRateOps

更新

请求参数 exchangeRate


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

